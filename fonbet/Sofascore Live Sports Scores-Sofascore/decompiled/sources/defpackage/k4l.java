package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.weeklyChallenge.leaderboard.PreviousWeeklyLeaderboardFragment;
import com.sofascore.results.weeklyChallenge.leaderboard.WeeklyLeaderboardFragment;
import com.sofascore.results.weeklyChallenge.statistics.WeeklyChallengeStatisticsFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k4l extends s8 {
    @Override // defpackage.d41
    public final Fragment C(Enum r1) {
        j4l j4lVar = (j4l) r1;
        j4lVar.getClass();
        int ordinal = j4lVar.ordinal();
        if (ordinal == 0) {
            return new PreviousWeeklyLeaderboardFragment();
        }
        if (ordinal == 1) {
            return new WeeklyLeaderboardFragment();
        }
        if (ordinal == 2) {
            return new WeeklyChallengeStatisticsFragment();
        }
        zzl.b();
        return null;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        j4l j4lVar = (j4l) r1;
        j4lVar.getClass();
        String string = y().getString(j4lVar.a);
        string.getClass();
        return string;
    }
}
