package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l35 {
    public static final l35 a;
    public static final l35 b;
    public static final l35 c;
    public static final /* synthetic */ l35[] d;

    static {
        l35 l35Var = new l35("Vertical", 0);
        a = l35Var;
        l35 l35Var2 = new l35("Horizontal", 1);
        b = l35Var2;
        l35 l35Var3 = new l35("Both", 2);
        c = l35Var3;
        d = new l35[]{l35Var, l35Var2, l35Var3};
    }

    public static l35 valueOf(String str) {
        return (l35) Enum.valueOf(l35.class, str);
    }

    public static l35[] values() {
        return (l35[]) d.clone();
    }
}
