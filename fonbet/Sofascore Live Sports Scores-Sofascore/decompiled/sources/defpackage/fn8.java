package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class fn8 extends f6a {
    @Override // defpackage.f6a
    public final void C() {
        R().C();
    }

    @Override // defpackage.f6a
    public void M(rk3 rk3Var, dfb dfbVar) {
        R().M(rk3Var, dfbVar);
    }

    public abstract f6a R();

    @Override // defpackage.f6a
    public o6a l(ejg ejgVar) {
        return R().l(ejgVar);
    }

    @Override // defpackage.f6a
    public final ao2 n() {
        return R().n();
    }

    @Override // defpackage.f6a
    public final ScheduledExecutorService q() {
        return R().q();
    }

    @Override // defpackage.f6a
    public final xx3 r() {
        return R().r();
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(R(), "delegate");
        return I.toString();
    }
}
