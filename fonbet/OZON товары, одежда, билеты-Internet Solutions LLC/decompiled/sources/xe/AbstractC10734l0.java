package xe;

import De.C2857A;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.W;

/* renamed from: xe.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10734l0 extends AbstractC10736m0 implements W {

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f105477f = AtomicReferenceFieldUpdater.newUpdater(AbstractC10734l0.class, Object.class, "_queue$volatile");

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f105478g = AtomicReferenceFieldUpdater.newUpdater(AbstractC10734l0.class, Object.class, "_delayed$volatile");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105479h = AtomicIntegerFieldUpdater.newUpdater(AbstractC10734l0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: xe.l0$a */
    private final class a extends c {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C10737n f105480c;

        public a(long j11, @NotNull C10737n c10737n) {
            super(j11);
            this.f105480c = c10737n;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f105480c.F(AbstractC10734l0.this, Unit.f71690a);
        }

        @Override // xe.AbstractC10734l0.c
        @NotNull
        public final String toString() {
            return super.toString() + this.f105480c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xe.l0$b */
    static final class b extends c {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Runnable f105482c;

        public b(@NotNull Runnable runnable, long j11) {
            super(j11);
            this.f105482c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f105482c.run();
        }

        @Override // xe.AbstractC10734l0.c
        @NotNull
        public final String toString() {
            return super.toString() + this.f105482c;
        }
    }

    /* renamed from: xe.l0$c */
    public static abstract class c implements Runnable, Comparable<c>, InterfaceC10724g0, De.K {
        private volatile Object _heap;

        /* renamed from: a, reason: collision with root package name */
        public long f105483a;

        /* renamed from: b, reason: collision with root package name */
        private int f105484b = -1;

        public c(long j11) {
            this.f105483a = j11;
        }

        @Override // De.K
        public final void b(De.J<?> j11) {
            C2857A c2857a;
            Object obj = this._heap;
            c2857a = C10738n0.f105492a;
            if (obj == c2857a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = j11;
        }

        public final int c(long j11, @NotNull d dVar, @NotNull AbstractC10734l0 abstractC10734l0) {
            C2857A c2857a;
            synchronized (this) {
                Object obj = this._heap;
                c2857a = C10738n0.f105492a;
                if (obj == c2857a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c b11 = dVar.b();
                        if (AbstractC10734l0.W0(abstractC10734l0)) {
                            return 1;
                        }
                        if (b11 == null) {
                            dVar.f105485c = j11;
                        } else {
                            long j12 = b11.f105483a;
                            if (j12 - j11 < 0) {
                                j11 = j12;
                            }
                            if (j11 - dVar.f105485c > 0) {
                                dVar.f105485c = j11;
                            }
                        }
                        long j13 = this.f105483a;
                        long j14 = dVar.f105485c;
                        if (j13 - j14 < 0) {
                            this.f105483a = j14;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j11 = this.f105483a - cVar.f105483a;
            if (j11 > 0) {
                return 1;
            }
            return j11 < 0 ? -1 : 0;
        }

        @Override // xe.InterfaceC10724g0
        public final void dispose() {
            C2857A c2857a;
            C2857A c2857a2;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    c2857a = C10738n0.f105492a;
                    if (obj == c2857a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        synchronized (dVar) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof De.J ? (De.J) obj2 : null) != null) {
                                dVar.d(this.f105484b);
                            }
                        }
                    }
                    c2857a2 = C10738n0.f105492a;
                    this._heap = c2857a2;
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // De.K
        public final void setIndex(int i11) {
            this.f105484b = i11;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.f105483a + ']';
        }
    }

    /* renamed from: xe.l0$d */
    public static final class d extends De.J<c> {

        /* renamed from: c, reason: collision with root package name */
        public long f105485c;
    }

    public static final boolean W0(AbstractC10734l0 abstractC10734l0) {
        abstractC10734l0.getClass();
        return f105479h.get(abstractC10734l0) != 0;
    }

    private final void c1() {
        c cVar;
        d dVar = (d) f105478g.get(this);
        if (dVar == null || dVar.c()) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    c b11 = dVar.b();
                    if (b11 != null) {
                        c cVar2 = b11;
                        cVar = ((nanoTime - cVar2.f105483a) > 0L ? 1 : ((nanoTime - cVar2.f105483a) == 0L ? 0 : -1)) >= 0 ? d1(cVar2) : false ? dVar.d(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (cVar != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean d1(Runnable runnable) {
        C2857A c2857a;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105477f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(f105479h.get(this) != 0)) {
                if (obj != null) {
                    if (!(obj instanceof De.q)) {
                        c2857a = C10738n0.f105493b;
                        if (obj != c2857a) {
                            De.q qVar = new De.q(8, true);
                            qVar.a((Runnable) obj);
                            qVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    De.q qVar2 = (De.q) obj;
                    int a11 = qVar2.a(runnable);
                    if (a11 == 0) {
                        break;
                    }
                    if (a11 == 1) {
                        De.q e11 = qVar2.e();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e11) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a11 == 2) {
                        break;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                break;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (((De.q) r0).d() == false) goto L53;
     */
    @Override // xe.AbstractC10732k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long L0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Runnable runnable;
        c b11;
        C2857A c2857a;
        C2857A c2857a2;
        if (!M0()) {
            c1();
            loop0: while (true) {
                atomicReferenceFieldUpdater = f105477f;
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof De.q)) {
                    c2857a2 = C10738n0.f105493b;
                    if (obj != c2857a2) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                De.q qVar = (De.q) obj;
                Object f7 = qVar.f();
                if (f7 != De.q.f6644g) {
                    runnable = (Runnable) f7;
                    break;
                }
                De.q e11 = qVar.e();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e11) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            if (super.D0() != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (!(obj2 instanceof De.q)) {
                        c2857a = C10738n0.f105493b;
                        if (obj2 == c2857a) {
                            return Long.MAX_VALUE;
                        }
                    }
                }
                d dVar = (d) f105478g.get(this);
                if (dVar == null) {
                    return Long.MAX_VALUE;
                }
                synchronized (dVar) {
                    b11 = dVar.b();
                }
                c cVar = b11;
                if (cVar == null) {
                    return Long.MAX_VALUE;
                }
                long nanoTime = cVar.f105483a - System.nanoTime();
                if (nanoTime >= 0) {
                    return nanoTime;
                }
            }
        }
        return 0L;
    }

    public void a1(@NotNull Runnable runnable) {
        c1();
        if (!d1(runnable)) {
            S.f105415i.a1(runnable);
            return;
        }
        Thread T02 = T0();
        if (Thread.currentThread() != T02) {
            LockSupport.unpark(T02);
        }
    }

    protected final boolean j1() {
        C2857A c2857a;
        if (!K0()) {
            return false;
        }
        d dVar = (d) f105478g.get(this);
        if (dVar != null && !dVar.c()) {
            return false;
        }
        Object obj = f105477f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof De.q) {
            return ((De.q) obj).d();
        }
        c2857a = C10738n0.f105493b;
        return obj == c2857a;
    }

    @NotNull
    public InterfaceC10724g0 k(long j11, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return W.a.a(j11, runnable, coroutineContext);
    }

    protected final void k1() {
        f105477f.set(this, null);
        f105478g.set(this, null);
    }

    public final void l1(long j11, @NotNull c cVar) {
        int c11;
        Thread T02;
        c b11;
        boolean z11 = f105479h.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105478g;
        c cVar2 = null;
        if (z11) {
            c11 = 1;
        } else {
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            if (dVar == null) {
                d dVar2 = new d();
                dVar2.f105485c = j11;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.f(obj);
                dVar = (d) obj;
            }
            c11 = cVar.c(j11, dVar, this);
        }
        if (c11 != 0) {
            if (c11 == 1) {
                V0(j11, cVar);
                return;
            } else {
                if (c11 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        d dVar3 = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar3 != null) {
            synchronized (dVar3) {
                b11 = dVar3.b();
            }
            cVar2 = b11;
        }
        if (cVar2 != cVar || Thread.currentThread() == (T02 = T0())) {
            return;
        }
        LockSupport.unpark(T02);
    }

    @Override // xe.W
    public final void o(long j11, @NotNull C10737n c10737n) {
        long c11 = C10738n0.c(j11);
        if (c11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(c11 + nanoTime, c10737n);
            l1(nanoTime, aVar);
            C10741p.a(c10737n, aVar);
        }
    }

    @Override // xe.I
    public final void q(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        a1(runnable);
    }

    @Override // xe.AbstractC10732k0
    public void shutdown() {
        C2857A c2857a;
        c e11;
        C2857A c2857a2;
        Z0.c();
        f105479h.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105477f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof De.q)) {
                    c2857a2 = C10738n0.f105493b;
                    if (obj != c2857a2) {
                        De.q qVar = new De.q(8, true);
                        qVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, qVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((De.q) obj).b();
                break;
            }
            c2857a = C10738n0.f105493b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2857a)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (L0() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f105478g.get(this);
            if (dVar == null || (e11 = dVar.e()) == null) {
                return;
            } else {
                V0(nanoTime, e11);
            }
        }
    }
}
