package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class or3 implements z88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aeh b;

    public /* synthetic */ or3(aeh aehVar, int i) {
        this.a = i;
        this.b = aehVar;
    }

    @Override // defpackage.z88
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        int i = this.a;
        aeh aehVar = this.b;
        switch (i) {
            case 0:
                aehVar.collect(new vj0(b98Var, 5), rq3Var);
                break;
            default:
                aehVar.collect(new vj0(b98Var, 8), rq3Var);
                break;
        }
        return lu3.a;
    }
}
