package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class amb implements fmb {
    public final /* synthetic */ int a;
    public final /* synthetic */ gmb b;
    public final /* synthetic */ int c;

    public /* synthetic */ amb(gmb gmbVar, int i, int i2) {
        this.a = i2;
        this.b = gmbVar;
        this.c = i;
    }

    @Override // defpackage.fmb
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        gmb gmbVar = this.b;
        switch (i) {
            case 0:
                gmbVar.p(i2);
                break;
            case 1:
                gmbVar.s(i2);
                break;
            default:
                gmbVar.o(i2);
                break;
        }
    }
}
