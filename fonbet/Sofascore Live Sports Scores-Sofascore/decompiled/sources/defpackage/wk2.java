package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wk2 {
    public static final inb f;
    public static final wk2 g;
    public static final wk2 h;
    public static final wk2 i;
    public static final wk2 j;
    public static final /* synthetic */ wk2[] k;
    public static final /* synthetic */ kp5 l;
    public final String a;
    public final int b;
    public final int c;
    public final xk2 d;
    public final Function1 e;

    static {
        wk2 wk2Var = new wk2("ALL_COMPETITIONS", 0, "", 0, R.string.all_competitions, xk2.a, new b42(4));
        g = wk2Var;
        xk2 xk2Var = xk2.b;
        wk2 wk2Var2 = new wk2("ALL_CLUBS", 1, "", 0, R.string.football_all_club_competitions, xk2Var, new b42(5));
        h = wk2Var2;
        wk2 wk2Var3 = new wk2("DOMESTIC_LEAGUE", 2, "domestic-league", R.string.football_domestic_leagues, R.string.all_domestic_leagues, xk2Var, new b42(6));
        wk2 wk2Var4 = new wk2("DOMESTIC_CUP", 3, "domestic-cup", R.string.football_domestic_cups, R.string.all_domestic_cups, xk2Var, new b42(7));
        wk2 wk2Var5 = new wk2("INTERNATIONAL_COMPETITION", 4, "international-cup", R.string.football_international_competitions, R.string.all_international_competitions, xk2Var, new b42(8));
        i = wk2Var5;
        wk2 wk2Var6 = new wk2("ALL_NATIONAL", 5, "national", 0, R.string.all_national_team_competitions, xk2.c, new b42(9));
        j = wk2Var6;
        wk2[] wk2VarArr = {wk2Var, wk2Var2, wk2Var3, wk2Var4, wk2Var5, wk2Var6};
        k = wk2VarArr;
        l = new kp5(wk2VarArr);
        f = new inb(18);
    }

    public wk2(String str, int i2, String str2, int i3, int i4, xk2 xk2Var, Function1 function1) {
        this.a = str2;
        this.b = i3;
        this.c = i4;
        this.d = xk2Var;
        this.e = function1;
    }

    public static wk2 valueOf(String str) {
        return (wk2) Enum.valueOf(wk2.class, str);
    }

    public static wk2[] values() {
        return (wk2[]) k.clone();
    }
}
