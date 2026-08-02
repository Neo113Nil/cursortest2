package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatistics;
import com.sofascore.model.profile.ReferralResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import com.sofascore.results.player.statistics.regular.PlayerSeasonStatisticsFragment;
import com.sofascore.results.referral.ReferralActivity;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.bottomsheet.RaceFlowGraphInfoBottomSheet;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class gme implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gme(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x04da, code lost:
    
        if (r8.y() == r1.f(r3, r2, false).c) goto L147;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i = this.a;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        int i2 = 2;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                PlayerCareerStatisticsFragment playerCareerStatisticsFragment = (PlayerCareerStatisticsFragment) obj5;
                ((Integer) obj2).getClass();
                ((String) obj).getClass();
                playerCareerStatisticsFragment.N = true;
                playerCareerStatisticsFragment.L().o.a = null;
                playerCareerStatisticsFragment.L().o.f(0);
                playerCareerStatisticsFragment.S((PlayerCareerStatistics) playerCareerStatisticsFragment.N().g.d());
                playerCareerStatisticsFragment.t((SegmentedButtonsView) obj4, new cme(playerCareerStatisticsFragment, 7));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                ((cpe) obj5).j((xoe) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 2:
                return cpe.o((cpe) obj5, (gpe) obj4, (of3) obj, ((Integer) obj2).intValue());
            case 3:
                return cpe.r((cpe) obj5, (gpe) obj4, (of3) obj, ((Integer) obj2).intValue());
            case 4:
                e1d e1dVar = (e1d) obj5;
                PlayerEventStatisticsModal playerEventStatisticsModal = (PlayerEventStatisticsModal) obj4;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    ll1 ll1Var = (ll1) e1dVar.getValue();
                    if (ll1Var == null) {
                        av8Var.d0(668303241);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(668303242);
                        boolean z = playerEventStatisticsModal.Q().s.b == wj1.c;
                        String v = oea.v(o02.V(ll1Var), av8Var);
                        String v2 = oea.v(o02.U(ll1Var, z), av8Var);
                        String v3 = oea.v(R.string.close, av8Var);
                        Object O = av8Var.O();
                        if (O == a99Var) {
                            O = new tra(15, e1dVar);
                            av8Var.n0(O);
                        }
                        dy0.n(v, v2, (Function0) O, v3, false, false, av8Var, 384, 1008);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                gvd.o((jre) obj5, (Function2) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 6:
                ((Integer) obj2).getClass();
                gvd.n((hre) obj5, (Function1) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                yaa.c((Gender) obj5, (Function0) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 8:
                gv9 gv9Var = (gv9) obj5;
                PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment = (PlayerSeasonStatisticsFragment) obj4;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Iterator<E> it = gv9Var.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj3 = it.next();
                            if (((oxh) obj3).a == playerSeasonStatisticsFragment.G()) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    oxh oxhVar = (oxh) obj3;
                    oxh a = oxhVar != null ? oxh.a(oxhVar, playerSeasonStatisticsFragment.getString(((fzg) oxhVar.a).a), null, null, 253) : null;
                    boolean i3 = av8Var2.i(playerSeasonStatisticsFragment);
                    Object O2 = av8Var2.O();
                    if (i3 || O2 == a99Var) {
                        O2 = new bwe(playerSeasonStatisticsFragment, i2);
                        av8Var2.n0(O2);
                    }
                    r4a.j(gv9Var, a, (Function1) O2, null, null, ((Boolean) ((eoh) playerSeasonStatisticsFragment.P).getValue()).booleanValue(), null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 984);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 9:
                ((Integer) obj2).getClass();
                cga.j((dze) obj5, (xtc) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 10:
                ((Integer) obj2).getClass();
                tz9.j((Integer) obj5, (xtc) obj4, (of3) obj, aba.K(49));
                return Unit.a;
            case 11:
                Context context = (Context) obj4;
                String str = (String) obj;
                w3f w3fVar = (w3f) obj2;
                str.getClass();
                w3fVar.getClass();
                ((kx5) obj5).invoke(str, w3fVar);
                ia0 ia0Var = ia0.q;
                if (ok3.p().e().getLeaderboardId() == 0) {
                    sha.q(context);
                }
                return Unit.a;
            case 12:
                d6f d6fVar = (d6f) obj5;
                ale aleVar = (ale) obj4;
                ale aleVar2 = (ale) obj;
                uke ukeVar = (uke) obj2;
                aleVar2.getClass();
                ukeVar.getClass();
                j78 j78Var = ukeVar.a;
                if (j78Var.a.get(25) && !Intrinsics.c(aleVar2.v(), zqk.d) && aleVar2.getPlaybackState() != 1) {
                    d6fVar.getClass();
                    ((eoh) d6fVar.a).setValue(d6f.a(aleVar));
                }
                if (j78Var.a.get(26)) {
                    ((eoh) d6fVar.b).setValue(Boolean.FALSE);
                }
                if (j78Var.a.get(2)) {
                    d6fVar.getClass();
                    mij currentTimeline = aleVar.k(17) ? aleVar.getCurrentTimeline() : mij.a;
                    currentTimeline.getClass();
                    if (currentTimeline.p()) {
                        d6fVar.c = null;
                    } else {
                        iij iijVar = new iij();
                        if (!aleVar.k(30) || aleVar.i().a.isEmpty()) {
                            Object obj6 = d6fVar.c;
                            if (obj6 != null) {
                                int b = currentTimeline.b(obj6);
                                if (b != -1) {
                                    break;
                                }
                                d6fVar.c = null;
                            }
                        } else {
                            d6fVar.c = currentTimeline.f(aleVar.getCurrentPeriodIndex(), iijVar, true).b;
                        }
                    }
                    d6fVar.b(aleVar);
                }
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                o1j.n((q9f) obj5, (xtc) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                waa.g((l9f) obj5, (xtc) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 15:
                ((Integer) obj2).getClass();
                yaa.e((ri5) obj5, (xtc) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 16:
                ((Integer) obj2).getClass();
                wca.e((gta) obj5, (xtc) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 17:
                ((Integer) obj2).getClass();
                hda.f((qbf) obj5, (xtc) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 18:
                ((Integer) obj2).getClass();
                m6k.o((pbf) obj5, (gta) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 19:
                qug qugVar = (qug) obj5;
                RaceFlowGraphInfoBottomSheet raceFlowGraphInfoBottomSheet = (RaceFlowGraphInfoBottomSheet) obj4;
                joa joaVar = raceFlowGraphInfoBottomSheet.x;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    xtc u0 = hkg.u0(lz.J(utcVar, jaa.L(av8Var3), null), qugVar, false, 14);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var3.T);
                    aee m = av8Var3.m();
                    xtc C = fqj.C(av8Var3, u0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c, hf3.g);
                    waa.K(av8Var3, m, hf3.f);
                    waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var3, hf3.k);
                    waa.K(av8Var3, C, hf3.d);
                    int ordinal = ((xkf) raceFlowGraphInfoBottomSheet.w.getValue()).ordinal();
                    if (ordinal == 0) {
                        av8Var3.d0(869168240);
                        q5a.m(l6g.W((ArrayList) joaVar.getValue()), R.string.motorsport_race_flow_graph_description, R.drawable.race_flow_info_popover, true, av8Var3, 3072);
                        av8Var3.s(false);
                    } else if (ordinal == 1) {
                        av8Var3.d0(869621646);
                        q5a.m(l6g.W((ArrayList) joaVar.getValue()), R.string.moto_gp_race_flow_graph_description, R.drawable.rally_tracker_info_popover, false, av8Var3, 3072);
                        av8Var3.s(false);
                    } else {
                        if (ordinal != 2) {
                            throw dmi.h(av8Var3, 997867290, false);
                        }
                        av8Var3.d0(870067674);
                        q5a.n(l6g.W((ArrayList) joaVar.getValue()), l6g.W((ArrayList) raceFlowGraphInfoBottomSheet.y.getValue()), av8Var3, 0);
                        av8Var3.s(false);
                    }
                    av8Var3.s(true);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                q5a.n((gv9) obj5, (gv9) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 21:
                ((Integer) obj2).getClass();
                q5a.a((RaceFlowModels$RaceEntrant) obj5, (xtc) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 22:
                ((Integer) obj2).getClass();
                xpf.c((cqf) obj5, (xtc) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 23:
                ReferralActivity referralActivity = (ReferralActivity) obj5;
                cdi cdiVar = (cdi) obj4;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i4 = ReferralActivity.N;
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ReferralResponse referralResponse = (ReferralResponse) referralActivity.M.getValue();
                    vnb vnbVar = (vnb) cdiVar.getValue();
                    boolean i5 = av8Var4.i(referralActivity);
                    Object O3 = av8Var4.O();
                    if (i5 || O3 == a99Var) {
                        O3 = new mme(referralActivity, 21);
                        av8Var4.n0(O3);
                    }
                    xtf.a(referralResponse, vnbVar, (Function1) O3, av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 24:
                ((Integer) obj2).getClass();
                mha.e((Function0) obj5, (Function0) obj4, (of3) obj, aba.K(1));
                return Unit.a;
            case 25:
                veg vegVar = (veg) obj5;
                tdg tdgVar = (tdg) obj4;
                int intValue5 = ((Integer) obj).intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                lcg lcgVar = intValue5 == 2 ? lcg.LANDSCAPE : lcg.PORTRAIT;
                vegVar.getClass();
                vegVar.a("window.mraidbridge.setCurrentAppOrientation('" + lcgVar.a + "', " + booleanValue + ");");
                Context context2 = tdgVar.l;
                if (context2 == null) {
                    Intrinsics.i("context");
                    throw null;
                }
                Rect b2 = fdg.b(context2, true, true);
                vegVar.a(lnb.j(b2.width(), b2.height(), "window.mraidbridge.setScreenSize(", BlazeDataSourcePersonalizedType.STRING_SEPARATOR, ");"));
                Context context3 = tdgVar.l;
                if (context3 == null) {
                    Intrinsics.i("context");
                    throw null;
                }
                Rect b3 = fdg.b(context3, false, true);
                vegVar.a(lnb.j(b3.width(), b3.height(), "window.mraidbridge.setMaxSize(", BlazeDataSourcePersonalizedType.STRING_SEPARATOR, ");"));
                return Unit.a;
            case 26:
                csf csfVar = (csf) obj5;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f = csfVar.a;
                csfVar.a = ((oug) obj4).a(floatValue - f) + f;
                return Unit.a;
            case 27:
                gyg gygVar = (gyg) obj5;
                Function1 function1 = (Function1) obj4;
                of3 of3Var5 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gv9 gv9Var2 = gygVar.g;
                    String str2 = gygVar.h;
                    boolean g = av8Var5.g(function1);
                    Object O4 = av8Var5.O();
                    if (g || O4 == a99Var) {
                        O4 = new k1e(4, function1);
                        av8Var5.n0(O4);
                    }
                    trh.a(gv9Var2, str2, (Function1) O4, null, null, null, null, false, false, false, null, null, av8Var5, 0, 4088);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 28:
                pmi pmiVar = (pmi) obj5;
                Context context4 = (Context) obj4;
                of3 of3Var6 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    String p = tba.p(context4, pmiVar.c);
                    yf8 yf8Var = xth.a;
                    udj.c(p, null, lz.D(R.color.on_color_primary, av8Var6), null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.b(), av8Var6, 0, 24960, 109562);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            default:
                Player player = (Player) obj5;
                Team team = (Team) obj4;
                of3 of3Var7 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (!av8Var7.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    av8Var7.W();
                } else if (player != null) {
                    av8Var7.d0(-603316107);
                    td4.C(player.getId(), bkh.l(utcVar, 64.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var7, 48, 12);
                    av8Var7.s(false);
                } else if (team != null) {
                    av8Var7.d0(-603198214);
                    td4.G(team.getId(), bkh.l(utcVar, 64.0f), false, 0L, av8Var7, 48, 12);
                    av8Var7.s(false);
                } else {
                    av8Var7.d0(-603111724);
                    av8Var7.s(false);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ gme(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
