package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r53 implements nf {
    public final /* synthetic */ pkk a;
    public final /* synthetic */ u53 b;

    public r53(pkk pkkVar, u53 u53Var) {
        this.a = pkkVar;
        this.b = u53Var;
    }

    @Override // defpackage.nf
    public final void onAdEvent(zf zfVar) {
        zfVar.getClass();
        if (zfVar == zf.c) {
            this.a.q();
        }
    }

    @Override // defpackage.pcd
    public final void onError(qcd qcdVar) {
        b6a.p((olk) this.b.c, 16);
        this.a.r(new qcd(4, "Error rendering static web companion", qcdVar));
    }
}
