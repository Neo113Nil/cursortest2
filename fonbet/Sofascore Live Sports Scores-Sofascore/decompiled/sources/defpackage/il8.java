package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class il8 {
    public static final il8 f;
    public static final il8 g;
    public static final il8 h;
    public static final il8 i;
    public static final /* synthetic */ il8[] j;
    public static final /* synthetic */ kp5 k;
    public final int a;
    public final int b;
    public final int c;
    public final Function1 d;
    public final Function1 e;

    static {
        il8 il8Var = new il8("GAMEWEEK", 0, R.string.fantasy_lineup_view_round_status_title, R.string.fantasy_lineup_view_round_status_text, R.drawable.ic_score, new hl8(0));
        f = il8Var;
        il8 il8Var2 = new il8("FIXTURE", 1, R.string.fixtures, R.string.fantasy_lineup_view_fixtures_text, R.drawable.ic_matches, new hl8(1));
        g = il8Var2;
        il8 il8Var3 = new il8("PRICE", 2, R.string.player_price, R.string.fantasy_lineup_view_price_text, R.drawable.ic_dollar, new hl8(2), new hl8(3));
        h = il8Var3;
        il8 il8Var4 = new il8("AVERAGE_POINTS", 3, R.string.average_points_short, R.string.fantasy_lineup_view_avg_pts_text, R.drawable.ic_show_chart, new hl8(4), new hl8(5));
        il8 il8Var5 = new il8("EXPECTED_POINTS", 4, R.string.fantasy_lineup_view_expected_fantasy_points_title, R.string.fantasy_lineup_view_expected_fantasy_points_text, R.drawable.ic_predictions_menu, new hl8(6), new hl8(7));
        i = il8Var5;
        il8[] il8VarArr = {il8Var, il8Var2, il8Var3, il8Var4, il8Var5, new il8("UPCOMING_FIXTURE_TIME", 5, R.string.fantasy_lineup_view_match_time_title, R.string.fantasy_lineup_view_match_time_text, R.drawable.ic_access_time, new hl8(8))};
        j = il8VarArr;
        k = new kp5(il8VarArr);
    }

    public /* synthetic */ il8(String str, int i2, int i3, int i4, int i5, Function1 function1) {
        this(str, i2, i3, i4, i5, new hl8(9), function1);
    }

    public static il8 valueOf(String str) {
        return (il8) Enum.valueOf(il8.class, str);
    }

    public static il8[] values() {
        return (il8[]) j.clone();
    }

    public il8(String str, int i2, int i3, int i4, int i5, Function1 function1, Function1 function12) {
        this.a = i3;
        this.b = i4;
        this.c = i5;
        this.d = function1;
        this.e = function12;
    }
}
