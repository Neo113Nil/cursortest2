package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ev1 {
    public static final ev1 b;
    public static final ev1 c;
    public static final /* synthetic */ ev1[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;

    static {
        ev1 ev1Var = new ev1("BET_BOOST", 0, R.string.bet_boost);
        b = ev1Var;
        ev1 ev1Var2 = new ev1("DROPPING_ODDS", 1, R.string.dropping_odds);
        ev1 ev1Var3 = new ev1("TRENDING_ODDS", 2, R.string.trending_odds);
        ev1 ev1Var4 = new ev1("HIGH_VALUE_STREAKS", 3, R.string.high_value_streaks);
        c = ev1Var4;
        ev1[] ev1VarArr = {ev1Var, ev1Var2, ev1Var3, ev1Var4, new ev1("TOP_H2H", 4, R.string.top_h2h), new ev1("TOP_TEAM_STREAKS", 5, R.string.top_team_streaks)};
        d = ev1VarArr;
        e = new kp5(ev1VarArr);
    }

    public ev1(String str, int i, int i2) {
        this.a = i2;
    }

    public static ev1 valueOf(String str) {
        return (ev1) Enum.valueOf(ev1.class, str);
    }

    public static ev1[] values() {
        return (ev1[]) d.clone();
    }
}
