package defpackage;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ln6 extends uxf {
    public boolean E;
    public final xei F;
    public final zx2 G;
    public final cy2[] H;

    public ln6(xei xeiVar, zx2 zx2Var, cy2[] cy2VarArr) {
        super(5);
        z1a.r("error must not be OK", !xeiVar.f());
        this.F = xeiVar;
        this.G = zx2Var;
        this.H = cy2VarArr;
    }

    @Override // defpackage.uxf, defpackage.yx2
    public final void w(ay2 ay2Var) {
        z1a.D("already started", !this.E);
        this.E = true;
        cy2[] cy2VarArr = this.H;
        int length = cy2VarArr.length;
        int i = 0;
        while (true) {
            xei xeiVar = this.F;
            if (i >= length) {
                ay2Var.z(xeiVar, this.G, new qic());
                return;
            } else {
                cy2VarArr[i].m(xeiVar);
                i++;
            }
        }
    }

    @Override // defpackage.uxf, defpackage.yx2
    public final void x(zl1 zl1Var) {
        zl1Var.i(this.F, "error");
        zl1Var.i(this.G, NotificationCompat.CATEGORY_PROGRESS);
    }
}
