package defpackage;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bhf {
    public static final n7g a = o7g.a;
    public static final float b = 7.5f;
    public static final float c = 2.5f;
    public static final float d = 10.0f;
    public static final float e = 5.0f;
    public static final float f = 6.0f;
    public static final i4k g = s02.h0(300, 0, jg5.d, 2);

    public static final void a(ghf ghfVar, long j, xtc xtcVar, of3 of3Var, int i) {
        xtc xtcVar2;
        av8 av8Var;
        xtc xtcVar3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-486016981);
        int i2 = i | (av8Var2.i(ghfVar) ? 4 : 2) | (av8Var2.f(j) ? 32 : 16);
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            Object obj = O;
            if (O == a99Var) {
                b20 a2 = e20.a();
                a2.j(1);
                av8Var2.n0(a2);
                obj = a2;
            }
            b20 b20Var = (b20) obj;
            boolean g2 = av8Var2.g(ghfVar);
            Object O2 = av8Var2.O();
            if (g2 || O2 == a99Var) {
                O2 = goh.b(new zgf(ghfVar, 1));
                av8Var2.n0(O2);
            }
            cdi b2 = a60.b(((Number) ((cdi) O2).getValue()).floatValue(), g, null, av8Var2, 48, 28);
            av8Var = av8Var2;
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new b1f(21);
                av8Var.n0(O3);
            }
            xtcVar2 = xtcVar;
            xtc a3 = o3h.a(xtcVar2, false, (Function1) O3);
            boolean i3 = av8Var.i(ghfVar) | av8Var.g(b2) | ((i2 & 112) == 32) | av8Var.i(b20Var);
            Object O4 = av8Var.O();
            if (i3 || O4 == a99Var) {
                xtcVar3 = a3;
                lz1 lz1Var = new lz1(2, j, ghfVar, b2, b20Var);
                av8Var.n0(lz1Var);
                O4 = lz1Var;
            } else {
                xtcVar3 = a3;
            }
            lz.d(0, av8Var, xtcVar3, (Function1) O4);
        } else {
            xtcVar2 = xtcVar;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x1d(ghfVar, j, xtcVar2, i);
        }
    }

    public static final void b(ghf ghfVar, xtc xtcVar, long j, long j2, of3 of3Var, int i) {
        long j3;
        r13 e2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(308716636);
        int i2 = i | (av8Var.i(ghfVar) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 1024 | (av8Var.f(j2) ? 16384 : 8192) | 196608;
        int i3 = 0;
        if (av8Var.T(i2 & 1, (74899 & i2) != 74898)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                j3 = ((p23) av8Var.k(q23.a)).c();
            } else {
                av8Var.W();
                j3 = j;
            }
            av8Var.t();
            boolean g2 = av8Var.g(ghfVar);
            Object O = av8Var.O();
            if (g2 || O == nf3.a) {
                O = goh.b(new zgf(ghfVar, 0));
                av8Var.n0(O);
            }
            cdi cdiVar = (cdi) O;
            wo4 wo4Var = (wo4) av8Var.k(cj5.a);
            float f2 = f;
            if (wo4Var == null) {
                av8Var.d0(1453038224);
                av8Var.s(false);
                e2 = null;
            } else {
                av8Var.d0(323966865);
                e2 = vxd.e(av8Var, false, wo4.a(f2, 48, j3, av8Var));
            }
            long j4 = e2 != null ? e2.a : j3;
            xtc M = s02.M(td4.Z(bkh.l(xtcVar, 40.0f), new b1f(22)), new mme(ghfVar, 11));
            if (!((Boolean) cdiVar.getValue()).booleanValue()) {
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float f3 = f2;
            n7g n7gVar = a;
            xtc q = n9e.q(d2a.E(M, f3, n7gVar, true, 0L, 24), j4, n7gVar);
            k1c c2 = e12.c(uxf.c, false);
            int G = z8e.G(av8Var);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            f50 f50Var = hf3.j;
            if (av8Var.S || !Intrinsics.c(av8Var.O(), Integer.valueOf(G))) {
                mz1.t(G, av8Var, G, f50Var);
            }
            waa.K(av8Var, C, hf3.d);
            wnn.d(Boolean.FALSE, null, s02.h0(100, 0, null, 6), null, yqo.H(1853731063, av8Var, new ahf(j2, ghfVar, i3)), av8Var, 24966, 10);
            av8Var.s(true);
        } else {
            av8Var.W();
            j3 = j;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ov6(ghfVar, xtcVar, j3, j2, i);
        }
    }

    public static final void c(ha5 ha5Var, b20 b20Var, oqf oqfVar, long j, float f2, qh0 qh0Var) {
        b20Var.i();
        b20Var.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f3 = d;
        float H0 = ha5Var.H0(f3);
        float f4 = qh0Var.b;
        b20Var.f(H0 * f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        b20Var.f((ha5Var.H0(f3) * f4) / 2.0f, ha5Var.H0(e) * f4);
        float intBitsToFloat = (Float.intBitsToFloat((int) (oqfVar.d() >> 32)) + (Math.min(oqfVar.c - oqfVar.a, oqfVar.d - oqfVar.b) / 2.0f)) - ((ha5Var.H0(f3) * f4) / 2.0f);
        float H02 = (ha5Var.H0(c) / 2.0f) + Float.intBitsToFloat((int) (oqfVar.d() & 4294967295L));
        b20Var.k((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(H02) & 4294967295L));
        b20Var.d();
        float f5 = qh0Var.a;
        long O0 = ha5Var.O0();
        sx2 L0 = ha5Var.L0();
        long D = L0.D();
        L0.t().o();
        try {
            ((hpo) L0.a).F(O0, f5);
            ha5.X0(ha5Var, b20Var, j, f2, null, 56);
        } finally {
            mz1.v(L0, D);
        }
    }
}
