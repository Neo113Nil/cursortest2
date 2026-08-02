package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ocf {
    public static final h74 a;

    static {
        new h74(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.8f, 1.0f);
        new h74(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f);
        new h74(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.65f, 1.0f);
        new h74(0.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.45f, 1.0f);
        a = new h74(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 1.0f);
    }

    public static final void a(final float f, int i, final int i2, final long j, long j2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        av8 av8Var;
        final int i3;
        final long j3;
        int i4;
        long j4;
        int i5;
        xtc xtcVar3;
        final long j5;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1119119072);
        int i6 = i2 | (av8Var2.f(j) ? 32 : 16) | 11264;
        if (av8Var2.T(i6 & 1, (i6 & 9363) != 9362)) {
            av8Var2.Y();
            if ((i2 & 1) == 0 || av8Var2.B()) {
                i4 = i6 & (-57345);
                j4 = r13.h;
                i5 = 2;
            } else {
                av8Var2.W();
                i4 = i6 & (-57345);
                i5 = i;
                j4 = j2;
            }
            av8Var2.t();
            final jii jiiVar = new jii(((kx4) av8Var2.k(dh3.h)).H0(f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i5, 0, null, 26);
            h2a F = i2a.F(null, av8Var2, 1);
            q4k q4kVar = lz.g;
            cp4 cp4Var = jg5.d;
            final f2a r = i2a.r(F, 0, 5, q4kVar, s02.P(s02.h0(6660, 0, cp4Var, 2), null, 0L, 6), null, av8Var2, 33208, 16);
            final f2a q = i2a.q(F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 286.0f, s02.P(s02.h0(1332, 0, cp4Var, 2), null, 0L, 6), null, av8Var2, 4536, 8);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new b1f(17);
                av8Var2.n0(O);
            }
            sja sjaVar = new sja();
            ((Function1) O).invoke(sjaVar);
            final f2a q2 = i2a.q(F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 290.0f, s02.P(new tja(sjaVar), null, 0L, 6), null, av8Var2, 4536, 8);
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = new b1f(18);
                av8Var2.n0(O2);
            }
            sja sjaVar2 = new sja();
            ((Function1) O2).invoke(sjaVar2);
            final f2a q3 = i2a.q(F, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 290.0f, s02.P(new tja(sjaVar2), null, 0L, 6), null, av8Var2, 4536, 8);
            av8Var = av8Var2;
            xtcVar2 = xtcVar;
            boolean z = true;
            xtc l = bkh.l(o3h.a(xtcVar2, true, new b1f(20)), 40.0f);
            boolean i7 = av8Var.i(jiiVar) | av8Var.g(r) | av8Var.g(q2) | av8Var.g(q3) | av8Var.g(q);
            if ((((i4 & 112) ^ 48) <= 32 || !av8Var.f(j)) && (i4 & 48) != 32) {
                z = false;
            }
            boolean z2 = i7 | z;
            Object O3 = av8Var.O();
            if (z2 || O3 == a99Var) {
                xtcVar3 = l;
                j5 = j4;
                Function1 function1 = new Function1() { // from class: hcf
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ha5 ha5Var = (ha5) obj;
                        long j6 = j5;
                        jii jiiVar2 = jiiVar;
                        ocf.b(ha5Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f, j6, jiiVar2);
                        float intValue = (((Number) r.getValue()).intValue() * 216.0f) % 360.0f;
                        float floatValue = ((Number) q2.getValue()).floatValue();
                        cdi cdiVar = q3;
                        ocf.b(ha5Var, ((Number) cdiVar.getValue()).floatValue() + ((Number) q.getValue()).floatValue() + (intValue - 90.0f) + (jiiVar2.c == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((f / 20.0f) * 57.29578f) / 2.0f), Math.max(Math.abs(floatValue - ((Number) cdiVar.getValue()).floatValue()), 0.1f), j, jiiVar2);
                        return Unit.a;
                    }
                };
                av8Var.n0(function1);
                O3 = function1;
            } else {
                xtcVar3 = l;
                j5 = j4;
            }
            lz.d(0, av8Var, xtcVar3, (Function1) O3);
            j3 = j5;
            i3 = i5;
        } else {
            xtcVar2 = xtcVar;
            av8Var = av8Var2;
            av8Var.W();
            i3 = i;
            j3 = j2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            final xtc xtcVar4 = xtcVar2;
            u.d = new Function2(j, f, j3, i3, i2) { // from class: jcf
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;
                public final /* synthetic */ long d;
                public final /* synthetic */ int e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(391);
                    ocf.a(this.c, this.e, K, this.b, this.d, (of3) obj, xtc.this);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(ha5 ha5Var, float f, float f2, long j, jii jiiVar) {
        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32)) - (2.0f * (jiiVar.a / 2.0f));
        ha5.L(ha5Var, j, f, f2, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jiiVar, 832);
    }
}
