package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cq implements e1 {
    public static final /* synthetic */ cq[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;

    static {
        cq[] cqVarArr = {new cq("CARRIES", 0, R.string.am_football_lineups_carries, R.string.legend_am_foot_attempts, new aq(1), new aq(3), new aq(5)), new cq("YARDS", 1, R.string.am_football_lineups_yards, R.string.legend_am_foot_rushing_yards, new aq(6), new aq(7), new aq(8)), new cq("TOUCHDOWNS", 2, R.string.am_football_lineups_touchdowns, R.string.legend_am_foot_rushing_tdowns, new aq(9), new aq(10), new aq(11)), new cq("AVERAGE", 3, R.string.am_football_lineups_average, R.string.legend_am_foot_rushing_avg_yards_attempt, new aq(13), new aq(12), new aq(14)), new cq("LONGEST", 4, R.string.am_football_longest_rush_short, R.string.legend_am_foot_rushing_longest_rush, new aq(15), new aq(16), new aq(17)), new cq("FIRST_DOWNS", 5, R.string.am_football_rushing_first_downs_short, R.string.legend_am_foot_rushing_first_downs, new aq(18), new aq(19), new aq(20)), new cq("RED_ZONE_ATTEMPTS", 6, R.string.am_football_rz_attempts_short, R.string.legend_am_foot_red_zone_attemps, new aq(21), new aq(2), new aq(4))};
        f = cqVarArr;
        g = new kp5(cqVarArr);
    }

    public cq(String str, int i, int i2, int i3, Function1 function1, Function1 function12, Function1 function13) {
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.d = function12;
        this.e = function13;
    }

    public static cq valueOf(String str) {
        return (cq) Enum.valueOf(cq.class, str);
    }

    public static cq[] values() {
        return (cq[]) f.clone();
    }

    @Override // defpackage.e1
    public final Function1 d() {
        return this.c;
    }

    @Override // defpackage.e1
    public final int g() {
        return this.a;
    }

    @Override // defpackage.e1
    public final Function1 h() {
        return this.d;
    }

    @Override // defpackage.e1
    public final boolean i() {
        return false;
    }

    @Override // defpackage.e1
    public final boolean j() {
        return false;
    }

    @Override // defpackage.e1
    public final boolean k() {
        return false;
    }

    @Override // defpackage.e1
    public final int l() {
        return this.b;
    }

    @Override // defpackage.e1
    public final Function1 m() {
        return this.e;
    }
}
