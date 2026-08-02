package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.e;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.ProductDetails;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.bettingtips.TeamStreak;
import com.sofascore.model.newNetwork.TvEvent;
import com.sofascore.model.newNetwork.TvStageEvent;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.fragment.TeamStreaksFragment;
import com.sofascore.results.bettingtips.fragment.TopH2HFragment;
import com.sofascore.results.dialog.TopStatsCategoryBottomSheet;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.view.tv.dialog.TvChannelCountriesDialog;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.profile.view.WeeklyStreakRestoreModal;
import com.sofascore.results.stagesport.StageDetailsActivity;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.sofascore.results.team.playerstats.TeamPlayerStatsFragment;
import com.sofascore.results.team.standings.TeamStandingsFragment;
import com.sofascore.results.team.transfers.TeamTransfersModal;
import com.sofascore.results.tv.fragments.TVChannelsPickerModal;
import com.sofascore.results.tv.fragments.TVScheduleFragment;
import com.sofascore.results.venue.matches.VenueMatchesFragment;
import com.sofascore.results.weeklyChallenge.leaderboard.WeeklyLeaderboardFragment;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class uri implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uri(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Integer] */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Season season;
        Player player;
        TopStatsCategory topStatsCategory;
        c3j c3jVar;
        int i = this.a;
        a99 a99Var = nf3.a;
        int i2 = 2;
        int i3 = 3;
        rq3 rq3Var = null;
        r11 = null;
        Integer num = null;
        Object obj4 = null;
        Object obj5 = null;
        rq3Var = null;
        int i4 = 0;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                TVChannelsPickerModal tVChannelsPickerModal = (TVChannelsPickerModal) obj6;
                ((Integer) obj2).getClass();
                Country country = (Country) obj3;
                ((View) obj).getClass();
                country.getClass();
                u3k u3kVar = (u3k) tVChannelsPickerModal.w.getValue();
                u3kVar.g.j(country);
                xw3.L(un0.z(u3kVar), null, null, new vki(u3kVar, country, rq3Var, 22), 3);
                tVChannelsPickerModal.q();
                return Unit.a;
            case 1:
                TVScheduleFragment tVScheduleFragment = (TVScheduleFragment) obj6;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof TvEvent) {
                    wxf wxfVar = EventActivity.h0;
                    FragmentActivity requireActivity = tVScheduleFragment.requireActivity();
                    requireActivity.getClass();
                    wxf.B(requireActivity, ((TvEvent) obj3).getEvent().getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else if (obj3 instanceof TvStageEvent) {
                    fff fffVar = StageDetailsActivity.T;
                    FragmentActivity requireActivity2 = tVScheduleFragment.requireActivity();
                    requireActivity2.getClass();
                    Stage stage = ((TvStageEvent) obj3).getStage();
                    requireActivity2.getClass();
                    stage.getClass();
                    fffVar.g(requireActivity2, stage, null);
                }
                return Unit.a;
            case 2:
                TeamEventsFragment teamEventsFragment = (TeamEventsFragment) obj6;
                int intValue = ((Integer) obj).intValue();
                t6e t6eVar = (t6e) obj2;
                s6e s6eVar = (s6e) obj3;
                t6eVar.getClass();
                s6eVar.getClass();
                xwi E = teamEventsFragment.E();
                E.s = xw3.L(un0.z(E), null, null, new z23(E, t6eVar, intValue, new dvi(6, teamEventsFragment, s6eVar), (rq3) null, 19), 3);
                return Unit.a;
            case 3:
                TeamPlayerStatsFragment teamPlayerStatsFragment = (TeamPlayerStatsFragment) obj6;
                ((Integer) obj2).getClass();
                qyi qyiVar = (qyi) obj3;
                ((View) obj).getClass();
                qyiVar.getClass();
                int i5 = PlayerActivity.Z;
                Context requireContext = teamPlayerStatsFragment.requireContext();
                requireContext.getClass();
                int id = qyiVar.a.getId();
                e1d e1dVar = teamPlayerStatsFragment.A;
                syi syiVar = (syi) ((eoh) e1dVar).getValue();
                int i6 = syiVar != null ? syiVar.a : 0;
                syi syiVar2 = (syi) ((eoh) e1dVar).getValue();
                if (syiVar2 != null && (season = syiVar2.b) != null) {
                    rq3Var = Integer.valueOf(season.getId());
                }
                jle.q(requireContext, id, i6, rq3Var, null, false, null, null, 496);
                return Unit.a;
            case 4:
                syi syiVar3 = (syi) obj6;
                xtc xtcVar = (xtc) obj;
                of3 of3Var = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xtcVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    td4.y(syiVar3.a, (intValue2 << 3) & 112, 12, av8Var, xtcVar, null, false);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 5:
                TeamStandingsFragment teamStandingsFragment = (TeamStandingsFragment) obj6;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof ebi) {
                    a99 a99Var2 = LeagueActivity.h0;
                    FragmentActivity requireActivity3 = teamStandingsFragment.requireActivity();
                    requireActivity3.getClass();
                    a99Var2.z(requireActivity3, ((ebi) obj3).b);
                } else if (obj3 instanceof bbi) {
                    int i7 = TeamActivity.Z;
                    FragmentActivity requireActivity4 = teamStandingsFragment.requireActivity();
                    requireActivity4.getClass();
                    jle.r(requireActivity4, ((bbi) obj3).c.getTeam().getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                return Unit.a;
            case 6:
                TeamStreaksFragment teamStreaksFragment = (TeamStreaksFragment) obj6;
                ((Integer) obj2).getClass();
                o2j o2jVar = (o2j) obj3;
                ((View) obj).getClass();
                o2jVar.getClass();
                int i8 = TeamActivity.Z;
                Context requireContext2 = teamStreaksFragment.requireContext();
                requireContext2.getClass();
                TeamStreak teamStreak = o2jVar.a;
                jle.r(requireContext2, teamStreak.getTeam().getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                Context requireContext3 = teamStreaksFragment.requireContext();
                requireContext3.getClass();
                yu1[] yu1VarArr = yu1.a;
                zu1 zu1Var = (zu1) teamStreaksFragment.A().g.d();
                nv.n(requireContext3, "streaks_team", zu1Var != null ? zu1Var.a : "", null, Integer.valueOf(teamStreak.getTeam().getId()));
                return Unit.a;
            case 7:
                TeamTransfersModal teamTransfersModal = (TeamTransfersModal) obj6;
                ((Integer) obj2).getClass();
                lvj lvjVar = (lvj) obj3;
                ((View) obj).getClass();
                lvjVar.getClass();
                Transfer transfer = (Transfer) CollectionsKt.firstOrNull(lvjVar.a);
                if (transfer != null && (player = transfer.getPlayer()) != null) {
                    int i9 = PlayerActivity.Z;
                    Context requireContext4 = teamTransfersModal.requireContext();
                    requireContext4.getClass();
                    jle.q(requireContext4, player.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                }
                return Unit.a;
            case 8:
                g4j g4jVar = (g4j) obj6;
                xpa xpaVar = (xpa) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var2).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    xtc f0 = l98.f0(xpa.a(xpaVar, utc.a, 3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5);
                    int i10 = g4jVar.a.b;
                    if (i10 == 0) {
                        i10 = R.string.football_international_competitions;
                    }
                    String v = oea.v(i10, av8Var2);
                    yf8 yf8Var = xth.a;
                    udj.c(v, f0, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var2, 0, 0, 131064);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 9:
                caj cajVar = (caj) obj6;
                int intValue4 = ((Integer) obj).intValue();
                int intValue5 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                jwj jwjVar = cajVar.q;
                m9j c = booleanValue ? jwjVar.a.c() : jwjVar.d();
                long j = c.d;
                if (!cajVar.u || Math.min(intValue4, intValue5) < 0 || Math.max(intValue4, intValue5) > c.c.length()) {
                    r10 = false;
                } else {
                    int i11 = pej.c;
                    if (intValue4 != ((int) (j >> 32)) || intValue5 != ((int) (j & 4294967295L))) {
                        long g = t6a.g(intValue4, intValue5);
                        if (booleanValue || intValue4 == intValue5) {
                            cajVar.s.x(gfj.a);
                        } else {
                            cajVar.s.x(gfj.c);
                        }
                        jwj jwjVar2 = cajVar.q;
                        if (booleanValue) {
                            jwjVar2.k(g);
                        } else {
                            jwjVar2.j(g);
                        }
                    }
                }
                return Boolean.valueOf(r10);
            case 10:
                tbj tbjVar = (tbj) obj6;
                xtc xtcVar2 = (xtc) obj;
                ((Integer) obj3).getClass();
                av8 av8Var3 = (av8) ((of3) obj2);
                av8Var3.d0(1980580247);
                kx4 kx4Var = (kx4) av8Var3.k(dh3.h);
                Object O = av8Var3.O();
                Object obj7 = O;
                if (O == a99Var) {
                    e1d f = e.f(new c7a(0L));
                    av8Var3.n0(f);
                    obj7 = f;
                }
                e1d e1dVar2 = (e1d) obj7;
                boolean i12 = av8Var3.i(tbjVar);
                Object O2 = av8Var3.O();
                Object obj8 = O2;
                if (i12 || O2 == a99Var) {
                    deh dehVar = new deh(29, tbjVar, e1dVar2);
                    av8Var3.n0(dehVar);
                    obj8 = dehVar;
                }
                Function0 function0 = (Function0) obj8;
                boolean g2 = av8Var3.g(kx4Var);
                Object O3 = av8Var3.O();
                Object obj9 = O3;
                if (g2 || O3 == a99Var) {
                    fo6 fo6Var = new fo6(kx4Var, e1dVar2, i3);
                    av8Var3.n0(fo6Var);
                    obj9 = fo6Var;
                }
                g80 g80Var = g3h.a;
                xtc q = fqj.q(xtcVar2, new yya(25, (Object) function0, (Function1) obj9));
                av8Var3.s(false);
                return q;
            case 11:
                TopH2HFragment topH2HFragment = (TopH2HFragment) obj6;
                ((Integer) obj2).getClass();
                ud6 ud6Var = (ud6) obj3;
                ((View) obj).getClass();
                ud6Var.getClass();
                wxf wxfVar2 = EventActivity.h0;
                Context requireContext5 = topH2HFragment.requireContext();
                requireContext5.getClass();
                Event event = ud6Var.b;
                wxf.B(requireContext5, event.getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                Context requireContext6 = topH2HFragment.requireContext();
                requireContext6.getClass();
                yu1[] yu1VarArr2 = yu1.a;
                zu1 zu1Var2 = (zu1) topH2HFragment.A().g.d();
                nv.n(requireContext6, "h2h_event", zu1Var2 != null ? zu1Var2.a : "", Integer.valueOf(event.getId()), null);
                return Unit.a;
            case 12:
                TopStatsCategoryBottomSheet topStatsCategoryBottomSheet = (TopStatsCategoryBottomSheet) obj6;
                joa joaVar = topStatsCategoryBottomSheet.E;
                ynj ynjVar = (ynj) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ynjVar.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= (intValue6 & 8) == 0 ? ((av8) of3Var3).g(ynjVar) : ((av8) of3Var3).i(ynjVar) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var3;
                if (av8Var4.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    qnj qnjVar = ynjVar.f;
                    g3j g3jVar = qnjVar instanceof g3j ? (g3j) qnjVar : null;
                    if (((g3jVar == null || (c3jVar = g3jVar.h) == null) ? null : c3jVar.a) == h3j.a) {
                        Iterator it = ynjVar.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (Intrinsics.c(((TopStatsCategory) next).getA(), (String) joaVar.getValue())) {
                                    obj4 = next;
                                }
                            }
                        }
                        topStatsCategory = (TopStatsCategory) obj4;
                    } else {
                        Iterator it2 = ynjVar.a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (Intrinsics.c(((TopStatsCategory) next2).getA(), (String) joaVar.getValue())) {
                                    obj5 = next2;
                                }
                            }
                        }
                        topStatsCategory = (TopStatsCategory) obj5;
                    }
                    t3e C = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 72.0f, 7);
                    boolean i13 = av8Var4.i(topStatsCategory) | av8Var4.i(topStatsCategoryBottomSheet);
                    if ((intValue6 & 14) != 4 && ((intValue6 & 8) == 0 || !av8Var4.i(ynjVar))) {
                        r10 = false;
                    }
                    boolean z = i13 | r10;
                    Object O4 = av8Var4.O();
                    if (z || O4 == a99Var) {
                        O4 = new ncj(i2, topStatsCategory, topStatsCategoryBottomSheet, ynjVar);
                        av8Var4.n0(O4);
                    }
                    v8a.a(null, null, C, null, null, null, false, null, (Function1) O4, av8Var4, 384, PglCryptUtils.UNKNOWN_ERR);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 13:
                huj hujVar = (huj) obj6;
                xtc xtcVar3 = (xtc) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                xtcVar3.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((av8) of3Var4).g(xtcVar3) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var4;
                if (av8Var5.T(intValue7 & 1, (intValue7 & 19) != 18)) {
                    td4.G(hujVar.a, xtcVar3, false, 0L, av8Var5, (intValue7 << 3) & 112, 12);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 14:
                f3k f3kVar = (f3k) obj6;
                int intValue8 = ((Integer) obj2).intValue();
                TvChannel tvChannel = (TvChannel) obj3;
                ((View) obj).getClass();
                tvChannel.getClass();
                Integer num2 = f3kVar.m;
                if (num2 != null) {
                    int intValue9 = num2.intValue();
                    Iterator it3 = f3kVar.i.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            i4 = -1;
                        } else if (((TvChannel) it3.next()).getId() != intValue9) {
                            i4++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i4);
                    if (i4 > -1) {
                        num = valueOf;
                    }
                }
                f3kVar.m = Integer.valueOf(tvChannel.getId());
                if (num != null) {
                    f3kVar.notifyItemChanged(num.intValue());
                }
                f3kVar.notifyItemChanged(intValue8);
                c3k c3kVar = f3kVar.l;
                if (c3kVar != null) {
                    c3kVar.invoke();
                }
                return Unit.a;
            case 15:
                TvChannelCountriesDialog tvChannelCountriesDialog = (TvChannelCountriesDialog) obj6;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof Country) {
                    Function1 function1 = tvChannelCountriesDialog.F;
                    if (function1 != null) {
                        function1.invoke(obj3);
                    }
                    tvChannelCountriesDialog.j();
                }
                return Unit.a;
            case 16:
                b3l b3lVar = (b3l) obj6;
                of3 of3Var5 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var6 = (av8) of3Var5;
                if (av8Var6.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    t2l.a(b3lVar, null, av8Var6, 0);
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 17:
                VenueMatchesFragment venueMatchesFragment = (VenueMatchesFragment) obj6;
                int intValue11 = ((Integer) obj).intValue();
                t6e t6eVar2 = (t6e) obj2;
                s6e s6eVar2 = (s6e) obj3;
                t6eVar2.getClass();
                s6eVar2.getClass();
                onk E2 = venueMatchesFragment.E();
                xw3.L(un0.z(E2), null, null, new zb9(new mwj(21, venueMatchesFragment, s6eVar2), E2, venueMatchesFragment.D(), t6eVar2, intValue11, (rq3) null), 3);
                return Unit.a;
            case 18:
                g3l g3lVar = (g3l) obj6;
                of3 of3Var6 = (of3) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var7 = (av8) of3Var6;
                if (av8Var7.T(intValue12 & 1, (intValue12 & 17) != 16)) {
                    h5a.y(oea.v(R.string.weekly_challenge_personal_bests, av8Var7), yqo.H(-633317771, av8Var7, new d3l(g3lVar, r12)), null, false, null, av8Var7, 48, 28);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 19:
                WeeklyLeaderboardFragment weeklyLeaderboardFragment = (WeeklyLeaderboardFragment) obj6;
                ProductDetails productDetails = (ProductDetails) obj;
                int intValue13 = ((Integer) obj2).intValue();
                long longValue = ((Long) obj3).longValue();
                productDetails.getClass();
                Context requireContext7 = weeklyLeaderboardFragment.requireContext();
                requireContext7.getClass();
                r4l r4lVar = new r4l(weeklyLeaderboardFragment, i3);
                WeeklyStreakRestoreModal.A = productDetails;
                WeeklyStreakRestoreModal.B = r4lVar;
                WeeklyStreakRestoreModal weeklyStreakRestoreModal = new WeeklyStreakRestoreModal();
                Bundle bundle = new Bundle();
                bundle.putInt("STREAK_COUNT", intValue13);
                bundle.putLong("LEAGUE_END_TIMESTAMP", longValue);
                weeklyStreakRestoreModal.setArguments(bundle);
                if (requireContext7 instanceof csk) {
                    requireContext7 = ((csk) requireContext7).getBaseContext();
                }
                AppCompatActivity appCompatActivity = requireContext7 instanceof AppCompatActivity ? (AppCompatActivity) requireContext7 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(weeklyStreakRestoreModal, appCompatActivity, rq3Var, i3));
                }
                return Unit.a;
            case 20:
                v3l v3lVar = (v3l) obj6;
                of3 of3Var7 = (of3) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var8 = (av8) of3Var7;
                if (av8Var8.T(intValue14 & 1, (intValue14 & 17) != 16)) {
                    v9g.a(v3lVar.a.a(), 0, av8Var8, 0, 2);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 21:
                w3l w3lVar = (w3l) obj6;
                of3 of3Var8 = (of3) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var9 = (av8) of3Var8;
                if (av8Var9.T(intValue15 & 1, (intValue15 & 17) != 16)) {
                    l3l l3lVar = w3lVar.a;
                    v9g.a(l3lVar.a, l3lVar.c, av8Var9, 0, 0);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 22:
                b0l b0lVar = (b0l) obj6;
                xtc xtcVar4 = (xtc) obj;
                ((Integer) obj3).getClass();
                xtcVar4.getClass();
                av8 av8Var10 = (av8) ((of3) obj2);
                av8Var10.d0(256807181);
                gv9 gv9Var = vel.d;
                int i14 = b0lVar.b;
                int s0 = hkg.s0(lz.D(((zdl) gv9Var.get(i14)).b, av8Var10));
                int s02 = hkg.s0(lz.D(((zdl) gv9Var.get(i14)).a, av8Var10));
                int i15 = b0lVar.c;
                int s03 = hkg.s0(lz.D(((zdl) gv9Var.get(i15)).b, av8Var10));
                int s04 = hkg.s0(lz.D(((zdl) gv9Var.get(i15)).a, av8Var10));
                boolean e = av8Var10.e(i14);
                Object O5 = av8Var10.O();
                if (e || O5 == a99Var) {
                    RadialGradient radialGradient = new RadialGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, new int[]{s0, s02}, (float[]) null, Shader.TileMode.CLAMP);
                    av8Var10.n0(radialGradient);
                    O5 = radialGradient;
                }
                RadialGradient radialGradient2 = (RadialGradient) O5;
                boolean e2 = av8Var10.e(i15);
                Object O6 = av8Var10.O();
                if (e2 || O6 == a99Var) {
                    RadialGradient radialGradient3 = new RadialGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, new int[]{s03, s04}, (float[]) null, Shader.TileMode.CLAMP);
                    av8Var10.n0(radialGradient3);
                    O6 = radialGradient3;
                }
                RadialGradient radialGradient4 = (RadialGradient) O6;
                boolean g3 = av8Var10.g(radialGradient2);
                Object O7 = av8Var10.O();
                Object obj10 = O7;
                if (g3 || O7 == a99Var) {
                    Paint paint = new Paint();
                    paint.setShader(radialGradient2);
                    av8Var10.n0(paint);
                    obj10 = paint;
                }
                Paint paint2 = (Paint) obj10;
                boolean g4 = av8Var10.g(radialGradient4);
                Object O8 = av8Var10.O();
                Object obj11 = O8;
                if (g4 || O8 == a99Var) {
                    Paint paint3 = new Paint();
                    paint3.setShader(radialGradient4);
                    av8Var10.n0(paint3);
                    obj11 = paint3;
                }
                Paint paint4 = (Paint) obj11;
                Object O9 = av8Var10.O();
                Object obj12 = O9;
                if (O9 == a99Var) {
                    Matrix matrix = new Matrix();
                    av8Var10.n0(matrix);
                    obj12 = matrix;
                }
                Matrix matrix2 = (Matrix) obj12;
                Object O10 = av8Var10.O();
                Object obj13 = O10;
                if (O10 == a99Var) {
                    Matrix matrix3 = new Matrix();
                    av8Var10.n0(matrix3);
                    obj13 = matrix3;
                }
                Matrix matrix4 = (Matrix) obj13;
                Object O11 = av8Var10.O();
                Object obj14 = O11;
                if (O11 == a99Var) {
                    Path path = new Path();
                    av8Var10.n0(path);
                    obj14 = path;
                }
                Path path2 = (Path) obj14;
                boolean g5 = av8Var10.g(b0lVar) | av8Var10.i(matrix2) | av8Var10.i(radialGradient2) | av8Var10.i(matrix4) | av8Var10.i(radialGradient4) | av8Var10.i(paint2) | av8Var10.i(path2) | av8Var10.i(paint4);
                Object O12 = av8Var10.O();
                if (g5 || O12 == a99Var) {
                    ft2 ft2Var = new ft2(b0lVar, matrix2, radialGradient2, matrix4, radialGradient4, paint2, path2, paint4, 4);
                    av8Var10.n0(ft2Var);
                    O12 = ft2Var;
                }
                xtc X = td4.X(xtcVar4, (Function1) O12);
                av8Var10.s(false);
                return X;
            default:
                skl sklVar = (skl) obj6;
                of3 of3Var9 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((o8g) obj).getClass();
                wca.k(sklVar.a, o8g.a(), of3Var9, 0);
                ty8 ty8Var = ty8.a;
                aba.i(nq8.N(ty8Var, 4.0f), of3Var9, 0);
                wca.k(sklVar.b, o8g.a(), of3Var9, 0);
                aba.i(nq8.N(ty8Var, 4.0f), of3Var9, 0);
                kda.k(sklVar.c, o8g.a(), of3Var9, 0, 0);
                return Unit.a;
        }
    }
}
