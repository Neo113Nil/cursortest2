package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bi6 extends nj8 {
    public final /* synthetic */ int o = 1;
    public final /* synthetic */ w0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi6(cs7 cs7Var, qvk qvkVar) {
        super(qvkVar, false, (sl6) null, 0, 14);
        this.p = cs7Var;
    }

    @Override // defpackage.r7
    public boolean l(int i, int i2, y21 y21Var) {
        int i3 = this.o;
        w0 w0Var = this.p;
        switch (i3) {
            case 2:
                if (!((ehe) w0Var).V(i, y21Var)) {
                    break;
                }
                break;
        }
        return super.l(i, i2, y21Var);
    }

    @Override // defpackage.nj8
    public void r(int i, int i2, n5j n5jVar, boolean z) {
        switch (this.o) {
            case 1:
                super.r(i, i2, n5jVar, z);
                ((cs7) this.p).V(((qvk) this.n).t, n5jVar.O.getStartTimestamp());
                break;
            default:
                super.r(i, i2, n5jVar, z);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi6(gi6 gi6Var, qvk qvkVar) {
        super(qvkVar, false, (sl6) null, gi6Var.r, 6);
        this.p = gi6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi6(ehe eheVar, qvk qvkVar) {
        super(qvkVar, false, (sl6) null, eheVar.v, 4);
        this.p = eheVar;
    }
}
