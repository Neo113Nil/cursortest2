package Uh;

import Ph.AbstractC1443c;
import Ph.U;
import Sh.B;
import Sh.G;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class a implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final C0259a f12251h = new C0259a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f12252i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f12253j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12254k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final G f12255l = new G("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f12256a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12257b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12258c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f12259d;

    /* renamed from: e, reason: collision with root package name */
    public final Uh.d f12260e;

    /* renamed from: f, reason: collision with root package name */
    public final Uh.d f12261f;

    /* renamed from: g, reason: collision with root package name */
    public final B f12262g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: Uh.a$a, reason: collision with other inner class name */
    public static final class C0259a {
        public /* synthetic */ C0259a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0259a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f12274c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f12273b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f12272a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f12275d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f12276e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ d[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final d f12272a = new d("CPU_ACQUIRED", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f12273b = new d("BLOCKING", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final d f12274c = new d("PARKING", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final d f12275d = new d("DORMANT", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final d f12276e = new d("TERMINATED", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f12277f;

        static {
            d[] a10 = a();
            $VALUES = a10;
            f12277f = EnumEntriesKt.enumEntries(a10);
        }

        public d(String str, int i10) {
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{f12272a, f12273b, f12274c, f12275d, f12276e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public a(int i10, int i11, long j10, String str) {
        this.f12256a = i10;
        this.f12257b = i11;
        this.f12258c = j10;
        this.f12259d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f12260e = new Uh.d();
            this.f12261f = new Uh.d();
            this.f12262g = new B((i10 + 1) * 2);
            this.controlState$volatile = i10 << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    public static /* synthetic */ void D0(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.A0(runnable, z10, z11);
    }

    public static /* synthetic */ boolean i2(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f12253j.get(aVar);
        }
        return aVar.h2(j10);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater m1() {
        return f12253j;
    }

    public final void A0(Runnable runnable, boolean z10, boolean z11) {
        AbstractC1443c.a();
        h w02 = w0(runnable, z10);
        boolean z12 = w02.f12288b;
        long addAndGet = z12 ? f12253j.addAndGet(this, 2097152L) : 0L;
        h g22 = g2(z0(), w02, z11);
        if (g22 != null && !k(g22)) {
            throw new RejectedExecutionException(this.f12259d + " was terminated");
        }
        if (z12) {
            e2(addAndGet);
        } else {
            f2();
        }
    }

    public final int J() {
        synchronized (this.f12262g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f12253j.get(this);
                int i10 = (int) (j10 & 2097151);
                int coerceAtLeast = RangesKt.coerceAtLeast(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (coerceAtLeast >= this.f12256a) {
                    return 0;
                }
                if (i10 >= this.f12257b) {
                    return 0;
                }
                int i11 = ((int) (m1().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f12262g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f12262g.c(i11, cVar);
                if (i11 != ((int) (2097151 & f12253j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = coerceAtLeast + 1;
                cVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int Y1(c cVar) {
        Object g10 = cVar.g();
        while (g10 != f12255l) {
            if (g10 == null) {
                return 0;
            }
            c cVar2 = (c) g10;
            int f10 = cVar2.f();
            if (f10 != 0) {
                return f10;
            }
            g10 = cVar2.g();
        }
        return -1;
    }

    public final c Z1() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12252i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f12262g.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int Y12 = Y1(cVar);
            if (Y12 >= 0 && f12252i.compareAndSet(this, j10, Y12 | j11)) {
                cVar.o(f12255l);
                return cVar;
            }
        }
    }

    public final boolean a2(c cVar) {
        long j10;
        int f10;
        if (cVar.g() != f12255l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12252i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            f10 = cVar.f();
            cVar.o(this.f12262g.b((int) (2097151 & j10)));
        } while (!f12252i.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | f10));
        return true;
    }

    public final void b2(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12252i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? Y1(cVar) : i11;
            }
            if (i12 >= 0) {
                if (f12252i.compareAndSet(this, j10, j11 | i12)) {
                    return;
                }
            }
        }
    }

    public final void c2(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th2) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            } finally {
                AbstractC1443c.a();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d2(10000L);
    }

    public final void d2(long j10) {
        int i10;
        h hVar;
        if (f12254k.compareAndSet(this, 0, 1)) {
            c z02 = z0();
            synchronized (this.f12262g) {
                i10 = (int) (m1().get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object b10 = this.f12262g.b(i11);
                    Intrinsics.checkNotNull(b10);
                    c cVar = (c) b10;
                    if (cVar != z02) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f12264a.j(this.f12261f);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f12261f.b();
            this.f12260e.b();
            while (true) {
                if (z02 != null) {
                    hVar = z02.e(true);
                    if (hVar != null) {
                        continue;
                        c2(hVar);
                    }
                }
                hVar = (h) this.f12260e.e();
                if (hVar == null && (hVar = (h) this.f12261f.e()) == null) {
                    break;
                }
                c2(hVar);
            }
            if (z02 != null) {
                z02.r(d.f12276e);
            }
            f12252i.set(this, 0L);
            f12253j.set(this, 0L);
        }
    }

    public final void e2(long j10) {
        if (j2() || h2(j10)) {
            return;
        }
        j2();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        D0(this, runnable, false, false, 6, null);
    }

    public final void f2() {
        if (j2() || i2(this, 0L, 1, null)) {
            return;
        }
        j2();
    }

    public final h g2(c cVar, h hVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.f12266c) == d.f12276e) {
            return hVar;
        }
        if (!hVar.f12288b && dVar == d.f12273b) {
            return hVar;
        }
        cVar.f12270g = true;
        return cVar.f12264a.a(hVar, z10);
    }

    public final boolean h2(long j10) {
        if (RangesKt.coerceAtLeast(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f12256a) {
            int J10 = J();
            if (J10 == 1 && this.f12256a > 1) {
                J();
            }
            if (J10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTerminated() {
        return f12254k.get(this) == 1;
    }

    public final boolean j2() {
        c Z12;
        do {
            Z12 = Z1();
            if (Z12 == null) {
                return false;
            }
        } while (!c.f12263i.compareAndSet(Z12, -1, 0));
        LockSupport.unpark(Z12);
        return true;
    }

    public final boolean k(h hVar) {
        return hVar.f12288b ? this.f12261f.a(hVar) : this.f12260e.a(hVar);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a10 = this.f12262g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c cVar = (c) this.f12262g.b(i15);
            if (cVar != null) {
                int i16 = cVar.f12264a.i();
                int i17 = b.$EnumSwitchMapping$0[cVar.f12266c.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14++;
                }
            }
        }
        long j10 = f12253j.get(this);
        return this.f12259d + '@' + U.b(this) + "[Pool Size {core = " + this.f12256a + ", max = " + this.f12257b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f12260e.c() + ", global blocking queue size = " + this.f12261f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f12256a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final h w0(Runnable runnable, boolean z10) {
        long a10 = j.f12295f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, a10, z10);
        }
        h hVar = (h) runnable;
        hVar.f12287a = a10;
        hVar.f12288b = z10;
        return hVar;
    }

    public final c z0() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !Intrinsics.areEqual(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final class c extends Thread {

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f12263i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: a, reason: collision with root package name */
        public final l f12264a;

        /* renamed from: b, reason: collision with root package name */
        public final Ref.ObjectRef f12265b;

        /* renamed from: c, reason: collision with root package name */
        public d f12266c;

        /* renamed from: d, reason: collision with root package name */
        public long f12267d;

        /* renamed from: e, reason: collision with root package name */
        public long f12268e;

        /* renamed from: f, reason: collision with root package name */
        public int f12269f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f12270g;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f12264a = new l();
            this.f12265b = new Ref.ObjectRef();
            this.f12266c = d.f12275d;
            this.nextParkedWorker = a.f12255l;
            int nanoTime = (int) System.nanoTime();
            this.f12269f = nanoTime == 0 ? 42 : nanoTime;
        }

        public final void b(h hVar) {
            this.f12267d = 0L;
            if (this.f12266c == d.f12274c) {
                this.f12266c = d.f12273b;
            }
            if (!hVar.f12288b) {
                a.this.c2(hVar);
                return;
            }
            if (r(d.f12273b)) {
                a.this.f2();
            }
            a.this.c2(hVar);
            a.m1().addAndGet(a.this, -2097152L);
            if (this.f12266c != d.f12276e) {
                this.f12266c = d.f12275d;
            }
        }

        public final h c(boolean z10) {
            h l10;
            h l11;
            if (z10) {
                boolean z11 = j(a.this.f12256a * 2) == 0;
                if (z11 && (l11 = l()) != null) {
                    return l11;
                }
                h k10 = this.f12264a.k();
                if (k10 != null) {
                    return k10;
                }
                if (!z11 && (l10 = l()) != null) {
                    return l10;
                }
            } else {
                h l12 = l();
                if (l12 != null) {
                    return l12;
                }
            }
            return s(3);
        }

        public final h d() {
            h l10 = this.f12264a.l();
            if (l10 != null) {
                return l10;
            }
            h hVar = (h) a.this.f12261f.e();
            return hVar == null ? s(1) : hVar;
        }

        public final h e(boolean z10) {
            return p() ? c(z10) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final boolean i() {
            return this.nextParkedWorker != a.f12255l;
        }

        public final int j(int i10) {
            int i11 = this.f12269f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f12269f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void k() {
            if (this.f12267d == 0) {
                this.f12267d = System.nanoTime() + a.this.f12258c;
            }
            LockSupport.parkNanos(a.this.f12258c);
            if (System.nanoTime() - this.f12267d >= 0) {
                this.f12267d = 0L;
                t();
            }
        }

        public final h l() {
            if (j(2) == 0) {
                h hVar = (h) a.this.f12260e.e();
                return hVar != null ? hVar : (h) a.this.f12261f.e();
            }
            h hVar2 = (h) a.this.f12261f.e();
            return hVar2 != null ? hVar2 : (h) a.this.f12260e.e();
        }

        public final void m() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f12266c != d.f12276e) {
                    h e10 = e(this.f12270g);
                    if (e10 != null) {
                        this.f12268e = 0L;
                        b(e10);
                    } else {
                        this.f12270g = false;
                        if (this.f12268e == 0) {
                            q();
                        } else if (z10) {
                            r(d.f12274c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f12268e);
                            this.f12268e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            r(d.f12276e);
        }

        public final void n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f12259d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean p() {
            long j10;
            if (this.f12266c == d.f12272a) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater m12 = a.m1();
            do {
                j10 = m12.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.m1().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f12266c = d.f12272a;
            return true;
        }

        public final void q() {
            if (!i()) {
                a.this.a2(this);
                return;
            }
            f12263i.set(this, -1);
            while (i() && f12263i.get(this) == -1 && !a.this.isTerminated() && this.f12266c != d.f12276e) {
                r(d.f12274c);
                Thread.interrupted();
                k();
            }
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f12266c;
            boolean z10 = dVar2 == d.f12272a;
            if (z10) {
                a.m1().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f12266c = dVar;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final h s(int i10) {
            int i11 = (int) (a.m1().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int j10 = j(i11);
            a aVar = a.this;
            long j11 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                j10++;
                if (j10 > i11) {
                    j10 = 1;
                }
                c cVar = (c) aVar.f12262g.b(j10);
                if (cVar != null && cVar != this) {
                    long r10 = cVar.f12264a.r(i10, this.f12265b);
                    if (r10 == -1) {
                        Ref.ObjectRef objectRef = this.f12265b;
                        h hVar = (h) objectRef.element;
                        objectRef.element = null;
                        return hVar;
                    }
                    if (r10 > 0) {
                        j11 = Math.min(j11, r10);
                    }
                }
            }
            if (j11 == LongCompanionObject.MAX_VALUE) {
                j11 = 0;
            }
            this.f12268e = j11;
            return null;
        }

        public final void t() {
            a aVar = a.this;
            synchronized (aVar.f12262g) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.m1().get(aVar) & 2097151)) <= aVar.f12256a) {
                        return;
                    }
                    if (f12263i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        n(0);
                        aVar.b2(this, i10, 0);
                        int andDecrement = (int) (a.m1().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i10) {
                            Object b10 = aVar.f12262g.b(andDecrement);
                            Intrinsics.checkNotNull(b10);
                            c cVar = (c) b10;
                            aVar.f12262g.c(i10, cVar);
                            cVar.n(i10);
                            aVar.b2(cVar, andDecrement, i10);
                        }
                        aVar.f12262g.c(andDecrement, null);
                        Unit unit = Unit.INSTANCE;
                        this.f12266c = d.f12276e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public c(a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
