package com.example.kalselevent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button klikLogin;
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        klikLogin = findViewById(R.id.login);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        klikLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String sEmail = email.getText().toString();
                String sPassword = password.getText().toString();
                if (TextUtils.isEmpty(sEmail)&&TextUtils.isEmpty(sPassword)){
                    Toast.makeText(MainActivity.this, "Ups...Email dan Password belum diisi",Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(getBaseContext(),LIstActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}