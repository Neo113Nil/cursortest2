package di;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8381a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f8382b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f8383c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f8384d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f8385e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f8386f;

    static {
        b bVar = new b("DEBUG", 0);
        f8381a = bVar;
        b bVar2 = new b("INFO", 1);
        f8382b = bVar2;
        b bVar3 = new b("WARNING", 2);
        f8383c = bVar3;
        b bVar4 = new b("ERROR", 3);
        f8384d = bVar4;
        b bVar5 = new b("NONE", 4);
        f8385e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f8386f = bVarArr;
        com.google.android.play.core.appupdate.b.l(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f8386f.clone();
    }
}
