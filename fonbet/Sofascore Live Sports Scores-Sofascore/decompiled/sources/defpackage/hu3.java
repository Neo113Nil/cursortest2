package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hu3 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(hu3.class, "workerCtl$volatile");
    public static final /* synthetic */ long j = rh0.a.objectFieldOffset(hu3.class.getDeclaredField("workerCtl$volatile"));
    public final gcl a;
    public final fsf b;
    public iu3 c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ ju3 h;
    private volatile int indexInArray;

    @Nullable
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public hu3(ju3 ju3Var, int i2) {
        this.h = ju3Var;
        setDaemon(true);
        setContextClassLoader(ju3.class.getClassLoader());
        this.a = new gcl();
        this.b = new fsf();
        this.c = iu3.d;
        this.nextParkedWorker = ju3.i;
        int nanoTime = (int) System.nanoTime();
        this.f = nanoTime == 0 ? 42 : nanoTime;
        f(i2);
    }

    public final yti a(boolean z) {
        yti e;
        yti e2;
        long j2;
        Unsafe unsafe;
        Unsafe unsafe2;
        iu3 iu3Var = this.c;
        iu3 iu3Var2 = iu3.a;
        ju3 ju3Var = this.h;
        yti ytiVar = null;
        gcl gclVar = this.a;
        if (iu3Var != iu3Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ju3.h;
            do {
                j2 = atomicLongFieldUpdater.get(ju3Var);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    gclVar.getClass();
                    long j3 = gcl.f;
                    loop1: while (true) {
                        unsafe = rh0.a;
                        yti ytiVar2 = (yti) unsafe.getObjectVolatile(gclVar, j3);
                        if (ytiVar2 != null && ytiVar2.b) {
                            do {
                                unsafe2 = rh0.a;
                                if (unsafe2.compareAndSwapObject(gclVar, gcl.f, ytiVar2, (Object) null)) {
                                    ytiVar = ytiVar2;
                                    break loop1;
                                }
                            } while (unsafe2.getObjectVolatile(gclVar, j3) == ytiVar2);
                        }
                    }
                    int intVolatile = unsafe.getIntVolatile(gclVar, gcl.e);
                    int intVolatile2 = unsafe.getIntVolatile(gclVar, gcl.g);
                    while (true) {
                        if (intVolatile == intVolatile2 || rh0.a.getIntVolatile(gclVar, gcl.d) == 0) {
                            break;
                        }
                        intVolatile2--;
                        yti d = gclVar.d(intVolatile2, true);
                        if (d != null) {
                            ytiVar = d;
                            break;
                        }
                    }
                    if (ytiVar != null) {
                        return ytiVar;
                    }
                    yti ytiVar3 = (yti) ju3Var.f.d();
                    return ytiVar3 == null ? i(1) : ytiVar3;
                }
            } while (!ju3.h.compareAndSet(ju3Var, j2, j2 - 4398046511104L));
            this.c = iu3.a;
        }
        if (z) {
            boolean z2 = d(ju3Var.a * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            gclVar.getClass();
            yti ytiVar4 = (yti) rh0.a.getAndSetObject(gclVar, gcl.f, (Object) null);
            if (ytiVar4 == null) {
                ytiVar4 = gclVar.c();
            }
            if (ytiVar4 != null) {
                return ytiVar4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            yti e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i7 & i6 : (Integer.MAX_VALUE & i6) % i2;
    }

    public final yti e() {
        int d = d(2);
        ju3 ju3Var = this.h;
        b09 b09Var = ju3Var.f;
        b09 b09Var2 = ju3Var.e;
        if (d == 0) {
            yti ytiVar = (yti) b09Var2.d();
            return ytiVar != null ? ytiVar : (yti) b09Var.d();
        }
        yti ytiVar2 = (yti) b09Var.d();
        return ytiVar2 != null ? ytiVar2 : (yti) b09Var2.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(iu3 iu3Var) {
        iu3 iu3Var2 = this.c;
        boolean z = iu3Var2 == iu3.a;
        if (z) {
            ju3.h.addAndGet(this.h, 4398046511104L);
        }
        if (iu3Var2 != iu3Var) {
            this.c = iu3Var;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0072, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yti i(int i2) {
        int i3;
        long j2;
        yti ytiVar;
        long j3;
        long j4;
        Unsafe unsafe;
        int i4 = i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ju3.h;
        ju3 ju3Var = this.h;
        int i5 = (int) (atomicLongFieldUpdater.get(ju3Var) & 2097151);
        yti ytiVar2 = null;
        if (i5 < 2) {
            return null;
        }
        int d = d(i5);
        int i6 = 0;
        long j5 = Long.MAX_VALUE;
        while (i6 < i5) {
            d++;
            if (d > i5) {
                d = 1;
            }
            hu3 hu3Var = (hu3) ju3Var.g.b(d);
            if (hu3Var == null || hu3Var == this) {
                i3 = i5;
            } else {
                gcl gclVar = hu3Var.a;
                gclVar.getClass();
                if (i4 != 3) {
                    boolean z = i4 == 1;
                    Unsafe unsafe2 = rh0.a;
                    j2 = 0;
                    int intVolatile = unsafe2.getIntVolatile(gclVar, gcl.e);
                    int intVolatile2 = unsafe2.getIntVolatile(gclVar, gcl.g);
                    while (true) {
                        if (intVolatile == intVolatile2) {
                            i3 = i5;
                            break;
                        }
                        if (z) {
                            i3 = i5;
                            if (rh0.a.getIntVolatile(gclVar, gcl.d) == 0) {
                                break;
                            }
                        } else {
                            i3 = i5;
                        }
                        int i7 = intVolatile + 1;
                        yti d2 = gclVar.d(intVolatile, z);
                        if (d2 != null) {
                            ytiVar = d2;
                            break;
                        }
                        intVolatile = i7;
                        i5 = i3;
                    }
                } else {
                    ytiVar = gclVar.c();
                    i3 = i5;
                    j2 = 0;
                }
                fsf fsfVar = this.b;
                if (ytiVar != null) {
                    fsfVar.a = ytiVar;
                    j4 = -1;
                    j3 = -1;
                } else {
                    j3 = -1;
                    long j6 = gcl.f;
                    while (true) {
                        yti ytiVar3 = (yti) rh0.a.getObjectVolatile(gclVar, j6);
                        if (ytiVar3 == null) {
                            break;
                        }
                        if (((ytiVar3.b ? 1 : 2) & i2) == 0) {
                            break;
                        }
                        dui.f.getClass();
                        gcl gclVar2 = gclVar;
                        long nanoTime = System.nanoTime() - ytiVar3.a;
                        long j7 = dui.b;
                        if (nanoTime < j7) {
                            j4 = j7 - nanoTime;
                            break;
                        }
                        do {
                            unsafe = rh0.a;
                            if (unsafe.compareAndSwapObject(gclVar2, gcl.f, ytiVar3, (Object) null)) {
                                fsfVar.a = ytiVar3;
                                j4 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(gclVar2, j6) == ytiVar3);
                        gclVar = gclVar2;
                    }
                    j4 = -2;
                }
                if (j4 == j3) {
                    yti ytiVar4 = (yti) fsfVar.a;
                    fsfVar.a = null;
                    return ytiVar4;
                }
                if (j4 > j2) {
                    j5 = Math.min(j5, j4);
                }
            }
            i6++;
            i4 = i2;
            i5 = i3;
            ytiVar2 = null;
        }
        if (j5 == Long.MAX_VALUE) {
            j5 = 0;
        }
        this.e = j5;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (!this.h.isTerminated()) {
                iu3 iu3Var = this.c;
                iu3 iu3Var2 = iu3.e;
                if (iu3Var == iu3Var2) {
                    break loop0;
                }
                yti a = a(this.g);
                long j2 = 0;
                if (a != null) {
                    this.e = 0L;
                    ju3 ju3Var = this.h;
                    this.d = 0L;
                    if (this.c == iu3.c) {
                        this.c = iu3.b;
                    }
                    if (a.b) {
                        if (h(iu3.b) && !ju3Var.n() && !ju3Var.m(rh0.a.getLongVolatile(ju3Var, ju3.k))) {
                            ju3Var.n();
                        }
                        try {
                            a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        ju3.h.addAndGet(ju3Var, -2097152L);
                        if (this.c != iu3Var2) {
                            this.c = iu3.d;
                        }
                    } else {
                        try {
                            a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.g = false;
                    if (this.e == 0) {
                        Object obj = this.nextParkedWorker;
                        ih2 ih2Var = ju3.i;
                        if (obj != ih2Var) {
                            rh0.a.putIntVolatile(this, j, -1);
                            while (this.nextParkedWorker != ju3.i) {
                                Unsafe unsafe = rh0.a;
                                long j3 = j;
                                if (unsafe.getIntVolatile(this, j3) == -1 && !this.h.isTerminated()) {
                                    iu3 iu3Var3 = this.c;
                                    iu3 iu3Var4 = iu3.e;
                                    if (iu3Var3 == iu3Var4) {
                                        break;
                                    }
                                    h(iu3.c);
                                    Thread.interrupted();
                                    if (this.d == j2) {
                                        this.d = System.nanoTime() + this.h.c;
                                    }
                                    LockSupport.parkNanos(this.h.c);
                                    if (System.nanoTime() - this.d >= j2) {
                                        this.d = j2;
                                        ju3 ju3Var2 = this.h;
                                        synchronized (ju3Var2.g) {
                                            try {
                                                if (!ju3Var2.isTerminated()) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ju3.h;
                                                    if (((int) (atomicLongFieldUpdater.get(ju3Var2) & 2097151)) > ju3Var2.a && unsafe.compareAndSwapInt(this, j3, -1, 1)) {
                                                        int i2 = this.indexInArray;
                                                        f(0);
                                                        ju3Var2.k(this, i2, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(ju3Var2) & 2097151);
                                                        if (andDecrement != i2) {
                                                            Object b = ju3Var2.g.b(andDecrement);
                                                            b.getClass();
                                                            hu3 hu3Var = (hu3) b;
                                                            ju3Var2.g.c(i2, hu3Var);
                                                            hu3Var.f(i2);
                                                            ju3Var2.k(hu3Var, andDecrement, i2);
                                                        }
                                                        ju3Var2.g.c(andDecrement, null);
                                                        Unit unit = Unit.a;
                                                        this.c = iu3Var4;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                    j2 = 0;
                                }
                            }
                        } else {
                            ju3 ju3Var3 = this.h;
                            if (this.nextParkedWorker == ih2Var) {
                                while (true) {
                                    Unsafe unsafe2 = rh0.a;
                                    long j4 = ju3.l;
                                    long longVolatile = unsafe2.getLongVolatile(ju3Var3, j4);
                                    long j5 = (longVolatile + CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) & (-2097152);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = ju3Var3.g.b((int) (longVolatile & 2097151));
                                    ju3 ju3Var4 = ju3Var3;
                                    if (unsafe2.compareAndSwapLong(ju3Var4, j4, longVolatile, j5 | i3)) {
                                        break;
                                    } else {
                                        ju3Var3 = ju3Var4;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        h(iu3.c);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.e);
                        this.e = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        h(iu3.e);
    }
}
