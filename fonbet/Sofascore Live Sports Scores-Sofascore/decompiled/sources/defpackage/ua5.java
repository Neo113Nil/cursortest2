package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ua5 {
    public static final ua5 a;
    public static final ua5 b;
    public static final /* synthetic */ ua5[] c;

    static {
        ua5 ua5Var = new ua5("START", 0);
        a = ua5Var;
        ua5 ua5Var2 = new ua5("TOP", 1);
        ua5 ua5Var3 = new ua5("END", 2);
        b = ua5Var3;
        c = new ua5[]{ua5Var, ua5Var2, ua5Var3, new ua5("BOTTOM", 3)};
    }

    public static ua5 valueOf(String str) {
        return (ua5) Enum.valueOf(ua5.class, str);
    }

    public static ua5[] values() {
        return (ua5[]) c.clone();
    }
}
