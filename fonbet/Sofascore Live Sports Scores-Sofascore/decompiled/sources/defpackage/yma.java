package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yma implements ha5 {
    public final wj2 a = new wj2();
    public ga5 b;

    @Override // defpackage.ha5
    public final void A(long j, float f, float f2, long j2, long j3, float f3, ja5 ja5Var) {
        this.a.A(j, f, f2, j2, j3, f3, ja5Var);
    }

    @Override // defpackage.ha5
    public final void A0(n52 n52Var, long j, long j2, float f, int i, float f2) {
        this.a.A0(n52Var, j, j2, f, i, f2);
    }

    @Override // defpackage.kx4
    public final float C(long j) {
        return this.a.C(j);
    }

    @Override // defpackage.kx4
    public final float C0(int i) {
        return this.a.C0(i);
    }

    @Override // defpackage.kx4
    public final float D0(float f) {
        return f / this.a.j();
    }

    @Override // defpackage.kx4
    public final float H0(float f) {
        return this.a.j() * f;
    }

    @Override // defpackage.ha5
    public final sx2 L0() {
        return this.a.b;
    }

    @Override // defpackage.kx4
    public final long N(int i) {
        return this.a.N(i);
    }

    @Override // defpackage.kx4
    public final long O(float f) {
        return this.a.O(f);
    }

    @Override // defpackage.ha5
    public final long O0() {
        return this.a.O0();
    }

    @Override // defpackage.ha5
    public final void Q0(long j, long j2, long j3, float f, ja5 ja5Var, ay1 ay1Var, int i) {
        this.a.Q0(j, j2, j3, f, ja5Var, ay1Var, i);
    }

    @Override // defpackage.kx4
    public final long R0(long j) {
        return this.a.R0(j);
    }

    @Override // defpackage.ha5
    public final void T(n52 n52Var, long j, long j2, float f, ja5 ja5Var, int i) {
        this.a.T(n52Var, j, j2, f, ja5Var, i);
    }

    @Override // defpackage.ha5
    public final void X(long j, long j2, long j3, long j4, ja5 ja5Var) {
        this.a.X(j, j2, j3, j4, ja5Var);
    }

    public final void a() {
        wj2 wj2Var = this.a;
        sx2 sx2Var = wj2Var.b;
        uj2 t = wj2Var.b.t();
        xv4 xv4Var = this.b;
        if (xv4Var == null) {
            throw wt3.j("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        wtc wtcVar = (wtc) xv4Var;
        wtc wtcVar2 = wtcVar.a.f;
        if (wtcVar2 != null && (wtcVar2.d & 4) != 0) {
            while (wtcVar2 != null) {
                int i = wtcVar2.c;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    wtcVar2 = wtcVar2.f;
                }
            }
        }
        wtcVar2 = null;
        if (wtcVar2 == null) {
            wdd a0 = c6o.a0(xv4Var, 4);
            if (a0.e1() == wtcVar.a) {
                a0 = a0.p;
                a0.getClass();
            }
            a0.t1(t, (n29) sx2Var.b);
            return;
        }
        i1d i1dVar = null;
        while (wtcVar2 != null) {
            if (wtcVar2 instanceof ga5) {
                ga5 ga5Var = (ga5) wtcVar2;
                n29 n29Var = (n29) sx2Var.b;
                wdd a02 = c6o.a0(ga5Var, 4);
                long I = d7a.I(a02.c);
                wma wmaVar = a02.o;
                wmaVar.getClass();
                ((xy) zma.a(wmaVar)).getSharedDrawScope().b(t, I, a02, ga5Var, n29Var);
            } else if ((wtcVar2.c & 4) != 0 && (wtcVar2 instanceof bw4)) {
                int i2 = 0;
                for (wtc wtcVar3 = ((bw4) wtcVar2).p; wtcVar3 != null; wtcVar3 = wtcVar3.f) {
                    if ((wtcVar3.c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            wtcVar2 = wtcVar3;
                        } else {
                            if (i1dVar == null) {
                                i1dVar = new i1d(new wtc[16], 0);
                            }
                            if (wtcVar2 != null) {
                                i1dVar.b(wtcVar2);
                                wtcVar2 = null;
                            }
                            i1dVar.b(wtcVar3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            wtcVar2 = c6o.X(i1dVar);
        }
    }

    public final void b(uj2 uj2Var, long j, wdd wddVar, ga5 ga5Var, n29 n29Var) {
        ga5 ga5Var2 = this.b;
        this.b = ga5Var;
        ema emaVar = wddVar.o.z;
        sx2 sx2Var = this.a.b;
        kx4 u = sx2Var.u();
        ema z = sx2Var.z();
        uj2 t = sx2Var.t();
        long D = sx2Var.D();
        n29 n29Var2 = (n29) sx2Var.b;
        sx2Var.L(wddVar);
        sx2Var.M(emaVar);
        sx2Var.K(uj2Var);
        sx2Var.N(j);
        sx2Var.b = n29Var;
        uj2Var.o();
        try {
            ga5Var.o(this);
            uj2Var.h();
            sx2Var.L(u);
            sx2Var.M(z);
            sx2Var.K(t);
            sx2Var.N(D);
            sx2Var.b = n29Var2;
            this.b = ga5Var2;
        } catch (Throwable th) {
            uj2Var.h();
            sx2Var.L(u);
            sx2Var.M(z);
            sx2Var.K(t);
            sx2Var.N(D);
            sx2Var.b = n29Var2;
            throw th;
        }
    }

    public final void c(n52 n52Var, long j, long j2, long j3, float f, ja5 ja5Var) {
        wj2 wj2Var = this.a;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        wj2Var.a.c.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), wj2Var.b(n52Var, ja5Var, f, null, 3, 1));
    }

    @Override // defpackage.ha5
    public final void c0(a10 a10Var, long j, ay1 ay1Var) {
        this.a.c0(a10Var, j, ay1Var);
    }

    public final void d(long j, n29 n29Var, Function1 function1) {
        n29Var.f(this, getLayoutDirection(), j, new x40(7, this, this.b, function1));
    }

    @Override // defpackage.ha5
    public final void d0(a10 a10Var, long j, long j2, long j3, float f, ay1 ay1Var, int i) {
        this.a.d0(a10Var, j, j2, j3, f, ay1Var, i);
    }

    @Override // defpackage.kx4
    public final int e0(float f) {
        return this.a.e0(f);
    }

    @Override // defpackage.kx4
    public final float getFontScale() {
        return this.a.getFontScale();
    }

    @Override // defpackage.ha5
    public final ema getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // defpackage.kx4
    public final float h0(long j) {
        return this.a.h0(j);
    }

    @Override // defpackage.kx4
    public final float j() {
        return this.a.j();
    }

    @Override // defpackage.ha5
    public final void k0(b20 b20Var, n52 n52Var, float f, ja5 ja5Var, int i) {
        this.a.k0(b20Var, n52Var, f, ja5Var, i);
    }

    @Override // defpackage.ha5
    public final void l0(b20 b20Var, long j, float f, ja5 ja5Var) {
        this.a.l0(b20Var, j, f, ja5Var);
    }

    @Override // defpackage.ha5
    public final long n() {
        return this.a.n();
    }

    @Override // defpackage.ha5
    public final void q(long j, long j2, long j3, float f, int i, c20 c20Var, float f2) {
        this.a.q(j, j2, j3, f, i, c20Var, f2);
    }

    @Override // defpackage.ha5
    public final void r(long j, float f, long j2, float f2, ja5 ja5Var) {
        this.a.r(j, f, j2, f2, ja5Var);
    }

    @Override // defpackage.kx4
    public final long u(float f) {
        return this.a.u(f);
    }

    @Override // defpackage.kx4
    public final long v(long j) {
        return this.a.v(j);
    }
}
