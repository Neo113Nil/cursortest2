package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cx2 extends sk0 {
    public final /* synthetic */ xei c;
    public final /* synthetic */ qic d;
    public final /* synthetic */ hcc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx2(hcc hccVar, xei xeiVar, qic qicVar) {
        super(((ex2) hccVar.d).t, 1);
        this.e = hccVar;
        this.c = xeiVar;
        this.d = qicVar;
    }

    @Override // defpackage.sk0
    public final void b() {
        jde.c();
        try {
            jde.a();
            bw9 bw9Var = jde.a;
            bw9Var.getClass();
            d();
            bw9Var.getClass();
        } catch (Throwable th) {
            try {
                jde.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d() {
        xei xeiVar = this.c;
        qic qicVar = this.d;
        xei xeiVar2 = (xei) this.e.c;
        if (xeiVar2 != null) {
            qicVar = new qic();
            xeiVar = xeiVar2;
        }
        ((ex2) this.e.d).y = true;
        try {
            ((c5n) this.e.b).J(xeiVar, qicVar);
            ((ex2) this.e.d).V();
            x6k x6kVar = ((ex2) this.e.d).s;
            if (xeiVar.f()) {
                ((sjb) x6kVar.c).i();
            } else {
                ((sjb) x6kVar.d).i();
            }
        } catch (Throwable th) {
            ((ex2) this.e.d).V();
            x6k x6kVar2 = ((ex2) this.e.d).s;
            if (xeiVar.f()) {
                ((sjb) x6kVar2.c).i();
            } else {
                ((sjb) x6kVar2.d).i();
            }
            throw th;
        }
    }
}
