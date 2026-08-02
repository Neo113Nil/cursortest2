package r4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f22298a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f22299b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f22300c;

    static {
        g gVar = new g("FILL", 0);
        f22298a = gVar;
        g gVar2 = new g("FIT", 1);
        f22299b = gVar2;
        g[] gVarArr = {gVar, gVar2};
        f22300c = gVarArr;
        com.google.android.play.core.appupdate.b.l(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f22300c.clone();
    }
}
