package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b6g extends ffb {
    public final /* synthetic */ d6g g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6g(d6g d6gVar, int i) {
        super(i, 7);
        this.g = d6gVar;
    }

    @Override // defpackage.ffb
    public final void r(rr8 rr8Var) {
        this.g.c(new cni(rr8Var));
    }

    @Override // defpackage.ffb
    public final void s(rr8 rr8Var, int i, int i2) {
        v(rr8Var, i, i2);
    }

    @Override // defpackage.ffb
    public final void t(rr8 rr8Var) {
        cni cniVar = new cni(rr8Var);
        d6g d6gVar = this.g;
        d6gVar.e(cniVar);
        d6gVar.h = rr8Var;
    }

    @Override // defpackage.ffb
    public final void v(rr8 rr8Var, int i, int i2) {
        this.g.d(new cni(rr8Var), i, i2);
    }
}
