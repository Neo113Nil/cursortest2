package defpackage;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.sofascore.results.fantasy.userteam.FantasyUserSquadActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class io7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyUserSquadActivity b;

    public /* synthetic */ io7(FantasyUserSquadActivity fantasyUserSquadActivity, int i) {
        this.a = i;
        this.b = fantasyUserSquadActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        FantasyUserSquadActivity fantasyUserSquadActivity = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = FantasyUserSquadActivity.N;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1687706480, av8Var, new io7(fantasyUserSquadActivity, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = FantasyUserSquadActivity.N;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                    ro7 ro7Var = (ro7) rfo.x(fantasyUserSquadActivity.Q().l, av8Var2, 0).getValue();
                    String str = fantasyUserSquadActivity.Q().h;
                    il8 r = fantasyUserSquadActivity.Q().r();
                    if (r == null) {
                        r = il8.f;
                    }
                    il8 il8Var = r;
                    vo7 Q = fantasyUserSquadActivity.Q();
                    boolean i5 = av8Var2.i(Q);
                    Object O = av8Var2.O();
                    if (i5 || O == nf3.a) {
                        s26 s26Var = new s26(1, Q, vo7.class, ToolBar.REFRESH, "refresh(Lcom/sofascore/results/fantasy/ui/model/FantasyUserRoundUiModel;)V", 0, 14);
                        av8Var2.n0(s26Var);
                        O = s26Var;
                    }
                    mo7.a(ro7Var, str, il8Var, (Function1) ((KFunction) O), null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
