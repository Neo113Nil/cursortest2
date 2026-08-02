package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f2577a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ w0[] f2578b;

    static {
        w0 w0Var = new w0("ALLOW", 0);
        f2577a = w0Var;
        f2578b = new w0[]{w0Var, new w0("PREVENT_WHEN_EMPTY", 1), new w0("PREVENT", 2)};
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) f2578b.clone();
    }
}
