package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jrb extends f6a {
    public g7h h;
    public final /* synthetic */ qrb i;

    public jrb(qrb qrbVar) {
        this.i = qrbVar;
    }

    @Override // defpackage.f6a
    public final void C() {
        xx3 xx3Var = this.i.m;
        xx3Var.i();
        xx3Var.execute(new b8(this, 26));
    }

    @Override // defpackage.f6a
    public final void M(rk3 rk3Var, dfb dfbVar) {
        xx3 xx3Var = this.i.m;
        xx3Var.i();
        z1a.y(rk3Var, "newState");
        z1a.y(dfbVar, "newPicker");
        xx3Var.execute(new lv4(5, this, dfbVar, rk3Var));
    }

    @Override // defpackage.f6a
    public final o6a l(ejg ejgVar) {
        qrb qrbVar = this.i;
        qrbVar.m.i();
        z1a.D("Channel is being terminated", !qrbVar.H);
        return new prb(qrbVar, ejgVar);
    }

    @Override // defpackage.f6a
    public final ao2 n() {
        return this.i.N;
    }

    @Override // defpackage.f6a
    public final ScheduledExecutorService q() {
        return this.i.g;
    }

    @Override // defpackage.f6a
    public final xx3 r() {
        return this.i.m;
    }
}
