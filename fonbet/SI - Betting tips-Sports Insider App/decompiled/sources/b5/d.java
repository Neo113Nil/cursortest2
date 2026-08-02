package b5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3026a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f3027b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f3028c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f3029d;

    static {
        d dVar = new d("DEFAULT", 0);
        f3026a = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f3027b = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f3028c = dVar3;
        f3029d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3029d.clone();
    }
}
