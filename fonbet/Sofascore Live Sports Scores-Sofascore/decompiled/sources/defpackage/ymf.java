package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ymf implements xn3, bt8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zmf b;

    public /* synthetic */ ymf(zmf zmfVar, int i) {
        this.a = i;
        this.b = zmfVar;
    }

    @Override // defpackage.xn3
    public void accept(Object obj) {
        int i = this.a;
        zmf zmfVar = this.b;
        switch (i) {
            case 0:
                zmfVar.c = g0c.a((umf) obj);
                break;
            default:
                zmfVar.c = j0c.a;
                break;
        }
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        umf umfVar = (umf) obj;
        zmf zmfVar = this.b;
        eff effVar = zmfVar.a;
        effVar.getClass();
        return new sa3(new c00(6, effVar, umfVar), 1).a(new ow9(8, zmfVar, umfVar));
    }
}
