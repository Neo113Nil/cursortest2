package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xy1 implements ll6 {
    public final /* synthetic */ int a;
    public final ll6 b;

    public xy1(byte b, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new nih(35152, 2, "image/png");
                break;
            default:
                this.b = new nih(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        int i = this.a;
        ll6 ll6Var = this.b;
        switch (i) {
            case 0:
                return ((nih) ll6Var).a(nl6Var);
            case 1:
                return ((nih) ll6Var).a(nl6Var);
            default:
                return ll6Var.a(nl6Var);
        }
    }

    @Override // defpackage.ll6
    public final int b(nl6 nl6Var, b78 b78Var) {
        int i = this.a;
        ll6 ll6Var = this.b;
        switch (i) {
            case 0:
                return ((nih) ll6Var).b(nl6Var, b78Var);
            case 1:
                return ((nih) ll6Var).b(nl6Var, b78Var);
            default:
                return ll6Var.b(nl6Var, b78Var);
        }
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        int i = this.a;
        ll6 ll6Var = this.b;
        switch (i) {
            case 0:
                ((nih) ll6Var).e(pl6Var);
                break;
            case 1:
                ((nih) ll6Var).e(pl6Var);
                break;
            default:
                ll6Var.e(pl6Var);
                break;
        }
    }

    @Override // defpackage.ll6
    public final void release() {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                this.b.release();
                break;
        }
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        int i = this.a;
        ll6 ll6Var = this.b;
        switch (i) {
            case 0:
                ((nih) ll6Var).seek(j, j2);
                break;
            case 1:
                ((nih) ll6Var).seek(j, j2);
                break;
            default:
                ll6Var.seek(j, j2);
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    public xy1(int i) {
        this.a = 2;
        if ((i & 1) != 0) {
            this.b = new nih(65496, 2, "image/jpeg");
        } else {
            this.b = new wea();
        }
    }
}
