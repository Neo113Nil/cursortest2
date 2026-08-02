package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v48 extends ode {
    public final qv8 c;

    public v48(qv8 qv8Var) {
        this.c = qv8Var;
    }

    @Override // defpackage.ode
    public final boolean a() {
        qv8 qv8Var = this.c;
        if (!qv8Var.hasSessionId()) {
            return false;
        }
        if (qv8Var.k() > 0 || qv8Var.j() > 0) {
            return true;
        }
        return qv8Var.n() && qv8Var.m().i();
    }
}
