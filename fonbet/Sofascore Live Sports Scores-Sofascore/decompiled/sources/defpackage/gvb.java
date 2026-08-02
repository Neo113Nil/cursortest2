package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gvb extends wtc implements oma, ga5, nd8 {
    public final ay4 A;
    public int o;
    public int p;
    public int q;
    public float r;
    public g9i v;
    public n29 w;
    public final e1d x;
    public final znh s = e.c(0);
    public final znh t = e.c(0);
    public final e1d u = e.f(Boolean.FALSE);
    public final e1d y = e.f(new evb());
    public final q50 z = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    public gvb(int i, int i2, int i3, hvb hvbVar, float f) {
        this.o = i;
        this.p = i2;
        this.q = i3;
        this.r = f;
        this.x = e.f(hvbVar);
        this.A = goh.b(new ixa(10, hvbVar, this));
    }

    @Override // defpackage.nd8
    public final void J(ie8 ie8Var) {
        ((eoh) this.u).setValue(Boolean.valueOf(ie8Var.d()));
    }

    @Override // defpackage.oma
    public final int b(tkb tkbVar, g1c g1cVar, int i) {
        return g1cVar.G(i);
    }

    @Override // defpackage.wtc
    public final void c1() {
        n29 n29Var = this.w;
        k29 graphicsContext = ((xy) c6o.d0(this)).getGraphicsContext();
        if (n29Var != null) {
            graphicsContext.a(n29Var);
        }
        this.w = graphicsContext.b();
        l1();
    }

    @Override // defpackage.wtc
    public final void d1() {
        g9i g9iVar = this.v;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.v = null;
        n29 n29Var = this.w;
        if (n29Var != null) {
            ((xy) c6o.d0(this)).getGraphicsContext().a(n29Var);
            this.w = null;
        }
    }

    @Override // defpackage.oma
    public final int e(tkb tkbVar, g1c g1cVar, int i) {
        return g1cVar.b(Integer.MAX_VALUE);
    }

    @Override // defpackage.oma
    public final int h(tkb tkbVar, g1c g1cVar, int i) {
        return 0;
    }

    @Override // defpackage.oma
    public final l1c k(m1c m1cVar, g1c g1cVar, long j) {
        qhe J = g1cVar.J(an3.a(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        int g = cn3.g(J.a, j);
        znh znhVar = this.t;
        znhVar.i(g);
        this.s.i(J.a);
        return m1c.G0(m1cVar, znhVar.h(), J.b, new b3(J, 11));
    }

    public final int k1() {
        return ((Number) this.A.getValue()).intValue();
    }

    public final void l1() {
        g9i g9iVar = this.v;
        rq3 rq3Var = null;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        if (this.n) {
            this.v = xw3.L(Y0(), null, null, new gjb(g9iVar, this, rq3Var, 6), 3);
        }
    }

    @Override // defpackage.oma
    public final int m(tkb tkbVar, g1c g1cVar, int i) {
        return g1cVar.s(Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    @Override // defpackage.ga5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(yma ymaVar) {
        float h;
        float floatValue;
        int h2;
        n29 n29Var;
        long j;
        sx2 sx2Var;
        n29 n29Var2;
        wj2 wj2Var = ymaVar.a;
        int a = p75.a(this.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        znh znhVar = this.t;
        q50 q50Var = this.z;
        znh znhVar2 = this.s;
        if (a > 0) {
            int ordinal = ymaVar.getLayoutDirection().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    zzl.b();
                    return;
                }
                floatValue = (-((Number) q50Var.d()).floatValue()) + (znhVar2.h() * 2) + k1();
                h2 = znhVar.h();
                h = floatValue - h2;
                boolean z = h >= ((float) znhVar2.h());
                boolean z2 = ((float) znhVar.h()) + h > ((float) (k1() + znhVar2.h()));
                float k1 = k1() + znhVar2.h();
                float intBitsToFloat = Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L));
                n29Var = this.w;
                if (n29Var == null) {
                    j = 4294967295L;
                    ymaVar.d((wzb.b(intBitsToFloat) & 4294967295L) | (znhVar2.h() << 32), n29Var, new da5(ymaVar, 2));
                } else {
                    j = 4294967295L;
                }
                float h3 = znhVar.h();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (wj2Var.n() & j));
                sx2Var = wj2Var.b;
                long D = sx2Var.D();
                sx2Var.t().o();
                try {
                    ((hpo) sx2Var.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, h3, intBitsToFloat2, 1);
                    float f = -h;
                    ((hpo) wj2Var.b.a).I(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    try {
                        n29Var2 = this.w;
                        if (n29Var2 == null) {
                            if (z) {
                                ww9.x(ymaVar, n29Var2);
                            }
                            if (z2) {
                                ((hpo) wj2Var.b.a).I(k1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                try {
                                    ww9.x(ymaVar, n29Var2);
                                    ((hpo) wj2Var.b.a).I(-k1, -0.0f);
                                } finally {
                                }
                            }
                            ((hpo) wj2Var.b.a).I(-f, -0.0f);
                            return;
                        }
                        if (z) {
                            ymaVar.a();
                        }
                        if (z2) {
                            ((hpo) wj2Var.b.a).I(k1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            try {
                                ymaVar.a();
                                ((hpo) wj2Var.b.a).I(-k1, -0.0f);
                            } finally {
                            }
                        }
                        ((hpo) wj2Var.b.a).I(-f, -0.0f);
                        return;
                    } catch (Throwable th) {
                        ((hpo) wj2Var.b.a).I(-f, -0.0f);
                        throw th;
                    }
                } finally {
                    mz1.v(sx2Var, D);
                }
            }
            h = ((Number) q50Var.d()).floatValue();
            if (h >= ((float) znhVar2.h())) {
            }
            if (((float) znhVar.h()) + h > ((float) (k1() + znhVar2.h()))) {
            }
            float k12 = k1() + znhVar2.h();
            float intBitsToFloat3 = Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L));
            n29Var = this.w;
            if (n29Var == null) {
            }
            float h32 = znhVar.h();
            float intBitsToFloat22 = Float.intBitsToFloat((int) (wj2Var.n() & j));
            sx2Var = wj2Var.b;
            long D2 = sx2Var.D();
            sx2Var.t().o();
            ((hpo) sx2Var.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, h32, intBitsToFloat22, 1);
            float f2 = -h;
            ((hpo) wj2Var.b.a).I(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            n29Var2 = this.w;
            if (n29Var2 == null) {
            }
        } else {
            int ordinal2 = ymaVar.getLayoutDirection().ordinal();
            if (ordinal2 == 0) {
                h = (-((Number) q50Var.d()).floatValue()) + znhVar2.h() + k1();
                if (h >= ((float) znhVar2.h())) {
                }
                if (((float) znhVar.h()) + h > ((float) (k1() + znhVar2.h()))) {
                }
                float k122 = k1() + znhVar2.h();
                float intBitsToFloat32 = Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L));
                n29Var = this.w;
                if (n29Var == null) {
                }
                float h322 = znhVar.h();
                float intBitsToFloat222 = Float.intBitsToFloat((int) (wj2Var.n() & j));
                sx2Var = wj2Var.b;
                long D22 = sx2Var.D();
                sx2Var.t().o();
                ((hpo) sx2Var.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, h322, intBitsToFloat222, 1);
                float f22 = -h;
                ((hpo) wj2Var.b.a).I(f22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                n29Var2 = this.w;
                if (n29Var2 == null) {
                }
            } else {
                if (ordinal2 != 1) {
                    zzl.b();
                    return;
                }
                floatValue = ((Number) q50Var.d()).floatValue() + znhVar2.h();
                h2 = znhVar.h();
                h = floatValue - h2;
                if (h >= ((float) znhVar2.h())) {
                }
                if (((float) znhVar.h()) + h > ((float) (k1() + znhVar2.h()))) {
                }
                float k1222 = k1() + znhVar2.h();
                float intBitsToFloat322 = Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L));
                n29Var = this.w;
                if (n29Var == null) {
                }
                float h3222 = znhVar.h();
                float intBitsToFloat2222 = Float.intBitsToFloat((int) (wj2Var.n() & j));
                sx2Var = wj2Var.b;
                long D222 = sx2Var.D();
                sx2Var.t().o();
                ((hpo) sx2Var.a).q(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, h3222, intBitsToFloat2222, 1);
                float f222 = -h;
                ((hpo) wj2Var.b.a).I(f222, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                n29Var2 = this.w;
                if (n29Var2 == null) {
                }
            }
        }
    }
}
