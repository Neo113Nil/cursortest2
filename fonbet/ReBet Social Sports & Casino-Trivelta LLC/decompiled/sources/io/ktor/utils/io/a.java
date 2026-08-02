package io.ktor.utils.io;

import Ph.C0;
import Ph.C1469p;
import Ph.InterfaceC1465n;
import f0.AbstractC4221b;
import io.ktor.utils.io.internal.f;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kh.AbstractC5255a;
import kh.AbstractC5259e;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import lh.C5466a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class a implements io.ktor.utils.io.c, io.ktor.utils.io.f, io.ktor.utils.io.i {

    /* renamed from: l, reason: collision with root package name */
    public static final C0729a f49338l = new C0729a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49339m = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_state");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49340n = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_closed");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49341o = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_readOp");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49342p = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_writeOp");

    @NotNull
    private volatile /* synthetic */ Object _closed;

    @NotNull
    private volatile /* synthetic */ Object _readOp;

    @NotNull
    private volatile /* synthetic */ Object _state;

    @NotNull
    volatile /* synthetic */ Object _writeOp;

    @Nullable
    private volatile C0 attachedJob;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f49343b;

    /* renamed from: c, reason: collision with root package name */
    public final mh.f f49344c;

    /* renamed from: d, reason: collision with root package name */
    public final int f49345d;

    /* renamed from: e, reason: collision with root package name */
    public int f49346e;

    /* renamed from: f, reason: collision with root package name */
    public int f49347f;

    /* renamed from: g, reason: collision with root package name */
    public final io.ktor.utils.io.internal.e f49348g;

    /* renamed from: h, reason: collision with root package name */
    public final io.ktor.utils.io.internal.j f49349h;

    /* renamed from: i, reason: collision with root package name */
    public final io.ktor.utils.io.internal.a f49350i;

    /* renamed from: j, reason: collision with root package name */
    public final io.ktor.utils.io.internal.a f49351j;

    @Nullable
    private volatile io.ktor.utils.io.internal.c joining;

    /* renamed from: k, reason: collision with root package name */
    public final Function1 f49352k;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    /* renamed from: io.ktor.utils.io.a$a, reason: collision with other inner class name */
    public static final class C0729a {
        public /* synthetic */ C0729a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0729a() {
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            a.this.attachedJob = null;
            if (th2 == null) {
                return;
            }
            a.this.cancel(p.a(th2));
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f49354n;

        /* renamed from: o, reason: collision with root package name */
        public Object f49355o;

        /* renamed from: p, reason: collision with root package name */
        public int f49356p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f49357q;

        /* renamed from: s, reason: collision with root package name */
        public int f49359s;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49357q = obj;
            this.f49359s |= Integer.MIN_VALUE;
            return a.this.F(0, null, this);
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: A, reason: collision with root package name */
        public /* synthetic */ Object f49360A;

        /* renamed from: C, reason: collision with root package name */
        public int f49362C;

        /* renamed from: n, reason: collision with root package name */
        public Object f49363n;

        /* renamed from: o, reason: collision with root package name */
        public Object f49364o;

        /* renamed from: p, reason: collision with root package name */
        public Object f49365p;

        /* renamed from: q, reason: collision with root package name */
        public Object f49366q;

        /* renamed from: r, reason: collision with root package name */
        public Object f49367r;

        /* renamed from: s, reason: collision with root package name */
        public Object f49368s;

        /* renamed from: t, reason: collision with root package name */
        public Object f49369t;

        /* renamed from: u, reason: collision with root package name */
        public Object f49370u;

        /* renamed from: v, reason: collision with root package name */
        public Object f49371v;

        /* renamed from: w, reason: collision with root package name */
        public Object f49372w;

        /* renamed from: x, reason: collision with root package name */
        public long f49373x;

        /* renamed from: y, reason: collision with root package name */
        public long f49374y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f49375z;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49360A = obj;
            this.f49362C |= Integer.MIN_VALUE;
            return a.this.J(null, 0L, null, this);
        }
    }

    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f49376n;

        /* renamed from: o, reason: collision with root package name */
        public Object f49377o;

        /* renamed from: p, reason: collision with root package name */
        public int f49378p;

        /* renamed from: q, reason: collision with root package name */
        public int f49379q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f49380r;

        /* renamed from: t, reason: collision with root package name */
        public int f49382t;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49380r = obj;
            this.f49382t |= Integer.MIN_VALUE;
            return a.this.b0(null, 0, 0, this);
        }
    }

    public static final class f extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f49383n;

        /* renamed from: o, reason: collision with root package name */
        public Object f49384o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f49385p;

        /* renamed from: r, reason: collision with root package name */
        public int f49387r;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49385p = obj;
            this.f49387r |= Integer.MIN_VALUE;
            return a.this.a0(null, this);
        }
    }

    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f49388n;

        /* renamed from: o, reason: collision with root package name */
        public Object f49389o;

        /* renamed from: p, reason: collision with root package name */
        public Object f49390p;

        /* renamed from: q, reason: collision with root package name */
        public Object f49391q;

        /* renamed from: r, reason: collision with root package name */
        public Object f49392r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f49393s;

        /* renamed from: u, reason: collision with root package name */
        public int f49395u;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49393s = obj;
            this.f49395u |= Integer.MIN_VALUE;
            return a.this.d0(0L, this);
        }
    }

    public static final class h extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f49396n;

        /* renamed from: o, reason: collision with root package name */
        public int f49397o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f49398p;

        /* renamed from: r, reason: collision with root package name */
        public int f49400r;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49398p = obj;
            this.f49400r |= Integer.MIN_VALUE;
            return a.this.f0(0, this);
        }
    }

    public static final class i extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f49401n;

        /* renamed from: o, reason: collision with root package name */
        public int f49402o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f49403p;

        /* renamed from: r, reason: collision with root package name */
        public int f49405r;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49403p = obj;
            this.f49405r |= Integer.MIN_VALUE;
            return a.this.g0(0, this);
        }
    }

    public static final class j extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f49406n;

        /* renamed from: o, reason: collision with root package name */
        public Object f49407o;

        /* renamed from: p, reason: collision with root package name */
        public int f49408p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f49409q;

        /* renamed from: s, reason: collision with root package name */
        public int f49411s;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49409q = obj;
            this.f49411s |= Integer.MIN_VALUE;
            return a.z0(a.this, 0, null, this);
        }
    }

    public static final class k extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f49412n;

        /* renamed from: o, reason: collision with root package name */
        public Object f49413o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f49414p;

        /* renamed from: r, reason: collision with root package name */
        public int f49416r;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49414p = obj;
            this.f49416r |= Integer.MIN_VALUE;
            return a.this.H0(null, this);
        }
    }

    public static final class l extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f49417n;

        /* renamed from: o, reason: collision with root package name */
        public Object f49418o;

        /* renamed from: p, reason: collision with root package name */
        public int f49419p;

        /* renamed from: q, reason: collision with root package name */
        public int f49420q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f49421r;

        /* renamed from: t, reason: collision with root package name */
        public int f49423t;

        public l(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49421r = obj;
            this.f49423t |= Integer.MIN_VALUE;
            return a.this.I0(null, 0, 0, this);
        }
    }

    public static final class m extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f49424n;

        /* renamed from: o, reason: collision with root package name */
        public Object f49425o;

        /* renamed from: p, reason: collision with root package name */
        public int f49426p;

        /* renamed from: q, reason: collision with root package name */
        public int f49427q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f49428r;

        /* renamed from: t, reason: collision with root package name */
        public int f49430t;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49428r = obj;
            this.f49430t |= Integer.MIN_VALUE;
            return a.this.K0(null, 0, 0, this);
        }
    }

    public static final class n extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f49431n;

        /* renamed from: o, reason: collision with root package name */
        public int f49432o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f49433p;

        /* renamed from: r, reason: collision with root package name */
        public int f49435r;

        public n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f49433p = obj;
            this.f49435r |= Integer.MIN_VALUE;
            return a.this.J0(0, this);
        }
    }

    public static final class o extends Lambda implements Function1 {
        public o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation ucont) {
            Throwable c10;
            Intrinsics.checkNotNullParameter(ucont, "ucont");
            int i10 = a.this.writeSuspensionSize;
            while (true) {
                io.ktor.utils.io.internal.b M10 = a.this.M();
                if (M10 != null && (c10 = M10.c()) != null) {
                    io.ktor.utils.io.b.b(c10);
                    throw new KotlinNothingValueException();
                }
                if (!a.this.M0(i10)) {
                    Result.Companion companion = Result.INSTANCE;
                    ucont.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
                    break;
                }
                a aVar = a.this;
                Continuation intercepted = IntrinsicsKt.intercepted(ucont);
                a aVar2 = a.this;
                while (aVar.R() == null) {
                    if (!aVar2.M0(i10)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.f49342p;
                    if (AbstractC4221b.a(atomicReferenceFieldUpdater, aVar, null, intercepted)) {
                        if (aVar2.M0(i10) || !AbstractC4221b.a(atomicReferenceFieldUpdater, aVar, intercepted, null)) {
                            break;
                        }
                    }
                }
                throw new IllegalStateException("Operation is already in progress");
            }
            a.this.L(i10);
            if (a.this.u0()) {
                a.this.n0();
            }
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
    }

    public a(boolean z10, mh.f pool, int i10) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.f49343b = z10;
        this.f49344c = pool;
        this.f49345d = i10;
        this._state = f.a.f49468c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        this.f49348g = new io.ktor.utils.io.internal.e(this);
        this.f49349h = new io.ktor.utils.io.internal.j(this);
        this.f49350i = new io.ktor.utils.io.internal.a();
        this.f49351j = new io.ktor.utils.io.internal.a();
        this.f49352k = new o();
    }

    public static /* synthetic */ Object E0(a aVar, byte[] bArr, int i10, int i11, Continuation continuation) {
        aVar.getClass();
        int B02 = aVar.B0(bArr, i10, i11);
        return B02 > 0 ? Boxing.boxInt(B02) : aVar.K0(bArr, i10, i11, continuation);
    }

    public static /* synthetic */ Object F0(a aVar, AbstractC5255a abstractC5255a, Continuation continuation) {
        aVar.A0(abstractC5255a);
        if (abstractC5255a.j() <= abstractC5255a.h()) {
            return Unit.INSTANCE;
        }
        Object H02 = aVar.H0(abstractC5255a, continuation);
        return H02 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? H02 : Unit.INSTANCE;
    }

    public static /* synthetic */ Object G0(a aVar, byte[] bArr, int i10, int i11, Continuation continuation) {
        aVar.getClass();
        while (i11 > 0) {
            int B02 = aVar.B0(bArr, i10, i11);
            if (B02 == 0) {
                break;
            }
            i10 += B02;
            i11 -= B02;
        }
        if (i11 == 0) {
            return Unit.INSTANCE;
        }
        Object I02 = aVar.I0(bArr, i10, i11, continuation);
        return I02 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I02 : Unit.INSTANCE;
    }

    public static /* synthetic */ int X(a aVar, AbstractC5255a abstractC5255a, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAsMuchAsPossible");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = abstractC5255a.f() - abstractC5255a.j();
        }
        return aVar.V(abstractC5255a, i10, i11);
    }

    public static /* synthetic */ Object Y(a aVar, C5466a c5466a, Continuation continuation) {
        int X10 = X(aVar, c5466a, 0, 0, 6, null);
        if (X10 == 0 && aVar.M() != null) {
            X10 = aVar.O().f49467b.e() ? X(aVar, c5466a, 0, 0, 6, null) : -1;
        } else if (X10 <= 0 && c5466a.f() > c5466a.j()) {
            return aVar.a0(c5466a, continuation);
        }
        return Boxing.boxInt(X10);
    }

    public static /* synthetic */ Object Z(a aVar, byte[] bArr, int i10, int i11, Continuation continuation) {
        int W10 = aVar.W(bArr, i10, i11);
        if (W10 == 0 && aVar.M() != null) {
            W10 = aVar.O().f49467b.e() ? aVar.W(bArr, i10, i11) : -1;
        } else if (W10 <= 0 && i11 != 0) {
            return aVar.b0(bArr, i10, i11, continuation);
        }
        return Boxing.boxInt(W10);
    }

    public static /* synthetic */ Object c0(a aVar, long j10, Continuation continuation) {
        if (!aVar.S()) {
            return aVar.d0(j10, continuation);
        }
        Throwable c10 = aVar.c();
        if (c10 == null) {
            return aVar.i0(j10);
        }
        io.ktor.utils.io.b.b(c10);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object z0(a aVar, int i10, Function1 function1, Continuation continuation) {
        j jVar;
        int i11;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i12 = jVar.f49411s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                jVar.f49411s = i12 - Integer.MIN_VALUE;
                Object obj = jVar.f49409q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = jVar.f49411s;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (i10 <= 0) {
                        throw new IllegalArgumentException("min should be positive");
                    }
                    if (i10 > 4088) {
                        throw new IllegalArgumentException(("Min(" + i10 + ") should'nt be greater than (4088)").toString());
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i13 = jVar.f49408p;
                    Function1 function12 = (Function1) jVar.f49407o;
                    a aVar2 = (a) jVar.f49406n;
                    ResultKt.throwOnFailure(obj);
                    i10 = i13;
                    aVar = aVar2;
                    function1 = function12;
                }
                while (aVar.C0(i10, function1) < 0) {
                    jVar.f49406n = aVar;
                    jVar.f49407o = function1;
                    jVar.f49408p = i10;
                    jVar.f49411s = 1;
                    if (aVar.F(i10, function1, jVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        jVar = aVar.new j(continuation);
        Object obj2 = jVar.f49409q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = jVar.f49411s;
        if (i11 != 0) {
        }
        while (aVar.C0(i10, function1) < 0) {
        }
        return Unit.INSTANCE;
    }

    public final int A0(AbstractC5255a abstractC5255a) {
        ByteBuffer t02 = t0();
        int i10 = 0;
        if (t02 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.h hVar = O().f49467b;
        Q();
        try {
            io.ktor.utils.io.internal.b M10 = M();
            if (M10 != null) {
                io.ktor.utils.io.b.b(M10.c());
                throw new KotlinNothingValueException();
            }
            while (true) {
                int o10 = hVar.o(Math.min(abstractC5255a.j() - abstractC5255a.h(), t02.remaining()));
                if (o10 == 0) {
                    break;
                }
                kh.g.a(abstractC5255a, t02, o10);
                i10 += o10;
                U(t02, I(t02, this.f49347f + i10), hVar._availableForWrite$internal);
            }
            H(t02, hVar, i10);
            if (hVar.h() || l()) {
                flush();
            }
            l0();
            x0();
            return i10;
        } catch (Throwable th2) {
            if (hVar.h() || l()) {
                flush();
            }
            l0();
            x0();
            throw th2;
        }
    }

    public final int B0(byte[] bArr, int i10, int i11) {
        ByteBuffer t02 = t0();
        int i12 = 0;
        if (t02 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.h hVar = O().f49467b;
        Q();
        try {
            io.ktor.utils.io.internal.b M10 = M();
            if (M10 != null) {
                io.ktor.utils.io.b.b(M10.c());
                throw new KotlinNothingValueException();
            }
            while (true) {
                int o10 = hVar.o(Math.min(i11 - i12, t02.remaining()));
                if (o10 == 0) {
                    H(t02, hVar, i12);
                    if (hVar.h() || l()) {
                        flush();
                    }
                    l0();
                    x0();
                    return i12;
                }
                if (o10 <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                t02.put(bArr, i10 + i12, o10);
                i12 += o10;
                U(t02, I(t02, this.f49347f + i12), hVar._availableForWrite$internal);
            }
        } catch (Throwable th2) {
            if (hVar.h() || l()) {
                flush();
            }
            l0();
            x0();
            throw th2;
        }
    }

    /* JADX WARN: Finally extract failed */
    public int C0(int i10, Function1 block) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(block, "block");
        if (i10 <= 0) {
            throw new IllegalArgumentException("min should be positive");
        }
        if (i10 > 4088) {
            throw new IllegalArgumentException(("Min(" + i10 + ") shouldn't be greater than 4088").toString());
        }
        ByteBuffer t02 = t0();
        int i13 = 0;
        if (t02 == null) {
            i12 = 0;
        } else {
            io.ktor.utils.io.internal.h hVar = O().f49467b;
            Q();
            try {
                io.ktor.utils.io.internal.b M10 = M();
                if (M10 != null) {
                    io.ktor.utils.io.b.b(M10.c());
                    throw new KotlinNothingValueException();
                }
                int n10 = hVar.n(i10);
                if (n10 <= 0) {
                    i11 = 0;
                } else {
                    U(t02, this.f49347f, n10);
                    int position = t02.position();
                    int limit = t02.limit();
                    block.invoke(t02);
                    if (limit != t02.limit()) {
                        throw new IllegalStateException("Buffer limit modified");
                    }
                    i13 = t02.position() - position;
                    if (i13 < 0) {
                        throw new IllegalStateException("Position has been moved backward: pushback is not supported");
                    }
                    if (i13 < 0) {
                        throw new IllegalStateException();
                    }
                    H(t02, hVar, i13);
                    if (i13 < n10) {
                        hVar.a(n10 - i13);
                    }
                    i11 = 1;
                }
                if (hVar.h() || l()) {
                    flush();
                }
                l0();
                x0();
                int i14 = i13;
                i13 = i11;
                i12 = i14;
            } catch (Throwable th2) {
                if (hVar.h() || l()) {
                    flush();
                }
                l0();
                x0();
                throw th2;
            }
        }
        if (i13 == 0) {
            return -1;
        }
        return i12;
    }

    public Object D0(byte[] bArr, int i10, int i11, Continuation continuation) {
        return E0(this, bArr, i10, i11, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(int i10, Function1 function1, Continuation continuation) {
        c cVar;
        int i11;
        a aVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f49359s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f49359s = i12 - Integer.MIN_VALUE;
                Object obj = cVar.f49357q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = cVar.f49359s;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj);
                    cVar.f49354n = this;
                    cVar.f49355o = function1;
                    cVar.f49356p = i10;
                    cVar.f49359s = 1;
                    if (J0(i10, cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    aVar = (a) cVar.f49354n;
                    ResultKt.throwOnFailure(obj);
                }
                aVar.getClass();
                return Unit.INSTANCE;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f49357q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = cVar.f49359s;
        if (i11 != 0) {
        }
        aVar.getClass();
        return Unit.INSTANCE;
    }

    public final void G(ByteBuffer byteBuffer, io.ktor.utils.io.internal.h hVar, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f49346e = I(byteBuffer, this.f49346e + i10);
        hVar.a(i10);
        q0(P() + i10);
        o0();
    }

    public final void H(ByteBuffer byteBuffer, io.ktor.utils.io.internal.h hVar, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f49347f = I(byteBuffer, this.f49347f + i10);
        hVar.c(i10);
        r0(Q() + i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:17:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H0(AbstractC5255a abstractC5255a, Continuation continuation) {
        k kVar;
        int i10;
        a aVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f49416r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f49416r = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f49414p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = kVar.f49416r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar = this;
                    if (abstractC5255a.j() > abstractC5255a.h()) {
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    abstractC5255a = (AbstractC5255a) kVar.f49413o;
                    aVar = (a) kVar.f49412n;
                    ResultKt.throwOnFailure(obj);
                    aVar.getClass();
                    aVar.A0(abstractC5255a);
                    if (abstractC5255a.j() > abstractC5255a.h()) {
                        kVar.f49412n = aVar;
                        kVar.f49413o = abstractC5255a;
                        kVar.f49416r = 1;
                        if (aVar.y0(1, kVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar.getClass();
                        aVar.A0(abstractC5255a);
                        if (abstractC5255a.j() > abstractC5255a.h()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        kVar = new k(continuation);
        Object obj2 = kVar.f49414p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = kVar.f49416r;
        if (i10 != 0) {
        }
    }

    public final int I(ByteBuffer byteBuffer, int i10) {
        return i10 >= byteBuffer.capacity() - this.f49345d ? i10 - (byteBuffer.capacity() - this.f49345d) : i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0054 -> B:10:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I0(byte[] bArr, int i10, int i11, Continuation continuation) {
        l lVar;
        int i12;
        a aVar;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i13 = lVar.f49423t;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f49423t = i13 - Integer.MIN_VALUE;
                Object obj = lVar.f49421r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i12 = lVar.f49423t;
                if (i12 != 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar = this;
                    if (i11 > 0) {
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i14 = lVar.f49420q;
                    i10 = lVar.f49419p;
                    byte[] bArr2 = (byte[]) lVar.f49418o;
                    aVar = (a) lVar.f49417n;
                    ResultKt.throwOnFailure(obj);
                    int intValue = ((Number) obj).intValue();
                    i10 += intValue;
                    byte[] bArr3 = bArr2;
                    i11 = i14 - intValue;
                    bArr = bArr3;
                    if (i11 > 0) {
                        lVar.f49417n = aVar;
                        lVar.f49418o = bArr;
                        lVar.f49419p = i10;
                        lVar.f49420q = i11;
                        lVar.f49423t = 1;
                        obj = aVar.D0(bArr, i10, i11, lVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        int i15 = i11;
                        bArr2 = bArr;
                        i14 = i15;
                        int intValue2 = ((Number) obj).intValue();
                        i10 += intValue2;
                        byte[] bArr32 = bArr2;
                        i11 = i14 - intValue2;
                        bArr = bArr32;
                        if (i11 > 0) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        lVar = new l(continuation);
        Object obj2 = lVar.f49421r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i12 = lVar.f49423t;
        if (i12 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x02e5, code lost:
    
        if (r6 == r0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x011d, code lost:
    
        r2 = r3;
        r3 = r26;
        r4 = r27;
        r6 = r7;
        r5 = r16;
        r7 = r17;
        r10 = r21;
        r16 = r0;
        r0 = r1;
        r1 = r24;
        r24 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0334 A[Catch: all -> 0x004a, TryCatch #6 {all -> 0x004a, blocks: (B:14:0x0044, B:16:0x00ef, B:18:0x00f5, B:21:0x02b5, B:23:0x02bb, B:25:0x02c4, B:29:0x02e8, B:32:0x02f4, B:35:0x0101, B:81:0x030d, B:83:0x0313, B:86:0x031e, B:87:0x032b, B:88:0x0331, B:89:0x0319, B:163:0x0334, B:164:0x0337, B:169:0x006a), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f5 A[Catch: all -> 0x004a, TryCatch #6 {all -> 0x004a, blocks: (B:14:0x0044, B:16:0x00ef, B:18:0x00f5, B:21:0x02b5, B:23:0x02bb, B:25:0x02c4, B:29:0x02e8, B:32:0x02f4, B:35:0x0101, B:81:0x030d, B:83:0x0313, B:86:0x031e, B:87:0x032b, B:88:0x0331, B:89:0x0319, B:163:0x0334, B:164:0x0337, B:169:0x006a), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02bb A[Catch: all -> 0x004a, TryCatch #6 {all -> 0x004a, blocks: (B:14:0x0044, B:16:0x00ef, B:18:0x00f5, B:21:0x02b5, B:23:0x02bb, B:25:0x02c4, B:29:0x02e8, B:32:0x02f4, B:35:0x0101, B:81:0x030d, B:83:0x0313, B:86:0x031e, B:87:0x032b, B:88:0x0331, B:89:0x0319, B:163:0x0334, B:164:0x0337, B:169:0x006a), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123 A[Catch: all -> 0x0269, TRY_LEAVE, TryCatch #4 {all -> 0x0269, blocks: (B:41:0x011d, B:43:0x0123), top: B:40:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x028b A[Catch: all -> 0x0292, TryCatch #9 {all -> 0x0292, blocks: (B:56:0x0285, B:58:0x028b, B:62:0x029b, B:63:0x02aa, B:65:0x0296), top: B:55:0x0285 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029b A[Catch: all -> 0x0292, TryCatch #9 {all -> 0x0292, blocks: (B:56:0x0285, B:58:0x028b, B:62:0x029b, B:63:0x02aa, B:65:0x0296), top: B:55:0x0285 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0313 A[Catch: all -> 0x004a, TryCatch #6 {all -> 0x004a, blocks: (B:14:0x0044, B:16:0x00ef, B:18:0x00f5, B:21:0x02b5, B:23:0x02bb, B:25:0x02c4, B:29:0x02e8, B:32:0x02f4, B:35:0x0101, B:81:0x030d, B:83:0x0313, B:86:0x031e, B:87:0x032b, B:88:0x0331, B:89:0x0319, B:163:0x0334, B:164:0x0337, B:169:0x006a), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031e A[Catch: all -> 0x004a, TryCatch #6 {all -> 0x004a, blocks: (B:14:0x0044, B:16:0x00ef, B:18:0x00f5, B:21:0x02b5, B:23:0x02bb, B:25:0x02c4, B:29:0x02e8, B:32:0x02f4, B:35:0x0101, B:81:0x030d, B:83:0x0313, B:86:0x031e, B:87:0x032b, B:88:0x0331, B:89:0x0319, B:163:0x0334, B:164:0x0337, B:169:0x006a), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x02f7 -> B:16:0x00ef). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(a aVar, long j10, io.ktor.utils.io.internal.c cVar, Continuation continuation) {
        d dVar;
        int i10;
        a aVar2;
        boolean l10;
        Ref.LongRef longRef;
        a aVar3;
        long j11;
        io.ktor.utils.io.internal.c cVar2;
        a aVar4;
        io.ktor.utils.io.internal.h hVar;
        ByteBuffer byteBuffer;
        a aVar5;
        long j12;
        long j13;
        Ref.LongRef longRef2;
        a aVar6;
        a aVar7;
        Object obj;
        a aVar8;
        Throwable th2;
        a aVar9;
        long j14;
        d dVar2;
        io.ktor.utils.io.internal.h hVar2;
        Ref.LongRef longRef3;
        a aVar10;
        boolean z10;
        a aVar11;
        d dVar3;
        a aVar12;
        a aVar13;
        boolean z11;
        io.ktor.utils.io.internal.c cVar3;
        int i11;
        long j15;
        int i12;
        Object obj2;
        a aVar14;
        io.ktor.utils.io.internal.h hVar3;
        long j16;
        io.ktor.utils.io.internal.h hVar4;
        Object obj3;
        try {
            if (continuation instanceof d) {
                dVar = (d) continuation;
                int i13 = dVar.f49362C;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    dVar.f49362C = i13 - Integer.MIN_VALUE;
                    Object obj4 = dVar.f49360A;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = dVar.f49362C;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj4);
                        if (aVar.j()) {
                            if (aVar.c() != null) {
                                a(aVar.c());
                            }
                            return Boxing.boxLong(0L);
                        }
                        l10 = l();
                        try {
                            longRef = new Ref.LongRef();
                            aVar3 = aVar;
                            j11 = j10;
                            cVar2 = cVar;
                            aVar4 = this;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar2 = this;
                            aVar2.a(th);
                            throw th;
                        }
                    } else if (i10 == 1) {
                        j13 = dVar.f49374y;
                        l10 = dVar.f49375z;
                        j12 = dVar.f49373x;
                        a aVar15 = (a) dVar.f49372w;
                        ByteBuffer byteBuffer2 = (ByteBuffer) dVar.f49371v;
                        io.ktor.utils.io.internal.h hVar5 = (io.ktor.utils.io.internal.h) dVar.f49370u;
                        hVar = (io.ktor.utils.io.internal.h) dVar.f49369t;
                        aVar6 = (a) dVar.f49368s;
                        aVar8 = (a) dVar.f49367r;
                        longRef2 = (Ref.LongRef) dVar.f49366q;
                        android.support.v4.media.session.b.a(dVar.f49365p);
                        a aVar16 = (a) dVar.f49364o;
                        a aVar17 = (a) dVar.f49363n;
                        try {
                            ResultKt.throwOnFailure(obj4);
                            obj = coroutine_suspended;
                            io.ktor.utils.io.internal.h hVar6 = hVar;
                            aVar7 = aVar17;
                            a aVar18 = aVar16;
                            hVar = hVar5;
                            byteBuffer = byteBuffer2;
                            aVar5 = aVar15;
                            aVar4 = aVar8;
                            cVar2 = null;
                            try {
                                aVar5.getClass();
                                io.ktor.utils.io.internal.h hVar7 = hVar6;
                                long j17 = j13;
                                int i14 = hVar._availableForWrite$internal;
                                io.ktor.utils.io.internal.c cVar4 = cVar2;
                                a aVar19 = aVar18;
                                aVar5.U(byteBuffer, aVar5.f49347f, i14);
                                Ref.IntRef intRef = new Ref.IntRef();
                                ByteBuffer s02 = aVar19.s0();
                                if (s02 == null) {
                                    aVar12 = aVar11;
                                    z11 = z10;
                                } else {
                                    try {
                                        aVar12 = aVar11;
                                        try {
                                            io.ktor.utils.io.internal.h hVar8 = aVar19.O().f49467b;
                                            if (hVar8._availableForRead$internal == 0) {
                                                try {
                                                    aVar19.k0();
                                                    aVar19.x0();
                                                } catch (Throwable th4) {
                                                    th2 = th4;
                                                    hVar = hVar7;
                                                    aVar6 = aVar10;
                                                    aVar8 = aVar4;
                                                    j13 = j17;
                                                    if (!hVar.h()) {
                                                    }
                                                    aVar6.flush();
                                                    if (aVar6 != aVar8) {
                                                    }
                                                    aVar6.l0();
                                                    aVar6.x0();
                                                    throw th2;
                                                }
                                            } else {
                                                try {
                                                    i11 = i14;
                                                    j15 = j12;
                                                    int o10 = hVar.o((int) Math.min(s02.remaining(), Math.min(byteBuffer.remaining(), j15 - longRef3.element)));
                                                    if (o10 > 0) {
                                                        if (!hVar8.m(o10)) {
                                                            throw new AssertionError();
                                                        }
                                                        s02.limit(s02.position() + o10);
                                                        byteBuffer.put(s02);
                                                        intRef.element = o10;
                                                        aVar19.G(s02, hVar8, o10);
                                                    }
                                                    aVar19.k0();
                                                    aVar19.x0();
                                                    i12 = intRef.element;
                                                    if (i12 > 0) {
                                                        dVar2 = dVar3;
                                                        aVar9 = aVar12;
                                                        l10 = z11;
                                                        longRef2 = longRef3;
                                                        aVar6 = aVar13;
                                                        cVar2 = cVar3;
                                                        j12 = j15;
                                                        hVar2 = hVar7;
                                                        j14 = j17;
                                                        try {
                                                            if (!hVar2.h()) {
                                                                if (!aVar6.l()) {
                                                                }
                                                                if (aVar6 != aVar4) {
                                                                    aVar4.r0(aVar4.Q() + (aVar6.Q() - j14));
                                                                }
                                                                aVar6.l0();
                                                                aVar6.x0();
                                                                dVar = dVar2;
                                                                j11 = j12;
                                                                aVar4 = aVar9;
                                                                aVar3 = aVar19;
                                                                longRef = longRef2;
                                                                if (longRef.element < j11) {
                                                                    aVar4.flush();
                                                                    if (aVar3.d() == 0) {
                                                                        dVar.f49363n = aVar4;
                                                                        dVar.f49364o = aVar3;
                                                                        dVar.f49365p = cVar2;
                                                                        dVar.f49366q = longRef;
                                                                        dVar.f49367r = null;
                                                                        dVar.f49368s = null;
                                                                        dVar.f49369t = null;
                                                                        dVar.f49370u = null;
                                                                        dVar.f49371v = null;
                                                                        dVar.f49372w = null;
                                                                        dVar.f49373x = j11;
                                                                        dVar.f49375z = l10;
                                                                        dVar.f49362C = 2;
                                                                        obj3 = aVar3.f0(1, dVar);
                                                                    } else {
                                                                        aVar4.getClass();
                                                                        coroutine_suspended = obj;
                                                                    }
                                                                }
                                                                if (l10) {
                                                                }
                                                                return Boxing.boxLong(longRef.element);
                                                            }
                                                            aVar6.flush();
                                                            if (aVar6 != aVar4) {
                                                            }
                                                            aVar6.l0();
                                                            aVar6.x0();
                                                            dVar = dVar2;
                                                            j11 = j12;
                                                            aVar4 = aVar9;
                                                            aVar3 = aVar19;
                                                            longRef = longRef2;
                                                            if (longRef.element < j11) {
                                                            }
                                                            if (l10) {
                                                            }
                                                            return Boxing.boxLong(longRef.element);
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            aVar2 = aVar9;
                                                            aVar2.a(th);
                                                            throw th;
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            aVar5.H(byteBuffer, hVar, i12);
                                                            long j18 = longRef3.element;
                                                            int i15 = intRef.element;
                                                            longRef3.element = j18 + i15;
                                                            if (i11 - i15 == 0 || z11) {
                                                                aVar5.flush();
                                                            }
                                                            if (longRef2.element >= j12) {
                                                                long j19 = j16;
                                                                a aVar20 = aVar14;
                                                                io.ktor.utils.io.internal.h hVar9 = hVar3;
                                                                obj = obj2;
                                                                aVar9 = aVar7;
                                                                aVar19 = aVar20;
                                                                dVar2 = dVar;
                                                                j14 = j19;
                                                                hVar2 = hVar9;
                                                                if (!hVar2.h()) {
                                                                }
                                                                aVar6.flush();
                                                                if (aVar6 != aVar4) {
                                                                }
                                                                aVar6.l0();
                                                                aVar6.x0();
                                                                dVar = dVar2;
                                                                j11 = j12;
                                                                aVar4 = aVar9;
                                                                aVar3 = aVar19;
                                                                longRef = longRef2;
                                                                if (longRef.element < j11) {
                                                                }
                                                                if (l10) {
                                                                }
                                                                return Boxing.boxLong(longRef.element);
                                                            }
                                                            int i16 = hVar._availableForWrite$internal;
                                                            if (i16 == 0) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            dVar.f49363n = aVar7;
                                                                            dVar.f49364o = aVar14;
                                                                            dVar.f49365p = cVar2;
                                                                            dVar.f49366q = longRef2;
                                                                            dVar.f49367r = aVar4;
                                                                            dVar.f49368s = aVar6;
                                                                            dVar.f49369t = hVar3;
                                                                            dVar.f49370u = hVar;
                                                                            dVar.f49371v = byteBuffer;
                                                                            dVar.f49372w = aVar5;
                                                                            dVar.f49373x = j12;
                                                                            dVar.f49375z = l10;
                                                                            dVar.f49374y = j13;
                                                                            aVar18 = aVar14;
                                                                            dVar.f49362C = 1;
                                                                            obj = obj2;
                                                                            if (aVar5.y0(1, dVar) != obj) {
                                                                                hVar6 = hVar4;
                                                                                aVar5.getClass();
                                                                                io.ktor.utils.io.internal.h hVar72 = hVar6;
                                                                                long j172 = j13;
                                                                                int i142 = hVar._availableForWrite$internal;
                                                                                io.ktor.utils.io.internal.c cVar42 = cVar2;
                                                                                a aVar192 = aVar18;
                                                                                longRef3 = longRef2;
                                                                                aVar10 = aVar6;
                                                                                z10 = l10;
                                                                                aVar11 = aVar7;
                                                                                dVar3 = dVar;
                                                                                aVar5.U(byteBuffer, aVar5.f49347f, i142);
                                                                                Ref.IntRef intRef2 = new Ref.IntRef();
                                                                                ByteBuffer s022 = aVar192.s0();
                                                                                if (s022 == null) {
                                                                                }
                                                                            }
                                                                            return obj;
                                                                        } catch (Throwable th6) {
                                                                            th2 = th6;
                                                                            hVar = hVar4;
                                                                            aVar8 = aVar4;
                                                                            if (!hVar.h()) {
                                                                            }
                                                                            aVar6.flush();
                                                                            if (aVar6 != aVar8) {
                                                                            }
                                                                            aVar6.l0();
                                                                            aVar6.x0();
                                                                            throw th2;
                                                                        }
                                                                        hVar4 = hVar3;
                                                                    } catch (Throwable th7) {
                                                                        th2 = th7;
                                                                        hVar4 = hVar3;
                                                                        hVar = hVar4;
                                                                        aVar8 = aVar4;
                                                                        if (!hVar.h()) {
                                                                        }
                                                                        aVar6.flush();
                                                                        if (aVar6 != aVar8) {
                                                                        }
                                                                        aVar6.l0();
                                                                        aVar6.x0();
                                                                        throw th2;
                                                                    }
                                                                    j13 = j16;
                                                                } catch (Throwable th8) {
                                                                    th2 = th8;
                                                                    j13 = j16;
                                                                }
                                                            } else {
                                                                j172 = j16;
                                                                a aVar21 = aVar14;
                                                                hVar72 = hVar3;
                                                                obj = obj2;
                                                                i142 = i16;
                                                                aVar192 = aVar21;
                                                                cVar42 = cVar2;
                                                                longRef3 = longRef2;
                                                                aVar10 = aVar6;
                                                                z10 = l10;
                                                                aVar11 = aVar7;
                                                                dVar3 = dVar;
                                                                aVar5.U(byteBuffer, aVar5.f49347f, i142);
                                                                Ref.IntRef intRef22 = new Ref.IntRef();
                                                                ByteBuffer s0222 = aVar192.s0();
                                                                if (s0222 == null) {
                                                                }
                                                            }
                                                        } catch (Throwable th9) {
                                                            th2 = th9;
                                                            hVar = hVar72;
                                                            aVar8 = aVar4;
                                                            aVar6 = aVar13;
                                                            j13 = j172;
                                                            if (!hVar.h()) {
                                                            }
                                                            aVar6.flush();
                                                            if (aVar6 != aVar8) {
                                                            }
                                                            aVar6.l0();
                                                            aVar6.x0();
                                                            throw th2;
                                                        }
                                                    } catch (Throwable th10) {
                                                        th2 = th10;
                                                        hVar = hVar3;
                                                        aVar8 = aVar4;
                                                        j13 = j16;
                                                    }
                                                    dVar = dVar3;
                                                    aVar7 = aVar12;
                                                    l10 = z11;
                                                    longRef2 = longRef3;
                                                    aVar6 = aVar13;
                                                    cVar2 = cVar3;
                                                    j12 = j15;
                                                    obj2 = obj;
                                                    aVar14 = aVar192;
                                                    hVar3 = hVar72;
                                                    j16 = j172;
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    aVar192.k0();
                                                    aVar192.x0();
                                                    throw th;
                                                }
                                                aVar13 = aVar10;
                                                cVar3 = cVar42;
                                            }
                                        } catch (Throwable th12) {
                                            th2 = th12;
                                            aVar13 = aVar10;
                                            hVar = hVar72;
                                            aVar8 = aVar4;
                                            aVar6 = aVar13;
                                            j13 = j172;
                                            if (!hVar.h() || aVar6.l()) {
                                                aVar6.flush();
                                            }
                                            if (aVar6 != aVar8) {
                                                aVar8.r0(aVar8.Q() + (aVar6.Q() - j13));
                                            }
                                            aVar6.l0();
                                            aVar6.x0();
                                            throw th2;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        aVar13 = aVar10;
                                    }
                                    z11 = z10;
                                }
                                aVar13 = aVar10;
                                cVar3 = cVar42;
                                i11 = i142;
                                j15 = j12;
                                i12 = intRef22.element;
                                if (i12 > 0) {
                                }
                            } catch (Throwable th14) {
                                th2 = th14;
                                aVar12 = aVar11;
                            }
                            longRef3 = longRef2;
                            aVar10 = aVar6;
                            z10 = l10;
                            aVar11 = aVar7;
                            dVar3 = dVar;
                        } catch (Throwable th15) {
                            th2 = th15;
                            if (!hVar.h()) {
                            }
                            aVar6.flush();
                            if (aVar6 != aVar8) {
                            }
                            aVar6.l0();
                            aVar6.x0();
                            throw th2;
                        }
                    } else {
                        if (i10 == 2) {
                            l10 = dVar.f49375z;
                            j11 = dVar.f49373x;
                            longRef = (Ref.LongRef) dVar.f49366q;
                            android.support.v4.media.session.b.a(dVar.f49365p);
                            aVar3 = (a) dVar.f49364o;
                            aVar4 = (a) dVar.f49363n;
                            ResultKt.throwOnFailure(obj4);
                            obj3 = obj4;
                            obj = coroutine_suspended;
                            cVar2 = null;
                            if (((Boolean) obj3).booleanValue()) {
                                aVar4.getClass();
                                coroutine_suspended = obj;
                            }
                            if (l10) {
                                aVar4.flush();
                            }
                            return Boxing.boxLong(longRef.element);
                        }
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        l10 = dVar.f49375z;
                        j11 = dVar.f49373x;
                        longRef = (Ref.LongRef) dVar.f49366q;
                        android.support.v4.media.session.b.a(dVar.f49365p);
                        aVar3 = (a) dVar.f49364o;
                        aVar4 = (a) dVar.f49363n;
                        ResultKt.throwOnFailure(obj4);
                        cVar2 = null;
                    }
                    if (longRef.element < j11) {
                        aVar4.getClass();
                        ByteBuffer t02 = aVar4.t0();
                        if (t02 == null) {
                            obj = coroutine_suspended;
                            if (longRef.element < j11) {
                            }
                        } else {
                            hVar = aVar4.O().f49467b;
                            long Q10 = aVar4.Q();
                            try {
                                io.ktor.utils.io.internal.b M10 = aVar4.M();
                                if (M10 != null) {
                                    io.ktor.utils.io.b.b(M10.c());
                                    throw new KotlinNothingValueException();
                                }
                                byteBuffer = t02;
                                obj2 = coroutine_suspended;
                                j16 = Q10;
                                longRef2 = longRef;
                                aVar14 = aVar3;
                                aVar7 = aVar4;
                                aVar6 = aVar7;
                                aVar5 = aVar6;
                                hVar3 = hVar;
                                j12 = j11;
                                if (longRef2.element >= j12) {
                                }
                            } catch (Throwable th16) {
                                th2 = th16;
                                j13 = Q10;
                                aVar6 = aVar4;
                                aVar8 = aVar6;
                                if (!hVar.h()) {
                                }
                                aVar6.flush();
                                if (aVar6 != aVar8) {
                                }
                                aVar6.l0();
                                aVar6.x0();
                                throw th2;
                            }
                        }
                    }
                    if (l10) {
                    }
                    return Boxing.boxLong(longRef.element);
                }
            }
            if (i10 != 0) {
            }
            if (longRef.element < j11) {
            }
            if (l10) {
            }
            return Boxing.boxLong(longRef.element);
        } catch (Throwable th17) {
            th = th17;
        }
        dVar = new d(continuation);
        Object obj42 = dVar.f49360A;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f49362C;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J0(int i10, Continuation continuation) {
        n nVar;
        int i11;
        a aVar;
        io.ktor.utils.io.internal.b M10;
        Throwable c10;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i12 = nVar.f49435r;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                nVar.f49435r = i12 - Integer.MIN_VALUE;
                Object obj = nVar.f49433p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = nVar.f49435r;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = nVar.f49432o;
                    aVar = (a) nVar.f49431n;
                    ResultKt.throwOnFailure(obj);
                }
                while (aVar.M0(i10)) {
                    nVar.f49431n = aVar;
                    nVar.f49432o = i10;
                    nVar.f49435r = 1;
                    C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(nVar), 1);
                    c1469p.F();
                    aVar.L0(i10, c1469p);
                    Object z10 = c1469p.z();
                    if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(nVar);
                    }
                    if (z10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                M10 = aVar.M();
                if (M10 != null || (c10 = M10.c()) == null) {
                    return Unit.INSTANCE;
                }
                io.ktor.utils.io.b.b(c10);
                throw new KotlinNothingValueException();
            }
        }
        nVar = new n(continuation);
        Object obj2 = nVar.f49433p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = nVar.f49435r;
        if (i11 != 0) {
        }
        while (aVar.M0(i10)) {
        }
        M10 = aVar.M();
        if (M10 != null) {
        }
        return Unit.INSTANCE;
    }

    public final io.ktor.utils.io.internal.f K() {
        return O();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:17:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object K0(byte[] r6, int r7, int r8, kotlin.coroutines.Continuation r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.a.m
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.a$m r0 = (io.ktor.utils.io.a.m) r0
            int r1 = r0.f49430t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49430t = r1
            goto L18
        L13:
            io.ktor.utils.io.a$m r0 = new io.ktor.utils.io.a$m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f49428r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49430t
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 == r3) goto L34
            r6 = 2
            if (r2 != r6) goto L2c
            kotlin.ResultKt.throwOnFailure(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.f49427q
            int r7 = r0.f49426p
            java.lang.Object r8 = r0.f49425o
            byte[] r8 = (byte[]) r8
            java.lang.Object r2 = r0.f49424n
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.a) r2
            kotlin.ResultKt.throwOnFailure(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L5c
        L47:
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = r5
        L4b:
            r0.f49424n = r2
            r0.f49425o = r6
            r0.f49426p = r7
            r0.f49427q = r8
            r0.f49430t = r3
            java.lang.Object r9 = r2.y0(r3, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            r2.getClass()
            int r9 = r2.B0(r6, r7, r8)
            if (r9 <= 0) goto L4b
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.a.K0(byte[], int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void L(int i10) {
        io.ktor.utils.io.internal.f O10;
        do {
            O10 = O();
            if (O10 == f.C0732f.f49478c) {
                return;
            } else {
                O10.f49467b.e();
            }
        } while (O10 != O());
        int i11 = O10.f49467b._availableForWrite$internal;
        if (O10.f49467b._availableForRead$internal >= 1) {
            n0();
        }
        if (i11 >= i10) {
            o0();
        }
    }

    public final void L0(int i10, InterfaceC1465n interfaceC1465n) {
        Throwable c10;
        while (true) {
            io.ktor.utils.io.internal.b M10 = M();
            if (M10 != null && (c10 = M10.c()) != null) {
                io.ktor.utils.io.b.b(c10);
                throw new KotlinNothingValueException();
            }
            if (!M0(i10)) {
                Result.Companion companion = Result.INSTANCE;
                interfaceC1465n.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
                break;
            }
            while (R() == null) {
                if (!M0(i10)) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49342p;
                if (AbstractC4221b.a(atomicReferenceFieldUpdater, this, null, interfaceC1465n)) {
                    if (M0(i10) || !AbstractC4221b.a(atomicReferenceFieldUpdater, this, interfaceC1465n, null)) {
                        break;
                    }
                }
            }
            throw new IllegalStateException("Operation is already in progress");
        }
        L(i10);
        if (u0()) {
            n0();
        }
    }

    public final io.ktor.utils.io.internal.b M() {
        return (io.ktor.utils.io.internal.b) this._closed;
    }

    public final boolean M0(int i10) {
        io.ktor.utils.io.internal.f O10 = O();
        return M() == null && O10.f49467b._availableForWrite$internal < i10 && O10 != f.a.f49468c;
    }

    public final Continuation N() {
        return (Continuation) this._readOp;
    }

    public final io.ktor.utils.io.internal.f O() {
        return (io.ktor.utils.io.internal.f) this._state;
    }

    public long P() {
        return this.totalBytesRead;
    }

    public long Q() {
        return this.totalBytesWritten;
    }

    public final Continuation R() {
        return (Continuation) this._writeOp;
    }

    public boolean S() {
        return M() != null;
    }

    public final f.c T() {
        f.c cVar = (f.c) this.f49344c.V0();
        cVar.f49467b.j();
        return cVar;
    }

    public final void U(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byteBuffer.limit(RangesKt.coerceAtMost(i11 + i10, byteBuffer.capacity() - this.f49345d));
        byteBuffer.position(i10);
    }

    public final int V(AbstractC5255a abstractC5255a, int i10, int i11) {
        int l10;
        do {
            ByteBuffer s02 = s0();
            boolean z10 = false;
            if (s02 != null) {
                io.ktor.utils.io.internal.h hVar = O().f49467b;
                try {
                    if (hVar._availableForRead$internal != 0) {
                        int f10 = abstractC5255a.f() - abstractC5255a.j();
                        l10 = hVar.l(Math.min(s02.remaining(), Math.min(f10, i11)));
                        if (l10 > 0) {
                            if (f10 < s02.remaining()) {
                                s02.limit(s02.position() + f10);
                            }
                            AbstractC5259e.a(abstractC5255a, s02);
                            G(s02, hVar, l10);
                            z10 = true;
                        }
                        i10 += l10;
                        i11 -= l10;
                        if (z10 || abstractC5255a.f() <= abstractC5255a.j()) {
                            break;
                        }
                    } else {
                        k0();
                        x0();
                    }
                } finally {
                    k0();
                    x0();
                }
            }
            l10 = 0;
            i10 += l10;
            i11 -= l10;
            if (z10) {
                break;
                break;
            }
        } while (O().f49467b._availableForRead$internal > 0);
        return i10;
    }

    public final int W(byte[] bArr, int i10, int i11) {
        ByteBuffer s02 = s0();
        int i12 = 0;
        if (s02 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.h hVar = O().f49467b;
        try {
            if (hVar._availableForRead$internal != 0) {
                int capacity = s02.capacity() - this.f49345d;
                while (true) {
                    int i13 = i11 - i12;
                    if (i13 == 0) {
                        break;
                    }
                    int i14 = this.f49346e;
                    int l10 = hVar.l(Math.min(capacity - i14, i13));
                    if (l10 == 0) {
                        break;
                    }
                    s02.limit(i14 + l10);
                    s02.position(i14);
                    s02.get(bArr, i10 + i12, l10);
                    G(s02, hVar, l10);
                    i12 += l10;
                }
            }
            return i12;
        } finally {
            k0();
            x0();
        }
    }

    @Override // io.ktor.utils.io.i
    public boolean a(Throwable th2) {
        if (M() != null) {
            return false;
        }
        io.ktor.utils.io.internal.b a10 = th2 == null ? io.ktor.utils.io.internal.b.f49455b.a() : new io.ktor.utils.io.internal.b(th2);
        O().f49467b.e();
        if (!AbstractC4221b.a(f49340n, this, null, a10)) {
            return false;
        }
        O().f49467b.e();
        if (O().f49467b.g() || th2 != null) {
            x0();
        }
        m0(th2);
        O();
        f.C0732f c0732f = f.C0732f.f49478c;
        if (th2 == null) {
            this.f49351j.h(new io.ktor.utils.io.m("Byte channel was closed"));
            this.f49350i.g(Boolean.valueOf(O().f49467b.e()));
            return true;
        }
        C0 c02 = this.attachedJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        this.f49350i.h(th2);
        this.f49351j.h(th2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a0(C5466a c5466a, Continuation continuation) {
        f fVar;
        Object obj;
        int i10;
        a aVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f49387r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f49387r = i11 - Integer.MIN_VALUE;
                obj = fVar.f49385p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = fVar.f49387r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    fVar.f49383n = this;
                    fVar.f49384o = c5466a;
                    fVar.f49387r = 1;
                    obj = e0(1, fVar);
                    if (obj != coroutine_suspended) {
                        aVar = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                c5466a = (C5466a) fVar.f49384o;
                aVar = (a) fVar.f49383n;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Boxing.boxInt(-1);
                }
                fVar.f49383n = null;
                fVar.f49384o = null;
                fVar.f49387r = 2;
                Object e10 = aVar.e(c5466a, fVar);
                return e10 == coroutine_suspended ? coroutine_suspended : e10;
            }
        }
        fVar = new f(continuation);
        obj = fVar.f49385p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = fVar.f49387r;
        if (i10 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // io.ktor.utils.io.f
    public Object b(long j10, Continuation continuation) {
        return c0(this, j10, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(byte[] bArr, int i10, int i11, Continuation continuation) {
        e eVar;
        Object obj;
        int i12;
        a aVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i13 = eVar.f49382t;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f49382t = i13 - Integer.MIN_VALUE;
                obj = eVar.f49380r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i12 = eVar.f49382t;
                if (i12 != 0) {
                    ResultKt.throwOnFailure(obj);
                    eVar.f49376n = this;
                    eVar.f49377o = bArr;
                    eVar.f49378p = i10;
                    eVar.f49379q = i11;
                    eVar.f49382t = 1;
                    obj = e0(1, eVar);
                    if (obj != coroutine_suspended) {
                        aVar = this;
                    }
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                i11 = eVar.f49379q;
                i10 = eVar.f49378p;
                bArr = (byte[]) eVar.f49377o;
                aVar = (a) eVar.f49376n;
                ResultKt.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    return Boxing.boxInt(-1);
                }
                eVar.f49376n = null;
                eVar.f49377o = null;
                eVar.f49382t = 2;
                Object f10 = aVar.f(bArr, i10, i11, eVar);
                return f10 == coroutine_suspended ? coroutine_suspended : f10;
            }
        }
        eVar = new e(continuation);
        obj = eVar.f49380r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i12 = eVar.f49382t;
        if (i12 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // io.ktor.utils.io.f
    public Throwable c() {
        io.ktor.utils.io.internal.b M10 = M();
        if (M10 != null) {
            return M10.b();
        }
        return null;
    }

    @Override // io.ktor.utils.io.f
    public boolean cancel(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel has been cancelled");
        }
        return a(th2);
    }

    @Override // io.ktor.utils.io.f
    public int d() {
        return O().f49467b._availableForRead$internal;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:13:0x00a4, B:17:0x00b2, B:18:0x0062, B:20:0x0072, B:21:0x0076, B:23:0x008a, B:25:0x0090), top: B:11:0x0039, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:13:0x00a4, B:17:0x00b2, B:18:0x0062, B:20:0x0072, B:21:0x0076, B:23:0x008a, B:25:0x0090), top: B:11:0x0039, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:13:0x00a4, B:17:0x00b2, B:18:0x0062, B:20:0x0072, B:21:0x0076, B:23:0x008a, B:25:0x0090), top: B:11:0x0039, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7 A[Catch: all -> 0x00c5, TRY_ENTER, TryCatch #0 {all -> 0x00c5, blocks: (B:30:0x00b7, B:32:0x00c0, B:34:0x00c9, B:39:0x00ca, B:40:0x00cd, B:12:0x0039, B:13:0x00a4, B:17:0x00b2, B:18:0x0062, B:20:0x0072, B:21:0x0076, B:23:0x008a, B:25:0x0090), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a3 -> B:13:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00af -> B:16:0x00b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d0(long j10, Continuation continuation) {
        g gVar;
        int i10;
        kh.k kVar;
        Throwable th2;
        kh.k kVar2;
        a aVar;
        C5466a d10;
        Ref.LongRef longRef;
        kh.r rVar;
        boolean z10;
        kh.r rVar2;
        long f10;
        long j11;
        long X10;
        kh.r rVar3;
        try {
            if (continuation instanceof g) {
                gVar = (g) continuation;
                int i11 = gVar.f49395u;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    gVar.f49395u = i11 - Integer.MIN_VALUE;
                    Object obj = gVar.f49393s;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = gVar.f49395u;
                    int i12 = 1;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        kVar2 = new kh.k(null, i12, false ? 1 : 0);
                        try {
                            Ref.LongRef longRef2 = new Ref.LongRef();
                            longRef2.element = j10;
                            aVar = this;
                            d10 = lh.e.d(kVar2, 1, null);
                            kh.k kVar3 = kVar2;
                            longRef = longRef2;
                            kVar = kVar3;
                            rVar2 = kVar3;
                            f10 = d10.f() - d10.j();
                            j11 = longRef.element;
                            if (f10 > j11) {
                            }
                            X10 = longRef.element - X(aVar, d10, 0, 0, 6, null);
                            longRef.element = X10;
                            rVar = rVar2;
                            if (X10 > 0) {
                            }
                            z10 = false;
                            rVar3 = rVar;
                            if (!z10) {
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            kVar2.b2();
                            throw th2;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5466a c5466a = (C5466a) gVar.f49392r;
                        kh.r rVar4 = (kh.r) gVar.f49391q;
                        longRef = (Ref.LongRef) gVar.f49390p;
                        kVar = (kh.k) gVar.f49389o;
                        aVar = (a) gVar.f49388n;
                        try {
                            ResultKt.throwOnFailure(obj);
                            rVar4 = rVar4;
                            d10 = c5466a;
                            rVar = rVar4;
                            if (((Boolean) obj).booleanValue()) {
                                z10 = true;
                                rVar3 = rVar4;
                                if (!z10) {
                                    rVar3.d();
                                    Throwable c10 = aVar.c();
                                    if (c10 == null) {
                                        return kVar.h2();
                                    }
                                    throw c10;
                                }
                                d10 = lh.e.d(rVar3, 1, d10);
                                rVar2 = rVar3;
                                f10 = d10.f() - d10.j();
                                j11 = longRef.element;
                                if (f10 > j11) {
                                    d10.s((int) j11);
                                }
                                X10 = longRef.element - X(aVar, d10, 0, 0, 6, null);
                                longRef.element = X10;
                                rVar = rVar2;
                                if (X10 > 0) {
                                    rVar = rVar2;
                                    if (!aVar.j()) {
                                        gVar.f49388n = aVar;
                                        gVar.f49389o = kVar;
                                        gVar.f49390p = longRef;
                                        gVar.f49391q = rVar2;
                                        gVar.f49392r = d10;
                                        gVar.f49395u = 1;
                                        obj = aVar.e0(1, gVar);
                                        if (obj == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        c5466a = d10;
                                        rVar4 = rVar2;
                                        d10 = c5466a;
                                        rVar = rVar4;
                                        if (((Boolean) obj).booleanValue()) {
                                        }
                                    }
                                }
                            }
                            z10 = false;
                            rVar3 = rVar;
                            if (!z10) {
                            }
                        } catch (Throwable th4) {
                            rVar4.d();
                            throw th4;
                        }
                    }
                }
            }
            if (i10 != 0) {
            }
        } catch (Throwable th5) {
            th2 = th5;
            kVar2 = kVar;
        }
        gVar = new g(continuation);
        Object obj2 = gVar.f49393s;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar.f49395u;
        int i122 = 1;
    }

    @Override // io.ktor.utils.io.f
    public Object e(C5466a c5466a, Continuation continuation) {
        return Y(this, c5466a, continuation);
    }

    public final Object e0(int i10, Continuation continuation) {
        if (O().f49467b._availableForRead$internal >= i10) {
            return Boxing.boxBoolean(true);
        }
        io.ktor.utils.io.internal.b M10 = M();
        if (M10 == null) {
            return i10 == 1 ? f0(1, continuation) : g0(i10, continuation);
        }
        Throwable b10 = M10.b();
        if (b10 != null) {
            io.ktor.utils.io.b.b(b10);
            throw new KotlinNothingValueException();
        }
        io.ktor.utils.io.internal.h hVar = O().f49467b;
        boolean z10 = hVar.e() && hVar._availableForRead$internal >= i10;
        if (N() == null) {
            return Boxing.boxBoolean(z10);
        }
        throw new IllegalStateException("Read operation is already in progress");
    }

    @Override // io.ktor.utils.io.f
    public Object f(byte[] bArr, int i10, int i11, Continuation continuation) {
        return Z(this, bArr, i10, i11, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f0(int i10, Continuation continuation) {
        h hVar;
        int i11;
        a aVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i12 = hVar.f49400r;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                hVar.f49400r = i12 - Integer.MIN_VALUE;
                Object obj = hVar.f49398p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = hVar.f49400r;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (O().f49467b._availableForRead$internal >= i10) {
                        return Boxing.boxBoolean(true);
                    }
                    try {
                        hVar.f49396n = this;
                        hVar.f49397o = i10;
                        hVar.f49400r = 1;
                        io.ktor.utils.io.internal.a aVar2 = this.f49350i;
                        v0(i10, aVar2);
                        Object i13 = aVar2.i(IntrinsicsKt.intercepted(hVar));
                        if (i13 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(hVar);
                        }
                        return i13 == coroutine_suspended ? coroutine_suspended : i13;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = this;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) hVar.f49396n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                aVar.p0(null);
                throw th;
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f49398p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = hVar.f49400r;
        if (i11 != 0) {
        }
        aVar.p0(null);
        throw th;
    }

    @Override // io.ktor.utils.io.i
    public void flush() {
        L(1);
    }

    @Override // io.ktor.utils.io.c
    public void g(C0 job) {
        Intrinsics.checkNotNullParameter(job, "job");
        C0 c02 = this.attachedJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        this.attachedJob = job;
        C0.a.e(job, true, false, new b(), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0092 -> B:10:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g0(int i10, Continuation continuation) {
        i iVar;
        int i11;
        a aVar;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i12 = iVar.f49405r;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                iVar.f49405r = i12 - Integer.MIN_VALUE;
                Object obj = iVar.f49403p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = iVar.f49405r;
                boolean z10 = false;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar = this;
                    if (aVar.O().f49467b._availableForRead$internal >= i10) {
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = iVar.f49402o;
                    aVar = (a) iVar.f49401n;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Boxing.boxBoolean(false);
                    }
                    if (aVar.O().f49467b._availableForRead$internal >= i10) {
                        io.ktor.utils.io.internal.b M10 = aVar.M();
                        if (M10 != null) {
                            if (M10.b() != null) {
                                io.ktor.utils.io.b.b(M10.b());
                                throw new KotlinNothingValueException();
                            }
                            io.ktor.utils.io.internal.h hVar = aVar.O().f49467b;
                            if (hVar.e() && hVar._availableForRead$internal >= i10) {
                                z10 = true;
                            }
                            if (aVar.N() == null) {
                                return Boxing.boxBoolean(z10);
                            }
                            throw new IllegalStateException("Read operation is already in progress");
                        }
                        iVar.f49401n = aVar;
                        iVar.f49402o = i10;
                        iVar.f49405r = 1;
                        obj = aVar.f0(i10, iVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        if (aVar.O().f49467b._availableForRead$internal >= i10) {
                            return Boxing.boxBoolean(true);
                        }
                    }
                }
            }
        }
        iVar = new i(continuation);
        Object obj2 = iVar.f49403p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = iVar.f49405r;
        boolean z102 = false;
        if (i11 != 0) {
        }
    }

    @Override // io.ktor.utils.io.i
    public Object h(byte[] bArr, int i10, int i11, Continuation continuation) {
        return G0(this, bArr, i10, i11, continuation);
    }

    public final void h0(f.c cVar) {
        this.f49344c.O1(cVar);
    }

    @Override // io.ktor.utils.io.i
    public Object i(int i10, Function1 function1, Continuation continuation) {
        return z0(this, i10, function1, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kh.l i0(long j10) {
        kh.k kVar = new kh.k(null, 1, 0 == true ? 1 : 0);
        try {
            C5466a d10 = lh.e.d(kVar, 1, null);
            while (true) {
                try {
                    if (d10.f() - d10.j() > j10) {
                        d10.s((int) j10);
                    }
                    j10 -= X(this, d10, 0, 0, 6, null);
                    if (j10 <= 0 || j()) {
                        break;
                    }
                    d10 = lh.e.d(kVar, 1, d10);
                } catch (Throwable th2) {
                    kVar.d();
                    throw th2;
                }
            }
            kVar.d();
            return kVar.h2();
        } catch (Throwable th3) {
            kVar.b2();
            throw th3;
        }
    }

    @Override // io.ktor.utils.io.f
    public boolean j() {
        return O() == f.C0732f.f49478c && M() != null;
    }

    public final a j0() {
        return this;
    }

    @Override // io.ktor.utils.io.i
    public Object k(AbstractC5255a abstractC5255a, Continuation continuation) {
        return F0(this, abstractC5255a, continuation);
    }

    public final void k0() {
        Object obj;
        io.ktor.utils.io.internal.f e10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io.ktor.utils.io.internal.f fVar = null;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.f fVar2 = (io.ktor.utils.io.internal.f) obj;
            f.b bVar = (f.b) fVar;
            if (bVar != null) {
                bVar.f49467b.j();
                o0();
                fVar = null;
            }
            e10 = fVar2.e();
            if ((e10 instanceof f.b) && O() == fVar2 && e10.f49467b.k()) {
                e10 = f.a.f49468c;
                fVar = e10;
            }
            atomicReferenceFieldUpdater = f49339m;
        } while (!AbstractC4221b.a(atomicReferenceFieldUpdater, this, obj, e10));
        f.a aVar = f.a.f49468c;
        if (e10 == aVar) {
            f.b bVar2 = (f.b) fVar;
            if (bVar2 != null) {
                h0(bVar2.g());
            }
            o0();
            return;
        }
        if ((e10 instanceof f.b) && e10.f49467b.g() && e10.f49467b.k() && AbstractC4221b.a(atomicReferenceFieldUpdater, this, e10, aVar)) {
            e10.f49467b.j();
            h0(((f.b) e10).g());
            o0();
        }
    }

    @Override // io.ktor.utils.io.i
    public boolean l() {
        return this.f49343b;
    }

    public final void l0() {
        Object obj;
        io.ktor.utils.io.internal.f f10;
        f.b bVar;
        io.ktor.utils.io.internal.f fVar = null;
        do {
            obj = this._state;
            f10 = ((io.ktor.utils.io.internal.f) obj).f();
            if ((f10 instanceof f.b) && f10.f49467b.g()) {
                f10 = f.a.f49468c;
                fVar = f10;
            }
        } while (!AbstractC4221b.a(f49339m, this, obj, f10));
        if (f10 != f.a.f49468c || (bVar = (f.b) fVar) == null) {
            return;
        }
        h0(bVar.g());
    }

    public final void m0(Throwable th2) {
        Continuation continuation = (Continuation) f49341o.getAndSet(this, null);
        if (continuation != null) {
            if (th2 != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(th2)));
            } else {
                continuation.resumeWith(Result.m147constructorimpl(Boolean.valueOf(O().f49467b._availableForRead$internal > 0)));
            }
        }
        Continuation continuation2 = (Continuation) f49342p.getAndSet(this, null);
        if (continuation2 != null) {
            Result.Companion companion2 = Result.INSTANCE;
            if (th2 == null) {
                th2 = new io.ktor.utils.io.m("Byte channel was closed");
            }
            continuation2.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(th2)));
        }
    }

    public final void n0() {
        Continuation continuation = (Continuation) f49341o.getAndSet(this, null);
        if (continuation != null) {
            io.ktor.utils.io.internal.b M10 = M();
            Throwable b10 = M10 != null ? M10.b() : null;
            if (b10 != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(b10)));
            } else {
                Result.Companion companion2 = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(Boolean.TRUE));
            }
        }
    }

    public final void o0() {
        Continuation R10;
        io.ktor.utils.io.internal.b M10;
        Object createFailure;
        do {
            R10 = R();
            if (R10 == null) {
                return;
            } else {
                M10 = M();
            }
        } while (!AbstractC4221b.a(f49342p, this, R10, null));
        if (M10 == null) {
            Result.Companion companion = Result.INSTANCE;
            createFailure = Unit.INSTANCE;
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            createFailure = ResultKt.createFailure(M10.c());
        }
        R10.resumeWith(Result.m147constructorimpl(createFailure));
    }

    public final void p0(Continuation continuation) {
        this._readOp = continuation;
    }

    public void q0(long j10) {
        this.totalBytesRead = j10;
    }

    public void r0(long j10) {
        this.totalBytesWritten = j10;
    }

    public final ByteBuffer s0() {
        Object obj;
        Throwable b10;
        io.ktor.utils.io.internal.f c10;
        Throwable b11;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.f fVar = (io.ktor.utils.io.internal.f) obj;
            if (Intrinsics.areEqual(fVar, f.C0732f.f49478c) ? true : Intrinsics.areEqual(fVar, f.a.f49468c)) {
                io.ktor.utils.io.internal.b M10 = M();
                if (M10 == null || (b10 = M10.b()) == null) {
                    return null;
                }
                io.ktor.utils.io.b.b(b10);
                throw new KotlinNothingValueException();
            }
            io.ktor.utils.io.internal.b M11 = M();
            if (M11 != null && (b11 = M11.b()) != null) {
                io.ktor.utils.io.b.b(b11);
                throw new KotlinNothingValueException();
            }
            if (fVar.f49467b._availableForRead$internal == 0) {
                return null;
            }
            c10 = fVar.c();
        } while (!AbstractC4221b.a(f49339m, this, obj, c10));
        ByteBuffer a10 = c10.a();
        U(a10, this.f49346e, c10.f49467b._availableForRead$internal);
        return a10;
    }

    public final ByteBuffer t0() {
        Object obj;
        io.ktor.utils.io.internal.f fVar;
        f.a aVar;
        io.ktor.utils.io.internal.f d10;
        Continuation R10 = R();
        if (R10 != null) {
            throw new IllegalStateException("Write operation is already in progress: " + R10);
        }
        io.ktor.utils.io.internal.f fVar2 = null;
        f.c cVar = null;
        do {
            obj = this._state;
            fVar = (io.ktor.utils.io.internal.f) obj;
            if (M() != null) {
                if (cVar != null) {
                    h0(cVar);
                }
                io.ktor.utils.io.internal.b M10 = M();
                Intrinsics.checkNotNull(M10);
                io.ktor.utils.io.b.b(M10.c());
                throw new KotlinNothingValueException();
            }
            aVar = f.a.f49468c;
            if (fVar == aVar) {
                if (cVar == null) {
                    cVar = T();
                }
                d10 = cVar.d();
            } else {
                if (fVar == f.C0732f.f49478c) {
                    if (cVar != null) {
                        h0(cVar);
                    }
                    io.ktor.utils.io.internal.b M11 = M();
                    Intrinsics.checkNotNull(M11);
                    io.ktor.utils.io.b.b(M11.c());
                    throw new KotlinNothingValueException();
                }
                d10 = fVar.d();
            }
        } while (!AbstractC4221b.a(f49339m, this, obj, d10));
        if (M() != null) {
            l0();
            x0();
            io.ktor.utils.io.internal.b M12 = M();
            Intrinsics.checkNotNull(M12);
            io.ktor.utils.io.b.b(M12.c());
            throw new KotlinNothingValueException();
        }
        ByteBuffer b10 = d10.b();
        if (cVar != null) {
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("old");
            } else {
                fVar2 = fVar;
            }
            if (fVar2 != aVar) {
                h0(cVar);
            }
        }
        U(b10, this.f49347f, d10.f49467b._availableForWrite$internal);
        return b10;
    }

    public String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + O() + ')';
    }

    public final boolean u0() {
        return false;
    }

    public final Object v0(int i10, Continuation continuation) {
        while (true) {
            if (O().f49467b._availableForRead$internal >= i10) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(Boolean.TRUE));
                break;
            }
            io.ktor.utils.io.internal.b M10 = M();
            if (M10 == null) {
                while (N() == null) {
                    if (M() == null && O().f49467b._availableForRead$internal < i10) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49341o;
                        if (AbstractC4221b.a(atomicReferenceFieldUpdater, this, null, continuation)) {
                            if ((M() == null && O().f49467b._availableForRead$internal < i10) || !AbstractC4221b.a(atomicReferenceFieldUpdater, this, continuation, null)) {
                                break;
                            }
                        }
                    }
                }
                throw new IllegalStateException("Operation is already in progress");
            }
            if (M10.b() != null) {
                Result.Companion companion2 = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(M10.b())));
                return IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
            boolean e10 = O().f49467b.e();
            boolean z10 = false;
            boolean z11 = O().f49467b._availableForRead$internal >= i10;
            Result.Companion companion3 = Result.INSTANCE;
            if (e10 && z11) {
                z10 = true;
            }
            continuation.resumeWith(Result.m147constructorimpl(Boolean.valueOf(z10)));
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public final boolean w0(boolean z10) {
        Object obj;
        f.C0732f c0732f;
        f.c cVar = null;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.f fVar = (io.ktor.utils.io.internal.f) obj;
            io.ktor.utils.io.internal.b M10 = M();
            if (cVar != null) {
                if ((M10 != null ? M10.b() : null) == null) {
                    cVar.f49467b.j();
                }
                o0();
                cVar = null;
            }
            c0732f = f.C0732f.f49478c;
            if (fVar == c0732f) {
                return true;
            }
            if (fVar != f.a.f49468c) {
                if (M10 != null && (fVar instanceof f.b) && (fVar.f49467b.k() || M10.b() != null)) {
                    if (M10.b() != null) {
                        fVar.f49467b.f();
                    }
                    cVar = ((f.b) fVar).g();
                } else {
                    if (!z10 || !(fVar instanceof f.b) || !fVar.f49467b.k()) {
                        return false;
                    }
                    cVar = ((f.b) fVar).g();
                }
            }
        } while (!AbstractC4221b.a(f49339m, this, obj, c0732f));
        if (cVar != null && O() == c0732f) {
            h0(cVar);
        }
        return true;
    }

    public final boolean x0() {
        if (M() == null || !w0(false)) {
            return false;
        }
        n0();
        o0();
        return true;
    }

    public final Object y0(int i10, Continuation continuation) {
        Throwable c10;
        if (!M0(i10)) {
            io.ktor.utils.io.internal.b M10 = M();
            if (M10 == null || (c10 = M10.c()) == null) {
                return Unit.INSTANCE;
            }
            io.ktor.utils.io.b.b(c10);
            throw new KotlinNothingValueException();
        }
        this.writeSuspensionSize = i10;
        if (this.attachedJob != null) {
            Object invoke = this.f49352k.invoke(continuation);
            if (invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
        }
        io.ktor.utils.io.internal.a aVar = this.f49351j;
        this.f49352k.invoke(aVar);
        Object i11 = aVar.i(IntrinsicsKt.intercepted(continuation));
        if (i11 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return i11 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? i11 : Unit.INSTANCE;
    }

    public /* synthetic */ a(boolean z10, mh.f fVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i11 & 2) != 0 ? io.ktor.utils.io.internal.d.c() : fVar, (i11 & 4) != 0 ? 8 : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ByteBuffer content) {
        this(false, io.ktor.utils.io.internal.d.b(), 0);
        Intrinsics.checkNotNullParameter(content, "content");
        ByteBuffer slice = content.slice();
        Intrinsics.checkNotNullExpressionValue(slice, "content.slice()");
        f.c cVar = new f.c(slice, 0);
        cVar.f49467b.i();
        this._state = cVar.d();
        l0();
        io.ktor.utils.io.j.a(this);
        x0();
    }
}
