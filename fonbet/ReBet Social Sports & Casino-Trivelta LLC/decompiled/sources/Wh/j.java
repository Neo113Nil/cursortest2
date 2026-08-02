package Wh;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import Ph.l1;
import Ph.r;
import Sh.AbstractC1564b;
import Sh.D;
import Sh.E;
import Sh.G;
import f0.AbstractC4221b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import mh.AbstractC5586b;

/* loaded from: classes5.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13297c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f13298d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13299e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f13300f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13301g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f13302a;

    /* renamed from: b, reason: collision with root package name */
    public final Function3 f13303b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13304a = new a();

        public a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m a(long j10, m mVar) {
            m j11;
            j11 = l.j(j10, mVar);
            return j11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (m) obj2);
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f13305a = new b();

        public b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m a(long j10, m mVar) {
            m j11;
            j11 = l.j(j10, mVar);
            return j11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (m) obj2);
        }
    }

    public j(int i10, int i11) {
        this.f13302a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        m mVar = new m(0L, null, 2);
        this.head$volatile = mVar;
        this.tail$volatile = mVar;
        this._availablePermits$volatile = i10 - i11;
        this.f13303b = new Function3() { // from class: Wh.i
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit t10;
                t10 = j.t(j.this, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
                return t10;
            }
        };
    }

    public static final Unit t(j jVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
        jVar.release();
        return Unit.INSTANCE;
    }

    public final int a() {
        return Math.max(f13301g.get(this), 0);
    }

    public final boolean b() {
        while (true) {
            int i10 = f13301g.get(this);
            if (i10 > this.f13302a) {
                m();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f13301g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    public final Object e(Continuation continuation) {
        if (n() > 0) {
            return Unit.INSTANCE;
        }
        Object k10 = k(continuation);
        return k10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? k10 : Unit.INSTANCE;
    }

    public final void j(InterfaceC1465n interfaceC1465n) {
        while (n() <= 0) {
            Intrinsics.checkNotNull(interfaceC1465n, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (l((l1) interfaceC1465n)) {
                return;
            }
        }
        interfaceC1465n.l(Unit.INSTANCE, this.f13303b);
    }

    public final Object k(Continuation continuation) {
        C1469p b10 = r.b(IntrinsicsKt.intercepted(continuation));
        try {
            if (!l(b10)) {
                j(b10);
            }
            Object z10 = b10.z();
            if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? z10 : Unit.INSTANCE;
        } catch (Throwable th2) {
            b10.N();
            throw th2;
        }
    }

    public final boolean l(l1 l1Var) {
        int i10;
        Object c10;
        int i11;
        G g10;
        G g11;
        m mVar = (m) f13299e.get(this);
        long andIncrement = f13300f.getAndIncrement(this);
        a aVar = a.f13304a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13299e;
        i10 = l.f13311f;
        long j10 = andIncrement / i10;
        loop0: while (true) {
            c10 = AbstractC1564b.c(mVar, j10, aVar);
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
        m mVar2 = (m) E.b(c10);
        i11 = l.f13311f;
        int i12 = (int) (andIncrement % i11);
        if (AbstractC5586b.a(mVar2.v(), i12, null, l1Var)) {
            l1Var.a(mVar2, i12);
            return true;
        }
        g10 = l.f13307b;
        g11 = l.f13308c;
        if (!AbstractC5586b.a(mVar2.v(), i12, g10, g11)) {
            return false;
        }
        if (l1Var instanceof InterfaceC1465n) {
            Intrinsics.checkNotNull(l1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC1465n) l1Var).l(Unit.INSTANCE, this.f13303b);
        } else {
            if (!(l1Var instanceof Vh.f)) {
                throw new IllegalStateException(("unexpected: " + l1Var).toString());
            }
            ((Vh.f) l1Var).c(Unit.INSTANCE);
        }
        return true;
    }

    public final void m() {
        int i10;
        do {
            i10 = f13301g.get(this);
            if (i10 <= this.f13302a) {
                return;
            }
        } while (!f13301g.compareAndSet(this, i10, this.f13302a));
    }

    public final int n() {
        int andDecrement;
        do {
            andDecrement = f13301g.getAndDecrement(this);
        } while (andDecrement > this.f13302a);
        return andDecrement;
    }

    public final void release() {
        do {
            int andIncrement = f13301g.getAndIncrement(this);
            if (andIncrement >= this.f13302a) {
                m();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f13302a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!v());
    }

    public final boolean u(Object obj) {
        if (!(obj instanceof InterfaceC1465n)) {
            if (obj instanceof Vh.f) {
                return ((Vh.f) obj).e(this, Unit.INSTANCE);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC1465n interfaceC1465n = (InterfaceC1465n) obj;
        Object n10 = interfaceC1465n.n(Unit.INSTANCE, null, this.f13303b);
        if (n10 == null) {
            return false;
        }
        interfaceC1465n.q(n10);
        return true;
    }

    public final boolean v() {
        int i10;
        Object c10;
        int i11;
        G g10;
        G g11;
        int i12;
        G g12;
        G g13;
        G g14;
        m mVar = (m) f13297c.get(this);
        long andIncrement = f13298d.getAndIncrement(this);
        i10 = l.f13311f;
        long j10 = andIncrement / i10;
        b bVar = b.f13305a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13297c;
        loop0: while (true) {
            c10 = AbstractC1564b.c(mVar, j10, bVar);
            if (E.c(c10)) {
                break;
            }
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
        }
        m mVar2 = (m) E.b(c10);
        mVar2.c();
        if (mVar2.f10763c > j10) {
            return false;
        }
        i11 = l.f13311f;
        int i13 = (int) (andIncrement % i11);
        g10 = l.f13307b;
        Object andSet = mVar2.v().getAndSet(i13, g10);
        if (andSet != null) {
            g11 = l.f13310e;
            if (andSet == g11) {
                return false;
            }
            return u(andSet);
        }
        i12 = l.f13306a;
        for (int i14 = 0; i14 < i12; i14++) {
            Object obj = mVar2.v().get(i13);
            g14 = l.f13308c;
            if (obj == g14) {
                return true;
            }
        }
        g12 = l.f13307b;
        g13 = l.f13309d;
        return !AbstractC5586b.a(mVar2.v(), i13, g12, g13);
    }
}
