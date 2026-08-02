package ze;

import De.C2857A;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.j1;

/* loaded from: classes.dex */
public final class m<E> extends De.x<m<E>> {

    /* renamed from: e, reason: collision with root package name */
    private final C11115c<E> f108950e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f108951f;

    public m(long j11, m<E> mVar, C11115c<E> c11115c, int i11) {
        super(j11, mVar, i11);
        this.f108950e = c11115c;
        this.f108951f = new AtomicReferenceArray(g.f108925b * 2);
    }

    @Override // De.x
    public final int k() {
        return g.f108925b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0063, code lost:
    
        r2.set(r6 * 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0068, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006a, code lost:
    
        kotlin.jvm.internal.Intrinsics.f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // De.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i11, @NotNull CoroutineContext coroutineContext) {
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        C2857A c2857a4;
        C2857A c2857a5;
        int i12 = g.f108925b;
        boolean z11 = i11 >= i12;
        if (z11) {
            i11 -= i12;
        }
        s(i11);
        while (true) {
            Object t2 = t(i11);
            boolean z12 = t2 instanceof j1;
            AtomicReferenceArray atomicReferenceArray = this.f108951f;
            C11115c<E> c11115c = this.f108950e;
            if (!z12 && !(t2 instanceof D)) {
                c2857a = g.f108933j;
                if (t2 == c2857a) {
                    break;
                }
                c2857a2 = g.f108934k;
                if (t2 == c2857a2) {
                    break;
                }
                c2857a3 = g.f108930g;
                if (t2 != c2857a3) {
                    c2857a4 = g.f108929f;
                    if (t2 != c2857a4) {
                        c2857a5 = g.f108932i;
                        if (t2 == c2857a5 || t2 == g.f108927d || t2 == g.r()) {
                            return;
                        }
                        throw new IllegalStateException(("unexpected state: " + t2).toString());
                    }
                } else {
                    continue;
                }
            } else {
                if (o(i11, t2, z11 ? g.f108933j : g.f108934k)) {
                    atomicReferenceArray.set(i11 * 2, null);
                    u(i11, !z11);
                    if (z11) {
                        Intrinsics.f(c11115c);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final boolean o(int i11, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f108951f;
        int i12 = (i11 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i12, obj, obj2)) {
            if (atomicReferenceArray.get(i12) != obj) {
                return false;
            }
        }
        return true;
    }

    public final void p(int i11) {
        this.f108951f.set(i11 * 2, null);
    }

    public final Object q(int i11, C2857A c2857a) {
        return this.f108951f.getAndSet((i11 * 2) + 1, c2857a);
    }

    @NotNull
    public final C11115c<E> r() {
        C11115c<E> c11115c = this.f108950e;
        Intrinsics.f(c11115c);
        return c11115c;
    }

    public final E s(int i11) {
        return (E) this.f108951f.get(i11 * 2);
    }

    public final Object t(int i11) {
        return this.f108951f.get((i11 * 2) + 1);
    }

    public final void u(int i11, boolean z11) {
        if (z11) {
            C11115c<E> c11115c = this.f108950e;
            Intrinsics.f(c11115c);
            c11115c.W((this.f6654c * g.f108925b) + i11);
        }
        m();
    }

    public final E v(int i11) {
        E s11 = s(i11);
        this.f108951f.set(i11 * 2, null);
        return s11;
    }

    public final void w(int i11, C2857A c2857a) {
        this.f108951f.set((i11 * 2) + 1, c2857a);
    }

    public final void x(int i11, E e11) {
        this.f108951f.set(i11 * 2, e11);
    }
}
