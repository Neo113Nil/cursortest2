package e3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f8572a;

    /* renamed from: b, reason: collision with root package name */
    public static final y f8573b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f8574c;

    /* renamed from: d, reason: collision with root package name */
    public static final y f8575d;

    /* renamed from: e, reason: collision with root package name */
    public static final y f8576e;

    /* renamed from: f, reason: collision with root package name */
    public static final y f8577f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ y[] f8578g;

    static {
        y yVar = new y("NOT_REQUIRED", 0);
        f8572a = yVar;
        y yVar2 = new y("CONNECTED", 1);
        f8573b = yVar2;
        y yVar3 = new y("UNMETERED", 2);
        f8574c = yVar3;
        y yVar4 = new y("NOT_ROAMING", 3);
        f8575d = yVar4;
        y yVar5 = new y("METERED", 4);
        f8576e = yVar5;
        y yVar6 = new y("TEMPORARILY_UNMETERED", 5);
        f8577f = yVar6;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4, yVar5, yVar6};
        f8578g = yVarArr;
        com.google.android.play.core.appupdate.b.l(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f8578g.clone();
    }
}
