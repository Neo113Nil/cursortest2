package nc;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nc.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8489d extends AtomicReference<Runnable> implements InterfaceC8487b {
    @Override // nc.InterfaceC8487b
    public final void dispose() {
        Runnable andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        andSet.run();
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return get() == null;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
