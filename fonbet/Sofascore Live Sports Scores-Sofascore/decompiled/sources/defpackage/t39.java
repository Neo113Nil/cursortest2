package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t39 {
    public static final t39 a;
    public static final t39 b;
    public static final /* synthetic */ t39[] c;

    static {
        t39 t39Var = new t39("NORMAL", 0);
        a = t39Var;
        t39 t39Var2 = new t39("SMALL", 1);
        b = t39Var2;
        c = new t39[]{t39Var, t39Var2};
    }

    public static t39 valueOf(String str) {
        return (t39) Enum.valueOf(t39.class, str);
    }

    public static t39[] values() {
        return (t39[]) c.clone();
    }
}
