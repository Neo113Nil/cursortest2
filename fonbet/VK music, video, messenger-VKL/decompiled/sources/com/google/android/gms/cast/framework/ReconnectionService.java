package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.zzay;
import xsna.exc0;
import xsna.g001;
import xsna.gzz0;
import xsna.hui0;
import xsna.kyz0;
import xsna.o100;
import xsna.tuz0;
import xsna.uz9;
import xsna.vnv;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public class ReconnectionService extends Service {
    public static final o100 c = new o100("ReconnectionService", null);

    @Nullable
    public gzz0 b;

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@NonNull Intent intent) {
        gzz0 gzz0Var = this.b;
        if (gzz0Var != null) {
            try {
                return gzz0Var.z0(intent);
            } catch (RemoteException unused) {
                c.b("Unable to call %s on %s.", "onBind", gzz0.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        vnv vnvVar;
        uz9 e = uz9.e(this);
        hui0 d = e.d();
        d.getClass();
        vnv vnvVar2 = null;
        try {
            vnvVar = d.a.zzk();
        } catch (RemoteException unused) {
            hui0.c.b("Unable to call %s on %s.", "getWrappedThis", g001.class.getSimpleName());
            vnvVar = null;
        }
        exc0.e("Must be called from the main thread.");
        tuz0 tuz0Var = e.d;
        tuz0Var.getClass();
        try {
            vnvVar2 = tuz0Var.a.zze();
        } catch (RemoteException unused2) {
            tuz0.b.b("Unable to call %s on %s.", "getWrappedThis", kyz0.class.getSimpleName());
        }
        gzz0 zzd = zzay.zzd(this, vnvVar, vnvVar2);
        this.b = zzd;
        if (zzd != null) {
            try {
                zzd.q0();
            } catch (RemoteException unused3) {
                c.b("Unable to call %s on %s.", "onCreate", gzz0.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        gzz0 gzz0Var = this.b;
        if (gzz0Var != null) {
            try {
                gzz0Var.zzh();
            } catch (RemoteException unused) {
                c.b("Unable to call %s on %s.", "onDestroy", gzz0.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(@NonNull Intent intent, int i, int i2) {
        gzz0 gzz0Var = this.b;
        if (gzz0Var != null) {
            try {
                return gzz0Var.r1(i, i2, intent);
            } catch (RemoteException unused) {
                c.b("Unable to call %s on %s.", "onStartCommand", gzz0.class.getSimpleName());
            }
        }
        return 2;
    }
}
