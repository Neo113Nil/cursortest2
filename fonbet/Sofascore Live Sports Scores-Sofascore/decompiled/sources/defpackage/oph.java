package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class oph implements s9j {
    public final /* synthetic */ bfc a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ scj c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ wd8 k;
    public final /* synthetic */ e1d l;
    public final /* synthetic */ e1d m;
    public final /* synthetic */ cdi n;
    public final /* synthetic */ e1d o;

    public oph(bfc bfcVar, boolean z, scj scjVar, boolean z2, String str, boolean z3, long j, boolean z4, boolean z5, Function1 function1, wd8 wd8Var, e1d e1dVar, e1d e1dVar2, cdi cdiVar, e1d e1dVar3) {
        this.a = bfcVar;
        this.b = z;
        this.c = scjVar;
        this.d = z2;
        this.e = str;
        this.f = z3;
        this.g = j;
        this.h = z4;
        this.i = z5;
        this.j = function1;
        this.k = wd8Var;
        this.l = e1dVar;
        this.m = e1dVar2;
        this.n = cdiVar;
        this.o = e1dVar3;
    }

    @Override // defpackage.s9j
    public final void a(tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var;
        tc3 tc3Var2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1102816040);
        int i2 = (av8Var2.g(this) ? 32 : 16) | i;
        if (av8Var2.T(i2 & 1, (i2 & 19) != 18)) {
            if (this.a != null) {
                av8Var2.d0(-1787576249);
                tc3Var2 = yqo.H(195825466, av8Var2, new mp9(this.j, this.k, this.l, this.m, 12));
                av8Var2.s(false);
            } else if (this.b) {
                av8Var2.d0(-1787141691);
                tc3Var2 = yqo.H(-245099023, av8Var2, new mph(this.n, 0));
                av8Var2.s(false);
            } else {
                av8Var2.d0(-1787006314);
                av8Var2.s(false);
                tc3Var2 = null;
            }
            tc3 tc3Var3 = tc3Var2;
            this.c.c().c.length();
            boolean booleanValue = ((Boolean) this.o.getValue()).booleanValue();
            boolean z = this.d;
            av8Var = av8Var2;
            yqo.a(z, null, null, tc3Var3, this.e, null, null, null, false, this.f, booleanValue, 0L, null, this.g, this.h, this.i, 0L, yqo.H(1720452851, av8Var2, new nph(z, tc3Var, 0)), av8Var, 0, 12582912, 71682);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s5h(this, tc3Var, i, 3);
        }
    }
}
