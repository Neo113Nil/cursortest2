package s3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d[] f22620a;

    static {
        d[] dVarArr = {new d("AppsflyerId", 0), new d("Metrics", 1), new d("PushesArr", 2), new d("Region", 3), new d("MetricDeviceId", 4)};
        f22620a = dVarArr;
        com.google.android.play.core.appupdate.b.l(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f22620a.clone();
    }
}
