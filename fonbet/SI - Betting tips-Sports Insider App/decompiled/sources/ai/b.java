package ai;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f188a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f189b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f190c;

    static {
        b bVar = new b("Singleton", 0);
        f188a = bVar;
        b bVar2 = new b("Factory", 1);
        f189b = bVar2;
        b[] bVarArr = {bVar, bVar2, new b("Scoped", 2)};
        f190c = bVarArr;
        com.google.android.play.core.appupdate.b.l(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f190c.clone();
    }
}
