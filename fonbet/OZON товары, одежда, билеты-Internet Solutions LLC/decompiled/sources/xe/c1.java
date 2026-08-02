package xe;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class c1 extends G0 {

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f105438g = AtomicIntegerFieldUpdater.newUpdater(c1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    private final Thread f105439e = Thread.currentThread();

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC10724g0 f105440f;

    private static void q(int i11) {
        throw new IllegalStateException(("Illegal state " + i11).toString());
    }

    @Override // xe.G0
    public final boolean n() {
        return true;
    }

    @Override // xe.G0
    public final void o(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f105438g;
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 1 || i11 == 2 || i11 == 3) {
                    return;
                }
                q(i11);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 2));
        this.f105439e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void p() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f105438g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        q(i11);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i11, 1)) {
                InterfaceC10724g0 interfaceC10724g0 = this.f105440f;
                if (interfaceC10724g0 != null) {
                    interfaceC10724g0.dispose();
                    return;
                }
                return;
            }
        }
    }

    public final void r(@NotNull B0 b02) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        this.f105440f = E0.h(b02, this);
        do {
            atomicIntegerFieldUpdater = f105438g;
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 2 || i11 == 3) {
                    return;
                }
                q(i11);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 0));
    }
}
