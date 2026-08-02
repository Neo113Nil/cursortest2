package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes6.dex */
public class AppRestartDuringAdDetectionService extends Service {
    private static volatile boolean a;

    public static boolean a() {
        return a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        a = false;
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        a = true;
        stopSelf();
    }
}
