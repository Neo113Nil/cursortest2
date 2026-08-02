package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.FantasyCreateLeagueBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hv6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyCreateLeagueBottomSheet b;

    public /* synthetic */ hv6(FantasyCreateLeagueBottomSheet fantasyCreateLeagueBottomSheet, int i) {
        this.a = i;
        this.b = fantasyCreateLeagueBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = nf3.a;
        switch (i) {
            case 0:
                FantasyCreateLeagueBottomSheet fantasyCreateLeagueBottomSheet = this.b;
                otk otkVar = fantasyCreateLeagueBottomSheet.B;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    c51 w = fantasyCreateLeagueBottomSheet.w();
                    qug o0 = hkg.o0(av8Var);
                    Integer valueOf = Integer.valueOf(o0.a.h());
                    boolean g = av8Var.g(w) | av8Var.g(o0);
                    Object O = av8Var.O();
                    if (g || O == obj3) {
                        O = new iv6(w, o0, null, 0);
                        av8Var.n0(O);
                    }
                    hz8.o(av8Var, valueOf, (Function2) O);
                    e1d x = rfo.x(((mv6) otkVar.getValue()).g, av8Var, 0);
                    hof hofVar = ((mv6) otkVar.getValue()).i;
                    boolean i2 = av8Var.i(fantasyCreateLeagueBottomSheet);
                    Object O2 = av8Var.O();
                    if (i2 || O2 == obj3) {
                        O2 = new x16(fantasyCreateLeagueBottomSheet, 9);
                        av8Var.n0(O2);
                    }
                    w1a.c(hofVar, null, (Function1) O2, av8Var, 0, 14);
                    boolean z = ((lv6) x.getValue()).a;
                    Object obj4 = (mv6) otkVar.getValue();
                    boolean i3 = av8Var.i(obj4);
                    Object O3 = av8Var.O();
                    if (i3 || O3 == obj3) {
                        Object pyVar = new py(3, obj4, mv6.class, "createLeague", "createLeague(Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/fantasy/FantasyLeagueGameType;)V", 0, 3);
                        av8Var.n0(pyVar);
                        O3 = pyVar;
                    }
                    l6g.i(z, (ct8) ((KFunction) O3), null, o0, false, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                    String v = oea.v(R.string.fantasy_create_league, av8Var2);
                    FantasyCreateLeagueBottomSheet fantasyCreateLeagueBottomSheet2 = this.b;
                    boolean i4 = av8Var2.i(fantasyCreateLeagueBottomSheet2);
                    Object O4 = av8Var2.O();
                    if (i4 || O4 == obj3) {
                        Object av6Var = new av6(0, fantasyCreateLeagueBottomSheet2, FantasyCreateLeagueBottomSheet.class, "dismiss", "dismiss()V", 0, 1);
                        av8Var2.n0(av6Var);
                        O4 = av6Var;
                    }
                    tz9.n(v, (Function0) ((KFunction) O4), null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
