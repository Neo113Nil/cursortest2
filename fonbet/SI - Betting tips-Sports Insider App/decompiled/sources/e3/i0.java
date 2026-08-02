package e3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f8524a;

    /* renamed from: b, reason: collision with root package name */
    public static final i0 f8525b;

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f8526c;

    /* renamed from: d, reason: collision with root package name */
    public static final i0 f8527d;

    /* renamed from: e, reason: collision with root package name */
    public static final i0 f8528e;

    /* renamed from: f, reason: collision with root package name */
    public static final i0 f8529f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ i0[] f8530g;

    static {
        i0 i0Var = new i0("ENQUEUED", 0);
        f8524a = i0Var;
        i0 i0Var2 = new i0("RUNNING", 1);
        f8525b = i0Var2;
        i0 i0Var3 = new i0("SUCCEEDED", 2);
        f8526c = i0Var3;
        i0 i0Var4 = new i0("FAILED", 3);
        f8527d = i0Var4;
        i0 i0Var5 = new i0("BLOCKED", 4);
        f8528e = i0Var5;
        i0 i0Var6 = new i0("CANCELLED", 5);
        f8529f = i0Var6;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4, i0Var5, i0Var6};
        f8530g = i0VarArr;
        com.google.android.play.core.appupdate.b.l(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f8530g.clone();
    }

    public final boolean a() {
        return this == f8526c || this == f8527d || this == f8529f;
    }
}
