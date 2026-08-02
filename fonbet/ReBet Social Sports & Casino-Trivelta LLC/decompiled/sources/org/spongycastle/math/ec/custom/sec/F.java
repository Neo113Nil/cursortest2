package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class F {

    /* renamed from: P, reason: collision with root package name */
    static final int[] f62744P = {-977, -2, -1, -1, -1, -1, -1, -1};
    static final int[] PExt = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    private static final int[] PExtInv = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.g.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && pj.g.q(iArr3, f62744P))) {
            pj.m.b(8, 977, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (pj.m.r(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && pj.g.q(iArr2, f62744P))) {
            pj.m.b(8, 977, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] m10 = pj.g.m(bigInteger);
        if (m10[7] == -1) {
            int[] iArr = f62744P;
            if (pj.g.q(m10, iArr)) {
                pj.g.G(iArr, m10);
            }
        }
        return m10;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h10 = pj.g.h();
        pj.g.w(iArr, iArr2, h10);
        g(h10, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.g.A(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && pj.m.p(16, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (pj.m.e(iArr4.length, iArr4, iArr3) != 0) {
                pj.m.s(16, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (pj.g.t(iArr)) {
            pj.g.J(iArr2);
        } else {
            pj.g.F(f62744P, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (pj.g.y(977, pj.g.x(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && pj.g.q(iArr2, f62744P))) {
            pj.m.b(8, 977, iArr2);
        }
    }

    public static void h(int i10, int[] iArr) {
        if ((i10 == 0 || pj.g.z(977, i10, iArr, 0) == 0) && !(iArr[7] == -1 && pj.g.q(iArr, f62744P))) {
            return;
        }
        pj.m.b(8, 977, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] h10 = pj.g.h();
        pj.g.D(iArr, h10);
        g(h10, iArr2);
    }

    public static void j(int[] iArr, int i10, int[] iArr2) {
        int[] h10 = pj.g.h();
        pj.g.D(iArr, h10);
        g(h10, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            pj.g.D(iArr2, h10);
            g(h10, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.g.F(iArr, iArr2, iArr3) != 0) {
            pj.m.K(8, 977, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (pj.m.D(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && pj.g.q(iArr2, f62744P))) {
            pj.m.b(8, 977, iArr2);
        }
    }
}
