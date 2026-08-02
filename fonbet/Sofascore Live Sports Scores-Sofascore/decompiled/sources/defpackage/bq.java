package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bq implements e1 {
    public static final /* synthetic */ bq[] g;
    public static final /* synthetic */ kp5 h;
    public final int a;
    public final int b;
    public final boolean c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;

    static {
        bq[] bqVarArr = {new bq(0, R.string.am_football_lineups_receptions, R.string.legend_am_foot_receptions, "RECEPTIONS", new yp(4), new yp(6), new yp(14), false), new bq(1, R.string.am_football_lineups_targets, R.string.legend_am_foot_targets, "TARGETS", new yp(16), new yp(17), new yp(18), true), new bq(2, R.string.am_football_lineups_yards, R.string.legend_am_foot_receiving_yards, "YARDS", new yp(19), new yp(20), new yp(21), false), new bq(3, R.string.am_football_lineups_touchdowns, R.string.legend_am_foot_receiving_tdowns, "TOUCHDOWNS", new yp(22), new yp(15), new yp(23), false), new bq(4, R.string.am_football_lineups_average, R.string.legend_am_foot_receiving_avg_yards_rcptn, "AVERAGE", new yp(24), new yp(25), new yp(26), false), new bq(5, R.string.am_football_longest_reception_short, R.string.legend_am_foot_receiving_longest_reception, "LONGEST", new yp(27), new yp(28), new yp(29), false), new bq(6, R.string.am_football_drop_reception_short, R.string.legend_am_foot_dropped_passes, "DROPPED_PASSES", new aq(0), new yp(5), new yp(7), false), new bq(7, R.string.am_football_rz_targets_short, R.string.legend_am_foot_red_zone_targets, "RZ_TARGETS", new yp(8), new yp(9), new yp(10), false), new bq(8, R.string.am_football_yds_after_catch_short, R.string.legend_am_foot_yards_after_catch, "YDS_AFTER_CONTACT", new yp(11), new yp(12), new yp(13), false)};
        g = bqVarArr;
        h = new kp5(bqVarArr);
    }

    public bq(int i, int i2, int i3, String str, Function1 function1, Function1 function12, Function1 function13, boolean z) {
        this.a = i2;
        this.b = i3;
        this.c = z;
        this.d = function1;
        this.e = function12;
        this.f = function13;
    }

    public static bq valueOf(String str) {
        return (bq) Enum.valueOf(bq.class, str);
    }

    public static bq[] values() {
        return (bq[]) g.clone();
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
        return this.c;
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
        return this.f;
    }
}
