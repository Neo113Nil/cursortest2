package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class uk9 extends wk9 {
    public final /* synthetic */ int d;
    public final ch2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk9(u84 u84Var, yg2 yg2Var, qs3 qs3Var, ch2 ch2Var, int i) {
        super(u84Var, yg2Var, qs3Var);
        this.d = i;
        this.e = ch2Var;
    }

    @Override // defpackage.wk9
    public final Object a(dod dodVar, Object[] objArr) {
        int i = this.d;
        ch2 ch2Var = this.e;
        switch (i) {
            case 0:
                return ch2Var.k(dodVar);
            default:
                zg2 zg2Var = (zg2) ch2Var.k(dodVar);
                rq3 rq3Var = (rq3) objArr[objArr.length - 1];
                try {
                    lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
                    lj2Var.t();
                    lj2Var.v(new aka(zg2Var, 2));
                    zg2Var.M(new ny3(lj2Var));
                    Object q = lj2Var.q();
                    lu3 lu3Var = lu3.a;
                    return q;
                } catch (Exception e) {
                    x2a.T(rq3Var, e);
                    return lu3.a;
                }
        }
    }
}
