package gf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f10027a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f10028b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f10029c;

    static {
        l lVar = new l("SYNCHRONIZED", 0);
        l lVar2 = new l("PUBLICATION", 1);
        f10027a = lVar2;
        l lVar3 = new l("NONE", 2);
        f10028b = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        f10029c = lVarArr;
        com.google.android.play.core.appupdate.b.l(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f10029c.clone();
    }
}
