package defpackage;

import com.mbridge.msdk.foundation.controller.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eap extends sha {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(hap.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(hap.class, hap.class, "b");
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(iap.class, hap.class, a.q);
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(iap.class, dap.class, "b");
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(iap.class, Object.class, "a");

    @Override // defpackage.sha
    public final void a0(hap hapVar, Thread thread) {
        e.lazySet(hapVar, thread);
    }

    @Override // defpackage.sha
    public final void b0(hap hapVar, hap hapVar2) {
        f.lazySet(hapVar, hapVar2);
    }

    @Override // defpackage.sha
    public final boolean c0(iap iapVar, hap hapVar, hap hapVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = g;
            if (atomicReferenceFieldUpdater.compareAndSet(iapVar, hapVar, hapVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iapVar) == hapVar);
        return false;
    }

    @Override // defpackage.sha
    public final boolean d0(iap iapVar, dap dapVar, dap dapVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(iapVar, dapVar, dapVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iapVar) == dapVar);
        return false;
    }

    @Override // defpackage.sha
    public final hap e0(iap iapVar) {
        return (hap) g.getAndSet(iapVar, hap.c);
    }

    @Override // defpackage.sha
    public final dap g0(iap iapVar) {
        return (dap) h.getAndSet(iapVar, dap.d);
    }

    @Override // defpackage.sha
    public final boolean h0(iap iapVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = i;
            if (atomicReferenceFieldUpdater.compareAndSet(iapVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iapVar) == obj);
        return false;
    }
}
