package u2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f24026a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f24027b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f24028c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f24029d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f24030e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f24031f;

    static {
        f fVar = new f("ON_CONFIGURE", 0);
        f24026a = fVar;
        f fVar2 = new f("ON_CREATE", 1);
        f24027b = fVar2;
        f fVar3 = new f("ON_UPGRADE", 2);
        f24028c = fVar3;
        f fVar4 = new f("ON_DOWNGRADE", 3);
        f24029d = fVar4;
        f fVar5 = new f("ON_OPEN", 4);
        f24030e = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f24031f = fVarArr;
        com.google.android.play.core.appupdate.b.l(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f24031f.clone();
    }
}
