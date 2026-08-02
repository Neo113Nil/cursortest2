package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pe4 {
    public static final pe4 a;
    public static final pe4 b;
    public static final pe4 c;
    public static final pe4 d;
    public static final /* synthetic */ pe4[] e;

    static {
        pe4 pe4Var = new pe4("MEMORY_CACHE", 0);
        a = pe4Var;
        pe4 pe4Var2 = new pe4("MEMORY", 1);
        b = pe4Var2;
        pe4 pe4Var3 = new pe4("DISK", 2);
        c = pe4Var3;
        pe4 pe4Var4 = new pe4("NETWORK", 3);
        d = pe4Var4;
        e = new pe4[]{pe4Var, pe4Var2, pe4Var3, pe4Var4};
    }

    public static pe4 valueOf(String str) {
        return (pe4) Enum.valueOf(pe4.class, str);
    }

    public static pe4[] values() {
        return (pe4[]) e.clone();
    }
}
