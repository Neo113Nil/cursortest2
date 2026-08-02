package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ij5 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;
    public final /* synthetic */ hj5 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ ij5(pj5 pj5Var, hj5 hj5Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = pj5Var;
        this.c = hj5Var;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        double d;
        e1d e1dVar;
        Object obj3;
        cdi cdiVar;
        kx4 kx4Var;
        pj5 pj5Var;
        int i;
        ksa ksaVar;
        int i2;
        av8 av8Var;
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-745562179, av8Var2, new ij5(this.b, this.c, this.d, this.e, 1)), av8Var2, 6);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                pj5 pj5Var2 = this.b;
                vnh vnhVar = pj5Var2.m;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ksa a = msa.a(0, wzb.a(vnhVar.h()), av8Var3, 6, 0);
                    Object O = av8Var3.O();
                    Object obj4 = nf3.a;
                    if (O == obj4) {
                        O = e.f(Boolean.FALSE);
                        av8Var3.n0(O);
                    }
                    e1d e1dVar2 = (e1d) O;
                    final hj5 hj5Var = this.c;
                    final gv9 gv9Var = hj5Var.d;
                    Object O2 = av8Var3.O();
                    if (O2 == obj4) {
                        O2 = goh.b(new h63(pj5Var2, 21));
                        av8Var3.n0(O2);
                    }
                    cdi cdiVar2 = (cdi) O2;
                    Object O3 = av8Var3.O();
                    if (O3 == obj4) {
                        O3 = goh.b(new ni4(a, 1));
                        av8Var3.n0(O3);
                    }
                    cdi cdiVar3 = (cdi) O3;
                    boolean z = hj5Var.a != 1;
                    int q = vh.q(cdiVar2) - 1;
                    int intValue3 = ((Number) cdiVar2.getValue()).intValue() + 1;
                    int i3 = this.d;
                    int i4 = (i3 > intValue3 || q > i3) ? 0 : 600;
                    boolean z2 = i3 >= this.e - 1;
                    kx4 kx4Var2 = (kx4) av8Var3.k(dh3.h);
                    double d2 = 52.0d;
                    if (z) {
                        d = 4.0d;
                        if (i3 >= ((Number) cdiVar2.getValue()).intValue()) {
                            double pow = ((Math.pow(2.0d, i3 - ((Number) cdiVar2.getValue()).intValue()) * 76.0d) - 52.0d) / 2.0d;
                            if (pow >= 4.0d) {
                                d = pow;
                            }
                        }
                    } else {
                        d = 12.0d;
                    }
                    final double d3 = d;
                    float f = (float) d3;
                    final boolean z3 = z2;
                    i4k h0 = s02.h0(i4, 0, null, 6);
                    Object O4 = av8Var3.O();
                    if (O4 == obj4) {
                        e1dVar = e1dVar2;
                        O4 = new w30(22, e1dVar);
                        av8Var3.n0(O4);
                    } else {
                        e1dVar = e1dVar2;
                    }
                    final int i5 = i4;
                    final cdi a2 = a60.a(f, h0, "spacerHeight", (Function1) O4, av8Var3, 3456, 0);
                    if (((Number) cdiVar2.getValue()).intValue() > i3 && z) {
                        d2 = (76.0d / Math.pow(2.0d, ((Number) cdiVar2.getValue()).intValue() - i3)) - 8.0d;
                    }
                    final double d4 = d2;
                    float f2 = (float) d4;
                    i4k h02 = s02.h0(i5, 0, null, 6);
                    Object O5 = av8Var3.O();
                    if (O5 == obj4) {
                        O5 = new w30(23, e1dVar);
                        av8Var3.n0(O5);
                    }
                    final cdi a3 = a60.a(f2, h02, "itemHeight", (Function1) O5, av8Var3, 3456, 0);
                    Float valueOf = Float.valueOf(((p75) a2.getValue()).a);
                    Float valueOf2 = Float.valueOf(((p75) a3.getValue()).a);
                    boolean e = av8Var3.e(i3) | av8Var3.g(kx4Var2) | av8Var3.i(pj5Var2) | av8Var3.g(a);
                    Object O6 = av8Var3.O();
                    if (e || O6 == obj4) {
                        obj3 = obj4;
                        cdiVar = cdiVar2;
                        Object lj5Var = new lj5(i3, kx4Var2, pj5Var2, a, cdiVar, (rq3) null);
                        kx4Var = kx4Var2;
                        pj5Var = pj5Var2;
                        i = i3;
                        ksaVar = a;
                        av8Var3.n0(lj5Var);
                        O6 = lj5Var;
                    } else {
                        i = i3;
                        obj3 = obj4;
                        pj5Var = pj5Var2;
                        ksaVar = a;
                        kx4Var = kx4Var2;
                        cdiVar = cdiVar2;
                    }
                    hz8.q(valueOf, valueOf2, (Function2) O6, av8Var3);
                    Object value = cdiVar3.getValue();
                    boolean g = av8Var3.g(ksaVar) | av8Var3.i(pj5Var) | av8Var3.e(i) | av8Var3.g(kx4Var);
                    Object O7 = av8Var3.O();
                    if (g || O7 == obj3) {
                        kx4 kx4Var3 = kx4Var;
                        Object lj5Var2 = new lj5(ksaVar, pj5Var, i, kx4Var3, cdiVar, (rq3) null);
                        kx4Var = kx4Var3;
                        av8Var3.n0(lj5Var2);
                        O7 = lj5Var2;
                    }
                    hz8.o(av8Var3, value, (Function2) O7);
                    Boolean valueOf3 = Boolean.valueOf(ksaVar.j.b());
                    boolean g2 = av8Var3.g(ksaVar) | av8Var3.e(i) | av8Var3.i(pj5Var);
                    Object O8 = av8Var3.O();
                    if (g2 || O8 == obj3) {
                        O8 = new ce4(ksaVar, i, pj5Var, (rq3) null);
                        av8Var3.n0(O8);
                    }
                    hz8.o(av8Var3, valueOf3, (Function2) O8);
                    Double valueOf4 = Double.valueOf(vnhVar.h());
                    boolean g3 = av8Var3.g(ksaVar) | av8Var3.e(i) | av8Var3.g(kx4Var) | av8Var3.i(pj5Var);
                    Object O9 = av8Var3.O();
                    if (g3 || O9 == obj3) {
                        pj5 pj5Var3 = pj5Var;
                        Object mj5Var = new mj5(ksaVar, i, kx4Var, pj5Var3, cdiVar, (rq3) null, 0);
                        pj5Var = pj5Var3;
                        av8Var3.n0(mj5Var);
                        O9 = mj5Var;
                    }
                    hz8.o(av8Var3, valueOf4, (Function2) O9);
                    Object value2 = e1dVar.getValue();
                    boolean e2 = av8Var3.e(i) | av8Var3.g(ksaVar);
                    Object O10 = av8Var3.O();
                    if (e2 || O10 == obj3) {
                        i2 = i;
                        av8Var = av8Var3;
                        Object z23Var = new z23(e1dVar, i2, ksaVar, cdiVar, (rq3) null, 2);
                        av8Var.n0(z23Var);
                        O10 = z23Var;
                    } else {
                        i2 = i;
                        av8Var = av8Var3;
                    }
                    hz8.o(av8Var, value2, (Function2) O10);
                    Integer valueOf5 = Integer.valueOf(((Number) cdiVar.getValue()).intValue());
                    Object O11 = av8Var.O();
                    if (O11 == obj3) {
                        O11 = new nj5(e1dVar, null, 0);
                        av8Var.n0(O11);
                    }
                    hz8.o(av8Var, valueOf5, (Function2) O11);
                    final gnh J = kda.J(new gsa(ksaVar, rik.h), av8Var);
                    xtc J2 = lz.J(bkh.d(utc.a, 1.0f), jaa.L(av8Var), null);
                    k1c c = e12.c(uxf.f, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, J2);
                    if3.k7.getClass();
                    Function0 function0 = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(function0);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    final ksa ksaVar2 = ksaVar;
                    final pj5 pj5Var4 = pj5Var;
                    final int i6 = i2;
                    final e1d e1dVar3 = e1dVar;
                    final cdi cdiVar4 = cdiVar;
                    tol.b(nyd.a.a(null), yqo.H(-1524467017, av8Var, new Function2() { // from class: jj5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            av8 av8Var4;
                            final pj5 pj5Var5 = pj5.this;
                            znh znhVar = pj5Var5.n;
                            of3 of3Var3 = (of3) obj5;
                            int intValue4 = ((Integer) obj6).intValue();
                            av8 av8Var5 = (av8) of3Var3;
                            if (av8Var5.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                                xtc r = bkh.r(utc.a, null, 3);
                                t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                                int h = znhVar.h();
                                final int i7 = i6;
                                boolean z4 = h < 0 || znhVar.h() == i7;
                                final gv9 gv9Var2 = gv9Var;
                                boolean g4 = av8Var5.g(gv9Var2);
                                final hj5 hj5Var2 = hj5Var;
                                boolean g5 = g4 | av8Var5.g(hj5Var2);
                                final int i8 = i5;
                                boolean e3 = g5 | av8Var5.e(i8) | av8Var5.e(i7);
                                final cdi cdiVar5 = a2;
                                boolean g6 = e3 | av8Var5.g(cdiVar5);
                                final boolean z5 = z3;
                                boolean h2 = g6 | av8Var5.h(z5) | av8Var5.i(pj5Var5);
                                final double d5 = d3;
                                boolean c2 = h2 | av8Var5.c(d5);
                                final cdi cdiVar6 = a3;
                                boolean g7 = c2 | av8Var5.g(cdiVar6);
                                final double d6 = d4;
                                boolean c3 = g7 | av8Var5.c(d6);
                                Object O12 = av8Var5.O();
                                if (c3 || O12 == nf3.a) {
                                    final e1d e1dVar4 = e1dVar3;
                                    final cdi cdiVar7 = cdiVar4;
                                    av8Var4 = av8Var5;
                                    Function1 function1 = new Function1() { // from class: kj5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj7) {
                                            esa esaVar = (esa) obj7;
                                            esaVar.getClass();
                                            qz4 qz4Var = new qz4(20);
                                            gv9 gv9Var3 = gv9.this;
                                            esaVar.a(gv9Var3.size(), new zi(16, qz4Var, gv9Var3), new xo(gv9Var3, 3), new tc3(802480018, new oj5(gv9Var3, gv9Var3, hj5Var2, e1dVar4, i8, i7, cdiVar7, z5, pj5Var5, d5, cdiVar5, cdiVar6, d6), true));
                                            return Unit.a;
                                        }
                                    };
                                    av8Var4.n0(function1);
                                    O12 = function1;
                                } else {
                                    av8Var4 = av8Var5;
                                }
                                v8a.a(r, ksaVar2, C2, null, null, J, z4, null, (Function1) O12, av8Var4, 390, Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);
                            } else {
                                av8Var5.W();
                            }
                            return Unit.a;
                        }
                    }), av8Var, 56);
                    av8Var.s(true);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
