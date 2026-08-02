package defpackage;

import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class it2 extends cea {
    public final lj2 e;

    public it2(lj2 lj2Var) {
        this.e = lj2Var;
    }

    @Override // defpackage.cea
    public final boolean l() {
        return true;
    }

    @Override // defpackage.cea
    public final void m(Throwable th) {
        Unsafe unsafe;
        Unsafe unsafe2;
        kea k = k();
        lj2 lj2Var = this.e;
        Throwable p = lj2Var.p(k);
        if (lj2Var.y()) {
            rq3 rq3Var = lj2Var.d;
            rq3Var.getClass();
            s45 s45Var = (s45) rq3Var;
            long j = s45.h;
            loop0: while (true) {
                Object objectVolatile = rh0.a.getObjectVolatile(s45Var, j);
                ih2 ih2Var = t45.b;
                if (Intrinsics.c(objectVolatile, ih2Var)) {
                    do {
                        unsafe = rh0.a;
                        if (unsafe.compareAndSwapObject(s45Var, s45.h, ih2Var, p)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(s45Var, j) == ih2Var);
                } else {
                    if (objectVolatile instanceof Throwable) {
                        return;
                    }
                    do {
                        unsafe2 = rh0.a;
                        if (unsafe2.compareAndSwapObject(s45Var, s45.h, objectVolatile, (Object) null)) {
                            break loop0;
                        }
                    } while (unsafe2.getObjectVolatile(s45Var, j) == objectVolatile);
                }
            }
        }
        lj2Var.a(p);
        if (lj2Var.y()) {
            return;
        }
        lj2Var.n();
    }
}
