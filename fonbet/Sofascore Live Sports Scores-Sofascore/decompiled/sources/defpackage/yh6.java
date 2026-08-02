package defpackage;

import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yh6 extends ir1 {
    public final /* synthetic */ int p = 1;
    public final /* synthetic */ w0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh6(ehe eheVar, j22 j22Var) {
        super(j22Var, false, (sl6) null, eheVar.t, eheVar.v, 4);
        this.q = eheVar;
    }

    @Override // defpackage.r7
    public boolean l(int i, int i2, y21 y21Var) {
        int i3 = this.p;
        w0 w0Var = this.q;
        switch (i3) {
            case 2:
                if (!((ehe) w0Var).V(i, y21Var)) {
                    break;
                }
                break;
        }
        return super.l(i, i2, y21Var);
    }

    @Override // defpackage.ir1
    public void q(int i, int i2, y21 y21Var, boolean z) {
        switch (this.p) {
            case 1:
                super.q(i, i2, y21Var, z);
                ((cs7) this.q).V((TextView) ((j22) this.o).g, y21Var.d().getStartTimestamp());
                break;
            default:
                super.q(i, i2, y21Var, z);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh6(gi6 gi6Var, j22 j22Var) {
        super(j22Var, false, (sl6) null, true, gi6Var.r, 6);
        this.q = gi6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh6(cs7 cs7Var, j22 j22Var) {
        super(j22Var, false, (sl6) null, true, 0, 22);
        this.q = cs7Var;
    }
}
