package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ai2 implements qh2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lj2 b;

    public /* synthetic */ ai2(lj2 lj2Var, int i) {
        this.a = i;
        this.b = lj2Var;
    }

    @Override // defpackage.qh2
    public final void onFailure(ah2 ah2Var, IOException iOException) {
        int i = this.a;
        lj2 lj2Var = this.b;
        switch (i) {
            case 0:
                p2g p2gVar = w2g.b;
                lj2Var.resumeWith(new u2g(iOException));
                break;
            default:
                p2g p2gVar2 = w2g.b;
                lj2Var.resumeWith(new u2g(iOException));
                break;
        }
    }

    @Override // defpackage.qh2
    public final void onResponse(ah2 ah2Var, d2g d2gVar) {
        int i = this.a;
        lj2 lj2Var = this.b;
        switch (i) {
            case 0:
                lj2Var.i(d2gVar, zh2.b);
                break;
            default:
                lj2Var.i(d2gVar, zh2.f);
                break;
        }
    }
}
