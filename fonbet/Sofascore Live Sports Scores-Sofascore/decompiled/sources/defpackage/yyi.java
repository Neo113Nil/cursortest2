package defpackage;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yyi {
    public static final e2f c;
    public static final yyi d;
    public static final yyi e;
    public static final yyi f;
    public static final /* synthetic */ yyi[] g;
    public static final /* synthetic */ kp5 h;
    public final String a;
    public final int b;

    static {
        yyi yyiVar = new yyi("All", 0, Season.YEAR_ALL_TIME, R.string.all);
        d = yyiVar;
        yyi yyiVar2 = new yyi("Singles", 1, "singles", R.string.tennis_singles);
        e = yyiVar2;
        yyi yyiVar3 = new yyi("Doubles", 2, "doubles", R.string.tennis_doubles);
        f = yyiVar3;
        yyi[] yyiVarArr = {yyiVar, yyiVar2, yyiVar3};
        g = yyiVarArr;
        h = new kp5(yyiVarArr);
        c = new e2f(4);
    }

    public yyi(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static yyi valueOf(String str) {
        return (yyi) Enum.valueOf(yyi.class, str);
    }

    public static yyi[] values() {
        return (yyi[]) g.clone();
    }
}
