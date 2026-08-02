package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface ha5 extends kx4 {
    static void D(ha5 ha5Var, b20 b20Var, n52 n52Var, float f, jii jiiVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        ja5 ja5Var = jiiVar;
        if ((i2 & 8) != 0) {
            ja5Var = e28.a;
        }
        ja5 ja5Var2 = ja5Var;
        if ((i2 & 32) != 0) {
            i = 3;
        }
        ha5Var.k0(b20Var, n52Var, f2, ja5Var2, i);
    }

    static long E0(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static void H(ha5 ha5Var, a10 a10Var, long j, long j2, float f, ay1 ay1Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            j = (a10Var.a.getHeight() & 4294967295L) | (a10Var.a.getWidth() << 32);
        }
        long j3 = j;
        ha5Var.d0(a10Var, 0L, j3, (i2 & 16) != 0 ? j3 : j2, (i2 & 32) != 0 ? 1.0f : f, (i2 & 128) != 0 ? null : ay1Var, (i2 & 512) != 0 ? 1 : i);
    }

    static void L(ha5 ha5Var, long j, float f, float f2, long j2, long j3, float f3, ja5 ja5Var, int i) {
        ha5Var.A(j, f, f2, (i & 16) != 0 ? 0L : j2, j3, (i & 64) != 0 ? 1.0f : f3, ja5Var);
    }

    static void U(ha5 ha5Var, long j, float f, long j2, float f2, ja5 ja5Var, int i) {
        if ((i & 2) != 0) {
            f = njh.e(ha5Var.n()) / 2.0f;
        }
        float f3 = f;
        if ((i & 4) != 0) {
            j2 = ha5Var.O0();
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            f2 = 1.0f;
        }
        ha5Var.r(j, f3, j3, f2, (i & 16) != 0 ? e28.a : ja5Var);
    }

    static void W0(ha5 ha5Var, long j, long j2, long j3, float f, int i, c20 c20Var, int i2) {
        ha5Var.q(j, j2, j3, (i2 & 8) != 0 ? 0.0f : f, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : c20Var, 1.0f);
    }

    static void X0(ha5 ha5Var, b20 b20Var, long j, float f, ja5 ja5Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            ja5Var = e28.a;
        }
        ha5Var.l0(b20Var, j, f2, ja5Var);
    }

    static void Y(yma ymaVar, n52 n52Var, long j, long j2, long j3, ja5 ja5Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        ymaVar.c(n52Var, j4, (i & 4) != 0 ? E0(ymaVar.a.n(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? e28.a : ja5Var);
    }

    static void f0(ha5 ha5Var, long j, long j2, long j3, long j4, ja5 ja5Var, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        ha5Var.X(j, j5, (i & 4) != 0 ? E0(ha5Var.n(), j5) : j3, j4, (i & 16) != 0 ? e28.a : ja5Var);
    }

    static void g0(ha5 ha5Var, n52 n52Var, long j, long j2, float f, ja5 ja5Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        ha5Var.T(n52Var, j3, (i2 & 4) != 0 ? E0(ha5Var.n(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? e28.a : ja5Var, (i2 & 64) != 0 ? 3 : i);
    }

    static void j0(ha5 ha5Var, n52 n52Var, long j, long j2, float f, int i, float f2, int i2) {
        ha5Var.A0(n52Var, j, j2, f, (i2 & 16) != 0 ? 0 : i, (i2 & 64) != 0 ? 1.0f : f2);
    }

    static void o0(ha5 ha5Var, long j, long j2, long j3, float f, jii jiiVar, ay1 ay1Var, int i) {
        long j4 = (i & 2) != 0 ? 0L : j2;
        ha5Var.Q0(j, j4, (i & 4) != 0 ? E0(ha5Var.n(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? e28.a : jiiVar, (i & 32) != 0 ? null : ay1Var, (i & 64) != 0 ? 3 : 0);
    }

    static void s0(yma ymaVar, n29 n29Var, Function1 function1) {
        long n = ymaVar.a.n();
        ymaVar.d((((int) Float.intBitsToFloat((int) (n >> 32))) << 32) | (((int) Float.intBitsToFloat((int) (n & 4294967295L))) & 4294967295L), n29Var, function1);
    }

    static void x(ha5 ha5Var, a10 a10Var, long j, ay1 ay1Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 16) != 0) {
            ay1Var = null;
        }
        ha5Var.c0(a10Var, j, ay1Var);
    }

    void A(long j, float f, float f2, long j2, long j3, float f3, ja5 ja5Var);

    void A0(n52 n52Var, long j, long j2, float f, int i, float f2);

    sx2 L0();

    default long O0() {
        return yaa.u(L0().D());
    }

    void Q0(long j, long j2, long j3, float f, ja5 ja5Var, ay1 ay1Var, int i);

    void T(n52 n52Var, long j, long j2, float f, ja5 ja5Var, int i);

    void X(long j, long j2, long j3, long j4, ja5 ja5Var);

    void c0(a10 a10Var, long j, ay1 ay1Var);

    void d0(a10 a10Var, long j, long j2, long j3, float f, ay1 ay1Var, int i);

    ema getLayoutDirection();

    void k0(b20 b20Var, n52 n52Var, float f, ja5 ja5Var, int i);

    void l0(b20 b20Var, long j, float f, ja5 ja5Var);

    default long n() {
        return L0().D();
    }

    void q(long j, long j2, long j3, float f, int i, c20 c20Var, float f2);

    void r(long j, float f, long j2, float f2, ja5 ja5Var);
}
