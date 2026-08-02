package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.sofascore.results.weeklyChallenge.a;
import com.sofascore.results.weeklyChallenge.leaderboard.LeaderboardInfoModal;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bta implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeaderboardInfoModal b;

    public /* synthetic */ bta(LeaderboardInfoModal leaderboardInfoModal, int i) {
        this.a = i;
        this.b = leaderboardInfoModal;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        dta dtaVar;
        int i = this.a;
        LeaderboardInfoModal leaderboardInfoModal = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(965143762, av8Var, new bta(leaderboardInfoModal, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    WeeklyChallengeViewModel.LeaderboardInfoType leaderboardInfoType = (WeeklyChallengeViewModel.LeaderboardInfoType) leaderboardInfoModal.y.getValue();
                    Integer valueOf = Integer.valueOf(R.string.weekly_challenge_name_leaderboard);
                    Integer valueOf2 = Integer.valueOf(R.string.weekly_challenge_later_weeks);
                    Integer valueOf3 = Integer.valueOf(R.string.weekly_challenge_current_week);
                    Integer valueOf4 = Integer.valueOf(R.string.weekly_challenge_losing_points);
                    Integer valueOf5 = Integer.valueOf(R.string.weekly_challenge_getting_points);
                    leaderboardInfoType.getClass();
                    int i3 = a.a[leaderboardInfoType.ordinal()];
                    if (i3 == 1) {
                        dtaVar = new dta(b.j(new a3a(Integer.valueOf(R.string.weekly_challenge_how_to_play), Integer.valueOf(R.string.weekly_challenge_how_to_body_one), Integer.valueOf(R.string.weekly_challenge_how_to_body_two), null), new a3a(Integer.valueOf(R.string.weekly_challenge_where_to_vote), Integer.valueOf(R.string.weekly_challenge_where_to_vote_body), null, null), new a3a(Integer.valueOf(R.string.weekly_challenge_what_happens), Integer.valueOf(R.string.weekly_challenge_what_happens_body_one), Integer.valueOf(R.string.weekly_challenge_what_happens_body_two), null), new a3a(Integer.valueOf(R.string.weekly_challenge_collecting_points), Integer.valueOf(R.string.weekly_challenge_collecting_points_body_one), null, b.j(valueOf5, valueOf4, valueOf3, valueOf2, valueOf)), new a3a(Integer.valueOf(R.string.weekly_challenge_daily_10x_header), Integer.valueOf(R.string.weekly_challenge_info_bottom_sheet_daily_10x_intro), null, b.j(Integer.valueOf(R.string.weekly_challenge_info_bottom_sheet_daily_10x_bullet_1), Integer.valueOf(R.string.weekly_challenge_info_bottom_sheet_daily_10x_bullet_2), Integer.valueOf(R.string.weekly_challenge_info_bottom_sheet_daily_10x_bullet_3))), new a3a(Integer.valueOf(R.string.weekly_streaks_title), null, null, b.j(Integer.valueOf(R.string.weekly_streaks_starting_bullet), Integer.valueOf(R.string.weekly_streaks_staying_bullet), Integer.valueOf(R.string.weekly_streaks_losing_bullet), Integer.valueOf(R.string.weekly_streaks_tracking_self), Integer.valueOf(R.string.weekly_streaks_tracking_rivals)))));
                    } else if (i3 == 2) {
                        dtaVar = new dta(kotlin.collections.a.c(new a3a(null, null, null, b.j(valueOf5, valueOf4, valueOf3, valueOf2, valueOf))));
                    } else if (i3 == 3) {
                        dtaVar = new dta(kotlin.collections.a.c(new a3a(null, Integer.valueOf(R.string.leaderboard_explainer_bottom_sheet), null, null)));
                    } else if (i3 != 4) {
                        zzl.b();
                        break;
                    } else {
                        dtaVar = new dta(kotlin.collections.a.c(new a3a(null, Integer.valueOf(R.string.timer_explainer_bottom_sheet), null, null)));
                    }
                    qea.d(dtaVar, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
