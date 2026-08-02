package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.b1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzier extends zzidz {
    public b1l a;

    private zzier() {
        throw null;
    }

    public static int b(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int c(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void d() {
        if (z() > 0) {
            a70.r("Did not write as much data as expected.");
        } else {
            if (z() >= 0) {
                return;
            }
            a70.r("Wrote more data than expected.");
        }
    }

    public abstract void e(int i, int i2);

    public abstract void f(int i, int i2);

    public abstract void g(int i, int i2);

    public abstract void h(int i, int i2);

    public abstract void i(int i, long j);

    public abstract void j(int i, long j);

    public abstract void k(int i, boolean z);

    public abstract void l(int i, String str);

    public abstract void m(int i, zziei zzieiVar);

    public abstract void n(zziei zzieiVar);

    public abstract void o(int i, byte[] bArr);

    public abstract void p(int i, zzigw zzigwVar);

    public abstract void q(int i, zziei zzieiVar);

    public abstract void r(zzigw zzigwVar);

    public abstract void s(byte b);

    public abstract void t(int i);

    public abstract void u(int i);

    public abstract void v(int i);

    public abstract void w(long j);

    public abstract void x(long j);

    public abstract void y(String str);

    public abstract int z();
}
