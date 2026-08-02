package defpackage;

import android.content.Context;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.FantasyJoinLeagueBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class j27 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyJoinLeagueBottomSheet b;

    public /* synthetic */ j27(FantasyJoinLeagueBottomSheet fantasyJoinLeagueBottomSheet, int i) {
        this.a = i;
        this.b = fantasyJoinLeagueBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = nf3.a;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    String v = oea.v(R.string.fantasy_join_league, av8Var);
                    FantasyJoinLeagueBottomSheet fantasyJoinLeagueBottomSheet = this.b;
                    boolean i2 = av8Var.i(fantasyJoinLeagueBottomSheet);
                    Object O = av8Var.O();
                    if (i2 || O == obj3) {
                        O = new av6(0, fantasyJoinLeagueBottomSheet, FantasyJoinLeagueBottomSheet.class, "dismiss", "dismiss()V", 0, 8);
                        av8Var.n0(O);
                    }
                    tz9.n(v, (Function0) ((KFunction) O), null, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                FantasyJoinLeagueBottomSheet fantasyJoinLeagueBottomSheet2 = this.b;
                otk otkVar = fantasyJoinLeagueBottomSheet2.B;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                    Object obj4 = (Context) av8Var2.k(nz.b);
                    c51 w = fantasyJoinLeagueBottomSheet2.w();
                    qug o0 = hkg.o0(av8Var2);
                    Integer valueOf = Integer.valueOf(o0.a.h());
                    boolean g = av8Var2.g(w) | av8Var2.g(o0);
                    Object O2 = av8Var2.O();
                    if (g || O2 == obj3) {
                        O2 = new iv6(w, o0, null, 3);
                        av8Var2.n0(O2);
                    }
                    hz8.o(av8Var2, valueOf, (Function2) O2);
                    e1d x = rfo.x(((n27) otkVar.getValue()).g, av8Var2, 0);
                    hof hofVar = ((n27) otkVar.getValue()).i;
                    boolean i3 = av8Var2.i(fantasyJoinLeagueBottomSheet2);
                    Object O3 = av8Var2.O();
                    if (i3 || O3 == obj3) {
                        O3 = new x16(fantasyJoinLeagueBottomSheet2, 12);
                        av8Var2.n0(O3);
                    }
                    w1a.c(hofVar, null, (Function1) O3, av8Var2, 0, 14);
                    boolean z = ((j47) x.getValue()).a;
                    boolean z2 = ((j47) x.getValue()).c;
                    int i4 = ((j47) x.getValue()).d;
                    boolean z3 = ((j47) x.getValue()).b;
                    Object obj5 = (n27) otkVar.getValue();
                    boolean i5 = av8Var2.i(obj5);
                    Object O4 = av8Var2.O();
                    if (i5 || O4 == obj3) {
                        O4 = new s26(1, obj5, n27.class, "joinPrivateLeague", "joinPrivateLeague(Ljava/lang/String;)V", 0, 4);
                        av8Var2.n0(O4);
                    }
                    Function1 function1 = (Function1) ((KFunction) O4);
                    boolean i6 = av8Var2.i(obj4) | av8Var2.i(fantasyJoinLeagueBottomSheet2);
                    Object O5 = av8Var2.O();
                    if (i6 || O5 == obj3) {
                        O5 = new h84(28, obj4, fantasyJoinLeagueBottomSheet2);
                        av8Var2.n0(O5);
                    }
                    wnn.j(z, z2, i4, z3, function1, (Function0) O5, null, o0, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
