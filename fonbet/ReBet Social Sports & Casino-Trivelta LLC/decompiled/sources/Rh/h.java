package Rh;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import Ph.l1;
import Sh.AbstractC1564b;
import Sh.AbstractC1565c;
import Sh.AbstractC1574l;
import Sh.D;
import Sh.E;
import Sh.F;
import Sh.G;
import Sh.V;
import f0.AbstractC4221b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;

/* loaded from: classes5.dex */
public class h implements j {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10317d = AtomicLongFieldUpdater.newUpdater(h.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10318e = AtomicLongFieldUpdater.newUpdater(h.class, "receivers$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10319f = AtomicLongFieldUpdater.newUpdater(h.class, "bufferEnd$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10320g = AtomicLongFieldUpdater.newUpdater(h.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10321h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "sendSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10322i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "receiveSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10323j = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10324k = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_closeCause$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10325l = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f10326a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f10327b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name */
    public final Function3 f10328c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public final class a implements l, l1 {

        /* renamed from: a, reason: collision with root package name */
        public Object f10329a;

        /* renamed from: b, reason: collision with root package name */
        public C1469p f10330b;

        public a() {
            G g10;
            g10 = i.f10357p;
            this.f10329a = g10;
        }

        @Override // Ph.l1
        public void a(D d10, int i10) {
            C1469p c1469p = this.f10330b;
            if (c1469p != null) {
                c1469p.a(d10, i10);
            }
        }

        @Override // Rh.l
        public Object b(Continuation continuation) {
            G g10;
            o oVar;
            G g11;
            G g12;
            G g13;
            Object obj = this.f10329a;
            g10 = i.f10357p;
            boolean z10 = true;
            if (obj == g10 || this.f10329a == i.z()) {
                h hVar = h.this;
                o oVar2 = (o) h.f0().get(hVar);
                while (!hVar.t0()) {
                    long andIncrement = h.g0().getAndIncrement(hVar);
                    int i10 = i.f10343b;
                    long j10 = andIncrement / i10;
                    int i11 = (int) (andIncrement % i10);
                    if (oVar2.f10763c != j10) {
                        oVar = hVar.W(j10, oVar2);
                        if (oVar == null) {
                            continue;
                        }
                    } else {
                        oVar = oVar2;
                    }
                    Object g14 = hVar.g1(oVar, i11, andIncrement, null);
                    g11 = i.f10354m;
                    if (g14 == g11) {
                        throw new IllegalStateException("unreachable");
                    }
                    g12 = i.f10356o;
                    if (g14 != g12) {
                        g13 = i.f10355n;
                        if (g14 == g13) {
                            return f(oVar, i11, andIncrement, continuation);
                        }
                        oVar.c();
                        this.f10329a = g14;
                        return Boxing.boxBoolean(z10);
                    }
                    if (andIncrement < hVar.l0()) {
                        oVar.c();
                    }
                    oVar2 = oVar;
                }
                z10 = g();
            }
            return Boxing.boxBoolean(z10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
        
            if (r12 != null) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object f(o oVar, int i10, long j10, Continuation continuation) {
            G g10;
            G g11;
            Boolean boxBoolean;
            Function1 function1;
            o oVar2;
            G g12;
            G g13;
            G g14;
            h hVar = h.this;
            C1469p b10 = Ph.r.b(IntrinsicsKt.intercepted(continuation));
            try {
                this.f10330b = b10;
                try {
                    Object g15 = hVar.g1(oVar, i10, j10, this);
                    g10 = i.f10354m;
                    if (g15 == g10) {
                        hVar.O0(this, oVar, i10);
                    } else {
                        g11 = i.f10356o;
                        Function3 function3 = null;
                        if (g15 == g11) {
                            if (j10 < hVar.l0()) {
                                oVar.c();
                            }
                            o oVar3 = (o) h.f0().get(hVar);
                            while (true) {
                                if (hVar.t0()) {
                                    h();
                                    break;
                                }
                                long andIncrement = h.g0().getAndIncrement(hVar);
                                int i11 = i.f10343b;
                                long j11 = andIncrement / i11;
                                int i12 = (int) (andIncrement % i11);
                                if (oVar3.f10763c != j11) {
                                    oVar2 = hVar.W(j11, oVar3);
                                    if (oVar2 == null) {
                                    }
                                } else {
                                    oVar2 = oVar3;
                                }
                                g15 = hVar.g1(oVar2, i12, andIncrement, this);
                                g12 = i.f10354m;
                                if (g15 == g12) {
                                    hVar.O0(this, oVar2, i12);
                                    break;
                                }
                                g13 = i.f10356o;
                                if (g15 == g13) {
                                    if (andIncrement < hVar.l0()) {
                                        oVar2.c();
                                    }
                                    oVar3 = oVar2;
                                } else {
                                    g14 = i.f10355n;
                                    if (g15 == g14) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    oVar2.c();
                                    this.f10329a = g15;
                                    this.f10330b = null;
                                    boxBoolean = Boxing.boxBoolean(true);
                                    function1 = hVar.f10327b;
                                }
                            }
                        } else {
                            oVar.c();
                            this.f10329a = g15;
                            this.f10330b = null;
                            boxBoolean = Boxing.boxBoolean(true);
                            function1 = hVar.f10327b;
                            if (function1 != null) {
                                function3 = hVar.H(function1, g15);
                            }
                            b10.l(boxBoolean, function3);
                        }
                    }
                    Object z10 = b10.z();
                    if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    return z10;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    b10.N();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }

        public final boolean g() {
            this.f10329a = i.z();
            Throwable b02 = h.this.b0();
            if (b02 == null) {
                return false;
            }
            throw F.a(b02);
        }

        public final void h() {
            C1469p c1469p = this.f10330b;
            Intrinsics.checkNotNull(c1469p);
            this.f10330b = null;
            this.f10329a = i.z();
            Throwable b02 = h.this.b0();
            if (b02 == null) {
                Result.Companion companion = Result.INSTANCE;
                c1469p.resumeWith(Result.m147constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                c1469p.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(b02)));
            }
        }

        public final boolean i(Object obj) {
            boolean B10;
            C1469p c1469p = this.f10330b;
            Intrinsics.checkNotNull(c1469p);
            this.f10330b = null;
            this.f10329a = obj;
            Boolean bool = Boolean.TRUE;
            h hVar = h.this;
            Function1 function1 = hVar.f10327b;
            B10 = i.B(c1469p, bool, function1 != null ? hVar.H(function1, obj) : null);
            return B10;
        }

        public final void j() {
            C1469p c1469p = this.f10330b;
            Intrinsics.checkNotNull(c1469p);
            this.f10330b = null;
            this.f10329a = i.z();
            Throwable b02 = h.this.b0();
            if (b02 == null) {
                Result.Companion companion = Result.INSTANCE;
                c1469p.resumeWith(Result.m147constructorimpl(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                c1469p.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(b02)));
            }
        }

        @Override // Rh.l
        public Object next() {
            G g10;
            G g11;
            Object obj = this.f10329a;
            g10 = i.f10357p;
            if (obj == g10) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            g11 = i.f10357p;
            this.f10329a = g11;
            if (obj != i.z()) {
                return obj;
            }
            throw F.a(h.this.e0());
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function3 {
        public b(Object obj) {
            super(3, obj, h.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void a(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            ((h) this.receiver).E0(th2, obj, coroutineContext);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((Throwable) obj, obj2, (CoroutineContext) obj3);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function3 {
        public c(Object obj) {
            super(3, obj, h.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void a(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            ((h) this.receiver).D0(th2, obj, coroutineContext);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((Throwable) obj, ((n) obj2).k(), (CoroutineContext) obj3);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f10332n;

        /* renamed from: p, reason: collision with root package name */
        public int f10334p;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10332n = obj;
            this.f10334p |= Integer.MIN_VALUE;
            Object R02 = h.R0(h.this, this);
            return R02 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? R02 : n.b(R02);
        }
    }

    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f10335n;

        /* renamed from: o, reason: collision with root package name */
        public Object f10336o;

        /* renamed from: p, reason: collision with root package name */
        public int f10337p;

        /* renamed from: q, reason: collision with root package name */
        public long f10338q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f10339r;

        /* renamed from: t, reason: collision with root package name */
        public int f10341t;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10339r = obj;
            this.f10341t |= Integer.MIN_VALUE;
            Object S02 = h.this.S0(null, 0, 0L, this);
            return S02 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? S02 : n.b(S02);
        }
    }

    public h(int i10, Function1 function1) {
        long A10;
        G g10;
        this.f10326a = i10;
        this.f10327b = function1;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        A10 = i.A(i10);
        this.bufferEnd$volatile = A10;
        this.completedExpandBuffersAndPauseFlag$volatile = Z();
        o oVar = new o(0L, null, this, 3);
        this.sendSegment$volatile = oVar;
        this.receiveSegment$volatile = oVar;
        if (x0()) {
            oVar = i.f10342a;
            Intrinsics.checkNotNull(oVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = oVar;
        this.f10328c = function1 != null ? new Function3() { // from class: Rh.e
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Function3 M02;
                M02 = h.M0(h.this, (Vh.f) obj, obj2, obj3);
                return M02;
            }
        } : null;
        g10 = i.f10360s;
        this._closeCause$volatile = g10;
    }

    public static final Unit J(Function1 function1, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        Sh.z.a(function1, obj, coroutineContext);
        return Unit.INSTANCE;
    }

    public static final Function3 M0(final h hVar, final Vh.f fVar, Object obj, final Object obj2) {
        return new Function3() { // from class: Rh.g
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                Unit N02;
                N02 = h.N0(obj2, hVar, fVar, (Throwable) obj3, obj4, (CoroutineContext) obj5);
                return N02;
            }
        };
    }

    public static final Unit N0(Object obj, h hVar, Vh.f fVar, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        if (obj != i.z()) {
            Sh.z.a(hVar.f10327b, obj, fVar.getContext());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object Q0(h hVar, Continuation continuation) {
        o oVar;
        G g10;
        G g11;
        G g12;
        o oVar2 = (o) f0().get(hVar);
        while (!hVar.t0()) {
            long andIncrement = g0().getAndIncrement(hVar);
            int i10 = i.f10343b;
            long j10 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (oVar2.f10763c != j10) {
                o W10 = hVar.W(j10, oVar2);
                if (W10 == null) {
                    continue;
                } else {
                    oVar = W10;
                }
            } else {
                oVar = oVar2;
            }
            h hVar2 = hVar;
            Object g13 = hVar2.g1(oVar, i11, andIncrement, null);
            g10 = i.f10354m;
            if (g13 == g10) {
                throw new IllegalStateException("unexpected");
            }
            g11 = i.f10356o;
            if (g13 != g11) {
                g12 = i.f10355n;
                if (g13 == g12) {
                    return hVar2.T0(oVar, i11, andIncrement, continuation);
                }
                oVar.c();
                return g13;
            }
            if (andIncrement < hVar2.l0()) {
                oVar.c();
            }
            hVar = hVar2;
            oVar2 = oVar;
        }
        throw F.a(hVar.e0());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object R0(h hVar, Continuation continuation) {
        d dVar;
        int i10;
        o oVar;
        G g10;
        G g11;
        G g12;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f10334p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f10334p = i11 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.f10332n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar2.f10334p;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((n) obj).k();
                }
                ResultKt.throwOnFailure(obj);
                o oVar2 = (o) f0().get(hVar);
                while (!hVar.t0()) {
                    long andIncrement = g0().getAndIncrement(hVar);
                    int i12 = i.f10343b;
                    long j10 = andIncrement / i12;
                    int i13 = (int) (andIncrement % i12);
                    if (oVar2.f10763c != j10) {
                        o W10 = hVar.W(j10, oVar2);
                        if (W10 == null) {
                            continue;
                        } else {
                            oVar = W10;
                        }
                    } else {
                        oVar = oVar2;
                    }
                    h hVar2 = hVar;
                    Object g13 = hVar2.g1(oVar, i13, andIncrement, null);
                    g10 = i.f10354m;
                    if (g13 == g10) {
                        throw new IllegalStateException("unexpected");
                    }
                    g11 = i.f10356o;
                    if (g13 != g11) {
                        g12 = i.f10355n;
                        if (g13 != g12) {
                            oVar.c();
                            return n.f10366b.c(g13);
                        }
                        dVar2.f10334p = 1;
                        Object S02 = hVar2.S0(oVar, i13, andIncrement, dVar2);
                        return S02 == coroutine_suspended ? coroutine_suspended : S02;
                    }
                    if (andIncrement < hVar2.l0()) {
                        oVar.c();
                    }
                    hVar = hVar2;
                    oVar2 = oVar;
                }
                return n.f10366b.a(hVar.b0());
            }
        }
        dVar = hVar.new d(continuation);
        d dVar22 = dVar;
        Object obj2 = dVar22.f10332n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar22.f10334p;
        if (i10 == 0) {
        }
    }

    public static /* synthetic */ Object Y0(h hVar, Object obj, Continuation continuation) {
        o oVar;
        o oVar2 = (o) j0().get(hVar);
        while (true) {
            long andIncrement = k0().getAndIncrement(hVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean v02 = hVar.v0(andIncrement);
            int i10 = i.f10343b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (oVar2.f10763c != j11) {
                o X10 = hVar.X(j11, oVar2);
                if (X10 != null) {
                    oVar = X10;
                } else if (v02) {
                    Object I02 = hVar.I0(obj, continuation);
                    if (I02 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return I02;
                    }
                }
            } else {
                oVar = oVar2;
            }
            h hVar2 = hVar;
            Object obj2 = obj;
            int i12 = hVar2.i1(oVar, i11, obj2, j10, null, v02);
            if (i12 == 0) {
                oVar.c();
                break;
            }
            if (i12 == 1) {
                break;
            }
            if (i12 != 2) {
                if (i12 == 3) {
                    Object Z02 = hVar2.Z0(oVar, i11, obj2, j10, continuation);
                    if (Z02 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return Z02;
                    }
                } else if (i12 != 4) {
                    if (i12 == 5) {
                        oVar.c();
                    }
                    hVar = hVar2;
                    oVar2 = oVar;
                    obj = obj2;
                } else {
                    if (j10 < hVar2.h0()) {
                        oVar.c();
                    }
                    Object I03 = hVar2.I0(obj2, continuation);
                    if (I03 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return I03;
                    }
                }
            } else if (v02) {
                oVar.t();
                Object I04 = hVar2.I0(obj2, continuation);
                if (I04 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return I04;
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater f0() {
        return f10322i;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater g0() {
        return f10318e;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater j0() {
        return f10321h;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater k0() {
        return f10317d;
    }

    public static /* synthetic */ void p0(h hVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        hVar.o0(j10);
    }

    public final void A0() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10317d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            w10 = i.w(1152921504606846975L & j10, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    public final void B0() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10317d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                w10 = i.w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                w10 = i.w(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0(long j10, o oVar) {
        o oVar2;
        o oVar3;
        while (oVar.f10763c < j10 && (oVar3 = (o) oVar.f()) != null) {
            oVar = oVar3;
        }
        while (true) {
            if (!oVar.k() || (oVar2 = (o) oVar.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10323j;
                while (true) {
                    D d10 = (D) atomicReferenceFieldUpdater.get(this);
                    if (d10.f10763c >= oVar.f10763c) {
                        return;
                    }
                    if (!oVar.u()) {
                        break;
                    }
                    if (AbstractC4221b.a(atomicReferenceFieldUpdater, this, d10, oVar)) {
                        if (d10.p()) {
                            d10.n();
                            return;
                        }
                        return;
                    } else if (oVar.p()) {
                        oVar.n();
                    }
                }
            } else {
                oVar = oVar2;
            }
        }
    }

    public final void D0(Throwable th2, Object obj, CoroutineContext coroutineContext) {
        Function1 function1 = this.f10327b;
        Intrinsics.checkNotNull(function1);
        Object f10 = n.f(obj);
        Intrinsics.checkNotNull(f10);
        Sh.z.a(function1, f10, coroutineContext);
    }

    public final void E0(Throwable th2, Object obj, CoroutineContext coroutineContext) {
        Function1 function1 = this.f10327b;
        Intrinsics.checkNotNull(function1);
        Sh.z.a(function1, obj, coroutineContext);
    }

    public final void G0(InterfaceC1465n interfaceC1465n) {
        Result.Companion companion = Result.INSTANCE;
        interfaceC1465n.resumeWith(Result.m147constructorimpl(n.b(n.f10366b.a(b0()))));
    }

    public final Function3 H(final Function1 function1, final Object obj) {
        return new Function3() { // from class: Rh.f
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                Unit J10;
                J10 = h.J(Function1.this, obj, (Throwable) obj2, obj3, (CoroutineContext) obj4);
                return J10;
            }
        };
    }

    public final void H0(InterfaceC1465n interfaceC1465n) {
        Result.Companion companion = Result.INSTANCE;
        interfaceC1465n.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(e0())));
    }

    public final KFunction I(Function1 function1) {
        return new b(this);
    }

    public final Object I0(Object obj, Continuation continuation) {
        V c10;
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        Function1 function1 = this.f10327b;
        if (function1 == null || (c10 = Sh.z.c(function1, obj, null, 2, null)) == null) {
            Throwable i02 = i0();
            Result.Companion companion = Result.INSTANCE;
            c1469p.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(i02)));
        } else {
            ExceptionsKt.addSuppressed(c10, i0());
            Result.Companion companion2 = Result.INSTANCE;
            c1469p.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(c10)));
        }
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? z10 : Unit.INSTANCE;
    }

    public final void J0(Object obj, InterfaceC1465n interfaceC1465n) {
        Function1 function1 = this.f10327b;
        if (function1 != null) {
            Sh.z.a(function1, obj, interfaceC1465n.get$context());
        }
        Throwable i02 = i0();
        Result.Companion companion = Result.INSTANCE;
        interfaceC1465n.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(i02)));
    }

    public final KFunction K(Function1 function1) {
        return new c(this);
    }

    public final boolean L(long j10) {
        return j10 < Z() || j10 < h0() + ((long) this.f10326a);
    }

    public boolean M(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return P(th2, true);
    }

    public final void N(o oVar, long j10) {
        G g10;
        Object b10 = AbstractC1574l.b(null, 1, null);
        loop0: while (oVar != null) {
            for (int i10 = i.f10343b - 1; -1 < i10; i10--) {
                if ((oVar.f10763c * i.f10343b) + i10 < j10) {
                    break loop0;
                }
                while (true) {
                    Object B10 = oVar.B(i10);
                    if (B10 != null) {
                        g10 = i.f10346e;
                        if (B10 != g10) {
                            if (!(B10 instanceof C)) {
                                if (!(B10 instanceof l1)) {
                                    break;
                                }
                                if (oVar.v(i10, B10, i.z())) {
                                    b10 = AbstractC1574l.c(b10, B10);
                                    oVar.C(i10, true);
                                    break;
                                }
                            } else {
                                if (oVar.v(i10, B10, i.z())) {
                                    b10 = AbstractC1574l.c(b10, ((C) B10).f10306a);
                                    oVar.C(i10, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (oVar.v(i10, B10, i.z())) {
                        oVar.t();
                        break;
                    }
                }
            }
            oVar = (o) oVar.h();
        }
        if (b10 != null) {
            if (!(b10 instanceof ArrayList)) {
                V0((l1) b10);
                return;
            }
            Intrinsics.checkNotNull(b10, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) b10;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                V0((l1) arrayList.get(size));
            }
        }
    }

    public final o O() {
        Object obj = f10323j.get(this);
        o oVar = (o) f10321h.get(this);
        if (oVar.f10763c > ((o) obj).f10763c) {
            obj = oVar;
        }
        o oVar2 = (o) f10322i.get(this);
        if (oVar2.f10763c > ((o) obj).f10763c) {
            obj = oVar2;
        }
        return (o) AbstractC1564b.b((AbstractC1565c) obj);
    }

    public final void O0(l1 l1Var, o oVar, int i10) {
        L0();
        l1Var.a(oVar, i10);
    }

    public boolean P(Throwable th2, boolean z10) {
        G g10;
        if (z10) {
            z0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10324k;
        g10 = i.f10360s;
        boolean a10 = AbstractC4221b.a(atomicReferenceFieldUpdater, this, g10, th2);
        if (z10) {
            A0();
        } else {
            B0();
        }
        S();
        F0();
        if (a10) {
            q0();
        }
        return a10;
    }

    public final void P0(l1 l1Var, o oVar, int i10) {
        l1Var.a(oVar, i10 + i.f10343b);
    }

    public final void Q(long j10) {
        U0(R(j10));
    }

    public final o R(long j10) {
        o O10 = O();
        if (w0()) {
            long y02 = y0(O10);
            if (y02 != -1) {
                T(y02);
            }
        }
        N(O10, j10);
        return O10;
    }

    public final void S() {
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S0(o oVar, int i10, long j10, Continuation continuation) {
        e eVar;
        int i11;
        z zVar;
        G g10;
        G g11;
        n b10;
        o oVar2;
        G g12;
        G g13;
        G g14;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f10341t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f10341t = i12 - Integer.MIN_VALUE;
                Object obj = eVar.f10339r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = eVar.f10341t;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj);
                    eVar.f10335n = this;
                    eVar.f10336o = oVar;
                    eVar.f10337p = i10;
                    eVar.f10338q = j10;
                    eVar.f10341t = 1;
                    C1469p b11 = Ph.r.b(IntrinsicsKt.intercepted(eVar));
                    try {
                        Intrinsics.checkNotNull(b11, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                        zVar = new z(b11);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        Object g15 = g1(oVar, i10, j10, zVar);
                        g10 = i.f10354m;
                        if (g15 == g10) {
                            O0(zVar, oVar, i10);
                        } else {
                            g11 = i.f10356o;
                            KFunction kFunction = null;
                            if (g15 == g11) {
                                if (j10 < l0()) {
                                    oVar.c();
                                }
                                o oVar3 = (o) f0().get(this);
                                while (true) {
                                    if (t0()) {
                                        G0(b11);
                                        break;
                                    }
                                    long andIncrement = g0().getAndIncrement(this);
                                    int i13 = i.f10343b;
                                    long j11 = andIncrement / i13;
                                    int i14 = (int) (andIncrement % i13);
                                    if (oVar3.f10763c != j11) {
                                        o W10 = W(j11, oVar3);
                                        if (W10 != null) {
                                            oVar2 = W10;
                                        }
                                    } else {
                                        oVar2 = oVar3;
                                    }
                                    Object g16 = g1(oVar2, i14, andIncrement, zVar);
                                    o oVar4 = oVar2;
                                    g12 = i.f10354m;
                                    if (g16 == g12) {
                                        O0(zVar, oVar4, i14);
                                        break;
                                    }
                                    g13 = i.f10356o;
                                    if (g16 == g13) {
                                        if (andIncrement < l0()) {
                                            oVar4.c();
                                        }
                                        oVar3 = oVar4;
                                    } else {
                                        g14 = i.f10355n;
                                        if (g16 == g14) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        oVar4.c();
                                        b10 = n.b(n.f10366b.c(g16));
                                        Function1 function1 = this.f10327b;
                                        if (function1 != null) {
                                            kFunction = K(function1);
                                        }
                                    }
                                }
                            } else {
                                oVar.c();
                                b10 = n.b(n.f10366b.c(g15));
                                Function1 function12 = this.f10327b;
                                if (function12 != null) {
                                    kFunction = K(function12);
                                }
                            }
                            b11.l(b10, (Function3) kFunction);
                        }
                        obj = b11.z();
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(eVar);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        Throwable th4 = th;
                        b11.N();
                        throw th4;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((n) obj).k();
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f10339r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = eVar.f10341t;
        if (i11 != 0) {
        }
        return ((n) obj2).k();
    }

    public final void T(long j10) {
        o oVar;
        G g10;
        V c10;
        o oVar2 = (o) f10322i.get(this);
        while (true) {
            long j11 = f10318e.get(this);
            if (j10 < Math.max(this.f10326a + j11, Z())) {
                return;
            }
            if (f10318e.compareAndSet(this, j11, 1 + j11)) {
                int i10 = i.f10343b;
                long j12 = j11 / i10;
                int i11 = (int) (j11 % i10);
                if (oVar2.f10763c != j12) {
                    oVar = W(j12, oVar2);
                    if (oVar == null) {
                        continue;
                    }
                } else {
                    oVar = oVar2;
                }
                Object g12 = g1(oVar, i11, j11, null);
                g10 = i.f10356o;
                if (g12 != g10) {
                    oVar.c();
                    Function1 function1 = this.f10327b;
                    if (function1 != null && (c10 = Sh.z.c(function1, g12, null, 2, null)) != null) {
                        throw c10;
                    }
                } else if (j11 < l0()) {
                    oVar.c();
                }
                oVar2 = oVar;
            }
        }
    }

    public final Object T0(o oVar, int i10, long j10, Continuation continuation) {
        G g10;
        G g11;
        o oVar2;
        G g12;
        G g13;
        G g14;
        C1469p b10 = Ph.r.b(IntrinsicsKt.intercepted(continuation));
        try {
            Object g15 = g1(oVar, i10, j10, b10);
            g10 = i.f10354m;
            if (g15 == g10) {
                O0(b10, oVar, i10);
            } else {
                g11 = i.f10356o;
                KFunction kFunction = null;
                kFunction = null;
                if (g15 == g11) {
                    if (j10 < l0()) {
                        oVar.c();
                    }
                    o oVar3 = (o) f0().get(this);
                    while (true) {
                        if (t0()) {
                            H0(b10);
                            break;
                        }
                        long andIncrement = g0().getAndIncrement(this);
                        int i11 = i.f10343b;
                        long j11 = andIncrement / i11;
                        int i12 = (int) (andIncrement % i11);
                        if (oVar3.f10763c != j11) {
                            o W10 = W(j11, oVar3);
                            if (W10 != null) {
                                oVar2 = W10;
                            }
                        } else {
                            oVar2 = oVar3;
                        }
                        g15 = g1(oVar2, i12, andIncrement, b10);
                        o oVar4 = oVar2;
                        g12 = i.f10354m;
                        if (g15 == g12) {
                            C1469p c1469p = b10 != null ? b10 : null;
                            if (c1469p != null) {
                                O0(c1469p, oVar4, i12);
                            }
                        } else {
                            g13 = i.f10356o;
                            if (g15 == g13) {
                                if (andIncrement < l0()) {
                                    oVar4.c();
                                }
                                oVar3 = oVar4;
                            } else {
                                g14 = i.f10355n;
                                if (g15 == g14) {
                                    throw new IllegalStateException("unexpected");
                                }
                                oVar4.c();
                                Function1 function1 = this.f10327b;
                                if (function1 != null) {
                                    kFunction = I(function1);
                                }
                            }
                        }
                    }
                } else {
                    oVar.c();
                    Function1 function12 = this.f10327b;
                    if (function12 != null) {
                        kFunction = I(function12);
                    }
                }
                b10.l(g15, (Function3) kFunction);
            }
            Object z10 = b10.z();
            if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return z10;
        } catch (Throwable th2) {
            b10.N();
            throw th2;
        }
    }

    public final void U() {
        if (x0()) {
            return;
        }
        o oVar = (o) f10323j.get(this);
        while (true) {
            long andIncrement = f10319f.getAndIncrement(this);
            int i10 = i.f10343b;
            long j10 = andIncrement / i10;
            if (l0() <= andIncrement) {
                if (oVar.f10763c < j10 && oVar.f() != null) {
                    C0(j10, oVar);
                }
                p0(this, 0L, 1, null);
                return;
            }
            if (oVar.f10763c != j10) {
                o V10 = V(j10, oVar, andIncrement);
                if (V10 == null) {
                    continue;
                } else {
                    oVar = V10;
                }
            }
            if (e1(oVar, (int) (andIncrement % i10), andIncrement)) {
                p0(this, 0L, 1, null);
                return;
            }
            p0(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (Rh.o) r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U0(o oVar) {
        G g10;
        G g11;
        G g12;
        G g13;
        G g14;
        Function1 function1 = this.f10327b;
        V v10 = null;
        Object b10 = AbstractC1574l.b(null, 1, null);
        loop0: do {
            int i10 = i.f10343b - 1;
            while (true) {
                if (-1 >= i10) {
                    break;
                }
                long j10 = (oVar.f10763c * i.f10343b) + i10;
                while (true) {
                    Object B10 = oVar.B(i10);
                    g10 = i.f10350i;
                    if (B10 == g10) {
                        break loop0;
                    }
                    if (B10 != i.f10345d) {
                        g11 = i.f10346e;
                        if (B10 == g11 || B10 == null) {
                            if (oVar.v(i10, B10, i.z())) {
                                oVar.t();
                                break;
                            }
                        } else if (!(B10 instanceof l1) && !(B10 instanceof C)) {
                            g12 = i.f10348g;
                            if (B10 == g12) {
                                break loop0;
                            }
                            g13 = i.f10347f;
                            if (B10 == g13) {
                                break loop0;
                            }
                            g14 = i.f10348g;
                            if (B10 != g14) {
                                break;
                            }
                        } else {
                            if (j10 < h0()) {
                                break loop0;
                            }
                            l1 l1Var = B10 instanceof C ? ((C) B10).f10306a : (l1) B10;
                            if (oVar.v(i10, B10, i.z())) {
                                if (function1 != null) {
                                    v10 = Sh.z.b(function1, oVar.A(i10), v10);
                                }
                                b10 = AbstractC1574l.c(b10, l1Var);
                                oVar.w(i10);
                                oVar.t();
                            }
                        }
                    } else {
                        if (j10 < h0()) {
                            break loop0;
                        }
                        if (oVar.v(i10, B10, i.z())) {
                            if (function1 != null) {
                                v10 = Sh.z.b(function1, oVar.A(i10), v10);
                            }
                            oVar.w(i10);
                            oVar.t();
                        }
                    }
                }
                i10--;
            }
        } while (oVar != null);
        if (b10 != null) {
            if (b10 instanceof ArrayList) {
                Intrinsics.checkNotNull(b10, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) b10;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    W0((l1) arrayList.get(size));
                }
            } else {
                W0((l1) b10);
            }
        }
        if (v10 != null) {
            throw v10;
        }
    }

    public final o V(long j10, o oVar, long j11) {
        Object c10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10323j;
        Function2 function2 = (Function2) i.y();
        loop0: while (true) {
            c10 = AbstractC1564b.c(oVar, j10, function2);
            if (!E.c(c10)) {
                D b10 = E.b(c10);
                while (true) {
                    D d10 = (D) atomicReferenceFieldUpdater.get(this);
                    if (d10.f10763c >= b10.f10763c) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (AbstractC4221b.a(atomicReferenceFieldUpdater, this, d10, b10)) {
                        if (d10.p()) {
                            d10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        if (E.c(c10)) {
            S();
            C0(j10, oVar);
            p0(this, 0L, 1, null);
            return null;
        }
        o oVar2 = (o) E.b(c10);
        if (oVar2.f10763c <= j10) {
            return oVar2;
        }
        long j12 = oVar2.f10763c;
        int i10 = i.f10343b;
        if (f10319f.compareAndSet(this, j11 + 1, j12 * i10)) {
            o0((oVar2.f10763c * i10) - j11);
        } else {
            p0(this, 0L, 1, null);
        }
        return null;
    }

    public final void V0(l1 l1Var) {
        X0(l1Var, true);
    }

    public final o W(long j10, o oVar) {
        Object c10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10322i;
        Function2 function2 = (Function2) i.y();
        loop0: while (true) {
            c10 = AbstractC1564b.c(oVar, j10, function2);
            if (!E.c(c10)) {
                D b10 = E.b(c10);
                while (true) {
                    D d10 = (D) atomicReferenceFieldUpdater.get(this);
                    if (d10.f10763c >= b10.f10763c) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (AbstractC4221b.a(atomicReferenceFieldUpdater, this, d10, b10)) {
                        if (d10.p()) {
                            d10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        if (E.c(c10)) {
            S();
            if (oVar.f10763c * i.f10343b < l0()) {
                oVar.c();
            }
            return null;
        }
        o oVar2 = (o) E.b(c10);
        if (!x0() && j10 <= Z() / i.f10343b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10323j;
            while (true) {
                D d11 = (D) atomicReferenceFieldUpdater2.get(this);
                if (d11.f10763c >= oVar2.f10763c || !oVar2.u()) {
                    break;
                }
                if (AbstractC4221b.a(atomicReferenceFieldUpdater2, this, d11, oVar2)) {
                    if (d11.p()) {
                        d11.n();
                    }
                } else if (oVar2.p()) {
                    oVar2.n();
                }
            }
        }
        long j11 = oVar2.f10763c;
        if (j11 <= j10) {
            return oVar2;
        }
        int i10 = i.f10343b;
        k1(j11 * i10);
        if (oVar2.f10763c * i10 < l0()) {
            oVar2.c();
        }
        return null;
    }

    public final void W0(l1 l1Var) {
        X0(l1Var, false);
    }

    public final o X(long j10, o oVar) {
        Object c10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10321h;
        Function2 function2 = (Function2) i.y();
        loop0: while (true) {
            c10 = AbstractC1564b.c(oVar, j10, function2);
            if (!E.c(c10)) {
                D b10 = E.b(c10);
                while (true) {
                    D d10 = (D) atomicReferenceFieldUpdater.get(this);
                    if (d10.f10763c >= b10.f10763c) {
                        break loop0;
                    }
                    if (!b10.u()) {
                        break;
                    }
                    if (AbstractC4221b.a(atomicReferenceFieldUpdater, this, d10, b10)) {
                        if (d10.p()) {
                            d10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            } else {
                break;
            }
        }
        if (E.c(c10)) {
            S();
            if (oVar.f10763c * i.f10343b < h0()) {
                oVar.c();
            }
            return null;
        }
        o oVar2 = (o) E.b(c10);
        long j11 = oVar2.f10763c;
        if (j11 <= j10) {
            return oVar2;
        }
        int i10 = i.f10343b;
        l1(j11 * i10);
        if (oVar2.f10763c * i10 < h0()) {
            oVar2.c();
        }
        return null;
    }

    public final void X0(l1 l1Var, boolean z10) {
        if (l1Var instanceof InterfaceC1465n) {
            Continuation continuation = (Continuation) l1Var;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(z10 ? e0() : i0())));
        } else if (l1Var instanceof z) {
            C1469p c1469p = ((z) l1Var).f10384a;
            Result.Companion companion2 = Result.INSTANCE;
            c1469p.resumeWith(Result.m147constructorimpl(n.b(n.f10366b.a(b0()))));
        } else if (l1Var instanceof a) {
            ((a) l1Var).j();
        } else {
            if (l1Var instanceof Vh.f) {
                ((Vh.f) l1Var).e(this, i.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + l1Var).toString());
        }
    }

    public final long Z() {
        return f10319f.get(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z0(o oVar, int i10, Object obj, long j10, Continuation continuation) {
        Unit unit;
        Object z10;
        o oVar2;
        C1469p b10 = Ph.r.b(IntrinsicsKt.intercepted(continuation));
        try {
            int i12 = i1(oVar, i10, obj, j10, b10, false);
            if (i12 == 0) {
                oVar.c();
                Result.Companion companion = Result.INSTANCE;
                unit = Unit.INSTANCE;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 4) {
                            String str = "unexpected";
                            if (i12 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            oVar.c();
                            o oVar3 = (o) j0().get(this);
                            while (true) {
                                long andIncrement = k0().getAndIncrement(this);
                                long j11 = 1152921504606846975L & andIncrement;
                                boolean v02 = v0(andIncrement);
                                int i11 = i.f10343b;
                                long j12 = j11 / i11;
                                int i13 = (int) (j11 % i11);
                                String str2 = str;
                                if (oVar3.f10763c != j12) {
                                    oVar2 = X(j12, oVar3);
                                    if (oVar2 == null) {
                                        if (v02) {
                                            break;
                                        }
                                        str = str2;
                                    }
                                } else {
                                    oVar2 = oVar3;
                                }
                                int i14 = i1(oVar2, i13, obj, j11, b10, v02);
                                if (i14 == 0) {
                                    oVar2.c();
                                    Result.Companion companion2 = Result.INSTANCE;
                                    unit = Unit.INSTANCE;
                                    break;
                                }
                                if (i14 == 1) {
                                    Result.Companion companion3 = Result.INSTANCE;
                                    unit = Unit.INSTANCE;
                                    break;
                                }
                                if (i14 != 2) {
                                    if (i14 == 3) {
                                        throw new IllegalStateException(str2);
                                    }
                                    if (i14 != 4) {
                                        if (i14 == 5) {
                                            oVar2.c();
                                        }
                                        str = str2;
                                        oVar3 = oVar2;
                                    } else if (j11 < h0()) {
                                        oVar2.c();
                                    }
                                } else if (v02) {
                                    oVar2.t();
                                } else {
                                    C1469p c1469p = b10 != null ? b10 : null;
                                    if (c1469p != null) {
                                        P0(c1469p, oVar2, i13);
                                    }
                                }
                            }
                        } else if (j10 < h0()) {
                            oVar.c();
                        }
                        J0(obj, b10);
                    } else {
                        P0(b10, oVar, i10);
                    }
                    z10 = b10.z();
                    if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    return z10 != IntrinsicsKt.getCOROUTINE_SUSPENDED() ? z10 : Unit.INSTANCE;
                }
                Result.Companion companion4 = Result.INSTANCE;
                unit = Unit.INSTANCE;
            }
            b10.resumeWith(Result.m147constructorimpl(unit));
            z10 = b10.z();
            if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (z10 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
        } catch (Throwable th2) {
            b10.N();
            throw th2;
        }
    }

    @Override // Rh.B
    public boolean a(Throwable th2) {
        return P(th2, false);
    }

    public final boolean a1(long j10) {
        if (v0(j10)) {
            return false;
        }
        return !L(j10 & 1152921504606846975L);
    }

    public final Throwable b0() {
        return (Throwable) f10324k.get(this);
    }

    public final boolean b1(Object obj, Object obj2) {
        boolean B10;
        boolean B11;
        if (obj instanceof Vh.f) {
            return ((Vh.f) obj).e(this, obj2);
        }
        if (obj instanceof z) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C1469p c1469p = ((z) obj).f10384a;
            n b10 = n.b(n.f10366b.c(obj2));
            Function1 function1 = this.f10327b;
            B11 = i.B(c1469p, b10, (Function3) (function1 != null ? K(function1) : null));
            return B11;
        }
        if (obj instanceof a) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (!(obj instanceof InterfaceC1465n)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        InterfaceC1465n interfaceC1465n = (InterfaceC1465n) obj;
        Function1 function12 = this.f10327b;
        B10 = i.B(interfaceC1465n, obj2, (Function3) (function12 != null ? I(function12) : null));
        return B10;
    }

    public final boolean c1(Object obj, o oVar, int i10) {
        if (obj instanceof InterfaceC1465n) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return i.C((InterfaceC1465n) obj, Unit.INSTANCE, null, 2, null);
        }
        if (!(obj instanceof Vh.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        Vh.h f10 = ((Vh.e) obj).f(this, Unit.INSTANCE);
        if (f10 == Vh.h.f12910b) {
            oVar.w(i10);
        }
        return f10 == Vh.h.f12909a;
    }

    @Override // Rh.A
    public final void cancel(CancellationException cancellationException) {
        M(cancellationException);
    }

    public final Object d1(Object obj) {
        o oVar;
        int i10;
        h hVar;
        Object obj2 = i.f10345d;
        o oVar2 = (o) j0().get(this);
        while (true) {
            long andIncrement = k0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean v02 = v0(andIncrement);
            int i11 = i.f10343b;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (oVar2.f10763c != j11) {
                oVar = X(j11, oVar2);
                if (oVar != null) {
                    hVar = this;
                    i10 = i12;
                } else if (v02) {
                    return n.f10366b.a(i0());
                }
            } else {
                oVar = oVar2;
                i10 = i12;
                hVar = this;
            }
            Object obj3 = obj;
            int i13 = hVar.i1(oVar, i10, obj3, j10, obj2, v02);
            oVar2 = oVar;
            if (i13 == 0) {
                oVar2.c();
                return n.f10366b.c(Unit.INSTANCE);
            }
            if (i13 == 1) {
                return n.f10366b.c(Unit.INSTANCE);
            }
            if (i13 == 2) {
                if (v02) {
                    oVar2.t();
                    return n.f10366b.a(i0());
                }
                l1 l1Var = obj2 instanceof l1 ? (l1) obj2 : null;
                if (l1Var != null) {
                    P0(l1Var, oVar2, i10);
                }
                T((oVar2.f10763c * i11) + i10);
                return n.f10366b.c(Unit.INSTANCE);
            }
            if (i13 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (i13 == 4) {
                if (j10 < h0()) {
                    oVar2.c();
                }
                return n.f10366b.a(i0());
            }
            if (i13 == 5) {
                oVar2.c();
            }
            obj = obj3;
        }
    }

    public final Throwable e0() {
        Throwable b02 = b0();
        return b02 == null ? new s("Channel was closed") : b02;
    }

    public final boolean e1(o oVar, int i10, long j10) {
        G g10;
        G g11;
        Object B10 = oVar.B(i10);
        if ((B10 instanceof l1) && j10 >= f10318e.get(this)) {
            g10 = i.f10348g;
            if (oVar.v(i10, B10, g10)) {
                if (c1(B10, oVar, i10)) {
                    oVar.F(i10, i.f10345d);
                    return true;
                }
                g11 = i.f10351j;
                oVar.F(i10, g11);
                oVar.C(i10, false);
                return false;
            }
        }
        return f1(oVar, i10, j10);
    }

    public final boolean f1(o oVar, int i10, long j10) {
        G g10;
        G g11;
        G g12;
        G g13;
        G g14;
        G g15;
        G g16;
        G g17;
        while (true) {
            Object B10 = oVar.B(i10);
            if (!(B10 instanceof l1)) {
                g12 = i.f10351j;
                if (B10 != g12) {
                    if (B10 != null) {
                        if (B10 != i.f10345d) {
                            g14 = i.f10349h;
                            if (B10 == g14) {
                                break;
                            }
                            g15 = i.f10350i;
                            if (B10 == g15) {
                                break;
                            }
                            g16 = i.f10352k;
                            if (B10 == g16 || B10 == i.z()) {
                                return true;
                            }
                            g17 = i.f10347f;
                            if (B10 != g17) {
                                throw new IllegalStateException(("Unexpected cell state: " + B10).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        g13 = i.f10346e;
                        if (oVar.v(i10, B10, g13)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j10 >= f10318e.get(this)) {
                g10 = i.f10348g;
                if (oVar.v(i10, B10, g10)) {
                    if (c1(B10, oVar, i10)) {
                        oVar.F(i10, i.f10345d);
                        return true;
                    }
                    g11 = i.f10351j;
                    oVar.F(i10, g11);
                    oVar.C(i10, false);
                    return false;
                }
            } else if (oVar.v(i10, B10, new C((l1) B10))) {
                return true;
            }
        }
    }

    @Override // Rh.B
    public void g(Function1 function1) {
        G g10;
        G g11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        G g12;
        G g13;
        if (AbstractC4221b.a(f10325l, this, null, function1)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10325l;
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            g10 = i.f10358q;
            if (obj != g10) {
                g11 = i.f10359r;
                if (obj == g11) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f10325l;
            g12 = i.f10358q;
            g13 = i.f10359r;
        } while (!AbstractC4221b.a(atomicReferenceFieldUpdater, this, g12, g13));
        function1.invoke(b0());
    }

    public final Object g1(o oVar, int i10, long j10, Object obj) {
        G g10;
        G g11;
        G g12;
        Object B10 = oVar.B(i10);
        if (B10 == null) {
            if (j10 >= (f10317d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    g12 = i.f10355n;
                    return g12;
                }
                if (oVar.v(i10, B10, obj)) {
                    U();
                    g11 = i.f10354m;
                    return g11;
                }
            }
        } else if (B10 == i.f10345d) {
            g10 = i.f10350i;
            if (oVar.v(i10, B10, g10)) {
                U();
                return oVar.D(i10);
            }
        }
        return h1(oVar, i10, j10, obj);
    }

    @Override // Rh.B
    public Object h(Object obj) {
        Object obj2;
        Object obj3;
        int i10;
        o oVar;
        h hVar;
        if (a1(f10317d.get(this))) {
            return n.f10366b.b();
        }
        obj2 = i.f10351j;
        o oVar2 = (o) j0().get(this);
        while (true) {
            long andIncrement = k0().getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean v02 = v0(andIncrement);
            int i11 = i.f10343b;
            long j11 = j10 / i11;
            int i12 = (int) (j10 % i11);
            if (oVar2.f10763c != j11) {
                o X10 = X(j11, oVar2);
                if (X10 != null) {
                    i10 = i12;
                    oVar = X10;
                    hVar = this;
                    obj3 = obj;
                } else if (v02) {
                    return n.f10366b.a(i0());
                }
            } else {
                obj3 = obj;
                i10 = i12;
                oVar = oVar2;
                hVar = this;
            }
            int i13 = hVar.i1(oVar, i10, obj3, j10, obj2, v02);
            oVar2 = oVar;
            if (i13 == 0) {
                oVar2.c();
                return n.f10366b.c(Unit.INSTANCE);
            }
            if (i13 == 1) {
                return n.f10366b.c(Unit.INSTANCE);
            }
            if (i13 == 2) {
                if (v02) {
                    oVar2.t();
                    return n.f10366b.a(i0());
                }
                l1 l1Var = obj2 instanceof l1 ? (l1) obj2 : null;
                if (l1Var != null) {
                    P0(l1Var, oVar2, i10);
                }
                oVar2.t();
                return n.f10366b.b();
            }
            if (i13 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (i13 == 4) {
                if (j10 < h0()) {
                    oVar2.c();
                }
                return n.f10366b.a(i0());
            }
            if (i13 == 5) {
                oVar2.c();
            }
            obj = obj3;
        }
    }

    public final long h0() {
        return f10318e.get(this);
    }

    public final Object h1(o oVar, int i10, long j10, Object obj) {
        G g10;
        G g11;
        G g12;
        G g13;
        G g14;
        G g15;
        G g16;
        G g17;
        G g18;
        G g19;
        G g20;
        G g21;
        G g22;
        G g23;
        G g24;
        G g25;
        while (true) {
            Object B10 = oVar.B(i10);
            if (B10 != null) {
                g14 = i.f10346e;
                if (B10 != g14) {
                    if (B10 == i.f10345d) {
                        g15 = i.f10350i;
                        if (oVar.v(i10, B10, g15)) {
                            U();
                            return oVar.D(i10);
                        }
                    } else {
                        g16 = i.f10351j;
                        if (B10 == g16) {
                            g17 = i.f10356o;
                            return g17;
                        }
                        g18 = i.f10349h;
                        if (B10 == g18) {
                            g19 = i.f10356o;
                            return g19;
                        }
                        if (B10 == i.z()) {
                            U();
                            g20 = i.f10356o;
                            return g20;
                        }
                        g21 = i.f10348g;
                        if (B10 != g21) {
                            g22 = i.f10347f;
                            if (oVar.v(i10, B10, g22)) {
                                boolean z10 = B10 instanceof C;
                                if (z10) {
                                    B10 = ((C) B10).f10306a;
                                }
                                if (c1(B10, oVar, i10)) {
                                    g25 = i.f10350i;
                                    oVar.F(i10, g25);
                                    U();
                                    return oVar.D(i10);
                                }
                                g23 = i.f10351j;
                                oVar.F(i10, g23);
                                oVar.C(i10, false);
                                if (z10) {
                                    U();
                                }
                                g24 = i.f10356o;
                                return g24;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j10 < (f10317d.get(this) & 1152921504606846975L)) {
                g10 = i.f10349h;
                if (oVar.v(i10, B10, g10)) {
                    U();
                    g11 = i.f10356o;
                    return g11;
                }
            } else {
                if (obj == null) {
                    g12 = i.f10355n;
                    return g12;
                }
                if (oVar.v(i10, B10, obj)) {
                    U();
                    g13 = i.f10354m;
                    return g13;
                }
            }
        }
    }

    @Override // Rh.A
    public Object i() {
        Object obj;
        o oVar;
        G g10;
        G g11;
        G g12;
        long j10 = f10318e.get(this);
        long j11 = f10317d.get(this);
        if (u0(j11)) {
            return n.f10366b.a(b0());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return n.f10366b.b();
        }
        obj = i.f10352k;
        o oVar2 = (o) f0().get(this);
        while (!t0()) {
            long andIncrement = g0().getAndIncrement(this);
            int i10 = i.f10343b;
            long j12 = andIncrement / i10;
            int i11 = (int) (andIncrement % i10);
            if (oVar2.f10763c != j12) {
                oVar = W(j12, oVar2);
                if (oVar == null) {
                    continue;
                }
            } else {
                oVar = oVar2;
            }
            Object g13 = g1(oVar, i11, andIncrement, obj);
            g10 = i.f10354m;
            if (g13 == g10) {
                l1 l1Var = obj instanceof l1 ? (l1) obj : null;
                if (l1Var != null) {
                    O0(l1Var, oVar, i11);
                }
                m1(andIncrement);
                oVar.t();
                return n.f10366b.b();
            }
            g11 = i.f10356o;
            if (g13 != g11) {
                g12 = i.f10355n;
                if (g13 == g12) {
                    throw new IllegalStateException("unexpected");
                }
                oVar.c();
                return n.f10366b.c(g13);
            }
            if (andIncrement < l0()) {
                oVar.c();
            }
            oVar2 = oVar;
        }
        return n.f10366b.a(b0());
    }

    public final Throwable i0() {
        Throwable b02 = b0();
        return b02 == null ? new t("Channel was closed") : b02;
    }

    public final int i1(o oVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        G g10;
        G g11;
        G g12;
        oVar.G(i10, obj);
        if (z10) {
            return j1(oVar, i10, obj, j10, obj2, z10);
        }
        Object B10 = oVar.B(i10);
        if (B10 == null) {
            if (L(j10)) {
                if (oVar.v(i10, null, i.f10345d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (oVar.v(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (B10 instanceof l1) {
            oVar.w(i10);
            if (b1(B10, obj)) {
                g12 = i.f10350i;
                oVar.F(i10, g12);
                K0();
                return 0;
            }
            g10 = i.f10352k;
            Object x10 = oVar.x(i10, g10);
            g11 = i.f10352k;
            if (x10 == g11) {
                return 5;
            }
            oVar.C(i10, true);
            return 5;
        }
        return j1(oVar, i10, obj, j10, obj2, z10);
    }

    @Override // Rh.A
    public boolean isEmpty() {
        if (t0() || n0()) {
            return false;
        }
        return !t0();
    }

    @Override // Rh.A
    public l iterator() {
        return new a();
    }

    @Override // Rh.A
    public Object j(Continuation continuation) {
        return R0(this, continuation);
    }

    public final int j1(o oVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        G g10;
        G g11;
        G g12;
        G g13;
        G g14;
        G g15;
        G g16;
        while (true) {
            Object B10 = oVar.B(i10);
            if (B10 != null) {
                g11 = i.f10346e;
                if (B10 != g11) {
                    g12 = i.f10352k;
                    if (B10 == g12) {
                        oVar.w(i10);
                        return 5;
                    }
                    g13 = i.f10349h;
                    if (B10 == g13) {
                        oVar.w(i10);
                        return 5;
                    }
                    if (B10 == i.z()) {
                        oVar.w(i10);
                        S();
                        return 4;
                    }
                    oVar.w(i10);
                    if (B10 instanceof C) {
                        B10 = ((C) B10).f10306a;
                    }
                    if (b1(B10, obj)) {
                        g16 = i.f10350i;
                        oVar.F(i10, g16);
                        K0();
                        return 0;
                    }
                    g14 = i.f10352k;
                    Object x10 = oVar.x(i10, g14);
                    g15 = i.f10352k;
                    if (x10 != g15) {
                        oVar.C(i10, true);
                    }
                    return 5;
                }
                if (oVar.v(i10, B10, i.f10345d)) {
                    return 1;
                }
            } else if (!L(j10) || z10) {
                if (z10) {
                    g10 = i.f10351j;
                    if (oVar.v(i10, null, g10)) {
                        oVar.C(i10, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (oVar.v(i10, null, obj2)) {
                        return 2;
                    }
                }
            } else if (oVar.v(i10, null, i.f10345d)) {
                return 1;
            }
        }
    }

    public final void k1(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10318e;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
            long j12 = j10;
            if (f10318e.compareAndSet(this, j11, j12)) {
                return;
            } else {
                j10 = j12;
            }
        }
    }

    public final long l0() {
        return f10317d.get(this) & 1152921504606846975L;
    }

    public final void l1(long j10) {
        long j11;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10317d;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            long j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            } else {
                w10 = i.w(j12, (int) (j11 >> 60));
            }
        } while (!f10317d.compareAndSet(this, j11, w10));
    }

    @Override // Rh.A
    public Object m(Continuation continuation) {
        return Q0(this, continuation);
    }

    public final void m1(long j10) {
        int i10;
        long v10;
        long v11;
        long v12;
        h hVar = this;
        if (hVar.x0()) {
            return;
        }
        while (hVar.Z() <= j10) {
            hVar = this;
        }
        i10 = i.f10344c;
        for (int i11 = 0; i11 < i10; i11++) {
            long Z10 = hVar.Z();
            if (Z10 == (DurationKt.MAX_MILLIS & f10320g.get(hVar)) && Z10 == hVar.Z()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10320g;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(hVar);
            v10 = i.v(j11 & DurationKt.MAX_MILLIS, true);
            if (atomicLongFieldUpdater.compareAndSet(hVar, j11, v10)) {
                break;
            } else {
                hVar = this;
            }
        }
        while (true) {
            long Z11 = hVar.Z();
            long j12 = f10320g.get(hVar);
            long j13 = j12 & DurationKt.MAX_MILLIS;
            boolean z10 = (4611686018427387904L & j12) != 0;
            if (Z11 == j13 && Z11 == hVar.Z()) {
                break;
            }
            if (z10) {
                hVar = this;
            } else {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10320g;
                v11 = i.v(j13, true);
                hVar = this;
                atomicLongFieldUpdater2.compareAndSet(hVar, j12, v11);
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater3 = f10320g;
        while (true) {
            long j14 = atomicLongFieldUpdater3.get(hVar);
            v12 = i.v(j14 & DurationKt.MAX_MILLIS, false);
            boolean compareAndSet = atomicLongFieldUpdater3.compareAndSet(hVar, j14, v12);
            AtomicLongFieldUpdater atomicLongFieldUpdater4 = atomicLongFieldUpdater3;
            if (compareAndSet) {
                return;
            }
            atomicLongFieldUpdater3 = atomicLongFieldUpdater4;
            hVar = this;
        }
    }

    public final boolean n0() {
        while (true) {
            o oVar = (o) f10322i.get(this);
            long h02 = h0();
            if (l0() <= h02) {
                return false;
            }
            int i10 = i.f10343b;
            long j10 = h02 / i10;
            if (oVar.f10763c == j10 || (oVar = W(j10, oVar)) != null) {
                oVar.c();
                if (r0(oVar, (int) (h02 % i10), h02)) {
                    return true;
                }
                f10318e.compareAndSet(this, h02, 1 + h02);
            } else if (((o) f10322i.get(this)).f10763c < j10) {
                return false;
            }
        }
    }

    @Override // Rh.B
    public Object o(Object obj, Continuation continuation) {
        return Y0(this, obj, continuation);
    }

    public final void o0(long j10) {
        if ((f10320g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            while ((f10320g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    @Override // Rh.B
    public boolean p() {
        return v0(f10317d.get(this));
    }

    public final void q0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10325l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractC4221b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? i.f10358q : i.f10359r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(b0());
    }

    public final boolean r0(o oVar, int i10, long j10) {
        Object B10;
        G g10;
        G g11;
        G g12;
        G g13;
        G g14;
        G g15;
        G g16;
        do {
            B10 = oVar.B(i10);
            if (B10 != null) {
                g11 = i.f10346e;
                if (B10 != g11) {
                    if (B10 == i.f10345d) {
                        return true;
                    }
                    g12 = i.f10351j;
                    if (B10 == g12 || B10 == i.z()) {
                        return false;
                    }
                    g13 = i.f10350i;
                    if (B10 == g13) {
                        return false;
                    }
                    g14 = i.f10349h;
                    if (B10 == g14) {
                        return false;
                    }
                    g15 = i.f10348g;
                    if (B10 == g15) {
                        return true;
                    }
                    g16 = i.f10347f;
                    return B10 != g16 && j10 == h0();
                }
            }
            g10 = i.f10349h;
        } while (!oVar.v(i10, B10, g10));
        U();
        return false;
    }

    public final boolean s0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            R(j10 & 1152921504606846975L);
            return (z10 && n0()) ? false : true;
        }
        if (i10 == 3) {
            Q(j10 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }

    public boolean t0() {
        return u0(f10317d.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d7, code lost:
    
        r16 = r7;
        r3 = (Rh.o) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e0, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z10;
        G g10;
        String str;
        G g11;
        G g12;
        G g13;
        G g14;
        G g15;
        G g16;
        o oVar;
        StringBuilder sb2 = new StringBuilder();
        int i10 = (int) (f10317d.get(this) >> 60);
        if (i10 == 2) {
            sb2.append("closed,");
        } else if (i10 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f10326a + ',');
        sb2.append("data=[");
        int i11 = 0;
        boolean z11 = true;
        List listOf = CollectionsKt.listOf((Object[]) new o[]{f10322i.get(this), f10321h.get(this), f10323j.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            o oVar2 = (o) obj;
            oVar = i.f10342a;
            if (oVar2 != oVar) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j10 = ((o) next).f10763c;
            do {
                Object next2 = it.next();
                long j11 = ((o) next2).f10763c;
                if (j10 > j11) {
                    next = next2;
                    j10 = j11;
                }
            } while (it.hasNext());
        }
        o oVar3 = (o) next;
        long h02 = h0();
        long l02 = l0();
        loop2: while (true) {
            int i12 = i.f10343b;
            int i13 = i11;
            while (true) {
                if (i13 >= i12) {
                    break;
                }
                long j12 = (oVar3.f10763c * i.f10343b) + i13;
                if (j12 >= l02 && j12 >= h02) {
                    break loop2;
                }
                Object B10 = oVar3.B(i13);
                Object A10 = oVar3.A(i13);
                boolean z12 = z11;
                if (B10 instanceof InterfaceC1465n) {
                    str = (j12 >= h02 || j12 < l02) ? (j12 >= l02 || j12 < h02) ? "cont" : "send" : "receive";
                } else if (B10 instanceof Vh.f) {
                    str = (j12 >= h02 || j12 < l02) ? (j12 >= l02 || j12 < h02) ? "select" : "onSend" : "onReceive";
                } else if (B10 instanceof z) {
                    str = "receiveCatching";
                } else if (B10 instanceof C) {
                    str = "EB(" + B10 + ')';
                } else {
                    g10 = i.f10347f;
                    if (!Intrinsics.areEqual(B10, g10)) {
                        g11 = i.f10348g;
                        if (!Intrinsics.areEqual(B10, g11)) {
                            if (B10 != null) {
                                g12 = i.f10346e;
                                if (!Intrinsics.areEqual(B10, g12)) {
                                    g13 = i.f10350i;
                                    if (!Intrinsics.areEqual(B10, g13)) {
                                        g14 = i.f10349h;
                                        if (!Intrinsics.areEqual(B10, g14)) {
                                            g15 = i.f10352k;
                                            if (!Intrinsics.areEqual(B10, g15)) {
                                                g16 = i.f10351j;
                                                if (!Intrinsics.areEqual(B10, g16) && !Intrinsics.areEqual(B10, i.z())) {
                                                    str = B10.toString();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i13++;
                            z11 = z12;
                        }
                    }
                    str = "resuming_sender";
                }
                if (A10 != null) {
                    sb2.append('(' + str + ',' + A10 + "),");
                } else {
                    sb2.append(str + ',');
                }
                i13++;
                z11 = z12;
            }
            z11 = z10;
            i11 = 0;
        }
        if (StringsKt.last(sb2) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final boolean u0(long j10) {
        return s0(j10, true);
    }

    public final boolean v0(long j10) {
        return s0(j10, false);
    }

    public boolean w0() {
        return false;
    }

    public final boolean x0() {
        long Z10 = Z();
        return Z10 == 0 || Z10 == LongCompanionObject.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (Rh.o) r8.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long y0(o oVar) {
        G g10;
        do {
            int i10 = i.f10343b;
            while (true) {
                i10--;
                if (-1 >= i10) {
                    break;
                }
                long j10 = (oVar.f10763c * i.f10343b) + i10;
                if (j10 < h0()) {
                    return -1L;
                }
                while (true) {
                    Object B10 = oVar.B(i10);
                    if (B10 != null) {
                        g10 = i.f10346e;
                        if (B10 != g10) {
                            if (B10 == i.f10345d) {
                                return j10;
                            }
                        }
                    }
                    if (oVar.v(i10, B10, i.z())) {
                        oVar.t();
                        break;
                    }
                }
            }
        } while (oVar != null);
        return -1L;
    }

    public final void z0() {
        long j10;
        long w10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10317d;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            } else {
                w10 = i.w(1152921504606846975L & j10, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, w10));
    }

    public void F0() {
    }

    public void K0() {
    }

    public void L0() {
    }
}
