package androidx.fragment.app;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final g2 f1925a;

    /* renamed from: b, reason: collision with root package name */
    public static final g2 f1926b;

    /* renamed from: c, reason: collision with root package name */
    public static final g2 f1927c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g2[] f1928d;

    static {
        g2 g2Var = new g2("NONE", 0);
        f1925a = g2Var;
        g2 g2Var2 = new g2("ADDING", 1);
        f1926b = g2Var2;
        g2 g2Var3 = new g2("REMOVING", 2);
        f1927c = g2Var3;
        f1928d = new g2[]{g2Var, g2Var2, g2Var3};
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) f1928d.clone();
    }
}
