package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.IceHockeyTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.IceHockeyTopTeamsStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wpj implements cqj {
    public static final /* synthetic */ wpj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        wpj[] wpjVarArr = {new wpj("POWER_PLAY", 0, R.string.hockey_power_play_percentage, new spj(23), new spj(25)), new wpj("PENALTY_KILL", 1, R.string.penalty_kill_percentage, new spj(26), new spj(27)), new wpj("GOALS", 2, R.string.goals_per_game, new spj(28), new spj(29)), new wpj("GOALS_AGAINST", 3, R.string.hockey_goals_against_pg, new vpj(0), new vpj(1)), new wpj("SHOTS", 4, R.string.ice_hockey_shots_per_game, new vpj(2), new vpj(3)), new wpj("SHOTS_AGAINST", 5, R.string.shots_against_per_game, new vpj(4), new vpj(5)), new wpj("HITS", 6, R.string.hockey_hits_pg, new vpj(6), new vpj(7)), new wpj("BLOCKS", 7, R.string.hockey_blocks_pg, new vpj(8), new vpj(9)), new wpj("FACE_OFF", 8, R.string.face_off_percentage, new vpj(10), new vpj(11)), new wpj("PENALTY_MINUTES", 9, R.string.penalty_minutes_per_game, new vpj(12), new spj(24))};
        d = wpjVarArr;
        e = new kp5(wpjVarArr);
    }

    public wpj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static wpj valueOf(String str) {
        return (wpj) Enum.valueOf(wpj.class, str);
    }

    public static wpj[] values() {
        return (wpj[]) d.clone();
    }

    @Override // defpackage.cqj
    public final /* bridge */ String a(Object obj) {
        return super.a((IceHockeyTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.cqj
    public final /* bridge */ List b(Object obj) {
        return super.b((IceHockeyTopTeamsStatistics) obj);
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
