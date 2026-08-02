package tg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23931a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f23932b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f23933c;

    static {
        a aVar = new a("NONE", 0);
        f23931a = aVar;
        a aVar2 = new a("ALL_JSON_OBJECTS", 1);
        a aVar3 = new a("POLYMORPHIC", 2);
        f23932b = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f23933c = aVarArr;
        com.google.android.play.core.appupdate.b.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f23933c.clone();
    }
}
