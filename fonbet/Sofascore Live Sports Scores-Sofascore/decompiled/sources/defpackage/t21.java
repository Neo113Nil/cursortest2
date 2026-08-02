package defpackage;

import android.graphics.RectF;
import android.view.inputmethod.InputMethodManager;
import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.analytics.enums.ThumbnailFormat;
import com.blaze.blazesdk.analytics.enums.ThumbnailType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsReferring;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsWidget;
import com.blaze.blazesdk.custom_views.BlazeRecyclerView;
import com.blaze.blazesdk.delegates.BlazeWidgetDelegate;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickHandlerState;
import com.blaze.blazesdk.delegates.models.BlazeWidgetItemClickParams;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;
import com.sofascore.model.cuptree.CupTree;
import com.sofascore.results.R;
import com.sofascore.results.chat.addcountry.ChatCountryFlagBottomSheet;
import com.sofascore.results.event.commentary.baseball.BaseballCommentaryModal;
import com.sofascore.results.event.dialog.AttackMomentumInfoBottomSheet;
import com.sofascore.results.event.lineups.BaseEventLineupsFragment;
import com.sofascore.results.event.odds.additionalodds.AdditionalOddsFragment;
import com.sofascore.results.event.odds.oddscomparison.AdditionalOddsComparisonFragment;
import com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment;
import com.sofascore.results.main.matches.redesign.chronologicalmatches.ChronologicalMatchesFragment;
import com.sofascore.results.media.BaseMediaFragment;
import com.sofascore.results.player.statistics.season.baseball.BaseballPlayerSeasonStatisticsFragment;
import com.sofascore.results.pots.highestRated.POTSHighestRatedPlayersFragment;
import com.sofascore.results.pots.mostAwards.POTSMostAwardsFragment;
import com.sofascore.results.pots.topLeagues.POTSTopLeaguesFragment;
import com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class t21 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t21(ev6 ev6Var) {
        this.a = 1;
        this.b = ev6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0200  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean i;
        Object obj3;
        List list;
        boolean z;
        String str;
        BlazeWidgetItemClickHandlerState blazeWidgetItemClickHandlerState;
        Object obj4;
        int i2;
        Integer t;
        int i3 = this.a;
        int i4 = 6;
        int i5 = 28;
        Object obj5 = nf3.a;
        int i6 = 2;
        int i7 = 3;
        Object obj6 = this.b;
        switch (i3) {
            case 0:
                BaseEventLineupsFragment baseEventLineupsFragment = (BaseEventLineupsFragment) obj6;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    e1d x = rfo.x(baseEventLineupsFragment.D().f, av8Var, 0);
                    hof hofVar = baseEventLineupsFragment.D().h;
                    boolean i8 = av8Var.i(baseEventLineupsFragment);
                    Object O = av8Var.O();
                    if (i8 || O == obj5) {
                        O = new u2(baseEventLineupsFragment, 12);
                        av8Var.n0(O);
                    }
                    w1a.c(hofVar, null, (Function1) O, av8Var, 0, 14);
                    xhf J = x2a.J(av8Var);
                    boolean booleanValue = ((Boolean) baseEventLineupsFragment.E().invoke((vnb) x.getValue())).booleanValue();
                    g28 g28Var = bkh.c;
                    boolean i9 = av8Var.i(baseEventLineupsFragment);
                    Object O2 = av8Var.O();
                    if (i9 || O2 == obj5) {
                        O2 = new z0(baseEventLineupsFragment, 19);
                        av8Var.n0(O2);
                    }
                    x2a.h(booleanValue, (Function0) O2, g28Var, J, null, yqo.H(-300199538, av8Var, new d67(3, baseEventLineupsFragment, J, x)), yqo.H(-734163219, av8Var, new hl6(14, x, baseEventLineupsFragment)), av8Var, 1769856);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ev6 ev6Var = (ev6) obj6;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    g28 g28Var2 = bkh.c;
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, g28Var2);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, c, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    d7e t2 = haa.t(2131231477, 0, av8Var2);
                    jf9 jf9Var = oyn.e;
                    wkn.k(t2, null, yqo.u(g28Var2, 2.0f, 2.0f, jf9Var), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 25016, 104);
                    e12.a(0, av8Var2, n9e.q(g28Var2, lz.D(R.color.darken_overlay_2, av8Var2), jf9Var));
                    kv1 kv1Var = uxf.p;
                    utc utcVar = utc.a;
                    xtc b0 = l98.b0(n12.a.a(bkh.s(utcVar, 3), uxf.g), 8.0f);
                    u23 a = t23.a(ww9.d, kv1Var, av8Var2, 48);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, b0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, f50Var);
                    waa.K(av8Var2, m2, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var3);
                    kq9.b(s6a.N(R.drawable.ic_sofascore_logo_watermark, 6, av8Var2), null, null, lz.D(R.color.on_color_primary, av8Var2), av8Var2, 48, 4);
                    nq8.h(av8Var2, bkh.e(utcVar, 48.0f));
                    td4.q(ev6Var.g, ev6Var.a, ev6Var.y, bkh.l(utcVar, 64.0f), av8Var2, 3072);
                    nq8.h(av8Var2, bkh.e(utcVar, 8.0f));
                    String str2 = ev6Var.e;
                    long D = lz.D(R.color.on_color_primary, av8Var2);
                    yf8 yf8Var = xth.a;
                    udj.c(str2, null, D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.h(), av8Var2, 0, 0, 130042);
                    udj.c(bf3.g(48.0f, R.string.fantasy_in_partnership_with, av8Var2, av8Var2, utcVar), null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var2, 0, 0, 130042);
                    String str3 = ev6Var.z;
                    if (str3 == null) {
                        av8Var2.d0(933281747);
                        av8Var2.s(false);
                    } else {
                        bf3.r(8.0f, 933281748, av8Var2, av8Var2, utcVar);
                        udj.c(str3, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var2, 0, 0, 130042);
                        Unit unit = Unit.a;
                        av8Var2.s(false);
                    }
                    nq8.h(av8Var2, bkh.e(utcVar, 8.0f));
                    td4.t(ev6Var.c, 48, av8Var2, bkh.o(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 102.0f, 102.0f, 3));
                    av8Var2.s(true);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                POTSHighestRatedPlayersFragment pOTSHighestRatedPlayersFragment = (POTSHighestRatedPlayersFragment) obj6;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    e1d x2 = rfo.x(pOTSHighestRatedPlayersFragment.D().f, av8Var3, 0);
                    osa a2 = rsa.a(pOTSHighestRatedPlayersFragment.D().n, av8Var3);
                    e1d x3 = rfo.x(pOTSHighestRatedPlayersFragment.D().j, av8Var3, 0);
                    vnb vnbVar = (vnb) x2.getValue();
                    boolean i10 = av8Var3.i(a2) | av8Var3.i(pOTSHighestRatedPlayersFragment);
                    Object O3 = av8Var3.O();
                    if (i10 || O3 == obj5) {
                        O3 = new ixa(27, a2, pOTSHighestRatedPlayersFragment);
                        av8Var3.n0(O3);
                    }
                    ktm.s(vnbVar, (Function0) O3, ((Boolean) x3.getValue()).booleanValue(), bkh.c, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, onb.a, null, yqo.H(1935515804, av8Var3, new yya(7, a2, pOTSHighestRatedPlayersFragment)), av8Var3, 102239232, 176);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                POTSMostAwardsFragment pOTSMostAwardsFragment = (POTSMostAwardsFragment) obj6;
                otk otkVar = pOTSMostAwardsFragment.r;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    osa a3 = rsa.a(((m2e) otkVar.getValue()).i, av8Var4);
                    boolean booleanValue2 = ((Boolean) rfo.x(((m2e) otkVar.getValue()).g, av8Var4, 0).getValue()).booleanValue();
                    boolean i11 = av8Var4.i(a3) | av8Var4.i(pOTSMostAwardsFragment);
                    Object O4 = av8Var4.O();
                    if (i11 || O4 == obj5) {
                        O4 = new ixa(i5, a3, pOTSMostAwardsFragment);
                        av8Var4.n0(O4);
                    }
                    b0a.s(booleanValue2, (Function0) O4, bkh.c, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yqo.H(452480889, av8Var4, new z1e(a3, 0)), av8Var4, 196992, 24);
                } else {
                    av8Var4.W();
                }
                break;
            case 4:
                POTSTopLeaguesFragment pOTSTopLeaguesFragment = (POTSTopLeaguesFragment) obj6;
                otk otkVar2 = pOTSTopLeaguesFragment.r;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    e1d x4 = rfo.x(((e3e) otkVar2.getValue()).f, av8Var5, 0);
                    e1d x5 = rfo.x(((e3e) otkVar2.getValue()).j, av8Var5, 0);
                    vnb vnbVar2 = (vnb) x4.getValue();
                    boolean i12 = av8Var5.i(pOTSTopLeaguesFragment);
                    Object O5 = av8Var5.O();
                    int i13 = 22;
                    if (i12 || O5 == obj5) {
                        O5 = new xxb(pOTSTopLeaguesFragment, i13);
                        av8Var5.n0(O5);
                    }
                    ktm.s(vnbVar2, (Function0) O5, ((Boolean) x5.getValue()).booleanValue(), bkh.c, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, onb.a, null, yqo.H(1958355312, av8Var5, new bba(pOTSTopLeaguesFragment, i13)), av8Var5, 102239232, 176);
                } else {
                    av8Var5.W();
                }
                break;
            case 5:
                AdditionalOddsComparisonFragment additionalOddsComparisonFragment = (AdditionalOddsComparisonFragment) obj6;
                otk otkVar3 = additionalOddsComparisonFragment.s;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    e1d x6 = rfo.x(((ij) otkVar3.getValue()).f, av8Var6, 0);
                    e1d x7 = rfo.x(((ij) otkVar3.getValue()).j, av8Var6, 0);
                    hof hofVar2 = ((ij) otkVar3.getValue()).h;
                    boolean i14 = av8Var6.i(additionalOddsComparisonFragment) | av8Var6.g(x6);
                    Object O6 = av8Var6.O();
                    if (i14 || O6 == obj5) {
                        O6 = new s1(i7, additionalOddsComparisonFragment, x6);
                        av8Var6.n0(O6);
                    }
                    w1a.c(hofVar2, null, (Function1) O6, av8Var6, 0, 14);
                    boolean booleanValue3 = ((Boolean) x7.getValue()).booleanValue();
                    vnb vnbVar3 = (vnb) x6.getValue();
                    int i15 = ke0.c;
                    ij ijVar = (ij) otkVar3.getValue();
                    boolean i16 = av8Var6.i(ijVar);
                    Object O7 = av8Var6.O();
                    if (i16 || O7 == obj5) {
                        O7 = new f2(1, ijVar, ij.class, "onAction", "onAction(Lcom/sofascore/results/event/odds/oddscomparison/AdditionalOddsComparisonAction;)V", 0, 1);
                        av8Var6.n0(O7);
                    }
                    ml4.a(booleanValue3, i15, vnbVar3, (Function1) ((KFunction) O7), av8Var6, 0);
                } else {
                    av8Var6.W();
                }
                break;
            case 6:
                AdditionalOddsFragment additionalOddsFragment = (AdditionalOddsFragment) obj6;
                otk otkVar4 = additionalOddsFragment.t;
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    e1d x8 = rfo.x(((kk) otkVar4.getValue()).f, av8Var7, 0);
                    e1d x9 = rfo.x(((kk) otkVar4.getValue()).j, av8Var7, 0);
                    hof hofVar3 = ((kk) otkVar4.getValue()).h;
                    boolean i17 = av8Var7.i(additionalOddsFragment) | av8Var7.g(x8);
                    Object O8 = av8Var7.O();
                    if (i17 || O8 == obj5) {
                        O8 = new s1(5, additionalOddsFragment, x8);
                        av8Var7.n0(O8);
                    }
                    w1a.c(hofVar3, null, (Function1) O8, av8Var7, 0, 14);
                    boolean booleanValue4 = ((Boolean) x9.getValue()).booleanValue();
                    boolean l = ((mr5) additionalOddsFragment.r.getValue()).l();
                    vmd vmdVar = vmd.EVENT_DETAILS;
                    vnb vnbVar4 = (vnb) x8.getValue();
                    boolean i18 = av8Var7.i(additionalOddsFragment);
                    Object O9 = av8Var7.O();
                    if (i18 || O9 == obj5) {
                        O9 = new u2(additionalOddsFragment, i4);
                        av8Var7.n0(O9);
                    }
                    dk.a(3072, av8Var7, vnbVar4, (Function1) O9, booleanValue4, l);
                } else {
                    av8Var7.W();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                iz8.a((old) obj6, (of3) obj, aba.K(1));
                break;
            case 8:
                oqf P = wba.P((RectF) obj);
                oqf P2 = wba.P((RectF) obj2);
                switch (((ilg) obj6).a) {
                    case 27:
                        i = P.i(P2);
                        break;
                    default:
                        i = P2.a(P.d());
                        break;
                }
                break;
            case 9:
                ia0 ia0Var = (ia0) obj6;
                String str4 = (String) obj;
                String str5 = (String) obj2;
                str4.getClass();
                str5.getClass();
                if (!str4.equals(str5)) {
                    nv.K(ia0Var, str4, str5);
                }
                break;
            case 10:
                AttackMomentumInfoBottomSheet attackMomentumInfoBottomSheet = (AttackMomentumInfoBottomSheet) obj6;
                of3 of3Var8 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    av8Var8.d0(2009488398);
                    qug o0 = hkg.o0(av8Var8);
                    attackMomentumInfoBottomSheet.G(o0, null, av8Var8, 0);
                    av8Var8.s(false);
                    v9g.b((nm0) attackMomentumInfoBottomSheet.x.getValue(), ((Number) attackMomentumInfoBottomSheet.y.getValue()).intValue(), (String) attackMomentumInfoBottomSheet.z.getValue(), ((Number) attackMomentumInfoBottomSheet.A.getValue()).intValue(), (String) attackMomentumInfoBottomSheet.B.getValue(), null, o0, av8Var8, 0);
                } else {
                    av8Var8.W();
                }
                break;
            case 11:
                BaseCupTreeFragment baseCupTreeFragment = (BaseCupTreeFragment) obj6;
                of3 of3Var9 = (of3) obj;
                int intValue9 = ((Integer) obj2).intValue();
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue9 & 1, (intValue9 & 3) != 2)) {
                    List<CupTree> A = baseCupTreeFragment.A();
                    ArrayList arrayList = new ArrayList(k13.r(A, 10));
                    for (CupTree cupTree : A) {
                        arrayList.add(new oxh(cupTree, cupTree.getName(), null, null, null, false, 252));
                    }
                    gv9 W = l6g.W(arrayList);
                    Iterator<E> it = W.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.c(((oxh) next).a, (CupTree) ((eoh) baseCupTreeFragment.s).getValue())) {
                                obj3 = next;
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    oxh oxhVar = (oxh) obj3;
                    boolean i19 = av8Var9.i(baseCupTreeFragment);
                    Object O10 = av8Var9.O();
                    if (i19 || O10 == obj5) {
                        O10 = new i21(baseCupTreeFragment, i6);
                        av8Var9.n0(O10);
                    }
                    r4a.j(W, oxhVar, (Function1) O10, null, baseCupTreeFragment.C() ? rxh.i : sxh.i, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var9, 12582912, 872);
                } else {
                    av8Var9.W();
                }
                break;
            case 12:
                BaseMediaFragment baseMediaFragment = (BaseMediaFragment) obj6;
                of3 of3Var10 = (of3) obj;
                int intValue10 = ((Integer) obj2).intValue();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue10 & 1, (intValue10 & 3) != 2)) {
                    w41 E = baseMediaFragment.E();
                    tee B = baseMediaFragment.B();
                    boolean i20 = av8Var10.i(baseMediaFragment);
                    Object O11 = av8Var10.O();
                    if (i20 || O11 == obj5) {
                        O11 = new u2(baseMediaFragment, 15);
                        av8Var10.n0(O11);
                    }
                    ybc.b(E, B, (Function1) O11, av8Var10, 0);
                } else {
                    av8Var10.W();
                }
                break;
            case 13:
                BaseShareComposeBottomSheetModal baseShareComposeBottomSheetModal = (BaseShareComposeBottomSheetModal) obj6;
                of3 of3Var11 = (of3) obj;
                int intValue11 = ((Integer) obj2).intValue();
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue11 & 1, (intValue11 & 3) != 2)) {
                    gv9 gv9Var = (gv9) baseShareComposeBottomSheetModal.x.getValue();
                    int intValue12 = ((Number) baseShareComposeBottomSheetModal.y.getValue()).intValue();
                    kch M = baseShareComposeBottomSheetModal.M();
                    int O12 = baseShareComposeBottomSheetModal.O();
                    boolean i21 = av8Var11.i(baseShareComposeBottomSheetModal);
                    Object O13 = av8Var11.O();
                    if (i21 || O13 == obj5) {
                        Object f2Var = new f2(1, baseShareComposeBottomSheetModal, BaseShareComposeBottomSheetModal.class, "itemName", "itemName(Landroid/os/Parcelable;)Ljava/lang/String;", 0, 2);
                        av8Var11.n0(f2Var);
                        O13 = f2Var;
                    }
                    KFunction kFunction = (KFunction) O13;
                    boolean i22 = av8Var11.i(baseShareComposeBottomSheetModal);
                    Object O14 = av8Var11.O();
                    if (i22 || O14 == obj5) {
                        Object f2Var2 = new f2(1, baseShareComposeBottomSheetModal, BaseShareComposeBottomSheetModal.class, "analyticsId", "analyticsId(Landroid/os/Parcelable;)I", 0, 3);
                        av8Var11.n0(f2Var2);
                        O14 = f2Var2;
                    }
                    KFunction kFunction2 = (KFunction) O14;
                    boolean i23 = av8Var11.i(baseShareComposeBottomSheetModal);
                    Object O15 = av8Var11.O();
                    if (i23 || O15 == obj5) {
                        Object f2Var3 = new f2(1, baseShareComposeBottomSheetModal, BaseShareComposeBottomSheetModal.class, "shareText", "shareText(Landroid/os/Parcelable;)Ljava/lang/String;", 0, 4);
                        av8Var11.n0(f2Var3);
                        O15 = f2Var3;
                    }
                    fkf.p(gv9Var, intValue12, O12, M, (Function1) kFunction, (Function1) kFunction2, (Function1) ((KFunction) O15), yqo.H(799583729, av8Var11, new kr1(baseShareComposeBottomSheetModal, 11)), null, av8Var11, 12582912);
                } else {
                    av8Var11.W();
                }
                break;
            case 14:
                BaseballCommentaryModal baseballCommentaryModal = (BaseballCommentaryModal) obj6;
                of3 of3Var12 = (of3) obj;
                int intValue13 = ((Integer) obj2).intValue();
                av8 av8Var12 = (av8) of3Var12;
                if (av8Var12.T(intValue13 & 1, (intValue13 & 3) != 2)) {
                    u6h.d((q81) baseballCommentaryModal.C.getValue(), av8Var12, 0);
                } else {
                    av8Var12.W();
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                u6h.d((q81) obj6, (of3) obj, aba.K(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                u6h.c((l81) obj6, (of3) obj, aba.K(1));
                break;
            case 17:
                e91 e91Var = (e91) obj6;
                of3 of3Var13 = (of3) obj;
                int intValue14 = ((Integer) obj2).intValue();
                av8 av8Var13 = (av8) of3Var13;
                if (av8Var13.T(intValue14 & 1, (intValue14 & 3) != 2)) {
                    boolean i24 = av8Var13.i(e91Var);
                    Object O16 = av8Var13.O();
                    if (i24 || O16 == obj5) {
                        O16 = new z0(e91Var, i5);
                        av8Var13.n0(O16);
                    }
                    lz.b((Function0) O16, av8Var13, 0);
                } else {
                    av8Var13.W();
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                ((v91) obj6).a(aba.K(1), (of3) obj);
                break;
            case 19:
                BaseballPlayerSeasonStatisticsFragment baseballPlayerSeasonStatisticsFragment = (BaseballPlayerSeasonStatisticsFragment) obj6;
                of3 of3Var14 = (of3) obj;
                int intValue15 = ((Integer) obj2).intValue();
                av8 av8Var14 = (av8) of3Var14;
                if (av8Var14.T(intValue15 & 1, (intValue15 & 3) != 2)) {
                    ek1.b((qk1) baseballPlayerSeasonStatisticsFragment.s.getValue(), av8Var14, 0);
                } else {
                    av8Var14.W();
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                ek1.b((qk1) obj6, (of3) obj, aba.K(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                fqj.c((ct5) obj6, (of3) obj, aba.K(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ((wm1) obj6).j(aba.K(1), (of3) obj);
                break;
            case 23:
                mn1 mn1Var = (mn1) obj6;
                of3 of3Var15 = (of3) obj;
                int intValue16 = ((Integer) obj2).intValue();
                av8 av8Var15 = (av8) of3Var15;
                if (av8Var15.T(intValue16 & 1, (intValue16 & 3) != 2)) {
                    m6k.c(48, mn1Var, av8Var15, l98.c0(utc.a, 8.0f, 4.0f));
                } else {
                    av8Var15.W();
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                ((on1) obj6).a(aba.K(1), (of3) obj);
                break;
            case 25:
                zr1 zr1Var = (zr1) obj6;
                of3 of3Var16 = (of3) obj;
                int intValue17 = ((Integer) obj2).intValue();
                av8 av8Var16 = (av8) of3Var16;
                if (av8Var16.T(intValue17 & 1, (intValue17 & 3) != 2)) {
                    ux7 ux7Var = zr1Var.m;
                    int i25 = ux7Var.a;
                    String str6 = ux7Var.b;
                    String str7 = str6 == null ? "" : str6;
                    Integer valueOf2 = Integer.valueOf(zr1Var.n.a);
                    Double d = zr1Var.q;
                    String str8 = zr1Var.h;
                    yf8 yf8Var2 = xth.a;
                    l98.o(i25, str7, null, valueOf2, d, str8, true, xth.l(), av8Var16, 1572864, 4);
                } else {
                    av8Var16.W();
                }
                break;
            case 26:
                ss1 ss1Var = (ss1) obj6;
                of3 of3Var17 = (of3) obj;
                int intValue18 = ((Integer) obj2).intValue();
                av8 av8Var17 = (av8) of3Var17;
                if (av8Var17.T(intValue18 & 1, (intValue18 & 3) != 2)) {
                    fy7 fy7Var = ss1Var.m;
                    int i26 = fy7Var.a;
                    String str9 = fy7Var.c;
                    l98.u(i26, str9 == null ? "" : str9, utc.a, ss1Var.h, null, av8Var17, 384, 16);
                } else {
                    av8Var17.W();
                }
                break;
            case 27:
                BlazeBaseWidget blazeBaseWidget = (BlazeBaseWidget) obj6;
                ipm ipmVar = (ipm) obj;
                ThumbnailFormat thumbnailFormat = (ThumbnailFormat) obj2;
                int i27 = BlazeBaseWidget.q;
                ipmVar.getClass();
                String str10 = ipmVar.a;
                thumbnailFormat.getClass();
                cql viewModel = blazeBaseWidget.getViewModel();
                String str11 = blazeBaseWidget.thumbnailSize;
                String str12 = blazeBaseWidget.thumbnailAspectRatio;
                ThumbnailType thumbnailType = blazeBaseWidget.getThumbnailType();
                String str13 = blazeBaseWidget.widgetSize;
                WidgetType widgetType = blazeBaseWidget.getWidgetType();
                viewModel.getClass();
                str11.getClass();
                str12.getClass();
                thumbnailType.getClass();
                str13.getClass();
                widgetType.getClass();
                List u = viewModel.u();
                BlazeWidgetDelegate blazeWidgetDelegate = viewModel.o;
                if (blazeWidgetDelegate != null) {
                    blazeWidgetDelegate.onItemClicked(viewModel.w(), str10, ipmVar.b);
                }
                int intValue19 = (u == null || (t = tz9.t(u, ipmVar)) == null) ? 0 : t.intValue();
                BlazeWidgetItemClickParams blazeWidgetItemClickParams = new BlazeWidgetItemClickParams(viewModel.w(), intValue19, str10);
                Function1 function1 = viewModel.p;
                BlazeWidgetItemClickHandlerState blazeWidgetItemClickHandlerState2 = function1 != null ? (BlazeWidgetItemClickHandlerState) function1.invoke(blazeWidgetItemClickParams) : null;
                int i28 = blazeWidgetItemClickHandlerState2 == null ? -1 : lul.b[blazeWidgetItemClickHandlerState2.ordinal()];
                if (i28 != -1) {
                    if (i28 != 1) {
                        if (i28 != 2) {
                            zzl.b();
                            break;
                        }
                    } else {
                        blazeWidgetItemClickHandlerState = BlazeWidgetItemClickHandlerState.HANDLED_BY_APP;
                        str = str10;
                        i2 = ypl.a[blazeWidgetItemClickHandlerState.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                zzl.b();
                                break;
                            } else {
                                BlazeRecyclerView blazeRecyclerView = blazeBaseWidget.binding.b;
                                blazeRecyclerView.getClass();
                                Object systemService = blazeRecyclerView.getContext().getSystemService("input_method");
                                InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                                if (inputMethodManager != null) {
                                    inputMethodManager.hideSoftInputFromWindow(blazeRecyclerView.getWindowToken(), 0);
                                }
                                blazeBaseWidget.f(str, F.WIDGET);
                            }
                        }
                        break;
                    }
                }
                int size = u != null ? u.size() : 0;
                List u2 = viewModel.u();
                if (u2 == null) {
                    list = km5.a;
                } else {
                    ArrayList arrayList2 = new ArrayList(k13.r(u2, 10));
                    Iterator it2 = u2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((ipm) it2.next()).a);
                    }
                    list = arrayList2;
                }
                String w = viewModel.w();
                ContentType t3 = viewModel.t();
                Map map = ipmVar.g;
                Map map2 = !map.isEmpty() ? map : null;
                if (viewModel.x().getWidgetItemStyle().getImage().getAnimatedThumbnail().isEnabled()) {
                    List list2 = ipmVar.c;
                    list2.getClass();
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj4 = it3.next();
                            if (((xvm) obj4).b == BlazeWidgetItemImageStyle.BlazeThumbnailType.GIF) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    if (obj4 != null) {
                        z = true;
                        Map map3 = ipmVar.j;
                        list.getClass();
                        t3.getClass();
                        str10.getClass();
                        AnalyticsPropsWidget analyticsPropsWidget = new AnalyticsPropsWidget(w, widgetType, str13, Integer.valueOf(size), str10, t3, Integer.valueOf(intValue19), str11, str12, thumbnailType, list, map2, Boolean.valueOf(z), thumbnailFormat, map3);
                        str = str10;
                        EventActionName eventActionName = EventActionName.WIDGET_CLICK;
                        eventActionName.getClass();
                        spm.postEvent$default(cwm.a, eventActionName, EventCategoryType.WIDGET, new AnalyticsPropsReferring(null, null, viewModel.v().getStringRepresentation$blazesdk_release(), 3, null), null, null, null, analyticsPropsWidget, null, null, 440, null);
                        blazeWidgetItemClickHandlerState = BlazeWidgetItemClickHandlerState.SDK_SHOULD_HANDLE;
                        i2 = ypl.a[blazeWidgetItemClickHandlerState.ordinal()];
                        if (i2 != 1) {
                        }
                    }
                }
                z = false;
                Map map32 = ipmVar.j;
                list.getClass();
                t3.getClass();
                str10.getClass();
                AnalyticsPropsWidget analyticsPropsWidget2 = new AnalyticsPropsWidget(w, widgetType, str13, Integer.valueOf(size), str10, t3, Integer.valueOf(intValue19), str11, str12, thumbnailType, list, map2, Boolean.valueOf(z), thumbnailFormat, map32);
                str = str10;
                EventActionName eventActionName2 = EventActionName.WIDGET_CLICK;
                eventActionName2.getClass();
                spm.postEvent$default(cwm.a, eventActionName2, EventCategoryType.WIDGET, new AnalyticsPropsReferring(null, null, viewModel.v().getStringRepresentation$blazesdk_release(), 3, null), null, null, null, analyticsPropsWidget2, null, null, 440, null);
                blazeWidgetItemClickHandlerState = BlazeWidgetItemClickHandlerState.SDK_SHOULD_HANDLE;
                i2 = ypl.a[blazeWidgetItemClickHandlerState.ordinal()];
                if (i2 != 1) {
                }
                break;
            case 28:
                ChatCountryFlagBottomSheet chatCountryFlagBottomSheet = (ChatCountryFlagBottomSheet) obj6;
                of3 of3Var18 = (of3) obj;
                int intValue20 = ((Integer) obj2).intValue();
                av8 av8Var18 = (av8) of3Var18;
                if (av8Var18.T(intValue20 & 1, (intValue20 & 3) != 2)) {
                    br2 br2Var = (br2) chatCountryFlagBottomSheet.C.getValue();
                    qug o02 = hkg.o0(av8Var18);
                    boolean i29 = av8Var18.i(chatCountryFlagBottomSheet);
                    Object O17 = av8Var18.O();
                    if (i29 || O17 == obj5) {
                        O17 = new yj1(chatCountryFlagBottomSheet, 18);
                        av8Var18.n0(O17);
                    }
                    rz8.e(br2Var, o02, (Function0) O17, av8Var18, 0);
                } else {
                    av8Var18.W();
                }
                break;
            default:
                Integer num = (Integer) obj;
                t6e t6eVar = (t6e) obj2;
                t6eVar.getClass();
                ((ChronologicalMatchesFragment) obj6).E().m(num != null ? num.intValue() : 0, t6eVar == t6e.a);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ t21(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ t21(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
