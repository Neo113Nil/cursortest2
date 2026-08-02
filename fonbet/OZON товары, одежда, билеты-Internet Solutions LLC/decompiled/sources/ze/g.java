package ze;

import De.C2857A;
import fd.InterfaceC6511n;
import org.jetbrains.annotations.NotNull;
import xe.InterfaceC10733l;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final m<Object> f108924a = new m<>(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f108925b = De.B.d(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c, reason: collision with root package name */
    private static final int f108926c = De.B.d(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C2857A f108927d = new C2857A("BUFFERED");

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C2857A f108928e = new C2857A("SHOULD_BUFFER");

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C2857A f108929f = new C2857A("S_RESUMING_BY_RCV");

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final C2857A f108930g = new C2857A("RESUMING_BY_EB");

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final C2857A f108931h = new C2857A("POISONED");

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final C2857A f108932i = new C2857A("DONE_RCV");

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final C2857A f108933j = new C2857A("INTERRUPTED_SEND");

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final C2857A f108934k = new C2857A("INTERRUPTED_RCV");

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final C2857A f108935l = new C2857A("CHANNEL_CLOSED");

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final C2857A f108936m = new C2857A("SUSPEND");

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final C2857A f108937n = new C2857A("SUSPEND_NO_WAITER");

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final C2857A f108938o = new C2857A("FAILED");

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final C2857A f108939p = new C2857A("NO_RECEIVE_RESULT");

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final C2857A f108940q = new C2857A("CLOSE_HANDLER_CLOSED");

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final C2857A f108941r = new C2857A("CLOSE_HANDLER_INVOKED");

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final C2857A f108942s = new C2857A("NO_CLOSE_CAUSE");

    public static final boolean q(InterfaceC10733l interfaceC10733l, Object obj, InterfaceC6511n interfaceC6511n) {
        C2857A D11 = interfaceC10733l.D(obj, interfaceC6511n);
        if (D11 == null) {
            return false;
        }
        interfaceC10733l.E(D11);
        return true;
    }

    @NotNull
    public static final C2857A r() {
        return f108935l;
    }

    static boolean s(InterfaceC10733l interfaceC10733l, Object obj) {
        C2857A D11 = interfaceC10733l.D(obj, null);
        if (D11 == null) {
            return false;
        }
        interfaceC10733l.E(D11);
        return true;
    }
}
