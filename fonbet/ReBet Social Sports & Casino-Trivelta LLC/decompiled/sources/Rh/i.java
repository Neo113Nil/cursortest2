package Rh;

import Ph.InterfaceC1465n;
import Sh.G;
import Sh.J;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.reflect.KFunction;

/* loaded from: classes5.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o f10342a = new o(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f10343b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10344c;

    /* renamed from: d, reason: collision with root package name */
    public static final G f10345d;

    /* renamed from: e, reason: collision with root package name */
    public static final G f10346e;

    /* renamed from: f, reason: collision with root package name */
    public static final G f10347f;

    /* renamed from: g, reason: collision with root package name */
    public static final G f10348g;

    /* renamed from: h, reason: collision with root package name */
    public static final G f10349h;

    /* renamed from: i, reason: collision with root package name */
    public static final G f10350i;

    /* renamed from: j, reason: collision with root package name */
    public static final G f10351j;

    /* renamed from: k, reason: collision with root package name */
    public static final G f10352k;

    /* renamed from: l, reason: collision with root package name */
    public static final G f10353l;

    /* renamed from: m, reason: collision with root package name */
    public static final G f10354m;

    /* renamed from: n, reason: collision with root package name */
    public static final G f10355n;

    /* renamed from: o, reason: collision with root package name */
    public static final G f10356o;

    /* renamed from: p, reason: collision with root package name */
    public static final G f10357p;

    /* renamed from: q, reason: collision with root package name */
    public static final G f10358q;

    /* renamed from: r, reason: collision with root package name */
    public static final G f10359r;

    /* renamed from: s, reason: collision with root package name */
    public static final G f10360s;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f10361a = new a();

        public a() {
            super(2, i.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final o a(long j10, o oVar) {
            return i.x(j10, oVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (o) obj2);
        }
    }

    static {
        int e10;
        int e11;
        e10 = J.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f10343b = e10;
        e11 = J.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f10344c = e11;
        f10345d = new G("BUFFERED");
        f10346e = new G("SHOULD_BUFFER");
        f10347f = new G("S_RESUMING_BY_RCV");
        f10348g = new G("RESUMING_BY_EB");
        f10349h = new G("POISONED");
        f10350i = new G("DONE_RCV");
        f10351j = new G("INTERRUPTED_SEND");
        f10352k = new G("INTERRUPTED_RCV");
        f10353l = new G("CHANNEL_CLOSED");
        f10354m = new G("SUSPEND");
        f10355n = new G("SUSPEND_NO_WAITER");
        f10356o = new G("FAILED");
        f10357p = new G("NO_RECEIVE_RESULT");
        f10358q = new G("CLOSE_HANDLER_CLOSED");
        f10359r = new G("CLOSE_HANDLER_INVOKED");
        f10360s = new G("NO_CLOSE_CAUSE");
    }

    public static final long A(int i10) {
        if (i10 != 0) {
            return i10 != Integer.MAX_VALUE ? i10 : LongCompanionObject.MAX_VALUE;
        }
        return 0L;
    }

    public static final boolean B(InterfaceC1465n interfaceC1465n, Object obj, Function3 function3) {
        Object n10 = interfaceC1465n.n(obj, null, function3);
        if (n10 == null) {
            return false;
        }
        interfaceC1465n.q(n10);
        return true;
    }

    public static /* synthetic */ boolean C(InterfaceC1465n interfaceC1465n, Object obj, Function3 function3, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            function3 = null;
        }
        return B(interfaceC1465n, obj, function3);
    }

    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    public static final long w(long j10, int i10) {
        return (i10 << 60) + j10;
    }

    public static final o x(long j10, o oVar) {
        return new o(j10, oVar, oVar.y(), 0);
    }

    public static final KFunction y() {
        return a.f10361a;
    }

    public static final G z() {
        return f10353l;
    }
}
