package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class xmf implements bt8, k3f {
    public final /* synthetic */ int a;
    public final /* synthetic */ zmf b;
    public final /* synthetic */ wu0 c;

    public /* synthetic */ xmf(zmf zmfVar, wu0 wu0Var, int i) {
        this.a = i;
        this.b = zmfVar;
        this.c = wu0Var;
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        int i = this.a;
        wu0 wu0Var = this.c;
        zmf zmfVar = this.b;
        umf umfVar = (umf) obj;
        zmfVar.getClass();
        switch (i) {
            case 0:
                wu0Var.getClass();
                rmf i2 = umfVar.i(zmfVar.b());
                rha.x(i2, "item is null");
                gkd gkdVar = new gkd(new kkd(i2), new xmf(zmfVar, wu0Var, 1), 0);
                rmf b = zmfVar.b();
                rha.x(b, "item is null");
                return new oa3(3, new gkd(new gkd(gkdVar, new kkd(b), 2), new ow9(7, umfVar, wu0Var), 1), new ymf(zmfVar, 2));
            default:
                wu0Var.getClass();
                return umfVar.i(zmfVar.b());
        }
    }

    @Override // defpackage.k3f
    public boolean test(Object obj) {
        int i = this.a;
        wu0 wu0Var = this.c;
        zmf zmfVar = this.b;
        rmf rmfVar = (rmf) obj;
        switch (i) {
            case 1:
                zmfVar.b.getClass();
                long currentTimeMillis = System.currentTimeMillis() - rmfVar.i();
                wu0Var.getClass();
                return !(currentTimeMillis > 86400000);
            default:
                zmfVar.b.getClass();
                long currentTimeMillis2 = System.currentTimeMillis() - rmfVar.i();
                wu0Var.getClass();
                return currentTimeMillis2 > 86400000 || rmfVar.getValue() < 1;
        }
    }
}
