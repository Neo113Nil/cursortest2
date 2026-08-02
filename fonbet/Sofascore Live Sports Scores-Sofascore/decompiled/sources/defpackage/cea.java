package defpackage;

import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class cea extends iib implements q55, k0a {
    public kea d;

    @Override // defpackage.k0a
    public final ydd b() {
        return null;
    }

    @Override // defpackage.q55
    public final void d() {
        cea ceaVar;
        Unsafe unsafe;
        long j;
        kea k = k();
        while (true) {
            Object O = k.O();
            if (O instanceof cea) {
                if (O != this) {
                    return;
                }
                do {
                    unsafe = rh0.a;
                    j = kea.b;
                    if (unsafe.compareAndSwapObject(k, j, O, lea.g)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(k, j) == O);
            } else {
                if (!(O instanceof k0a) || ((k0a) O).b() == null) {
                    return;
                }
                while (true) {
                    Object g = this.g();
                    if (g instanceof jyf) {
                        return;
                    }
                    if (g == this) {
                        return;
                    }
                    g.getClass();
                    iib iibVar = (iib) g;
                    Unsafe unsafe2 = rh0.a;
                    long j2 = iib.c;
                    jyf jyfVar = (jyf) unsafe2.getObjectVolatile(iibVar, j2);
                    if (jyfVar == null) {
                        jyfVar = new jyf(iibVar);
                        unsafe2.putObjectVolatile(iibVar, j2, jyfVar);
                    }
                    jyf jyfVar2 = jyfVar;
                    while (true) {
                        Unsafe unsafe3 = rh0.a;
                        long j3 = iib.a;
                        ceaVar = this;
                        if (unsafe3.compareAndSwapObject(ceaVar, j3, g, jyfVar2)) {
                            iibVar.e();
                            return;
                        } else if (unsafe3.getObjectVolatile(ceaVar, j3) != g) {
                            break;
                        } else {
                            this = ceaVar;
                        }
                    }
                    this = ceaVar;
                }
            }
        }
    }

    public yda getParent() {
        return k();
    }

    @Override // defpackage.k0a
    public final boolean isActive() {
        return true;
    }

    public final kea k() {
        kea keaVar = this.d;
        if (keaVar != null) {
            return keaVar;
        }
        Intrinsics.i("job");
        throw null;
    }

    public abstract boolean l();

    public abstract void m(Throwable th);

    @Override // defpackage.iib
    public final String toString() {
        return getClass().getSimpleName() + '@' + ml4.X(this) + "[job@" + ml4.X(k()) + ']';
    }
}
