package gg;

import eg.f2;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p extends jg.u {

    /* renamed from: e, reason: collision with root package name */
    public final h f10096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f10097f;

    public p(long j, p pVar, h hVar, int i5) {
        super(j, pVar, i5);
        this.f10096e = hVar;
        this.f10097f = new AtomicReferenceArray(j.f10075b * 2);
    }

    @Override // jg.u
    public final int g() {
        return j.f10075b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r2);
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // jg.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i5, CoroutineContext coroutineContext) {
        int i10 = j.f10075b;
        boolean z5 = i5 >= i10;
        if (z5) {
            i5 -= i10;
        }
        this.f10097f.get(i5 * 2);
        while (true) {
            Object l6 = l(i5);
            boolean z7 = l6 instanceof f2;
            h hVar = this.f10096e;
            if (z7 || (l6 instanceof a0)) {
                if (k(i5, l6, z5 ? j.j : j.f10083k)) {
                    n(i5, null);
                    m(i5, !z5);
                    if (z5) {
                        Intrinsics.checkNotNull(hVar);
                        hVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (l6 == j.j || l6 == j.f10083k) {
                    break;
                }
                if (l6 != j.f10080g && l6 != j.f10079f) {
                    if (l6 == j.f10082i || l6 == j.f10077d || l6 == j.f10084l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + l6).toString());
                }
            }
        }
    }

    public final boolean k(int i5, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i5 * 2) + 1;
        do {
            atomicReferenceArray = this.f10097f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i5) {
        return this.f10097f.get((i5 * 2) + 1);
    }

    public final void m(int i5, boolean z5) {
        if (z5) {
            h hVar = this.f10096e;
            Intrinsics.checkNotNull(hVar);
            hVar.J((this.f18527c * j.f10075b) + i5);
        }
        i();
    }

    public final void n(int i5, Object obj) {
        this.f10097f.set(i5 * 2, obj);
    }

    public final void o(int i5, Object obj) {
        this.f10097f.set((i5 * 2) + 1, obj);
    }
}
