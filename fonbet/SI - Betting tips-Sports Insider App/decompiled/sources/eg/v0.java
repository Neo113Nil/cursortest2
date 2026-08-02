package eg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class v0 extends w0 implements h0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9227g = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_queue$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9228h = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_delayed$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9229i = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    public o0 C(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return e0.f9168a.C(j, runnable, coroutineContext);
    }

    @Override // eg.h0
    public final void N(long j, l lVar) {
        long j6 = j > 0 ? j >= 9223372036854L ? LongCompanionObject.MAX_VALUE : 1000000 * j : 0L;
        if (j6 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            r0 r0Var = new r0(this, j6 + nanoTime, lVar);
            x0(nanoTime, r0Var);
            lVar.v(new h(2, r0Var));
        }
    }

    @Override // eg.w
    public final void c0(CoroutineContext coroutineContext, Runnable runnable) {
        t0(runnable);
    }

    @Override // eg.w0
    public final long o0() {
        Runnable runnable;
        t0 t0Var;
        com.android.billingclient.api.a aVar = c0.f9152c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9227g;
        if (!q0()) {
            u0();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof jg.p)) {
                    if (obj != aVar) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                jg.p pVar = (jg.p) obj;
                Object d10 = pVar.d();
                if (d10 != jg.p.f18518g) {
                    runnable = (Runnable) d10;
                    break;
                }
                jg.p c2 = pVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            kotlin.collections.l lVar = this.f9234e;
            if (((lVar == null || lVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof jg.p) {
                        long j = jg.p.f18517f.get((jg.p) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == aVar) {
                        return LongCompanionObject.MAX_VALUE;
                    }
                }
                u0 u0Var = (u0) f9228h.get(this);
                if (u0Var != null) {
                    synchronized (u0Var) {
                        t0[] t0VarArr = u0Var.f18487a;
                        t0Var = t0VarArr != null ? t0VarArr[0] : null;
                    }
                    if (t0Var != null) {
                        long nanoTime = t0Var.f9224a - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return LongCompanionObject.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // eg.w0
    public void shutdown() {
        t0 c2;
        w1.f9235a.set(null);
        f9229i.set(this, 1);
        com.android.billingclient.api.a aVar = c0.f9152c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9227g;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof jg.p)) {
                    if (obj != aVar) {
                        jg.p pVar = new jg.p(8, true);
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                        pVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((jg.p) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (o0() <= 0) {
        }
        long nanoTime = System.nanoTime();
        while (true) {
            u0 u0Var = (u0) f9228h.get(this);
            if (u0Var == null) {
                return;
            }
            synchronized (u0Var) {
                c2 = jg.b0.f18486b.get(u0Var) > 0 ? u0Var.c(0) : null;
            }
            if (c2 == null) {
                return;
            } else {
                s0(nanoTime, c2);
            }
        }
    }

    public void t0(Runnable runnable) {
        u0();
        if (!v0(runnable)) {
            d0.j.t0(runnable);
            return;
        }
        Thread k0 = k0();
        if (Thread.currentThread() != k0) {
            LockSupport.unpark(k0);
        }
    }

    public final void u0() {
        t0 t0Var;
        u0 u0Var = (u0) f9228h.get(this);
        if (u0Var == null || jg.b0.f18486b.get(u0Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.f18487a;
                    t0 t0Var2 = t0VarArr != null ? t0VarArr[0] : null;
                    if (t0Var2 != null) {
                        t0Var = ((nanoTime - t0Var2.f9224a) > 0L ? 1 : ((nanoTime - t0Var2.f9224a) == 0L ? 0 : -1)) >= 0 ? v0(t0Var2) : false ? u0Var.c(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (t0Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v0(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9227g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f9229i.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof jg.p)) {
                        if (obj != c0.f9152c) {
                            jg.p pVar = new jg.p(8, true);
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                            pVar.a((Runnable) obj);
                            pVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                    jg.p pVar2 = (jg.p) obj;
                    int a7 = pVar2.a(runnable);
                    if (a7 == 0) {
                        break;
                    }
                    if (a7 == 1) {
                        jg.p c2 = pVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (a7 == 2) {
                        return false;
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
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((jg.b0.f18486b.get(r0) == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w0() {
        kotlin.collections.l lVar = this.f9234e;
        if (lVar != null ? lVar.isEmpty() : true) {
            u0 u0Var = (u0) f9228h.get(this);
            if (u0Var != null) {
            }
            Object obj = f9227g.get(this);
            if (obj != null) {
                if (obj instanceof jg.p) {
                    long j = jg.p.f18517f.get((jg.p) obj);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (obj == c0.f9152c) {
                }
            }
            return true;
        }
        return false;
    }

    public final void x0(long j, t0 t0Var) {
        int d10;
        Thread k0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9228h;
        if (f9229i.get(this) == 1) {
            d10 = 1;
        } else {
            u0 u0Var = (u0) atomicReferenceFieldUpdater.get(this);
            if (u0Var == null) {
                u0 u0Var2 = new u0();
                u0Var2.f9226c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, u0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.checkNotNull(obj);
                u0Var = (u0) obj;
            }
            d10 = t0Var.d(j, u0Var, this);
        }
        if (d10 != 0) {
            if (d10 == 1) {
                s0(j, t0Var);
                return;
            } else {
                if (d10 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        u0 u0Var3 = (u0) atomicReferenceFieldUpdater.get(this);
        if (u0Var3 != null) {
            synchronized (u0Var3) {
                t0[] t0VarArr = u0Var3.f18487a;
                r2 = t0VarArr != null ? t0VarArr[0] : null;
            }
        }
        if (r2 != t0Var || Thread.currentThread() == (k0 = k0())) {
            return;
        }
        LockSupport.unpark(k0);
    }
}
