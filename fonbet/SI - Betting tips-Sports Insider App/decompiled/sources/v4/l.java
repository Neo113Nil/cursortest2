package v4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ l[] f24426a;

    static {
        l[] lVarArr = {new l("Verbose", 0), new l("Debug", 1), new l("Info", 2), new l("Warn", 3), new l("Error", 4)};
        f24426a = lVarArr;
        com.google.android.play.core.appupdate.b.l(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f24426a.clone();
    }
}
