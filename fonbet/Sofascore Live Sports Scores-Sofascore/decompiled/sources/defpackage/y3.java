package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y3 extends hkg {
    public final AtomicReferenceFieldUpdater A;
    public final AtomicReferenceFieldUpdater B;
    public final AtomicReferenceFieldUpdater C;
    public final AtomicReferenceFieldUpdater D;
    public final AtomicReferenceFieldUpdater z;

    public y3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.z = atomicReferenceFieldUpdater;
        this.A = atomicReferenceFieldUpdater2;
        this.B = atomicReferenceFieldUpdater3;
        this.C = atomicReferenceFieldUpdater4;
        this.D = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.hkg
    public final x3 M(g4 g4Var) {
        return (x3) this.C.getAndSet(g4Var, x3.d);
    }

    @Override // defpackage.hkg
    public final f4 N(g4 g4Var) {
        return (f4) this.B.getAndSet(g4Var, f4.c);
    }

    @Override // defpackage.hkg
    public final void m0(f4 f4Var, f4 f4Var2) {
        this.A.lazySet(f4Var, f4Var2);
    }

    @Override // defpackage.hkg
    public final void n0(f4 f4Var, Thread thread) {
        this.z.lazySet(f4Var, thread);
    }

    @Override // defpackage.hkg
    public final boolean w(g4 g4Var, x3 x3Var, x3 x3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.C;
            if (atomicReferenceFieldUpdater.compareAndSet(g4Var, x3Var, x3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g4Var) == x3Var);
        return false;
    }

    @Override // defpackage.hkg
    public final boolean x(g4 g4Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.D;
            if (atomicReferenceFieldUpdater.compareAndSet(g4Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g4Var) == obj);
        return false;
    }

    @Override // defpackage.hkg
    public final boolean y(g4 g4Var, f4 f4Var, f4 f4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.B;
            if (atomicReferenceFieldUpdater.compareAndSet(g4Var, f4Var, f4Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g4Var) == f4Var);
        return false;
    }
}
