package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class yb5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cc5 b;
    public final /* synthetic */ ec5 c;

    public /* synthetic */ yb5(cc5 cc5Var, ec5 ec5Var, int i) {
        this.a = i;
        this.b = cc5Var;
        this.c = ec5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ec5 ec5Var = this.c;
        cc5 cc5Var = this.b;
        switch (i) {
            case 0:
                ec5Var.j(cc5Var.a, cc5Var.b);
                break;
            default:
                ec5Var.e(cc5Var.a, cc5Var.b);
                break;
        }
    }
}
