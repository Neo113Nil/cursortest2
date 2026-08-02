package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q44 {
    public static final q44 a;
    public static final q44 b;
    public static final /* synthetic */ q44[] c;

    static {
        q44 q44Var = new q44("Form", 0);
        a = q44Var;
        q44 q44Var2 = new q44("Search", 1);
        b = q44Var2;
        c = new q44[]{q44Var, q44Var2};
    }

    public static q44 valueOf(String str) {
        return (q44) Enum.valueOf(q44.class, str);
    }

    public static q44[] values() {
        return (q44[]) c.clone();
    }
}
