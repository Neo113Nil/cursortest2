package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sj3 implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fdi b;

    public /* synthetic */ sj3(fdi fdiVar, int i) {
        this.a = i;
        this.b = fdiVar;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        int i = this.a;
        fdi fdiVar = this.b;
        switch (i) {
            case 0:
                fdiVar.collect(new vj0(b98Var, 3), rq3Var);
                break;
            case 1:
                fdiVar.collect(new vj0(b98Var, 4), rq3Var);
                break;
            case 2:
                fdiVar.collect(new vj0(b98Var, 16), rq3Var);
                break;
            default:
                fdiVar.collect(new vj0(b98Var, 17), rq3Var);
                break;
        }
        return lu3.a;
    }
}
