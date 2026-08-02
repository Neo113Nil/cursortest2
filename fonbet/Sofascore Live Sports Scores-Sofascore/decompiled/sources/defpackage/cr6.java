package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class cr6 implements ct8 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hr6 b;
    public final /* synthetic */ qug c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ cr6(hr6 hr6Var, qug qugVar, Function1 function1) {
        this.b = hr6Var;
        this.c = qugVar;
        this.d = function1;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        av8 av8Var;
        utc utcVar;
        float f;
        ev6 ev6Var;
        gv9 gv9Var;
        gv9 gv9Var2;
        boolean z;
        ev6 ev6Var2;
        gv9 gv9Var3;
        int i = this.a;
        Function1 function1 = this.d;
        qug qugVar = this.c;
        hr6 hr6Var = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var;
                if (!av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                    av8Var2.W();
                } else if (booleanValue) {
                    av8Var2.d0(1323344291);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var2, bkh.c);
                    av8Var2.s(false);
                } else {
                    av8Var2.d0(1323733744);
                    png pngVar = new png(8.0f, uxf.l);
                    j9d L = jaa.L(av8Var2);
                    utc utcVar2 = utc.a;
                    xtc f0 = ml4.f0(l98.f0(hkg.u0(lz.J(utcVar2, L, null).z(bkh.c), qugVar, false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40.0f, 7));
                    u23 a = t23.a(pngVar, uxf.o, av8Var2, 6);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    do7 do7Var = hr6Var.a;
                    do7 do7Var2 = hr6Var.a;
                    ev6 ev6Var3 = do7Var.c;
                    gv9 gv9Var4 = hr6Var.j;
                    gv9 gv9Var5 = hr6Var.i;
                    mj7 mj7Var = hr6Var.e;
                    Integer num = hr6Var.m;
                    boolean z2 = ev6Var3.w;
                    a99 a99Var = nf3.a;
                    if (z2) {
                        av8Var2.d0(-835192403);
                        boolean g = av8Var2.g(function1);
                        Object O = av8Var2.O();
                        if (g || O == a99Var) {
                            O = new is5(16, function1);
                            av8Var2.n0(O);
                        }
                        s02.f(do7Var2, (Function0) O, null, av8Var2, 0);
                        av8Var2.s(false);
                        av8Var = av8Var2;
                        utcVar = utcVar2;
                    } else if (hr6Var.c == null || num == null) {
                        av8Var = av8Var2;
                        utcVar = utcVar2;
                        av8Var.d0(-833792412);
                        av8Var.s(false);
                    } else {
                        av8Var2.d0(-834783203);
                        ho7 ho7Var = hr6Var.c;
                        mj7 mj7Var2 = hr6Var.d;
                        int intValue2 = num.intValue();
                        sd7 sd7Var = hr6Var.f;
                        boolean g2 = av8Var2.g(function1);
                        Object O2 = av8Var2.O();
                        if (g2 || O2 == a99Var) {
                            O2 = new is5(20, function1);
                            av8Var2.n0(O2);
                        }
                        Function0 function0 = (Function0) O2;
                        boolean g3 = av8Var2.g(function1);
                        Object O3 = av8Var2.O();
                        if (g3 || O3 == a99Var) {
                            O3 = new is5(21, function1);
                            av8Var2.n0(O3);
                        }
                        Function0 function02 = (Function0) O3;
                        boolean g4 = av8Var2.g(function1);
                        Object O4 = av8Var2.O();
                        if (g4 || O4 == a99Var) {
                            O4 = new is5(22, function1);
                            av8Var2.n0(O4);
                        }
                        Function0 function03 = (Function0) O4;
                        boolean g5 = av8Var2.g(function1);
                        Object O5 = av8Var2.O();
                        if (g5 || O5 == a99Var) {
                            O5 = new is5(23, function1);
                            av8Var2.n0(O5);
                        }
                        utcVar = utcVar2;
                        s02.e(do7Var2, ho7Var, mj7Var2, intValue2, sd7Var, function0, function02, function03, (Function0) O5, null, av8Var2, 0);
                        av8Var = av8Var2;
                        av8Var.s(false);
                    }
                    if (ev6Var3.d != FantasyCompetitionType.WEEKLY || ev6Var3.w) {
                        f = 0.0f;
                        av8Var.d0(-832145692);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-833594880);
                        gv9 gv9Var6 = hr6Var.l;
                        boolean z3 = gv9Var6 == null || gv9Var6.isEmpty();
                        if (z3) {
                            f = 0.0f;
                            av8Var.d0(-832973020);
                            av8Var.s(false);
                        } else {
                            av8Var.d0(-833435230);
                            f = 0.0f;
                            fqj.f(hr6Var.l, ev6Var3.r, ev6Var3.A, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, 3072);
                            av8Var.s(false);
                        }
                        if (mj7Var == null || (!z3 && mj7Var.a == ev6Var3.n)) {
                            av8Var.d0(-832171484);
                            av8Var.s(false);
                        } else {
                            av8Var.d0(-832773070);
                            int i2 = mj7Var.c;
                            Long l = mj7Var.h;
                            long longValue = l != null ? l.longValue() : 0L;
                            boolean g6 = av8Var.g(function1);
                            Object O6 = av8Var.O();
                            if (g6 || O6 == a99Var) {
                                O6 = new is5(24, function1);
                                av8Var.n0(O6);
                            }
                            Function0 function04 = (Function0) O6;
                            boolean g7 = av8Var.g(function1);
                            Object O7 = av8Var.O();
                            if (g7 || O7 == a99Var) {
                                O7 = new is5(25, function1);
                                av8Var.n0(O7);
                            }
                            n4o.h(i2, longValue, function04, (Function0) O7, l98.d0(utcVar, 8.0f, f, 2), av8Var, 24576);
                            av8Var.s(false);
                        }
                        av8Var.s(false);
                    }
                    gv9 gv9Var7 = hr6Var.k;
                    if (gv9Var7 == null || gv9Var7.isEmpty()) {
                        av8Var.d0(-831487004);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-832057838);
                        gv9 gv9Var8 = hr6Var.k;
                        boolean g8 = av8Var.g(function1);
                        Object O8 = av8Var.O();
                        if (g8 || O8 == a99Var) {
                            O8 = new k46(5, function1);
                            av8Var.n0(O8);
                        }
                        Function1 function12 = (Function1) O8;
                        boolean g9 = av8Var.g(function1);
                        Object O9 = av8Var.O();
                        if (g9 || O9 == a99Var) {
                            O9 = new is5(26, function1);
                            av8Var.n0(O9);
                        }
                        n9e.h(gv9Var8, ev6Var3, function12, (Function0) O9, l98.d0(utcVar, 8.0f, f, 2), av8Var, 24576);
                        av8Var.s(false);
                    }
                    rz0.a(new sz0(AdType.Banner.FantasySmall, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var, 24960, 10);
                    gv9 gv9Var9 = hr6Var.g;
                    if (gv9Var9 == null || gv9Var9.isEmpty() || (gv9Var3 = hr6Var.h) == null || gv9Var3.isEmpty()) {
                        ev6Var = ev6Var3;
                        gv9Var = gv9Var4;
                        gv9Var2 = gv9Var5;
                        z = false;
                        av8Var.d0(-830353148);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-830924943);
                        gv9 gv9Var10 = hr6Var.g;
                        gv9 gv9Var11 = hr6Var.h;
                        boolean g10 = av8Var.g(function1);
                        Object O10 = av8Var.O();
                        if (g10 || O10 == a99Var) {
                            O10 = new k46(6, function1);
                            av8Var.n0(O10);
                        }
                        ev6Var = ev6Var3;
                        gv9Var = gv9Var4;
                        gv9Var2 = gv9Var5;
                        s9a.g(gv9Var10, gv9Var11, (Function1) O10, ev6Var3.A, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, 24576);
                        z = false;
                        av8Var.s(false);
                    }
                    nl7 nl7Var = hr6Var.n;
                    if (nl7Var == null) {
                        av8Var.d0(-830285662);
                        av8Var.s(z);
                        ev6Var2 = ev6Var;
                    } else {
                        av8Var.d0(-830285661);
                        xtc d0 = l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        boolean g11 = av8Var.g(function1);
                        Object O11 = av8Var.O();
                        if (g11 || O11 == a99Var) {
                            O11 = new k46(3, function1);
                            av8Var.n0(O11);
                        }
                        Function1 function13 = (Function1) O11;
                        boolean g12 = av8Var.g(function1);
                        Object O12 = av8Var.O();
                        if (g12 || O12 == a99Var) {
                            O12 = new y47(12, function1);
                            av8Var.n0(O12);
                        }
                        ev6 ev6Var4 = ev6Var;
                        fz8.l(ev6Var4, nl7Var, function13, (ct8) O12, d0, av8Var, 24576);
                        ev6Var2 = ev6Var4;
                        Unit unit = Unit.a;
                        av8Var.s(false);
                    }
                    if ((gv9Var2 == null || gv9Var2.isEmpty()) && (gv9Var == null || gv9Var.isEmpty())) {
                        av8Var.d0(-828731228);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-829504678);
                        gv9 gv9Var12 = gv9Var2 == null ? rlh.b : gv9Var2;
                        gv9 gv9Var13 = gv9Var == null ? rlh.b : gv9Var;
                        boolean z4 = ev6Var2.A;
                        xtc d02 = l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        boolean g13 = av8Var.g(function1);
                        Object O13 = av8Var.O();
                        if (g13 || O13 == a99Var) {
                            O13 = new is5(18, function1);
                            av8Var.n0(O13);
                        }
                        Function0 function05 = (Function0) O13;
                        boolean g14 = av8Var.g(function1);
                        Object O14 = av8Var.O();
                        if (g14 || O14 == a99Var) {
                            O14 = new is5(19, function1);
                            av8Var.n0(O14);
                        }
                        Function0 function06 = (Function0) O14;
                        boolean g15 = av8Var.g(function1);
                        Object O15 = av8Var.O();
                        if (g15 || O15 == a99Var) {
                            O15 = new k46(4, function1);
                            av8Var.n0(O15);
                        }
                        ktm.l(gv9Var13, gv9Var12, function05, function06, (Function1) O15, z4, d02, av8Var, 1572864);
                        av8Var.s(false);
                    }
                    fz8.b(x23.a, hr6Var.o && !ev6Var2.w, null, zo5.b, uo5.l(s02.h0(500, 0, null, 6), uxf.n, 12), null, yqo.H(-1579786090, av8Var, new qm4(9, hr6Var, function1)), av8Var, 1572870, 18);
                    rz0.a(new sz0(AdType.Banner.FantasyBig, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy"))), null, 0, 0, true, av8Var, 24960, 10);
                    av8Var.s(true);
                    av8Var.s(false);
                }
                break;
            default:
                of3 of3Var2 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    wkn.a(Boolean.valueOf(hr6Var.b), null, null, null, yqo.H(2075515172, av8Var3, new cr6(qugVar, hr6Var, function1)), av8Var3, 24576, 14);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cr6(qug qugVar, hr6 hr6Var, Function1 function1) {
        this.c = qugVar;
        this.b = hr6Var;
        this.d = function1;
    }
}
