package defpackage;

import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.sofascore.results.weeklyChallenge.leaderboard.PreviousWeeklyLeaderboardFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class s6f implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreviousWeeklyLeaderboardFragment b;

    public /* synthetic */ s6f(PreviousWeeklyLeaderboardFragment previousWeeklyLeaderboardFragment, int i) {
        this.a = i;
        this.b = previousWeeklyLeaderboardFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        PreviousWeeklyLeaderboardFragment previousWeeklyLeaderboardFragment = this.b;
        int i2 = 1;
        of3 of3Var = (of3) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(1644690103, av8Var, new s6f(previousWeeklyLeaderboardFragment, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    WeeklyChallengeViewModel weeklyChallengeViewModel = (WeeklyChallengeViewModel) previousWeeklyLeaderboardFragment.r.getValue();
                    boolean i3 = av8Var2.i(previousWeeklyLeaderboardFragment);
                    Object O = av8Var2.O();
                    if (i3 || O == nf3.a) {
                        O = new ate(previousWeeklyLeaderboardFragment, 9);
                        av8Var2.n0(O);
                    }
                    l6g.s(weeklyChallengeViewModel, (Function0) O, null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
