package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m7 extends rd0 {
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;
    public final AtomicReferenceFieldUpdater s;
    public final AtomicReferenceFieldUpdater t;

    public m7(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.p = atomicReferenceFieldUpdater;
        this.q = atomicReferenceFieldUpdater2;
        this.r = atomicReferenceFieldUpdater3;
        this.s = atomicReferenceFieldUpdater4;
        this.t = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.rd0
    public final void P(o7 o7Var, o7 o7Var2) {
        this.q.lazySet(o7Var, o7Var2);
    }

    @Override // defpackage.rd0
    public final void Q(o7 o7Var, Thread thread) {
        this.p.lazySet(o7Var, thread);
    }

    @Override // defpackage.rd0
    public final boolean v(p7 p7Var, l7 l7Var, l7 l7Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.s;
            if (atomicReferenceFieldUpdater.compareAndSet(p7Var, l7Var, l7Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p7Var) == l7Var);
        return false;
    }

    @Override // defpackage.rd0
    public final boolean w(p7 p7Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.t;
            if (atomicReferenceFieldUpdater.compareAndSet(p7Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p7Var) == obj);
        return false;
    }

    @Override // defpackage.rd0
    public final boolean x(p7 p7Var, o7 o7Var, o7 o7Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(p7Var, o7Var, o7Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p7Var) == o7Var);
        return false;
    }
}
