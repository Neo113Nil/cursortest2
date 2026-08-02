package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ej9 {
    public static final ej9 a;
    public static final ej9 b;
    public static final ej9 c;
    public static final ej9 d;
    public static final /* synthetic */ ej9[] e;

    static {
        ej9 ej9Var = new ej9("NONE", 0);
        a = ej9Var;
        ej9 ej9Var2 = new ej9("BASIC", 1);
        b = ej9Var2;
        ej9 ej9Var3 = new ej9("HEADERS", 2);
        c = ej9Var3;
        ej9 ej9Var4 = new ej9("BODY", 3);
        d = ej9Var4;
        e = new ej9[]{ej9Var, ej9Var2, ej9Var3, ej9Var4};
    }

    public static ej9 valueOf(String str) {
        return (ej9) Enum.valueOf(ej9.class, str);
    }

    public static ej9[] values() {
        return (ej9[]) e.clone();
    }
}
