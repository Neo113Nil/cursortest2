package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.pmn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbgb {
    public final Object a = new Object();
    public pmn b = null;
    public boolean c = false;

    public final void a(Context context) {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Can not cast Context to Application");
                        return;
                    }
                    pmn pmnVar = this.b;
                    if (pmnVar == null) {
                        pmnVar = new pmn();
                        this.b = pmnVar;
                    }
                    if (!pmnVar.i) {
                        application.registerActivityLifecycleCallbacks(pmnVar);
                        if (context instanceof Activity) {
                            pmnVar.a((Activity) context);
                        }
                        pmnVar.b = application;
                        pmnVar.j = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.K1)).longValue();
                        pmnVar.i = true;
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(zzbga zzbgaVar) {
        synchronized (this.a) {
            try {
                pmn pmnVar = this.b;
                if (pmnVar == null) {
                    pmnVar = new pmn();
                    this.b = pmnVar;
                }
                synchronized (pmnVar.c) {
                    pmnVar.f.add(zzbgaVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(zzbga zzbgaVar) {
        synchronized (this.a) {
            try {
                pmn pmnVar = this.b;
                if (pmnVar == null) {
                    return;
                }
                synchronized (pmnVar.c) {
                    pmnVar.f.remove(zzbgaVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity d() {
        synchronized (this.a) {
            try {
                pmn pmnVar = this.b;
                if (pmnVar == null) {
                    return null;
                }
                return pmnVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        synchronized (this.a) {
            try {
                pmn pmnVar = this.b;
                if (pmnVar == null) {
                    return false;
                }
                return pmnVar.d.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
