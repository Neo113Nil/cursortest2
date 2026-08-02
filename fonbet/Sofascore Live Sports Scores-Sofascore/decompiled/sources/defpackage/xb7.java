package defpackage;

import com.sofascore.results.fantasy.competition.team.bottomsheet.FantasyOptimiseSquadBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xb7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyOptimiseSquadBottomSheet b;

    public /* synthetic */ xb7(FantasyOptimiseSquadBottomSheet fantasyOptimiseSquadBottomSheet, int i) {
        this.a = i;
        this.b = fantasyOptimiseSquadBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = 1;
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1906403467, av8Var, new xb7(this.b, i)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                FantasyOptimiseSquadBottomSheet fantasyOptimiseSquadBottomSheet = this.b;
                joa joaVar = fantasyOptimiseSquadBottomSheet.E;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    xtc J = lz.J(gz8.x(bkh.d(utc.a, 1.0f), null, null, 3), jaa.L(av8Var2), null);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, J);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    gc7 gc7Var = (gc7) fantasyOptimiseSquadBottomSheet.B.getValue();
                    pu6 pu6Var = (pu6) fantasyOptimiseSquadBottomSheet.C.getValue();
                    boolean i2 = av8Var2.i(fantasyOptimiseSquadBottomSheet);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i2 || O == a99Var) {
                        O = new av6(0, fantasyOptimiseSquadBottomSheet, FantasyOptimiseSquadBottomSheet.class, "dismiss", "dismiss()V", 0, 17);
                        av8Var2.n0(O);
                    }
                    Function0 function0 = (Function0) ((KFunction) O);
                    ds8 ds8Var = (ds8) joaVar.getValue();
                    boolean i3 = av8Var2.i(ds8Var);
                    Object O2 = av8Var2.O();
                    if (i3 || O2 == a99Var) {
                        av6 av6Var = new av6(0, ds8Var, ds8.class, "show", "show()V", 0, 18);
                        av8Var2.n0(av6Var);
                        O2 = av6Var;
                    }
                    Function0 function02 = (Function0) ((KFunction) O2);
                    ds8 ds8Var2 = (ds8) joaVar.getValue();
                    boolean i4 = av8Var2.i(ds8Var2);
                    Object O3 = av8Var2.O();
                    if (i4 || O3 == a99Var) {
                        av6 av6Var2 = new av6(0, ds8Var2, ds8.class, "dismiss", "dismiss()V", 0, 19);
                        av8Var2.n0(av6Var2);
                        O3 = av6Var2;
                    }
                    ao2.f(gc7Var, pu6Var, function0, function02, (Function0) ((KFunction) O3), av8Var2, 0);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
