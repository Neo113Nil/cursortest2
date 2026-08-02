package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class k7b extends au3 implements iv4 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(k7b.class, "runningWorkers$volatile");
    public static final /* synthetic */ long i = rh0.a.objectFieldOffset(k7b.class.getDeclaredField("runningWorkers$volatile"));
    public final /* synthetic */ iv4 c;
    public final au3 d;
    public final int e;
    public final jib f;
    public final Object g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public k7b(au3 au3Var, int i2) {
        iv4 iv4Var = au3Var instanceof iv4 ? (iv4) au3Var : null;
        this.c = iv4Var == null ? zo4.a : iv4Var;
        this.d = au3Var;
        this.e = i2;
        this.f = new jib();
        this.g = new Object();
    }

    @Override // defpackage.au3
    public final void a0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable g0;
        this.f.a(runnable);
        if (rh0.a.getIntVolatile(this, i) >= this.e || !j0() || (g0 = g0()) == null) {
            return;
        }
        try {
            this.d.a0(this, new vlo(this, g0, false, 15));
        } catch (Throwable th) {
            h.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.iv4
    public final void f(long j, lj2 lj2Var) {
        this.c.f(j, lj2Var);
    }

    @Override // defpackage.au3
    public final au3 f0(int i2) {
        oea.j(i2);
        return i2 >= this.e ? this : super.f0(i2);
    }

    @Override // defpackage.iv4
    public final q55 g(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.c.g(j, runnable, coroutineContext);
    }

    public final Runnable g0() {
        while (true) {
            Runnable runnable = (Runnable) this.f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // defpackage.au3
    public final void i(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable g0;
        this.f.a(runnable);
        if (rh0.a.getIntVolatile(this, i) >= this.e || !j0() || (g0 = g0()) == null) {
            return;
        }
        try {
            t45.b(this.d, this, new vlo(this, g0, false, 15));
        } catch (Throwable th) {
            h.decrementAndGet(this);
            throw th;
        }
    }

    public final boolean j0() {
        synchronized (this.g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
            if (rh0.a.getIntVolatile(this, i) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.au3
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(".limitedParallelism(");
        return wv8.j(sb, this.e, ')');
    }
}
