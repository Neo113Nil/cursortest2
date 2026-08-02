package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lp6 {
    public static final lp6 a;
    public static final lp6 b;
    public static final lp6 c;
    public static final /* synthetic */ lp6[] d;

    static {
        lp6 lp6Var = new lp6("ComingSoon", 0);
        a = lp6Var;
        lp6 lp6Var2 = new lp6("New", 1);
        b = lp6Var2;
        lp6 lp6Var3 = new lp6("Default", 2);
        c = lp6Var3;
        d = new lp6[]{lp6Var, lp6Var2, lp6Var3};
    }

    public static lp6 valueOf(String str) {
        return (lp6) Enum.valueOf(lp6.class, str);
    }

    public static lp6[] values() {
        return (lp6[]) d.clone();
    }
}
