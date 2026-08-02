package com.google.android.gms.internal.cast;

import defpackage.f5n;
import defpackage.g5n;
import defpackage.i5n;
import defpackage.mxn;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzxp extends zzxd {
    public static final Logger b = Logger.getLogger(zzxp.class.getName());
    public static final boolean c = f5n.e;
    public mxn a;

    private zzxp() {
        throw null;
    }

    public static int s(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int t(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int u(String str) {
        int length;
        try {
            length = i5n.a(str);
        } catch (g5n unused) {
            length = str.getBytes(zzym.a).length;
        }
        return s(length) + length;
    }

    public abstract void b(int i, int i2);

    public abstract void c(int i, int i2);

    public abstract void d(int i, int i2);

    public abstract void e(int i, int i2);

    public abstract void f(int i, long j);

    public abstract void g(int i, long j);

    public abstract void h(int i, boolean z);

    public abstract void i(int i, String str);

    public abstract void j(int i, zzxk zzxkVar);

    public abstract void k(int i, zzzi zzziVar);

    public abstract void l(int i, zzxk zzxkVar);

    public abstract void m(byte b2);

    public abstract void n(int i);

    public abstract void o(int i);

    public abstract void p(int i);

    public abstract void q(long j);

    public abstract void r(long j);
}
