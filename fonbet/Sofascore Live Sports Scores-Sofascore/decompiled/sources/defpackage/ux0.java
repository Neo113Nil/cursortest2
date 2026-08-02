package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ux0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ux0(f7b f7bVar, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zd3 zd3Var = (zd3) obj;
                ((px0) zd3Var.a).f(false);
                ((ox0) zd3Var.b).g(false);
                break;
            case 1:
                e1d e1dVar = (e1d) obj;
                ale aleVar = (ale) e1dVar.getValue();
                if (aleVar != null) {
                    aleVar.release();
                }
                e1dVar.setValue(null);
                break;
            default:
                ((te3) obj).G(false);
                break;
        }
    }
}
