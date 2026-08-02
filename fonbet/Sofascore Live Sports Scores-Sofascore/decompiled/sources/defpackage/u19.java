package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u19 extends fn8 {
    public final /* synthetic */ int h = 1;
    public Object i;
    public final /* synthetic */ ffb j;

    public u19(axd axdVar, f6a f6aVar) {
        this.j = axdVar;
        this.i = new z89(f6aVar, 0);
    }

    @Override // defpackage.fn8, defpackage.f6a
    public final void M(rk3 rk3Var, dfb dfbVar) {
        switch (this.h) {
            case 0:
                ffb ffbVar = (ffb) this.i;
                v19 v19Var = (v19) this.j;
                ffb ffbVar2 = v19Var.l;
                rk3 rk3Var2 = rk3.b;
                if (ffbVar != ffbVar2) {
                    if (ffbVar == v19Var.j) {
                        boolean z = rk3Var == rk3Var2;
                        v19Var.o = z;
                        if (!z && ffbVar2 != v19Var.g) {
                            v19Var.B();
                            break;
                        } else {
                            v19Var.h.M(rk3Var, dfbVar);
                            break;
                        }
                    }
                } else {
                    z1a.D("there's pending lb while current lb has been out of READY", v19Var.o);
                    v19Var.m = rk3Var;
                    v19Var.n = dfbVar;
                    if (rk3Var == rk3Var2) {
                        v19Var.B();
                        break;
                    }
                }
                break;
            default:
                ((z89) this.i).M(rk3Var, new hge(dfbVar));
                break;
        }
    }

    @Override // defpackage.fn8
    public final f6a R() {
        switch (this.h) {
            case 0:
                return ((v19) this.j).h;
            default:
                return (z89) this.i;
        }
    }

    @Override // defpackage.fn8, defpackage.f6a
    public o6a l(ejg ejgVar) {
        switch (this.h) {
            case 1:
                axd axdVar = (axd) this.j;
                wp4 wp4Var = axdVar.g;
                zwd zwdVar = new zwd(axdVar, ejgVar, (z89) this.i);
                List list = (List) ejgVar.c;
                if (axd.A(list) && wp4Var.containsKey(((sp5) list.get(0)).a.get(0))) {
                    twd twdVar = (twd) wp4Var.get(((sp5) list.get(0)).a.get(0));
                    twdVar.a(zwdVar);
                    if (twdVar.d != null) {
                        zwdVar.T();
                    }
                }
                return zwdVar;
            default:
                return super.l(ejgVar);
        }
    }

    public u19(v19 v19Var) {
        this.j = v19Var;
    }
}
