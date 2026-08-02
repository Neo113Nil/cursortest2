package xe;

import De.C2867j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: xe.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10712a0<T> extends De.w<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105425e = AtomicIntegerFieldUpdater.newUpdater(C10712a0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C10712a0() {
        throw null;
    }

    @Override // De.w, xe.H0
    protected final void r(Object obj) {
        t(obj);
    }

    @Override // De.w, xe.H0
    protected final void t(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f105425e;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                C2867j.b(C10710B.a(obj), Wc.b.b(this.f6652d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }

    public final Object z0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f105425e;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object g10 = I0.g(U());
                if (g10 instanceof C10760z) {
                    throw ((C10760z) g10).f105510a;
                }
                return g10;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 1));
        return Wc.a.COROUTINE_SUSPENDED;
    }
}
