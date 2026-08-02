package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class wz8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ql5 b;
    public final /* synthetic */ int c;

    public /* synthetic */ wz8(ql5 ql5Var, int i, int i2) {
        this.a = i2;
        this.b = ql5Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        ql5 ql5Var = this.b;
        switch (i) {
            case 0:
                obc obcVar = ((yz8) ((ejg) ql5Var.g).d).d;
                if (obcVar != null) {
                    obcVar.j(i2);
                    break;
                }
                break;
            default:
                obc obcVar2 = ((yz8) ((ejg) ql5Var.g).d).d;
                if (obcVar2 != null) {
                    obcVar2.k(i2);
                    break;
                }
                break;
        }
    }
}
