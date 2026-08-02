package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z89 extends fn8 {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ z89(Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // defpackage.fn8, defpackage.f6a
    public void M(rk3 rk3Var, dfb dfbVar) {
        switch (this.h) {
            case 1:
                nxc nxcVar = (nxc) this.i;
                j7g j7gVar = nxcVar.g;
                if (j7gVar.g.containsKey(nxcVar.a)) {
                    nxcVar.d = rk3Var;
                    nxcVar.e = dfbVar;
                    if (!nxcVar.f && !j7gVar.i) {
                        if (rk3Var == rk3.d) {
                            nxcVar.b.y();
                        }
                        j7gVar.D();
                        break;
                    }
                }
                break;
            default:
                super.M(rk3Var, dfbVar);
                break;
        }
    }

    @Override // defpackage.fn8
    public final f6a R() {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                return (f6a) obj;
            default:
                return ((nxc) obj).g.h;
        }
    }

    @Override // defpackage.fn8, defpackage.f6a
    public o6a l(ejg ejgVar) {
        switch (this.h) {
            case 0:
                efb efbVar = (efb) ejgVar.l();
                o6a l = super.l(ejgVar);
                if (efbVar != null) {
                    return l.B().a.get(ffb.e) == null ? new y89(l, efbVar) : l;
                }
                return l;
            default:
                return super.l(ejgVar);
        }
    }
}
