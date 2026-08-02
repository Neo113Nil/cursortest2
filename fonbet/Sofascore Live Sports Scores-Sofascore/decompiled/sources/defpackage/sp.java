package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sp implements e1 {
    public static final /* synthetic */ sp[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;

    static {
        sp[] spVarArr = {new sp("NUMBER", 0, R.string.am_football_lineups_number, R.string.legend_am_foot_kick_returns_total, new op(19), new rp(6), new op(20)), new sp("YARDS", 1, R.string.am_football_lineups_yards, R.string.legend_am_foot_kick_returns_returned_yards, new op(21), new op(22), new op(23)), new sp("AVERAGE", 2, R.string.am_football_lineups_average, R.string.legend_am_foot_kick_returns_rtrnd_avg_yards, new op(24), new op(25), new op(26)), new sp("TOUCHDOWNS", 3, R.string.am_football_lineups_touchdowns, R.string.legend_am_foot_kick_return_touchdowns, new op(27), new op(28), new op(29)), new sp("LONGEST", 4, R.string.am_football_longest_kick_return_short, R.string.legend_am_foot_kick_returns_longest_return, new rp(0), new rp(1), new rp(2)), new sp("FAIR_CATCHES", 5, R.string.am_football_fair_catch_kick_short, R.string.legend_am_foot_kickoff_fair_catches, new rp(3), new rp(4), new rp(5))};
        f = spVarArr;
        g = new kp5(spVarArr);
    }

    public sp(String str, int i, int i2, int i3, Function1 function1, Function1 function12, Function1 function13) {
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.d = function12;
        this.e = function13;
    }

    public static sp valueOf(String str) {
        return (sp) Enum.valueOf(sp.class, str);
    }

    public static sp[] values() {
        return (sp[]) f.clone();
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
