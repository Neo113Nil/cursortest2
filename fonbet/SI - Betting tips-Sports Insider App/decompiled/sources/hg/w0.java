package hg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f10789a;

    /* renamed from: b, reason: collision with root package name */
    public static final w0 f10790b;

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f10791c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w0[] f10792d;

    static {
        w0 w0Var = new w0("START", 0);
        f10789a = w0Var;
        w0 w0Var2 = new w0("STOP", 1);
        f10790b = w0Var2;
        w0 w0Var3 = new w0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f10791c = w0Var3;
        w0[] w0VarArr = {w0Var, w0Var2, w0Var3};
        f10792d = w0VarArr;
        com.google.android.play.core.appupdate.b.l(w0VarArr);
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) f10792d.clone();
    }
}
