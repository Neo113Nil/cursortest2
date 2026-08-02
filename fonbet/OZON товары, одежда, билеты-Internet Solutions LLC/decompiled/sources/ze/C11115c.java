package ze;

import De.AbstractC2861d;
import De.C2857A;
import De.C2858a;
import De.C2868k;
import Sc.r;
import T7.E;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.C10741p;
import xe.InterfaceC10733l;
import xe.j1;
import ze.l;

/* renamed from: ze.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11115c<E> implements h<E> {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f108899b = AtomicLongFieldUpdater.newUpdater(C11115c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f108900c = AtomicLongFieldUpdater.newUpdater(C11115c.class, "receivers$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f108901d = AtomicLongFieldUpdater.newUpdater(C11115c.class, "bufferEnd$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f108902e = AtomicLongFieldUpdater.newUpdater(C11115c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f108903f = AtomicReferenceFieldUpdater.newUpdater(C11115c.class, Object.class, "sendSegment$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f108904g = AtomicReferenceFieldUpdater.newUpdater(C11115c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f108905h = AtomicReferenceFieldUpdater.newUpdater(C11115c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f108906i = AtomicReferenceFieldUpdater.newUpdater(C11115c.class, Object.class, "_closeCause$volatile");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f108907j = AtomicReferenceFieldUpdater.newUpdater(C11115c.class, Object.class, "closeHandler$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f108908k = 0;
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    private final int f108909a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ze.c$a */
    final class a implements j<E>, j1 {

        /* renamed from: a, reason: collision with root package name */
        private Object f108910a;

        /* renamed from: b, reason: collision with root package name */
        private C10737n<? super Boolean> f108911b;

        public a() {
            C2857A c2857a;
            c2857a = g.f108939p;
            this.f108910a = c2857a;
        }

        @Override // xe.j1
        public final void a(@NotNull De.x<?> xVar, int i11) {
            C10737n<? super Boolean> c10737n = this.f108911b;
            if (c10737n != null) {
                c10737n.a(xVar, i11);
            }
        }

        @Override // ze.j
        public final Object b(@NotNull kotlin.coroutines.d<? super Boolean> frame) {
            C2857A c2857a;
            m mVar;
            C2857A c2857a2;
            C2857A c2857a3;
            C2857A c2857a4;
            C2857A c2857a5;
            C2857A c2857a6;
            Boolean bool;
            C2857A c2857a7;
            C2857A c2857a8;
            C2857A c2857a9;
            Object obj = this.f108910a;
            c2857a = g.f108939p;
            boolean z11 = true;
            if (obj == c2857a || this.f108910a == g.r()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11115c.f108904g;
                C11115c<E> c11115c = C11115c.this;
                m mVar2 = (m) atomicReferenceFieldUpdater.get(c11115c);
                while (true) {
                    if (c11115c.J()) {
                        this.f108910a = g.r();
                        Throwable D11 = c11115c.D();
                        if (D11 != null) {
                            int i11 = De.z.f6655a;
                            throw D11;
                        }
                        z11 = false;
                    } else {
                        long andIncrement = C11115c.f108900c.getAndIncrement(c11115c);
                        long j11 = g.f108925b;
                        long j12 = andIncrement / j11;
                        int i12 = (int) (andIncrement % j11);
                        if (mVar2.f6654c != j12) {
                            mVar = c11115c.C(j12, mVar2);
                            if (mVar == null) {
                                continue;
                            }
                        } else {
                            mVar = mVar2;
                        }
                        Object U10 = c11115c.U(mVar, i12, andIncrement, null);
                        c2857a2 = g.f108936m;
                        if (U10 == c2857a2) {
                            throw new IllegalStateException("unreachable");
                        }
                        c2857a3 = g.f108938o;
                        if (U10 == c2857a3) {
                            if (andIncrement < c11115c.G()) {
                                mVar.c();
                            }
                            mVar2 = mVar;
                        } else {
                            c2857a4 = g.f108937n;
                            if (U10 == c2857a4) {
                                C11115c<E> c11115c2 = C11115c.this;
                                C10737n<? super Boolean> b11 = C10741p.b(Wc.b.b(frame));
                                try {
                                    this.f108911b = b11;
                                    Object U11 = c11115c2.U(mVar, i12, andIncrement, this);
                                    c2857a5 = g.f108936m;
                                    if (U11 == c2857a5) {
                                        a(mVar, i12);
                                    } else {
                                        c2857a6 = g.f108938o;
                                        if (U11 == c2857a6) {
                                            if (andIncrement < c11115c2.G()) {
                                                mVar.c();
                                            }
                                            m mVar3 = (m) C11115c.f108904g.get(c11115c2);
                                            while (true) {
                                                if (c11115c2.J()) {
                                                    C10737n<? super Boolean> c10737n = this.f108911b;
                                                    Intrinsics.f(c10737n);
                                                    this.f108911b = null;
                                                    this.f108910a = g.r();
                                                    Throwable D12 = c11115c.D();
                                                    if (D12 == null) {
                                                        r.Companion companion = Sc.r.INSTANCE;
                                                        c10737n.resumeWith(Boolean.FALSE);
                                                    } else {
                                                        r.Companion companion2 = Sc.r.INSTANCE;
                                                        c10737n.resumeWith(Sc.s.a(D12));
                                                    }
                                                } else {
                                                    long andIncrement2 = C11115c.f108900c.getAndIncrement(c11115c2);
                                                    long j13 = g.f108925b;
                                                    long j14 = andIncrement2 / j13;
                                                    int i13 = (int) (andIncrement2 % j13);
                                                    if (mVar3.f6654c != j14) {
                                                        m C11 = c11115c2.C(j14, mVar3);
                                                        if (C11 != null) {
                                                            mVar3 = C11;
                                                        }
                                                    }
                                                    Object U12 = c11115c2.U(mVar3, i13, andIncrement2, this);
                                                    c2857a7 = g.f108936m;
                                                    if (U12 == c2857a7) {
                                                        a(mVar3, i13);
                                                        break;
                                                    }
                                                    c2857a8 = g.f108938o;
                                                    if (U12 != c2857a8) {
                                                        c2857a9 = g.f108937n;
                                                        if (U12 == c2857a9) {
                                                            throw new IllegalStateException("unexpected");
                                                        }
                                                        mVar3.c();
                                                        this.f108910a = U12;
                                                        this.f108911b = null;
                                                        bool = Boolean.TRUE;
                                                    } else if (andIncrement2 < c11115c2.G()) {
                                                        mVar3.c();
                                                    }
                                                }
                                            }
                                        } else {
                                            mVar.c();
                                            this.f108910a = U11;
                                            this.f108911b = null;
                                            bool = Boolean.TRUE;
                                        }
                                        b11.G(bool, null);
                                    }
                                    Object n11 = b11.n();
                                    if (n11 == Wc.a.COROUTINE_SUSPENDED) {
                                        Intrinsics.checkNotNullParameter(frame, "frame");
                                    }
                                    return n11;
                                } catch (Throwable th2) {
                                    b11.z();
                                    throw th2;
                                }
                            }
                            mVar.c();
                            this.f108910a = U10;
                        }
                    }
                }
            }
            return Boolean.valueOf(z11);
        }

        public final boolean c(E e11) {
            C10737n<? super Boolean> c10737n = this.f108911b;
            Intrinsics.f(c10737n);
            this.f108911b = null;
            this.f108910a = e11;
            Boolean bool = Boolean.TRUE;
            C11115c.this.getClass();
            return g.q(c10737n, bool, null);
        }

        public final void d() {
            C10737n<? super Boolean> c10737n = this.f108911b;
            Intrinsics.f(c10737n);
            this.f108911b = null;
            this.f108910a = g.r();
            Throwable D11 = C11115c.this.D();
            if (D11 == null) {
                r.Companion companion = Sc.r.INSTANCE;
                c10737n.resumeWith(Boolean.FALSE);
            } else {
                r.Companion companion2 = Sc.r.INSTANCE;
                c10737n.resumeWith(Sc.s.a(D11));
            }
        }

        @Override // ze.j
        public final E next() {
            C2857A c2857a;
            C2857A c2857a2;
            E e11 = (E) this.f108910a;
            c2857a = g.f108939p;
            if (e11 == c2857a) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            c2857a2 = g.f108939p;
            this.f108910a = c2857a2;
            if (e11 != g.r()) {
                return e11;
            }
            Throwable E11 = C11115c.this.E();
            int i11 = De.z.f6655a;
            throw E11;
        }
    }

    /* renamed from: ze.c$b */
    private static final class b implements j1 {
        @Override // xe.j1
        public final void a(@NotNull De.x<?> xVar, int i11) {
            throw null;
        }
    }

    /* renamed from: ze.c$c, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    /* synthetic */ class C2349c extends C7735q implements InterfaceC6511n<C11115c<?>, Ie.j<?>, Object, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final C2349c f108913a = new C2349c(3, C11115c.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(C11115c<?> c11115c, Ie.j<?> jVar, Object obj) {
            C11115c.u(c11115c, jVar);
            return Unit.f71690a;
        }
    }

    /* renamed from: ze.c$d */
    /* loaded from: classes10.dex */
    /* synthetic */ class d extends C7735q implements InterfaceC6511n<C11115c<?>, Object, Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f108914a = new d(3, C11115c.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

        @Override // fd.InterfaceC6511n
        public final Object invoke(C11115c<?> c11115c, Object obj, Object obj2) {
            C11115c.s(c11115c, obj2);
            return obj2;
        }
    }

    /* renamed from: ze.c$e */
    /* synthetic */ class e extends C7735q implements InterfaceC6511n<C11115c<?>, Ie.j<?>, Object, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f108915a = new e(3, C11115c.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

        @Override // fd.InterfaceC6511n
        public final Unit invoke(C11115c<?> c11115c, Ie.j<?> jVar, Object obj) {
            C11115c.u(c11115c, jVar);
            return Unit.f71690a;
        }
    }

    /* renamed from: ze.c$f */
    /* synthetic */ class f extends C7735q implements InterfaceC6511n<C11115c<?>, Object, Object, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f108916a = new f(3, C11115c.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

        @Override // fd.InterfaceC6511n
        public final Object invoke(C11115c<?> c11115c, Object obj, Object obj2) {
            C11115c<?> c11115c2 = c11115c;
            int i11 = C11115c.f108908k;
            c11115c2.getClass();
            if (obj2 == g.r()) {
                obj2 = new l.a(c11115c2.D());
            }
            return l.b(obj2);
        }
    }

    public C11115c(int i11) {
        C2857A c2857a;
        this.f108909a = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException(E.a(i11, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        int i12 = g.f108925b;
        this.bufferEnd$volatile = i11 != 0 ? i11 != Integer.MAX_VALUE ? i11 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f108901d.get(this);
        m mVar = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar;
        this.receiveSegment$volatile = mVar;
        if (L()) {
            mVar = g.f108924a;
            Intrinsics.g(mVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar;
        c2857a = g.f108942s;
        this._closeCause$volatile = c2857a;
    }

    private final void B() {
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        C2857A c2857a4;
        C2857A c2857a5;
        C2857A c2857a6;
        C2857A c2857a7;
        C2857A c2857a8;
        C2857A c2857a9;
        C2857A c2857a10;
        Object c11;
        if (L()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f108905h;
        m<E> mVar = (m) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f108901d.getAndIncrement(this);
            long j11 = andIncrement / g.f108925b;
            if (G() > andIncrement) {
                if (mVar.f6654c != j11) {
                    ze.f fVar = ze.f.f108923a;
                    while (true) {
                        c11 = C2858a.c(mVar, j11, fVar);
                        if (!De.y.b(c11)) {
                            De.x a11 = De.y.a(c11);
                            while (true) {
                                De.x xVar = (De.x) atomicReferenceFieldUpdater.get(this);
                                if (xVar.f6654c >= a11.f6654c) {
                                    break;
                                }
                                if (!a11.n()) {
                                    break;
                                }
                                if (D40.d.f(atomicReferenceFieldUpdater, this, xVar, a11)) {
                                    if (xVar.j()) {
                                        xVar.h();
                                    }
                                } else if (a11.j()) {
                                    a11.h();
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    m<E> mVar2 = null;
                    if (De.y.b(c11)) {
                        g();
                        M(j11, mVar);
                        H(this);
                    } else {
                        m<E> mVar3 = (m) De.y.a(c11);
                        long j12 = mVar3.f6654c;
                        if (j12 > j11) {
                            long j13 = j12 * g.f108925b;
                            if (f108901d.compareAndSet(this, 1 + andIncrement, j13)) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater = f108902e;
                                if ((atomicLongFieldUpdater.addAndGet(this, j13 - andIncrement) & 4611686018427387904L) != 0) {
                                    while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                    }
                                }
                            } else {
                                H(this);
                            }
                        } else {
                            mVar2 = mVar3;
                        }
                    }
                    if (mVar2 == null) {
                        continue;
                    } else {
                        mVar = mVar2;
                    }
                }
                int i11 = (int) (andIncrement % g.f108925b);
                Object t2 = mVar.t(i11);
                boolean z11 = t2 instanceof j1;
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f108900c;
                if (z11 && andIncrement >= atomicLongFieldUpdater2.get(this)) {
                    c2857a9 = g.f108930g;
                    if (mVar.o(i11, t2, c2857a9)) {
                        if (S(t2, mVar, i11)) {
                            mVar.w(i11, g.f108927d);
                            break;
                        }
                        c2857a10 = g.f108933j;
                        mVar.w(i11, c2857a10);
                        mVar.u(i11, false);
                        H(this);
                    }
                }
                while (true) {
                    Object t11 = mVar.t(i11);
                    if (!(t11 instanceof j1)) {
                        c2857a3 = g.f108933j;
                        if (t11 != c2857a3) {
                            if (t11 != null) {
                                if (t11 != g.f108927d) {
                                    c2857a5 = g.f108931h;
                                    if (t11 == c2857a5) {
                                        break loop0;
                                    }
                                    c2857a6 = g.f108932i;
                                    if (t11 == c2857a6) {
                                        break loop0;
                                    }
                                    c2857a7 = g.f108934k;
                                    if (t11 == c2857a7 || t11 == g.r()) {
                                        break loop0;
                                    }
                                    c2857a8 = g.f108929f;
                                    if (t11 != c2857a8) {
                                        throw new IllegalStateException(("Unexpected cell state: " + t11).toString());
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                c2857a4 = g.f108928e;
                                if (mVar.o(i11, t11, c2857a4)) {
                                    break loop0;
                                }
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement >= atomicLongFieldUpdater2.get(this)) {
                        c2857a = g.f108930g;
                        if (mVar.o(i11, t11, c2857a)) {
                            if (S(t11, mVar, i11)) {
                                mVar.w(i11, g.f108927d);
                                break;
                            } else {
                                c2857a2 = g.f108933j;
                                mVar.w(i11, c2857a2);
                                mVar.u(i11, false);
                            }
                        }
                    } else if (mVar.o(i11, t11, new D((j1) t11))) {
                        break loop0;
                    }
                }
            } else {
                if (mVar.f6654c < j11 && mVar.d() != 0) {
                    M(j11, mVar);
                }
                H(this);
                return;
            }
        }
        H(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m<E> C(long j11, m<E> mVar) {
        Object c11;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j12;
        int i11 = g.f108925b;
        ze.f fVar = ze.f.f108923a;
        loop0: while (true) {
            c11 = C2858a.c(mVar, j11, fVar);
            if (!De.y.b(c11)) {
                De.x a11 = De.y.a(c11);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f108904g;
                    De.x xVar = (De.x) atomicReferenceFieldUpdater.get(this);
                    if (xVar.f6654c >= a11.f6654c) {
                        break loop0;
                    }
                    if (!a11.n()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, xVar, a11)) {
                        if (atomicReferenceFieldUpdater.get(this) != xVar) {
                            if (a11.j()) {
                                a11.h();
                            }
                        }
                    }
                    if (xVar.j()) {
                        xVar.h();
                    }
                }
            } else {
                break;
            }
        }
        if (De.y.b(c11)) {
            g();
            if (mVar.f6654c * g.f108925b < G()) {
                mVar.c();
                return null;
            }
        } else {
            m<E> mVar2 = (m) De.y.a(c11);
            boolean L11 = L();
            long j13 = mVar2.f6654c;
            if (!L11 && j11 <= f108901d.get(this) / g.f108925b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f108905h;
                    De.x xVar2 = (De.x) atomicReferenceFieldUpdater2.get(this);
                    if (xVar2.f6654c >= j13 || !mVar2.n()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, xVar2, mVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != xVar2) {
                            if (mVar2.j()) {
                                mVar2.h();
                            }
                        }
                    }
                    if (xVar2.j()) {
                        xVar2.h();
                    }
                }
            }
            if (j13 <= j11) {
                return mVar2;
            }
            long j14 = j13 * g.f108925b;
            do {
                atomicLongFieldUpdater = f108900c;
                j12 = atomicLongFieldUpdater.get(this);
                if (j12 >= j14) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j12, j14));
            if (j13 * g.f108925b < G()) {
                mVar2.c();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable E() {
        Throwable D11 = D();
        return D11 == null ? new p() : D11;
    }

    static void H(C11115c c11115c) {
        c11115c.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f108902e;
        if ((atomicLongFieldUpdater.addAndGet(c11115c, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c11115c) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00b4, code lost:
    
        r0 = (ze.m) r0.e();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean I(long j11, boolean z11) {
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        C2857A c2857a4;
        C2857A c2857a5;
        C2857A c2857a6;
        C2857A c2857a7;
        C2857A c2857a8;
        C2857A c2857a9;
        C2857A c2857a10;
        C2857A c2857a11;
        C2857A c2857a12;
        int i11 = (int) (j11 >> 60);
        if (i11 != 0 && i11 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f108900c;
            if (i11 == 2) {
                z(1152921504606846975L & j11);
                if (z11) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f108904g;
                        m<E> mVar = (m) atomicReferenceFieldUpdater.get(this);
                        long j12 = atomicLongFieldUpdater.get(this);
                        if (G() <= j12) {
                            break;
                        }
                        long j13 = g.f108925b;
                        long j14 = j12 / j13;
                        if (mVar.f6654c != j14 && (mVar = C(j14, mVar)) == null) {
                            if (((m) atomicReferenceFieldUpdater.get(this)).f6654c < j14) {
                                break;
                            }
                        } else {
                            mVar.c();
                            int i12 = (int) (j12 % j13);
                            while (true) {
                                Object t2 = mVar.t(i12);
                                if (t2 != null) {
                                    c2857a2 = g.f108928e;
                                    if (t2 != c2857a2) {
                                        if (t2 == g.f108927d) {
                                            break;
                                        }
                                        c2857a3 = g.f108933j;
                                        if (t2 != c2857a3 && t2 != g.r()) {
                                            c2857a4 = g.f108932i;
                                            if (t2 != c2857a4) {
                                                c2857a5 = g.f108931h;
                                                if (t2 != c2857a5) {
                                                    c2857a6 = g.f108930g;
                                                    if (t2 == c2857a6) {
                                                        break;
                                                    }
                                                    c2857a7 = g.f108929f;
                                                    if (t2 != c2857a7 && j12 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                c2857a = g.f108931h;
                                if (mVar.o(i12, t2, c2857a)) {
                                    B();
                                    break;
                                }
                            }
                            f108900c.compareAndSet(this, j12, j12 + 1);
                        }
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException(Ej.b.a(i11, "unexpected close status: ").toString());
                }
                m<E> z12 = z(1152921504606846975L & j11);
                Object obj = null;
                loop0: do {
                    int i13 = g.f108925b - 1;
                    while (true) {
                        if (-1 >= i13) {
                            break;
                        }
                        long j15 = (z12.f6654c * g.f108925b) + i13;
                        while (true) {
                            Object t11 = z12.t(i13);
                            c2857a8 = g.f108932i;
                            if (t11 == c2857a8) {
                                break loop0;
                            }
                            if (t11 == g.f108927d) {
                                if (j15 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (z12.o(i13, t11, g.r())) {
                                    z12.p(i13);
                                    z12.m();
                                    break;
                                }
                            } else {
                                c2857a9 = g.f108928e;
                                if (t11 != c2857a9 && t11 != null) {
                                    if (!(t11 instanceof j1) && !(t11 instanceof D)) {
                                        c2857a10 = g.f108930g;
                                        if (t11 == c2857a10) {
                                            break loop0;
                                        }
                                        c2857a11 = g.f108929f;
                                        if (t11 == c2857a11) {
                                            break loop0;
                                        }
                                        c2857a12 = g.f108930g;
                                        if (t11 != c2857a12) {
                                            break;
                                        }
                                    } else {
                                        if (j15 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        j1 j1Var = t11 instanceof D ? ((D) t11).f108898a : (j1) t11;
                                        if (z12.o(i13, t11, g.r())) {
                                            obj = C2868k.a(obj, j1Var);
                                            z12.p(i13);
                                            z12.m();
                                            break;
                                        }
                                    }
                                } else if (z12.o(i13, t11, g.r())) {
                                    z12.m();
                                    break;
                                }
                            }
                        }
                        i13--;
                    }
                } while (z12 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            Q((j1) arrayList.get(size), false);
                        }
                    } else {
                        Q((j1) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final boolean L() {
        long j11 = f108901d.get(this);
        return j11 == 0 || j11 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void M(long j11, m<E> mVar) {
        m<E> mVar2;
        m<E> mVar3;
        while (mVar.f6654c < j11 && (mVar3 = (m) mVar.d()) != null) {
            mVar = mVar3;
        }
        while (true) {
            if (!mVar.f() || (mVar2 = (m) mVar.d()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f108905h;
                    De.x xVar = (De.x) atomicReferenceFieldUpdater.get(this);
                    if (xVar.f6654c >= mVar.f6654c) {
                        return;
                    }
                    if (!mVar.n()) {
                        break;
                    }
                    if (D40.c.f(atomicReferenceFieldUpdater, this, xVar, mVar)) {
                        if (xVar.j()) {
                            xVar.h();
                            return;
                        }
                        return;
                    } else if (mVar.j()) {
                        mVar.h();
                    }
                }
            } else {
                mVar = mVar2;
            }
        }
    }

    private final Object N(E e11, kotlin.coroutines.d<? super Unit> frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        Throwable F11 = F();
        r.Companion companion = Sc.r.INSTANCE;
        c10737n.resumeWith(Sc.s.a(F11));
        Object n11 = c10737n.n();
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Object O(C11115c c11115c, kotlin.coroutines.jvm.internal.c cVar) {
        C11116d c11116d;
        int i11;
        m<E> mVar;
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        if (cVar instanceof C11116d) {
            c11116d = (C11116d) cVar;
            int i12 = c11116d.f108919f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c11116d.f108919f = i12 - LinearLayoutManager.INVALID_OFFSET;
                C11116d c11116d2 = c11116d;
                Object obj = c11116d2.f108917d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c11116d2.f108919f;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return ((l) obj).e();
                }
                Sc.s.b(obj);
                m<E> mVar2 = (m) f108904g.get(c11115c);
                while (!c11115c.J()) {
                    long andIncrement = f108900c.getAndIncrement(c11115c);
                    long j11 = g.f108925b;
                    long j12 = andIncrement / j11;
                    int i13 = (int) (andIncrement % j11);
                    if (mVar2.f6654c != j12) {
                        m<E> C11 = c11115c.C(j12, mVar2);
                        if (C11 == null) {
                            continue;
                        } else {
                            mVar = C11;
                        }
                    } else {
                        mVar = mVar2;
                    }
                    C11115c c11115c2 = c11115c;
                    Object U10 = c11115c2.U(mVar, i13, andIncrement, null);
                    c2857a = g.f108936m;
                    if (U10 == c2857a) {
                        throw new IllegalStateException("unexpected");
                    }
                    c2857a2 = g.f108938o;
                    if (U10 != c2857a2) {
                        c2857a3 = g.f108937n;
                        if (U10 != c2857a3) {
                            mVar.c();
                            return U10;
                        }
                        c11116d2.f108919f = 1;
                        Object P11 = c11115c2.P(mVar, i13, andIncrement, c11116d2);
                        return P11 == aVar ? aVar : P11;
                    }
                    if (andIncrement < c11115c2.G()) {
                        mVar.c();
                    }
                    c11115c = c11115c2;
                    mVar2 = mVar;
                }
                return new l.a(c11115c.D());
            }
        }
        c11116d = new C11116d(c11115c, cVar);
        C11116d c11116d22 = c11116d;
        Object obj2 = c11116d22.f108917d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c11116d22.f108919f;
        if (i11 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P(m mVar, int i11, long j11, kotlin.coroutines.jvm.internal.c cVar) {
        ze.e frame;
        int i12;
        C2857A c2857a;
        C2857A c2857a2;
        l b11;
        m<E> mVar2;
        C2857A c2857a3;
        C2857A c2857a4;
        C2857A c2857a5;
        if (cVar instanceof ze.e) {
            frame = (ze.e) cVar;
            int i13 = frame.f108922f;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f108922f = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f108920d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i12 = frame.f108922f;
                if (i12 != 0) {
                    Sc.s.b(obj);
                    frame.f108922f = 1;
                    C10737n b12 = C10741p.b(Wc.b.b(frame));
                    try {
                        v vVar = new v(b12);
                        Object U10 = U(mVar, i11, j11, vVar);
                        c2857a = g.f108936m;
                        if (U10 == c2857a) {
                            vVar.a(mVar, i11);
                        } else {
                            c2857a2 = g.f108938o;
                            if (U10 == c2857a2) {
                                if (j11 < G()) {
                                    mVar.c();
                                }
                                m<E> mVar3 = (m) f108904g.get(this);
                                while (true) {
                                    if (J()) {
                                        r.Companion companion = Sc.r.INSTANCE;
                                        b12.resumeWith(l.b(new l.a(D())));
                                        break;
                                    }
                                    long andIncrement = f108900c.getAndIncrement(this);
                                    long j12 = g.f108925b;
                                    long j13 = andIncrement / j12;
                                    int i14 = (int) (andIncrement % j12);
                                    if (mVar3.f6654c != j13) {
                                        mVar2 = C(j13, mVar3);
                                        if (mVar2 == null) {
                                        }
                                    } else {
                                        mVar2 = mVar3;
                                    }
                                    Object U11 = U(mVar2, i14, andIncrement, vVar);
                                    c2857a3 = g.f108936m;
                                    if (U11 == c2857a3) {
                                        vVar.a(mVar2, i14);
                                        break;
                                    }
                                    c2857a4 = g.f108938o;
                                    if (U11 == c2857a4) {
                                        if (andIncrement < G()) {
                                            mVar2.c();
                                        }
                                        mVar3 = mVar2;
                                    } else {
                                        c2857a5 = g.f108937n;
                                        if (U11 == c2857a5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar2.c();
                                        b11 = l.b(U11);
                                    }
                                }
                            } else {
                                mVar.c();
                                b11 = l.b(U10);
                            }
                            b12.G(b11, null);
                        }
                        obj = b12.n();
                        if (obj == Wc.a.COROUTINE_SUSPENDED) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        b12.z();
                        throw th2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return ((l) obj).e();
            }
        }
        frame = new ze.e(this, cVar);
        Object obj2 = frame.f108920d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i12 = frame.f108922f;
        if (i12 != 0) {
        }
        return ((l) obj2).e();
    }

    private final void Q(j1 j1Var, boolean z11) {
        if (j1Var instanceof b) {
            ((b) j1Var).getClass();
            r.Companion companion = Sc.r.INSTANCE;
            throw null;
        }
        if (j1Var instanceof InterfaceC10733l) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) j1Var;
            r.Companion companion2 = Sc.r.INSTANCE;
            dVar.resumeWith(Sc.s.a(z11 ? E() : F()));
        } else if (j1Var instanceof v) {
            C10737n<l<? extends E>> c10737n = ((v) j1Var).f108962a;
            r.Companion companion3 = Sc.r.INSTANCE;
            c10737n.resumeWith(l.b(new l.a(D())));
        } else if (j1Var instanceof a) {
            ((a) j1Var).d();
        } else if (j1Var instanceof Ie.j) {
            ((Ie.j) j1Var).d(this, g.r());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + j1Var).toString());
        }
    }

    private final boolean R(Object obj, E e11) {
        if (obj instanceof Ie.j) {
            return ((Ie.j) obj).d(this, e11);
        }
        if (obj instanceof v) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return g.q(((v) obj).f108962a, l.b(e11), null);
        }
        if (obj instanceof a) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).c(e11);
        }
        if (obj instanceof InterfaceC10733l) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            return g.q((InterfaceC10733l) obj, e11, null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean S(Object obj, m<E> mVar, int i11) {
        if (obj instanceof InterfaceC10733l) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return g.s((InterfaceC10733l) obj, Unit.f71690a);
        }
        if (obj instanceof Ie.j) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            Ie.l o11 = ((Ie.h) obj).o(this, Unit.f71690a);
            if (o11 == Ie.l.REREGISTER) {
                mVar.p(i11);
            }
            return o11 == Ie.l.SUCCESSFUL;
        }
        if (obj instanceof b) {
            ((b) obj).getClass();
            g.s(null, Boolean.TRUE);
            throw null;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U(m<E> mVar, int i11, long j11, Object obj) {
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        C2857A c2857a4;
        C2857A c2857a5;
        C2857A c2857a6;
        C2857A c2857a7;
        C2857A c2857a8;
        C2857A c2857a9;
        C2857A c2857a10;
        C2857A c2857a11;
        C2857A c2857a12;
        C2857A c2857a13;
        C2857A c2857a14;
        C2857A c2857a15;
        C2857A c2857a16;
        C2857A c2857a17;
        C2857A c2857a18;
        C2857A c2857a19;
        Object t2 = mVar.t(i11);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f108899b;
        if (t2 == null) {
            if (j11 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    c2857a19 = g.f108937n;
                    return c2857a19;
                }
                if (mVar.o(i11, t2, obj)) {
                    B();
                    c2857a18 = g.f108936m;
                    return c2857a18;
                }
            }
        } else if (t2 == g.f108927d) {
            c2857a = g.f108932i;
            if (mVar.o(i11, t2, c2857a)) {
                B();
                return mVar.v(i11);
            }
        }
        while (true) {
            Object t11 = mVar.t(i11);
            if (t11 != null) {
                c2857a6 = g.f108928e;
                if (t11 != c2857a6) {
                    if (t11 == g.f108927d) {
                        c2857a7 = g.f108932i;
                        if (mVar.o(i11, t11, c2857a7)) {
                            B();
                            return mVar.v(i11);
                        }
                    } else {
                        c2857a8 = g.f108933j;
                        if (t11 == c2857a8) {
                            c2857a9 = g.f108938o;
                            return c2857a9;
                        }
                        c2857a10 = g.f108931h;
                        if (t11 == c2857a10) {
                            c2857a11 = g.f108938o;
                            return c2857a11;
                        }
                        if (t11 == g.r()) {
                            B();
                            c2857a12 = g.f108938o;
                            return c2857a12;
                        }
                        c2857a13 = g.f108930g;
                        if (t11 != c2857a13) {
                            c2857a14 = g.f108929f;
                            if (mVar.o(i11, t11, c2857a14)) {
                                boolean z11 = t11 instanceof D;
                                if (z11) {
                                    t11 = ((D) t11).f108898a;
                                }
                                if (S(t11, mVar, i11)) {
                                    c2857a17 = g.f108932i;
                                    mVar.w(i11, c2857a17);
                                    B();
                                    return mVar.v(i11);
                                }
                                c2857a15 = g.f108933j;
                                mVar.w(i11, c2857a15);
                                mVar.u(i11, false);
                                if (z11) {
                                    B();
                                }
                                c2857a16 = g.f108938o;
                                return c2857a16;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j11 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                c2857a2 = g.f108931h;
                if (mVar.o(i11, t11, c2857a2)) {
                    B();
                    c2857a3 = g.f108938o;
                    return c2857a3;
                }
            } else {
                if (obj == null) {
                    c2857a4 = g.f108937n;
                    return c2857a4;
                }
                if (mVar.o(i11, t11, obj)) {
                    B();
                    c2857a5 = g.f108936m;
                    return c2857a5;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int V(m<E> mVar, int i11, E e11, long j11, Object obj, boolean z11) {
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        C2857A c2857a4;
        C2857A c2857a5;
        C2857A c2857a6;
        C2857A c2857a7;
        while (true) {
            Object t2 = mVar.t(i11);
            if (t2 != null) {
                c2857a2 = g.f108928e;
                if (t2 != c2857a2) {
                    c2857a3 = g.f108934k;
                    if (t2 == c2857a3) {
                        mVar.p(i11);
                        return 5;
                    }
                    c2857a4 = g.f108931h;
                    if (t2 == c2857a4) {
                        mVar.p(i11);
                        return 5;
                    }
                    if (t2 == g.r()) {
                        mVar.p(i11);
                        g();
                        return 4;
                    }
                    mVar.p(i11);
                    if (t2 instanceof D) {
                        t2 = ((D) t2).f108898a;
                    }
                    if (R(t2, e11)) {
                        c2857a7 = g.f108932i;
                        mVar.w(i11, c2857a7);
                        return 0;
                    }
                    c2857a5 = g.f108934k;
                    Object q11 = mVar.q(i11, c2857a5);
                    c2857a6 = g.f108934k;
                    if (q11 != c2857a6) {
                        mVar.u(i11, true);
                    }
                    return 5;
                }
                if (mVar.o(i11, t2, g.f108927d)) {
                    break;
                }
            } else if (!x(j11) || z11) {
                if (z11) {
                    c2857a = g.f108933j;
                    if (mVar.o(i11, null, c2857a)) {
                        mVar.u(i11, false);
                        return 4;
                    }
                } else {
                    if (obj == null) {
                        return 3;
                    }
                    if (mVar.o(i11, null, obj)) {
                        return 2;
                    }
                }
            } else if (mVar.o(i11, null, g.f108927d)) {
                break;
            }
        }
    }

    public static final m m(C11115c c11115c, long j11, m mVar) {
        Object c11;
        C11115c c11115c2;
        c11115c.getClass();
        int i11 = g.f108925b;
        ze.f fVar = ze.f.f108923a;
        loop0: while (true) {
            c11 = C2858a.c(mVar, j11, fVar);
            if (!De.y.b(c11)) {
                De.x a11 = De.y.a(c11);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f108903f;
                    De.x xVar = (De.x) atomicReferenceFieldUpdater.get(c11115c);
                    if (xVar.f6654c >= a11.f6654c) {
                        break loop0;
                    }
                    if (!a11.n()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c11115c, xVar, a11)) {
                        if (atomicReferenceFieldUpdater.get(c11115c) != xVar) {
                            if (a11.j()) {
                                a11.h();
                            }
                        }
                    }
                    if (xVar.j()) {
                        xVar.h();
                    }
                }
            } else {
                break;
            }
        }
        boolean b11 = De.y.b(c11);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f108900c;
        if (b11) {
            c11115c.g();
            if (mVar.f6654c * g.f108925b < atomicLongFieldUpdater.get(c11115c)) {
                mVar.c();
                return null;
            }
        } else {
            m mVar2 = (m) De.y.a(c11);
            long j12 = mVar2.f6654c;
            if (j12 <= j11) {
                return mVar2;
            }
            long j13 = g.f108925b * j12;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f108899b;
                long j14 = atomicLongFieldUpdater2.get(c11115c);
                long j15 = 1152921504606846975L & j14;
                if (j15 >= j13) {
                    c11115c2 = c11115c;
                    break;
                }
                c11115c2 = c11115c;
                if (atomicLongFieldUpdater2.compareAndSet(c11115c2, j14, j15 + (((int) (j14 >> 60)) << 60))) {
                    break;
                }
                c11115c = c11115c2;
            }
            if (j12 * g.f108925b < atomicLongFieldUpdater.get(c11115c2)) {
                mVar2.c();
            }
        }
        return null;
    }

    public static final void r(C11115c c11115c, Object obj, C10737n c10737n) {
        c11115c.getClass();
        Throwable F11 = c11115c.F();
        r.Companion companion = Sc.r.INSTANCE;
        c10737n.resumeWith(Sc.s.a(F11));
    }

    public static final void s(C11115c c11115c, Object obj) {
        c11115c.getClass();
        if (obj == g.r()) {
            throw c11115c.E();
        }
    }

    public static final void u(C11115c c11115c, Ie.j jVar) {
        m<E> mVar;
        C11115c c11115c2;
        Ie.j jVar2;
        int i11;
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        c11115c.getClass();
        m<E> mVar2 = (m) f108904g.get(c11115c);
        while (!c11115c.J()) {
            long andIncrement = f108900c.getAndIncrement(c11115c);
            long j11 = g.f108925b;
            long j12 = andIncrement / j11;
            int i12 = (int) (andIncrement % j11);
            if (mVar2.f6654c != j12) {
                m<E> C11 = c11115c.C(j12, mVar2);
                if (C11 == null) {
                    continue;
                } else {
                    mVar = C11;
                    jVar2 = jVar;
                    i11 = i12;
                    c11115c2 = c11115c;
                }
            } else {
                mVar = mVar2;
                c11115c2 = c11115c;
                jVar2 = jVar;
                i11 = i12;
            }
            Object U10 = c11115c2.U(mVar, i11, andIncrement, jVar2);
            mVar2 = mVar;
            c2857a = g.f108936m;
            if (U10 == c2857a) {
                j1 j1Var = jVar2 instanceof j1 ? (j1) jVar2 : null;
                if (j1Var != null) {
                    j1Var.a(mVar2, i11);
                    return;
                }
                return;
            }
            c2857a2 = g.f108938o;
            if (U10 != c2857a2) {
                c2857a3 = g.f108937n;
                if (U10 == c2857a3) {
                    throw new IllegalStateException("unexpected");
                }
                mVar2.c();
                jVar2.c(U10);
                return;
            }
            if (andIncrement < c11115c2.G()) {
                mVar2.c();
            }
            c11115c = c11115c2;
            jVar = jVar2;
        }
        jVar.c(g.r());
    }

    public static final int w(C11115c c11115c, m mVar, int i11, Object obj, long j11, Object obj2, boolean z11) {
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        c11115c.getClass();
        mVar.x(i11, obj);
        if (z11) {
            return c11115c.V(mVar, i11, obj, j11, obj2, z11);
        }
        Object t2 = mVar.t(i11);
        if (t2 == null) {
            if (c11115c.x(j11)) {
                if (mVar.o(i11, null, g.f108927d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.o(i11, null, obj2)) {
                    return 2;
                }
            }
        } else if (t2 instanceof j1) {
            mVar.p(i11);
            if (c11115c.R(t2, obj)) {
                c2857a3 = g.f108932i;
                mVar.w(i11, c2857a3);
                return 0;
            }
            c2857a = g.f108934k;
            Object q11 = mVar.q(i11, c2857a);
            c2857a2 = g.f108934k;
            if (q11 == c2857a2) {
                return 5;
            }
            mVar.u(i11, true);
            return 5;
        }
        return c11115c.V(mVar, i11, obj, j11, obj2, z11);
    }

    private final boolean x(long j11) {
        return j11 < f108901d.get(this) || j11 < f108900c.get(this) + ((long) this.f108909a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        r1 = (ze.m) r1.e();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final m<E> z(long j11) {
        C2857A c2857a;
        long j12;
        C2857A c2857a2;
        Object obj = f108905h.get(this);
        m mVar = (m) f108903f.get(this);
        if (mVar.f6654c > ((m) obj).f6654c) {
            obj = mVar;
        }
        m mVar2 = (m) f108904g.get(this);
        if (mVar2.f6654c > ((m) obj).f6654c) {
            obj = mVar2;
        }
        m<E> mVar3 = (m) C2858a.b((AbstractC2861d) obj);
        if (K()) {
            m<E> mVar4 = mVar3;
            loop0: do {
                int i11 = g.f108925b - 1;
                while (true) {
                    if (-1 >= i11) {
                        break;
                    }
                    j12 = (mVar4.f6654c * g.f108925b) + i11;
                    if (j12 < f108900c.get(this)) {
                        break loop0;
                    }
                    while (true) {
                        Object t2 = mVar4.t(i11);
                        if (t2 != null) {
                            c2857a2 = g.f108928e;
                            if (t2 != c2857a2) {
                                if (t2 == g.f108927d) {
                                    break loop0;
                                }
                            }
                        }
                        if (mVar4.o(i11, t2, g.r())) {
                            mVar4.m();
                            break;
                        }
                    }
                    i11--;
                }
            } while (mVar4 != null);
            j12 = -1;
            if (j12 != -1) {
                A(j12);
            }
        }
        Object obj2 = null;
        loop3: for (m<E> mVar5 = mVar3; mVar5 != null; mVar5 = (m) mVar5.e()) {
            for (int i12 = g.f108925b - 1; -1 < i12; i12--) {
                if ((mVar5.f6654c * g.f108925b) + i12 < j11) {
                    break loop3;
                }
                while (true) {
                    Object t11 = mVar5.t(i12);
                    if (t11 != null) {
                        c2857a = g.f108928e;
                        if (t11 != c2857a) {
                            if (!(t11 instanceof D)) {
                                if (!(t11 instanceof j1)) {
                                    break;
                                }
                                if (mVar5.o(i12, t11, g.r())) {
                                    obj2 = C2868k.a(obj2, t11);
                                    mVar5.u(i12, true);
                                    break;
                                }
                            } else {
                                if (mVar5.o(i12, t11, g.r())) {
                                    obj2 = C2868k.a(obj2, ((D) t11).f108898a);
                                    mVar5.u(i12, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (mVar5.o(i12, t11, g.r())) {
                        mVar5.m();
                        break;
                    }
                }
            }
        }
        if (obj2 != null) {
            if (!(obj2 instanceof ArrayList)) {
                Q((j1) obj2, true);
                return mVar3;
            }
            ArrayList arrayList = (ArrayList) obj2;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                Q((j1) arrayList.get(size), true);
            }
        }
        return mVar3;
    }

    protected final void A(long j11) {
        C2857A c2857a;
        m<E> mVar = (m) f108904g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f108900c;
            long j12 = atomicLongFieldUpdater.get(this);
            if (j11 < Math.max(this.f108909a + j12, f108901d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j12, 1 + j12)) {
                long j13 = g.f108925b;
                long j14 = j12 / j13;
                int i11 = (int) (j12 % j13);
                if (mVar.f6654c != j14) {
                    m<E> C11 = C(j14, mVar);
                    if (C11 != null) {
                        mVar = C11;
                    }
                }
                m<E> mVar2 = mVar;
                Object U10 = U(mVar2, i11, j12, null);
                c2857a = g.f108938o;
                if (U10 != c2857a) {
                    mVar2.c();
                } else if (j12 < G()) {
                    mVar2.c();
                }
                mVar = mVar2;
            }
        }
    }

    protected final Throwable D() {
        return (Throwable) f108906i.get(this);
    }

    @NotNull
    protected final Throwable F() {
        Throwable D11 = D();
        return D11 == null ? new q("Channel was closed") : D11;
    }

    public final long G() {
        return f108899b.get(this) & 1152921504606846975L;
    }

    public final boolean J() {
        return I(f108899b.get(this), true);
    }

    protected boolean K() {
        return false;
    }

    @NotNull
    protected final Object T(E e11) {
        m mVar;
        int i11;
        C11115c<E> c11115c;
        Object obj = g.f108927d;
        m mVar2 = (m) f108903f.get(this);
        while (true) {
            long andIncrement = f108899b.getAndIncrement(this);
            long j11 = andIncrement & 1152921504606846975L;
            boolean I11 = I(andIncrement, false);
            int i12 = g.f108925b;
            long j12 = i12;
            long j13 = j11 / j12;
            int i13 = (int) (j11 % j12);
            if (mVar2.f6654c != j13) {
                mVar = m(this, j13, mVar2);
                if (mVar != null) {
                    c11115c = this;
                    i11 = i13;
                } else if (I11) {
                    return new l.a(F());
                }
            } else {
                mVar = mVar2;
                i11 = i13;
                c11115c = this;
            }
            E e12 = e11;
            int w11 = w(c11115c, mVar, i11, e12, j11, obj, I11);
            mVar2 = mVar;
            if (w11 == 0) {
                mVar2.c();
                return Unit.f71690a;
            }
            if (w11 == 1) {
                return Unit.f71690a;
            }
            if (w11 == 2) {
                if (I11) {
                    mVar2.m();
                    return new l.a(F());
                }
                j1 j1Var = obj instanceof j1 ? (j1) obj : null;
                if (j1Var != null) {
                    j1Var.a(mVar2, i11 + i12);
                }
                A((mVar2.f6654c * j12) + i11);
                return Unit.f71690a;
            }
            if (w11 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (w11 == 4) {
                if (j11 < f108900c.get(this)) {
                    mVar2.c();
                }
                return new l.a(F());
            }
            if (w11 == 5) {
                mVar2.c();
            }
            e11 = e12;
        }
    }

    public final void W(long j11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        int i11;
        C11115c<E> c11115c = this;
        if (c11115c.L()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f108901d;
            if (atomicLongFieldUpdater.get(c11115c) > j11) {
                break;
            } else {
                c11115c = this;
            }
        }
        i11 = g.f108926c;
        int i12 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f108902e;
            if (i12 < i11) {
                long j12 = atomicLongFieldUpdater.get(c11115c);
                if (j12 == (4611686018427387903L & atomicLongFieldUpdater2.get(c11115c)) && j12 == atomicLongFieldUpdater.get(c11115c)) {
                    return;
                } else {
                    i12++;
                }
            } else {
                while (true) {
                    long j13 = atomicLongFieldUpdater2.get(c11115c);
                    if (atomicLongFieldUpdater2.compareAndSet(c11115c, j13, (j13 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c11115c = this;
                    }
                }
                while (true) {
                    long j14 = atomicLongFieldUpdater.get(c11115c);
                    long j15 = atomicLongFieldUpdater2.get(c11115c);
                    long j16 = j15 & 4611686018427387903L;
                    boolean z11 = (j15 & 4611686018427387904L) != 0;
                    if (j14 == j16 && j14 == atomicLongFieldUpdater.get(c11115c)) {
                        break;
                    }
                    if (!z11) {
                        atomicLongFieldUpdater2.compareAndSet(this, j15, 4611686018427387904L + j16);
                    }
                    c11115c = this;
                }
                while (true) {
                    long j17 = atomicLongFieldUpdater2.get(c11115c);
                    if (atomicLongFieldUpdater2.compareAndSet(c11115c, j17, j17 & 4611686018427387903L)) {
                        return;
                    } else {
                        c11115c = this;
                    }
                }
            }
        }
    }

    @Override // ze.x
    public final void a(@NotNull Function1<? super Throwable, Unit> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        C2857A c2857a4;
        do {
            atomicReferenceFieldUpdater = f108907j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c2857a = g.f108940q;
            if (obj != c2857a) {
                c2857a2 = g.f108941r;
                if (obj == c2857a2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            c2857a3 = g.f108940q;
            c2857a4 = g.f108941r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c2857a3, c2857a4)) {
                if (atomicReferenceFieldUpdater.get(this) != c2857a3) {
                    break;
                }
            }
            function1.invoke(D());
            return;
        }
    }

    @Override // ze.x
    @NotNull
    public Object b(E e11) {
        Object obj;
        l.b bVar;
        l.b bVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f108899b;
        long j11 = 1152921504606846975L;
        if (I(atomicLongFieldUpdater.get(this), false) ? false : !x(r1 & 1152921504606846975L)) {
            bVar2 = l.f108947b;
            return bVar2;
        }
        obj = g.f108933j;
        m mVar = (m) f108903f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = andIncrement & j11;
            boolean I11 = I(andIncrement, false);
            int i11 = g.f108925b;
            long j13 = i11;
            long j14 = j12 / j13;
            int i12 = (int) (j12 % j13);
            if (mVar.f6654c != j14) {
                m m11 = m(this, j14, mVar);
                if (m11 != null) {
                    mVar = m11;
                } else {
                    if (I11) {
                        return new l.a(F());
                    }
                    j11 = 1152921504606846975L;
                }
            }
            int w11 = w(this, mVar, i12, e11, j12, obj, I11);
            if (w11 == 0) {
                mVar.c();
                return Unit.f71690a;
            }
            if (w11 == 1) {
                return Unit.f71690a;
            }
            if (w11 == 2) {
                if (I11) {
                    mVar.m();
                    return new l.a(F());
                }
                j1 j1Var = obj instanceof j1 ? (j1) obj : null;
                if (j1Var != null) {
                    j1Var.a(mVar, i12 + i11);
                }
                mVar.m();
                bVar = l.f108947b;
                return bVar;
            }
            if (w11 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (w11 == 4) {
                if (j12 < f108900c.get(this)) {
                    mVar.c();
                }
                return new l.a(F());
            }
            if (w11 == 5) {
                mVar.c();
            }
            j11 = 1152921504606846975L;
        }
    }

    @Override // ze.w
    @NotNull
    public final Ie.f c() {
        e eVar = e.f108915a;
        Intrinsics.g(eVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        U.g(3, eVar);
        f fVar = f.f108916a;
        Intrinsics.g(fVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        U.g(3, fVar);
        return new Ie.f(this, eVar, fVar, null);
    }

    @Override // ze.w
    @NotNull
    public final Object e() {
        Object obj;
        m<E> mVar;
        C2857A c2857a;
        l.b bVar;
        C2857A c2857a2;
        C2857A c2857a3;
        l.b bVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f108900c;
        long j11 = atomicLongFieldUpdater.get(this);
        long j12 = f108899b.get(this);
        if (I(j12, true)) {
            return new l.a(D());
        }
        if (j11 >= (j12 & 1152921504606846975L)) {
            bVar2 = l.f108947b;
            return bVar2;
        }
        obj = g.f108934k;
        m<E> mVar2 = (m) f108904g.get(this);
        while (!J()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j13 = g.f108925b;
            long j14 = andIncrement / j13;
            int i11 = (int) (andIncrement % j13);
            if (mVar2.f6654c != j14) {
                mVar = C(j14, mVar2);
                if (mVar == null) {
                    continue;
                }
            } else {
                mVar = mVar2;
            }
            Object U10 = U(mVar, i11, andIncrement, obj);
            mVar2 = mVar;
            c2857a = g.f108936m;
            if (U10 == c2857a) {
                j1 j1Var = obj instanceof j1 ? (j1) obj : null;
                if (j1Var != null) {
                    j1Var.a(mVar2, i11);
                }
                W(andIncrement);
                mVar2.m();
                bVar = l.f108947b;
                return bVar;
            }
            c2857a2 = g.f108938o;
            if (U10 != c2857a2) {
                c2857a3 = g.f108937n;
                if (U10 == c2857a3) {
                    throw new IllegalStateException("unexpected");
                }
                mVar2.c();
                return U10;
            }
            if (andIncrement < G()) {
                mVar2.c();
            }
        }
        return new l.a(D());
    }

    @Override // ze.w
    public final Object f(@NotNull kotlin.coroutines.d<? super l<? extends E>> dVar) {
        return O(this, (kotlin.coroutines.jvm.internal.c) dVar);
    }

    @Override // ze.x
    public final boolean g() {
        return I(f108899b.get(this), false);
    }

    @Override // ze.w
    @NotNull
    public final Ie.f h() {
        C2349c c2349c = C2349c.f108913a;
        Intrinsics.g(c2349c, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        U.g(3, c2349c);
        d dVar = d.f108914a;
        Intrinsics.g(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        U.g(3, dVar);
        return new Ie.f(this, c2349c, dVar, null);
    }

    @Override // ze.w
    public final Object i(@NotNull kotlin.coroutines.d<? super E> frame) {
        m<E> mVar;
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        Throwable th2;
        C2857A c2857a4;
        C2857A c2857a5;
        m<E> mVar2;
        C2857A c2857a6;
        C2857A c2857a7;
        C2857A c2857a8;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f108904g;
        m<E> mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (!J()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f108900c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = g.f108925b;
            long j12 = andIncrement / j11;
            int i11 = (int) (andIncrement % j11);
            if (mVar3.f6654c != j12) {
                m<E> C11 = C(j12, mVar3);
                if (C11 == null) {
                    continue;
                } else {
                    mVar = C11;
                }
            } else {
                mVar = mVar3;
            }
            Object U10 = U(mVar, i11, andIncrement, null);
            c2857a = g.f108936m;
            if (U10 == c2857a) {
                throw new IllegalStateException("unexpected");
            }
            c2857a2 = g.f108938o;
            if (U10 == c2857a2) {
                if (andIncrement < G()) {
                    mVar.c();
                }
                mVar3 = mVar;
            } else {
                c2857a3 = g.f108937n;
                if (U10 != c2857a3) {
                    mVar.c();
                    return U10;
                }
                C10737n b11 = C10741p.b(Wc.b.b(frame));
                C11115c<E> c11115c = this;
                try {
                    Object U11 = c11115c.U(mVar, i11, andIncrement, b11);
                    c2857a4 = g.f108936m;
                    if (U11 == c2857a4) {
                        b11.a(mVar, i11);
                    } else {
                        c2857a5 = g.f108938o;
                        if (U11 == c2857a5) {
                            if (andIncrement < G()) {
                                mVar.c();
                            }
                            m<E> mVar4 = (m) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (J()) {
                                    r.Companion companion = Sc.r.INSTANCE;
                                    b11.resumeWith(Sc.s.a(E()));
                                    break;
                                }
                                C10737n c10737n = b11;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j13 = g.f108925b;
                                    long j14 = andIncrement2 / j13;
                                    int i12 = (int) (andIncrement2 % j13);
                                    if (mVar4.f6654c != j14) {
                                        try {
                                            m<E> C12 = C(j14, mVar4);
                                            if (C12 == null) {
                                                b11 = c10737n;
                                            } else {
                                                mVar2 = C12;
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            b11 = c10737n;
                                            b11.z();
                                            throw th2;
                                        }
                                    } else {
                                        mVar2 = mVar4;
                                    }
                                    Object U12 = c11115c.U(mVar2, i12, andIncrement2, c10737n);
                                    m<E> mVar5 = mVar2;
                                    b11 = c10737n;
                                    c2857a6 = g.f108936m;
                                    if (U12 == c2857a6) {
                                        b11.a(mVar5, i12);
                                        break;
                                    }
                                    c2857a7 = g.f108938o;
                                    if (U12 == c2857a7) {
                                        if (andIncrement2 < G()) {
                                            mVar5.c();
                                        }
                                        c11115c = this;
                                        mVar4 = mVar5;
                                    } else {
                                        c2857a8 = g.f108937n;
                                        if (U12 == c2857a8) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar5.c();
                                        b11.G(U12, null);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    b11 = c10737n;
                                    th2 = th;
                                    b11.z();
                                    throw th2;
                                }
                            }
                        } else {
                            mVar.c();
                            b11.G(U11, null);
                        }
                    }
                    Object n11 = b11.n();
                    if (n11 == Wc.a.COROUTINE_SUSPENDED) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    return n11;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        Throwable E11 = E();
        int i13 = De.z.f6655a;
        throw E11;
    }

    @Override // ze.w
    @NotNull
    public final j<E> iterator() {
        return new a();
    }

    @Override // ze.w
    public final void j(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        y(true, cancellationException);
    }

    @Override // ze.x
    public final boolean l(Throwable th2) {
        return y(false, th2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a0, code lost:
    
        return kotlin.Unit.f71690a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00c0, code lost:
    
        r(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182 A[RETURN] */
    @Override // ze.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(E e11, @NotNull kotlin.coroutines.d<? super Unit> frame) {
        int w11;
        Unit unit;
        Object n11;
        Wc.a aVar;
        E e12;
        C11115c<E> c11115c;
        m mVar;
        int i11;
        int i12;
        boolean z11;
        C11115c<E> c11115c2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f108903f;
        m mVar2 = (m) atomicReferenceFieldUpdater.get(c11115c2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f108899b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c11115c2);
            long j11 = andIncrement & 1152921504606846975L;
            boolean I11 = c11115c2.I(andIncrement, false);
            int i13 = g.f108925b;
            long j12 = i13;
            long j13 = j11 / j12;
            int i14 = (int) (j11 % j12);
            if (mVar2.f6654c != j13) {
                m m11 = m(c11115c2, j13, mVar2);
                if (m11 != null) {
                    mVar2 = m11;
                } else if (I11) {
                    Object N11 = N(e11, frame);
                    if (N11 == Wc.a.COROUTINE_SUSPENDED) {
                        return N11;
                    }
                }
            }
            int w12 = w(c11115c2, mVar2, i14, e11, j11, null, I11);
            if (w12 == 0) {
                mVar2.c();
                break;
            }
            if (w12 == 1) {
                break;
            }
            if (w12 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f108900c;
                if (w12 == 3) {
                    C10737n b11 = C10741p.b(Wc.b.b(frame));
                    E e13 = e11;
                    try {
                        w11 = w(c11115c2, mVar2, i14, e13, j11, b11, false);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        if (w11 == 0) {
                            mVar2.c();
                            r.Companion companion = Sc.r.INSTANCE;
                            unit = Unit.f71690a;
                        } else if (w11 != 1) {
                            if (w11 != 2) {
                                if (w11 != 4) {
                                    String str = "unexpected";
                                    if (w11 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    mVar2.c();
                                    m mVar3 = (m) atomicReferenceFieldUpdater.get(c11115c2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c11115c2);
                                        long j14 = andIncrement2 & 1152921504606846975L;
                                        boolean I12 = c11115c2.I(andIncrement2, false);
                                        int i15 = g.f108925b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j15 = i15;
                                        String str2 = str;
                                        long j16 = j14 / j15;
                                        int i16 = (int) (j14 % j15);
                                        if (mVar3.f6654c != j16) {
                                            m m12 = m(c11115c2, j16, mVar3);
                                            if (m12 != null) {
                                                i11 = i15;
                                                i12 = i16;
                                                z11 = I12;
                                                mVar = m12;
                                            } else {
                                                if (I12) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                            }
                                        } else {
                                            mVar = mVar3;
                                            i11 = i15;
                                            i12 = i16;
                                            z11 = I12;
                                        }
                                        int w13 = w(c11115c2, mVar, i12, e13, j14, b11, z11);
                                        E e14 = e13;
                                        c11115c = c11115c2;
                                        m mVar4 = mVar;
                                        int i17 = i12;
                                        e12 = e14;
                                        if (w13 == 0) {
                                            mVar4.c();
                                            r.Companion companion2 = Sc.r.INSTANCE;
                                            unit = Unit.f71690a;
                                            break;
                                        }
                                        if (w13 == 1) {
                                            r.Companion companion3 = Sc.r.INSTANCE;
                                            unit = Unit.f71690a;
                                            break;
                                        }
                                        if (w13 != 2) {
                                            if (w13 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (w13 != 4) {
                                                if (w13 == 5) {
                                                    mVar4.c();
                                                }
                                                mVar3 = mVar4;
                                                c11115c2 = c11115c;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                                e13 = e12;
                                            } else if (j14 < atomicLongFieldUpdater2.get(c11115c)) {
                                                mVar4.c();
                                            }
                                        } else if (z11) {
                                            mVar4.m();
                                        } else {
                                            b11.a(mVar4, i17 + i11);
                                        }
                                    }
                                } else {
                                    e12 = e13;
                                    c11115c = c11115c2;
                                    if (j11 < atomicLongFieldUpdater2.get(c11115c)) {
                                        mVar2.c();
                                    }
                                }
                                r(c11115c, e12, b11);
                            } else {
                                b11.a(mVar2, i14 + i13);
                            }
                            n11 = b11.n();
                            aVar = Wc.a.COROUTINE_SUSPENDED;
                            if (n11 == aVar) {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            }
                            if (n11 != aVar) {
                                n11 = Unit.f71690a;
                            }
                            if (n11 == aVar) {
                                return n11;
                            }
                        } else {
                            r.Companion companion4 = Sc.r.INSTANCE;
                            unit = Unit.f71690a;
                        }
                        b11.resumeWith(unit);
                        n11 = b11.n();
                        aVar = Wc.a.COROUTINE_SUSPENDED;
                        if (n11 == aVar) {
                        }
                        if (n11 != aVar) {
                        }
                        if (n11 == aVar) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        b11.z();
                        throw th;
                    }
                } else if (w12 == 4) {
                    if (j11 < atomicLongFieldUpdater2.get(c11115c2)) {
                        mVar2.c();
                    }
                    Object N12 = N(e11, frame);
                    if (N12 == Wc.a.COROUTINE_SUSPENDED) {
                        return N12;
                    }
                } else if (w12 == 5) {
                    mVar2.c();
                }
            } else if (I11) {
                mVar2.m();
                Object N13 = N(e11, frame);
                if (N13 == Wc.a.COROUTINE_SUSPENDED) {
                    return N13;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d0, code lost:
    
        r16 = r7;
        r3 = (ze.m) r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d9, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z11;
        C2857A c2857a;
        String str;
        C2857A c2857a2;
        C2857A c2857a3;
        C2857A c2857a4;
        C2857A c2857a5;
        C2857A c2857a6;
        C2857A c2857a7;
        m mVar;
        StringBuilder sb2 = new StringBuilder();
        int i11 = (int) (f108899b.get(this) >> 60);
        if (i11 == 2) {
            sb2.append("closed,");
        } else if (i11 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f108909a + ',');
        sb2.append("data=[");
        int i12 = 0;
        boolean z12 = true;
        List b02 = C7714v.b0(f108904g.get(this), f108903f.get(this), f108905h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : b02) {
            m mVar2 = (m) obj;
            mVar = g.f108924a;
            if (mVar2 != mVar) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j11 = ((m) next).f6654c;
            do {
                Object next2 = it.next();
                long j12 = ((m) next2).f6654c;
                if (j11 > j12) {
                    next = next2;
                    j11 = j12;
                }
            } while (it.hasNext());
        }
        m mVar3 = (m) next;
        long j13 = f108900c.get(this);
        long G11 = G();
        loop2: while (true) {
            int i13 = g.f108925b;
            int i14 = i12;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                long j14 = (mVar3.f6654c * g.f108925b) + i14;
                if (j14 >= G11 && j14 >= j13) {
                    break loop2;
                }
                Object t2 = mVar3.t(i14);
                Object s11 = mVar3.s(i14);
                boolean z13 = z12;
                if (t2 instanceof InterfaceC10733l) {
                    str = (j14 >= j13 || j14 < G11) ? (j14 >= G11 || j14 < j13) ? "cont" : "send" : "receive";
                } else if (t2 instanceof Ie.j) {
                    str = (j14 >= j13 || j14 < G11) ? (j14 >= G11 || j14 < j13) ? "select" : "onSend" : "onReceive";
                } else if (t2 instanceof v) {
                    str = "receiveCatching";
                } else if (t2 instanceof b) {
                    str = "sendBroadcast";
                } else if (t2 instanceof D) {
                    str = "EB(" + t2 + ')';
                } else {
                    c2857a = g.f108929f;
                    if (!Intrinsics.d(t2, c2857a)) {
                        c2857a2 = g.f108930g;
                        if (!Intrinsics.d(t2, c2857a2)) {
                            if (t2 != null) {
                                c2857a3 = g.f108928e;
                                if (!t2.equals(c2857a3)) {
                                    c2857a4 = g.f108932i;
                                    if (!t2.equals(c2857a4)) {
                                        c2857a5 = g.f108931h;
                                        if (!t2.equals(c2857a5)) {
                                            c2857a6 = g.f108934k;
                                            if (!t2.equals(c2857a6)) {
                                                c2857a7 = g.f108933j;
                                                if (!t2.equals(c2857a7) && !t2.equals(g.r())) {
                                                    str = t2.toString();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i14++;
                            z12 = z13;
                        }
                    }
                    str = "resuming_sender";
                }
                if (s11 != null) {
                    sb2.append("(" + str + ',' + s11 + "),");
                } else {
                    sb2.append(str + ',');
                }
                i14++;
                z12 = z13;
            }
            z12 = z11;
            i12 = 0;
        }
        if (kotlin.text.h.M(sb2) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[LOOP:2: B:17:0x003e->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[LOOP:3: B:22:0x0070->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x0070->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e A[LOOP:5: B:40:0x004e->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean y(boolean z11, Throwable th2) {
        C11115c<E> c11115c;
        C2857A c2857a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z12;
        long j11;
        long j12;
        long j13;
        Object obj;
        long j14;
        long j15;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f108899b;
        if (z11) {
            do {
                j15 = atomicLongFieldUpdater.get(this);
                if (((int) (j15 >> 60)) == 0) {
                    int i11 = g.f108925b;
                    c11115c = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c11115c, j15, (j15 & 1152921504606846975L) + (1 << 60)));
            c2857a = g.f108942s;
            while (true) {
                atomicReferenceFieldUpdater = f108906i;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, c2857a, th2)) {
                    z12 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != c2857a) {
                    z12 = false;
                    break;
                }
            }
            if (z11) {
                do {
                    j11 = atomicLongFieldUpdater.get(this);
                    int i12 = (int) (j11 >> 60);
                    if (i12 == 0) {
                        j12 = j11 & 1152921504606846975L;
                        j13 = 2;
                    } else {
                        if (i12 != 1) {
                            break;
                        }
                        j12 = j11 & 1152921504606846975L;
                        j13 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(c11115c, j11, (j13 << 60) + j12));
            } else {
                do {
                    j14 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(c11115c, j14, (3 << 60) + (j14 & 1152921504606846975L)));
            }
            g();
            if (z12) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f108907j;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    C2857A c2857a2 = obj == null ? g.f108940q : g.f108941r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c2857a2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    U.g(1, obj);
                    ((Function1) obj).invoke(D());
                    return z12;
                }
            }
            return z12;
        }
        c11115c = this;
        c2857a = g.f108942s;
        while (true) {
            atomicReferenceFieldUpdater = f108906i;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, c2857a, th2)) {
            }
        }
        if (z11) {
        }
        g();
        if (z12) {
        }
        return z12;
    }
}
