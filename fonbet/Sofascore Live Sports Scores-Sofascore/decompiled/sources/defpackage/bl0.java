package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bl0 {
    public static final bl0 a;
    public static final bl0 b;
    public static final /* synthetic */ bl0[] c;

    static {
        bl0 bl0Var = new bl0("AUTOMATIC", 0);
        a = bl0Var;
        bl0 bl0Var2 = new bl0("ENABLED", 1);
        b = bl0Var2;
        c = new bl0[]{bl0Var, bl0Var2, new bl0("DISABLED", 2)};
    }

    public static bl0 valueOf(String str) {
        return (bl0) Enum.valueOf(bl0.class, str);
    }

    public static bl0[] values() {
        return (bl0[]) c.clone();
    }
}
