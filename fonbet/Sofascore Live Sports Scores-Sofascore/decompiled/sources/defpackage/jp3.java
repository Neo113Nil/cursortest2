package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jp3 extends h5a implements mma, fa5 {
    public final zj0 i;
    public final op3 j;

    public jp3(zj0 zj0Var, op3 op3Var) {
        this.i = zj0Var;
        this.j = op3Var;
    }

    public final long X(long j) {
        if (njh.g(j)) {
            return 0L;
        }
        long i = this.i.i();
        if (i == 9205357640488583168L) {
            return j;
        }
        float f = njh.f(i);
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            f = njh.f(j);
        }
        float d = njh.d(i);
        if (Float.isInfinite(d) || Float.isNaN(d)) {
            d = njh.d(j);
        }
        long f2 = yaa.f(f, d);
        return b6a.B(f2, this.j.e(f2, j));
    }

    public final long Y(long j) {
        float j2;
        int i;
        float b;
        boolean f = an3.f(j);
        boolean e = an3.e(j);
        if (!f || !e) {
            boolean z = an3.d(j) && an3.c(j);
            long i2 = this.i.i();
            if (i2 != 9205357640488583168L) {
                if (z && (f || e)) {
                    j2 = an3.h(j);
                    i = an3.g(j);
                } else {
                    float f2 = njh.f(i2);
                    float d = njh.d(i2);
                    if (Float.isInfinite(f2) || Float.isNaN(f2)) {
                        j2 = an3.j(j);
                    } else {
                        int i3 = ajk.b;
                        j2 = llf.b(f2, an3.j(j), an3.h(j));
                    }
                    if (!Float.isInfinite(d) && !Float.isNaN(d)) {
                        int i4 = ajk.b;
                        b = llf.b(d, an3.i(j), an3.g(j));
                        long X = X(yaa.f(j2, b));
                        return an3.a(j, cn3.g(wzb.b(njh.f(X)), j), 0, cn3.f(wzb.b(njh.d(X)), j), 0, 10);
                    }
                    i = an3.i(j);
                }
                b = i;
                long X2 = X(yaa.f(j2, b));
                return an3.a(j, cn3.g(wzb.b(njh.f(X2)), j), 0, cn3.f(wzb.b(njh.d(X2)), j), 0, 10);
            }
            if (z) {
                return an3.a(j, an3.h(j), 0, an3.g(j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.mma
    public final int b(tkb tkbVar, g1c g1cVar, int i) {
        if (this.i.i() == 9205357640488583168L) {
            return g1cVar.G(i);
        }
        int G = g1cVar.G(an3.g(Y(cn3.b(0, 0, 0, i, 7))));
        return Math.max(wzb.b(njh.f(X(yaa.f(G, i)))), G);
    }

    @Override // defpackage.mma
    public final int e(tkb tkbVar, g1c g1cVar, int i) {
        if (this.i.i() == 9205357640488583168L) {
            return g1cVar.b(i);
        }
        int b = g1cVar.b(an3.h(Y(cn3.b(0, i, 0, 0, 13))));
        return Math.max(wzb.b(njh.d(X(yaa.f(i, b)))), b);
    }

    public final boolean equals(Object obj) {
        Object valueOf = Float.valueOf(1.0f);
        if (this == obj) {
            return true;
        }
        if (obj instanceof jp3) {
            jp3 jp3Var = (jp3) obj;
            if (this.i != jp3Var.i) {
                return false;
            }
            mv1 mv1Var = uxf.g;
            if (mv1Var.equals(mv1Var) && this.j.equals(jp3Var.j) && valueOf.equals(valueOf)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mma
    public final int h(tkb tkbVar, g1c g1cVar, int i) {
        if (this.i.i() == 9205357640488583168L) {
            return g1cVar.B(i);
        }
        int B = g1cVar.B(an3.g(Y(cn3.b(0, 0, 0, i, 7))));
        return Math.max(wzb.b(njh.f(X(yaa.f(B, i)))), B);
    }

    public final int hashCode() {
        return fc6.a(1.0f, (this.j.hashCode() + ((Float.hashCode(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Float.hashCode(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 31) + (this.i.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override // defpackage.mma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        qhe J = g1cVar.J(Y(j));
        return m1c.G0(m1cVar, J.a, J.b, new jy(J, 4));
    }

    @Override // defpackage.mma
    public final int m(tkb tkbVar, g1c g1cVar, int i) {
        if (this.i.i() == 9205357640488583168L) {
            return g1cVar.s(i);
        }
        int s = g1cVar.s(an3.h(Y(cn3.b(0, i, 0, 0, 13))));
        return Math.max(wzb.b(njh.d(X(yaa.f(i, s)))), s);
    }

    @Override // defpackage.fa5
    public final void o(yma ymaVar) {
        wj2 wj2Var = ymaVar.a;
        long X = X(wj2Var.n());
        int i = ajk.b;
        long f = d7a.f(wzb.b(njh.f(X)), wzb.b(njh.d(X)));
        long n = wj2Var.n();
        long f2 = d7a.f(wzb.b(njh.f(n)), wzb.b(njh.d(n)));
        float f3 = (((int) (f2 >> 32)) - ((int) (f >> 32))) / 2.0f;
        float f4 = (((int) (f2 & 4294967295L)) - ((int) (f & 4294967295L))) / 2.0f;
        float f5 = ymaVar.getLayoutDirection() == ema.a ? 0.0f : (-1.0f) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        long round = (Math.round((1.0f + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * f4) & 4294967295L) | (Math.round((f5 + 1.0f) * f3) << 32);
        float f6 = (int) (round >> 32);
        float f7 = (int) (round & 4294967295L);
        ((hpo) wj2Var.b.a).I(f6, f7);
        this.i.g(ymaVar, X, 1.0f, null);
        ((hpo) wj2Var.b.a).I(-f6, -f7);
        ymaVar.a();
    }

    public final String toString() {
        return "ContentPainterModifier(painter=" + this.i + ", alignment=" + uxf.g + ", contentScale=" + this.j + ", alpha=1.0, colorFilter=null)";
    }
}
