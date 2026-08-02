package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ia5 {
    public static final ia5 a;
    public static final ia5 b;
    public static final ia5 c;
    public static final /* synthetic */ ia5[] d;

    static {
        ia5 ia5Var = new ia5("START", 0);
        a = ia5Var;
        ia5 ia5Var2 = new ia5("TOP", 1);
        b = ia5Var2;
        ia5 ia5Var3 = new ia5("END", 2);
        c = ia5Var3;
        d = new ia5[]{ia5Var, ia5Var2, ia5Var3, new ia5("BOTTOM", 3)};
    }

    public static ia5 valueOf(String str) {
        return (ia5) Enum.valueOf(ia5.class, str);
    }

    public static ia5[] values() {
        return (ia5[]) d.clone();
    }
}
