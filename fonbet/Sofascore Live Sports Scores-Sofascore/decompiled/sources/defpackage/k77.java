package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class k77 implements ct8 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k77(String str, boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        long f;
        boolean z;
        int i2 = this.a;
        utc utcVar = utc.a;
        Object obj4 = this.d;
        boolean z2 = this.c;
        boolean z3 = this.b;
        switch (i2) {
            case 0:
                Function1 function1 = (Function1) obj4;
                n77 n77Var = (n77) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                n77Var.getClass();
                do7 do7Var = n77Var.a;
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(n77Var) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    boolean z4 = n77Var.f;
                    boolean g = av8Var.g(function1);
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (g || O == a99Var) {
                        O = new l77(0, function1);
                        av8Var.n0(O);
                    }
                    un0.f(z4, (Function0) O, false, false, yqo.H(883985061, av8Var, new xt6(n77Var, z3, function1, z2)), av8Var, 24576, 12);
                    k53.N(n77Var.i, null, av8Var, 0);
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    kv1 kv1Var = uxf.p;
                    xtc f0 = l98.f0(hkg.u0(bkh.c, hkg.o0(av8Var), false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
                    u23 a = t23.a(ng0Var, kv1Var, av8Var, 54);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    Integer num = do7Var.d;
                    ev6 ev6Var = do7Var.c;
                    gz8.h(do7Var, num, n77Var.b, n77Var.d, n77Var.c, ev6Var.d, n77Var.e, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, 12582912);
                    if (ev6Var.w) {
                        av8Var.d0(859034550);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(858486780);
                        m77.a(oea.v(R.string.manager, av8Var), l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), yqo.H(1441618684, av8Var, new o34(6, function1)), av8Var, 432);
                        av8Var.s(false);
                    }
                    m77.a(oea.v(R.string.fantasy_more_about_fantasy, av8Var), l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), yqo.H(928350305, av8Var, new o34(7, function1)), av8Var, 432);
                    if (ev6Var.w) {
                        av8Var.d0(860459062);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(860260662);
                        xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1);
                        boolean g2 = av8Var.g(function1);
                        Object O2 = av8Var.O();
                        if (g2 || O2 == a99Var) {
                            O2 = new rt6(23, function1);
                            av8Var.n0(O2);
                        }
                        m77.b(48, av8Var, d0, (Function0) O2);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                String str = (String) obj4;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    kg0 kg0Var = ww9.f;
                    kv1 kv1Var2 = uxf.p;
                    xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 4.0f, 8.0f);
                    u23 a2 = t23.a(kg0Var, kv1Var2, av8Var2, 54);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, c0);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m2, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C2, f50Var3);
                    if (z3 || !z2) {
                        av8Var2.d0(-311305849);
                        yf8 yf8Var = xth.a;
                        udj.c(str, null, !z2 ? ljg.f(av8Var2, -841321802, R.color.neutral_default, av8Var2, false) : ljg.f(av8Var2, -841321007, R.color.on_color_primary, av8Var2, false), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.d(), av8Var2, 0, 0, 131066);
                        l8g a3 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                        int hashCode3 = Long.hashCode(av8Var2.T);
                        aee m3 = av8Var2.m();
                        xtc C3 = fqj.C(av8Var2, utcVar);
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var2);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, a3, f50Var);
                        waa.K(av8Var2, m3, ff3Var);
                        bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                        goa g3 = ljg.g(av8Var2, C3, f50Var3, 1.0f, false);
                        String v = oea.v(R.string.fantasy_optimise_lineup_optimise_button, av8Var2);
                        if (z2) {
                            i = R.color.neutral_default;
                            f = ljg.f(av8Var2, -1848638766, R.color.on_color_primary, av8Var2, false);
                        } else {
                            i = R.color.neutral_default;
                            f = ljg.f(av8Var2, -1848639561, R.color.neutral_default, av8Var2, false);
                        }
                        udj.c(v, g3, f, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var2, 0, 24960, 110584);
                        av8Var2 = av8Var2;
                        kq9.b(s6a.N(R.drawable.ic_wand, 6, av8Var2), null, ljg.i(utcVar, 4.0f, av8Var2, utcVar, 12.0f), !z2 ? ljg.f(av8Var2, -1848626665, i, av8Var2, false) : ljg.f(av8Var2, -1848625870, R.color.on_color_primary, av8Var2, false), av8Var2, 432, 0);
                        z = true;
                        av8Var2.s(true);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-310080574);
                        String v2 = oea.v(R.string.fantasy_optimise_lineup_optimised_status, av8Var2);
                        long D = lz.D(R.color.neutral_default, av8Var2);
                        yf8 yf8Var2 = xth.a;
                        udj.c(v2, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var2, 0, 24960, 110586);
                        av8Var2.s(false);
                        z = true;
                    }
                    av8Var2.s(z);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ k77(Function1 function1, boolean z, boolean z2) {
        this.d = function1;
        this.b = z;
        this.c = z2;
    }
}
