package d4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f8128a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f8129b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f8130c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f8131d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h[] f8132e;

    static {
        h hVar = new h("MEMORY_CACHE", 0);
        f8128a = hVar;
        h hVar2 = new h("MEMORY", 1);
        f8129b = hVar2;
        h hVar3 = new h("DISK", 2);
        f8130c = hVar3;
        h hVar4 = new h("NETWORK", 3);
        f8131d = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        f8132e = hVarArr;
        com.google.android.play.core.appupdate.b.l(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f8132e.clone();
    }
}
