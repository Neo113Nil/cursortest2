package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q14 {
    public static final q14 a;
    public static final q14 b;
    public static final /* synthetic */ q14[] c;

    static {
        q14 q14Var = new q14("BASIC", 0);
        a = q14Var;
        q14 q14Var2 = new q14("DETAILED", 1);
        b = q14Var2;
        c = new q14[]{q14Var, q14Var2};
    }

    public static q14 valueOf(String str) {
        return (q14) Enum.valueOf(q14.class, str);
    }

    public static q14[] values() {
        return (q14[]) c.clone();
    }
}
