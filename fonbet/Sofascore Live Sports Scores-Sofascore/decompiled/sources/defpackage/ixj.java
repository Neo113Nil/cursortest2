package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ixj extends exj {
    public final /* synthetic */ int a;
    public xwj b;

    public /* synthetic */ ixj(xwj xwjVar, int i) {
        this.a = i;
        this.b = xwjVar;
    }

    @Override // defpackage.exj, defpackage.wwj
    public void d(xwj xwjVar) {
        switch (this.a) {
            case 0:
                jxj jxjVar = (jxj) this.b;
                jxjVar.E.remove(xwjVar);
                if (!jxjVar.s()) {
                    jxjVar.x(jxjVar, ogj.d, false);
                    jxjVar.r = true;
                    jxjVar.x(jxjVar, ogj.c, false);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.exj, defpackage.wwj
    public void e(xwj xwjVar) {
        switch (this.a) {
            case 1:
                jxj jxjVar = (jxj) this.b;
                int i = jxjVar.G - 1;
                jxjVar.G = i;
                if (i == 0) {
                    jxjVar.H = false;
                    jxjVar.m();
                }
                xwjVar.A(this);
                break;
            case 2:
                this.b.D();
                xwjVar.A(this);
                break;
        }
    }

    @Override // defpackage.exj, defpackage.wwj
    public void f(xwj xwjVar) {
        switch (this.a) {
            case 1:
                jxj jxjVar = (jxj) this.b;
                if (!jxjVar.H) {
                    jxjVar.N();
                    jxjVar.H = true;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ixj() {
        this.a = 1;
    }
}
