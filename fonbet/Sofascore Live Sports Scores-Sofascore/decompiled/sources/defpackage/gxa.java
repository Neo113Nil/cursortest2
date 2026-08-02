package defpackage;

import android.content.Context;
import com.sofascore.results.league.fragment.details.compose.goat.LeagueGoatVoteBottomSheet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class gxa implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueGoatVoteBottomSheet b;

    public /* synthetic */ gxa(LeagueGoatVoteBottomSheet leagueGoatVoteBottomSheet, int i) {
        this.a = i;
        this.b = leagueGoatVoteBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gv9 gv9Var;
        exa exaVar;
        gv9 gv9Var2;
        List H0;
        int i = this.a;
        a99 a99Var = nf3.a;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    LeagueGoatVoteBottomSheet leagueGoatVoteBottomSheet = this.b;
                    boolean i2 = av8Var.i(leagueGoatVoteBottomSheet);
                    Object O = av8Var.O();
                    if (i2 || O == a99Var) {
                        O = new fxa(leagueGoatVoteBottomSheet, 2);
                        av8Var.n0(O);
                    }
                    x2a.f(0, av8Var, null, (Function0) O);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                boolean z = (intValue2 & 3) != 2;
                int i3 = 1 & intValue2;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(i3, z)) {
                    Context context = (Context) av8Var2.k(nz.b);
                    LeagueGoatVoteBottomSheet leagueGoatVoteBottomSheet2 = this.b;
                    eva evaVar = (eva) l4a.F(((kva) leagueGoatVoteBottomSheet2.x.getValue()).m, av8Var2).getValue();
                    if (evaVar == null || (exaVar = evaVar.p) == null || (gv9Var2 = exaVar.b) == null || (H0 = CollectionsKt.H0(gv9Var2, new se7(24))) == null || (gv9Var = l6g.W(H0)) == null) {
                        gv9Var = rlh.b;
                    }
                    boolean i4 = av8Var2.i(context) | av8Var2.i(leagueGoatVoteBottomSheet2);
                    Object O2 = av8Var2.O();
                    if (i4 || O2 == a99Var) {
                        O2 = new uf8(22, context, leagueGoatVoteBottomSheet2);
                        av8Var2.n0(O2);
                    }
                    Function1 function1 = (Function1) O2;
                    boolean i5 = av8Var2.i(leagueGoatVoteBottomSheet2);
                    Object O3 = av8Var2.O();
                    if (i5 || O3 == a99Var) {
                        fl8 fl8Var = new fl8(0, leagueGoatVoteBottomSheet2, LeagueGoatVoteBottomSheet.class, "dismiss", "dismiss()V", 0, 6);
                        av8Var2.n0(fl8Var);
                        O3 = fl8Var;
                    }
                    r4a.n(0, av8Var2, gv9Var, null, (Function0) ((KFunction) O3), function1);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
