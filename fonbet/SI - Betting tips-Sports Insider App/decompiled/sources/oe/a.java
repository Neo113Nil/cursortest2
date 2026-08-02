package oe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f21159a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f21160b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f21161c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f21162d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f21163e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f21164f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f21165g;

    static {
        a aVar = new a("DEFAULT", 0);
        f21159a = aVar;
        a aVar2 = new a("OFF_LINE", 1);
        f21160b = aVar2;
        a aVar3 = new a("SERVER_OFF", 2);
        f21161c = aVar3;
        a aVar4 = new a("SERVER_ON", 3);
        f21162d = aVar4;
        a aVar5 = new a("SSL_CLIENT_ERROR", 4);
        f21163e = aVar5;
        a aVar6 = new a("PROCESS", 5);
        f21164f = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        f21165g = aVarArr;
        com.google.android.play.core.appupdate.b.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f21165g.clone();
    }
}
