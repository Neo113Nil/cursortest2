package defpackage;

import com.sofascore.results.fantasy.league.settings.dialog.FantasyLeagueTeamsFullScreenDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class a67 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyLeagueTeamsFullScreenDialog b;

    public /* synthetic */ a67(FantasyLeagueTeamsFullScreenDialog fantasyLeagueTeamsFullScreenDialog, int i) {
        this.a = i;
        this.b = fantasyLeagueTeamsFullScreenDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(675015155, av8Var, new a67(this.b, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    FantasyLeagueTeamsFullScreenDialog fantasyLeagueTeamsFullScreenDialog = this.b;
                    h67 h67Var = (h67) fantasyLeagueTeamsFullScreenDialog.A.getValue();
                    j37 j37Var = (j37) fantasyLeagueTeamsFullScreenDialog.B.getValue();
                    boolean i3 = av8Var2.i(fantasyLeagueTeamsFullScreenDialog);
                    Object O = av8Var2.O();
                    if (i3 || O == nf3.a) {
                        av6 av6Var = new av6(0, fantasyLeagueTeamsFullScreenDialog, FantasyLeagueTeamsFullScreenDialog.class, "dismiss", "dismiss()V", 0, 11);
                        av8Var2.n0(av6Var);
                        O = av6Var;
                    }
                    l98.h(h67Var, j37Var, (Function0) ((KFunction) O), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
