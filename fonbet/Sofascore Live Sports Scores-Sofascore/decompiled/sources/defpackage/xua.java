package defpackage;

import com.sofascore.results.league.fragment.details.LeagueDetailsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xua implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueDetailsFragment b;

    public /* synthetic */ xua(LeagueDetailsFragment leagueDetailsFragment, int i) {
        this.a = i;
        this.b = leagueDetailsFragment;
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
                    haa.f(yqo.H(1276169174, av8Var, new xua(this.b, i)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                    LeagueDetailsFragment leagueDetailsFragment = this.b;
                    eva evaVar = (eva) l4a.F(leagueDetailsFragment.H().m, av8Var2).getValue();
                    v2f v2fVar = evaVar != null ? evaVar.b : null;
                    if (v2fVar == null) {
                        av8Var2.d0(-694493005);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(-694493004);
                        boolean i2 = av8Var2.i(leagueDetailsFragment);
                        Object O = av8Var2.O();
                        a99 a99Var = nf3.a;
                        if (i2 || O == a99Var) {
                            fl8 fl8Var = new fl8(0, leagueDetailsFragment, LeagueDetailsFragment.class, "showPowerRankingsInfoModal", "showPowerRankingsInfoModal()V", 0, 4);
                            av8Var2.n0(fl8Var);
                            O = fl8Var;
                        }
                        Function0 function0 = (Function0) ((KFunction) O);
                        boolean i3 = av8Var2.i(leagueDetailsFragment);
                        Object O2 = av8Var2.O();
                        if (i3 || O2 == a99Var) {
                            fl8 fl8Var2 = new fl8(0, leagueDetailsFragment, LeagueDetailsFragment.class, "navigateToPowerRankings", "navigateToPowerRankings()V", 0, 5);
                            av8Var2.n0(fl8Var2);
                            O2 = fl8Var2;
                        }
                        Function0 function02 = (Function0) ((KFunction) O2);
                        boolean i4 = av8Var2.i(leagueDetailsFragment);
                        Object O3 = av8Var2.O();
                        if (i4 || O3 == a99Var) {
                            s26 s26Var = new s26(1, leagueDetailsFragment, LeagueDetailsFragment.class, "navigateToTeamPage", "navigateToTeamPage(I)V", 0, 26);
                            av8Var2.n0(s26Var);
                            O3 = s26Var;
                        }
                        t6a.a(v2fVar, function0, function02, (Function1) ((KFunction) O3), l98.c0(utc.a, 8.0f, 4.0f), av8Var2, 24576);
                        av8Var2.s(false);
                    }
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
