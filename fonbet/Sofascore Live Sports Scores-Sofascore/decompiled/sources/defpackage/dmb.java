package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class dmb implements fmb {
    public final /* synthetic */ gmb a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ dmb(gmb gmbVar, int i, int i2) {
        this.a = gmbVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.fmb
    public final void run() {
        gmb gmbVar = this.a;
        plb plbVar = gmbVar.a;
        int i = this.b;
        int i2 = this.c;
        if (plbVar == null) {
            gmbVar.f.add(new dmb(gmbVar, i, i2));
        } else {
            gmbVar.b.j(i, i2 + 0.99f);
        }
    }
}
