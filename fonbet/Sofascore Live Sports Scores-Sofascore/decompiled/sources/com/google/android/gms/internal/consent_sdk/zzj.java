package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import defpackage.al3;
import defpackage.bl3;
import defpackage.f79;
import defpackage.fc6;
import defpackage.gvo;
import defpackage.it7;
import defpackage.ji3;
import defpackage.nfk;
import defpackage.ofk;
import defpackage.qpn;
import defpackage.und;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzj {
    public final zzaq a;
    public final ji3 b;
    public final zzbq c;
    public final zzcr f;
    public final Object d = new Object();
    public final Object e = new Object();
    public boolean g = false;

    public zzj(zzaq zzaqVar, ji3 ji3Var, zzbq zzbqVar, zzcr zzcrVar) {
        this.a = zzaqVar;
        this.b = ji3Var;
        this.c = zzbqVar;
        this.f = zzcrVar;
    }

    public final boolean a() {
        boolean z;
        zzaq zzaqVar = this.a;
        if (!zzaqVar.b.getBoolean("is_pub_misconfigured", false)) {
            synchronized (this.d) {
                z = this.g;
            }
            int i = !z ? 0 : zzaqVar.b.getInt("consent_status", 0);
            if (i != 1 && i != 3) {
                return false;
            }
        }
        return true;
    }

    public final void b(final Activity activity, final it7 it7Var, final bl3 bl3Var, final al3 al3Var) {
        synchronized (this.d) {
            this.g = true;
        }
        ((Queue) this.f.f.get()).add(Long.valueOf(System.currentTimeMillis()));
        final ji3 ji3Var = this.b;
        ((Executor) ji3Var.c).execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzv
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                final ji3 ji3Var2 = ji3.this;
                Handler handler = (Handler) ji3Var2.b;
                zzcr zzcrVar = (zzcr) ji3Var2.i;
                Activity activity2 = activity;
                it7 it7Var2 = it7Var;
                final bl3 bl3Var2 = bl3Var;
                final al3 al3Var2 = al3Var;
                try {
                    zzct.a((Application) ji3Var2.a);
                    final und f = ((qpn) ji3Var2.g).f(ji3Var2.m(((gvo) ji3Var2.f).f(activity2, it7Var2)));
                    zzaq zzaqVar = (zzaq) ji3Var2.d;
                    zzaqVar.b.edit().putInt("consent_status", f.b).commit();
                    int i = f.c;
                    SharedPreferences.Editor edit = zzaqVar.b.edit();
                    if (i == 1) {
                        str = "UNKNOWN";
                    } else if (i == 2) {
                        str = "NOT_REQUIRED";
                    } else {
                        if (i != 3) {
                            throw null;
                        }
                        str = "REQUIRED";
                    }
                    edit.putString("privacy_options_requirement_status", str).commit();
                    zzbq zzbqVar = (zzbq) ji3Var2.e;
                    zzbqVar.c.set((zzbs) f.d);
                    zzcrVar.a((Queue) zzcrVar.f.get(), 8, 9, null);
                    ((zze) ji3Var2.h).a.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
                        @Override // java.lang.Runnable
                        public final void run() {
                            final bl3 bl3Var3 = bl3Var2;
                            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bl3.this.g();
                                }
                            };
                            ji3 ji3Var3 = ji3.this;
                            ((Handler) ji3Var3.b).post(runnable);
                            if (f.c != 2) {
                                final zzbq zzbqVar2 = (zzbq) ji3Var3.e;
                                zzbs zzbsVar = (zzbs) zzbqVar2.c.get();
                                if (zzbsVar == null) {
                                    return;
                                }
                                final zzbe e = ((zzay) zzbqVar2.a.zzb()).b(zzbsVar).r().e();
                                e.m = true;
                                zzcz.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        final AtomicReference atomicReference = zzbq.this.d;
                                        e.b(new ofk() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                                            @Override // defpackage.ofk
                                            public final void h(zzbe zzbeVar) {
                                                atomicReference.set(zzbeVar);
                                            }
                                        }, new nfk() { // from class: com.google.android.gms.internal.consent_sdk.zzbi
                                            @Override // defpackage.nfk
                                            public final void f(f79 f79Var) {
                                                "Failed to load and cache a form, error=".concat(String.valueOf(f79Var.b));
                                            }
                                        });
                                    }
                                });
                            }
                        }
                    });
                } catch (zzg e) {
                    zzcrVar.a((Queue) zzcrVar.f.get(), 8, 9, fc6.n("RequestConsentUpdate exception. Error: ", e.getMessage(), ", cause: ", String.valueOf(e.getCause())));
                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.d();
                            al3.this.a();
                        }
                    });
                } catch (RuntimeException e2) {
                    zzcrVar.a((Queue) zzcrVar.f.get(), 8, 9, "RequestConsentUpdate RuntimeException. ".concat(String.valueOf(e2.getMessage())));
                    final zzg zzgVar = new zzg(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e2))));
                    handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzgVar.d();
                            al3.this.a();
                        }
                    });
                }
            }
        });
    }
}
