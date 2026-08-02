package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ReconnectionService extends Service {
    public static final Logger b = new Logger("ReconnectionService", null);
    public zzar a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        zzar zzarVar = this.a;
        if (zzarVar != null) {
            try {
                return zzarVar.y0(intent);
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", "onBind", "zzar");
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        IObjectWrapper iObjectWrapper;
        IObjectWrapper iObjectWrapper2;
        CastContext c = CastContext.c(this);
        SessionManager b2 = c.b();
        b2.getClass();
        zzar zzarVar = null;
        try {
            iObjectWrapper = b2.a.zzk();
        } catch (RemoteException unused) {
            SessionManager.c.b("Unable to call %s on %s.", "getWrappedThis", "zzaw");
            iObjectWrapper = null;
        }
        Preconditions.e("Must be called from the main thread.");
        zzaa zzaaVar = c.d;
        zzaaVar.getClass();
        try {
            iObjectWrapper2 = zzaaVar.a.zze();
        } catch (RemoteException unused2) {
            zzaa.b.b("Unable to call %s on %s.", "getWrappedThis", "zzao");
            iObjectWrapper2 = null;
        }
        Logger logger = com.google.android.gms.internal.cast.zzay.a;
        if (iObjectWrapper != null && iObjectWrapper2 != null) {
            try {
                zzarVar = com.google.android.gms.internal.cast.zzay.a(getApplicationContext()).Q2(new ObjectWrapper(this), iObjectWrapper, iObjectWrapper2);
            } catch (RemoteException | ModuleUnavailableException unused3) {
                com.google.android.gms.internal.cast.zzay.a.b("Unable to call %s on %s.", "newReconnectionServiceImpl", "zzbc");
            }
        }
        this.a = zzarVar;
        if (zzarVar != null) {
            try {
                zzarVar.l4();
            } catch (RemoteException unused4) {
                b.b("Unable to call %s on %s.", "onCreate", "zzar");
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zzar zzarVar = this.a;
        if (zzarVar != null) {
            try {
                zzarVar.zzh();
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", "onDestroy", "zzar");
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        zzar zzarVar = this.a;
        if (zzarVar != null) {
            try {
                return zzarVar.c2(i, i2, intent);
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", "onStartCommand", "zzar");
            }
        }
        return 2;
    }
}
