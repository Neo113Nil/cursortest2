package gh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: b, reason: collision with root package name */
    public static final o f10307b;

    /* renamed from: c, reason: collision with root package name */
    public static final t0 f10308c;

    /* renamed from: d, reason: collision with root package name */
    public static final t0 f10309d;

    /* renamed from: e, reason: collision with root package name */
    public static final t0 f10310e;

    /* renamed from: f, reason: collision with root package name */
    public static final t0 f10311f;

    /* renamed from: g, reason: collision with root package name */
    public static final t0 f10312g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ t0[] f10313h;

    /* renamed from: a, reason: collision with root package name */
    public final String f10314a;

    static {
        t0 t0Var = new t0("TLS_1_3", 0, "TLSv1.3");
        f10308c = t0Var;
        t0 t0Var2 = new t0("TLS_1_2", 1, "TLSv1.2");
        f10309d = t0Var2;
        t0 t0Var3 = new t0("TLS_1_1", 2, "TLSv1.1");
        f10310e = t0Var3;
        t0 t0Var4 = new t0("TLS_1_0", 3, "TLSv1");
        f10311f = t0Var4;
        t0 t0Var5 = new t0("SSL_3_0", 4, "SSLv3");
        f10312g = t0Var5;
        t0[] t0VarArr = {t0Var, t0Var2, t0Var3, t0Var4, t0Var5};
        f10313h = t0VarArr;
        com.google.android.play.core.appupdate.b.l(t0VarArr);
        f10307b = new o();
    }

    public t0(String str, int i5, String str2) {
        this.f10314a = str2;
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) f10313h.clone();
    }
}
