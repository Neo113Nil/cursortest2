package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uj7 {
    public static final uj7 a;
    public static final uj7 b;
    public static final uj7 c;
    public static final /* synthetic */ uj7[] d;

    static {
        uj7 uj7Var = new uj7("LOADING", 0);
        a = uj7Var;
        uj7 uj7Var2 = new uj7("ERROR", 1);
        b = uj7Var2;
        uj7 uj7Var3 = new uj7("READY", 2);
        c = uj7Var3;
        d = new uj7[]{uj7Var, uj7Var2, uj7Var3};
    }

    public static uj7 valueOf(String str) {
        return (uj7) Enum.valueOf(uj7.class, str);
    }

    public static uj7[] values() {
        return (uj7[]) d.clone();
    }
}
