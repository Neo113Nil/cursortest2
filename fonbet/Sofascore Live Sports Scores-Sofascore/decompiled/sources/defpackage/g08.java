package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g08 {
    public static final ug5 c;
    public static final g08 d;
    public static final g08 e;
    public static final g08 f;
    public static final /* synthetic */ g08[] g;
    public static final /* synthetic */ kp5 h;
    public final String a;
    public final int b;

    static {
        g08 g08Var = new g08("MAIN_CARD", 0, "maincard", R.string.main_card);
        d = g08Var;
        g08 g08Var2 = new g08("PRELIM", 1, "prelims", R.string.prelim);
        e = g08Var2;
        g08 g08Var3 = new g08("EARLY_PRELIM", 2, "earlyprelims", R.string.prelim);
        f = g08Var3;
        g08[] g08VarArr = {g08Var, g08Var2, g08Var3};
        g = g08VarArr;
        h = new kp5(g08VarArr);
        c = new ug5();
    }

    public g08(String str, int i, String str2, int i2) {
        this.a = str2;
        this.b = i2;
    }

    public static g08 valueOf(String str) {
        return (g08) Enum.valueOf(g08.class, str);
    }

    public static g08[] values() {
        return (g08[]) g.clone();
    }
}
