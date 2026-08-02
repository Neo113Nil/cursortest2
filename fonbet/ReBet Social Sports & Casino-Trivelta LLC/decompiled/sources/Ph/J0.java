package Ph;

/* loaded from: classes5.dex */
public abstract class J0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Sh.G f9031a = new Sh.G("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final Sh.G f9032b = new Sh.G("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    public static final Sh.G f9033c = new Sh.G("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    public static final Sh.G f9034d = new Sh.G("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    public static final Sh.G f9035e = new Sh.G("SEALED");

    /* renamed from: f, reason: collision with root package name */
    public static final C1462l0 f9036f = new C1462l0(false);

    /* renamed from: g, reason: collision with root package name */
    public static final C1462l0 f9037g = new C1462l0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC1487y0 ? new C1489z0((InterfaceC1487y0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC1487y0 interfaceC1487y0;
        C1489z0 c1489z0 = obj instanceof C1489z0 ? (C1489z0) obj : null;
        return (c1489z0 == null || (interfaceC1487y0 = c1489z0.f9137a) == null) ? obj : interfaceC1487y0;
    }
}
