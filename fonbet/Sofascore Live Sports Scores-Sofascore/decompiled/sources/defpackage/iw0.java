package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iw0 implements ll6 {
    public final /* synthetic */ int a;
    public final j9e b;
    public final nih c;

    public iw0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new j9e(4);
                this.c = new nih(-1, -1, "image/webp");
                break;
            default:
                this.b = new j9e(4);
                this.c = new nih(-1, -1, "image/avif");
                break;
        }
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        int i = this.a;
        j9e j9eVar = this.b;
        switch (i) {
            case 0:
                bp4 bp4Var = (bp4) nl6Var;
                bp4Var.c(4, false);
                j9eVar.K(4);
                bp4Var.peekFully(j9eVar.a, 0, 4, false);
                if (j9eVar.C() == 1718909296) {
                    j9eVar.K(4);
                    bp4Var.peekFully(j9eVar.a, 0, 4, false);
                    if (j9eVar.C() == 1635150182) {
                    }
                }
                break;
            default:
                j9eVar.K(4);
                bp4 bp4Var2 = (bp4) nl6Var;
                bp4Var2.peekFully(j9eVar.a, 0, 4, false);
                if (j9eVar.C() == 1380533830) {
                    bp4Var2.c(4, false);
                    j9eVar.K(4);
                    bp4Var2.peekFully(j9eVar.a, 0, 4, false);
                    if (j9eVar.C() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.ll6
    public final int b(nl6 nl6Var, b78 b78Var) {
        int i = this.a;
        nih nihVar = this.c;
        switch (i) {
        }
        return nihVar.b(nl6Var, b78Var);
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        int i = this.a;
        nih nihVar = this.c;
        switch (i) {
            case 0:
                nihVar.e(pl6Var);
                break;
            default:
                nihVar.e(pl6Var);
                break;
        }
    }

    @Override // defpackage.ll6
    public final void release() {
        int i = this.a;
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        int i = this.a;
        nih nihVar = this.c;
        switch (i) {
            case 0:
                nihVar.seek(j, j2);
                break;
            default:
                nihVar.seek(j, j2);
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }
}
