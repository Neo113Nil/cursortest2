package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zlb implements fmb {
    public final /* synthetic */ int a;
    public final /* synthetic */ gmb b;
    public final /* synthetic */ String c;

    public /* synthetic */ zlb(gmb gmbVar, String str, int i) {
        this.a = i;
        this.b = gmbVar;
        this.c = str;
    }

    @Override // defpackage.fmb
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r(this.c);
                break;
            case 1:
                this.b.q(this.c);
                break;
            default:
                this.b.t(this.c);
                break;
        }
    }
}
