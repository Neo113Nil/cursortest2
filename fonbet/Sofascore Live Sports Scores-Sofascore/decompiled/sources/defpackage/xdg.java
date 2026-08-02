package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class xdg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ beg b;

    public /* synthetic */ xdg(beg begVar, int i) {
        this.a = i;
        this.b = begVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uag uagVar;
        uag uagVar2;
        int i = this.a;
        beg begVar = this.b;
        switch (i) {
            case 0:
                jeg.d.f(2);
                rz8 rz8Var = begVar.i;
                if (rz8Var != null) {
                    rz8Var.K();
                    break;
                }
                break;
            case 1:
                hdg hdgVar = new hdg(gdg.f, null);
                jeg jegVar = jeg.d;
                hdgVar.toString();
                jegVar.f(4);
                rz8 rz8Var2 = begVar.i;
                if (rz8Var2 != null) {
                    rz8Var2.M(hdgVar);
                    break;
                }
                break;
            case 2:
                hdg hdgVar2 = new hdg(gdg.d, "An interstitial is currently shown on the screen.");
                jeg jegVar2 = jeg.d;
                hdgVar2.toString();
                jegVar2.f(4);
                rz8 rz8Var3 = begVar.i;
                if (rz8Var3 != null) {
                    rz8Var3.M(hdgVar2);
                    break;
                }
                break;
            case 3:
                jeg.d.f(2);
                rz8 rz8Var4 = begVar.i;
                if (rz8Var4 != null) {
                    wdg wdgVar = begVar.d;
                    if (wdgVar == null || (uagVar = wdgVar.getAdInfo()) == null) {
                        lm5 lm5Var = lm5.a;
                        lm5Var.getClass();
                        uagVar = new uag(null, null, null, null, null, lm5Var);
                    }
                    rz8Var4.O(uagVar);
                    break;
                }
                break;
            case 4:
                jeg.d.f(2);
                rz8 rz8Var5 = begVar.i;
                if (rz8Var5 != null) {
                    rz8Var5.L();
                    break;
                }
                break;
            case 5:
                jeg.d.f(2);
                rz8 rz8Var6 = begVar.i;
                if (rz8Var6 != null) {
                    rz8Var6.P();
                    break;
                }
                break;
            default:
                jeg.d.f(2);
                rz8 rz8Var7 = begVar.i;
                if (rz8Var7 != null) {
                    wdg wdgVar2 = begVar.d;
                    if (wdgVar2 == null || (uagVar2 = wdgVar2.getAdInfo()) == null) {
                        lm5 lm5Var2 = lm5.a;
                        lm5Var2.getClass();
                        uagVar2 = new uag(null, null, null, null, null, lm5Var2);
                    }
                    rz8Var7.O(uagVar2);
                    break;
                }
                break;
        }
    }
}
