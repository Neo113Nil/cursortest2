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
public final class cpj implements ipj {
    public static final /* synthetic */ cpj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        cpj[] cpjVarArr = {new cpj("POWER_PLAY", 0, R.string.hockey_power_play_percentage, new apj(1), new apj(3)), new cpj("PENALTY_KILL", 1, R.string.penalty_kill_percentage, new apj(4), new apj(5)), new cpj("GOALS", 2, R.string.goals_per_game, new apj(6), new apj(7)), new cpj("GOALS_AGAINST", 3, R.string.hockey_goals_against_pg, new apj(8), new apj(9)), new cpj("SHOTS", 4, R.string.ice_hockey_shots_per_game, new apj(10), new apj(11)), new cpj("SHOTS_AGAINST", 5, R.string.shots_against_per_game, new apj(12), new apj(13)), new cpj("HITS", 6, R.string.hockey_hits_pg, new apj(14), new apj(15)), new cpj("BLOCKS", 7, R.string.hockey_blocks_pg, new apj(16), new apj(17)), new cpj("FACE_OFF", 8, R.string.face_off_percentage, new apj(18), new apj(19)), new cpj("PENALTY_MINUTES", 9, R.string.penalty_minutes_per_game, new apj(20), new apj(2))};
        d = cpjVarArr;
        e = new kp5(cpjVarArr);
    }

    public cpj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static cpj valueOf(String str) {
        return (cpj) Enum.valueOf(cpj.class, str);
    }

    public static cpj[] values() {
        return (cpj[]) d.clone();
    }

    @Override // defpackage.ipj
    public final /* bridge */ String a(Object obj) {
        return super.a((IceHockeyTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.ipj
    public final /* bridge */ List b(Object obj) {
        return super.b((IceHockeyTopTeamsStatistics) obj);
    }

    @Override // defpackage.ipj
    public final int d() {
        return this.a;
    }

    @Override // defpackage.ipj
    public final Function1 g() {
        return this.c;
    }

    @Override // defpackage.ipj
    public final Function1 h() {
        return this.b;
    }
}
