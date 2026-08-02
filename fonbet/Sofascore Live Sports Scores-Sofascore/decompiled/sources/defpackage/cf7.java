package defpackage;

import com.sofascore.results.fantasy.competition.home.bottomsheet.pricetracker.FantasyPriceTrackerBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class cf7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyPriceTrackerBottomSheet b;

    public /* synthetic */ cf7(FantasyPriceTrackerBottomSheet fantasyPriceTrackerBottomSheet, int i) {
        this.a = i;
        this.b = fantasyPriceTrackerBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasyPriceTrackerBottomSheet fantasyPriceTrackerBottomSheet = this.b;
        int i2 = 0;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc J = lz.J(bkh.c, jaa.L(av8Var), null);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, J);
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
                    oyn.j((if7) fantasyPriceTrackerBottomSheet.B.getValue(), av8Var, 0);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-383262692, av8Var2, new cf7(fantasyPriceTrackerBottomSheet, i2)), av8Var2, 6);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
