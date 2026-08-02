package defpackage;

import androidx.activity.ComponentActivity;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.fantasy.FantasyNewsArticle;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import com.sofascore.results.fantasy.onboarding.steps.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class o87 implements ct8 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ o87(gv9 gv9Var, Function0 function0, gv9 gv9Var2, boolean z, Function0 function02, Function1 function1) {
        this.c = gv9Var;
        this.e = function0;
        this.d = gv9Var2;
        this.b = z;
        this.f = function02;
        this.g = function1;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        av8 av8Var;
        utc utcVar;
        av8 av8Var2;
        boolean z;
        int i = this.a;
        a99 a99Var = nf3.a;
        boolean z2 = this.b;
        utc utcVar2 = utc.a;
        Object obj4 = this.f;
        Object obj5 = this.g;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                gv9 gv9Var = (gv9) obj8;
                Function0 function0 = (Function0) obj6;
                gv9<FantasyNewsArticle> gv9Var2 = (gv9) obj7;
                Function0 function02 = (Function0) obj4;
                Function1 function1 = (Function1) obj5;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var3 = (av8) of3Var;
                if (av8Var3.T(intValue & 1, (intValue & 17) != 16)) {
                    rha.b(oea.v(R.string.fantasy_news, av8Var3), null, 0L, av8Var3, 0, 6);
                    boolean isEmpty = gv9Var.isEmpty();
                    utc utcVar3 = utc.a;
                    if (isEmpty) {
                        av8Var = av8Var3;
                        utcVar = utcVar3;
                        av8Var.d0(354077480);
                        av8Var.s(false);
                    } else {
                        av8Var3.d0(352807038);
                        rha.c(oea.v(R.string.fantasy_recent_price_changes, av8Var3), null, yqo.H(-247672546, av8Var3, new f91(3, function0)), av8Var3, 384, 2);
                        ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                        long D = lz.D(R.color.n_lv_4, av8Var3);
                        Object O = av8Var3.O();
                        if (O == a99Var) {
                            O = mz1.e(av8Var3);
                        }
                        wzc wzcVar = (wzc) O;
                        Object[] objArr = new Object[0];
                        Object O2 = av8Var3.O();
                        if (O2 == a99Var) {
                            O2 = o67.c;
                            av8Var3.n0(O2);
                        }
                        xtc y = tol.y(utcVar3, true, true, true, D, wzcVar, new gm(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var3, 48), 24), av8Var3, 0);
                        utcVar = utcVar3;
                        av8Var = av8Var3;
                        xtc s = tgj.s(l98.d0(y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), Integer.MAX_VALUE, 0, 0, new a70(17), 36.0f, 10);
                        l8g a = k8g.a(ng0Var, uxf.l, av8Var, 6);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m = av8Var.m();
                        xtc C = fqj.C(av8Var, s);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a, hf3.g);
                        waa.K(av8Var, m, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var, hf3.k);
                        Iterator p = ljg.p(av8Var, C, hf3.d, 1412366712, gv9Var);
                        while (p.hasNext()) {
                            FantasyPlayerPriceChanges fantasyPlayerPriceChanges = (FantasyPlayerPriceChanges) p.next();
                            av8Var.a0(42276803, Integer.valueOf(fantasyPlayerPriceChanges.getFantasyPlayerId()));
                            fkf.g(fantasyPlayerPriceChanges, z2, null, av8Var, 0);
                            av8Var.s(false);
                        }
                        ljg.t(av8Var, false, true, false);
                    }
                    if (gv9Var2.isEmpty()) {
                        av8Var2 = av8Var;
                        av8Var2.d0(354965320);
                        av8Var2.s(false);
                    } else {
                        av8Var.d0(354144626);
                        av8 av8Var4 = av8Var;
                        rha.c(oea.v(R.string.fantasy_latest_articles, av8Var), null, yqo.H(825915669, av8Var, new f91(r3, function02)), av8Var4, 384, 2);
                        av8Var2 = av8Var4;
                        for (FantasyNewsArticle fantasyNewsArticle : gv9Var2) {
                            av8Var2.a0(-1853721574, Integer.valueOf(fantasyNewsArticle.getId()));
                            nq8.h(av8Var2, bkh.e(utcVar, 8.0f));
                            xtc d0 = l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                            boolean g = av8Var2.g(function1);
                            Object O3 = av8Var2.O();
                            if (g || O3 == a99Var) {
                                O3 = new k46(16, function1);
                                av8Var2.n0(O3);
                            }
                            fqj.h(fantasyNewsArticle, (Function1) O3, d0, av8Var2, 384);
                            av8Var2.s(false);
                        }
                        av8Var2.s(false);
                    }
                    nq8.h(av8Var2, bkh.e(utcVar, 8.0f));
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 1:
                String str = (String) obj8;
                e1d e1dVar = (e1d) obj7;
                wb7 wb7Var = (wb7) obj6;
                k7d k7dVar = (k7d) obj4;
                ComponentActivity componentActivity = (ComponentActivity) obj5;
                xtc xtcVar = (xtc) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xtcVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var2).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var2;
                if (av8Var5.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    a aVar = FantasyOnboardingStepsNavigation.Companion;
                    FantasyOnboardingStepsNavigation.SelectCompetition selectCompetition = FantasyOnboardingStepsNavigation.SelectCompetition.INSTANCE;
                    aVar.getClass();
                    boolean b = a.b(str, selectCompetition);
                    boolean b2 = a.b(str, FantasyOnboardingStepsNavigation.CreateTeam.INSTANCE);
                    l8g a2 = k8g.a(ww9.b, uxf.l, av8Var5, 0);
                    int hashCode2 = Long.hashCode(av8Var5.T);
                    aee m2 = av8Var5.m();
                    xtc C2 = fqj.C(av8Var5, utcVar2);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var2);
                    } else {
                        av8Var5.q0();
                    }
                    waa.K(av8Var5, a2, hf3.g);
                    waa.K(av8Var5, m2, hf3.f);
                    waa.K(av8Var5, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var5, hf3.k);
                    waa.K(av8Var5, C2, hf3.d);
                    if (z2) {
                        av8Var5.d0(-2016763429);
                        ImageVector N = s6a.N(R.drawable.ic_arrow_back, 6, av8Var5);
                        long D2 = lz.D(R.color.n_lv_1, av8Var5);
                        xtc l = bkh.l(l98.f0(xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 24.0f);
                        boolean g2 = av8Var5.g(e1dVar) | av8Var5.h(b2) | av8Var5.i(wb7Var) | av8Var5.i(k7dVar) | av8Var5.i(componentActivity);
                        Object O4 = av8Var5.O();
                        if (g2 || O4 == a99Var) {
                            O4 = new tb7(0, wb7Var, k7dVar, componentActivity, e1dVar, b2);
                            av8Var5.n0(O4);
                        }
                        kq9.b(N, null, tol.y(l, false, false, false, 0L, null, (Function0) O4, av8Var5, 29), D2, av8Var5, 48, 0);
                        av8Var5 = av8Var5;
                        av8Var5.s(false);
                    } else {
                        av8Var5.d0(-2015814116);
                        av8Var5.s(false);
                    }
                    if (b || ((pb7) e1dVar.getValue()).a == uj7.a) {
                        av8Var5.d0(-2015123684);
                        av8Var5.s(false);
                    } else {
                        av8Var5.d0(-203568274);
                        ev6 ev6Var = ((pb7) e1dVar.getValue()).f;
                        if (ev6Var == null) {
                            av8Var5.d0(-2015649197);
                            z = false;
                            av8Var5.s(false);
                        } else {
                            z = false;
                            av8Var5.d0(-2015649196);
                            td4.p(ev6Var.d, ev6Var.g, ev6Var.a, ev6Var.y, bkh.l(utcVar2, 24.0f), av8Var5, 24576);
                            av8Var5.s(false);
                        }
                        av8Var5.s(z);
                    }
                    av8Var5.s(true);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            default:
                FantasyCompetitionType fantasyCompetitionType = (FantasyCompetitionType) obj8;
                mei meiVar = (mei) obj7;
                q67 q67Var = (q67) obj6;
                Function1 function12 = (Function1) obj5;
                qug qugVar = (qug) obj4;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var6 = (av8) of3Var3;
                if (av8Var6.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    u23 a3 = t23.a(ww9.d, uxf.o, av8Var6, 0);
                    int hashCode3 = Long.hashCode(av8Var6.T);
                    aee m3 = av8Var6.m();
                    xtc C3 = fqj.C(av8Var6, utcVar2);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var3);
                    } else {
                        av8Var6.q0();
                    }
                    waa.K(av8Var6, a3, hf3.g);
                    waa.K(av8Var6, m3, hf3.f);
                    waa.K(av8Var6, Integer.valueOf(hashCode3), hf3.j);
                    waa.J(av8Var6, hf3.k);
                    waa.K(av8Var6, C3, hf3.d);
                    i9a.l(64, lz.D(R.color.error, av8Var6), av8Var6, l98.f0(n9e.q(bkh.d(utcVar2, 1.0f), lz.D(R.color.surface_1, av8Var6), oyn.e), 16.0f, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 4), haa.t(R.drawable.ic_transfer_out_16, 0, av8Var6), oea.v(R.string.squad_change_player_out, av8Var6));
                    int i2 = ek7.a[fantasyCompetitionType.ordinal()];
                    boolean z3 = this.b;
                    if (i2 == 1) {
                        av8Var6.d0(57082143);
                        ww9.g(q67Var, z3, null, Integer.valueOf(meiVar.ordinal()), null, function12, qugVar, false, null, false, false, false, false, av8Var6, 196656, 0, 16136);
                        av8Var6.s(false);
                    } else {
                        if (i2 != 2) {
                            throw dmi.h(av8Var6, -413803711, false);
                        }
                        av8Var6.d0(57699105);
                        tgj.e(q67Var, z3, null, meiVar, null, function12, qugVar, false, null, av8Var6, 24576, 1924);
                        av8Var6.s(false);
                    }
                    av8Var6.s(true);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ o87(FantasyCompetitionType fantasyCompetitionType, mei meiVar, q67 q67Var, boolean z, Function1 function1, qug qugVar) {
        this.c = fantasyCompetitionType;
        this.d = meiVar;
        this.e = q67Var;
        this.b = z;
        this.g = function1;
        this.f = qugVar;
    }

    public /* synthetic */ o87(String str, boolean z, e1d e1dVar, wb7 wb7Var, k7d k7dVar, ComponentActivity componentActivity) {
        this.c = str;
        this.b = z;
        this.d = e1dVar;
        this.e = wb7Var;
        this.f = k7dVar;
        this.g = componentActivity;
    }
}
