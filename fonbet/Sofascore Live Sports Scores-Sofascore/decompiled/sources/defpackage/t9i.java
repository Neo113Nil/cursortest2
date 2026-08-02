package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t9i {
    public static final /* synthetic */ t9i[] A;
    public static final /* synthetic */ kp5 B;
    public static final igf f;
    public static final t9i g;
    public static final t9i h;
    public static final t9i i;
    public static final t9i j;
    public static final t9i k;
    public static final t9i l;
    public static final t9i m;
    public static final t9i n;
    public static final t9i o;
    public static final t9i p;
    public static final t9i q;
    public static final t9i r;
    public static final t9i s;
    public static final t9i t;
    public static final t9i u;
    public static final t9i v;
    public static final t9i w;
    public static final t9i x;
    public static final t9i y;
    public static final t9i z;
    public final int a;
    public final String b;
    public final boolean c;
    public final Function1 d;
    public final Integer e;

    static {
        t9i t9iVar = new t9i("MATCHES", 0, R.string.any_sport_matches_played_short, "matches", false, new s9i(0), Integer.valueOf(R.string.matches_played));
        g = t9iVar;
        t9i t9iVar2 = new t9i("WINS", 1, R.string.any_sport_wins_short, "wins", false, new s9i(2), Integer.valueOf(R.string.any_sport_wins_long));
        h = t9iVar2;
        t9i t9iVar3 = new t9i("DRAWS", 2, R.string.any_sport_draws_short, "draws", false, new s9i(13), Integer.valueOf(R.string.any_sport_draws_long));
        i = t9iVar3;
        s9i s9iVar = new s9i(14);
        Integer valueOf = Integer.valueOf(R.string.any_sport_losses_long);
        t9i t9iVar4 = new t9i("LOSSES", 3, R.string.any_sport_losses_short, "losses", false, s9iVar, valueOf);
        j = t9iVar4;
        t9i t9iVar5 = new t9i("WINS_LOSSES", 4, R.string.any_sport_wins_losses_short, "winLosses", true, new s9i(15), Integer.valueOf(R.string.any_sport_wins_losses_long));
        k = t9iVar5;
        t9i t9iVar6 = new t9i("WINS_LOSSES_TIES", 5, R.string.any_sport_wins_losses_ties_short, "winsLossesTies", false, new s9i(16), Integer.valueOf(R.string.any_sport_wins_losses_ties_long));
        l = t9iVar6;
        t9i t9iVar7 = new t9i("GOALS_STRING_RATIO", 6, R.string.goals_short, "goals", true, new s9i(17), Integer.valueOf(R.string.any_sport_goals_long));
        m = t9iVar7;
        t9i t9iVar8 = new t9i("SETS_STRING_RATIO", 7, R.string.volleyball_sets_short, "goals", true, new s9i(18), Integer.valueOf(R.string.volleyball_sets_long));
        n = t9iVar8;
        s9i s9iVar2 = new s9i(19);
        Integer valueOf2 = Integer.valueOf(R.string.any_sport_win_percentage_long);
        t9i t9iVar9 = new t9i("GOALS_NUMERIC_RATIO", 8, R.string.any_sport_win_percentage_short, "pctGoals", true, s9iVar2, valueOf2);
        o = t9iVar9;
        t9i t9iVar10 = new t9i("SETS_NUMERIC_RATIO", 9, R.string.volleyball_sets_ratio_short, "pctGoals", true, new s9i(20), Integer.valueOf(R.string.volleyball_sets_ratio_long));
        p = t9iVar10;
        t9i t9iVar11 = new t9i("SCORE_DIFF", 10, R.string.any_sport_difference_short, "scoreDiffFormatted", true, new s9i(11), Integer.valueOf(R.string.any_sport_difference_long));
        q = t9iVar11;
        t9i t9iVar12 = new t9i("OVERTIME_WINS", 11, R.string.ice_hockey_overtime_wins_short, "overtimeWins", false, new s9i(21), Integer.valueOf(R.string.ice_hockey_overtime_wins_long));
        r = t9iVar12;
        t9i t9iVar13 = new t9i("NORMALTIME_LOSSES", 12, R.string.any_sport_losses_short, "availableLosses", false, new s9i(22), valueOf);
        s = t9iVar13;
        t9i t9iVar14 = new t9i("OVERTIME_LOSSES", 13, R.string.hockey_overtime_shootout_losses_short, "availableOvertimeLosses", false, new s9i(23), Integer.valueOf(R.string.hockey_overtime_shootout_losses));
        t = t9iVar14;
        t9i t9iVar15 = new t9i("OVERTIME_RECORD", 14, R.string.hockey_overtime_record_short, "overtimeRecord", true, new s9i(24), Integer.valueOf(R.string.hockey_overtime_record));
        u = t9iVar15;
        t9i t9iVar16 = new t9i("SHOOTOUT_RECORD", 15, R.string.hockey_shootout_record_short, "shootoutRecord", true, new s9i(25), Integer.valueOf(R.string.hockey_shootout_record));
        v = t9iVar16;
        t9i t9iVar17 = new t9i("PENALTY_WINS", 16, R.string.any_sport_penalty_wins_short, "penaltyWins", false, new s9i(26), Integer.valueOf(R.string.any_sport_penalty_wins_long));
        t9i t9iVar18 = new t9i("PENALTY_LOSSES", 17, R.string.any_sport_penalty_losses_short, "penaltyLosses", false, new s9i(27), Integer.valueOf(R.string.any_sport_penalty_losses_long));
        t9i t9iVar19 = new t9i("OVERTIME_AND_PENALTY_WINS", 18, R.string.ice_hockey_overtime_and_penalty_wins_short, "overtimeAndPenaltyWins", false, new s9i(28), Integer.valueOf(R.string.ice_hockey_overtime_and_penalty_wins_long));
        t9i t9iVar20 = new t9i("NET_RUN_RATE", 19, R.string.cricket_net_run_rate_short, "netRunRate", true, new s9i(1), Integer.valueOf(R.string.cricket_net_run_rate_long));
        t9i t9iVar21 = new t9i("NO_RESULT", 20, R.string.cricket_no_result_short, "noResult", false, new s9i(3), Integer.valueOf(R.string.cricket_no_result_long));
        t9i t9iVar22 = new t9i("STREAK", 21, R.string.basketball_streak_short, "streak", false, new s9i(4), Integer.valueOf(R.string.basketball_streak_long));
        w = t9iVar22;
        t9i t9iVar23 = new t9i("GAMES_BEHIND", 22, R.string.any_sport_games_behind_short, "gamesBehind", true, new s9i(5), Integer.valueOf(R.string.any_sport_games_behind_long));
        x = t9iVar23;
        t9i t9iVar24 = new t9i("POINTS_SEASON_BEFORE_PREVIOUS", 23, R.string.points_season_before_previous_short, "pointsPrevPrevSeason", false, new s9i(6), Integer.valueOf(R.string.points_season_before_previous_long));
        t9i t9iVar25 = new t9i("POINTS_PREVIOUS_SEASON", 24, R.string.points_previous_season_short, "pointsPrevSeason", false, new s9i(7), Integer.valueOf(R.string.points_previous_season_long));
        t9i t9iVar26 = new t9i("POINTS_CURRENT_SEASON", 25, R.string.points_current_season_short, "pointsCurrSeason", false, new s9i(8), Integer.valueOf(R.string.points_current_season_long));
        t9i t9iVar27 = new t9i("POINTS", 26, R.string.any_sport_points_short, "points", false, new s9i(9), Integer.valueOf(R.string.any_sport_points_long));
        y = t9iVar27;
        t9i t9iVar28 = new t9i("POINTS_PER_GAME", 27, R.string.football_points_per_game_short, "pointsPerGame", true, new s9i(10), Integer.valueOf(R.string.football_points_per_game_long));
        t9i t9iVar29 = new t9i("PERCENTAGE", 28, R.string.any_sport_win_percentage_short, "percentage", true, new s9i(12), valueOf2);
        z = t9iVar29;
        t9i[] t9iVarArr = {t9iVar, t9iVar2, t9iVar3, t9iVar4, t9iVar5, t9iVar6, t9iVar7, t9iVar8, t9iVar9, t9iVar10, t9iVar11, t9iVar12, t9iVar13, t9iVar14, t9iVar15, t9iVar16, t9iVar17, t9iVar18, t9iVar19, t9iVar20, t9iVar21, t9iVar22, t9iVar23, t9iVar24, t9iVar25, t9iVar26, t9iVar27, t9iVar28, t9iVar29};
        A = t9iVarArr;
        B = new kp5(t9iVarArr);
        f = new igf(2);
    }

    public t9i(String str, int i2, int i3, String str2, boolean z2, Function1 function1, Integer num) {
        this.a = i3;
        this.b = str2;
        this.c = z2;
        this.d = function1;
        this.e = num;
    }

    public static t9i valueOf(String str) {
        return (t9i) Enum.valueOf(t9i.class, str);
    }

    public static t9i[] values() {
        return (t9i[]) A.clone();
    }

    public final Integer a(String str) {
        str.getClass();
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 26 && str.equals(Sports.ICE_HOCKEY)) {
                return Integer.valueOf(R.string.ice_hockey_points);
            }
        } else if (str.equals(Sports.ICE_HOCKEY)) {
            return Integer.valueOf(R.string.hockey_games_played);
        }
        return this.e;
    }

    public final int b(String str) {
        str.getClass();
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 26 && str.equals(Sports.ICE_HOCKEY)) {
                return R.string.hockey_points_short;
            }
        } else if (str.equals(Sports.ICE_HOCKEY)) {
            return R.string.hockey_games_played_short;
        }
        return this.a;
    }
}
