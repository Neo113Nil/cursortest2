package defpackage;

import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatFullPlayersBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bxa implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueGoatFullPlayersBottomSheet b;

    public /* synthetic */ bxa(LeagueGoatFullPlayersBottomSheet leagueGoatFullPlayersBottomSheet, int i) {
        this.a = i;
        this.b = leagueGoatFullPlayersBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gv9 gv9Var;
        exa exaVar;
        int i = this.a;
        LeagueGoatFullPlayersBottomSheet leagueGoatFullPlayersBottomSheet = this.b;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    eva evaVar = (eva) l4a.F(((kva) leagueGoatFullPlayersBottomSheet.x.getValue()).m, av8Var).getValue();
                    if (evaVar == null || (exaVar = evaVar.p) == null || (gv9Var = exaVar.b) == null) {
                        gv9Var = rlh.b;
                    }
                    o3a.c(gv9Var, null, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    boolean i2 = av8Var2.i(leagueGoatFullPlayersBottomSheet);
                    Object O = av8Var2.O();
                    if (i2 || O == nf3.a) {
                        O = new cxa(leagueGoatFullPlayersBottomSheet, 1);
                        av8Var2.n0(O);
                    }
                    x2a.f(0, av8Var2, null, (Function0) O);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
