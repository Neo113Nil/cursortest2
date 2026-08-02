package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ai6 extends nj8 {
    public final /* synthetic */ int o;
    public final /* synthetic */ w0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai6(gi6 gi6Var, pvk pvkVar) {
        super(pvkVar, false, (sl6) null, gi6Var.r, 6);
        this.o = 0;
        this.p = gi6Var;
    }

    @Override // defpackage.r7
    public boolean l(int i, int i2, y21 y21Var) {
        int i3 = this.o;
        w0 w0Var = this.p;
        switch (i3) {
            case 0:
                return ((gi6) w0Var).P(i);
            case 1:
            default:
                return super.l(i, i2, y21Var);
            case 2:
                if (((ehe) w0Var).V(i, y21Var)) {
                    return false;
                }
                return super.l(i, i2, y21Var);
            case 3:
                return ((hnk) w0Var).Y(i);
        }
    }

    @Override // defpackage.nj8
    public void q(int i, int i2, mj8 mj8Var, boolean z) {
        switch (this.o) {
            case 1:
                super.q(i, i2, mj8Var, z);
                ((cs7) this.p).V(((pvk) this.n).t, mj8Var.O.getStartTimestamp());
                break;
            default:
                super.q(i, i2, mj8Var, z);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai6(qzh qzhVar, pvk pvkVar, int i) {
        super(pvkVar, false, (sl6) null, 0, 14);
        this.o = i;
        this.p = qzhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai6(ehe eheVar, pvk pvkVar) {
        super(pvkVar, false, (sl6) null, eheVar.v, 4);
        this.o = 2;
        this.p = eheVar;
    }
}
