package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final t1 f1701a;

    /* renamed from: b, reason: collision with root package name */
    public static final t1 f1702b;

    /* renamed from: c, reason: collision with root package name */
    public static final t1 f1703c;

    /* renamed from: d, reason: collision with root package name */
    public static final t1 f1704d;

    /* renamed from: e, reason: collision with root package name */
    public static final t1 f1705e;

    /* renamed from: f, reason: collision with root package name */
    public static final t1 f1706f;

    /* renamed from: g, reason: collision with root package name */
    public static final t1 f1707g;

    /* renamed from: h, reason: collision with root package name */
    public static final t1 f1708h;

    /* renamed from: i, reason: collision with root package name */
    public static final t1 f1709i;
    public static final /* synthetic */ t1[] j;

    static {
        t1 t1Var = new t1("INT", 0);
        f1701a = t1Var;
        t1 t1Var2 = new t1("LONG", 1);
        f1702b = t1Var2;
        t1 t1Var3 = new t1("FLOAT", 2);
        f1703c = t1Var3;
        t1 t1Var4 = new t1("DOUBLE", 3);
        f1704d = t1Var4;
        t1 t1Var5 = new t1("BOOLEAN", 4);
        f1705e = t1Var5;
        t1 t1Var6 = new t1("STRING", 5);
        f1706f = t1Var6;
        h hVar = i.f1618b;
        t1 t1Var7 = new t1("BYTE_STRING", 6);
        f1707g = t1Var7;
        t1 t1Var8 = new t1("ENUM", 7);
        f1708h = t1Var8;
        t1 t1Var9 = new t1("MESSAGE", 8);
        f1709i = t1Var9;
        j = new t1[]{t1Var, t1Var2, t1Var3, t1Var4, t1Var5, t1Var6, t1Var7, t1Var8, t1Var9};
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) j.clone();
    }
}
