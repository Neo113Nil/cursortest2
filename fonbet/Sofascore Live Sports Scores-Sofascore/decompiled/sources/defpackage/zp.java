package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zp implements e1 {
    public static final /* synthetic */ zp[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final int b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;

    static {
        zp[] zpVarArr = {new zp("NUMBER", 0, R.string.am_football_lineups_number, R.string.legend_am_foot_punts, new wp(13), new wp(15), new wp(17)), new zp("YARDS", 1, R.string.am_football_lineups_yards, R.string.legend_am_foot_total_punt_yardage, new wp(18), new wp(19), new wp(20)), new zp("AVERAGE", 2, R.string.am_football_lineups_average, R.string.legend_am_foot_yards_per_punt, new wp(21), new wp(22), new wp(23)), new zp("INSIDE_20", 3, R.string.am_football_punts_inside_20_short, R.string.legend_am_foot_punts_inside_twenty, new wp(25), new wp(24), new wp(26)), new zp("LONGEST", 4, R.string.am_football_longest_punt_short, R.string.legend_am_foot_longest_punt, new wp(27), new wp(28), new wp(29)), new zp("AVERAGE_HANG_TIME", 5, R.string.am_football_avg_hang_time_short, R.string.legend_am_foot_avg_hang_time, new yp(0), new yp(1), new yp(2)), new zp("HANG_TIME", 6, R.string.am_football_hang_time_short, R.string.legend_am_foot_hang_time, new yp(3), new wp(14), new wp(16))};
        f = zpVarArr;
        g = new kp5(zpVarArr);
    }

    public zp(String str, int i, int i2, int i3, Function1 function1, Function1 function12, Function1 function13) {
        this.a = i2;
        this.b = i3;
        this.c = function1;
        this.d = function12;
        this.e = function13;
    }

    public static zp valueOf(String str) {
        return (zp) Enum.valueOf(zp.class, str);
    }

    public static zp[] values() {
        return (zp[]) f.clone();
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
