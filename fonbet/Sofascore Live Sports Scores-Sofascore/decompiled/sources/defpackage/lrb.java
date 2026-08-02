package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lrb extends mn2 {
    public final /* synthetic */ nrb a;

    public lrb(nrb nrbVar) {
        this.a = nrbVar;
    }

    @Override // defpackage.mn2
    public final String e() {
        return this.a.b;
    }

    @Override // defpackage.mn2
    public final wkn f(ujg ujgVar, jh2 jh2Var) {
        qrb qrbVar = this.a.d;
        Logger logger = qrb.c0;
        Executor executor = jh2Var.b;
        if (executor == null) {
            executor = qrbVar.h;
        }
        ex2 ex2Var = new ex2(ujgVar, executor, jh2Var, qrbVar.Z, qrbVar.I ? null : this.a.d.f.a.d, this.a.d.L);
        ex2Var.D = this.a.d.n;
        return ex2Var;
    }
}
