package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i6h extends vha {
    public final AtomicIntegerFieldUpdater e;

    public i6h(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.e = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.vha
    public final boolean J(k6h k6hVar) {
        return this.e.compareAndSet(k6hVar, 0, -1);
    }

    @Override // defpackage.vha
    public final void K(k6h k6hVar) {
        this.e.set(k6hVar, 0);
    }
}
