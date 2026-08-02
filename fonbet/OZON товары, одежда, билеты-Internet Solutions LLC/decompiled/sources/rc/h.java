package rc;

import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class h extends AtomicReference<InterfaceC8487b> implements InterfaceC8487b {
    public h(h hVar) {
        lazySet(hVar);
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        d.a(this);
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return d.b(get());
    }
}
