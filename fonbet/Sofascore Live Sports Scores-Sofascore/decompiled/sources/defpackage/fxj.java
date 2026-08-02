package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fxj extends exj {
    public final /* synthetic */ dh0 a;
    public final /* synthetic */ gxj b;

    public fxj(gxj gxjVar, dh0 dh0Var) {
        this.b = gxjVar;
        this.a = dh0Var;
    }

    @Override // defpackage.exj, defpackage.wwj
    public final void e(xwj xwjVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(xwjVar);
        xwjVar.A(this);
    }
}
