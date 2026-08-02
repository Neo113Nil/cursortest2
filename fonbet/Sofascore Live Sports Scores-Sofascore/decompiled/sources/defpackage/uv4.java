package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uv4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ rv4 c;

    public /* synthetic */ uv4(rv4 rv4Var, int i, int i2) {
        this.a = i2;
        this.c = rv4Var;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        rv4 rv4Var = this.c;
        switch (i) {
            case 0:
                rv4Var.c.m(i2);
                break;
            default:
                rv4Var.c.d(i2);
                break;
        }
    }
}
