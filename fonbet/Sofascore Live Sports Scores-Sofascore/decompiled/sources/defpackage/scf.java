package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class scf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ddf b;

    public /* synthetic */ scf(ddf ddfVar, int i) {
        this.a = i;
        this.b = ddfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ddf ddfVar = this.b;
        switch (i) {
            case 0:
                ddfVar.L = true;
                break;
            case 1:
                ddfVar.n();
                break;
            default:
                if (!ddfVar.R) {
                    u6c u6cVar = ddfVar.s;
                    u6cVar.getClass();
                    u6cVar.b(ddfVar);
                    break;
                }
                break;
        }
    }
}
