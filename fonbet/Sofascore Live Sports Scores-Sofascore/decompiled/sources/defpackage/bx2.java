package defpackage;

import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bx2 extends sk0 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ hcc d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx2(hcc hccVar, qic qicVar) {
        super(((ex2) hccVar.d).t, 1);
        this.d = hccVar;
        this.e = qicVar;
    }

    @Override // defpackage.sk0
    public final void b() {
        switch (this.c) {
            case 0:
                hcc hccVar = this.d;
                jde.c();
                try {
                    jde.a();
                    jde.a.getClass();
                    if (((xei) hccVar.c) == null) {
                        try {
                            ((c5n) hccVar.b).K((qic) this.e);
                        } catch (Throwable th) {
                            xei h = xei.f.g(th).h("Failed to read headers");
                            hccVar.c = h;
                            ((ex2) hccVar.d).x.l(h);
                        }
                    }
                    jde.a.getClass();
                    return;
                } finally {
                    try {
                        jde.a.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            default:
                jde.c();
                try {
                    jde.a();
                    bw9 bw9Var = jde.a;
                    bw9Var.getClass();
                    d();
                    bw9Var.getClass();
                    return;
                } catch (Throwable th3) {
                    throw th3;
                }
        }
    }

    public void d() {
        cqa cqaVar = (cqa) this.e;
        hcc hccVar = this.d;
        ex2 ex2Var = (ex2) hccVar.d;
        if (((xei) hccVar.c) != null) {
            Logger logger = n49.a;
            while (true) {
                InputStream D = cqaVar.D();
                if (D == null) {
                    return;
                } else {
                    n49.b(D);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream D2 = cqaVar.D();
                    if (D2 == null) {
                        return;
                    }
                    try {
                        ((c5n) hccVar.b).L(ex2Var.p.W(D2));
                        D2.close();
                    } catch (Throwable th) {
                        n49.b(D2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Logger logger2 = n49.a;
                    while (true) {
                        InputStream D3 = cqaVar.D();
                        if (D3 == null) {
                            xei h = xei.f.g(th2).h("Failed to read message.");
                            hccVar.c = h;
                            ex2Var.x.l(h);
                            return;
                        }
                        n49.b(D3);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx2(hcc hccVar, cqa cqaVar) {
        super(((ex2) hccVar.d).t, 1);
        this.d = hccVar;
        this.e = cqaVar;
    }
}
