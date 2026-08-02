package defpackage;

import com.sofascore.model.Sports;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class wn6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ppb b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ wn6(ppb ppbVar, Function1 function1, int i) {
        this.a = i;
        this.b = ppbVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        final Function1 function1 = this.c;
        final ppb ppbVar = this.b;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                yoa yoaVar = (yoa) obj;
                yoaVar.getClass();
                gv9 gv9Var = ppbVar.c;
                gv9 gv9Var2 = ppbVar.b;
                if (!gv9Var.isEmpty()) {
                    yoaVar.j("coming_soon_header", new au5(29), "header", cd3.a);
                    yoaVar.l(gv9Var.size(), new zi(20, new yn6(0), gv9Var), new zi(21, new yn6(1), gv9Var), new tc3(-1117249557, new vw5(gv9Var, function1, 1), true));
                    yoaVar.j(AdType.Banner.FantasySmall.getLabel(), new yn6(2), "banner_ads_FantasySmall", cd3.b);
                }
                if (!gv9Var2.isEmpty()) {
                    yoaVar.j("active_competitions_header", new yn6(3), "header", cd3.c);
                    yoaVar.l(gv9Var2.size(), new zi(22, new yn6(4), gv9Var2), new zi(23, new yn6(5), gv9Var2), new tc3(-1117249557, new vw5(gv9Var2, function1, 2), true));
                    yoaVar.j(AdType.Banner.FantasyBig.getLabel(), new yn6(6), "banner_ads_FantasyBig", cd3.d);
                }
                break;
            default:
                esa esaVar = (esa) obj;
                esaVar.getClass();
                FantasyRemoteAnnouncement fantasyRemoteAnnouncement = ppbVar.e;
                gv9 gv9Var3 = ppbVar.a;
                if (fantasyRemoteAnnouncement != null) {
                    esaVar.f("announcement", "announcement", new tc3(1847201946, new s16(ppbVar, 8), true));
                }
                if (ppbVar.f) {
                    esaVar.f("feedback_bubble", "info_bubble", new tc3(-794492861, new ct8() { // from class: bo6
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            String str;
                            int i4 = i2;
                            a99 a99Var = nf3.a;
                            utc utcVar = utc.a;
                            Function1 function12 = function1;
                            ppb ppbVar2 = ppbVar;
                            switch (i4) {
                                case 0:
                                    xpa xpaVar = (xpa) obj2;
                                    of3 of3Var = (of3) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    xpaVar.getClass();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                                    }
                                    av8 av8Var = (av8) of3Var;
                                    if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                                        String v = oea.v(R.string.fantasy_feedback_text, av8Var);
                                        String v2 = oea.v(R.string.fantasy_feedback_button, av8Var);
                                        xtc a = xpa.a(xpaVar, l98.f0(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ppbVar2.e == null ? 8.0f : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5), 7);
                                        boolean g = av8Var.g(function12);
                                        Object O = av8Var.O();
                                        if (g || O == a99Var) {
                                            O = new is5(9, function12);
                                            av8Var.n0(O);
                                        }
                                        Function0 function0 = (Function0) O;
                                        boolean g2 = av8Var.g(function12);
                                        Object O2 = av8Var.O();
                                        if (g2 || O2 == a99Var) {
                                            O2 = new is5(10, function12);
                                            av8Var.n0(O2);
                                        }
                                        ao2.c(v, v2, function0, a, (Function0) O2, av8Var, 0);
                                    } else {
                                        av8Var.W();
                                    }
                                    break;
                                default:
                                    xpa xpaVar2 = (xpa) obj2;
                                    of3 of3Var2 = (of3) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    xpaVar2.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((av8) of3Var2).g(xpaVar2) ? 4 : 2;
                                    }
                                    av8 av8Var2 = (av8) of3Var2;
                                    if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        String v3 = oea.v(R.string.in_progress, av8Var2);
                                        if (ppbVar2.a.size() > 1) {
                                            str = ljg.k(av8Var2, 1948376908, R.string.reorder, av8Var2, false);
                                        } else {
                                            av8Var2.d0(270188443);
                                            av8Var2.s(false);
                                            str = null;
                                        }
                                        String str2 = str;
                                        xtc f0 = l98.f0(l98.d0(xpa.a(xpaVar2, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                                        boolean g3 = av8Var2.g(function12);
                                        Object O3 = av8Var2.O();
                                        if (g3 || O3 == a99Var) {
                                            O3 = new is5(8, function12);
                                            av8Var2.n0(O3);
                                        }
                                        vha.a(v3, f0, null, str2, null, null, (Function0) O3, av8Var2, 0, 52);
                                    } else {
                                        av8Var2.W();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true));
                }
                if (!gv9Var3.isEmpty()) {
                    esaVar.f("in_progress_competitions_header", "header", new tc3(1843366178, new ct8() { // from class: bo6
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            String str;
                            int i4 = i3;
                            a99 a99Var = nf3.a;
                            utc utcVar = utc.a;
                            Function1 function12 = function1;
                            ppb ppbVar2 = ppbVar;
                            switch (i4) {
                                case 0:
                                    xpa xpaVar = (xpa) obj2;
                                    of3 of3Var = (of3) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    xpaVar.getClass();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                                    }
                                    av8 av8Var = (av8) of3Var;
                                    if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                                        String v = oea.v(R.string.fantasy_feedback_text, av8Var);
                                        String v2 = oea.v(R.string.fantasy_feedback_button, av8Var);
                                        xtc a = xpa.a(xpaVar, l98.f0(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ppbVar2.e == null ? 8.0f : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 5), 7);
                                        boolean g = av8Var.g(function12);
                                        Object O = av8Var.O();
                                        if (g || O == a99Var) {
                                            O = new is5(9, function12);
                                            av8Var.n0(O);
                                        }
                                        Function0 function0 = (Function0) O;
                                        boolean g2 = av8Var.g(function12);
                                        Object O2 = av8Var.O();
                                        if (g2 || O2 == a99Var) {
                                            O2 = new is5(10, function12);
                                            av8Var.n0(O2);
                                        }
                                        ao2.c(v, v2, function0, a, (Function0) O2, av8Var, 0);
                                    } else {
                                        av8Var.W();
                                    }
                                    break;
                                default:
                                    xpa xpaVar2 = (xpa) obj2;
                                    of3 of3Var2 = (of3) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    xpaVar2.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((av8) of3Var2).g(xpaVar2) ? 4 : 2;
                                    }
                                    av8 av8Var2 = (av8) of3Var2;
                                    if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        String v3 = oea.v(R.string.in_progress, av8Var2);
                                        if (ppbVar2.a.size() > 1) {
                                            str = ljg.k(av8Var2, 1948376908, R.string.reorder, av8Var2, false);
                                        } else {
                                            av8Var2.d0(270188443);
                                            av8Var2.s(false);
                                            str = null;
                                        }
                                        String str2 = str;
                                        xtc f0 = l98.f0(l98.d0(xpa.a(xpaVar2, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                                        boolean g3 = av8Var2.g(function12);
                                        Object O3 = av8Var2.O();
                                        if (g3 || O3 == a99Var) {
                                            O3 = new is5(8, function12);
                                            av8Var2.n0(O3);
                                        }
                                        vha.a(v3, f0, null, str2, null, null, (Function0) O3, av8Var2, 0, 52);
                                    } else {
                                        av8Var2.W();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true));
                    int size = gv9Var3.size();
                    tee L = l6g.L(new Pair(0, new sz0(AdType.Banner.FantasySmall, l6g.L(new Pair(SearchResponseKt.SPORT_ENTITY, Sports.FOOTBALL), new Pair("page", "fantasy")))));
                    for (int i4 = 0; i4 < size; i4++) {
                        esaVar.f(Integer.valueOf(((do7) gv9Var3.get(i4)).a), "user_competition", new tc3(-987070095, new co6(i4, L, ppbVar, function1), true));
                        sz0 sz0Var = (sz0) L.get(Integer.valueOf(i4));
                        if (sz0Var != null) {
                            AdType.Banner banner = sz0Var.a;
                            esaVar.f(banner + "_" + i4 + "_null", "banner_ads_" + banner, new tc3(1323635312, new moa(sz0Var, 8, 8), true));
                        }
                    }
                }
                gv9 gv9Var4 = ppbVar.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : gv9Var4) {
                    if (((mp6) obj2).h != lp6.a) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    esaVar.f("popular_competitions_header", "header", new tc3(186257921, new y47(10, function1), true));
                    esaVar.f("popular_competitions_row", "popular_competitions_row", new tc3(1139501418, new qm4(5, arrayList, function1), true));
                }
                if (ppbVar.g) {
                    esaVar.f("finished_competitions_button", "finished_competitions_button", dd3.a);
                }
                esaVar.f(AdType.Banner.FantasyBig.getLabel(), "banner_ads_FantasyBig", dd3.b);
                break;
        }
        return Unit.a;
    }
}
