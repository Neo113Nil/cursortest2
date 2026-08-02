package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kp3 extends wtc implements ga5, oma, p3h {
    public io o;
    public op3 p;
    public float q;
    public boolean r = true;
    public String s;
    public fn3 t;
    public final yj0 u;

    public kp3(yj0 yj0Var, io ioVar, op3 op3Var, float f, String str, fn3 fn3Var) {
        this.o = ioVar;
        this.p = op3Var;
        this.q = f;
        this.s = str;
        this.t = fn3Var;
        this.u = yj0Var;
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.oma
    public final int b(tkb tkbVar, g1c g1cVar, int i) {
        long b = cn3.b(0, 0, 0, i, 7);
        fn3 fn3Var = this.t;
        if (fn3Var != null) {
            fn3Var.g(b);
        }
        if (this.u.i() == 9205357640488583168L) {
            return g1cVar.G(i);
        }
        long l1 = l1(b);
        return Math.max(an3.j(l1), g1cVar.G(i));
    }

    @Override // defpackage.wtc
    public final void c1() {
        ku3 Y0 = Y0();
        yj0 yj0Var = this.u;
        yj0Var.l = Y0;
        yj0Var.a();
    }

    @Override // defpackage.wtc
    public final void d1() {
        this.u.d();
    }

    @Override // defpackage.oma
    public final int e(tkb tkbVar, g1c g1cVar, int i) {
        long b = cn3.b(0, i, 0, 0, 13);
        fn3 fn3Var = this.t;
        if (fn3Var != null) {
            fn3Var.g(b);
        }
        if (this.u.i() == 9205357640488583168L) {
            return g1cVar.b(i);
        }
        long l1 = l1(b);
        return Math.max(an3.i(l1), g1cVar.b(i));
    }

    @Override // defpackage.wtc
    public final void e1() {
        this.u.m(null);
    }

    @Override // defpackage.oma
    public final int h(tkb tkbVar, g1c g1cVar, int i) {
        long b = cn3.b(0, 0, 0, i, 7);
        fn3 fn3Var = this.t;
        if (fn3Var != null) {
            fn3Var.g(b);
        }
        if (this.u.i() == 9205357640488583168L) {
            return g1cVar.B(i);
        }
        long l1 = l1(b);
        return Math.max(an3.j(l1), g1cVar.B(i));
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        String str = this.s;
        if (str != null) {
            y3h.e(b4hVar, str);
            y3h.j(b4hVar, 5);
        }
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        fn3 fn3Var = this.t;
        if (fn3Var != null) {
            fn3Var.g(j);
        }
        qhe J = g1cVar.J(l1(j));
        return m1c.G0(m1cVar, J.a, J.b, new b3(J, 0));
    }

    public final long k1(long j) {
        if (njh.g(j)) {
            return 0L;
        }
        long i = this.u.i();
        if (i != 9205357640488583168L) {
            float intBitsToFloat = Float.intBitsToFloat((int) (i >> 32));
            if (Math.abs(intBitsToFloat) > Float.MAX_VALUE) {
                intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float intBitsToFloat2 = Float.intBitsToFloat((int) (i & 4294967295L));
            if (Math.abs(intBitsToFloat2) > Float.MAX_VALUE) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            long e = this.p.e(floatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (e >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & e))) <= Float.MAX_VALUE) {
                return b6a.B(floatToRawIntBits, e);
            }
        }
        return j;
    }

    public final long l1(long j) {
        float j2;
        int i;
        float b;
        boolean f = an3.f(j);
        boolean e = an3.e(j);
        if (!f || !e) {
            boolean z = an3.d(j) && an3.c(j);
            yj0 yj0Var = this.u;
            long i2 = yj0Var.i();
            if (i2 != 9205357640488583168L) {
                if (z && (f || e)) {
                    j2 = an3.h(j);
                    i = an3.g(j);
                } else {
                    float intBitsToFloat = Float.intBitsToFloat((int) (i2 >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (i2 & 4294967295L));
                    if (Math.abs(intBitsToFloat) <= Float.MAX_VALUE) {
                        int i3 = bjk.b;
                        j2 = llf.b(intBitsToFloat, an3.j(j), an3.h(j));
                    } else {
                        j2 = an3.j(j);
                    }
                    if (Math.abs(intBitsToFloat2) <= Float.MAX_VALUE) {
                        int i4 = bjk.b;
                        b = llf.b(intBitsToFloat2, an3.i(j), an3.g(j));
                        long k1 = k1((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(j2) << 32));
                        return an3.a(j, cn3.g(wzb.b(Float.intBitsToFloat((int) (k1 >> 32))), j), 0, cn3.f(wzb.b(Float.intBitsToFloat((int) (k1 & 4294967295L))), j), 0, 10);
                    }
                    i = an3.i(j);
                }
                b = i;
                long k12 = k1((Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(j2) << 32));
                return an3.a(j, cn3.g(wzb.b(Float.intBitsToFloat((int) (k12 >> 32))), j), 0, cn3.f(wzb.b(Float.intBitsToFloat((int) (k12 & 4294967295L))), j), 0, 10);
            }
            if (z && ((rj0) yj0Var.u.a.getValue()).a() != null) {
                return an3.a(j, an3.h(j), 0, an3.g(j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.oma
    public final int m(tkb tkbVar, g1c g1cVar, int i) {
        long b = cn3.b(0, i, 0, 0, 13);
        fn3 fn3Var = this.t;
        if (fn3Var != null) {
            fn3Var.g(b);
        }
        if (this.u.i() == 9205357640488583168L) {
            return g1cVar.s(i);
        }
        long l1 = l1(b);
        return Math.max(an3.i(l1), g1cVar.s(i));
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        wj2 wj2Var = ymaVar.a;
        long k1 = k1(wj2Var.n());
        long a = this.o.a(bjk.d(k1), bjk.d(wj2Var.n()), ymaVar.getLayoutDirection());
        int i = (int) (a >> 32);
        int i2 = (int) (a & 4294967295L);
        sx2 sx2Var = wj2Var.b;
        long D = sx2Var.D();
        sx2Var.t().o();
        try {
            hpo hpoVar = (hpo) sx2Var.a;
            if (this.r) {
                hpo.r(hpoVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 31);
            }
            hpoVar.I(i, i2);
            this.u.g(ymaVar, k1, this.q, null);
            sx2Var.t().h();
            sx2Var.N(D);
            ymaVar.a();
        } catch (Throwable th) {
            mz1.v(sx2Var, D);
            throw th;
        }
    }
}
