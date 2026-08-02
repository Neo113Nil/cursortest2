package eg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class x1 extends i1 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9238g = AtomicIntegerFieldUpdater.newUpdater(x1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final Thread f9239e = Thread.currentThread();

    /* renamed from: f, reason: collision with root package name */
    public o0 f9240f;

    public static void n(int i5) {
        throw new IllegalStateException(("Illegal state " + i5).toString());
    }

    @Override // eg.i1
    public final boolean k() {
        return true;
    }

    @Override // eg.i1
    public final void l(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f9238g;
            i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    return;
                }
                n(i5);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 2));
        this.f9239e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void m() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9238g;
            int i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 != 0) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        n(i5);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i5, 1)) {
                o0 o0Var = this.f9240f;
                if (o0Var != null) {
                    o0Var.b();
                    return;
                }
                return;
            }
        }
    }
}
