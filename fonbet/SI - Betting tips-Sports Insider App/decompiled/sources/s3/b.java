package s3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b[] f22618a;

    static {
        b[] bVarArr = {new b("Time", 0), new b("Os", 1), new b("AppVersionCode", 2), new b("DeviceModel", 3), new b("TimeZone", 4), new b("AppVersionName", 5), new b("DeviceUID", 6), new b("DeviceUIDOld", 7)};
        f22618a = bVarArr;
        com.google.android.play.core.appupdate.b.l(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f22618a.clone();
    }
}
