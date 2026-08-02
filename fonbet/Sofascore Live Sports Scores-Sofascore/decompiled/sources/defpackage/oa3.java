package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oa3 extends ma3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ oa3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ma3
    public final void d(ya3 ya3Var) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ma3) obj2).c(new na3(0, ya3Var, (ma3) obj));
                break;
            case 1:
                bb3 bb3Var = new bb3(ya3Var, (is8) obj);
                ya3Var.a(bb3Var);
                ((ab3) obj2).c(bb3Var);
                break;
            case 2:
                na3 na3Var = new na3(1, ya3Var, (bt8) obj);
                ya3Var.a(na3Var);
                ((g0c) obj2).b(na3Var);
                break;
            default:
                ((gkd) obj2).N(new hkd(ya3Var, (ymf) obj));
                break;
        }
    }
}
