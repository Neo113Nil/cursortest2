package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l0c extends q5 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0c(g0c g0cVar, Object obj, int i) {
        super(g0cVar);
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.g0c
    public final void c(w0c w0cVar) {
        int i = this.b;
        Object obj = this.c;
        g0c g0cVar = this.a;
        switch (i) {
            case 0:
                g0cVar.b(new k0c(w0cVar, (k3f) obj, 0));
                break;
            case 1:
                g0cVar.b(new v0c(w0cVar, (gsg) obj));
                break;
            default:
                g0cVar.b(new na3(5, w0cVar, (g0c) obj));
                break;
        }
    }
}
