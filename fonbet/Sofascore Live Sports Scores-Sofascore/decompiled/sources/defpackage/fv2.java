package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.W3;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Inning;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;
import com.sofascore.results.country.CountryListBottomSheet;
import com.sofascore.results.crowdsourcing.EventContributeFragment;
import com.sofascore.results.event.aiInsights.EventAiInsightsFragment;
import com.sofascore.results.event.baseballPrematchLineups.EventBaseballPrematchLineupsFragment;
import com.sofascore.results.event.boxscoreAnimation.EventBoxScoreFragmentNew;
import com.sofascore.results.event.commentary.EventCommentaryFragment;
import com.sofascore.results.event.games.EventEsportsGamesFragment;
import com.sofascore.results.event.mmastatistics.EventMmaStatisticsFragment;
import com.sofascore.results.event.odds.eventrecomended.EventRecommendedOddsFragment;
import com.sofascore.results.event.scorecard.EventScorecardFragment;
import com.sofascore.results.profile.contributionScreen.ContributionPerformanceFragment;
import com.sofascore.results.profile.contributionScreen.contributionLogDialog.ContributionLogDialog;
import com.sofascore.results.settings.developer.DeveloperOptionsFullScreenDialog;
import com.unity3d.services.UnityAdsConstants;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class fv2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fv2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.a;
        Object obj3 = null;
        a99 a99Var = nf3.a;
        int i2 = 2;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                qn2 qn2Var = (qn2) obj4;
                ((Integer) obj).getClass();
                if (obj2 instanceof qe3) {
                    qe3 qe3Var = (qe3) obj2;
                    y0d y0dVar = (y0d) qn2Var.h;
                    if (y0dVar == null) {
                        y0d y0dVar2 = rrg.a;
                        y0dVar = new y0d();
                        qn2Var.h = y0dVar;
                    }
                    y0dVar.k(qe3Var);
                    ((i1d) qn2Var.f).b(qe3Var);
                }
                if (obj2 instanceof ev8) {
                    qn2Var.i((ev8) obj2);
                }
                if (obj2 instanceof eqf) {
                    ((eqf) obj2).c();
                }
                break;
            case 2:
                ContributionLogDialog contributionLogDialog = (ContributionLogDialog) obj4;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    int i3 = contributionLogDialog.requireArguments().getInt("LOGS_INDEX", 0);
                    e1d x = rfo.x(((ks3) contributionLogDialog.x.getValue()).f, av8Var, 0);
                    if (((vnb) x.getValue()) instanceof unb) {
                        av8Var.d0(524151929);
                        t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 7);
                        boolean g = av8Var.g(x) | av8Var.e(i3);
                        Object O = av8Var.O();
                        Object obj5 = O;
                        if (g || O == a99Var) {
                            tj tjVar = new tj(i3, x, 3);
                            av8Var.n0(tjVar);
                            obj5 = tjVar;
                        }
                        v8a.a(null, null, C, null, null, null, false, null, (Function1) obj5, av8Var, 384, PglCryptUtils.UNKNOWN_ERR);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1784190452);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                break;
            case 3:
                ContributionPerformanceFragment contributionPerformanceFragment = (ContributionPerformanceFragment) obj4;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    pd0.b((ks3) contributionPerformanceFragment.r.getValue(), null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                l98.I((tbj) obj4, (of3) obj, aba.K(1));
                break;
            case 5:
                CountryListBottomSheet countryListBottomSheet = (CountryListBottomSheet) obj4;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Context context = (Context) av8Var3.k(nz.b);
                    Object O2 = av8Var3.O();
                    int i4 = 27;
                    if (O2 == a99Var) {
                        ArrayList arrayList = dv3.a;
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Country country = (Country) it.next();
                            arrayList2.add(new uv3(country.getName(), country.getIso2Alpha(), false));
                        }
                        context.getClass();
                        Comparator thenComparing = new z(8).thenComparing(new rs2(new vn6(i4, Collator.getInstance(Locale.getDefault()), context), 2));
                        thenComparing.getClass();
                        O2 = e.f(l6g.W(CollectionsKt.H0(arrayList2, thenComparing)));
                        av8Var3.n0(O2);
                    }
                    gv9 gv9Var = (gv9) ((e1d) O2).getValue();
                    uv3 uv3Var = (uv3) countryListBottomSheet.D.getValue();
                    boolean i5 = av8Var3.i(countryListBottomSheet);
                    Object O3 = av8Var3.O();
                    if (i5 || O3 == a99Var) {
                        O3 = new ox1(countryListBottomSheet, i4);
                        av8Var3.n0(O3);
                    }
                    un0.d(gv9Var, uv3Var, (Function1) O3, 0L, 0L, null, 0L, null, 0L, 0L, null, false, av8Var3, 0, 0, 4088);
                } else {
                    av8Var3.W();
                }
                break;
            case 6:
                tc4 tc4Var = (tc4) obj4;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    zm2.e(ke0.c, tc4Var.getOddsState(), kda.w(utc.a), av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                break;
            case 7:
                break;
            case 8:
                ((Integer) obj2).getClass();
                av8 av8Var5 = (av8) ((of3) obj);
                av8Var5.d0(666084174);
                String str2 = ((m8j) obj4).b;
                av8Var5.s(false);
                break;
            case 9:
                DeveloperOptionsFullScreenDialog developerOptionsFullScreenDialog = (DeveloperOptionsFullScreenDialog) obj4;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var5;
                if (av8Var6.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    q05 q05Var = (q05) developerOptionsFullScreenDialog.A.getValue();
                    boolean i6 = av8Var6.i(developerOptionsFullScreenDialog);
                    Object O4 = av8Var6.O();
                    if (i6 || O4 == a99Var) {
                        ny nyVar = new ny(0, developerOptionsFullScreenDialog, DeveloperOptionsFullScreenDialog.class, "dismiss", "dismiss()V", 0, 13);
                        av8Var6.n0(nyVar);
                        O4 = nyVar;
                    }
                    Function0 function0 = (Function0) ((KFunction) O4);
                    boolean i7 = av8Var6.i(developerOptionsFullScreenDialog);
                    Object O5 = av8Var6.O();
                    if (i7 || O5 == a99Var) {
                        O5 = new h63(developerOptionsFullScreenDialog, 17);
                        av8Var6.n0(O5);
                    }
                    t62.f(q05Var, function0, (Function0) O5, av8Var6, 0);
                } else {
                    av8Var6.W();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                rd0.d((y15) obj4, (of3) obj, aba.K(1));
                break;
            case 11:
                float floatValue = ((Float) obj2).floatValue();
                ((mze) obj).a();
                ((csf) obj4).a = floatValue;
                break;
            case 12:
                EventAiInsightsFragment eventAiInsightsFragment = (EventAiInsightsFragment) obj4;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var6;
                if (av8Var7.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    xs5 E = eventAiInsightsFragment.E();
                    boolean i8 = av8Var7.i(eventAiInsightsFragment);
                    Object O6 = av8Var7.O();
                    if (i8 || O6 == a99Var) {
                        O6 = new kz3(eventAiInsightsFragment, 18);
                        av8Var7.n0(O6);
                    }
                    Function1 function1 = (Function1) O6;
                    boolean i9 = av8Var7.i(eventAiInsightsFragment);
                    Object O7 = av8Var7.O();
                    if (i9 || O7 == a99Var) {
                        k43 k43Var = new k43(1, eventAiInsightsFragment, EventAiInsightsFragment.class, "setUpAnalyticsData", "setUpAnalyticsData(Z)V", 0, 15);
                        av8Var7.n0(k43Var);
                        O7 = k43Var;
                    }
                    u6h.h(E, function1, (Function1) ((KFunction) O7), av8Var7, 0);
                } else {
                    av8Var7.W();
                }
                break;
            case 13:
                EventBaseballPrematchLineupsFragment eventBaseballPrematchLineupsFragment = (EventBaseballPrematchLineupsFragment) obj4;
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var8 = (av8) of3Var7;
                if (av8Var8.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    fqj.c((ct5) eventBaseballPrematchLineupsFragment.r.getValue(), av8Var8, 0);
                } else {
                    av8Var8.W();
                }
                break;
            case 14:
                EventBoxScoreFragmentNew eventBoxScoreFragmentNew = (EventBoxScoreFragmentNew) obj4;
                of3 of3Var8 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var9 = (av8) of3Var8;
                if (av8Var9.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    yqo.e((ov5) eventBoxScoreFragmentNew.s.getValue(), av8Var9, 0);
                } else {
                    av8Var9.W();
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                yqo.e((ov5) obj4, (of3) obj, aba.K(1));
                break;
            case 16:
                EventCommentaryFragment eventCommentaryFragment = (EventCommentaryFragment) obj4;
                String str3 = (String) obj;
                ((Integer) obj2).getClass();
                str3.getClass();
                eventCommentaryFragment.w = str3;
                EventCommentaryFragment.I(eventCommentaryFragment, false, null, 6);
                break;
            case 17:
                EventContributeFragment eventContributeFragment = (EventContributeFragment) obj4;
                of3 of3Var9 = (of3) obj;
                int intValue9 = ((Integer) obj2).intValue();
                av8 av8Var10 = (av8) of3Var9;
                if (av8Var10.T(intValue9 & 1, (intValue9 & 3) != 2)) {
                    k64 k64Var = (k64) rfo.v(eventContributeFragment.D().y, h64.a, av8Var10, 48).getValue();
                    Object O8 = av8Var10.O();
                    if (O8 == a99Var) {
                        O8 = new au5(4);
                        av8Var10.n0(O8);
                    }
                    l98.b(k64Var, null, null, null, "ContributeScreenAnimationContent", (Function1) O8, yqo.H(-2091031443, av8Var10, new jw5(eventContributeFragment, r8 ? 1 : 0)), av8Var10, 1794048, 14);
                } else {
                    av8Var10.W();
                }
                break;
            case 18:
                int intValue10 = ((Integer) obj2).intValue();
                ((String) obj).getClass();
                ((EventEsportsGamesFragment) obj4).H(intValue10);
                break;
            case 19:
                ((Integer) obj2).getClass();
                fkf.H((bnf) obj4, (of3) obj, aba.K(1));
                break;
            case 20:
                EventMmaStatisticsFragment eventMmaStatisticsFragment = (EventMmaStatisticsFragment) obj4;
                of3 of3Var10 = (of3) obj;
                int intValue11 = ((Integer) obj2).intValue();
                av8 av8Var11 = (av8) of3Var10;
                if (av8Var11.T(intValue11 & 1, (intValue11 & 3) != 2)) {
                    jnc jncVar = (jnc) eventMmaStatisticsFragment.u.getValue();
                    boolean i10 = av8Var11.i(jncVar);
                    Object O9 = av8Var11.O();
                    if (i10 || O9 == a99Var) {
                        s26 s26Var = new s26(1, jncVar, jnc.class, "setDisplayMode", "setDisplayMode(Lcom/sofascore/common/MmaStatsDisplayMode;)V", 0, 1);
                        av8Var11.n0(s26Var);
                        O9 = s26Var;
                    }
                    wba.a(true, (Function1) ((KFunction) O9), av8Var11, 6);
                } else {
                    av8Var11.W();
                }
                break;
            case 21:
                String str4 = (String) obj;
                ((Integer) obj2).getClass();
                str4.getClass();
                ((b56) obj4).setHomeSelected(str4.equals("First"));
                break;
            case 22:
                EventRecommendedOddsFragment eventRecommendedOddsFragment = (EventRecommendedOddsFragment) obj4;
                of3 of3Var11 = (of3) obj;
                int intValue12 = ((Integer) obj2).intValue();
                av8 av8Var12 = (av8) of3Var11;
                if (av8Var12.T(intValue12 & 1, (intValue12 & 3) != 2)) {
                    e1d x2 = rfo.x(eventRecommendedOddsFragment.D().f, av8Var12, 0);
                    e1d x3 = rfo.x(eventRecommendedOddsFragment.D().j, av8Var12, 0);
                    hof hofVar = eventRecommendedOddsFragment.D().h;
                    boolean i11 = av8Var12.i(eventRecommendedOddsFragment) | av8Var12.g(x2);
                    Object O10 = av8Var12.O();
                    Object obj6 = O10;
                    if (i11 || O10 == a99Var) {
                        xw5 xw5Var = new xw5(11, eventRecommendedOddsFragment, x2);
                        av8Var12.n0(xw5Var);
                        obj6 = xw5Var;
                    }
                    w1a.c(hofVar, null, (Function1) obj6, av8Var12, 0, 14);
                    boolean booleanValue = ((Boolean) x3.getValue()).booleanValue();
                    vmd vmdVar = vmd.EVENT_DETAILS;
                    vnb vnbVar = (vnb) x2.getValue();
                    l66 D = eventRecommendedOddsFragment.D();
                    boolean i12 = av8Var12.i(D);
                    Object O11 = av8Var12.O();
                    if (i12 || O11 == a99Var) {
                        s26 s26Var2 = new s26(1, D, l66.class, "onAction", "onAction(Lcom/sofascore/results/event/odds/eventrecomended/EventRecommendedOddsAction;)V", 0, 2);
                        av8Var12.n0(s26Var2);
                        O11 = s26Var2;
                    }
                    pco.e(384, av8Var12, vnbVar, (Function1) ((KFunction) O11), booleanValue);
                } else {
                    av8Var12.W();
                }
                break;
            case 23:
                EventScorecardFragment eventScorecardFragment = (EventScorecardFragment) obj4;
                of3 of3Var12 = (of3) obj;
                int intValue13 = ((Integer) obj2).intValue();
                av8 av8Var13 = (av8) of3Var12;
                if (av8Var13.T(intValue13 & 1, (intValue13 & 3) != 2)) {
                    av8Var13.d0(1896835309);
                    List<q16> list = (List) ((eoh) eventScorecardFragment.x).getValue();
                    ArrayList arrayList3 = new ArrayList(k13.r(list, 10));
                    for (q16 q16Var : list) {
                        Inning inning = q16Var.a;
                        Team battingTeam = inning.getBattingTeam();
                        if (battingTeam != null) {
                            String string = inning.getSuperOver() == null ? eventScorecardFragment.requireContext().getString(R.string.status_inning, yid.p((inning.getNumber() + 1) / 2)) : eventScorecardFragment.requireContext().getString(R.string.cricket_super_over_number, String.valueOf(inning.getSuperOver()));
                            string.getClass();
                            Context requireContext = eventScorecardFragment.requireContext();
                            requireContext.getClass();
                            str = wv8.i(tba.p(requireContext, battingTeam), " ", string);
                        } else {
                            str = null;
                        }
                        arrayList3.add(new oxh(q16Var, str, yqo.H(-1057348953, av8Var13, new s16(q16Var, 5)), null, null, false, 248));
                    }
                    av8Var13.s(false);
                    gv9 W = l6g.W(arrayList3);
                    Iterator<E> it2 = W.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (Intrinsics.c(((oxh) next).a, (q16) ((eoh) eventScorecardFragment.y).getValue())) {
                                obj3 = next;
                            }
                        }
                    }
                    oxh oxhVar = (oxh) obj3;
                    boolean i13 = av8Var13.i(eventScorecardFragment);
                    Object O12 = av8Var13.O();
                    if (i13 || O12 == a99Var) {
                        O12 = new q66(eventScorecardFragment, i2);
                        av8Var13.n0(O12);
                    }
                    r4a.j(W, oxhVar, (Function1) O12, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var13, 0, W3.l);
                } else {
                    av8Var13.W();
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                fcp.I((s4c) obj4, (of3) obj, aba.K(1));
                break;
            case 25:
                wa6 wa6Var = (wa6) obj4;
                of3 of3Var13 = (of3) obj;
                int intValue14 = ((Integer) obj2).intValue();
                av8 av8Var14 = (av8) of3Var13;
                if (av8Var14.T(intValue14 & 1, (intValue14 & 3) != 2)) {
                    bx7 bx7Var = wa6Var.l;
                    fy7 fy7Var = bx7Var.g;
                    fy7 fy7Var2 = bx7Var.h;
                    if (fy7Var != null && fy7Var2 != null) {
                        l98.s(fy7Var, fy7Var2, bx7Var.r, wa6Var.k, bx7Var.s, av8Var14, 0);
                    }
                } else {
                    av8Var14.W();
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                ((vb6) obj4).j(aba.K(1), (of3) obj);
                break;
            case 27:
                cy5 cy5Var = (cy5) obj4;
                of3 of3Var14 = (of3) obj;
                int intValue15 = ((Integer) obj2).intValue();
                av8 av8Var15 = (av8) of3Var14;
                if (av8Var15.T(intValue15 & 1, (intValue15 & 3) != 2)) {
                    long U = hkg.U(cy5Var.g, av8Var15, true, cy5Var.f);
                    long j = r13.h;
                    xtc q = n9e.q(wnn.A(bkh.e(new goa(1.0f, true), 6.0f), o7g.a(16.0f)), lz.D(R.color.n_lv_5, av8Var15), oyn.e);
                    boolean g2 = av8Var15.g(cy5Var);
                    Object O13 = av8Var15.O();
                    if (g2 || O13 == a99Var) {
                        O13 = new wb6(cy5Var, 1);
                        av8Var15.n0(O13);
                    }
                    Function0 function02 = (Function0) O13;
                    Object O14 = av8Var15.O();
                    if (O14 == a99Var) {
                        O14 = new au5(26);
                        av8Var15.n0(O14);
                    }
                    ncf.c(function02, q, U, j, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Function1) O14, av8Var15, 1772544);
                } else {
                    av8Var15.W();
                }
                break;
            case 28:
                ((Integer) obj2).getClass();
                ((ic6) obj4).a(aba.K(1), (of3) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                un0.r((ny5) obj4, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fv2(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
