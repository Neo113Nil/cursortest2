package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.main.fantasy.center.reorder.FantasyReorderUserCompetitionsBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bg7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyReorderUserCompetitionsBottomSheet b;

    public /* synthetic */ bg7(FantasyReorderUserCompetitionsBottomSheet fantasyReorderUserCompetitionsBottomSheet, int i) {
        this.a = i;
        this.b = fantasyReorderUserCompetitionsBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasyReorderUserCompetitionsBottomSheet fantasyReorderUserCompetitionsBottomSheet = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-83636979, av8Var, new bg7(fantasyReorderUserCompetitionsBottomSheet, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    kg0 kg0Var = ww9.h;
                    lv1 lv1Var = uxf.m;
                    utc utcVar = utc.a;
                    xtc e0 = l98.e0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f, 16.0f, 16.0f);
                    l8g a = k8g.a(kg0Var, lv1Var, av8Var2, 54);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, e0);
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
                    String v = oea.v(R.string.your_competitions, av8Var2);
                    yf8 yf8Var = xth.a;
                    udj.c(v, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.i(), av8Var2, 0, 24960, 110586);
                    xtc f0 = l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    String v2 = oea.v(R.string.save, av8Var2);
                    boolean i3 = av8Var2.i(fantasyReorderUserCompetitionsBottomSheet);
                    Object O = av8Var2.O();
                    if (i3 || O == nf3.a) {
                        O = new ag7(fantasyReorderUserCompetitionsBottomSheet, i2);
                        av8Var2.n0(O);
                    }
                    bea.f(v2, f0, null, false, (Function0) O, null, av8Var2, 48, 44);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
