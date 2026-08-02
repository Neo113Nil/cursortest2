package e3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8471a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f8472b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f8473c;

    static {
        a aVar = new a("EXPONENTIAL", 0);
        f8471a = aVar;
        a aVar2 = new a("LINEAR", 1);
        f8472b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f8473c = aVarArr;
        com.google.android.play.core.appupdate.b.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f8473c.clone();
    }
}
