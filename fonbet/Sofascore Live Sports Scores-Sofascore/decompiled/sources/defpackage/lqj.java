package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.compose.runtime.e;
import com.blaze.blazesdk.ads.banners.BlazeGAMBannerHandlerEventType;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsAd;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.inmobi.media.C3360d6;
import com.inmobi.media.C3468hb;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.Country;
import com.sofascore.model.database.VoteType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.TwitterAccount;
import com.sofascore.model.network.response.Vote;
import com.sofascore.model.newNetwork.WhoWillWinOptions;
import com.sofascore.results.R;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.league.fragment.details.view.TournamentPreviousWinnersBottomSheet;
import com.sofascore.results.main.matches.redesign.trendinggrid.TrendingGridFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import com.sofascore.results.wc26.WorldCupFragment;
import com.sofascore.results.wc26.bottomSheet.WorldCupAddWidgetBottomSheet;
import com.sofascore.results.wc26.bottomSheet.WorldCupTeamPickerBottomSheet;
import com.sofascore.results.wc26.bottomSheet.WorldCupTotrChatBottomSheet;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeUserDailyBonusModal;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.sofascore.results.weeklyChallenge.leaderboard.WeeklyLeaderboardFragment;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsFragment;
import com.sofascore.results.weeklyChallenge.statistics.WeeklyChallengeStatisticsFragment;
import com.unity3d.services.UnityAdsConstants;
import defpackage.gim;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class lqj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lqj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Type inference failed for: r6v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r6v31 */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        w3f w3fVar;
        SharedPreferences d;
        iel ielVar;
        String str;
        iel ielVar2;
        StoryModel storyModel;
        BlazeAdInfoModel blazeAdInfoModel;
        List list;
        int i = 6;
        r6 = null;
        String str2 = null;
        final int i2 = 1;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                yqo.q((Event) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 1:
                TournamentPreviousWinnersBottomSheet tournamentPreviousWinnersBottomSheet = (TournamentPreviousWinnersBottomSheet) this.b;
                otk otkVar = tournamentPreviousWinnersBottomSheet.x;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (O == a99Var) {
                        eva evaVar = (eva) ((kva) otkVar.getValue()).m.d();
                        List list2 = evaVar != null ? evaVar.l : null;
                        eva evaVar2 = (eva) ((kva) otkVar.getValue()).m.d();
                        r6 = evaVar2 != null ? evaVar2.a : 0;
                        String str3 = (String) tournamentPreviousWinnersBottomSheet.y.getValue();
                        str3.getClass();
                        O = l4a.E(list2, r6, str3);
                        av8Var.n0(O);
                    }
                    prj prjVar = (prj) O;
                    utc utcVar = utc.a;
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, utcVar);
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
                    waa.K(av8Var, C, hf3.d);
                    xtc e = fn0.e(1.0f, bkh.d(utcVar, 1.0f), false);
                    boolean i3 = av8Var.i(tournamentPreviousWinnersBottomSheet);
                    Object O2 = av8Var.O();
                    if (i3 || O2 == a99Var) {
                        O2 = new dvi(28, prjVar, tournamentPreviousWinnersBottomSheet);
                        av8Var.n0(O2);
                    }
                    v8a.a(e, null, null, null, null, null, false, null, (Function1) O2, av8Var, 0, 510);
                    String v = oea.v(R.string.close, av8Var);
                    boolean i4 = av8Var.i(tournamentPreviousWinnersBottomSheet);
                    Object O3 = av8Var.O();
                    if (i4 || O3 == a99Var) {
                        O3 = new nrj(tournamentPreviousWinnersBottomSheet, 1);
                        av8Var.n0(O3);
                    }
                    mha.h(v, (Function0) O3, bkh.d(l98.b0(utcVar, 16.0f), 1.0f), null, null, false, false, false, 0L, 0, 0, av8Var, 384, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                ((qrj) this.b).a(aba.K(1), (of3) obj);
                return Unit.a;
            case 3:
                TrendingGridFragment trendingGridFragment = (TrendingGridFragment) this.b;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    szj.g((c0k) trendingGridFragment.r.getValue(), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                szj.g((c0k) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                x2a.n((TwitterAccount) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 6:
                return TypeHeaderView.j((TypeHeaderView) this.b, (of3) obj, ((Integer) obj2).intValue());
            case 7:
                m8k m8kVar = (m8k) this.b;
                String str4 = (String) obj;
                List list3 = (List) obj2;
                str4.getClass();
                list3.getClass();
                m8kVar.i.r(str4, list3);
                return Unit.a;
            case 8:
                ((Integer) obj2).getClass();
                uaa.i((WeeklyChallengeViewModel) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 9:
                UpgradeSofascoreActivity upgradeSofascoreActivity = (UpgradeSofascoreActivity) this.b;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i5 = UpgradeSofascoreActivity.M;
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    e1d x = rfo.x(upgradeSofascoreActivity.Q().g.m, av8Var3, 0);
                    haa.f(yqo.H(-1466188546, av8Var3, new ace(((dli) x.getValue()).b, ((dli) x.getValue()).a, upgradeSofascoreActivity, x, 1)), av8Var3, 6);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 10:
                ay ayVar = (ay) this.b;
                String str5 = (String) obj;
                List list4 = (List) obj2;
                str5.getClass();
                list4.getClass();
                List list5 = zi9.a;
                if ("Content-Length".equals(str5)) {
                    return Unit.a;
                }
                if ("Content-Type".equals(str5)) {
                    return Unit.a;
                }
                if (ejk.a.contains(str5)) {
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        ayVar.invoke(str5, (String) it.next());
                    }
                } else {
                    ayVar.invoke(str5, CollectionsKt.f0(list4, "Cookie".equals(str5) ? "; " : BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                }
                return Unit.a;
            case 11:
                fnk fnkVar = (fnk) this.b;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    utc utcVar2 = utc.a;
                    xtc d2 = bkh.d(utcVar2, 1.0f);
                    l8g a2 = k8g.a(ww9.b, uxf.m, av8Var4, 48);
                    int hashCode2 = Long.hashCode(av8Var4.T);
                    aee m2 = av8Var4.m();
                    xtc C2 = fqj.C(av8Var4, d2);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var2);
                    } else {
                        av8Var4.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var4, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var4, m2, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var4, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var4, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var4, C2, f50Var3);
                    xtc h = ljg.h(4.0f, bkh.l(utcVar2, 32.0f), lz.D(R.color.surface_1, av8Var4), 4.0f);
                    jy7 jy7Var = fnkVar.i;
                    td4.k(jy7Var.c, h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var4, 0, 12);
                    xtc f0 = l98.f0(utcVar2, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    u23 a3 = t23.a(ww9.d, uxf.o, av8Var4, 0);
                    int hashCode3 = Long.hashCode(av8Var4.T);
                    aee m3 = av8Var4.m();
                    xtc C3 = fqj.C(av8Var4, f0);
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var2);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, a3, f50Var);
                    waa.K(av8Var4, m3, ff3Var);
                    bf3.s(hashCode3, av8Var4, f50Var2, av8Var4, ryVar);
                    waa.K(av8Var4, C3, f50Var3);
                    String str6 = jy7Var.b;
                    yf8 yf8Var = xth.a;
                    udj.c(str6, null, lz.D(R.color.on_color_primary, av8Var4), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var4, 0, 24960, 110586);
                    Context context = (Context) av8Var4.k(nz.b);
                    Object O4 = av8Var4.O();
                    if (O4 == nf3.a) {
                        String str7 = jy7Var.e;
                        String str8 = jy7Var.d;
                        O4 = str7 + (str8 != null ? ", ".concat(tv3.c(context, str8)) : "");
                        av8Var4.n0(O4);
                    }
                    udj.c((String) O4, null, lz.D(R.color.on_color_primary, av8Var4), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var4, 6, 24960, 110586);
                    av8Var4.s(true);
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 12:
                ((Integer) obj2).getClass();
                ((kxk) this.b).a(aba.K(1), (of3) obj);
                return Unit.a;
            case 13:
                WeeklyChallengeStatisticsFragment weeklyChallengeStatisticsFragment = (WeeklyChallengeStatisticsFragment) this.b;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    zm2.f((j3l) weeklyChallengeStatisticsFragment.r.getValue(), av8Var5, 0);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 14:
                ((Integer) obj2).getClass();
                zm2.f((j3l) this.b, (of3) obj, aba.K(1));
                return Unit.a;
            case 15:
                WeeklyChallengeUserDailyBonusModal weeklyChallengeUserDailyBonusModal = (WeeklyChallengeUserDailyBonusModal) this.b;
                String str9 = (String) obj;
                str9.getClass();
                ((w3f) obj2).getClass();
                Context context2 = weeklyChallengeUserDailyBonusModal.getContext();
                if (context2 != null) {
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context2.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    wt3.v(sharedPreferences, "PREF_SHOW_DAILY_BONUS_INFO", false);
                    Unit unit = Unit.a;
                }
                p3l p3lVar = (p3l) weeklyChallengeUserDailyBonusModal.B.getValue();
                Event event = p3lVar.j;
                if (event != null && (w3fVar = (w3f) p3lVar.m.getValue()) != null) {
                    Vote vote = w3fVar.d;
                    if (vote == null) {
                        vote = new Vote(0, 0, 0);
                    }
                    Vote vote2 = vote;
                    WhoWillWinOptions fromChoice = WhoWillWinOptions.INSTANCE.getFromChoice(str9);
                    if (fromChoice == null) {
                        fromChoice = WhoWillWinOptions.HOME_TEAM_WIN;
                    }
                    xw3.L(un0.z(p3lVar), null, null, new o46(p3lVar, event, str9, vote2, fromChoice, null), 3);
                }
                return Unit.a;
            case 16:
                WeeklyLeaderboardFragment weeklyLeaderboardFragment = (WeeklyLeaderboardFragment) this.b;
                ((String) obj).getClass();
                ((Bundle) obj2).getClass();
                weeklyLeaderboardFragment.u();
                return Unit.a;
            case 17:
                WeeklyPredictionsFragment weeklyPredictionsFragment = (WeeklyPredictionsFragment) this.b;
                int intValue6 = ((Integer) obj).intValue();
                VoteType voteType = (VoteType) obj2;
                voteType.getClass();
                Context requireContext = weeklyPredictionsFragment.requireContext();
                requireContext.getClass();
                lv lvVar = lv.WEEKLY_CHALLENGE;
                y3f.d.getClass();
                nv.z(requireContext, intValue6, lvVar, x3f.p(voteType), 1);
                if (jca.G(((l5l) weeklyPredictionsFragment.t.getValue()).h)) {
                    Context requireContext2 = weeklyPredictionsFragment.requireContext();
                    requireContext2.getClass();
                    zic.X(requireContext2, new e5l(weeklyPredictionsFragment, intValue6, voteType, false ? 1 : 0));
                } else {
                    weeklyPredictionsFragment.E(intValue6, voteType);
                }
                return Unit.a;
            case 18:
                WorldCupAddWidgetBottomSheet worldCupAddWidgetBottomSheet = (WorldCupAddWidgetBottomSheet) this.b;
                of3 of3Var6 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean i6 = av8Var6.i(worldCupAddWidgetBottomSheet);
                    Object O5 = av8Var6.O();
                    if (i6 || O5 == nf3.a) {
                        O5 = new ndk(worldCupAddWidgetBottomSheet, 11);
                        av8Var6.n0(O5);
                    }
                    vha.g((Function0) O5, av8Var6, 0);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 19:
                WorldCupFragment worldCupFragment = (WorldCupFragment) this.b;
                of3 of3Var7 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    nil.b((qkl) worldCupFragment.r.getValue(), (zqb) worldCupFragment.s.getValue(), av8Var7, 0);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                i2a.c((xel) this.b, (of3) obj, aba.K(7));
                return Unit.a;
            case 21:
                WorldCupTeamPickerBottomSheet worldCupTeamPickerBottomSheet = (WorldCupTeamPickerBottomSheet) this.b;
                of3 of3Var8 = (of3) obj;
                int intValue9 = ((Integer) obj2).intValue();
                a99 a99Var2 = nf3.a;
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue9 & 1, (intValue9 & 3) != 2)) {
                    e1d x2 = rfo.x(worldCupTeamPickerBottomSheet.L().H, av8Var8, 0);
                    e1d v2 = rfo.v(worldCupTeamPickerBottomSheet.L().A, null, av8Var8, 48);
                    e1d x3 = rfo.x(worldCupTeamPickerBottomSheet.L().f, av8Var8, 0);
                    boolean g = av8Var8.g((String) v2.getValue());
                    Object O6 = av8Var8.O();
                    Object obj3 = O6;
                    if (g || O6 == a99Var2) {
                        ArrayList arrayList = dv3.a;
                        Country a4 = dv3.a((String) v2.getValue());
                        e1d f = e.f(a4 != null ? new uv3(a4.getName(), a4.getIso2Alpha(), false) : null);
                        av8Var8.n0(f);
                        obj3 = f;
                    }
                    e1d e1dVar = (e1d) obj3;
                    oil oilVar = (oil) ((vnb) x3.getValue()).a();
                    String str10 = (oilVar == null || (ielVar = oilVar.a) == null) ? null : ielVar.b;
                    if (str10 == null) {
                        str10 = "";
                    }
                    Bundle arguments = worldCupTeamPickerBottomSheet.getArguments();
                    Boolean valueOf2 = Boolean.valueOf(arguments != null && arguments.getBoolean("is_retarget"));
                    boolean i7 = av8Var8.i(worldCupTeamPickerBottomSheet);
                    Object O7 = av8Var8.O();
                    Object obj4 = O7;
                    if (i7 || O7 == a99Var2) {
                        hje hjeVar = new hje(worldCupTeamPickerBottomSheet, r6, 15);
                        av8Var8.n0(hjeVar);
                        obj4 = hjeVar;
                    }
                    hz8.o(av8Var8, valueOf2, (Function2) obj4);
                    Bundle arguments2 = worldCupTeamPickerBottomSheet.getArguments();
                    boolean z = arguments2 != null && arguments2.getBoolean("is_retarget");
                    gv9 gv9Var = (gv9) x2.getValue();
                    if (gv9Var == null) {
                        gv9Var = rlh.b;
                    }
                    gv9 gv9Var2 = gv9Var;
                    uv3 uv3Var = (uv3) e1dVar.getValue();
                    boolean g2 = av8Var8.g(v2) | av8Var8.i(worldCupTeamPickerBottomSheet);
                    Object O8 = av8Var8.O();
                    Object obj5 = O8;
                    if (g2 || O8 == a99Var2) {
                        bcl bclVar = new bcl(i, worldCupTeamPickerBottomSheet, v2);
                        av8Var8.n0(bclVar);
                        obj5 = bclVar;
                    }
                    g7a.m(z, str10, gv9Var2, uv3Var, (Function1) obj5, null, av8Var8, 0);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 22:
                final WorldCupTotrChatBottomSheet worldCupTotrChatBottomSheet = (WorldCupTotrChatBottomSheet) this.b;
                of3 of3Var9 = (of3) obj;
                int intValue10 = ((Integer) obj2).intValue();
                a99 a99Var3 = nf3.a;
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue10 & 1, (intValue10 & 3) != 2)) {
                    boolean i8 = av8Var9.i(worldCupTotrChatBottomSheet);
                    Object O9 = av8Var9.O();
                    if (i8 || O9 == a99Var3) {
                        final boolean z2 = false ? 1 : 0;
                        O9 = new Function0() { // from class: ijl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i9 = z2;
                                WorldCupTotrChatBottomSheet worldCupTotrChatBottomSheet2 = worldCupTotrChatBottomSheet;
                                switch (i9) {
                                    case 0:
                                        ((qkl) worldCupTotrChatBottomSheet2.D.getValue()).H(dil.a);
                                        worldCupTotrChatBottomSheet2.j();
                                        break;
                                    default:
                                        worldCupTotrChatBottomSheet2.j();
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var9.n0(O9);
                    }
                    Function0 function0 = (Function0) O9;
                    boolean i9 = av8Var9.i(worldCupTotrChatBottomSheet);
                    Object O10 = av8Var9.O();
                    if (i9 || O10 == a99Var3) {
                        O10 = new Function0() { // from class: ijl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i92 = i2;
                                WorldCupTotrChatBottomSheet worldCupTotrChatBottomSheet2 = worldCupTotrChatBottomSheet;
                                switch (i92) {
                                    case 0:
                                        ((qkl) worldCupTotrChatBottomSheet2.D.getValue()).H(dil.a);
                                        worldCupTotrChatBottomSheet2.j();
                                        break;
                                    default:
                                        worldCupTotrChatBottomSheet2.j();
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var9.n0(O10);
                    }
                    Function0 function02 = (Function0) O10;
                    oil oilVar2 = (oil) ((qkl) worldCupTotrChatBottomSheet.D.getValue()).l().a();
                    if (oilVar2 == null || (ielVar2 = oilVar2.a) == null || (str = ielVar2.b) == null) {
                        str = "";
                    }
                    kjl.d(function0, function02, str, av8Var9, 0);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 23:
                jfj jfjVar = (jfj) this.b;
                of3 of3Var10 = (of3) obj;
                int intValue11 = ((Integer) obj2).intValue();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue11 & 1, (intValue11 & 3) != 2)) {
                    ty8 ty8Var = ty8.a;
                    lz.c(nq8.z(ty8Var), ho.c, k53.g, av8Var10, 384, 0);
                    lz.c(nq8.z(ty8Var), ho.h, k53.h, av8Var10, 384, 0);
                    String str11 = jfjVar.a;
                    if (str11 == null) {
                        str11 = "";
                    }
                    String str12 = str11;
                    vy8 O11 = h5a.O(ty8Var, 2.0f, 2);
                    yf8 yf8Var2 = xth.a;
                    o3a.i(str12, O11, l98.j0(xth.c(), Integer.valueOf(R.color.on_color_primary), av8Var10), 0, av8Var10, 0, 8);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 24:
                return new r6a(((fo) this.b).a(0, (int) (((c7a) obj).a >> 32), (ema) obj2) << 32);
            case 25:
                return new r6a(((lv1) this.b).a(0, (int) (((c7a) obj).a & 4294967295L)) & 4294967295L);
            case 26:
                return new r6a(((io) this.b).a(0L, ((c7a) obj).a, (ema) obj2));
            case 27:
                return C3360d6.a((C3360d6) this.b, (String) obj, (Map) obj2);
            case 28:
                efm efmVar = (efm) this.b;
                BlazeGAMBannerHandlerEventType blazeGAMBannerHandlerEventType = (BlazeGAMBannerHandlerEventType) obj;
                String str13 = (String) obj2;
                boolean z3 = efm.j;
                blazeGAMBannerHandlerEventType.getClass();
                str13.getClass();
                obm obmVar = (obm) efmVar.c;
                obmVar.getClass();
                ilm ilmVar = (ilm) obmVar.getViewModel();
                ilmVar.getClass();
                xlm i0 = ilmVar.i0();
                if (i0 != null && (list = i0.b) != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        gim gimVar = ((n4m) it2.next()).b;
                        storyModel = gimVar instanceof gim.d ? ((gim.d) gimVar).a : null;
                        if (storyModel != null) {
                            String str14 = (String) ilmVar.g.getValue();
                            String str15 = storyModel == null ? storyModel.id : null;
                            String str16 = storyModel == null ? storyModel.title : null;
                            ContentType contentType = ContentType.STORY;
                            if (storyModel != null && (blazeAdInfoModel = storyModel.h) != null) {
                                str2 = blazeAdInfoModel.e;
                            }
                            spm.postEvent$default(cwm.a, blazeGAMBannerHandlerEventType.toAnalyticEventActionName(), EventCategoryType.AD, jom.i(ilmVar), null, null, null, null, new AnalyticsPropsAd(str14, str15, str16, null, null, null, null, contentType, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str13, 2147482488, null), null, 376, null);
                            return Unit.a;
                        }
                    }
                }
                storyModel = null;
                String str142 = (String) ilmVar.g.getValue();
                if (storyModel == null) {
                }
                if (storyModel == null) {
                }
                ContentType contentType2 = ContentType.STORY;
                if (storyModel != null) {
                    str2 = blazeAdInfoModel.e;
                }
                spm.postEvent$default(cwm.a, blazeGAMBannerHandlerEventType.toAnalyticEventActionName(), EventCategoryType.AD, jom.i(ilmVar), null, null, null, null, new AnalyticsPropsAd(str142, str15, str16, null, null, null, null, contentType2, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str13, 2147482488, null), null, 376, null);
                return Unit.a;
            default:
                return C3468hb.a((C3468hb) this.b, (String) obj, (Map) obj2);
        }
    }

    public /* synthetic */ lqj(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
