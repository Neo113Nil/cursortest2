package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q3g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1d b;

    public /* synthetic */ q3g(int i, k1d k1dVar) {
        this.a = i;
        this.b = k1dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        k1d k1dVar = this.b;
        switch (i) {
            case 0:
                grb grbVar = (grb) k1dVar.c;
                grbVar.z = true;
                ay2 ay2Var = grbVar.u;
                sx2 sx2Var = grbVar.s;
                ay2Var.z((xei) sx2Var.a, (zx2) sx2Var.b, (qic) sx2Var.c);
                break;
            default:
                grb grbVar2 = (grb) k1dVar.c;
                if (!grbVar2.z) {
                    grbVar2.u.B();
                    break;
                }
                break;
        }
    }
}
