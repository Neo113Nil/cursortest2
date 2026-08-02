package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f24392a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f24393b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f24394c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f24395d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f24396e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ c[] f24397f;

    static {
        c cVar = new c("END", 0);
        f24392a = cVar;
        c cVar2 = new c("ROLLBACK", 1);
        f24393b = cVar2;
        c cVar3 = new c("BEGIN_EXCLUSIVE", 2);
        f24394c = cVar3;
        c cVar4 = new c("BEGIN_IMMEDIATE", 3);
        f24395d = cVar4;
        c cVar5 = new c("BEGIN_DEFERRED", 4);
        f24396e = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f24397f = cVarArr;
        com.google.android.play.core.appupdate.b.l(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f24397f.clone();
    }
}
