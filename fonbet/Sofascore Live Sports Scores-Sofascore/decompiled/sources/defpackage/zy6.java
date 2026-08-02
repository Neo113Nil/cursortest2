package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zy6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyFootballPlayerBottomSheet b;

    public /* synthetic */ zy6(FantasyFootballPlayerBottomSheet fantasyFootballPlayerBottomSheet, int i) {
        this.a = i;
        this.b = fantasyFootballPlayerBottomSheet;
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
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    FantasyFootballPlayerBottomSheet fantasyFootballPlayerBottomSheet = this.b;
                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = fantasyFootballPlayerBottomSheet.M().j;
                    int i2 = fantasyFootballPlayerBottomSheet.M().k;
                    boolean z = fantasyFootballPlayerBottomSheet.M().l == FantasyCompetitionType.SEASON;
                    boolean z2 = fantasyFootballPlayerBottomSheet.M().o;
                    boolean i3 = av8Var.i(fantasyFootballPlayerBottomSheet);
                    Object O = av8Var.O();
                    if (i3 || O == obj3) {
                        O = new qo6(fantasyFootballPlayerBottomSheet, 6);
                        av8Var.n0(O);
                    }
                    ao2.d(fantasyRoundPlayerUiModel, i2, z, z2, (Function0) O, null, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                    av8Var2.d0(-1290113861);
                    qug o0 = hkg.o0(av8Var2);
                    FantasyFootballPlayerBottomSheet fantasyFootballPlayerBottomSheet2 = this.b;
                    fantasyFootballPlayerBottomSheet2.G(o0, null, av8Var2, 0);
                    av8Var2.s(false);
                    av8Var2.d0(-1290110853);
                    ksa a = msa.a(0, 0, av8Var2, 0, 3);
                    fantasyFootballPlayerBottomSheet2.F(a, null, av8Var2, 0);
                    av8Var2.s(false);
                    lz6 M = fantasyFootballPlayerBottomSheet2.M();
                    rse L = fantasyFootballPlayerBottomSheet2.L();
                    boolean i4 = av8Var2.i(fantasyFootballPlayerBottomSheet2);
                    Object O2 = av8Var2.O();
                    if (i4 || O2 == obj3) {
                        Object av6Var = new av6(0, fantasyFootballPlayerBottomSheet2, FantasyFootballPlayerBottomSheet.class, "dismiss", "dismiss()V", 0, 5);
                        av8Var2.n0(av6Var);
                        O2 = av6Var;
                    }
                    o1j.l(M, L, (Function0) ((KFunction) O2), o0, a, false, av8Var2, 0, 32);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
