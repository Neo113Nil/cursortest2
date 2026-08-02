package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m8a extends t01 {
    public final /* synthetic */ int c;
    public final /* synthetic */ e8a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m8a(e8a e8aVar, int i) {
        super(5);
        this.c = i;
        this.d = e8aVar;
    }

    @Override // defpackage.t01
    public final void B() {
        int i = this.c;
        e8a e8aVar = this.d;
        switch (i) {
            case 0:
                t8a t8aVar = (t8a) e8aVar;
                ((prb) t8aVar.d.c).p.Y.N(t8aVar, true);
                break;
            case 1:
                ((qrb) e8aVar).g();
                break;
            default:
                ((ood) e8aVar).h.p(true);
                break;
        }
    }

    @Override // defpackage.t01
    public final void C() {
        int i = this.c;
        e8a e8aVar = this.d;
        switch (i) {
            case 0:
                t8a t8aVar = (t8a) e8aVar;
                ((prb) t8aVar.d.c).p.Y.N(t8aVar, false);
                break;
            case 1:
                qrb qrbVar = (qrb) e8aVar;
                if (!qrbVar.G.get()) {
                    qrbVar.j();
                    break;
                }
                break;
            default:
                ((ood) e8aVar).h.p(false);
                break;
        }
    }
}
