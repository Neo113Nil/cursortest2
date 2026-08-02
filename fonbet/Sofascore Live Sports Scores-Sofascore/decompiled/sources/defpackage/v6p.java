package defpackage;

import com.mbridge.msdk.foundation.controller.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v6p extends u6p {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(y6p.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(y6p.class, y6p.class, "b");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(z6p.class, y6p.class, a.q);
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(z6p.class, q6p.class, "b");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(z6p.class, Object.class, "a");

    private v6p() {
        throw null;
    }

    @Override // defpackage.u6p
    public final void a(y6p y6pVar, Thread thread) {
        a.lazySet(y6pVar, thread);
    }

    @Override // defpackage.u6p
    public final void b(y6p y6pVar, y6p y6pVar2) {
        b.lazySet(y6pVar, y6pVar2);
    }

    @Override // defpackage.u6p
    public final boolean c(z6p z6pVar, y6p y6pVar, y6p y6pVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = c;
            if (atomicReferenceFieldUpdater.compareAndSet(z6pVar, y6pVar, y6pVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(z6pVar) == y6pVar);
        return false;
    }

    @Override // defpackage.u6p
    public final boolean d(t6p t6pVar, q6p q6pVar, q6p q6pVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = d;
            if (atomicReferenceFieldUpdater.compareAndSet(t6pVar, q6pVar, q6pVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(t6pVar) == q6pVar);
        return false;
    }

    @Override // defpackage.u6p
    public final y6p e(t6p t6pVar) {
        return (y6p) c.getAndSet(t6pVar, y6p.c);
    }

    @Override // defpackage.u6p
    public final q6p f(t6p t6pVar, q6p q6pVar) {
        return (q6p) d.getAndSet(t6pVar, q6pVar);
    }

    @Override // defpackage.u6p
    public final boolean g(z6p z6pVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = e;
            if (atomicReferenceFieldUpdater.compareAndSet(z6pVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(z6pVar) == obj);
        return false;
    }
}
