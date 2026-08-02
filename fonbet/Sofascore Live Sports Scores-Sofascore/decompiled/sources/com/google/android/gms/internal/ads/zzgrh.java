package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.mxn;
import defpackage.slo;
import defpackage.vlo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgrh {
    public final zzggk a;

    public zzgrh(zzgdq zzgdqVar, zzggk zzggkVar) {
        this.a = zzggkVar;
    }

    public final zzgrf a(int i) {
        return new zzgrf(i, this.a);
    }

    public final void b(int i) {
        this.a.c(i - 1, -1L, null, null);
    }

    public final void c(int i, String str) {
        this.a.c(i - 1, -1L, str, null);
    }

    public final void d(int i, Throwable th) {
        this.a.c(i - 1, -1L, null, th);
    }

    public final void e(int i, ddb ddbVar) {
        zzgrf a = a(i);
        a.a();
        ddbVar.addListener(new vlo(0, ddbVar, new mxn(this, a)), slo.a);
    }

    public final void f(int i, Runnable runnable) {
        try {
            a(i).a();
            runnable.run();
        } finally {
        }
    }
}
