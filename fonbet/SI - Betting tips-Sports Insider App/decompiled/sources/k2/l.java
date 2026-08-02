package k2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f18702a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f18703b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f18704c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l[] f18705d;

    static {
        l lVar = new l("NO_OP", 0);
        f18702a = lVar;
        l lVar2 = new l("ADD", 1);
        f18703b = lVar2;
        l lVar3 = new l("REMOVE", 2);
        f18704c = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        f18705d = lVarArr;
        com.google.android.play.core.appupdate.b.l(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f18705d.clone();
    }
}
