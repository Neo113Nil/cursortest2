package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cmb implements fmb {
    public final /* synthetic */ int a;
    public final /* synthetic */ gmb b;
    public final /* synthetic */ float c;

    public /* synthetic */ cmb(gmb gmbVar, float f, int i) {
        this.a = i;
        this.b = gmbVar;
        this.c = f;
    }

    @Override // defpackage.fmb
    public final void run() {
        int i = this.a;
        float f = this.c;
        gmb gmbVar = this.b;
        switch (i) {
            case 0:
                plb plbVar = gmbVar.a;
                if (plbVar != null) {
                    smb smbVar = gmbVar.b;
                    smbVar.j(smbVar.j, pkc.f(plbVar.l, plbVar.m, f));
                    break;
                } else {
                    gmbVar.f.add(new cmb(gmbVar, f, 0));
                    break;
                }
            case 1:
                plb plbVar2 = gmbVar.a;
                if (plbVar2 != null) {
                    gmbVar.s((int) pkc.f(plbVar2.l, plbVar2.m, f));
                    break;
                } else {
                    gmbVar.f.add(new cmb(gmbVar, f, 1));
                    break;
                }
            default:
                gmbVar.u(f);
                break;
        }
    }
}
