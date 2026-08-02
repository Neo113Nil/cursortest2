package jg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18511a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18512b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18513c = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(m mVar, int i5) {
        while (true) {
            m f6 = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18512b;
            if (f6 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f6 = (m) obj;
                    if (!f6.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f6);
                }
            }
            if (f6 instanceof j) {
                return (((j) f6).f18510d & i5) == 0 && f6.e(mVar, i5);
            }
            atomicReferenceFieldUpdater.set(mVar, f6);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f18511a;
            atomicReferenceFieldUpdater2.set(mVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f6, this, mVar)) {
                if (atomicReferenceFieldUpdater2.get(f6) != this) {
                    break;
                }
            }
            mVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((jg.r) r6).f18524a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18512b;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            m mVar2 = mVar;
            while (true) {
                m mVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f18511a;
                    Object obj = atomicReferenceFieldUpdater2.get(mVar2);
                    if (obj == this) {
                        if (mVar == mVar2) {
                            return mVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, mVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != mVar) {
                                break;
                            }
                        }
                        return mVar2;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof r)) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        mVar3 = mVar2;
                        mVar2 = (m) obj;
                    } else {
                        if (mVar3 != null) {
                            break;
                        }
                        mVar2 = (m) atomicReferenceFieldUpdater.get(mVar2);
                    }
                }
                mVar2 = mVar3;
            }
        }
    }

    public final void g(m mVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18512b;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(mVar);
            if (f18511a.get(this) != mVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, mVar2, this)) {
                if (atomicReferenceFieldUpdater.get(mVar) != mVar2) {
                    break;
                }
            }
            if (i()) {
                mVar.f();
                return;
            }
            return;
        }
    }

    public final m h() {
        m mVar;
        Object obj = f18511a.get(this);
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null && (mVar = rVar.f18524a) != null) {
            return mVar;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (m) obj;
    }

    public boolean i() {
        return f18511a.get(this) instanceof r;
    }

    public String toString() {
        return new l(this, eg.c0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + eg.c0.n(this);
    }
}
