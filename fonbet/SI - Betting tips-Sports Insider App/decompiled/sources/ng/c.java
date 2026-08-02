package ng;

import eg.c0;
import eg.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c extends h implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20894h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c() {
        super(1);
        this.owner$volatile = d.f20895a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0022, code lost:
    
        r1.a(kotlin.Unit.f19194a, r4.f20904b);
     */
    @Override // ng.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(mf.c frame) {
        if (e()) {
            return Unit.f19194a;
        }
        l p10 = c0.p(lf.d.b(frame));
        try {
            b bVar = new b(this, p10);
            while (true) {
                int andDecrement = h.f20902g.getAndDecrement(this);
                if (andDecrement <= this.f20903a) {
                    if (andDecrement > 0) {
                        break;
                    }
                    Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
                    if (b(bVar)) {
                        break;
                    }
                }
            }
            Object r5 = p10.r();
            lf.a aVar = lf.a.f20034a;
            if (r5 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (r5 != aVar) {
                r5 = Unit.f19194a;
            }
            return r5 == aVar ? r5 : Unit.f19194a;
        } catch (Throwable th2) {
            p10.A();
            throw th2;
        }
    }

    public final boolean e() {
        int i5;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f20902g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f20903a;
            if (i10 > i11) {
                do {
                    i5 = atomicIntegerFieldUpdater.get(this);
                    if (i5 > i11) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, i11));
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f20894h.set(this, null);
                    return true;
                }
            }
        }
    }

    @Override // ng.a
    public final void k(Object obj) {
        while (Math.max(h.f20902g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20894h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            com.android.billingclient.api.a aVar = d.f20895a;
            if (obj2 != aVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    d();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Mutex@");
        sb2.append(c0.n(this));
        sb2.append("[isLocked=");
        sb2.append(Math.max(h.f20902g.get(this), 0) == 0);
        sb2.append(",owner=");
        sb2.append(f20894h.get(this));
        sb2.append(']');
        return sb2.toString();
    }
}
