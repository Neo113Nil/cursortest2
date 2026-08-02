package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class wcc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bc5 b;
    public final /* synthetic */ ddc c;
    public final /* synthetic */ kfb d;
    public final /* synthetic */ l6c e;

    public /* synthetic */ wcc(bc5 bc5Var, ddc ddcVar, kfb kfbVar, l6c l6cVar, int i) {
        this.a = i;
        this.b = bc5Var;
        this.c = ddcVar;
        this.d = kfbVar;
        this.e = l6cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        l6c l6cVar = this.e;
        kfb kfbVar = this.d;
        ddc ddcVar = this.c;
        bc5 bc5Var = this.b;
        switch (i) {
            case 0:
                ddcVar.k(bc5Var.a, bc5Var.b, kfbVar, l6cVar);
                break;
            case 1:
                ddcVar.a(bc5Var.a, bc5Var.b, kfbVar, l6cVar);
                break;
            default:
                ddcVar.v(bc5Var.a, bc5Var.b, kfbVar, l6cVar);
                break;
        }
    }
}
