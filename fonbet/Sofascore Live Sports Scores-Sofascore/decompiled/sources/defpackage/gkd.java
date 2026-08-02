package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class gkd extends tz9 {
    public final tz9 h;
    public final /* synthetic */ int i;
    public final Object j;

    public gkd(tz9 tz9Var, Object obj, int i) {
        this.i = i;
        this.h = tz9Var;
        this.j = obj;
    }

    @Override // defpackage.tz9
    public final void O(rkd rkdVar) {
        int i = this.i;
        tz9 tz9Var = this.h;
        Object obj = this.j;
        switch (i) {
            case 0:
                tz9Var.N(new fkd(rkdVar, (xmf) obj, 0));
                break;
            case 1:
                tz9Var.N(new fkd(rkdVar, (bt8) obj, 1));
                break;
            default:
                en0 en0Var = new en0(rkdVar, (kkd) obj);
                rkdVar.a((cm5) en0Var.e);
                tz9Var.N(en0Var);
                break;
        }
    }
}
