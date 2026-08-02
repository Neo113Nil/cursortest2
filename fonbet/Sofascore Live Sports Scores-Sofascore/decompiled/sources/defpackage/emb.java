package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class emb implements fmb {
    public final /* synthetic */ int a;
    public final /* synthetic */ gmb b;

    public /* synthetic */ emb(gmb gmbVar, int i) {
        this.a = i;
        this.b = gmbVar;
    }

    @Override // defpackage.fmb
    public final void run() {
        int i = this.a;
        gmb gmbVar = this.b;
        switch (i) {
            case 0:
                gmbVar.m();
                break;
            default:
                gmbVar.k();
                break;
        }
    }
}
