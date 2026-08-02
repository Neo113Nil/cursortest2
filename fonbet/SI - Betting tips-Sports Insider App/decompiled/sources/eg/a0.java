package eg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f9136a;

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f9137b;

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f9138c;

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f9139d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a0[] f9140e;

    static {
        a0 a0Var = new a0("DEFAULT", 0);
        f9136a = a0Var;
        a0 a0Var2 = new a0("LAZY", 1);
        f9137b = a0Var2;
        a0 a0Var3 = new a0("ATOMIC", 2);
        f9138c = a0Var3;
        a0 a0Var4 = new a0("UNDISPATCHED", 3);
        f9139d = a0Var4;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4};
        f9140e = a0VarArr;
        com.google.android.play.core.appupdate.b.l(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f9140e.clone();
    }
}
