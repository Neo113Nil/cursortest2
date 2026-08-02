package lg;

import androidx.appcompat.widget.c1;
import eg.c0;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import jg.s;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c implements Executor, Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20053h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20054i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final com.android.billingclient.api.a f20055k = new com.android.billingclient.api.a("NOT_IN_STACK", 9);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f20056a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20057b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20058c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f20059d;

    /* renamed from: e, reason: collision with root package name */
    public final f f20060e;

    /* renamed from: f, reason: collision with root package name */
    public final f f20061f;

    /* renamed from: g, reason: collision with root package name */
    public final s f20062g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(String str, int i5, int i10, long j6) {
        this.f20056a = i5;
        this.f20057b = i10;
        this.f20058c = j6;
        this.f20059d = str;
        if (i5 < 1) {
            throw new IllegalArgumentException(d9.e.f(i5, "Core pool size ", " should be at least 1").toString());
        }
        if (i10 < i5) {
            throw new IllegalArgumentException(c1.j(i10, "Max pool size ", " should be greater than or equals to core pool size ", i5).toString());
        }
        if (i10 > 2097150) {
            throw new IllegalArgumentException(d9.e.f(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j6 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
        }
        this.f20060e = new f();
        this.f20061f = new f();
        this.f20062g = new s((i5 + 1) * 2);
        this.controlState$volatile = i5 << 42;
    }

    public static /* synthetic */ void n(c cVar, Runnable runnable, int i5) {
        cVar.k(runnable, false, (i5 & 4) == 0);
    }

    public final int c() {
        synchronized (this.f20062g) {
            try {
                if (j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f20054i;
                long j6 = atomicLongFieldUpdater.get(this);
                int i5 = (int) (j6 & 2097151);
                int i10 = i5 - ((int) ((j6 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f20056a) {
                    return 0;
                }
                if (i5 >= this.f20057b) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f20062g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i11);
                this.f20062g.c(i11, aVar);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                aVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i5;
        i iVar;
        if (j.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !Intrinsics.areEqual(aVar.f20046h, this)) {
                aVar = null;
            }
            synchronized (this.f20062g) {
                i5 = (int) (f20054i.get(this) & 2097151);
            }
            if (1 <= i5) {
                int i10 = 1;
                while (true) {
                    Object b10 = this.f20062g.b(i10);
                    Intrinsics.checkNotNull(b10);
                    a aVar2 = (a) b10;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f20039a;
                        f fVar = this.f20061f;
                        mVar.getClass();
                        i iVar2 = (i) m.f20078b.getAndSet(mVar, null);
                        if (iVar2 != null) {
                            fVar.a(iVar2);
                        }
                        while (true) {
                            i b11 = mVar.b();
                            if (b11 == null) {
                                break;
                            } else {
                                fVar.a(b11);
                            }
                        }
                    }
                    if (i10 == i5) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f20061f.b();
            this.f20060e.b();
            while (true) {
                if (aVar != null) {
                    iVar = aVar.a(true);
                }
                iVar = (i) this.f20060e.d();
                if (iVar == null && (iVar = (i) this.f20061f.d()) == null) {
                    break;
                }
                try {
                    iVar.run();
                } catch (Throwable th2) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                }
            }
            if (aVar != null) {
                aVar.h(b.f20051e);
            }
            f20053h.set(this, 0L);
            f20054i.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        n(this, runnable, 6);
    }

    public final void k(Runnable runnable, boolean z5, boolean z7) {
        i jVar;
        b bVar;
        k.f20076f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f20068a = nanoTime;
            jVar.f20069b = z5;
        } else {
            jVar = new j(runnable, nanoTime, z5);
        }
        boolean z10 = jVar.f20069b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20054i;
        long addAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !Intrinsics.areEqual(aVar.f20046h, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f20041c) != b.f20051e && (jVar.f20069b || bVar != b.f20048b)) {
            aVar.f20045g = true;
            m mVar = aVar.f20039a;
            if (z7) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f20078b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f20069b ? this.f20061f.a(jVar) : this.f20060e.a(jVar))) {
                throw new RejectedExecutionException(d9.e.l(new StringBuilder(), this.f20059d, " was terminated"));
            }
        }
        if (z10) {
            if (w() || t(addAndGet)) {
                return;
            }
            w();
            return;
        }
        if (w() || t(atomicLongFieldUpdater.get(this))) {
            return;
        }
        w();
    }

    public final void r(a aVar, int i5, int i10) {
        while (true) {
            long j6 = f20053h.get(this);
            int i11 = (int) (2097151 & j6);
            long j10 = (2097152 + j6) & (-2097152);
            if (i11 == i5) {
                if (i10 == 0) {
                    Object c2 = aVar.c();
                    while (true) {
                        if (c2 == f20055k) {
                            i11 = -1;
                            break;
                        }
                        if (c2 == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) c2;
                        int b10 = aVar2.b();
                        if (b10 != 0) {
                            i11 = b10;
                            break;
                        }
                        c2 = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f20053h.compareAndSet(this, j6, i11 | j10)) {
                    return;
                }
            }
        }
    }

    public final boolean t(long j6) {
        int i5 = ((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21));
        if (i5 < 0) {
            i5 = 0;
        }
        int i10 = this.f20056a;
        if (i5 < i10) {
            int c2 = c();
            if (c2 == 1 && i10 > 1) {
                c();
            }
            if (c2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.f20062g;
        int a7 = sVar.a();
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < a7; i14++) {
            a aVar = (a) sVar.b(i14);
            if (aVar != null) {
                m mVar = aVar.f20039a;
                mVar.getClass();
                int i15 = m.f20078b.get(mVar) != null ? (m.f20079c.get(mVar) - m.f20080d.get(mVar)) + 1 : m.f20079c.get(mVar) - m.f20080d.get(mVar);
                int ordinal = aVar.f20041c.ordinal();
                if (ordinal == 0) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (ordinal == 2) {
                    i11++;
                } else if (ordinal == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (ordinal != 4) {
                        throw new gf.m();
                    }
                    i13++;
                }
            }
        }
        long j6 = f20054i.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f20059d);
        sb5.append('@');
        sb5.append(c0.n(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f20056a;
        sb5.append(i16);
        sb5.append(", max = ");
        sb5.append(this.f20057b);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i5);
        sb5.append(", blocking = ");
        sb5.append(i10);
        sb5.append(", parked = ");
        sb5.append(i11);
        sb5.append(", dormant = ");
        sb5.append(i12);
        sb5.append(", terminated = ");
        sb5.append(i13);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f20060e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f20061f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j6));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j6) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j6 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }

    public final boolean w() {
        com.android.billingclient.api.a aVar;
        int i5;
        while (true) {
            long j6 = f20053h.get(this);
            a aVar2 = (a) this.f20062g.b((int) (2097151 & j6));
            if (aVar2 == null) {
                aVar2 = null;
            } else {
                long j10 = (2097152 + j6) & (-2097152);
                Object c2 = aVar2.c();
                while (true) {
                    aVar = f20055k;
                    if (c2 == aVar) {
                        i5 = -1;
                        break;
                    }
                    if (c2 == null) {
                        i5 = 0;
                        break;
                    }
                    a aVar3 = (a) c2;
                    i5 = aVar3.b();
                    if (i5 != 0) {
                        break;
                    }
                    c2 = aVar3.c();
                }
                if (i5 >= 0) {
                    if (f20053h.compareAndSet(this, j6, i5 | j10)) {
                        aVar2.g(aVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar2 == null) {
                return false;
            }
            if (a.f20038i.compareAndSet(aVar2, -1, 0)) {
                LockSupport.unpark(aVar2);
                return true;
            }
        }
    }
}
