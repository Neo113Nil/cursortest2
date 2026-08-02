package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class a62 {
    public static final a62 a;
    public static final a62 b;
    public static final a62 c;
    public static final /* synthetic */ a62[] d;

    static {
        a62 a62Var = new a62("SUSPEND", 0);
        a = a62Var;
        a62 a62Var2 = new a62("DROP_OLDEST", 1);
        b = a62Var2;
        a62 a62Var3 = new a62("DROP_LATEST", 2);
        c = a62Var3;
        d = new a62[]{a62Var, a62Var2, a62Var3};
    }

    public static a62 valueOf(String str) {
        return (a62) Enum.valueOf(a62.class, str);
    }

    public static a62[] values() {
        return (a62[]) d.clone();
    }
}
