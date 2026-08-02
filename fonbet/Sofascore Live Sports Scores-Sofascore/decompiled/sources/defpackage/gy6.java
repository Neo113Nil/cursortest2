package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gy6 {
    public static final gy6 a;
    public static final gy6 b;
    public static final /* synthetic */ gy6[] c;

    static {
        gy6 gy6Var = new gy6("FIXTURES", 0);
        a = gy6Var;
        gy6 gy6Var2 = new gy6("FDR", 1);
        b = gy6Var2;
        c = new gy6[]{gy6Var, gy6Var2};
    }

    public static gy6 valueOf(String str) {
        return (gy6) Enum.valueOf(gy6.class, str);
    }

    public static gy6[] values() {
        return (gy6[]) c.clone();
    }
}
