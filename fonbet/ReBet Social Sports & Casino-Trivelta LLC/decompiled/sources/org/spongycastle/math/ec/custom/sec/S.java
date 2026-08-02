package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class S {

    /* renamed from: P, reason: collision with root package name */
    static final int[] f62765P = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        int a10 = pj.m.a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (a10 > 511 || (a10 == 511 && pj.m.m(16, iArr3, f62765P))) {
            a10 = (a10 + pj.m.q(16, iArr3)) & 511;
        }
        iArr3[16] = a10;
    }

    public static void b(int[] iArr, int[] iArr2) {
        int r10 = pj.m.r(16, iArr, iArr2) + iArr[16];
        if (r10 > 511 || (r10 == 511 && pj.m.m(16, iArr2, f62765P))) {
            r10 = (r10 + pj.m.q(16, iArr2)) & 511;
        }
        iArr2[16] = r10;
    }

    public static int[] c(BigInteger bigInteger) {
        int[] n10 = pj.m.n(521, bigInteger);
        if (pj.m.m(17, n10, f62765P)) {
            pj.m.P(17, n10);
        }
        return n10;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        pj.k.a(iArr, iArr2, iArr3);
        int i10 = iArr[16];
        int i11 = iArr2[16];
        iArr3[32] = pj.m.w(16, i10, iArr2, i11, iArr, iArr3, 16) + (i10 * i11);
    }

    public static void e(int[] iArr, int[] iArr2) {
        pj.k.b(iArr, iArr2);
        int i10 = iArr[16];
        iArr2[32] = pj.m.x(16, i10 << 1, iArr, 0, iArr2, 16) + (i10 * i10);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] i10 = pj.m.i(33);
        d(iArr, iArr2, i10);
        h(i10, iArr3);
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (pj.m.v(17, iArr)) {
            pj.m.P(17, iArr2);
        } else {
            pj.m.J(17, f62765P, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        int i10 = iArr[32];
        int A10 = (pj.m.A(16, iArr, 16, 9, i10, iArr2, 0) >>> 23) + (i10 >>> 9) + pj.m.e(16, iArr, iArr2);
        if (A10 > 511 || (A10 == 511 && pj.m.m(16, iArr2, f62765P))) {
            A10 = (A10 + pj.m.q(16, iArr2)) & 511;
        }
        iArr2[16] = A10;
    }

    public static void i(int[] iArr) {
        int i10 = iArr[16];
        int g10 = pj.m.g(16, i10 >>> 9, iArr) + (i10 & 511);
        if (g10 > 511 || (g10 == 511 && pj.m.m(16, iArr, f62765P))) {
            g10 = (g10 + pj.m.q(16, iArr)) & 511;
        }
        iArr[16] = g10;
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] i10 = pj.m.i(33);
        e(iArr, i10);
        h(i10, iArr2);
    }

    public static void k(int[] iArr, int i10, int[] iArr2) {
        int[] i11 = pj.m.i(33);
        e(iArr, i11);
        h(i11, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            e(iArr2, i11);
            h(i11, iArr2);
        }
    }

    public static void l(int[] iArr, int[] iArr2, int[] iArr3) {
        int J10 = (pj.m.J(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (J10 < 0) {
            J10 = (J10 + pj.m.k(16, iArr3)) & 511;
        }
        iArr3[16] = J10;
    }

    public static void m(int[] iArr, int[] iArr2) {
        int i10 = iArr[16];
        iArr2[16] = (pj.m.D(16, iArr, i10 << 23, iArr2) | (i10 << 1)) & 511;
    }
}
