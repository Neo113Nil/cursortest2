package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xp implements e1 {
    public static final /* synthetic */ xp[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;

    static {
        xp[] xpVarArr = {new xp("NUMBER", 0, R.string.am_football_lineups_number, R.string.legend_am_foot_punt_returns_total, new up(25), new wp(12), new up(26)), new xp("YARDS", 1, R.string.am_football_lineups_yards, R.string.legend_am_foot_punt_returns_rtrnd_yards, new up(27), new up(28), new up(29)), new xp("AVERAGE", 2, R.string.am_football_lineups_average, R.string.legend_am_foot_punt_returns_rtrnd_avg_yards, new wp(0), new wp(1), new wp(2)), new xp("TOUCHDOWNS", 3, R.string.am_football_lineups_touchdowns, R.string.legend_am_foot_punt_return_touchdowns, new wp(3), new wp(4), new wp(5)), new xp("LONGEST", 4, R.string.am_football_longest_punt_return_short, R.string.legend_am_foot_punt_returns_longest_return, new wp(6), new wp(7), new wp(8)), new xp("FAIR_CATCHES", 5, R.string.am_football_fair_catch_punt_short, R.string.legend_am_foot_punt_return_fair_catches, new wp(9), new wp(10), new wp(11))};
        f = xpVarArr;
        g = new kp5(xpVarArr);
    }

    public xp(String str, int i, int i2, int i3, Function1 function1, Function1 function12, Function1 function13) {
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.d = function12;
        this.e = function13;
    }

    public static xp valueOf(String str) {
        return (xp) Enum.valueOf(xp.class, str);
    }

    public static xp[] values() {
        return (xp[]) f.clone();
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
