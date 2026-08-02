package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class frb extends dfb {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public frb(Throwable th) {
        xei g = xei.l.h("Panic! This is a bug!").g(th);
        bfb bfbVar = bfb.e;
        z1a.r("drop status shouldn't be OK", !g.f());
        this.b = new bfb(null, null, g, true);
    }

    @Override // defpackage.dfb
    public final bfb a(kge kgeVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (bfb) obj;
            default:
                return bfb.a((xei) obj);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                en0 en0Var = new en0(frb.class.getSimpleName());
                en0Var.e((bfb) this.b, "panicPickResult");
                return en0Var.toString();
            default:
                return super.toString();
        }
    }

    public frb(xei xeiVar) {
        this.b = xeiVar;
    }
}
