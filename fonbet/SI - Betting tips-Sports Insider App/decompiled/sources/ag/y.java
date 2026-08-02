package ag;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ y[] f179a;

    static {
        y[] yVarArr = {new y("INVARIANT", 0), new y("IN", 1), new y("OUT", 2)};
        f179a = yVarArr;
        com.google.android.play.core.appupdate.b.l(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f179a.clone();
    }
}
