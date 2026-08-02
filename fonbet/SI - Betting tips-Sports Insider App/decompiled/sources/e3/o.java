package e3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f8551a;

    /* renamed from: b, reason: collision with root package name */
    public static final o f8552b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f8553c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f8554d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o[] f8555e;

    static {
        o oVar = new o("REPLACE", 0);
        f8551a = oVar;
        o oVar2 = new o("KEEP", 1);
        f8552b = oVar2;
        o oVar3 = new o("APPEND", 2);
        f8553c = oVar3;
        o oVar4 = new o("APPEND_OR_REPLACE", 3);
        f8554d = oVar4;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        f8555e = oVarArr;
        com.google.android.play.core.appupdate.b.l(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f8555e.clone();
    }
}
