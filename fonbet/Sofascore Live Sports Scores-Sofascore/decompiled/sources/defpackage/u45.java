package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class u45 extends btg {
    public static final /* synthetic */ long f = rh0.a.objectFieldOffset(u45.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.btg, defpackage.kea
    public final void u(Object obj) {
        v(obj);
    }

    @Override // defpackage.btg, defpackage.kea
    public final void v(Object obj) {
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    t45.a(z9a.b(this.e), s9a.H(obj));
                    return;
                } else {
                    a70.r("Already resumed");
                    return;
                }
            }
            u45 u45Var = this;
            if (unsafe.compareAndSwapInt(u45Var, j, 0, 2)) {
                return;
            } else {
                this = u45Var;
            }
        }
    }
}
