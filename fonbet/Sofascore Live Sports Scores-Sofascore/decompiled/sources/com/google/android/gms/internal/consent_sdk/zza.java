package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import defpackage.jfn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class zza {
    public static jfn a;

    public static zza a(Context context) {
        jfn jfnVar;
        synchronized (zza.class) {
            try {
                jfnVar = a;
                if (jfnVar == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    jfnVar = new jfn(application);
                    a = jfnVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jfnVar;
    }

    public abstract zzj b();

    public abstract zzbq c();

    public abstract zzcr d();
}
