package eg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class i1 extends jg.m implements o0, b1 {

    /* renamed from: d, reason: collision with root package name */
    public m1 f9180d;

    @Override // eg.o0
    public final void b() {
        m1 j = j();
        j.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m1.f9202a;
            Object obj = atomicReferenceFieldUpdater.get(j);
            if (obj instanceof i1) {
                if (obj != this) {
                    return;
                }
                q0 q0Var = c0.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(j, obj, q0Var)) {
                    if (atomicReferenceFieldUpdater.get(j) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof b1) || ((b1) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = jg.m.f18511a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof jg.r) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                jg.m mVar = (jg.m) obj2;
                mVar.getClass();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = jg.m.f18513c;
                jg.r rVar = (jg.r) atomicReferenceFieldUpdater3.get(mVar);
                if (rVar == null) {
                    rVar = new jg.r(mVar);
                    atomicReferenceFieldUpdater3.set(mVar, rVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, rVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                mVar.f();
                return;
            }
        }
    }

    @Override // eg.b1
    public final boolean c() {
        return true;
    }

    @Override // eg.b1
    public final o1 d() {
        return null;
    }

    public e1 getParent() {
        return j();
    }

    public final m1 j() {
        m1 m1Var = this.f9180d;
        if (m1Var != null) {
            return m1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th2);

    @Override // jg.m
    public final String toString() {
        return getClass().getSimpleName() + '@' + c0.n(this) + "[job@" + c0.n(j()) + ']';
    }
}
