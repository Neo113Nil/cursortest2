package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class uth implements s9j {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ e1d j;

    public uth(boolean z, boolean z2, xtc xtcVar, String str, String str2, boolean z3, boolean z4, long j, long j2, boolean z5, e1d e1dVar) {
        this.a = z2;
        this.b = xtcVar;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = j2;
        this.i = z5;
        this.j = e1dVar;
    }

    @Override // defpackage.s9j
    public final void a(tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1329988539);
        int i2 = (av8Var2.g(this) ? 32 : 16) | i;
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            boolean booleanValue = ((Boolean) this.j.getValue()).booleanValue();
            boolean z = this.a;
            av8Var = av8Var2;
            yqo.a(z, this.b, null, null, this.c, null, null, this.d, this.e, this.f, booleanValue, this.g, null, this.h, true, this.i, 0L, yqo.H(1288546336, av8Var2, new nph(z, tc3Var, 2)), av8Var, 0, 12582912, 69632);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(this, tc3Var, i, 7);
        }
    }
}
