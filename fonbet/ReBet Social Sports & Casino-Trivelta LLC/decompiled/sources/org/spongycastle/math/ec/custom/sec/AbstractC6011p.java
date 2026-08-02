package org.spongycastle.math.ec.custom.sec;

import java.math.BigInteger;

/* renamed from: org.spongycastle.math.ec.custom.sec.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6011p {

    /* renamed from: P, reason: collision with root package name */
    static final int[] f62802P = {-4553, -2, -1, -1, -1, -1};
    static final int[] PExt = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
    private static final int[] PExtInv = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.e.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && pj.e.p(iArr3, f62802P))) {
            pj.m.b(6, 4553, iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        if (pj.m.r(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && pj.e.p(iArr2, f62802P))) {
            pj.m.b(6, 4553, iArr2);
        }
    }

    public static int[] c(BigInteger bigInteger) {
        int[] l10 = pj.e.l(bigInteger);
        if (l10[5] == -1) {
            int[] iArr = f62802P;
            if (pj.e.p(l10, iArr)) {
                pj.e.E(iArr, l10);
            }
        }
        return l10;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] g10 = pj.e.g();
        pj.e.v(iArr, iArr2, g10);
        g(g10, iArr3);
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.e.z(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && pj.m.p(12, iArr3, PExt))) {
            int[] iArr4 = PExtInv;
            if (pj.m.e(iArr4.length, iArr4, iArr3) != 0) {
                pj.m.s(12, iArr3, iArr4.length);
            }
        }
    }

    public static void f(int[] iArr, int[] iArr2) {
        if (pj.e.s(iArr)) {
            pj.e.H(iArr2);
        } else {
            pj.e.D(f62802P, iArr, iArr2);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (pj.e.x(4553, pj.e.w(4553, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && pj.e.p(iArr2, f62802P))) {
            pj.m.b(6, 4553, iArr2);
        }
    }

    public static void h(int i10, int[] iArr) {
        if ((i10 == 0 || pj.e.y(4553, i10, iArr, 0) == 0) && !(iArr[5] == -1 && pj.e.p(iArr, f62802P))) {
            return;
        }
        pj.m.b(6, 4553, iArr);
    }

    public static void i(int[] iArr, int[] iArr2) {
        int[] g10 = pj.e.g();
        pj.e.B(iArr, g10);
        g(g10, iArr2);
    }

    public static void j(int[] iArr, int i10, int[] iArr2) {
        int[] g10 = pj.e.g();
        pj.e.B(iArr, g10);
        g(g10, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            pj.e.B(iArr2, g10);
            g(g10, iArr2);
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        if (pj.e.D(iArr, iArr2, iArr3) != 0) {
            pj.m.K(6, 4553, iArr3);
        }
    }

    public static void l(int[] iArr, int[] iArr2) {
        if (pj.m.D(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && pj.e.p(iArr2, f62802P))) {
            pj.m.b(6, 4553, iArr2);
        }
    }
}
