package jg;

import eg.e0;
import eg.h0;
import eg.o0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i extends eg.w implements h0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18504h = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f18505c;

    /* renamed from: d, reason: collision with root package name */
    public final eg.w f18506d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18507e;

    /* renamed from: f, reason: collision with root package name */
    public final n f18508f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f18509g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i(eg.w wVar, int i5) {
        h0 h0Var = wVar instanceof h0 ? (h0) wVar : null;
        this.f18505c = h0Var == null ? e0.f9168a : h0Var;
        this.f18506d = wVar;
        this.f18507e = i5;
        this.f18508f = new n();
        this.f18509g = new Object();
    }

    @Override // eg.h0
    public final o0 C(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f18505c.C(j, runnable, coroutineContext);
    }

    @Override // eg.h0
    public final void N(long j, eg.l lVar) {
        this.f18505c.N(j, lVar);
    }

    @Override // eg.w
    public final void c0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable i02;
        this.f18508f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18504h;
        if (atomicIntegerFieldUpdater.get(this) >= this.f18507e || !j0() || (i02 = i0()) == null) {
            return;
        }
        try {
            h.g(this.f18506d, this, new g8.a(22, this, i02, false));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // eg.w
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable i02;
        this.f18508f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18504h;
        if (atomicIntegerFieldUpdater.get(this) >= this.f18507e || !j0() || (i02 = i0()) == null) {
            return;
        }
        try {
            this.f18506d.d0(this, new g8.a(22, this, i02, false));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // eg.w
    public final eg.w h0(int i5) {
        h.a(i5);
        return i5 >= this.f18507e ? this : super.h0(i5);
    }

    public final Runnable i0() {
        while (true) {
            Runnable runnable = (Runnable) this.f18508f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f18509g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18504h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f18508f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean j0() {
        synchronized (this.f18509g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18504h;
            if (atomicIntegerFieldUpdater.get(this) >= this.f18507e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // eg.w
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18506d);
        sb2.append(".limitedParallelism(");
        return d9.e.i(sb2, this.f18507e, ')');
    }
}
