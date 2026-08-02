package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zy0 {
    public static final zy0 a;
    public static final zy0 b;
    public static final /* synthetic */ zy0[] c;

    static {
        zy0 zy0Var = new zy0("EXPONENTIAL", 0);
        a = zy0Var;
        zy0 zy0Var2 = new zy0("LINEAR", 1);
        b = zy0Var2;
        c = new zy0[]{zy0Var, zy0Var2};
    }

    public static zy0 valueOf(String str) {
        return (zy0) Enum.valueOf(zy0.class, str);
    }

    public static zy0[] values() {
        return (zy0[]) c.clone();
    }
}
