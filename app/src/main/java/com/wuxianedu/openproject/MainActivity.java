package com.wuxianedu.openproject;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnNotify = null;
    private NotificationManager nm = null;
    private Notification notification = null;
    private Intent intent = null;
    private PendingIntent pi = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      getWindow().setBackgroundDrawable(null);



    }
}
