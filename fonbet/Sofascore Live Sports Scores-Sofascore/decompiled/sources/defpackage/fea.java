package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fea extends cea {
    public final kea e;
    public final gea f;
    public final kt2 g;
    public final Object h;

    public fea(kea keaVar, gea geaVar, kt2 kt2Var, Object obj) {
        this.e = keaVar;
        this.f = geaVar;
        this.g = kt2Var;
        this.h = obj;
    }

    @Override // defpackage.cea
    public final boolean l() {
        return false;
    }

    @Override // defpackage.cea
    public final void m(Throwable th) {
        kt2 kt2Var = this.g;
        kt2 Y = kea.Y(kt2Var);
        kea keaVar = this.e;
        gea geaVar = this.f;
        Object obj = this.h;
        if (Y == null || !keaVar.i0(geaVar, Y, obj)) {
            geaVar.a.c(new acb(2), 2);
            kt2 Y2 = kea.Y(kt2Var);
            if (Y2 == null || !keaVar.i0(geaVar, Y2, obj)) {
                keaVar.u(keaVar.F(geaVar, obj));
            }
        }
    }
}
