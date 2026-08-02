package lg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20047a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f20048b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f20049c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f20050d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f20051e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f20052f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f20047a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f20048b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f20049c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f20050d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f20051e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f20052f = bVarArr;
        com.google.android.play.core.appupdate.b.l(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f20052f.clone();
    }
}
