package com.google.android.gms.internal.wearable;

import defpackage.e3c;
import defpackage.n9o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcn extends zzbz {
    public static final boolean b = n9o.d;
    public e3c a;

    private zzcn() {
        throw null;
    }

    public static int r(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int s(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public abstract void a(int i, int i2);

    public abstract void b(int i, int i2);

    public abstract void c(int i, int i2);

    public abstract void d(int i, int i2);

    public abstract void e(int i, long j);

    public abstract void f(int i, long j);

    public abstract void g(int i, boolean z);

    public abstract void h(int i, String str);

    public abstract void i(int i, zzcg zzcgVar);

    public abstract void j(int i, zzel zzelVar);

    public abstract void k(int i, zzcg zzcgVar);

    public abstract void l(byte b2);

    public abstract void m(int i);

    public abstract void n(int i);

    public abstract void o(int i);

    public abstract void p(long j);

    public abstract void q(long j);
}
