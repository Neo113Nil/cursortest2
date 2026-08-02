package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rd6 {
    public static final rd6 c;
    public static final rd6 d;
    public static final rd6 e;
    public static final rd6 f;
    public static final rd6 g;
    public static final rd6 h;
    public static final rd6 i;
    public static final rd6 j;
    public static final rd6 k;
    public static final rd6 l;
    public static final rd6 m;
    public static final rd6 n;
    public static final rd6 o;
    public static final rd6 p;
    public static final rd6 q;
    public static final rd6 r;
    public static final rd6 s;
    public static final /* synthetic */ rd6[] t;
    public static final /* synthetic */ kp5 u;
    public final int a;
    public final Function1 b;

    static {
        rd6 rd6Var = new rd6("DETAILS", 0, R.string.details, fd6.b);
        c = rd6Var;
        rd6 rd6Var2 = new rd6("AI_INSIGHTS", 1, R.string.tab_ai_insights, jd6.b);
        d = rd6Var2;
        rd6 rd6Var3 = new rd6("CROWDSOURCING", 2, R.string.contribute, kd6.b);
        e = rd6Var3;
        rd6 rd6Var4 = new rd6("ADDITIONAL_ODDS", 3, R.string.odds, ld6.b);
        f = rd6Var4;
        rd6 rd6Var5 = new rd6("ADDITIONAL_ODDS_COMPARISON", 4, R.string.odds, md6.b);
        g = rd6Var5;
        rd6 rd6Var6 = new rd6("COMMENTARY", 5, R.string.commentary, nd6.b);
        h = rd6Var6;
        rd6 rd6Var7 = new rd6("OVERS", 6, R.string.overs, od6.b);
        rd6 rd6Var8 = new rd6("SCORECARD", 7, R.string.scorecard, pd6.b);
        rd6 rd6Var9 = new rd6("GAMES", 8, R.string.e_sport_games, qd6.b);
        i = rd6Var9;
        rd6 rd6Var10 = new rd6("LINEUPS", 9, R.string.lineups, vc6.b);
        j = rd6Var10;
        rd6 rd6Var11 = new rd6("PREMATCH_LINEUPS", 10, R.string.lineups, wc6.b);
        k = rd6Var11;
        rd6 rd6Var12 = new rd6("BASEBALL_PREMATCH_LINEUPS", 11, R.string.lineups, xc6.b);
        l = rd6Var12;
        rd6 rd6Var13 = new rd6("BOX_SCORE", 12, R.string.box_score, yc6.b);
        m = rd6Var13;
        rd6 rd6Var14 = new rd6("STATISTICS", 13, R.string.statistics, zc6.b);
        n = rd6Var14;
        rd6 rd6Var15 = new rd6("MMA_STATISTICS", 14, R.string.statistics, ad6.b);
        o = rd6Var15;
        rd6 rd6Var16 = new rd6("HOCKEY_PLAY_BY_PLAY", 15, R.string.hockey_play_by_play, bd6.b);
        rd6 rd6Var17 = new rd6("STANDINGS", 16, R.string.standings, cd6.b);
        p = rd6Var17;
        rd6 rd6Var18 = new rd6("GRAPHS", 17, R.string.graphs, dd6.b);
        rd6 rd6Var19 = new rd6("CUP_TREE", 18, R.string.competition_type_knockout, ed6.b);
        q = rd6Var19;
        rd6 rd6Var20 = new rd6("PREMATCH_ODDS", 19, R.string.featured_odds, gd6.b);
        r = rd6Var20;
        rd6 rd6Var21 = new rd6("MATCHES", 20, R.string.matches, hd6.b);
        rd6 rd6Var22 = new rd6("MEDIA", 21, R.string.media, id6.b);
        s = rd6Var22;
        rd6[] rd6VarArr = {rd6Var, rd6Var2, rd6Var3, rd6Var4, rd6Var5, rd6Var6, rd6Var7, rd6Var8, rd6Var9, rd6Var10, rd6Var11, rd6Var12, rd6Var13, rd6Var14, rd6Var15, rd6Var16, rd6Var17, rd6Var18, rd6Var19, rd6Var20, rd6Var21, rd6Var22};
        t = rd6VarArr;
        u = new kp5(rd6VarArr);
    }

    public rd6(String str, int i2, int i3, Function1 function1) {
        this.a = i3;
        this.b = function1;
    }

    public static rd6 valueOf(String str) {
        return (rd6) Enum.valueOf(rd6.class, str);
    }

    public static rd6[] values() {
        return (rd6[]) t.clone();
    }
}
