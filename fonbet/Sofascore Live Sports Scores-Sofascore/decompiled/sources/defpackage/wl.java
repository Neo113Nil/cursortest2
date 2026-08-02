package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wl extends fkf {
    public final AtomicReferenceFieldUpdater k;
    public final AtomicIntegerFieldUpdater l;

    public wl(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.k = atomicReferenceFieldUpdater;
        this.l = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.fkf
    public final void A(n33 n33Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.k;
            if (atomicReferenceFieldUpdater.compareAndSet(n33Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(n33Var) == null);
    }

    @Override // defpackage.fkf
    public final int C(n33 n33Var) {
        return this.l.decrementAndGet(n33Var);
    }
}
