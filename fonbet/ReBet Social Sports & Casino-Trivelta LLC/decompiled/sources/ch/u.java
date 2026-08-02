package ch;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f27846a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f27847b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f27848c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f27849d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f27850e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f27851f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f27852g;

    static {
        u uVar = new u();
        f27846a = uVar;
        f27847b = v.a(uVar) == t.Browser;
        f27848c = v.a(uVar) == t.Node;
        f27849d = v.a(uVar) == t.Jvm;
        f27850e = v.a(uVar) == t.Native;
        f27851f = v.b(uVar);
        f27852g = v.c(uVar);
    }

    public final boolean a() {
        return f27847b;
    }

    public final boolean b() {
        return f27851f;
    }
}
