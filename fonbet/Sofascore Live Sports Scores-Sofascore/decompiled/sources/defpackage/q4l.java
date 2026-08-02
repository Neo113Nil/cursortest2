package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.sofascore.results.weeklyChallenge.leaderboard.WeeklyLeaderboardFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class q4l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeeklyLeaderboardFragment b;

    public /* synthetic */ q4l(WeeklyLeaderboardFragment weeklyLeaderboardFragment, int i) {
        this.a = i;
        this.b = weeklyLeaderboardFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SharedPreferences d;
        int i = this.a;
        WeeklyLeaderboardFragment weeklyLeaderboardFragment = this.b;
        switch (i) {
            case 0:
                weeklyLeaderboardFragment.E(WeeklyChallengeViewModel.LeaderboardInfoType.POINTS_INFO);
                return Unit.a;
            case 1:
                weeklyLeaderboardFragment.E(WeeklyChallengeViewModel.LeaderboardInfoType.ZONE_INFO);
                return Unit.a;
            case 2:
                weeklyLeaderboardFragment.E(WeeklyChallengeViewModel.LeaderboardInfoType.TIME_INFO);
                return Unit.a;
            case 3:
                weeklyLeaderboardFragment.C().a();
                return Unit.a;
            default:
                Context requireContext = weeklyLeaderboardFragment.requireContext();
                requireContext.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = requireContext.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                if (!sharedPreferences.getBoolean("PREF_SHOW_WEEKLY_STREAK_TOOLTIP", true)) {
                    return null;
                }
                z3f c = z3f.c(LayoutInflater.from(weeklyLeaderboardFragment.getContext()).inflate(R.layout.tooltip_bubble, (ViewGroup) null, false));
                ((TextView) c.d).setText(weeklyLeaderboardFragment.getString(R.string.hint_current_weekly_streak));
                View view = (View) c.c;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    return null;
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 8388613;
                Context requireContext2 = weeklyLeaderboardFragment.requireContext();
                requireContext2.getClass();
                layoutParams2.setMarginEnd(ao2.s(20, requireContext2));
                view.setLayoutParams(layoutParams2);
                ((LinearLayout) c.b).setOnClickListener(new tii(weeklyLeaderboardFragment, 7));
                return (LinearLayout) c.b;
        }
    }
}
