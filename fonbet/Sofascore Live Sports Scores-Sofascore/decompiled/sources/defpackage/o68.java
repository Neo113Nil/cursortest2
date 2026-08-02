package defpackage;

import com.sofascore.results.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o68 {
    public static final hjg b;
    public static final o68 c;
    public static final o68 d;
    public static final o68 e;
    public static final o68 f;
    public static final o68 g;
    public static final /* synthetic */ o68[] h;
    public static final /* synthetic */ kp5 i;
    public final int a;

    static {
        o68 o68Var = new o68("VERY_EASY", 0, R.color.rating_80);
        c = o68Var;
        o68 o68Var2 = new o68("EASY", 1, R.color.rating_70);
        d = o68Var2;
        o68 o68Var3 = new o68("MEDIUM", 2, R.color.rating_65);
        e = o68Var3;
        o68 o68Var4 = new o68("HARD", 3, R.color.rating_60);
        f = o68Var4;
        o68 o68Var5 = new o68("VERY_HARD", 4, R.color.rating_10);
        g = o68Var5;
        o68[] o68VarArr = {o68Var, o68Var2, o68Var3, o68Var4, o68Var5};
        h = o68VarArr;
        i = new kp5(o68VarArr);
        b = new hjg();
    }

    public o68(String str, int i2, int i3) {
        this.a = i3;
    }

    public static o68 valueOf(String str) {
        return (o68) Enum.valueOf(o68.class, str);
    }

    public static o68[] values() {
        return (o68[]) h.clone();
    }
}
