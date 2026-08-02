package ic;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f11115a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f0[] f11116b;

    static {
        f0 f0Var = new f0("Default", 0);
        f0 f0Var2 = new f0("Support", 1);
        f11115a = f0Var2;
        f0[] f0VarArr = {f0Var, f0Var2};
        f11116b = f0VarArr;
        com.google.android.play.core.appupdate.b.l(f0VarArr);
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f11116b.clone();
    }
}
