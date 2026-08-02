package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ywd extends by2 {
    public final twd a;
    public final by2 b;

    public ywd(twd twdVar, by2 by2Var) {
        this.a = twdVar;
        this.b = by2Var;
    }

    @Override // defpackage.by2
    public final cy2 a(pp4 pp4Var, qic qicVar) {
        by2 by2Var = this.b;
        return by2Var != null ? new wwd(this, by2Var.a(pp4Var, qicVar)) : new xwd(this);
    }
}
