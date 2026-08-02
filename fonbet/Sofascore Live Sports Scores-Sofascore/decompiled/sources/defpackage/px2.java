package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class px2 extends mn2 {
    public final mn2 a;
    public final fjc b;

    public px2(mn2 mn2Var, fjc fjcVar) {
        this.a = mn2Var;
        z1a.y(fjcVar, "interceptor");
        this.b = fjcVar;
    }

    @Override // defpackage.mn2
    public final String e() {
        return this.a.e();
    }

    @Override // defpackage.mn2
    public final wkn f(ujg ujgVar, jh2 jh2Var) {
        fjc fjcVar = this.b;
        fjcVar.getClass();
        return new ejc(fjcVar, this.a.f(ujgVar, jh2Var));
    }
}
