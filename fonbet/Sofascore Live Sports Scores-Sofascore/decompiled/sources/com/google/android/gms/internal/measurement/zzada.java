package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.ewm;
import defpackage.men;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzada extends zzacj {
    public static final boolean b = men.d;
    public ewm a;

    private zzada() {
        throw null;
    }

    public static int b(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int c(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int d(zzafc zzafcVar) {
        int e = zzafcVar.e();
        return b(e) + e;
    }

    public abstract int A();

    public final void e() {
        if (A() > 0) {
            a70.r("Did not write as much data as expected.");
        } else {
            if (A() >= 0) {
                return;
            }
            a70.r("Wrote more data than expected.");
        }
    }

    public abstract void f(int i, int i2);

    public abstract void g(int i, int i2);

    public abstract void h(int i, int i2);

    public abstract void i(int i, int i2);

    public abstract void j(int i, long j);

    public abstract void k(int i, long j);

    public abstract void l(int i, boolean z);

    public abstract void m(int i, String str);

    public abstract void n(int i, zzacr zzacrVar);

    public abstract void o(zzacr zzacrVar);

    public abstract void p(int i, byte[] bArr);

    public abstract void q(int i, zzafc zzafcVar);

    public abstract void r(int i, zzacr zzacrVar);

    public abstract void s(zzafc zzafcVar);

    public abstract void t(byte b2);

    public abstract void u(int i);

    public abstract void v(int i);

    public abstract void w(int i);

    public abstract void x(long j);

    public abstract void y(long j);

    public abstract void z(String str);
}
