package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class io3 {
    public static final io3 a;
    public static final io3 b;
    public static final /* synthetic */ io3[] c;

    static {
        io3 io3Var = new io3("VIEW_APPEAR", 0);
        a = io3Var;
        io3 io3Var2 = new io3("VIEW_DISAPPEAR", 1);
        b = io3Var2;
        c = new io3[]{io3Var, io3Var2};
    }

    public static io3 valueOf(String str) {
        return (io3) Enum.valueOf(io3.class, str);
    }

    public static io3[] values() {
        return (io3[]) c.clone();
    }
}
