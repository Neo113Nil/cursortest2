package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class tth implements s9j {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ long l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ long o;
    public final /* synthetic */ e1d p;

    public tth(boolean z, String str, boolean z2, xtc xtcVar, Function2 function2, Function2 function22, String str2, String str3, String str4, boolean z3, boolean z4, long j, boolean z5, boolean z6, long j2, e1d e1dVar) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = xtcVar;
        this.e = function2;
        this.f = function22;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = z3;
        this.k = z4;
        this.l = j;
        this.m = z5;
        this.n = z6;
        this.o = j2;
        this.p = e1dVar;
    }

    @Override // defpackage.s9j
    public final void a(tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(71297448);
        int i2 = (av8Var2.g(this) ? 32 : 16) | i;
        int i3 = 1;
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            String str = this.a ? this.b : null;
            boolean booleanValue = ((Boolean) this.p.getValue()).booleanValue();
            boolean z = this.c;
            av8Var = av8Var2;
            yqo.a(z, this.d, this.e, this.f, this.g, str, this.h, this.i, this.j, this.k, booleanValue, 0L, null, this.l, this.m, this.n, this.o, yqo.H(1778616963, av8Var2, new nph(z, tc3Var, i3)), av8Var, 0, 12582912, 6144);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(this, tc3Var, i, 6);
        }
    }
}
