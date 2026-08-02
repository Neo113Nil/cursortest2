package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vp implements e1 {
    public static final /* synthetic */ vp[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final int b;
    public final boolean c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;

    static {
        vp[] vpVarArr = {new vp(0, R.string.am_football_lineups_completions, R.string.legend_am_football_completions_attempts, "COMPLETIONS", new rp(28), new up(0), new up(8), true), new vp(1, R.string.am_football_lineups_yards, R.string.legend_am_foot_passing_yards, "YARDS", new up(10), new up(11), new up(12), false), new vp(2, R.string.am_football_lineups_touchdowns, R.string.legend_am_foot_passing_tdowns, "TOUCHDOWNS", new up(13), new up(14), new up(15), false), new vp(3, R.string.am_football_lineups_interceptions, R.string.legend_am_foot_passing_interceptions, "INTERCEPTIONS", new up(16), new up(9), new up(17), false), new vp(4, R.string.am_football_lineups_average, R.string.legend_am_foot_passingavg_yards_attempt, "AVERAGE", new up(18), new up(19), new up(20), false), new vp(5, R.string.am_football_passer_rating_short, R.string.legend_am_foot_pass_rating, "PASSER_RATING", new up(21), new up(22), new up(23), false), new vp(6, R.string.am_football_air_yds_short, R.string.legend_am_foot_air_yards, "AIR_YARDS", new up(24), new rp(29), new up(1), false), new vp(7, R.string.am_football_drop_pass_short, R.string.legend_am_foot_passes_dropped, "DROPPED_PASSES", new up(2), new up(3), new up(4), false), new vp(8, R.string.am_football_passing_first_downs_short, R.string.legend_am_foot_passing_first_downs, "FIRST_DOWNS", new up(5), new up(6), new up(7), false)};
        g = vpVarArr;
        h = new kp5(vpVarArr);
    }

    public vp(int i, int i2, int i3, String str, Function1 function1, Function1 function12, Function1 function13, boolean z) {
        this.a = i2;
        this.b = i3;
        this.c = z;
        this.d = function1;
        this.e = function12;
        this.f = function13;
    }

    public static vp valueOf(String str) {
        return (vp) Enum.valueOf(vp.class, str);
    }

    public static vp[] values() {
        return (vp[]) g.clone();
    }

    @Override // defpackage.e1
    public final Function1 d() {
        return this.d;
    }

    @Override // defpackage.e1
    public final int g() {
        return this.a;
    }

    @Override // defpackage.e1
    public final Function1 h() {
        return this.e;
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
        return this.c;
    }

    @Override // defpackage.e1
    public final int l() {
        return this.b;
    }

    @Override // defpackage.e1
    public final Function1 m() {
        return this.f;
    }
}
