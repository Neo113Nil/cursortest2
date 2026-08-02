package Ph;

import Ph.Z;
import Sh.C1580s;
import f0.AbstractC4221b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.time.DurationKt;
import org.jetbrains.annotations.Nullable;

/* renamed from: Ph.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1466n0 extends AbstractC1468o0 implements Z {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9112e = AtomicReferenceFieldUpdater.newUpdater(AbstractC1466n0.class, Object.class, "_queue$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9113f = AtomicReferenceFieldUpdater.newUpdater(AbstractC1466n0.class, Object.class, "_delayed$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9114g = AtomicIntegerFieldUpdater.newUpdater(AbstractC1466n0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: Ph.n0$a */
    public final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC1465n f9115c;

        public a(long j10, InterfaceC1465n interfaceC1465n) {
            super(j10);
            this.f9115c = interfaceC1465n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9115c.b(AbstractC1466n0.this, Unit.INSTANCE);
        }

        @Override // Ph.AbstractC1466n0.c
        public String toString() {
            return super.toString() + this.f9115c;
        }
    }

    /* renamed from: Ph.n0$b */
    public static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f9117c;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f9117c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9117c.run();
        }

        @Override // Ph.AbstractC1466n0.c
        public String toString() {
            return super.toString() + this.f9117c;
        }
    }

    /* renamed from: Ph.n0$c */
    public static abstract class c implements Runnable, Comparable, InterfaceC1456i0, Sh.T {

        @Nullable
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name */
        public long f9118a;

        /* renamed from: b, reason: collision with root package name */
        public int f9119b = -1;

        public c(long j10) {
            this.f9118a = j10;
        }

        @Override // Sh.T
        public Sh.S b() {
            Object obj = this._heap;
            if (obj instanceof Sh.S) {
                return (Sh.S) obj;
            }
            return null;
        }

        @Override // Sh.T
        public void c(Sh.S s10) {
            Sh.G g10;
            Object obj = this._heap;
            g10 = AbstractC1472q0.f9128a;
            if (obj == g10) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = s10;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f9118a - cVar.f9118a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // Ph.InterfaceC1456i0
        public final void dispose() {
            Sh.G g10;
            Sh.G g11;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    g10 = AbstractC1472q0.f9128a;
                    if (obj == g10) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    g11 = AbstractC1472q0.f9128a;
                    this._heap = g11;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final int e(long j10, d dVar, AbstractC1466n0 abstractC1466n0) {
            Sh.G g10;
            synchronized (this) {
                Object obj = this._heap;
                g10 = AbstractC1472q0.f9128a;
                if (obj == g10) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (abstractC1466n0.isCompleted()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f9120c = j10;
                        } else {
                            long j11 = cVar.f9118a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f9120c > 0) {
                                dVar.f9120c = j10;
                            }
                        }
                        long j12 = this.f9118a;
                        long j13 = dVar.f9120c;
                        if (j12 - j13 < 0) {
                            this.f9118a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public final boolean f(long j10) {
            return j10 - this.f9118a >= 0;
        }

        @Override // Sh.T
        public int getIndex() {
            return this.f9119b;
        }

        @Override // Sh.T
        public void setIndex(int i10) {
            this.f9119b = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f9118a + ']';
        }
    }

    /* renamed from: Ph.n0$d */
    public static final class d extends Sh.S {

        /* renamed from: c, reason: collision with root package name */
        public long f9120c;

        public d(long j10) {
            this.f9120c = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return f9114g.get(this) == 1;
    }

    public boolean C2() {
        Sh.G g10;
        if (!m2()) {
            return false;
        }
        d dVar = (d) f9113f.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f9112e.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C1580s) {
            return ((C1580s) obj).j();
        }
        g10 = AbstractC1472q0.f9129b;
        return obj == g10;
    }

    public final void D2() {
        c cVar;
        AbstractC1443c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f9113f.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                r2(nanoTime, cVar);
            }
        }
    }

    public final void E2() {
        f9112e.set(this, null);
        f9113f.set(this, null);
    }

    public final void F2(long j10, c cVar) {
        int G22 = G2(j10, cVar);
        if (G22 == 0) {
            if (J2(cVar)) {
                s2();
            }
        } else if (G22 == 1) {
            r2(j10, cVar);
        } else if (G22 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    public final int G2(long j10, c cVar) {
        if (isCompleted()) {
            return 1;
        }
        d dVar = (d) f9113f.get(this);
        if (dVar == null) {
            AbstractC4221b.a(f9113f, this, null, new d(j10));
            Object obj = f9113f.get(this);
            Intrinsics.checkNotNull(obj);
            dVar = (d) obj;
        }
        return cVar.e(j10, dVar, this);
    }

    public final InterfaceC1456i0 H2(long j10, Runnable runnable) {
        long c10 = AbstractC1472q0.c(j10);
        if (c10 >= DurationKt.MAX_MILLIS) {
            return P0.f9046a;
        }
        AbstractC1443c.a();
        long nanoTime = System.nanoTime();
        b bVar = new b(c10 + nanoTime, runnable);
        F2(nanoTime, bVar);
        return bVar;
    }

    public final void I2(boolean z10) {
        f9114g.set(this, z10 ? 1 : 0);
    }

    public InterfaceC1456i0 J(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return Z.a.a(this, j10, runnable, coroutineContext);
    }

    public final boolean J2(c cVar) {
        d dVar = (d) f9113f.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    @Override // Ph.L
    public final void Y1(CoroutineContext coroutineContext, Runnable runnable) {
        w2(runnable);
    }

    @Override // Ph.AbstractC1464m0
    public long i2() {
        c cVar;
        Sh.G g10;
        if (super.i2() == 0) {
            return 0L;
        }
        Object obj = f9112e.get(this);
        if (obj != null) {
            if (!(obj instanceof C1580s)) {
                g10 = AbstractC1472q0.f9129b;
                if (obj == g10) {
                    return LongCompanionObject.MAX_VALUE;
                }
                return 0L;
            }
            if (!((C1580s) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f9113f.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return LongCompanionObject.MAX_VALUE;
        }
        long j10 = cVar.f9118a;
        AbstractC1443c.a();
        return RangesKt.coerceAtLeast(j10 - System.nanoTime(), 0L);
    }

    @Override // Ph.AbstractC1464m0
    public long n2() {
        if (o2()) {
            return 0L;
        }
        x2();
        Runnable v22 = v2();
        if (v22 == null) {
            return i2();
        }
        v22.run();
        return 0L;
    }

    @Override // Ph.AbstractC1464m0
    public void shutdown() {
        a1.f9061a.c();
        I2(true);
        u2();
        while (n2() <= 0) {
        }
        D2();
    }

    public final void u2() {
        Sh.G g10;
        Sh.G g11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9112e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9112e;
                g10 = AbstractC1472q0.f9129b;
                if (AbstractC4221b.a(atomicReferenceFieldUpdater2, this, null, g10)) {
                    return;
                }
            } else {
                if (obj instanceof C1580s) {
                    ((C1580s) obj).d();
                    return;
                }
                g11 = AbstractC1472q0.f9129b;
                if (obj == g11) {
                    return;
                }
                C1580s c1580s = new C1580s(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c1580s.a((Runnable) obj);
                if (AbstractC4221b.a(f9112e, this, obj, c1580s)) {
                    return;
                }
            }
        }
    }

    public final Runnable v2() {
        Sh.G g10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9112e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C1580s) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C1580s c1580s = (C1580s) obj;
                Object m10 = c1580s.m();
                if (m10 != C1580s.f10813h) {
                    return (Runnable) m10;
                }
                AbstractC4221b.a(f9112e, this, obj, c1580s.l());
            } else {
                g10 = AbstractC1472q0.f9129b;
                if (obj == g10) {
                    return null;
                }
                if (AbstractC4221b.a(f9112e, this, obj, null)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    @Override // Ph.Z
    public void w0(long j10, InterfaceC1465n interfaceC1465n) {
        long c10 = AbstractC1472q0.c(j10);
        if (c10 < DurationKt.MAX_MILLIS) {
            AbstractC1443c.a();
            long nanoTime = System.nanoTime();
            a aVar = new a(c10 + nanoTime, interfaceC1465n);
            F2(nanoTime, aVar);
            r.a(interfaceC1465n, aVar);
        }
    }

    public void w2(Runnable runnable) {
        x2();
        if (y2(runnable)) {
            s2();
        } else {
            V.f9056h.w2(runnable);
        }
    }

    public final void x2() {
        Sh.T t10;
        d dVar = (d) f9113f.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        AbstractC1443c.a();
        long nanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    Sh.T b10 = dVar.b();
                    if (b10 != null) {
                        c cVar = (c) b10;
                        t10 = cVar.f(nanoTime) ? y2(cVar) : false ? dVar.i(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (((c) t10) != null);
    }

    public final boolean y2(Runnable runnable) {
        Sh.G g10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9112e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC4221b.a(f9112e, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C1580s) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                C1580s c1580s = (C1580s) obj;
                int a10 = c1580s.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    AbstractC4221b.a(f9112e, this, obj, c1580s.l());
                } else if (a10 == 2) {
                    return false;
                }
            } else {
                g10 = AbstractC1472q0.f9129b;
                if (obj == g10) {
                    return false;
                }
                C1580s c1580s2 = new C1580s(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                c1580s2.a((Runnable) obj);
                c1580s2.a(runnable);
                if (AbstractC4221b.a(f9112e, this, obj, c1580s2)) {
                    return true;
                }
            }
        }
    }
}
