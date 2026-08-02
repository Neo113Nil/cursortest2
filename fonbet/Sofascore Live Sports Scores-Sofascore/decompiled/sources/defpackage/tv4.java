package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tv4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv4 b;

    public /* synthetic */ tv4(rv4 rv4Var, int i) {
        this.a = i;
        this.b = rv4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        rv4 rv4Var = this.b;
        switch (i) {
            case 0:
                rv4Var.c.H();
                break;
            case 1:
                rv4Var.c.o();
                break;
            case 2:
                rv4Var.b();
                break;
            case 3:
                rv4Var.c.flush();
                break;
            default:
                rv4Var.c.t();
                break;
        }
    }
}
