package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qwf implements mmb {
    public final /* synthetic */ int a;
    public final /* synthetic */ lj2 b;

    public /* synthetic */ qwf(lj2 lj2Var, int i) {
        this.a = i;
        this.b = lj2Var;
    }

    @Override // defpackage.mmb
    public final void onResult(Object obj) {
        int i = this.a;
        lj2 lj2Var = this.b;
        switch (i) {
            case 0:
                if (!lj2Var.x()) {
                    p2g p2gVar = w2g.b;
                    lj2Var.resumeWith(obj);
                    break;
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (!lj2Var.x()) {
                    p2g p2gVar2 = w2g.b;
                    th.getClass();
                    lj2Var.resumeWith(new u2g(th));
                    break;
                }
                break;
        }
    }
}
