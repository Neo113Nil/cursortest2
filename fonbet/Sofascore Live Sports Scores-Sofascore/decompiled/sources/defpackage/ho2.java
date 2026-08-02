package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ho2 extends z0h {
    public final g62 g;
    public final /* synthetic */ AtomicReferenceArray h;

    public ho2(long j, ho2 ho2Var, g62 g62Var, int i) {
        super(j, ho2Var, i);
        this.g = g62Var;
        this.h = new AtomicReferenceArray(i62.b * 2);
    }

    @Override // defpackage.z0h
    public final int g() {
        return i62.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        n(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004b, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x004d, code lost:
    
        r4.getClass();
        r6 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0052, code lost:
    
        if (r6 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0054, code lost:
    
        defpackage.y6a.v(r6, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // defpackage.z0h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, CoroutineContext coroutineContext) {
        int i2 = i62.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.h.get(i * 2);
        while (true) {
            Object l = l(i);
            boolean z2 = l instanceof kzk;
            g62 g62Var = this.g;
            if (z2 || (l instanceof lzk)) {
                if (k(i, l, z ? i62.j : i62.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        g62Var.getClass();
                        Function1 function1 = g62Var.b;
                        if (function1 != null) {
                            y6a.v(function1, obj, coroutineContext);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (l == i62.j || l == i62.k) {
                    break;
                }
                if (l != i62.g && l != i62.f) {
                    if (l == i62.i || l == i62.d || l == i62.l) {
                        return;
                    }
                    cp4.g(l, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            g62 g62Var = this.g;
            g62Var.getClass();
            g62Var.P((this.d * i62.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
