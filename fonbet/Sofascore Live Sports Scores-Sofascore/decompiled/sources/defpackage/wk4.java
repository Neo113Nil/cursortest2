package defpackage;

import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wk4 extends ir1 {
    public final /* synthetic */ int p;
    public final /* synthetic */ w0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk4(gi6 gi6Var, bcb bcbVar) {
        super(bcbVar, false, false, (sl6) null, gi6Var.r, 14);
        this.p = 1;
        this.q = gi6Var;
    }

    @Override // defpackage.r7
    public boolean l(int i, int i2, y21 y21Var) {
        int i3 = this.p;
        w0 w0Var = this.q;
        switch (i3) {
            case 1:
                return ((gi6) w0Var).P(i);
            case 2:
            default:
                return super.l(i, i2, y21Var);
            case 3:
                if (((ehe) w0Var).V(i, y21Var)) {
                    return false;
                }
                return super.l(i, i2, y21Var);
            case 4:
                return ((hnk) w0Var).Y(i);
        }
    }

    @Override // defpackage.ir1
    public void q(int i, int i2, y21 y21Var, boolean z) {
        int i3 = this.p;
        w0 w0Var = this.q;
        switch (i3) {
            case 0:
                y21Var.M = false;
                y21Var.n = i == b.i(((xk4) w0Var).i);
                super.q(i, i2, y21Var, z);
                break;
            case 1:
            default:
                super.q(i, i2, y21Var, z);
                break;
            case 2:
                super.q(i, i2, y21Var, z);
                ((cs7) w0Var).V(((bcb) this.o).G, y21Var.d().getStartTimestamp());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk4(qzh qzhVar, bcb bcbVar, int i) {
        super(bcbVar, false, false, (sl6) null, 0, 30);
        this.p = i;
        this.q = qzhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk4(ehe eheVar, bcb bcbVar) {
        super(bcbVar, false, false, (sl6) null, eheVar.v, 12);
        this.p = 3;
        this.q = eheVar;
    }
}
