package Rh;

import Ph.l1;
import Sh.D;
import Sh.G;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mh.AbstractC5586b;

/* loaded from: classes5.dex */
public final class o extends D {

    /* renamed from: e, reason: collision with root package name */
    public final h f10370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f10371f;

    public o(long j10, o oVar, h hVar, int i10) {
        super(j10, oVar, i10);
        this.f10370e = hVar;
        this.f10371f = new AtomicReferenceArray(i.f10343b * 2);
    }

    public final Object A(int i10) {
        return z().get(i10 * 2);
    }

    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final void C(int i10, boolean z10) {
        if (z10) {
            y().m1((this.f10763c * i.f10343b) + i10);
        }
        t();
    }

    public final Object D(int i10) {
        Object A10 = A(i10);
        w(i10);
        return A10;
    }

    public final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    public final void F(int i10, Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, Object obj) {
        E(i10, obj);
    }

    @Override // Sh.D
    public int r() {
        return i.f10343b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
    
        w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0067, code lost:
    
        r4 = y().f10327b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006f, code lost:
    
        Sh.z.a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // Sh.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(int i10, Throwable th2, CoroutineContext coroutineContext) {
        Function1 function1;
        G g10;
        G g11;
        G g12;
        G g13;
        G g14;
        int i11 = i.f10343b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        Object A10 = A(i10);
        while (true) {
            Object B10 = B(i10);
            if (!(B10 instanceof l1) && !(B10 instanceof C)) {
                g10 = i.f10351j;
                if (B10 == g10) {
                    break;
                }
                g11 = i.f10352k;
                if (B10 == g11) {
                    break;
                }
                g12 = i.f10348g;
                if (B10 != g12) {
                    g13 = i.f10347f;
                    if (B10 != g13) {
                        g14 = i.f10350i;
                        if (B10 == g14 || B10 == i.f10345d || B10 == i.z()) {
                            return;
                        }
                        throw new IllegalStateException(("unexpected state: " + B10).toString());
                    }
                } else {
                    continue;
                }
            } else {
                if (v(i10, B10, z10 ? i.f10351j : i.f10352k)) {
                    w(i10);
                    C(i10, !z10);
                    if (!z10 || (function1 = y().f10327b) == null) {
                        return;
                    }
                    Sh.z.a(function1, A10, coroutineContext);
                    return;
                }
            }
        }
    }

    public final boolean v(int i10, Object obj, Object obj2) {
        return AbstractC5586b.a(z(), (i10 * 2) + 1, obj, obj2);
    }

    public final void w(int i10) {
        E(i10, null);
    }

    public final Object x(int i10, Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }

    public final h y() {
        h hVar = this.f10370e;
        Intrinsics.checkNotNull(hVar);
        return hVar;
    }

    public final /* synthetic */ AtomicReferenceArray z() {
        return this.f10371f;
    }
}
