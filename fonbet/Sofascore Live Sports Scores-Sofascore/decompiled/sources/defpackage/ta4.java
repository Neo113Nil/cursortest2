package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ta4 implements alf {
    public static final ta4 c;
    public static final ta4 d;
    public static final ta4 e;
    public static final ta4 f;
    public static final /* synthetic */ ta4[] g;
    public static final /* synthetic */ kp5 h;
    public final String a;
    public final int b;

    static {
        ta4 ta4Var = new ta4("TIME", 0, "time", R.string.general_classification_short);
        c = ta4Var;
        ta4 ta4Var2 = new ta4("SPRINT", 1, "sprint", R.string.cycling_sprint_standings);
        d = ta4Var2;
        ta4 ta4Var3 = new ta4("CLIMB", 2, "climb", R.string.cycling_climb_standings);
        e = ta4Var3;
        ta4 ta4Var4 = new ta4("YOUNG", 3, "young", R.string.cycling_young_standings);
        f = ta4Var4;
        ta4[] ta4VarArr = {ta4Var, ta4Var2, ta4Var3, ta4Var4};
        g = ta4VarArr;
        h = new kp5(ta4VarArr);
    }

    public ta4(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static ta4 valueOf(String str) {
        return (ta4) Enum.valueOf(ta4.class, str);
    }

    public static ta4[] values() {
        return (ta4[]) g.clone();
    }
}
