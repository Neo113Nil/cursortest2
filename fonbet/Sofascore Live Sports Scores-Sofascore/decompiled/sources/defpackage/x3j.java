package defpackage;

import com.sofascore.results.team.trophy.TeamTrophyCompareActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class x3j implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamTrophyCompareActivity b;

    public /* synthetic */ x3j(TeamTrophyCompareActivity teamTrophyCompareActivity, int i) {
        this.a = i;
        this.b = teamTrophyCompareActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        TeamTrophyCompareActivity teamTrophyCompareActivity = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = TeamTrophyCompareActivity.M;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-2094542214, av8Var, new x3j(teamTrophyCompareActivity, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                int i4 = TeamTrophyCompareActivity.M;
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    y6a.j((l4j) teamTrophyCompareActivity.K.getValue(), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
