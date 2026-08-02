package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class igj extends cea {
    public static final /* synthetic */ long g = rh0.a.objectFieldOffset(igj.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public q55 f;

    public static void o(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // defpackage.cea
    public final boolean l() {
        return true;
    }

    @Override // defpackage.cea
    public final void m(Throwable th) {
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                o(intVolatile);
                throw null;
            }
            igj igjVar = this;
            if (unsafe.compareAndSwapInt(igjVar, g, intVolatile, 2)) {
                igjVar.e.interrupt();
                unsafe.putIntVolatile(igjVar, j, 3);
                return;
            }
            this = igjVar;
        }
    }

    public final void n() {
        igj igjVar;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                igjVar = this;
                if (unsafe.compareAndSwapInt(igjVar, j, intVolatile, 1)) {
                    q55 q55Var = igjVar.f;
                    if (q55Var != null) {
                        q55Var.d();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        o(intVolatile);
                        throw null;
                    }
                }
                igjVar = this;
            }
            this = igjVar;
        }
    }
}
