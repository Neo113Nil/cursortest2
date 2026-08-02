package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import defpackage.ewn;
import defpackage.hsn;
import defpackage.ilo;
import defpackage.slo;
import defpackage.spn;
import defpackage.vdf;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzged {
    public static final Object b = new Object();
    public static zzged c;
    public final zzgeb a;

    public zzged(Context context, hsn hsnVar, zzgei zzgeiVar) {
        context.getClass();
        hsnVar.getClass();
        new zzgkk();
        new zzgkm();
        new zzgko();
        this.a = (zzgeb) ((zzinv) new vdf(hsnVar, context, zzgeiVar).m).zzb();
    }

    public final String a(Context context) {
        String num;
        ilo iloVar;
        zzgeb zzgebVar = this.a;
        zzgfo zzgfoVar = zzgebVar.e;
        zzgrh zzgrhVar = zzgebVar.d;
        long j = zzgebVar.i;
        boolean z = false;
        if (zzgebVar.j && System.currentTimeMillis() - j <= zzgebVar.k) {
            z = true;
        }
        zzgrf a = zzgrhVar.a(3);
        try {
            try {
                try {
                    try {
                        try {
                            a.a();
                            zzggi zzggiVar = zzgebVar.a;
                            synchronized (zzggiVar) {
                                iloVar = zzggiVar.e;
                                if (iloVar == null) {
                                    throw null;
                                }
                            }
                            num = (String) zzhcy.h(iloVar, new spn(14, zzgebVar, context), slo.a).get(z ? zzgebVar.h : zzgebVar.f, TimeUnit.MILLISECONDS);
                        } catch (TimeoutException unused) {
                            if (z) {
                                num = ((zzgkh) zzgebVar.g.zzb()).c(j);
                            } else {
                                zzgrhVar.b(56);
                                num = Integer.toString(17);
                            }
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        a.b(e);
                        num = "";
                    }
                } catch (ExecutionException e2) {
                    e = e2;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    a.b(e);
                    num = Integer.toString(3);
                }
                a.c();
                zzgfoVar.zzb();
                return num;
            } catch (Throwable th) {
                a.b(th);
                throw th;
            }
        } catch (Throwable th2) {
            a.c();
            zzgfoVar.zzb();
            throw th2;
        }
    }

    public final String b(Context context, String str, View view) {
        String num;
        ilo iloVar;
        zzgeb zzgebVar = this.a;
        zzgfo zzgfoVar = zzgebVar.e;
        zzgrh zzgrhVar = zzgebVar.d;
        zzgrf a = zzgrhVar.a(5);
        try {
            try {
                try {
                    try {
                        a.a();
                        zzggi zzggiVar = zzgebVar.a;
                        synchronized (zzggiVar) {
                            iloVar = zzggiVar.e;
                            if (iloVar == null) {
                                throw null;
                            }
                        }
                        num = (String) zzhcy.h(iloVar, new ewn(zzgebVar, context, str, view, 6), slo.a).get(zzgebVar.f, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        a.b(e);
                        num = "";
                    }
                } catch (TimeoutException unused) {
                    zzgrhVar.b(58);
                    num = Integer.toString(17);
                }
            } catch (ExecutionException e2) {
                Throwable th = e2;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                a.b(th);
                num = Integer.toString(3);
            } catch (Throwable th2) {
                a.b(th2);
                throw th2;
            }
            a.c();
            zzgfoVar.zzb();
            return num;
        } catch (Throwable th3) {
            a.c();
            zzgfoVar.zzb();
            throw th3;
        }
    }

    public final void c(MotionEvent motionEvent) {
        zzghf zzghfVar = this.a.b;
        zzggu zzgguVar = (zzggu) zzghfVar.f.get();
        if (zzgguVar == null) {
            zzghfVar.e.b(54);
        } else {
            zzgguVar.d(motionEvent);
        }
    }
}
