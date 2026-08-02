package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.sofascore.local_persistance.Brand;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.ManagerData;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamLinkedRound;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.CareerHistory;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.model.newNetwork.NationalTeamStatisticsData;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.model.newNetwork.newRankings.RankingType;
import com.sofascore.model.profile.InvitedUser;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.R;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.league.fragment.details.LeagueEditorsBottomModal;
import com.sofascore.results.league.fragment.standings.LeagueStandingsFragment;
import com.sofascore.results.manager.details.ManagerDetailsFragment;
import com.sofascore.results.manager.matches.ManagerEventsFragment;
import com.sofascore.results.matchOfTheWeek.MatchOfTheWeekBottomSheet;
import com.sofascore.results.media.highlights.MediaHighlightsActivity;
import com.sofascore.results.mma.fightNight.MmaFightNightActivity;
import com.sofascore.results.mma.fightNight.MmaFightNightFragment;
import com.sofascore.results.mma.fighter.MmaFighterActivity;
import com.sofascore.results.mma.fighter.details.MmaFighterRankingsModal;
import com.sofascore.results.mma.fighter.matches.MmaFighterEventsFragment;
import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import com.sofascore.results.mma.organisation.rankings.MmaOrganisationRankingsFragment;
import com.sofascore.results.player.details.PlayerDetailsFragment;
import com.sofascore.results.player.matches.PlayerEventsFragment;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import com.sofascore.results.pots.topLeagues.POTSTopLeaguesFragment;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.tv.fragments.NewChannelsDialog;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bba implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bba(j2d j2dVar, i2d i2dVar) {
        this.a = 18;
        this.b = j2dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Team team;
        Team team2;
        RankingType rankingType;
        String weightClass;
        Gender gender;
        int i = this.a;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        Object[] objArr = 0;
        int i2 = 3;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                InvitedUser invitedUser = (InvitedUser) obj4;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    utc utcVar2 = utc.a;
                    xtc b0 = l98.b0(utcVar2, 8.0f);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, b0);
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
                    gz8.m(invitedUser != null ? Integer.valueOf(invitedUser.getProgressCount()) : null, null, av8Var, 0, 2);
                    if (invitedUser != null) {
                        av8Var.d0(-1925856870);
                        waa.h(invitedUser, l98.f0(utcVar2, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), av8Var, 0);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1925629919);
                        s02.u("1", R.string.referral_program_step_download, l98.f0(utcVar2, 8.0f, 16.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), Boolean.FALSE, av8Var, 3078, 0);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                mea meaVar = (mea) obj4;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    mea meaVar2 = mea.b;
                    if (meaVar == meaVar2) {
                        av8Var2.d0(1905806677);
                        kq9.a(haa.t(R.drawable.ic_menu_list_whats_new, 0, av8Var2), "", null, lz.D(R.color.surface_1, av8Var2), av8Var2, 56, 4);
                        av8Var2.s(false);
                    } else {
                        av8Var2.d0(1905947944);
                        av8Var2.s(false);
                    }
                    xtc f0 = l98.f0(utc.a, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    String upperCase = oea.v(meaVar == meaVar2 ? R.string.weekly_challenge_start_voting : R.string.user_sign_in, av8Var2).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    yf8 yf8Var = xth.a;
                    udj.c(upperCase, f0, 0L, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.a(), av8Var2, 48, 0, 130044);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                xva xvaVar = (xva) obj4;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    tz9.c(0, av8Var3, n9e.q(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var3), o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), oea.v(xvaVar.p ? R.string.traded_from : R.string.probability, av8Var3));
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                LeagueEditorsBottomModal leagueEditorsBottomModal = (LeagueEditorsBottomModal) obj4;
                ((Integer) obj2).getClass();
                ProfileData profileData = (ProfileData) obj3;
                ((View) obj).getClass();
                profileData.getClass();
                Context requireContext = leagueEditorsBottomModal.requireContext();
                requireContext.getClass();
                nv.n0(requireContext, ev.EDITOR_LEAGUE_MODAL);
                int i3 = ProfileActivity.Q;
                Context requireContext2 = leagueEditorsBottomModal.requireContext();
                requireContext2.getClass();
                v8a.H(requireContext2, profileData.getId(), profileData.getEditorName());
                return Unit.a;
            case 4:
                p4b p4bVar = (p4b) obj4;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    long b = hkg.b(p4bVar.h);
                    jf9 jf9Var = oyn.e;
                    utc utcVar3 = utc.a;
                    xtc c0 = l98.c0(n9e.q(utcVar3, b, jf9Var), 12.0f, 6.0f);
                    u23 a2 = t23.a(ww9.d, uxf.p, av8Var4, 48);
                    int hashCode2 = Long.hashCode(av8Var4.T);
                    aee m2 = av8Var4.m();
                    xtc C2 = fqj.C(av8Var4, c0);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var2);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, a2, hf3.g);
                    waa.K(av8Var4, m2, hf3.f);
                    waa.K(av8Var4, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var4, hf3.k);
                    waa.K(av8Var4, C2, hf3.d);
                    o6a.d(r4a.J(utcVar3, 30000, 5000), p4bVar, av8Var4, 0, 0);
                    xtc f02 = l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    String str = p4bVar.c;
                    long D = lz.D(R.color.on_color_primary, av8Var4);
                    yf8 yf8Var2 = xth.a;
                    udj.c(str, f02, D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.k(), av8Var4, 48, 0, 130040);
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 5:
                LeagueStandingsFragment leagueStandingsFragment = (LeagueStandingsFragment) obj4;
                View view = (View) obj;
                wt3.y((Integer) obj2, view, obj3);
                if (obj3 instanceof bbi) {
                    StandingsTableRow standingsTableRow = ((bbi) obj3).c;
                    List<TeamLinkedRound> teamLinks = standingsTableRow.getTeam().getTeamLinks();
                    if (teamLinks == null || teamLinks.isEmpty()) {
                        int i4 = TeamActivity.Z;
                        FragmentActivity requireActivity = leagueStandingsFragment.requireActivity();
                        requireActivity.getClass();
                        jle.r(requireActivity, standingsTableRow.getTeam().getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    } else {
                        List<TeamLinkedRound> teamLinks2 = standingsTableRow.getTeam().getTeamLinks();
                        if (teamLinks2 != null) {
                            Context requireContext3 = leagueStandingsFragment.requireContext();
                            requireContext3.getClass();
                            nxi.b(teamLinks2, requireContext3, view, (m0j) leagueStandingsFragment.t.getValue());
                        }
                    }
                }
                return Unit.a;
            case 6:
                x3b x3bVar = (x3b) obj4;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((xtc) obj).getClass();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 17) != 16)) {
                    td4.G(x3bVar.a, bkh.l(utcVar, 20.0f), false, 0L, av8Var5, 48, 12);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 7:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 62, 0L, 0L, (of3) obj2, (xtc) obj4);
                return Unit.a;
            case 8:
                ManagerDetailsFragment managerDetailsFragment = (ManagerDetailsFragment) obj4;
                wt3.y((Integer) obj2, (View) obj, obj3);
                CareerHistory careerHistory = obj3 instanceof CareerHistory ? (CareerHistory) obj3 : null;
                if (careerHistory != null && (team = careerHistory.getTeam()) != null) {
                    int i5 = TeamActivity.Z;
                    Context requireContext4 = managerDetailsFragment.requireContext();
                    requireContext4.getClass();
                    jle.r(requireContext4, team.getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                return Unit.a;
            case 9:
                ManagerEventsFragment managerEventsFragment = (ManagerEventsFragment) obj4;
                int intValue6 = ((Integer) obj).intValue();
                t6e t6eVar = (t6e) obj2;
                s6e s6eVar = (s6e) obj3;
                t6eVar.getClass();
                s6eVar.getClass();
                osb osbVar = (osb) managerEventsFragment.s.getValue();
                ManagerData managerData = (ManagerData) managerEventsFragment.r.getValue();
                lsb lsbVar = new lsb(0, managerEventsFragment, s6eVar);
                managerData.getClass();
                xw3.L(un0.z(osbVar), null, null, new zxa(osbVar, managerData, lsbVar, managerData.getManager().getId(), t6eVar, intValue6, (rq3) null), 3);
                return Unit.a;
            case 10:
                MatchOfTheWeekBottomSheet matchOfTheWeekBottomSheet = (MatchOfTheWeekBottomSheet) obj4;
                rwb rwbVar = (rwb) obj;
                ((Integer) obj3).getClass();
                rwbVar.getClass();
                mwb mwbVar = rwbVar.a;
                Brand brand = rwbVar.b;
                fwb fwbVar = rwbVar.c;
                qwb qwbVar = rwbVar.d;
                av8 av8Var6 = (av8) ((of3) obj2);
                boolean i6 = av8Var6.i(matchOfTheWeekBottomSheet);
                Object O = av8Var6.O();
                if (i6 || O == a99Var) {
                    O = new hwb(matchOfTheWeekBottomSheet, r15 ? 1 : 0);
                    av8Var6.n0(O);
                }
                sha.b(mwbVar, brand, fwbVar, qwbVar, null, (Function1) O, av8Var6, 0);
                return Unit.a;
            case 11:
                MediaHighlightsActivity mediaHighlightsActivity = (MediaHighlightsActivity) obj4;
                ((Integer) obj2).getClass();
                r5c r5cVar = (r5c) obj3;
                int i7 = MediaHighlightsActivity.a0;
                ((View) obj).getClass();
                r5cVar.getClass();
                Integer num = r5cVar.e;
                Highlight highlight = r5cVar.a;
                nv.Y(mediaHighlightsActivity, num != null ? num.intValue() : 0, kv.CLICK, r5cVar.d, null, "full_list_card", null, 80);
                mediaHighlightsActivity.Y = highlight.getId();
                mediaHighlightsActivity.Q().d.n(highlight);
                ArrayList arrayList = mediaHighlightsActivity.R().i;
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r5c r5cVar2 = (r5c) it.next();
                    arrayList2.add(r5c.a(r5cVar2, r5cVar2.a.getId() == highlight.getId(), 0, 59));
                }
                mediaHighlightsActivity.R().F(arrayList2);
                return Unit.a;
            case 12:
                Context context = ((dmc) obj4).b;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof Event) {
                    int i8 = MmaFightNightActivity.R;
                    x2a.S(((Event) obj3).getTournament().getId(), context);
                }
                if (obj3 instanceof UniqueTournament) {
                    int i9 = MmaOrganisationActivity.T;
                    inb.F(((UniqueTournament) obj3).getId(), context);
                }
                return Unit.a;
            case 13:
                MmaFightNightFragment mmaFightNightFragment = (MmaFightNightFragment) obj4;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof Event) {
                    wxf wxfVar = EventActivity.h0;
                    Context requireContext5 = mmaFightNightFragment.requireContext();
                    requireContext5.getClass();
                    wxf.B(requireContext5, ((Event) obj3).getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                return Unit.a;
            case 14:
                MmaFighterEventsFragment mmaFighterEventsFragment = (MmaFighterEventsFragment) obj4;
                int intValue7 = ((Integer) obj).intValue();
                t6e t6eVar2 = (t6e) obj2;
                s6e s6eVar2 = (s6e) obj3;
                t6eVar2.getClass();
                s6eVar2.getClass();
                znc zncVar = (znc) mmaFighterEventsFragment.s.getValue();
                xw3.L(un0.z(zncVar), null, null, new ly7(zncVar, ((Team) mmaFighterEventsFragment.r.getValue()).getId(), t6eVar2, intValue7, s6eVar2, null, 3), 3);
                return Unit.a;
            case 15:
                MmaFighterRankingsModal mmaFighterRankingsModal = (MmaFighterRankingsModal) obj4;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if ((obj3 instanceof RankingRow) && (team2 = ((RankingRow) obj3).getTeam()) != null) {
                    int i10 = MmaFighterActivity.U;
                    Context requireContext6 = mmaFighterRankingsModal.requireContext();
                    requireContext6.getClass();
                    f7a.x(team2.getId(), requireContext6);
                }
                return Unit.a;
            case 16:
                MmaOrganisationRankingsFragment mmaOrganisationRankingsFragment = (MmaOrganisationRankingsFragment) obj4;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof RankingRow) {
                    Team team3 = ((RankingRow) obj3).getTeam();
                    if (team3 != null) {
                        int id = team3.getId();
                        int i11 = MmaFighterActivity.U;
                        Context requireContext7 = mmaOrganisationRankingsFragment.requireContext();
                        requireContext7.getClass();
                        f7a.x(id, requireContext7);
                    }
                } else if ((obj3 instanceof RankingType) && (weightClass = (rankingType = (RankingType) obj3).getWeightClass()) != null && (gender = rankingType.getGender()) != null) {
                    FragmentActivity requireActivity2 = mmaOrganisationRankingsFragment.requireActivity();
                    requireActivity2.getClass();
                    UniqueTournament uniqueTournament = mmaOrganisationRankingsFragment.r;
                    if (uniqueTournament == null) {
                        Intrinsics.i("organisation");
                        throw null;
                    }
                    int id2 = uniqueTournament.getId();
                    Context requireContext8 = mmaOrganisationRankingsFragment.requireContext();
                    requireContext8.getClass();
                    String q = tnf.q(requireContext8, weightClass);
                    MmaFighterRankingsModal mmaFighterRankingsModal2 = new MmaFighterRankingsModal();
                    Bundle bundle = new Bundle();
                    bundle.putInt("UNIQUE_TOURNAMENT_ID", id2);
                    bundle.putString("WEIGHT_CLASS", weightClass);
                    bundle.putSerializable("GENDER", gender);
                    bundle.putString(NativeAdContent.ViewTag.AD_TITLE, q);
                    mmaFighterRankingsModal2.setArguments(bundle);
                    AppCompatActivity appCompatActivity = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(mmaFighterRankingsModal2, appCompatActivity, objArr == true ? 1 : 0, i2));
                    }
                }
                return Unit.a;
            case 17:
                rwc rwcVar = (rwc) obj4;
                of3 of3Var6 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= (intValue8 & 8) == 0 ? ((av8) of3Var6).g(obj) : ((av8) of3Var6).i(obj) ? 4 : 2;
                }
                av8 av8Var7 = (av8) of3Var6;
                if (av8Var7.T(intValue8 & 1, (intValue8 & 19) != 18)) {
                    av8Var7.F(rwcVar, av8Var7.m(), obj, false);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 18:
                j2d j2dVar = (j2d) obj4;
                j2d.i.set(j2dVar, null);
                j2dVar.f(null);
                return Unit.a;
            case 19:
                NewChannelsDialog newChannelsDialog = (NewChannelsDialog) obj4;
                ((Integer) obj2).getClass();
                TvChannel tvChannel = (TvChannel) obj3;
                ((View) obj).getClass();
                tvChannel.getClass();
                if (newChannelsDialog.t < 150 || tvChannel.getIsSelected()) {
                    newChannelsDialog.t += tvChannel.getIsSelected() ? -1 : 1;
                    tvChannel.setSelected(!tvChannel.getIsSelected());
                    ((pbd) newChannelsDialog.s.getValue()).w(tvChannel);
                } else {
                    Calendar calendar = ke0.a;
                    Context requireContext9 = newChannelsDialog.requireContext();
                    requireContext9.getClass();
                    ke0.g(requireContext9, newChannelsDialog.getString(R.string.max_channels_selected), 0);
                }
                return Unit.a;
            case 20:
                d1e d1eVar = (d1e) obj4;
                xtc xtcVar = (xtc) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                xtcVar.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((av8) of3Var7).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var8 = (av8) of3Var7;
                if (av8Var8.T(intValue9 & 1, (intValue9 & 19) != 18)) {
                    td4.G(d1eVar.a, xtcVar, false, 0L, av8Var8, (intValue9 << 3) & 112, 12);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 21:
                c1e c1eVar = (c1e) obj4;
                xtc xtcVar2 = (xtc) obj;
                of3 of3Var8 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                xtcVar2.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((av8) of3Var8).g(xtcVar2) ? 4 : 2;
                }
                av8 av8Var9 = (av8) of3Var8;
                if (av8Var9.T(intValue10 & 1, (intValue10 & 19) != 18)) {
                    td4.k(c1eVar.b, xtcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var9, (intValue10 << 3) & 112, 12);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 22:
                POTSTopLeaguesFragment pOTSTopLeaguesFragment = (POTSTopLeaguesFragment) obj4;
                c3e c3eVar = (c3e) obj;
                of3 of3Var9 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                c3eVar.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= (intValue11 & 8) == 0 ? ((av8) of3Var9).g(c3eVar) : ((av8) of3Var9).i(c3eVar) ? 4 : 2;
                }
                av8 av8Var10 = (av8) of3Var9;
                if (av8Var10.T(intValue11 & 1, (intValue11 & 19) != 18)) {
                    boolean i12 = av8Var10.i(pOTSTopLeaguesFragment);
                    Object O2 = av8Var10.O();
                    if (i12 || O2 == a99Var) {
                        O2 = new mnc(pOTSTopLeaguesFragment, 23);
                        av8Var10.n0(O2);
                    }
                    ml4.A(c3eVar, (Function1) O2, av8Var10, intValue11 & 14);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 23:
                UniqueTournament uniqueTournament2 = ((PickerItem.Tournament) obj4).b;
                xtc xtcVar3 = (xtc) obj;
                of3 of3Var10 = (of3) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                xtcVar3.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((av8) of3Var10).g(xtcVar3) ? 4 : 2;
                }
                av8 av8Var11 = (av8) of3Var10;
                if (!av8Var11.T(intValue12 & 1, (intValue12 & 19) != 18)) {
                    av8Var11.W();
                } else if (uniqueTournament2 != null) {
                    av8Var11.d0(-1742165512);
                    td4.y(uniqueTournament2.getId(), (intValue12 << 3) & 112, 12, av8Var11, xtcVar3, null, false);
                    av8Var11.s(false);
                } else {
                    av8Var11.d0(-1741888744);
                    kq9.b(s6a.N(R.drawable.cup_logo_placeholder, 6, av8Var11), null, xtcVar3, r13.i, av8Var11, ((intValue12 << 6) & 896) | 3120, 0);
                    av8Var11.s(false);
                }
                return Unit.a;
            case 24:
                PlayerDetailsFragment playerDetailsFragment = (PlayerDetailsFragment) obj4;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof Transfer) {
                    int i13 = TeamActivity.Z;
                    Context requireContext10 = playerDetailsFragment.requireContext();
                    requireContext10.getClass();
                    Team transferTo = ((Transfer) obj3).getTransferTo();
                    jle.r(requireContext10, transferTo != null ? transferTo.getId() : 0, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                } else if (obj3 instanceof NationalTeamStatisticsData) {
                    int i14 = TeamActivity.Z;
                    Context requireContext11 = playerDetailsFragment.requireContext();
                    requireContext11.getClass();
                    jle.r(requireContext11, ((NationalTeamStatisticsData) obj3).getTeam().getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                return Unit.a;
            case 25:
                Team team4 = (Team) obj4;
                xtc xtcVar4 = (xtc) obj;
                of3 of3Var11 = (of3) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                xtcVar4.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((av8) of3Var11).g(xtcVar4) ? 4 : 2;
                }
                av8 av8Var12 = (av8) of3Var11;
                if (av8Var12.T(intValue13 & 1, (intValue13 & 19) != 18)) {
                    td4.G(team4.getId(), xtcVar4, false, 0L, av8Var12, (intValue13 << 3) & 112, 12);
                } else {
                    av8Var12.W();
                }
                return Unit.a;
            case 26:
                PlayerEventsFragment playerEventsFragment = (PlayerEventsFragment) obj4;
                int intValue14 = ((Integer) obj).intValue();
                s6e s6eVar3 = (s6e) obj3;
                ((t6e) obj2).getClass();
                s6eVar3.getClass();
                qqe qqeVar = (qqe) playerEventsFragment.t.getValue();
                int id3 = playerEventsFragment.F().getId();
                gqe gqeVar = (gqe) ((eoh) playerEventsFragment.A).getValue();
                xw3.L(un0.z(qqeVar), null, null, new xy5(gqeVar != null ? gqeVar.a : null, new ord(19, playerEventsFragment, s6eVar3), qqeVar, id3, intValue14, (rq3) null), 3);
                return Unit.a;
            case 27:
                gqe gqeVar2 = (gqe) obj4;
                xtc xtcVar5 = (xtc) obj;
                of3 of3Var12 = (of3) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                xtcVar5.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((av8) of3Var12).g(xtcVar5) ? 4 : 2;
                }
                av8 av8Var13 = (av8) of3Var12;
                if (av8Var13.T(intValue15 & 1, (intValue15 & 19) != 18)) {
                    Integer num2 = gqeVar2.a;
                    if (num2 == null) {
                        av8Var13.d0(-182187323);
                        av8Var13.s(false);
                    } else {
                        av8Var13.d0(-182187322);
                        td4.y(num2.intValue(), (intValue15 << 3) & 112, 12, av8Var13, xtcVar5, null, false);
                        av8Var13.s(false);
                    }
                } else {
                    av8Var13.W();
                }
                return Unit.a;
            case 28:
                FantasyPlayerUiModel fantasyPlayerUiModel = (FantasyPlayerUiModel) obj4;
                xpa xpaVar = (xpa) obj;
                of3 of3Var13 = (of3) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((av8) of3Var13).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var14 = (av8) of3Var13;
                if (av8Var14.T(intValue16 & 1, (intValue16 & 19) != 18)) {
                    v9g.j(fantasyPlayerUiModel, l98.f0(l98.d0(xpa.a(xpaVar, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), av8Var14, 0);
                } else {
                    av8Var14.W();
                }
                return Unit.a;
            default:
                hre hreVar = (hre) obj4;
                xpa xpaVar2 = (xpa) obj;
                of3 of3Var14 = (of3) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                xpaVar2.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((av8) of3Var14).g(xpaVar2) ? 4 : 2;
                }
                av8 av8Var15 = (av8) of3Var14;
                if (av8Var15.T(intValue17 & 1, (intValue17 & 19) != 18)) {
                    l6g.m(hreVar.c, l98.f0(l98.d0(xpa.a(xpaVar2, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), av8Var15, 0);
                } else {
                    av8Var15.W();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ bba(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
