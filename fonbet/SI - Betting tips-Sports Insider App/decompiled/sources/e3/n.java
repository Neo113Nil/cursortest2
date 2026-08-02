package e3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ n[] f8548a;

    static {
        n[] nVarArr = {new n("REPLACE", 0), new n("KEEP", 1), new n("UPDATE", 2), new n("CANCEL_AND_REENQUEUE", 3)};
        f8548a = nVarArr;
        com.google.android.play.core.appupdate.b.l(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f8548a.clone();
    }
}
