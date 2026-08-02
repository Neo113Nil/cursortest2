package rc;

import Bl0.C2645f;
import Kc.C3493a;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;

/* renamed from: rc.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9243b extends AtomicReference<qc.f> implements InterfaceC8487b {
    @Override // nc.InterfaceC8487b
    public final void dispose() {
        qc.f andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e11) {
            C2645f.c(e11);
            C3493a.f(e11);
        }
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return get() == null;
    }
}
