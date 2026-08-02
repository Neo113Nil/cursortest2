package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xj4 extends d3 {
    public final /* synthetic */ int a;
    public final of2 b;

    public /* synthetic */ xj4(of2 of2Var, int i) {
        this.a = i;
        this.b = of2Var;
    }

    @Override // defpackage.d3
    public final of2 a() {
        int i = this.a;
        return this.b;
    }

    @Override // defpackage.d3
    public final bt3 b() {
        switch (this.a) {
            case 0:
                return zj4.a;
            default:
                return nnl.a;
        }
    }

    @Override // defpackage.d3
    public final Object d(bt3 bt3Var) {
        switch (this.a) {
            case 0:
                vj4 vj4Var = (vj4) bt3Var;
                vj4Var.getClass();
                return new uj4(vj4Var);
            default:
                q0a q0aVar = (q0a) bt3Var;
                q0aVar.getClass();
                Integer num = q0aVar.a;
                nnl.a(num, "year");
                int intValue = num.intValue();
                Integer num2 = q0aVar.b;
                nnl.a(num2, "monthNumber");
                return new hnl(intValue, num2.intValue());
        }
    }
}
