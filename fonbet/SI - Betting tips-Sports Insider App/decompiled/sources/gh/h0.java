package gh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final o f10197b;

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f10198c;

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f10199d;

    /* renamed from: e, reason: collision with root package name */
    public static final h0 f10200e;

    /* renamed from: f, reason: collision with root package name */
    public static final h0 f10201f;

    /* renamed from: g, reason: collision with root package name */
    public static final h0 f10202g;

    /* renamed from: h, reason: collision with root package name */
    public static final h0 f10203h;

    /* renamed from: i, reason: collision with root package name */
    public static final h0 f10204i;
    public static final /* synthetic */ h0[] j;

    /* renamed from: a, reason: collision with root package name */
    public final String f10205a;

    static {
        h0 h0Var = new h0("HTTP_1_0", 0, "http/1.0");
        f10198c = h0Var;
        h0 h0Var2 = new h0("HTTP_1_1", 1, "http/1.1");
        f10199d = h0Var2;
        h0 h0Var3 = new h0("SPDY_3", 2, "spdy/3.1");
        f10200e = h0Var3;
        h0 h0Var4 = new h0("HTTP_2", 3, "h2");
        f10201f = h0Var4;
        h0 h0Var5 = new h0("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        f10202g = h0Var5;
        h0 h0Var6 = new h0("QUIC", 5, "quic");
        f10203h = h0Var6;
        h0 h0Var7 = new h0("HTTP_3", 6, "h3");
        f10204i = h0Var7;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7};
        j = h0VarArr;
        com.google.android.play.core.appupdate.b.l(h0VarArr);
        f10197b = new o();
    }

    public h0(String str, int i5, String str2) {
        this.f10205a = str2;
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) j.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f10205a;
    }
}
