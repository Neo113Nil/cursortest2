package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class b07 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;

    public /* synthetic */ b07(c51 c51Var, int i) {
        this.a = i;
        this.b = c51Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        c51 c51Var = this.b;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1324093597, av8Var, new b07(c51Var, i3)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qug o0 = hkg.o0(av8Var2);
                    Integer valueOf = Integer.valueOf(o0.a.h());
                    boolean g = av8Var2.g(c51Var) | av8Var2.g(o0);
                    Object O = av8Var2.O();
                    rq3 rq3Var = null;
                    if (g || O == nf3.a) {
                        O = new iv6(c51Var, o0, rq3Var, i2);
                        av8Var2.n0(O);
                    }
                    hz8.o(av8Var2, valueOf, (Function2) O);
                    kv1 kv1Var = uxf.p;
                    j9d L = jaa.L(av8Var2);
                    utc utcVar = utc.a;
                    xtc f0 = l98.f0(l98.d0(hkg.u0(lz.J(utcVar, L, null), o0, false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5);
                    u23 a = t23.a(ww9.d, kv1Var, av8Var2, 48);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    kq9.b(s6a.N(R.drawable.ic_swap_16, 6, av8Var2), null, l98.b0(n9e.q(bkh.l(l98.b0(utcVar, 8.0f), 56.0f), lz.D(R.color.primary_highlight, av8Var2), o7g.a), 12.0f), lz.D(R.color.primary_default, av8Var2), av8Var2, 48, 0);
                    String v = oea.v(R.string.fantasy_no_free_transfers_left_body, av8Var2);
                    yf8 yf8Var = xth.a;
                    udj.c(v, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var2, 48, 0, 131064);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
