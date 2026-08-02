package com.vk.instantjobs.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import xsna.wyx;

/* compiled from: JobsBackgroundService.kt */
/* loaded from: classes.dex */
public final class JobsBackgroundService extends Service {
    public static final /* synthetic */ int b = 0;

    @Override // android.app.Service
    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        wyx.a.a(true);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        wyx.a.a(false);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
