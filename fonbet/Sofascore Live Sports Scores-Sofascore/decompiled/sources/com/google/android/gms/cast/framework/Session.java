package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.kmn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class Session {
    public static final Logger b = new Logger("Session", null);
    public final zzau a;

    public Session(Context context, String str, String str2) {
        zzau zzauVar;
        try {
            zzauVar = com.google.android.gms.internal.cast.zzay.a(context).S0(str, str2, new kmn(this));
        } catch (RemoteException | ModuleUnavailableException unused) {
            com.google.android.gms.internal.cast.zzay.a.b("Unable to call %s on %s.", "newSessionImpl", "zzbc");
            zzauVar = null;
        }
        this.a = zzauVar;
    }

    public abstract void a(boolean z);

    public long b() {
        Preconditions.e("Must be called from the main thread.");
        return 0L;
    }

    public final boolean c() {
        Preconditions.e("Must be called from the main thread.");
        zzau zzauVar = this.a;
        if (zzauVar != null) {
            try {
                return zzauVar.zzi();
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", "isConnected", "zzau");
            }
        }
        return false;
    }

    public abstract void f(Bundle bundle);

    public abstract void g(Bundle bundle);

    public final int i() {
        Preconditions.e("Must be called from the main thread.");
        zzau zzauVar = this.a;
        if (zzauVar != null) {
            try {
                if (zzauVar.zze() >= 211100000) {
                    return zzauVar.zzo();
                }
            } catch (RemoteException unused) {
                b.b("Unable to call %s on %s.", "getSessionStartType", "zzau");
            }
        }
        return 0;
    }

    public void d(Bundle bundle) {
    }

    public void e(Bundle bundle) {
    }

    public void h(Bundle bundle) {
    }
}
