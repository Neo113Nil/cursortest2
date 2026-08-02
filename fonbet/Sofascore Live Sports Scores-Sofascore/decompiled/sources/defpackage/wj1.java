package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wj1 {
    public static final wj1 b;
    public static final wj1 c;
    public static final wj1 d;
    public static final /* synthetic */ wj1[] e;
    public static final /* synthetic */ kp5 f;
    public final int a;

    static {
        wj1 wj1Var = new wj1("Batting", 0, R.string.baseball_group_batting);
        b = wj1Var;
        wj1 wj1Var2 = new wj1("Pitching", 1, R.string.baseball_group_pitching);
        c = wj1Var2;
        wj1 wj1Var3 = new wj1("Fielding", 2, R.string.baseball_group_fielding);
        d = wj1Var3;
        wj1[] wj1VarArr = {wj1Var, wj1Var2, wj1Var3};
        e = wj1VarArr;
        f = new kp5(wj1VarArr);
    }

    public wj1(String str, int i, int i2) {
        this.a = i2;
    }

    public static wj1 valueOf(String str) {
        return (wj1) Enum.valueOf(wj1.class, str);
    }

    public static wj1[] values() {
        return (wj1[]) e.clone();
    }
}
