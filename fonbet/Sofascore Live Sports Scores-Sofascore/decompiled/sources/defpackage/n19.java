package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n19 {
    public static final n19 a;
    public static final n19 b;
    public static final /* synthetic */ n19[] c;

    static {
        n19 n19Var = new n19("GOOGLE_BUTTON", 0);
        a = n19Var;
        n19 n19Var2 = new n19("ONE_TAP", 1);
        b = n19Var2;
        c = new n19[]{n19Var, n19Var2};
    }

    public static n19 valueOf(String str) {
        return (n19) Enum.valueOf(n19.class, str);
    }

    public static n19[] values() {
        return (n19[]) c.clone();
    }
}
