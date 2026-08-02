package u;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends a.a {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23983e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23984f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23985g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23986h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23987i;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(18);
        this.f23983e = atomicReferenceFieldUpdater;
        this.f23984f = atomicReferenceFieldUpdater2;
        this.f23985g = atomicReferenceFieldUpdater3;
        this.f23986h = atomicReferenceFieldUpdater4;
        this.f23987i = atomicReferenceFieldUpdater5;
    }

    @Override // a.a
    public final boolean c(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f23986h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // a.a
    public final boolean d(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f23987i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // a.a
    public final boolean e(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f23985g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // a.a
    public final void w(f fVar, f fVar2) {
        this.f23984f.lazySet(fVar, fVar2);
    }

    @Override // a.a
    public final void x(f fVar, Thread thread) {
        this.f23983e.lazySet(fVar, thread);
    }
}
