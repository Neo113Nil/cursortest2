package com.vk.silentauth.host;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import xsna.tmj0;

/* compiled from: SilentAuthService.kt */
/* loaded from: classes11.dex */
public final class SilentAuthService extends Service {
    public static final Handler b = new Handler(Looper.getMainLooper());
    public static boolean c = true;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new tmj0(getApplication(), getPackageManager());
    }
}
