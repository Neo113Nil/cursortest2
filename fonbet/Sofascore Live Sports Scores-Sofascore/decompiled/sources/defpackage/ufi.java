package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ufi {
    public static final ff5 a = new ff5(0, new u9i(28));

    public static final void a(boolean z, int i, tc3 tc3Var, of3 of3Var, int i2) {
        Object mf4Var;
        q50 q50Var;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(271507892);
        int i3 = (av8Var.h(z) ? 4 : 2) | i2 | (av8Var.e(i) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            sfi sfiVar = (sfi) av8Var.k(a);
            float f = sfiVar == sfi.b ? i : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = ml4.b(f);
                av8Var.n0(O);
            }
            q50 q50Var2 = (q50) O;
            Boolean valueOf = Boolean.valueOf(z);
            Integer valueOf2 = Integer.valueOf(i);
            int i4 = i3 & 14;
            boolean e = ((i3 & 112) == 32) | av8Var.e(sfiVar.ordinal()) | (i4 == 4) | av8Var.i(q50Var2);
            Object O2 = av8Var.O();
            if (e || O2 == obj) {
                q50Var = q50Var2;
                mf4Var = new mf4(sfiVar, z, i, q50Var, null);
                av8Var.n0(mf4Var);
            } else {
                mf4Var = O2;
                q50Var = q50Var2;
            }
            hz8.p(valueOf, valueOf2, sfiVar, (Function2) mf4Var, av8Var);
            boolean d = av8Var.d(((Number) q50Var.d()).floatValue()) | (i4 == 4);
            Object O3 = av8Var.O();
            if (d || O3 == obj) {
                O3 = new e9i(((Number) q50Var.d()).floatValue());
                av8Var.n0(O3);
            }
            Object obj2 = (e9i) O3;
            g28 g28Var = bkh.c;
            k1c c = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, g28Var);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            tc3Var.invoke(obj2, av8Var, 48);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l9b(z, i, tc3Var, i2);
        }
    }
}
