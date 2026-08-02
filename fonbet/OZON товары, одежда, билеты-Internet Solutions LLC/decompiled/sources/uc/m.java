package uc;

import Kc.C3493a;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class m extends AtomicReference<InterfaceC8487b> implements io.reactivex.d, InterfaceC8487b {
    @Override // nc.InterfaceC8487b
    public final void dispose() {
        rc.d.a(this);
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return get() == rc.d.DISPOSED;
    }

    @Override // io.reactivex.d
    public final void onComplete() {
        lazySet(rc.d.DISPOSED);
    }

    @Override // io.reactivex.d
    public final void onError(Throwable th2) {
        lazySet(rc.d.DISPOSED);
        C3493a.f(new oc.c(th2));
    }

    @Override // io.reactivex.d
    public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
        rc.d.f(this, interfaceC8487b);
    }
}
