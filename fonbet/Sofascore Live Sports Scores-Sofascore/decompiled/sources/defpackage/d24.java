package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d24 extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d24(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(2);
        this.i = i;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.m = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r14;
        Object w;
        String w2;
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5 = this.i;
        Object obj3 = this.l;
        Object obj4 = nf3.a;
        utc utcVar = utc.a;
        Object obj5 = this.j;
        Object obj6 = this.m;
        Object obj7 = this.k;
        switch (i5) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                int i6 = 1;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    axj axjVar = (axj) obj5;
                    e60 e60Var = new e60((j38) obj7, i6);
                    q4k q4kVar = lz.f;
                    boolean i7 = axjVar.i();
                    t01 t01Var = axjVar.a;
                    if (i7) {
                        r14 = 0;
                        av8Var.d0(1666827533);
                        av8Var.s(false);
                        w = t01Var.w();
                    } else {
                        av8Var.d0(1666573488);
                        boolean g = av8Var.g(axjVar);
                        w = av8Var.O();
                        if (g || w == obj4) {
                            nnh w3 = bea.w();
                            Function1 e = w3 != null ? w3.e() : null;
                            nnh C = bea.C(w3);
                            try {
                                Object w4 = t01Var.w();
                                bea.K(w3, C, e);
                                av8Var.n0(w4);
                                w = w4;
                            } catch (Throwable th) {
                                bea.K(w3, C, e);
                                throw th;
                            }
                        }
                        r14 = 0;
                        av8Var.s(false);
                    }
                    av8Var.d0(1378811975);
                    boolean c = Intrinsics.c(w, obj3);
                    float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    float f2 = c ? 1.0f : 0.0f;
                    av8Var.s(r14);
                    Float valueOf = Float.valueOf(f2);
                    boolean g2 = av8Var.g(axjVar);
                    Object O = av8Var.O();
                    if (g2 || O == obj4) {
                        O = goh.b(new c24(axjVar, r14));
                        av8Var.n0(O);
                    }
                    Object value = ((cdi) O).getValue();
                    av8Var.d0(1378811975);
                    if (Intrinsics.c(value, obj3)) {
                        f = 1.0f;
                    }
                    av8Var.s(r14);
                    Float valueOf2 = Float.valueOf(f);
                    boolean g3 = av8Var.g(axjVar);
                    Object O2 = av8Var.O();
                    if (g3 || O2 == obj4) {
                        O2 = goh.b(new c24(axjVar, 1));
                        av8Var.n0(O2);
                    }
                    vwj x = yso.x(axjVar, valueOf, valueOf2, (j38) e60Var.invoke(((cdi) O2).getValue(), av8Var, 0), q4kVar, av8Var, 0);
                    boolean g4 = av8Var.g(x);
                    Object O3 = av8Var.O();
                    if (g4 || O3 == obj4) {
                        O3 = new oo(x, 14);
                        av8Var.n0(O3);
                    }
                    xtc M = s02.M(utcVar, (Function1) O3);
                    tc3 tc3Var = (tc3) obj6;
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C2 = fqj.C(av8Var, M);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c2, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.C(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C2, hf3.d);
                    tc3Var.invoke(obj3, av8Var, 0);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                of3 of3Var2 = (of3) obj;
                Function0 function0 = (Function0) obj6;
                am3 am3Var = (am3) obj7;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.D()) {
                        av8Var2.W();
                        return Unit.a;
                    }
                }
                ((e1d) obj5).setValue(Unit.a);
                int i8 = am3Var.b;
                am3Var.h();
                av8 av8Var3 = (av8) of3Var2;
                av8Var3.d0(-1669414572);
                am3 am3Var2 = (am3) am3Var.g().b;
                ll3 f3 = am3Var2.f();
                ll3 f4 = am3Var2.f();
                Object O4 = av8Var3.O();
                if (O4 == obj4) {
                    O4 = rg2.x;
                    av8Var3.n0(O4);
                }
                xtc b = am3.b(utcVar, f3, (Function1) O4);
                String v = oea.v(R.string.monthly_match_views, av8Var3);
                yf8 yf8Var = xth.a;
                udj.c(v, b, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var3, 0, 0, 130040);
                xtc p = bkh.p(utcVar, 24.0f);
                Object O5 = av8Var3.O();
                if (O5 == obj4) {
                    O5 = rg2.y;
                    av8Var3.n0(O5);
                }
                xtc b2 = am3.b(p, f4, (Function1) O5);
                boolean g5 = av8Var3.g(function0);
                Object O6 = av8Var3.O();
                if (g5 || O6 == obj4) {
                    O6 = new ps4(function0, 10);
                    av8Var3.n0(O6);
                }
                ao2.g((Function0) O6, b2, false, null, null, hz8.e, av8Var3, 1572864, 60);
                av8Var3.s(false);
                if (am3Var.b != i8) {
                    hz8.t((Function0) obj3, av8Var3);
                }
                return Unit.a;
            default:
                of3 of3Var3 = (of3) obj;
                am3 am3Var3 = (am3) obj7;
                ehk ehkVar = (ehk) obj6;
                if ((3 & ((Number) obj2).intValue()) == 2) {
                    av8 av8Var4 = (av8) of3Var3;
                    if (av8Var4.D()) {
                        av8Var4.W();
                        return Unit.a;
                    }
                }
                ((e1d) obj5).setValue(Unit.a);
                int i9 = am3Var3.b;
                am3Var3.h();
                av8 av8Var5 = (av8) of3Var3;
                av8Var5.d0(-1798173946);
                am3 am3Var4 = (am3) am3Var3.g().b;
                ll3 f5 = am3Var4.f();
                ll3 f6 = am3Var4.f();
                ll3 f7 = am3Var4.f();
                ll3 f8 = am3Var4.f();
                d7e t = haa.t(ehkVar != null ? ehkVar.c : R.drawable.ic_no_title, 0, av8Var5);
                Object O7 = av8Var5.O();
                if (O7 == obj4) {
                    O7 = rg2.C;
                    av8Var5.n0(O7);
                }
                wkn.k(t, null, bkh.d(am3.b(utcVar, f5, (Function1) O7), 0.3f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var5, 56, 120);
                if (ehkVar == null) {
                    w2 = ljg.k(av8Var5, 219104370, R.string.season_entry_unopened_title, av8Var5, false);
                } else {
                    av8Var5.d0(219106416);
                    w2 = oea.w(R.string.season_entry_opened_title, new Object[]{oea.v(ehkVar.a, av8Var5)}, av8Var5);
                    av8Var5.s(false);
                }
                yf8 yf8Var2 = xth.a;
                dfj l = xth.l();
                long D = lz.D(R.color.on_color_primary, av8Var5);
                boolean g6 = av8Var5.g(f5);
                Object O8 = av8Var5.O();
                if (g6 || O8 == obj4) {
                    O8 = new pw6(f5, 11);
                    av8Var5.n0(O8);
                }
                udj.c(w2, am3.b(utcVar, f6, (Function1) O8), D, null, 0L, null, 0L, null, new p7j(5), 0L, 0, false, 0, 0, null, l, av8Var5, 0, 0, 130040);
                if (ehkVar == null) {
                    i = 219126225;
                    i2 = R.string.season_entry_unopened_body;
                    z = false;
                } else {
                    z = false;
                    i = 219128207;
                    i2 = R.string.season_entry_opened_body;
                }
                String k = ljg.k(av8Var5, i, i2, av8Var5, z);
                dfj b3 = xth.b();
                long D2 = lz.D(R.color.on_color_secondary, av8Var5);
                boolean g7 = av8Var5.g(f6);
                Object O9 = av8Var5.O();
                if (g7 || O9 == obj4) {
                    O9 = new pw6(f6, 12);
                    av8Var5.n0(O9);
                }
                udj.c(k, am3.b(utcVar, f7, (Function1) O9), D2, null, 0L, null, 0L, null, new p7j(5), 0L, 0, false, 0, 0, null, b3, av8Var5, 0, 0, 130040);
                boolean g8 = av8Var5.g(f7) | av8Var5.g(f6);
                Object O10 = av8Var5.O();
                if (g8 || O10 == obj4) {
                    O10 = new tsh(f7, f6, 0);
                    av8Var5.n0(O10);
                }
                xtc b4 = am3.b(utcVar, f8, (Function1) O10);
                l8g a = k8g.a(ww9.b, uxf.m, av8Var5, 48);
                int hashCode2 = Long.hashCode(av8Var5.T);
                aee m2 = av8Var5.m();
                xtc C3 = fqj.C(av8Var5, b4);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var5.h0();
                if (av8Var5.S) {
                    av8Var5.l(zg3Var2);
                } else {
                    av8Var5.q0();
                }
                waa.K(av8Var5, a, hf3.g);
                waa.K(av8Var5, m2, hf3.f);
                waa.K(av8Var5, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var5, hf3.k);
                waa.K(av8Var5, C3, hf3.d);
                if (ehkVar == null) {
                    i3 = -225512659;
                    i4 = R.string.button_get_started;
                    z2 = false;
                } else {
                    z2 = false;
                    i3 = -225510932;
                    i4 = R.string.button_open_recap;
                }
                udj.c(ljg.k(av8Var5, i3, i4, av8Var5, z2), null, lz.D(R.color.on_color_primary, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var5, 0, 0, 131066);
                nq8.h(av8Var5, bkh.p(utcVar, 4.0f));
                kq9.b(s6a.N(R.drawable.ic_chevron_right, 6, av8Var5), null, bkh.l(utcVar, 16.0f), lz.D(R.color.on_color_primary, av8Var5), av8Var5, 432, 0);
                av8Var5.s(true);
                av8Var5.s(false);
                if (am3Var3.b != i9) {
                    hz8.t((Function0) obj3, av8Var5);
                }
                return Unit.a;
        }
    }
}
