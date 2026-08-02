package k2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f18773a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f18774b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f18775c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ t[] f18776d;

    static {
        t tVar = new t("AUTOMATIC", 0);
        f18773a = tVar;
        t tVar2 = new t("TRUNCATE", 1);
        f18774b = tVar2;
        t tVar3 = new t("WRITE_AHEAD_LOGGING", 2);
        f18775c = tVar3;
        t[] tVarArr = {tVar, tVar2, tVar3};
        f18776d = tVarArr;
        com.google.android.play.core.appupdate.b.l(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f18776d.clone();
    }
}
