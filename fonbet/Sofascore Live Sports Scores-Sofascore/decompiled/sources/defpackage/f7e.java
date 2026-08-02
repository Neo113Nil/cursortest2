package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f7e extends wtc implements oma, ga5 {
    public d7e o;
    public boolean p;
    public io q;
    public op3 r;
    public float s;
    public ay1 t;

    public static boolean l1(long j) {
        return !njh.c(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean m1(long j) {
        return !njh.c(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.oma
    public final int b(tkb tkbVar, g1c g1cVar, int i) {
        if (!k1()) {
            return g1cVar.G(i);
        }
        long n1 = n1(cn3.b(0, 0, 0, i, 7));
        return Math.max(an3.j(n1), g1cVar.G(i));
    }

    @Override // defpackage.oma
    public final int e(tkb tkbVar, g1c g1cVar, int i) {
        if (!k1()) {
            return g1cVar.b(i);
        }
        long n1 = n1(cn3.b(0, i, 0, 0, 13));
        return Math.max(an3.i(n1), g1cVar.b(i));
    }

    @Override // defpackage.oma
    public final int h(tkb tkbVar, g1c g1cVar, int i) {
        if (!k1()) {
            return g1cVar.B(i);
        }
        long n1 = n1(cn3.b(0, 0, 0, i, 7));
        return Math.max(an3.j(n1), g1cVar.B(i));
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        qhe J = g1cVar.J(n1(j));
        return m1c.G0(m1cVar, J.a, J.b, new jy(J, 8));
    }

    public final boolean k1() {
        return this.p && this.o.i() != 9205357640488583168L;
    }

    @Override // defpackage.oma
    public final int m(tkb tkbVar, g1c g1cVar, int i) {
        if (!k1()) {
            return g1cVar.s(i);
        }
        long n1 = n1(cn3.b(0, i, 0, 0, 13));
        return Math.max(an3.i(n1), g1cVar.s(i));
    }

    public final long n1(long j) {
        boolean z = false;
        boolean z2 = an3.d(j) && an3.c(j);
        if (an3.f(j) && an3.e(j)) {
            z = true;
        }
        if ((!k1() && z2) || z) {
            return an3.a(j, an3.h(j), 0, an3.g(j), 0, 10);
        }
        long i = this.o.i();
        int round = m1(i) ? Math.round(Float.intBitsToFloat((int) (i >> 32))) : an3.j(j);
        int round2 = l1(i) ? Math.round(Float.intBitsToFloat((int) (i & 4294967295L))) : an3.i(j);
        int g = cn3.g(round, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(cn3.f(round2, j)) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
        if (k1()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!m1(this.o.i()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.o.i() >> 32))) << 32) | (Float.floatToRawIntBits(!l1(this.o.i()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.o.i() & 4294967295L))) & 4294967295L);
            floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0L : b6a.B(floatToRawIntBits2, this.r.e(floatToRawIntBits2, floatToRawIntBits));
        }
        return an3.a(j, cn3.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, cn3.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        wj2 wj2Var = ymaVar.a;
        long i = this.o.i();
        long floatToRawIntBits = (Float.floatToRawIntBits(m1(i) ? Float.intBitsToFloat((int) (i >> 32)) : Float.intBitsToFloat((int) (wj2Var.n() >> 32))) << 32) | (Float.floatToRawIntBits(l1(i) ? Float.intBitsToFloat((int) (i & 4294967295L)) : Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L))) & 4294967295L);
        long B = (Float.intBitsToFloat((int) (wj2Var.n() >> 32)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0L : b6a.B(floatToRawIntBits, this.r.e(floatToRawIntBits, wj2Var.n()));
        long a = this.q.a((Math.round(Float.intBitsToFloat((int) (B >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (B & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (wj2Var.n() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L))) & 4294967295L), ymaVar.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((hpo) wj2Var.b.a).I(f, f2);
        try {
            this.o.g(ymaVar, B, this.s, this.t);
            ((hpo) wj2Var.b.a).I(-f, -f2);
            ymaVar.a();
        } catch (Throwable th) {
            ((hpo) wj2Var.b.a).I(-f, -f2);
            throw th;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.o + ", sizeToIntrinsics=" + this.p + ", alignment=" + this.q + ", alpha=" + this.s + ", colorFilter=" + this.t + ')';
    }
}
