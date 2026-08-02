package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class zbg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fcg b;

    public /* synthetic */ zbg(fcg fcgVar, int i) {
        this.a = i;
        this.b = fcgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        fcg fcgVar = this.b;
        switch (i) {
            case 0:
                hdg hdgVar = new hdg(gdg.f, null);
                jeg jegVar = jeg.d;
                hdgVar.toString();
                jegVar.f(4);
                bcg bcgVar = fcgVar.a;
                if (bcgVar != null) {
                    ((k11) bcgVar).a(hdgVar);
                    break;
                }
                break;
            case 1:
                hdg hdgVar2 = new hdg(gdg.g, null);
                jeg jegVar2 = jeg.d;
                hdgVar2.toString();
                jegVar2.f(4);
                bcg bcgVar2 = fcgVar.a;
                if (bcgVar2 != null) {
                    ((k11) bcgVar2).a(hdgVar2);
                    break;
                }
                break;
            case 2:
                fcgVar.getBannerListener();
                break;
            case 3:
                fcgVar.getBannerListener();
                break;
            case 4:
                jeg.d.f(2);
                bcg bannerListener = fcgVar.getBannerListener();
                if (bannerListener != null) {
                    k11 k11Var = (k11) bannerListener;
                    u11 u11Var = k11Var.b;
                    kf kfVar = u11Var.o;
                    if (kfVar != null) {
                        kfVar.invoke();
                    }
                    nv.i(u11Var.b, u11Var.C, k11Var.c.d, ru.EQUATIV, String.valueOf(k11Var.d.b), null, null, 96);
                    break;
                }
                break;
            case 5:
                fcgVar.getBannerListener();
                break;
            default:
                fcgVar.getBannerListener();
                break;
        }
    }
}
