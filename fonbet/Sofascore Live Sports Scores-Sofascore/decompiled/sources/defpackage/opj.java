package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.BasketballTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.BasketballTopTeamsStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class opj implements cqj {
    public static final /* synthetic */ opj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        opj[] opjVarArr = {new opj("POINTS", 0, R.string.points_basketball, new jpj(7), new jpj(9)), new opj("POINTS_ALLOWED", 1, R.string.points_allowed, new jpj(21), new npj(3)), new opj("PLUS_MINUS", 2, R.string.plus_minus_per_game, new npj(11), new npj(12)), new opj("FIELD_GOALS_PERCENT", 3, R.string.field_goals_percentage, new npj(13), new npj(14)), new opj("FIELD_GOALS_PERCENT_ALLOWED", 4, R.string.field_goals_percent_allowed, new npj(15), new npj(16)), new opj("FREE_THROWS_PERCENT", 5, R.string.free_throws_percentage, new jpj(18), new jpj(29)), new opj("THREE_POINTS_PERCENT", 6, R.string.three_points_percentage, new npj(10), new npj(17)), new opj("THREE_POINTS_PERCENT_ALLOWED", 7, R.string.three_points_percent_allowed, new npj(18), new npj(19)), new opj("THREE_POINTERS", 8, R.string.three_pointers, new npj(20), new npj(21)), new opj("ASSISTS", 9, R.string.basketball_assists, new npj(22), new jpj(8)), new opj("REBOUNDS", 10, R.string.rebounds, new jpj(10), new jpj(11)), new opj("DEFENSIVE_REBOUNDS", 11, R.string.defensive_rebounds, new jpj(12), new jpj(13)), new opj("OFFENSIVE_REBOUNDS", 12, R.string.offensive_rebounds, new jpj(14), new jpj(15)), new opj("STEALS", 13, R.string.steals, new jpj(16), new jpj(17)), new opj("TURNOVERS", 14, R.string.turnovers, new jpj(19), new jpj(20)), new opj("BLOCKS", 15, R.string.blocks, new jpj(22), new jpj(23)), new opj("FASTBREAK_POINTS", 16, R.string.basketball_fast_break_points, new jpj(24), new jpj(25)), new opj("TRUE_SH_PCT", 17, R.string.basketball_true_shooting_percentage, new jpj(26), new jpj(27)), new opj("EFF_FG_PCT", 18, R.string.basketball_effective_field_goal_percentage, new jpj(28), new npj(0)), new opj("PACE", 19, R.string.basketball_pace_factor, new npj(1), new npj(2)), new opj("OFF_RATING", 20, R.string.basketball_offensive_rating, new npj(4), new npj(5)), new opj("DEF_RATING", 21, R.string.basketball_defensive_rating, new npj(6), new npj(7)), new opj("NET_RATING", 22, R.string.basketball_net_rating, new npj(8), new npj(9))};
        d = opjVarArr;
        e = new kp5(opjVarArr);
    }

    public opj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static opj valueOf(String str) {
        return (opj) Enum.valueOf(opj.class, str);
    }

    public static opj[] values() {
        return (opj[]) d.clone();
    }

    @Override // defpackage.cqj
    public final /* bridge */ String a(Object obj) {
        return super.a((BasketballTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.cqj
    public final /* bridge */ List b(Object obj) {
        return super.b((BasketballTopTeamsStatistics) obj);
    }

    @Override // defpackage.cqj
    public final int d() {
        return this.a;
    }

    @Override // defpackage.cqj
    public final Function1 g() {
        return this.c;
    }

    @Override // defpackage.cqj
    public final Function1 h() {
        return this.b;
    }
}
