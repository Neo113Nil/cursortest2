package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* renamed from: org.spongycastle.math.ec.custom.sec.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6003l {

    /* renamed from: P, reason: collision with root package name */
    static final int[] f62795P = {-21389, -2, -1, -1, -1};
    static final int[] PExt = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
    private static final int[] PExtInv = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.d.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && pj.d.h(iArr3, f62795P))) {
            pj.m.b(5, 21389, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (pj.m.r(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && pj.d.h(iArr2, f62795P))) {
            pj.m.b(5, 21389, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] f10 = pj.d.f(bigInteger);
        if (f10[4] == -1) {
            int[] iArr = f62795P;
            if (pj.d.h(f10, iArr)) {
                pj.d.s(iArr, f10);
            }
        }
        return f10;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] d10 = pj.d.d();
        pj.d.k(iArr, iArr2, d10);
        g(d10, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.d.o(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && pj.m.p(10, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (pj.m.e(iArr4.length, iArr4, iArr3) != 0) {
                pj.m.s(10, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (pj.d.j(iArr)) {
            pj.d.u(iArr2);
        } else {
            pj.d.r(f62795P, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (pj.d.m(21389, pj.d.l(21389, iArr, 5, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[4] == -1 && pj.d.h(iArr2, f62795P))) {
            pj.m.b(5, 21389, iArr2);
        }
    }

    public static void h(int i10, int[] iArr) {
        if ((i10 == 0 || pj.d.n(21389, i10, iArr, 0) == 0) && !(iArr[4] == -1 && pj.d.h(iArr, f62795P))) {
            return;
        }
        pj.m.b(5, 21389, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] d10 = pj.d.d();
        pj.d.q(iArr, d10);
        g(d10, iArr2);
    }

    public static void j(int[] iArr, int i10, int[] iArr2) {
        int[] d10 = pj.d.d();
        pj.d.q(iArr, d10);
        g(d10, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            pj.d.q(iArr2, d10);
            g(d10, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.d.r(iArr, iArr2, iArr3) != 0) {
            pj.m.K(5, 21389, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (pj.m.D(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && pj.d.h(iArr2, f62795P))) {
            pj.m.b(5, 21389, iArr2);
        }
    }
}
