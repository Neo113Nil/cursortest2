package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r9j extends bw4 implements oma, ga5, ug3, a09, p3h {
    public eje A;
    public w84 B;
    public g9i C;
    public pej D;
    public oqf E = new oqf(-1.0f, -1.0f, -1.0f, -1.0f);
    public int F;
    public int G;
    public final cbj H;
    public final u8j I;
    public boolean q;
    public boolean r;
    public cej s;
    public jwj t;
    public lcj u;
    public n52 v;
    public boolean w;
    public qug x;
    public ewd y;
    public kkj z;

    public r9j(boolean z, boolean z2, cej cejVar, jwj jwjVar, lcj lcjVar, n52 n52Var, boolean z3, qug qugVar, ewd ewdVar, kkj kkjVar, eje ejeVar) {
        this.q = z;
        this.r = z2;
        this.s = cejVar;
        this.t = jwjVar;
        this.u = lcjVar;
        this.v = n52Var;
        this.w = z3;
        this.x = qugVar;
        this.y = ewdVar;
        this.z = kkjVar;
        this.A = ejeVar;
        cbj ebjVar = fob.a() ? new ebj(jwjVar, lcjVar, cejVar, z || z2) : new x30();
        k1(ebjVar);
        this.H = ebjVar;
        u8j u8jVar = new u8j(this.z, new r3(this, null, 23), new ej(this, null, 8), new g2i(this, 27));
        k1(u8jVar);
        this.I = u8jVar;
    }

    @Override // defpackage.a09
    public final void K(dma dmaVar) {
        ((eoh) this.s.d).setValue(dmaVar);
        this.H.K(dmaVar);
    }

    @Override // defpackage.wtc
    public final void c1() {
        if (this.q && n1()) {
            o1();
        }
    }

    @Override // defpackage.p3h
    public final void i(b4h b4hVar) {
        this.H.i(b4hVar);
    }

    @Override // defpackage.oma
    public final l1c k(final m1c m1cVar, g1c g1cVar, long j) {
        if (this.y == ewd.a) {
            final qhe J = g1cVar.J(an3.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
            final int min = Math.min(J.b, an3.g(j));
            final int i = 1;
            return m1c.G0(m1cVar, J.a, min, new Function1(this) { // from class: p9j
                public final /* synthetic */ r9j b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = i;
                    m1c m1cVar2 = m1cVar;
                    qhe qheVar = J;
                    phe pheVar = (phe) obj;
                    switch (i2) {
                        case 0:
                            int i3 = qheVar.a;
                            r9j r9jVar = this.b;
                            r9jVar.p1(pheVar, min, i3, r9jVar.t.d().d, m1cVar2.getLayoutDirection());
                            phe.h(pheVar, qheVar, -r9jVar.x.a.h(), 0);
                            break;
                        default:
                            int i4 = qheVar.b;
                            r9j r9jVar2 = this.b;
                            r9jVar2.p1(pheVar, min, i4, r9jVar2.t.d().d, m1cVar2.getLayoutDirection());
                            phe.h(pheVar, qheVar, 0, -r9jVar2.x.a.h());
                            break;
                    }
                    return Unit.a;
                }
            });
        }
        final qhe J2 = g1cVar.J(an3.a(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        final int min2 = Math.min(J2.a, an3.h(j));
        final int i2 = 0;
        return m1c.G0(m1cVar, min2, J2.b, new Function1(this) { // from class: p9j
            public final /* synthetic */ r9j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                m1c m1cVar2 = m1cVar;
                qhe qheVar = J2;
                phe pheVar = (phe) obj;
                switch (i22) {
                    case 0:
                        int i3 = qheVar.a;
                        r9j r9jVar = this.b;
                        r9jVar.p1(pheVar, min2, i3, r9jVar.t.d().d, m1cVar2.getLayoutDirection());
                        phe.h(pheVar, qheVar, -r9jVar.x.a.h(), 0);
                        break;
                    default:
                        int i4 = qheVar.b;
                        r9j r9jVar2 = this.b;
                        r9jVar2.p1(pheVar, min2, i4, r9jVar2.t.d().d, m1cVar2.getLayoutDirection());
                        phe.h(pheVar, qheVar, 0, -r9jVar2.x.a.h());
                        break;
                }
                return Unit.a;
            }
        });
    }

    public final boolean n1() {
        if (!this.w) {
            return false;
        }
        if (!this.q && !this.r) {
            return false;
        }
        n52 n52Var = this.v;
        return ((n52Var instanceof pvh) && ((pvh) n52Var).a == 16) ? false : true;
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        int g;
        int f;
        ymaVar.a();
        m9j d = this.t.d();
        aej c = this.s.c();
        if (c == null) {
            return;
        }
        Pair pair = d.f;
        Pair pair2 = d.f;
        long j = d.d;
        if (pair != null) {
            int i = ((adj) pair.a).a;
            long j2 = ((pej) pair.b).a;
            if (!pej.d(j2)) {
                b20 j3 = c.j(pej.g(j2), pej.f(j2));
                dfj dfjVar = c.a.b;
                if (i == 1) {
                    n52 b = dfjVar.b();
                    if (b != null) {
                        ha5.D(ymaVar, j3, b, 0.2f, null, 0, 56);
                    } else {
                        long c2 = dfjVar.c();
                        if (c2 == 16) {
                            c2 = r13.b;
                        }
                        ha5.X0(ymaVar, j3, r13.c(c2, r13.d(c2) * 0.2f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                    }
                } else {
                    ha5.X0(ymaVar, j3, ((wej) tgj.x(this, xej.a)).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                }
            }
        }
        if (pej.d(j)) {
            f6a.w(ymaVar.L0().t(), c);
            if (pair2 == null) {
                n52 n52Var = this.v;
                boolean n1 = n1();
                w84 w84Var = this.B;
                lcj lcjVar = this.u;
                float h = w84Var != null ? w84Var.c.h() : 0.0f;
                if (h != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && n1) {
                    oqf k = lcjVar.k();
                    ha5.j0(ymaVar, n52Var, (Float.floatToRawIntBits((r21 / 2.0f) + r4) << 32) | (Float.floatToRawIntBits(k.b) & 4294967295L), k.c(), k.c - k.a, 0, h, 432);
                }
            }
        } else {
            if (pair2 == null && (g = pej.g(j)) != (f = pej.f(j))) {
                ha5.X0(ymaVar, c.j(g, f), ((wej) tgj.x(this, xej.a)).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
            }
            f6a.w(ymaVar.L0().t(), c);
        }
        this.H.o(ymaVar);
    }

    public final void o1() {
        if (this.B == null) {
            this.B = new w84(((Boolean) tgj.x(this, dh3.x)).booleanValue());
            n9e.E(this);
        }
        this.C = xw3.L(Y0(), null, null, new w9g(this, null, 26), 3);
    }

    public final void p1(phe pheVar, int i, int i2, long j, ema emaVar) {
        int i3;
        aej c;
        float f;
        this.x.b.i(i);
        this.x.g(i2 - i);
        pej pejVar = this.D;
        if (pejVar != null) {
            int i4 = pej.c;
            int i5 = (int) (j & 4294967295L);
            long j2 = pejVar.a;
            if (i5 == ((int) (j2 & 4294967295L))) {
                i3 = (int) (j >> 32);
                if (i3 == ((int) (j2 >> 32)) && i2 == this.F && i == this.G) {
                    i3 = -1;
                }
                if (i3 >= 0 || !n1() || (c = this.s.c()) == null) {
                    return;
                }
                oqf c2 = c.c(llf.d(i3, new IntRange(0, c.a.a.b.length(), 1)));
                float f2 = c2.a;
                float f3 = c2.c;
                boolean z = emaVar == ema.b;
                int e0 = pheVar.e0(2.0f);
                float f4 = z ? i2 - f3 : f2;
                if (z) {
                    f2 = i2 - f3;
                }
                oqf b = oqf.b(c2, f4, f2 + e0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                float f5 = b.b;
                float f6 = b.a;
                oqf oqfVar = this.E;
                boolean z2 = (f6 == oqfVar.a && f5 == oqfVar.b && i2 == this.F) ? false : true;
                if (z2 || i != this.G) {
                    boolean z3 = this.y == ewd.a;
                    if (!z3) {
                        f5 = f6;
                    }
                    float f7 = z3 ? b.d : b.c;
                    int h = this.x.a.h();
                    float f8 = h + i;
                    if (f7 <= f8) {
                        float f9 = h;
                        if (f5 >= f9 || f7 - f5 <= i) {
                            f = (f5 >= f9 || f7 - f5 > ((float) i)) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f5 - f9;
                            this.D = new pej(j);
                            this.E = b;
                            this.G = i;
                            this.F = i2;
                            xw3.L(Y0(), null, nu3.d, new q9j(this, f, z2, c2, null, 0), 1);
                            return;
                        }
                    }
                    f = f7 - f8;
                    this.D = new pej(j);
                    this.E = b;
                    this.G = i;
                    this.F = i2;
                    xw3.L(Y0(), null, nu3.d, new q9j(this, f, z2, c2, null, 0), 1);
                    return;
                }
                return;
            }
        }
        int i6 = pej.c;
        i3 = (int) (j & 4294967295L);
        if (i3 >= 0) {
        }
    }
}
