package te;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f23874a;

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f23875b;

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f23876c;

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f23877d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f0[] f23878e;

    static {
        f0 f0Var = new f0("Default", 0);
        f23874a = f0Var;
        f0 f0Var2 = new f0("WaitCopy", 1);
        f23875b = f0Var2;
        f0 f0Var3 = new f0("AddedFile", 2);
        f23876c = f0Var3;
        f0 f0Var4 = new f0("AddedImage", 3);
        f23877d = f0Var4;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4};
        f23878e = f0VarArr;
        com.google.android.play.core.appupdate.b.l(f0VarArr);
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f23878e.clone();
    }
}
