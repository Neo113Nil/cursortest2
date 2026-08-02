package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zcc implements wn3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b10 b;
    public final /* synthetic */ lfb c;
    public final /* synthetic */ m6c d;

    public /* synthetic */ zcc(b10 b10Var, lfb lfbVar, m6c m6cVar, int i) {
        this.a = i;
        this.b = b10Var;
        this.c = lfbVar;
        this.d = m6cVar;
    }

    @Override // defpackage.wn3
    public final void accept(Object obj) {
        int i = this.a;
        m6c m6cVar = this.d;
        lfb lfbVar = this.c;
        b10 b10Var = this.b;
        edc edcVar = (edc) obj;
        switch (i) {
            case 0:
                edcVar.i(b10Var.b, (scc) b10Var.c, lfbVar, m6cVar);
                break;
            default:
                edcVar.h(b10Var.b, (scc) b10Var.c, lfbVar, m6cVar);
                break;
        }
    }
}
