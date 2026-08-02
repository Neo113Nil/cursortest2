package defpackage;

import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ju3 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater h;
    public static final ih2 i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final b09 e;
    public final b09 f;
    public final w0g g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    static {
        Unsafe unsafe = rh0.a;
        l = unsafe.objectFieldOffset(ju3.class.getDeclaredField("parkedWorkersStack$volatile"));
        h = AtomicLongFieldUpdater.newUpdater(ju3.class, "controlState$volatile");
        k = unsafe.objectFieldOffset(ju3.class.getDeclaredField("controlState$volatile"));
        j = unsafe.objectFieldOffset(ju3.class.getDeclaredField("_isTerminated$volatile"));
        i = new ih2("NOT_IN_STACK", 5);
    }

    public ju3(int i2, int i3, String str, long j2) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.d = str;
        if (i2 < 1) {
            ogj.h(lnb.k(i2, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i3 < i2) {
            ogj.h(dmi.k(i3, i2, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i3 > 2097150) {
            ogj.h(lnb.k(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j2 <= 0) {
            ogj.h(vxd.m("Idle worker keep alive time ", j2, " must be positive"));
            throw null;
        }
        this.e = new b09();
        this.f = new b09();
        this.g = new w0g((i2 + 1) * 2);
        this.controlState$volatile = i2 << 42;
    }

    public static /* synthetic */ void j(ju3 ju3Var, Runnable runnable, int i2) {
        ju3Var.i(false, (i2 & 4) == 0, runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (r0 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int longVolatile;
        yti ytiVar;
        Unsafe unsafe = rh0.a;
        if (unsafe.compareAndSwapInt(this, j, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            hu3 hu3Var = currentThread instanceof hu3 ? (hu3) currentThread : null;
            if (hu3Var == null || hu3Var.h != this) {
                hu3Var = null;
            }
            synchronized (this.g) {
                longVolatile = (int) (unsafe.getLongVolatile(this, k) & 2097151);
            }
            if (1 <= longVolatile) {
                int i2 = 1;
                while (true) {
                    Object b = this.g.b(i2);
                    b.getClass();
                    hu3 hu3Var2 = (hu3) b;
                    if (hu3Var2 != hu3Var) {
                        while (hu3Var2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(hu3Var2);
                            hu3Var2.join(Ua.s);
                        }
                        gcl gclVar = hu3Var2.a;
                        b09 b09Var = this.f;
                        gclVar.getClass();
                        yti ytiVar2 = (yti) rh0.a.getAndSetObject(gclVar, gcl.f, (Object) null);
                        if (ytiVar2 != null) {
                            b09Var.a(ytiVar2);
                        }
                        while (true) {
                            yti c = gclVar.c();
                            if (c == null) {
                                break;
                            } else {
                                b09Var.a(c);
                            }
                        }
                    }
                    if (i2 == longVolatile) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f.b();
            this.e.b();
            while (true) {
                if (hu3Var != null) {
                    ytiVar = hu3Var.a(true);
                }
                ytiVar = (yti) this.e.d();
                if (ytiVar == null && (ytiVar = (yti) this.f.d()) == null) {
                    break;
                }
                try {
                    ytiVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (hu3Var != null) {
                hu3Var.h(iu3.e);
            }
            Unsafe unsafe2 = rh0.a;
            unsafe2.putLongVolatile(this, l, 0L);
            unsafe2.putLongVolatile(this, k, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j(this, runnable, 6);
    }

    public final int h() {
        synchronized (this.g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = h;
                Unsafe unsafe = rh0.a;
                long j2 = k;
                long longVolatile = unsafe.getLongVolatile(this, j2);
                int i2 = (int) (longVolatile & 2097151);
                int i3 = i2 - ((int) ((longVolatile & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.a) {
                    return 0;
                }
                if (i2 >= this.b) {
                    return 0;
                }
                int longVolatile2 = ((int) (unsafe.getLongVolatile(this, j2) & 2097151)) + 1;
                if (longVolatile2 <= 0 || this.g.b(longVolatile2) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                hu3 hu3Var = new hu3(this, longVolatile2);
                this.g.c(longVolatile2, hu3Var);
                if (longVolatile2 != ((int) (atomicLongFieldUpdater.incrementAndGet(this) & 2097151))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i3 + 1;
                hu3Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(boolean z, boolean z2, Runnable runnable) {
        yti auiVar;
        iu3 iu3Var;
        dui.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof yti) {
            auiVar = (yti) runnable;
            auiVar.a = nanoTime;
            auiVar.b = z;
        } else {
            auiVar = new aui(nanoTime, runnable, z);
        }
        boolean z3 = auiVar.b;
        long addAndGet = z3 ? h.addAndGet(this, CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) : 0L;
        Thread currentThread = Thread.currentThread();
        hu3 hu3Var = currentThread instanceof hu3 ? (hu3) currentThread : null;
        if (hu3Var == null || hu3Var.h != this) {
            hu3Var = null;
        }
        if (hu3Var != null && (iu3Var = hu3Var.c) != iu3.e && (auiVar.b || iu3Var != iu3.b)) {
            hu3Var.g = true;
            gcl gclVar = hu3Var.a;
            if (z2) {
                auiVar = gclVar.a(auiVar);
            } else {
                gclVar.getClass();
                yti ytiVar = (yti) rh0.a.getAndSetObject(gclVar, gcl.f, auiVar);
                auiVar = ytiVar == null ? null : gclVar.a(ytiVar);
            }
        }
        if (auiVar != null) {
            if (!(auiVar.b ? this.f.a(auiVar) : this.e.a(auiVar))) {
                throw new RejectedExecutionException(mz1.o(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z3) {
            if (n() || m(addAndGet)) {
                return;
            }
            n();
            return;
        }
        if (n() || m(rh0.a.getLongVolatile(this, k))) {
            return;
        }
        n();
    }

    public final boolean isTerminated() {
        return rh0.a.getIntVolatile(this, j) == 1;
    }

    public final void k(hu3 hu3Var, int i2, int i3) {
        while (true) {
            long longVolatile = rh0.a.getLongVolatile(this, l);
            int i4 = (int) (2097151 & longVolatile);
            long j2 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + longVolatile) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object c = hu3Var.c();
                    while (true) {
                        if (c == i) {
                            i4 = -1;
                            break;
                        }
                        if (c == null) {
                            i4 = 0;
                            break;
                        }
                        hu3 hu3Var2 = (hu3) c;
                        int b = hu3Var2.b();
                        if (b != 0) {
                            i4 = b;
                            break;
                        }
                        c = hu3Var2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                ju3 ju3Var = this;
                if (rh0.a.compareAndSwapLong(ju3Var, l, longVolatile, j2 | i4)) {
                    return;
                } else {
                    this = ju3Var;
                }
            }
        }
    }

    public final boolean m(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.a;
        if (i2 < i3) {
            int h2 = h();
            if (h2 == 1 && i3 > 1) {
                h();
            }
            if (h2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        ju3 ju3Var;
        ih2 ih2Var;
        int i2;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j2 = l;
            long longVolatile = unsafe.getLongVolatile(this, j2);
            hu3 hu3Var = (hu3) this.g.b((int) (2097151 & longVolatile));
            if (hu3Var == null) {
                hu3Var = null;
                ju3Var = this;
            } else {
                long j3 = (CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE + longVolatile) & (-2097152);
                Object c = hu3Var.c();
                while (true) {
                    ih2Var = i;
                    if (c == ih2Var) {
                        i2 = -1;
                        break;
                    }
                    if (c == null) {
                        i2 = 0;
                        break;
                    }
                    hu3 hu3Var2 = (hu3) c;
                    i2 = hu3Var2.b();
                    if (i2 != 0) {
                        break;
                    }
                    c = hu3Var2.c();
                    unsafe = unsafe;
                    this = this;
                }
                if (i2 >= 0) {
                    ju3 ju3Var2 = this;
                    boolean compareAndSwapLong = unsafe.compareAndSwapLong(ju3Var2, j2, longVolatile, j3 | i2);
                    ju3Var = ju3Var2;
                    if (compareAndSwapLong) {
                        hu3Var.g(ih2Var);
                    }
                    this = ju3Var;
                } else {
                    continue;
                }
            }
            if (hu3Var == null) {
                return false;
            }
            if (hu3.i.compareAndSet(hu3Var, -1, 0)) {
                LockSupport.unpark(hu3Var);
                return true;
            }
            this = ju3Var;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        w0g w0gVar = this.g;
        int a = w0gVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a; i7++) {
            hu3 hu3Var = (hu3) w0gVar.b(i7);
            if (hu3Var != null) {
                gcl gclVar = hu3Var.a;
                gclVar.getClass();
                Object objectVolatile = rh0.a.getObjectVolatile(gclVar, gcl.f);
                int b = gclVar.b();
                if (objectVolatile != null) {
                    b++;
                }
                int ordinal = hu3Var.c.ordinal();
                if (ordinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(b);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i4++;
                } else if (ordinal == 3) {
                    i5++;
                    if (b > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(b);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        zzl.b();
                        return null;
                    }
                    i6++;
                }
            }
        }
        long longVolatile = rh0.a.getLongVolatile(this, k);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(ml4.X(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.a;
        sb4.append(i8);
        sb4.append(", max = ");
        me4.q(sb4, this.b, "}, Worker States {CPU = ", i2, ", blocking = ");
        me4.q(sb4, i3, ", parked = ", i4, ", dormant = ");
        me4.q(sb4, i5, ", terminated = ", i6, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & longVolatile));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & longVolatile) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((longVolatile & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
