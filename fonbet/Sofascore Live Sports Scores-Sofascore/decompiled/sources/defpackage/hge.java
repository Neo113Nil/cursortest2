package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hge extends dfb {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public hge(bfb bfbVar) {
        z1a.y(bfbVar, "result");
        this.b = bfbVar;
    }

    @Override // defpackage.dfb
    public final bfb a(kge kgeVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (bfb) obj;
            default:
                bfb a = ((dfb) obj).a(kgeVar);
                o6a o6aVar = a.a;
                if (o6aVar == null) {
                    return a;
                }
                sm0 B = o6aVar.B();
                return bfb.b(o6aVar, new ywd((twd) B.a.get(axd.o), a.b));
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                en0 en0Var = new en0(hge.class.getSimpleName());
                en0Var.e((bfb) this.b, "result");
                return en0Var.toString();
            default:
                return super.toString();
        }
    }

    public hge(dfb dfbVar) {
        this.b = dfbVar;
    }
}
