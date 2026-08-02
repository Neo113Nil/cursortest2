package defpackage;

import androidx.activity.ComponentActivity;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.sofascore.results.subscription.SubscriptionPriceBundle;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ace implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ace(w8l w8lVar, Function0 function0, ImageVector imageVector, tc3 tc3Var) {
        this.a = 9;
        this.b = w8lVar;
        this.c = function0;
        this.e = imageVector;
        this.d = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 10;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        int i3 = 2;
        int i4 = 1;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                q50 q50Var = (q50) obj6;
                q50 q50Var2 = (q50) obj5;
                tc3 tc3Var = (tc3) obj4;
                fm8 fm8Var = (fm8) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    boolean i5 = av8Var.i(q50Var) | av8Var.i(q50Var2);
                    Object O = av8Var.O();
                    if (i5 || O == a99Var) {
                        O = new ord(i2, q50Var, q50Var2);
                        av8Var.n0(O);
                    }
                    xtc M = s02.M(utcVar, (Function1) O);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, M);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, c, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    g28 g28Var = bkh.c;
                    k1c c2 = e12.c(uxf.g, false);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, g28Var);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c2, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    tc3Var.invoke(fm8Var, av8Var, 0);
                    av8Var.s(true);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                SubscriptionPriceBundle subscriptionPriceBundle = (SubscriptionPriceBundle) obj6;
                SubscriptionPriceBundle subscriptionPriceBundle2 = (SubscriptionPriceBundle) obj5;
                UpgradeSofascoreActivity upgradeSofascoreActivity = (UpgradeSofascoreActivity) obj4;
                e1d e1dVar = (e1d) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i6 = UpgradeSofascoreActivity.M;
                av8 av8Var2 = (av8) of3Var2;
                if (!av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    av8Var2.W();
                } else if (((dli) e1dVar.getValue()).c) {
                    av8Var2.d0(594477121);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var2, bkh.c);
                    av8Var2.s(false);
                } else if (subscriptionPriceBundle == null || subscriptionPriceBundle2 == null) {
                    av8Var2.d0(600990500);
                    av8Var2.s(false);
                } else {
                    av8Var2.d0(594853833);
                    xdk Q = upgradeSofascoreActivity.Q();
                    boolean booleanExtra = upgradeSofascoreActivity.getIntent().getBooleanExtra("preselectYearlyAds", false);
                    eli eliVar = eli.AI;
                    b7 K = l6g.K(new q9k(R.string.sofascore_analyst_benefit_matchup), new q9k(R.string.sofascore_analyst_benefit_player_form), new q9k(R.string.sofascore_analyst_benefit_wc_200_leagues, l6g.K(250)), new q9k(R.string.six_months_thirty_percent), new q9k(R.string.after_six_months_renews_full_price));
                    b7 K2 = l6g.K(new q9k(R.string.sofascore_analyst_benefit_matchup), new q9k(R.string.sofascore_analyst_benefit_player_form), new q9k(R.string.sofascore_analyst_benefit_corners), new q9k(R.string.sofascore_analyst_benefit_probabilities), new q9k(R.string.sofascore_analyst_benefit_leagues, l6g.K(250)));
                    uv0 uv0Var = uv0.a;
                    boolean g = av8Var2.g(subscriptionPriceBundle) | av8Var2.i(upgradeSofascoreActivity);
                    Object O2 = av8Var2.O();
                    if (g || O2 == a99Var) {
                        O2 = new odk(subscriptionPriceBundle, upgradeSofascoreActivity);
                        av8Var2.n0(O2);
                    }
                    lki lkiVar = new lki(eliVar, R.string.sofascore_analyst, subscriptionPriceBundle, K2, K, uv0Var, (Function1) O2);
                    eli eliVar2 = eli.ADS;
                    b7 K3 = l6g.K(new q9k(R.string.subscription_benefit_no_ads), new q9k(R.string.faster_load_time), new q9k(R.string.supports_our_work));
                    rlh rlhVar = rlh.b;
                    uv0 uv0Var2 = uv0.b;
                    boolean i7 = av8Var2.i(upgradeSofascoreActivity) | av8Var2.g(subscriptionPriceBundle2);
                    Object O3 = av8Var2.O();
                    if (i7 || O3 == a99Var) {
                        O3 = new odk(upgradeSofascoreActivity, subscriptionPriceBundle2);
                        av8Var2.n0(O3);
                    }
                    k53.V(Q, l6g.W(b.j(lkiVar, new lki(eliVar2, R.string.ad_free_access, subscriptionPriceBundle2, K3, rlhVar, uv0Var2, (Function1) O3))), null, booleanExtra, av8Var2, 0);
                    av8Var2.s(false);
                }
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                fz8.g((tee) obj6, (xtc) obj5, (String) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 3:
                xtc xtcVar = (xtc) obj6;
                e1d e1dVar2 = (e1d) obj5;
                tc3 tc3Var2 = (tc3) obj4;
                ko1 ko1Var = (ko1) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object O4 = av8Var3.O();
                    if (O4 == a99Var) {
                        O4 = new w30(i2, e1dVar2);
                        av8Var3.n0(O4);
                    }
                    xtc A = un0.A(xtcVar, (Function1) O4);
                    k1c c3 = e12.c(uxf.c, true);
                    int hashCode3 = Long.hashCode(av8Var3.T);
                    aee m3 = av8Var3.m();
                    xtc C3 = fqj.C(av8Var3, A);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var2);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c3, hf3.g);
                    waa.K(av8Var3, m3, hf3.f);
                    waa.K(av8Var3, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var3, hf3.k);
                    waa.K(av8Var3, C3, hf3.d);
                    tc3Var2.invoke(av8Var3, 0);
                    Object O5 = av8Var3.O();
                    if (O5 == a99Var) {
                        O5 = new v30(5, e1dVar2);
                        av8Var3.n0(O5);
                    }
                    ko1Var.b((Function0) O5, av8Var3, 6);
                    av8Var3.s(true);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                fz8.i((pyg) obj6, (p63) obj5, (e93) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                gz8.b((pyg) obj6, (e93) obj5, (Integer) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                t62.c((kfk) obj6, (Function0) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                pco.o((f38) obj6, (Function1) obj5, (Function1) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 8:
                n44 n44Var = (n44) obj6;
                Function0 function0 = (Function0) obj5;
                Function0 function02 = (Function0) obj4;
                r54 r54Var = (r54) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (!av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    av8Var4.W();
                } else if (n44Var instanceof l44) {
                    av8Var4.d0(1886086580);
                    k44.a(0, av8Var4, n9e.q(utcVar, lz.D(R.color.surface_1, av8Var4), oyn.e), oea.v(R.string.submit, av8Var4), function0, function02, r54Var.b, r54Var.c);
                    av8Var4.s(false);
                } else {
                    if (!(n44Var instanceof m44)) {
                        throw dmi.h(av8Var4, 1886084555, false);
                    }
                    av8Var4.d0(-1660376484);
                    av8Var4.s(false);
                }
                return Unit.a;
            case 9:
                w8l w8lVar = (w8l) obj6;
                Function0 function03 = (Function0) obj5;
                ImageVector imageVector = (ImageVector) obj3;
                tc3 tc3Var3 = (tc3) obj4;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    lv1 lv1Var = uxf.m;
                    xtc c0 = l98.c0(bkh.g(n9e.q(wnn.B(td4.A0(utcVar, w8lVar)), lz.D(R.color.surface_1, av8Var5), oyn.e), 48.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f, 4.0f);
                    l8g a = k8g.a(ww9.b, lv1Var, av8Var5, 48);
                    int hashCode4 = Long.hashCode(av8Var5.T);
                    aee m4 = av8Var5.m();
                    xtc C4 = fqj.C(av8Var5, c0);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var3);
                    } else {
                        av8Var5.q0();
                    }
                    waa.K(av8Var5, a, hf3.g);
                    waa.K(av8Var5, m4, hf3.f);
                    waa.K(av8Var5, Integer.valueOf(hashCode4), hf3.j);
                    waa.J(av8Var5, hf3.k);
                    waa.K(av8Var5, C4, hf3.d);
                    long D = lz.D(R.color.n_lv_1, av8Var5);
                    xtc l = bkh.l(utcVar, 24.0f);
                    boolean g2 = av8Var5.g(function03);
                    Object O6 = av8Var5.O();
                    if (g2 || O6 == a99Var) {
                        O6 = new v61(12, function03);
                        av8Var5.n0(O6);
                    }
                    kq9.b(imageVector, null, tol.y(l, false, false, false, 0L, null, (Function0) O6, av8Var5, 29), D, av8Var5, 48, 0);
                    nq8.h(av8Var5, bkh.p(utcVar, 16.0f));
                    tc3Var3.invoke(av8Var5, 0);
                    av8Var5.s(true);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                o02.i((fci) obj6, (Function1) obj5, (Function1) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 11:
                ((Integer) obj2).getClass();
                qx9.f((String) obj6, (String) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                fkf.c((String) obj6, (String) obj5, (gv9) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                v9g.s((String) obj6, (Function0) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(385));
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                rz8.i((ImageVector) obj6, (String) obj5, (String) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                v9g.i((il6) obj6, (Function1) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                ktm.f((gv9) obj6, (rn6) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(3073));
                return Unit.a;
            case 17:
                FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = (FantasyCompetitionFixturesFragment) obj6;
                s68 s68Var = (s68) obj5;
                fo1 fo1Var = (fo1) obj4;
                cdi cdiVar = (cdi) obj3;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    xtc x = gz8.x(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var6), oyn.e), null, null, 3);
                    u23 a2 = t23.a(ww9.d, uxf.o, av8Var6, 0);
                    int hashCode5 = Long.hashCode(av8Var6.T);
                    aee m5 = av8Var6.m();
                    xtc C5 = fqj.C(av8Var6, x);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var4);
                    } else {
                        av8Var6.q0();
                    }
                    waa.K(av8Var6, a2, hf3.g);
                    waa.K(av8Var6, m5, hf3.f);
                    waa.K(av8Var6, Integer.valueOf(hashCode5), hf3.j);
                    waa.J(av8Var6, hf3.k);
                    waa.K(av8Var6, C5, hf3.d);
                    if (fantasyCompetitionFixturesFragment.D().h.c.w || !s68Var.b) {
                        av8Var6.d0(-442372506);
                        av8Var6.s(false);
                    } else {
                        av8Var6.d0(-443258517);
                        gy6 gy6Var = (gy6) cdiVar.getValue();
                        b7 K4 = l6g.K(new s1h(gy6.a, oea.v(R.string.fixtures, av8Var6), true), new s1h(gy6.b, oea.v(R.string.fantasy_fixture_difficulty_rating_short, av8Var6), true));
                        boolean i8 = av8Var6.i(fantasyCompetitionFixturesFragment);
                        Object O7 = av8Var6.O();
                        if (i8 || O7 == a99Var) {
                            O7 = new up6(fantasyCompetitionFixturesFragment, i4);
                            av8Var6.n0(O7);
                        }
                        l4a.a(K4, gy6Var, (Function1) O7, null, null, false, av8Var6, 0, 56);
                        av8Var6.s(false);
                    }
                    if (((gy6) cdiVar.getValue()) == gy6.a) {
                        av8Var6.d0(-442232324);
                        gv9 W = l6g.W(s68Var.a);
                        boolean i9 = av8Var6.i(fantasyCompetitionFixturesFragment);
                        Object O8 = av8Var6.O();
                        if (i9 || O8 == a99Var) {
                            O8 = new up6(fantasyCompetitionFixturesFragment, i3);
                            av8Var6.n0(O8);
                        }
                        kik.d(fo1Var, W, (Function1) O8, null, av8Var6, 0, 8);
                        av8Var6.s(false);
                    } else {
                        av8Var6.d0(-441301146);
                        av8Var6.s(false);
                    }
                    av8Var6.s(true);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 18:
                ((Integer) obj2).getClass();
                s02.x((String) obj6, (String) obj5, (String) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 19:
                ((Integer) obj2).getClass();
                t62.i((gv9) obj6, (ev6) obj5, (xtc) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                f5p.d((String) obj6, (d7e) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(65));
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                ktm.j((j67) obj6, (ev6) obj5, (c47) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                un0.l((String) obj6, (String) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 23:
                ((Integer) obj2).getClass();
                m77.e((String) obj6, (ImageVector) obj5, (Function0) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                yso.f((z97) obj6, (Function1) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 25:
                ((Integer) obj2).getClass();
                f5p.f((ia7) obj6, (Function1) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 26:
                ComponentActivity componentActivity = (ComponentActivity) obj6;
                wb7 wb7Var = (wb7) obj5;
                k7d k7dVar = (k7d) obj4;
                e1d e1dVar3 = (e1d) obj3;
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    String v = oea.v(R.string.discard_selection_title, av8Var7);
                    String v2 = oea.v(R.string.discard_selection_text, av8Var7);
                    String v3 = oea.v(R.string.discard_button, av8Var7);
                    boolean i10 = av8Var7.i(componentActivity) | av8Var7.i(wb7Var) | av8Var7.i(k7dVar);
                    Object O9 = av8Var7.O();
                    if (i10 || O9 == a99Var) {
                        m61 m61Var = new m61((Object) componentActivity, (Object) wb7Var, (Object) k7dVar, e1dVar3, 7);
                        av8Var7.n0(m61Var);
                        O9 = m61Var;
                    }
                    Function0 function04 = (Function0) O9;
                    boolean i11 = av8Var7.i(wb7Var);
                    Object O10 = av8Var7.O();
                    if (i11 || O10 == a99Var) {
                        O10 = new sb7(1, wb7Var, e1dVar3);
                        av8Var7.n0(O10);
                    }
                    tol.e(v, v2, v3, function04, (Function0) O10, null, null, jqh.a, null, av8Var7, 12582912);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 27:
                ((Integer) obj2).getClass();
                kik.e((mj7) obj6, (gv9) obj5, (Function1) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                return Unit.a;
            case 28:
                ArrayList arrayList = (ArrayList) obj6;
                List list = (List) obj5;
                ho7 ho7Var = (ho7) obj4;
                do7 do7Var = (do7) obj3;
                of3 of3Var8 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    xtc A2 = wnn.A(utcVar, o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 8.0f, 3));
                    gv9 W2 = l6g.W(arrayList);
                    gv9 W3 = l6g.W(list);
                    il8 il8Var = il8.f;
                    boolean h = ho7Var.a.h();
                    ev6 ev6Var = do7Var.c;
                    Object O11 = av8Var8.O();
                    if (O11 == a99Var) {
                        O11 = new jf7(16);
                        av8Var8.n0(O11);
                    }
                    s02.g(W2, W3, ev6Var, il8Var, false, null, false, h, (Function0) O11, A2, false, false, av8Var8, 102460416, 54, 0);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                hz8.n((gv9) obj6, (yq7) obj5, (gv9) obj4, (Function1) obj3, (of3) obj, aba.K(1));
                return Unit.a;
        }
    }

    public /* synthetic */ ace(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ ace(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
