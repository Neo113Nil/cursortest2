package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u70 {
    public static final u70 a;
    public static final u70 b;
    public static final /* synthetic */ u70[] c;

    static {
        u70 u70Var = new u70("BoundReached", 0);
        a = u70Var;
        u70 u70Var2 = new u70("Finished", 1);
        b = u70Var2;
        c = new u70[]{u70Var, u70Var2};
    }

    public static u70 valueOf(String str) {
        return (u70) Enum.valueOf(u70.class, str);
    }

    public static u70[] values() {
        return (u70[]) c.clone();
    }
}
