package defpackage;

import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.setting.i;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class llo extends l4a {
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(nlo.class, Set.class, h.b);
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(nlo.class, i.a);

    @Override // defpackage.l4a
    public final void V(klo kloVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f;
            if (atomicReferenceFieldUpdater.compareAndSet(kloVar, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(kloVar) == null);
    }

    @Override // defpackage.l4a
    public final int W(klo kloVar) {
        return g.decrementAndGet(kloVar);
    }
}
