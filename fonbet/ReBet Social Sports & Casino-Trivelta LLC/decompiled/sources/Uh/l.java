package Uh;

import f0.AbstractC4221b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref;
import mh.AbstractC5586b;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12297b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12298c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12299d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12300e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f12301a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f12297b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f12288b) {
            f12300e.incrementAndGet(this);
        }
        int i10 = f12298c.get(this) & 127;
        while (this.f12301a.get(i10) != null) {
            Thread.yield();
        }
        this.f12301a.lazySet(i10, hVar);
        f12298c.incrementAndGet(this);
        return null;
    }

    public final void c(h hVar) {
        if (hVar == null || !hVar.f12288b) {
            return;
        }
        f12300e.decrementAndGet(this);
    }

    public final int e() {
        return f12298c.get(this) - f12299d.get(this);
    }

    public final int i() {
        return f12297b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f12297b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f12297b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final h m() {
        h hVar;
        while (true) {
            int i10 = f12299d.get(this);
            if (i10 - f12298c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (f12299d.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f12301a.getAndSet(i11, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    public final boolean n(d dVar) {
        h m10 = m();
        if (m10 == null) {
            return false;
        }
        dVar.a(m10);
        return true;
    }

    public final h o(boolean z10) {
        h hVar;
        do {
            hVar = (h) f12297b.get(this);
            if (hVar == null || hVar.f12288b != z10) {
                int i10 = f12299d.get(this);
                int i11 = f12298c.get(this);
                while (i10 != i11) {
                    if (z10 && f12300e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h q10 = q(i11, z10);
                    if (q10 != null) {
                        return q10;
                    }
                }
                return null;
            }
        } while (!AbstractC4221b.a(f12297b, this, hVar, null));
        return hVar;
    }

    public final h p(int i10) {
        int i11 = f12299d.get(this);
        int i12 = f12298c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f12300e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h q10 = q(i11, z10);
            if (q10 != null) {
                return q10;
            }
            i11 = i13;
        }
        return null;
    }

    public final h q(int i10, boolean z10) {
        int i11 = i10 & 127;
        h hVar = (h) this.f12301a.get(i11);
        if (hVar == null || hVar.f12288b != z10 || !AbstractC5586b.a(this.f12301a, i11, hVar, null)) {
            return null;
        }
        if (z10) {
            f12300e.decrementAndGet(this);
        }
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r(int i10, Ref.ObjectRef objectRef) {
        T m10 = i10 == 3 ? m() : p(i10);
        if (m10 == 0) {
            return s(i10, objectRef);
        }
        objectRef.element = m10;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, Uh.h, java.lang.Object] */
    public final long s(int i10, Ref.ObjectRef objectRef) {
        ?? r02;
        do {
            r02 = (h) f12297b.get(this);
            if (r02 == 0) {
                return -2L;
            }
            if (((r02.f12288b ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long a10 = j.f12295f.a() - r02.f12287a;
            long j10 = j.f12291b;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!AbstractC4221b.a(f12297b, this, r02, null));
        objectRef.element = r02;
        return -1L;
    }
}
