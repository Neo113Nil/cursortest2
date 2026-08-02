package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k69 {
    public static final k69 a;
    public static final k69 b;
    public static final k69 c;
    public static final /* synthetic */ k69[] d;

    static {
        k69 k69Var = new k69("Cursor", 0);
        a = k69Var;
        k69 k69Var2 = new k69("SelectionStart", 1);
        b = k69Var2;
        k69 k69Var3 = new k69("SelectionEnd", 2);
        c = k69Var3;
        d = new k69[]{k69Var, k69Var2, k69Var3};
    }

    public static k69 valueOf(String str) {
        return (k69) Enum.valueOf(k69.class, str);
    }

    public static k69[] values() {
        return (k69[]) d.clone();
    }
}
