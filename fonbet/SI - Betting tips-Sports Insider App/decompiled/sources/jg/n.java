package jg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18514a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new p(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18514a;
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            int a7 = pVar.a(runnable);
            if (a7 == 0) {
                return true;
            }
            if (a7 == 1) {
                p c2 = pVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, pVar, c2) && atomicReferenceFieldUpdater.get(this) == pVar) {
                }
            } else if (a7 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18514a;
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            if (pVar.b()) {
                return;
            }
            p c2 = pVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pVar, c2) && atomicReferenceFieldUpdater.get(this) == pVar) {
            }
        }
    }

    public final int c() {
        p pVar = (p) f18514a.get(this);
        pVar.getClass();
        long j = p.f18517f.get(pVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18514a;
            p pVar = (p) atomicReferenceFieldUpdater.get(this);
            Object d10 = pVar.d();
            if (d10 != p.f18518g) {
                return d10;
            }
            p c2 = pVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pVar, c2) && atomicReferenceFieldUpdater.get(this) == pVar) {
            }
        }
    }
}
