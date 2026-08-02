package gg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10048a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f10049b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f10050c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f10051d;

    static {
        a aVar = new a("SUSPEND", 0);
        f10048a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f10049b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f10050c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f10051d = aVarArr;
        com.google.android.play.core.appupdate.b.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10051d.clone();
    }
}
