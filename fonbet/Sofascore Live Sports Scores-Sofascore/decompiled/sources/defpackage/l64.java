package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l64 {
    public static final l64 a;
    public static final l64 b;
    public static final /* synthetic */ l64[] c;

    static {
        l64 l64Var = new l64("SUGGESTING", 0);
        a = l64Var;
        l64 l64Var2 = new l64("RESULTS", 1);
        b = l64Var2;
        c = new l64[]{l64Var, l64Var2, new l64("UNKNOWN", 2)};
    }

    public static l64 valueOf(String str) {
        return (l64) Enum.valueOf(l64.class, str);
    }

    public static l64[] values() {
        return (l64[]) c.clone();
    }
}
