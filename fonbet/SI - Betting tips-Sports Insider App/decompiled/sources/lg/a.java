package lg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a extends Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20038i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final m f20039a;

    /* renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef f20040b;

    /* renamed from: c, reason: collision with root package name */
    public b f20041c;

    /* renamed from: d, reason: collision with root package name */
    public long f20042d;

    /* renamed from: e, reason: collision with root package name */
    public long f20043e;

    /* renamed from: f, reason: collision with root package name */
    public int f20044f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20045g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f20046h;
    private volatile int indexInArray;

    @Nullable
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i5) {
        this.f20046h = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f20039a = new m();
        this.f20040b = new Ref.ObjectRef();
        this.f20041c = b.f20050d;
        this.nextParkedWorker = c.f20055k;
        int nanoTime = (int) System.nanoTime();
        this.f20044f = nanoTime == 0 ? 42 : nanoTime;
        f(i5);
    }

    public final i a(boolean z5) {
        i e7;
        i e9;
        long j;
        b bVar = this.f20041c;
        b bVar2 = b.f20047a;
        c cVar = this.f20046h;
        i iVar = null;
        m mVar = this.f20039a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f20054i;
            do {
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f20078b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f20069b) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i5 = m.f20080d.get(mVar);
                    int i10 = m.f20079c.get(mVar);
                    while (true) {
                        if (i5 == i10 || m.f20081e.get(mVar) == 0) {
                            break;
                        }
                        i10--;
                        i c2 = mVar.c(i10, true);
                        if (c2 != null) {
                            iVar = c2;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f20061f.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f20054i.compareAndSet(cVar, j, j - 4398046511104L));
            this.f20041c = b.f20047a;
        }
        if (z5) {
            boolean z7 = d(cVar.f20056a * 2) == 0;
            if (z7 && (e9 = e()) != null) {
                return e9;
            }
            mVar.getClass();
            i iVar4 = (i) m.f20078b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z7 && (e7 = e()) != null) {
                return e7;
            }
        } else {
            i e10 = e();
            if (e10 != null) {
                return e10;
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

    public final int d(int i5) {
        int i10 = this.f20044f;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f20044f = i13;
        int i14 = i5 - 1;
        return (i14 & i5) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % i5;
    }

    public final i e() {
        int d10 = d(2);
        c cVar = this.f20046h;
        if (d10 == 0) {
            i iVar = (i) cVar.f20060e.d();
            return iVar != null ? iVar : (i) cVar.f20061f.d();
        }
        i iVar2 = (i) cVar.f20061f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f20060e.d();
    }

    public final void f(int i5) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20046h.f20059d);
        sb2.append("-worker-");
        sb2.append(i5 == 0 ? "TERMINATED" : String.valueOf(i5));
        setName(sb2.toString());
        this.indexInArray = i5;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f20041c;
        boolean z5 = bVar2 == b.f20047a;
        if (z5) {
            c.f20054i.addAndGet(this.f20046h, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f20041c = bVar;
        }
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.Object, lg.i] */
    /* JADX WARN: Type inference failed for: r7v14, types: [lg.i] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [lg.i] */
    public final i i(int i5) {
        long j;
        T t3;
        long j6;
        long j10;
        T t5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f20054i;
        c cVar = this.f20046h;
        int i10 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        Object obj = null;
        if (i10 < 2) {
            return null;
        }
        int d10 = d(i10);
        int i11 = 0;
        long j11 = LongCompanionObject.MAX_VALUE;
        while (i11 < i10) {
            d10++;
            if (d10 > i10) {
                d10 = 1;
            }
            a aVar = (a) cVar.f20062g.b(d10);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f20039a;
                if (i5 == 3) {
                    t3 = mVar.b();
                    j = 0;
                } else {
                    mVar.getClass();
                    int i12 = m.f20080d.get(mVar);
                    int i13 = m.f20079c.get(mVar);
                    boolean z5 = i5 == 1;
                    while (true) {
                        if (i12 == i13) {
                            j = 0;
                            break;
                        }
                        j = 0;
                        if (!z5 || m.f20081e.get(mVar) != 0) {
                            int i14 = i12 + 1;
                            t3 = mVar.c(i12, z5);
                            if (t3 != 0) {
                                break;
                            }
                            i12 = i14;
                        } else {
                            break;
                        }
                    }
                    t3 = obj;
                }
                Ref.ObjectRef objectRef = this.f20040b;
                if (t3 != 0) {
                    objectRef.element = t3;
                    t5 = obj;
                    j10 = -1;
                    j6 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f20078b;
                        ?? r14 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (r14 == 0) {
                            j6 = -1;
                            break;
                        }
                        j6 = -1;
                        if (((r14.f20069b ? 1 : 2) & i5) == 0) {
                            break;
                        }
                        k.f20076f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - r14.f20068a;
                        long j12 = k.f20072b;
                        if (nanoTime < j12) {
                            j10 = j12 - nanoTime;
                            t5 = 0;
                            break;
                        }
                        do {
                            t5 = 0;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, r14, null)) {
                                objectRef.element = r14;
                                j10 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == r14);
                        mVar = mVar2;
                        obj = null;
                    }
                    j10 = -2;
                    t5 = obj;
                }
                if (j10 == j6) {
                    i iVar = (i) objectRef.element;
                    objectRef.element = t5;
                    return iVar;
                }
                if (j10 > j) {
                    j11 = Math.min(j11, j10);
                }
            }
            i11++;
            obj = null;
        }
        if (j11 == LongCompanionObject.MAX_VALUE) {
            j11 = 0;
        }
        this.f20043e = j11;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z5 = false;
            while (c.j.get(this.f20046h) != 1) {
                b bVar = this.f20041c;
                b bVar2 = b.f20051e;
                if (bVar == bVar2) {
                    break loop0;
                }
                i a7 = a(this.f20045g);
                if (a7 != null) {
                    this.f20043e = 0L;
                    c cVar = this.f20046h;
                    this.f20042d = 0L;
                    if (this.f20041c == b.f20049c) {
                        this.f20041c = b.f20048b;
                    }
                    if (a7.f20069b) {
                        if (h(b.f20048b) && !cVar.w() && !cVar.t(c.f20054i.get(cVar))) {
                            cVar.w();
                        }
                        try {
                            a7.run();
                        } catch (Throwable th2) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                        }
                        c.f20054i.addAndGet(cVar, -2097152L);
                        if (this.f20041c != bVar2) {
                            this.f20041c = b.f20050d;
                        }
                    } else {
                        try {
                            a7.run();
                        } catch (Throwable th3) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th3);
                        }
                    }
                } else {
                    this.f20045g = false;
                    if (this.f20043e == 0) {
                        Object obj = this.nextParkedWorker;
                        com.android.billingclient.api.a aVar = c.f20055k;
                        if (obj != aVar) {
                            f20038i.set(this, -1);
                            while (this.nextParkedWorker != c.f20055k) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20038i;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    c cVar2 = this.f20046h;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.j;
                                    if (atomicIntegerFieldUpdater2.get(cVar2) == 1) {
                                        break;
                                    }
                                    b bVar3 = this.f20041c;
                                    b bVar4 = b.f20051e;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f20049c);
                                    Thread.interrupted();
                                    if (this.f20042d == 0) {
                                        j = 2097151;
                                        this.f20042d = System.nanoTime() + this.f20046h.f20058c;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f20046h.f20058c);
                                    if (System.nanoTime() - this.f20042d >= 0) {
                                        this.f20042d = 0L;
                                        c cVar3 = this.f20046h;
                                        synchronized (cVar3.f20062g) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(cVar3) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f20054i;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar3) & j)) > cVar3.f20056a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i5 = this.indexInArray;
                                                            f(0);
                                                            cVar3.r(this, i5, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j);
                                                            if (andDecrement != i5) {
                                                                Object b10 = cVar3.f20062g.b(andDecrement);
                                                                Intrinsics.checkNotNull(b10);
                                                                a aVar2 = (a) b10;
                                                                cVar3.f20062g.c(i5, aVar2);
                                                                aVar2.f(i5);
                                                                cVar3.r(aVar2, andDecrement, i5);
                                                            }
                                                            cVar3.f20062g.c(andDecrement, null);
                                                            Unit unit = Unit.f19194a;
                                                            this.f20041c = bVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.f20046h;
                            if (this.nextParkedWorker == aVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f20053h;
                                while (true) {
                                    long j6 = atomicLongFieldUpdater2.get(cVar4);
                                    int i10 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f20062g.b((int) (j6 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f20053h.compareAndSet(cVar5, j6, ((j6 + 2097152) & (-2097152)) | i10)) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else if (z5) {
                        h(b.f20049c);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f20043e);
                        this.f20043e = 0L;
                    } else {
                        z5 = true;
                    }
                }
            }
            break loop0;
        }
        h(b.f20051e);
    }
}
