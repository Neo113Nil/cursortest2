package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public enum aab {
    XG(R.string.football_expected_goals_short, new u9b(7), new u9b(9)),
    XGOT(R.string.football_expected_goals_on_target_short, new u9b(16), new u9b(17)),
    TotalShots(R.string.football_total_shots_short, new u9b(19), new u9b(20)),
    ShotsOnTarget(R.string.football_shots_on_target_short, new u9b(21), new u9b(22)),
    XA(R.string.football_expected_assists_short, new u9b(23), new u9b(24)),
    AccuratePasses(R.string.football_accurate_passes_short, new u9b(18), new u9b(25)),
    KeyPasses(R.string.football_key_passes_short, new u9b(26), new u9b(27)),
    Dribbles(R.string.football_successful_dribbles_short, new u9b(28), new u9b(29)),
    Touches(R.string.football_touches_short, new z9b(0), new z9b(1)),
    DefensiveContributions(R.string.football_defensive_contributions_short, new z9b(2), new u9b(8)),
    DuelsWon(R.string.football_duels_won_short, new u9b(10), new u9b(11)),
    GoalsPrevented(R.string.football_goals_prevented_short, new u9b(12), new u9b(13)),
    Saves(R.string.football_saves, new u9b(14), new u9b(15));

    public final int a;
    public final Function1 b;
    public final Function1 c;

    aab(int i, Function1 function1, Function1 function12) {
        this.a = i;
        this.b = function1;
        this.c = function12;
    }
}
