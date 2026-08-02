package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p0c extends q5 {
    public final /* synthetic */ int b;
    public final bt8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0c(g0c g0cVar, bt8 bt8Var, int i) {
        super(g0cVar);
        this.b = i;
        this.c = bt8Var;
    }

    @Override // defpackage.g0c
    public final void c(w0c w0cVar) {
        int i = this.b;
        bt8 bt8Var = this.c;
        g0c g0cVar = this.a;
        switch (i) {
            case 0:
                g0cVar.b(new o0c(w0cVar, bt8Var));
                break;
            case 1:
                g0cVar.b(new za3(w0cVar, bt8Var, 1));
                break;
            default:
                g0cVar.b(new na3(3, w0cVar, bt8Var));
                break;
        }
    }
}
