package e3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j0[] f8533a;

    static {
        j0[] j0VarArr = {new j0("NOT_APPLIED", 0), new j0("APPLIED_IMMEDIATELY", 1), new j0("APPLIED_FOR_NEXT_RUN", 2)};
        f8533a = j0VarArr;
        com.google.android.play.core.appupdate.b.l(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f8533a.clone();
    }
}
