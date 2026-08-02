package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pp implements e1 {
    public static final /* synthetic */ pp[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;

    static {
        pp[] ppVarArr = {new pp("FUMBLES", 0, R.string.am_football_lineups_fumbles, R.string.legend_am_foot_fumbles, new mp(10), new mp(12), new mp(17)), new pp("FUMBLES_LOST", 1, R.string.am_football_fumbles_lost_short, R.string.legend_am_foot_fumbles_lost, new mp(18), new mp(19), new mp(20)), new pp("FUMBLES_RECOVERED", 2, R.string.am_football_lineups_fumbles_recovered, R.string.legend_am_foot_fumble_recoveries, new mp(22), new mp(23), new mp(24)), new pp("FORCED_FUMBLES", 3, R.string.am_football_lineups_forced_fumbles, R.string.legend_am_foot_forced_fumbles, new mp(25), new mp(21), new mp(26)), new pp("TOUCHDOWN_RETURNED", 4, R.string.am_football_fumble_recovery_touchdowns_short, R.string.legend_am_foot_fumble_recovery_touchdowns, new mp(27), new mp(28), new mp(29)), new pp("OUT_OF_BOUNDS", 5, R.string.am_football_out_of_bounds_short, R.string.legend_am_foot_fumbles_out_of_bounds, new op(0), new op(1), new op(2)), new pp("OWN_FUMBLE_RECOVERY", 6, R.string.am_football_recoveries_own_short, R.string.legend_am_foot_own_recoveries, new op(3), new mp(11), new mp(13)), new pp("OPPONENT_FUMBLE_RECOVERY", 7, R.string.am_football_recoveries_opposition_short, R.string.legend_am_foot_opposition_recoveries, new mp(14), new mp(15), new mp(16))};
        f = ppVarArr;
        g = new kp5(ppVarArr);
    }

    public pp(String str, int i, int i2, int i3, Function1 function1, Function1 function12, Function1 function13) {
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.d = function12;
        this.e = function13;
    }

    public static pp valueOf(String str) {
        return (pp) Enum.valueOf(pp.class, str);
    }

    public static pp[] values() {
        return (pp[]) f.clone();
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
