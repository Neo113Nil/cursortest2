package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.e;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.Sports;
import com.sofascore.model.fantasy.FantasyPlayerPriceChanges;
import com.sofascore.model.fantasy.FantasyPriceChange;
import com.sofascore.model.fantasy.FantasyPriceChangeReason;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamLinkedRound;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.bettingtips.EventStreak;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.fragment.HighValueStreaksFragment;
import com.sofascore.results.dialog.EventListBottomSheet;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.event.lineups.EventPreMatchLineupsFragment;
import com.sofascore.results.event.lineups.othersports.EventOtherSportsLineupsFragment;
import com.sofascore.results.event.media.FullScreenVideoActivity;
import com.sofascore.results.event.mmastatistics.EventMmaStatisticsFragment;
import com.sofascore.results.event.scorecard.EventScorecardFragment;
import com.sofascore.results.event.standings.EventStandingsFragment;
import com.sofascore.results.event.statistics.EventStatisticsFragment;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.sofascore.results.fantasy.competition.home.bottomsheet.topplayers.FantasyTopPlayersBottomSheet;
import com.sofascore.results.featuredtournament.FeaturedTournamentFragment;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentCalendarRailView;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s16 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s16(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        he9 he9Var = (he9) this.b;
        xtc xtcVar = (xtc) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        xtcVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            Integer num = he9Var.e;
            if (num == null) {
                av8Var.d0(396612028);
                av8Var.s(false);
            } else {
                av8Var.d0(396612029);
                kq9.b(s6a.N(num.intValue(), 6, av8Var), null, l98.b0(xtcVar, 4.0f), r13.i, av8Var, 3120, 0);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08af  */
    /* JADX WARN: Type inference failed for: r0v178, types: [efi] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v30 */
    @Override // defpackage.ct8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Lineups awayLineups$default;
        PlayerData playerData;
        Double d;
        Double avgRating;
        FragmentActivity activity;
        PlayerEventStatistics statistics;
        List<PlayerData> players;
        Object obj4;
        int i;
        int i2;
        int i3;
        String k;
        long f;
        String C;
        int i4 = this.a;
        int i5 = 29;
        a99 a99Var = nf3.a;
        utc utcVar = utc.a;
        String H = null;
        Object obj5 = this.b;
        switch (i4) {
            case 0:
                EventListBottomSheet eventListBottomSheet = (EventListBottomSheet) obj5;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof y21) {
                    wxf wxfVar = EventActivity.h0;
                    FragmentActivity requireActivity = eventListBottomSheet.requireActivity();
                    requireActivity.getClass();
                    wxf.B(requireActivity, ((y21) obj3).d().getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                return Unit.a;
            case 1:
                EventMmaStatisticsFragment eventMmaStatisticsFragment = (EventMmaStatisticsFragment) obj5;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((lrh) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    boolean i6 = av8Var.i(eventMmaStatisticsFragment);
                    Object O = av8Var.O();
                    if (i6 || O == a99Var) {
                        O = new x36(eventMmaStatisticsFragment, false ? 1 : 0);
                        av8Var.n0(O);
                    }
                    tba.c((Function1) O, av8Var, 0);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 2:
                EventOtherSportsLineupsFragment eventOtherSportsLineupsFragment = (EventOtherSportsLineupsFragment) obj5;
                m46 m46Var = (m46) obj;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                m46Var.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((av8) of3Var2).g(m46Var) : ((av8) of3Var2).i(m46Var) ? 4 : 2;
                }
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean i7 = av8Var2.i(eventOtherSportsLineupsFragment);
                    Object O2 = av8Var2.O();
                    if (i7 || O2 == a99Var) {
                        O2 = new x16(eventOtherSportsLineupsFragment, 1 == true ? 1 : 0);
                        av8Var2.n0(O2);
                    }
                    l6g.h(m46Var, (Function1) O2, null, av8Var2, intValue2 & 14);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 3:
                EventPreMatchLineupsFragment eventPreMatchLineupsFragment = (EventPreMatchLineupsFragment) obj5;
                ((Integer) obj2).getClass();
                t56 t56Var = (t56) obj3;
                ((View) obj).getClass();
                t56Var.getClass();
                if (t56Var instanceof q56) {
                    u56 u56Var = (u56) eventPreMatchLineupsFragment.t.getValue();
                    String str = ((q56) t56Var).a;
                    u56Var.getClass();
                    u56Var.n.put(str, Boolean.valueOf(!Intrinsics.c((Boolean) r2.get(str), Boolean.TRUE)));
                    y56 y56Var = u56Var.m;
                    if (y56Var == null) {
                        Intrinsics.i("lineupsData");
                        throw null;
                    }
                    u56Var.G(y56Var);
                } else if (t56Var instanceof r56) {
                    r56 r56Var = (r56) t56Var;
                    fmj fmjVar = r56Var.e ? r56Var.a : r56Var.b;
                    if (fmjVar != null) {
                        Player player = fmjVar.a;
                        int i8 = PlayerActivity.Z;
                        Context requireContext = eventPreMatchLineupsFragment.requireContext();
                        requireContext.getClass();
                        int id = player.getId();
                        UniqueTournament uniqueTournament = eventPreMatchLineupsFragment.C().getTournament().getUniqueTournament();
                        jle.q(requireContext, id, uniqueTournament != null ? uniqueTournament.getId() : 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                    }
                }
                return Unit.a;
            case 4:
                EventScorecardFragment eventScorecardFragment = (EventScorecardFragment) obj5;
                mqi mqiVar = eventScorecardFragment.v;
                View view = (View) obj;
                wt3.y((Integer) obj2, view, obj3);
                if (obj3 instanceof y02) {
                    int i9 = PlayerActivity.Z;
                    FragmentActivity requireActivity2 = eventScorecardFragment.requireActivity();
                    requireActivity2.getClass();
                    jle.q(requireActivity2, ((y02) obj3).c.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                } else if (obj3 instanceof c6l) {
                    int i10 = PlayerActivity.Z;
                    FragmentActivity requireActivity3 = eventScorecardFragment.requireActivity();
                    requireActivity3.getClass();
                    jle.q(requireActivity3, ((c6l) obj3).b.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                } else if (obj3 instanceof lt1) {
                    ((pse) mqiVar.getValue()).d(view, obj3);
                } else if (obj3 instanceof fae) {
                    ((pse) mqiVar.getValue()).d(view, obj3);
                }
                return Unit.a;
            case 5:
                q16 q16Var = (q16) obj5;
                xtc xtcVar = (xtc) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                xtcVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    Team battingTeam = q16Var.a.getBattingTeam();
                    if (battingTeam == null) {
                        av8Var3.d0(-192440983);
                        av8Var3.s(false);
                    } else {
                        av8Var3.d0(-192440982);
                        td4.G(battingTeam.getId(), xtcVar, false, 0L, av8Var3, (intValue3 << 3) & 112, 12);
                        av8Var3.s(false);
                    }
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 6:
                EventStandingsFragment eventStandingsFragment = (EventStandingsFragment) obj5;
                View view2 = (View) obj;
                wt3.y((Integer) obj2, view2, obj3);
                if (obj3 instanceof ebi) {
                    a99 a99Var2 = LeagueActivity.h0;
                    FragmentActivity requireActivity4 = eventStandingsFragment.requireActivity();
                    requireActivity4.getClass();
                    a99Var2.z(requireActivity4, ((ebi) obj3).b);
                } else if (obj3 instanceof bbi) {
                    StandingsTableRow standingsTableRow = ((bbi) obj3).c;
                    List<TeamLinkedRound> teamLinks = standingsTableRow.getTeam().getTeamLinks();
                    if (teamLinks == null || teamLinks.isEmpty()) {
                        int i11 = TeamActivity.Z;
                        FragmentActivity requireActivity5 = eventStandingsFragment.requireActivity();
                        requireActivity5.getClass();
                        jle.r(requireActivity5, standingsTableRow.getTeam().getId(), null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    } else {
                        List<TeamLinkedRound> teamLinks2 = standingsTableRow.getTeam().getTeamLinks();
                        if (teamLinks2 != null) {
                            Context requireContext2 = eventStandingsFragment.requireContext();
                            requireContext2.getClass();
                            nxi.b(teamLinks2, requireContext2, view2, (m0j) eventStandingsFragment.u.getValue());
                        }
                    }
                }
                return Unit.a;
            case 7:
                EventStatisticsFragment eventStatisticsFragment = (EventStatisticsFragment) obj5;
                Player player2 = (Player) obj;
                int intValue4 = ((Integer) obj2).intValue();
                Team team = (Team) obj3;
                player2.getClass();
                team.getClass();
                bc6 F = eventStatisticsFragment.F();
                int id2 = player2.getId();
                ?? r4 = team.getId() == Event.getHomeTeam$default(eventStatisticsFragment.D(), null, 1, null).getId() ? 1 : 0;
                LineupsResponse lineupsResponse = F.k;
                if (r4 != 0) {
                    if (lineupsResponse != null) {
                        awayLineups$default = LineupsResponse.getHomeLineups$default(lineupsResponse, null, 1, null);
                    }
                    awayLineups$default = null;
                } else {
                    if (lineupsResponse != null) {
                        awayLineups$default = LineupsResponse.getAwayLineups$default(lineupsResponse, null, 1, null);
                    }
                    awayLineups$default = null;
                }
                if (awayLineups$default == null || (players = awayLineups$default.getPlayers()) == null) {
                    playerData = null;
                } else {
                    Iterator it = players.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = it.next();
                            if (((PlayerData) obj4).getPlayer().getId() == id2) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    playerData = (PlayerData) obj4;
                }
                if (playerData == null || (statistics = playerData.getStatistics()) == null || (avgRating = statistics.getRating()) == null) {
                    if (playerData == null) {
                        d = null;
                        activity = eventStatisticsFragment.getActivity();
                        if (activity != null) {
                            PlayerEventStatisticsModal c = jpe.c(f8h.i(eventStatisticsFragment.D(), player2, team, intValue4, d, 96), null);
                            AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                            if (appCompatActivity != null) {
                                me4.n(c, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                            }
                        }
                        return Unit.a;
                    }
                    avgRating = playerData.getAvgRating();
                }
                d = avgRating;
                activity = eventStatisticsFragment.getActivity();
                if (activity != null) {
                }
                return Unit.a;
            case 8:
                ppb ppbVar = (ppb) obj5;
                xpa xpaVar = (xpa) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var4).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    c5n.d(ppbVar.e, xpa.a(xpaVar, l98.b0(utcVar, 8.0f), 7), av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 9:
                FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = (FantasyCompetitionFixturesFragment) obj5;
                wt3.y((Integer) obj2, (View) obj, obj3);
                Event d2 = obj3 instanceof y21 ? ((y21) obj3).d() : obj3 instanceof fy6 ? ((fy6) obj3).a.d() : null;
                if (d2 != null) {
                    Context requireContext3 = fantasyCompetitionFixturesFragment.requireContext();
                    requireContext3.getClass();
                    nv.A(requireContext3, "open_event", null);
                    wxf wxfVar2 = EventActivity.h0;
                    Context requireContext4 = fantasyCompetitionFixturesFragment.requireContext();
                    requireContext4.getClass();
                    wxf.B(requireContext4, d2.getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                return Unit.a;
            case 10:
                Long l = (Long) obj5;
                of3 of3Var5 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                u23 a = t23.a(ww9.d, uxf.o, of3Var5, 0);
                av8 av8Var5 = (av8) of3Var5;
                int hashCode = Long.hashCode(av8Var5.T);
                aee m = av8Var5.m();
                xtc C2 = fqj.C(of3Var5, utcVar);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8 av8Var6 = (av8) of3Var5;
                av8Var6.h0();
                if (av8Var6.S) {
                    av8Var6.l(zg3Var);
                } else {
                    av8Var6.q0();
                }
                waa.K(of3Var5, a, hf3.g);
                waa.K(of3Var5, m, hf3.f);
                waa.K(of3Var5, Integer.valueOf(hashCode), hf3.j);
                waa.J(of3Var5, hf3.k);
                waa.K(of3Var5, C2, hf3.d);
                un0.h(l != null ? l.longValue() : Long.MAX_VALUE, null, of3Var5, 0);
                nq8.h(of3Var5, bkh.e(utcVar, 16.0f));
                av8Var6.s(true);
                return Unit.a;
            case 11:
                il8 il8Var = (il8) obj5;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var7 = (av8) of3Var6;
                if (av8Var7.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Object O3 = av8Var7.O();
                    if (O3 == a99Var) {
                        O3 = new yt6(8);
                        av8Var7.n0(O3);
                    }
                    l98.b(il8Var, null, (Function1) O3, null, null, null, fz8.a, av8Var7, 1573248, 58);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 12:
                z47 z47Var = (z47) obj5;
                xpa xpaVar2 = (xpa) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                xpaVar2.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((av8) of3Var7).g(xpaVar2) ? 4 : 2;
                }
                av8 av8Var8 = (av8) of3Var7;
                if (av8Var8.T(intValue7 & 1, (intValue7 & 19) != 18)) {
                    int ordinal = z47Var.b.m.ordinal();
                    if (ordinal == 0) {
                        i = R.string.waiting_to_start;
                    } else if (ordinal == 1) {
                        i = R.string.in_progress;
                    } else {
                        if (ordinal != 2) {
                            zzl.b();
                            return null;
                        }
                        i = R.string.finished;
                    }
                    String i12 = wv8.i(oea.v(R.string.status_colon, av8Var8), " ", oea.v(i, av8Var8));
                    yf8 yf8Var = xth.a;
                    udj.c(i12, l98.f0(l98.d0(bkh.d(xpa.a(xpaVar2, utcVar, 7), 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), lz.D(R.color.n_lv_3, av8Var8), null, 0L, null, 0L, null, new p7j(6), 0L, 2, false, 1, 0, null, xth.b(), av8Var8, 0, 24960, 109560);
                } else {
                    av8Var8.W();
                }
                return Unit.a;
            case 13:
                pb7 pb7Var = (pb7) obj5;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                av8 av8Var9 = (av8) ((of3) obj2);
                Object O4 = av8Var9.O();
                if (O4 == a99Var) {
                    O4 = e.f(pb7Var.w);
                    av8Var9.n0(O4);
                }
                e1d e1dVar = (e1d) O4;
                FantasyRemoteAnnouncement fantasyRemoteAnnouncement = pb7Var.w;
                boolean i13 = av8Var9.i(pb7Var);
                Object O5 = av8Var9.O();
                if (i13 || O5 == a99Var) {
                    O5 = new r1(pb7Var, e1dVar, r9, i5);
                    av8Var9.n0(O5);
                }
                hz8.o(av8Var9, fantasyRemoteAnnouncement, (Function2) O5);
                FantasyRemoteAnnouncement fantasyRemoteAnnouncement2 = (FantasyRemoteAnnouncement) e1dVar.getValue();
                if (fantasyRemoteAnnouncement2 == null) {
                    av8Var9.d0(1094881892);
                    av8Var9.s(false);
                } else {
                    av8Var9.d0(1094881893);
                    c5n.d(fantasyRemoteAnnouncement2, l98.f0(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), av8Var9, 48);
                    av8Var9.s(false);
                }
                return Unit.a;
            case 14:
                zo6 zo6Var = (zo6) obj5;
                of3 of3Var8 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var10 = (av8) of3Var8;
                if (av8Var10.T(intValue8 & 1, (intValue8 & 17) != 16)) {
                    xtc f0 = l98.f0(utc.a, 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                    gv9 gv9Var = zo6Var.d;
                    if (gv9Var == null) {
                        a70.r("Required value was null.");
                        return null;
                    }
                    fcp.O(gv9Var, f0, av8Var10, 48);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 15:
                FantasyPlayerPriceChanges fantasyPlayerPriceChanges = (FantasyPlayerPriceChanges) obj5;
                of3 of3Var9 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((kb8) obj).getClass();
                av8 av8Var11 = (av8) of3Var9;
                if (av8Var11.T(intValue9 & 1, (intValue9 & 17) != 16)) {
                    for (FantasyPriceChange fantasyPriceChange : fantasyPlayerPriceChanges.getPriceChanges()) {
                        av8Var11.a0(1103646015, fantasyPriceChange.getReason());
                        FantasyPriceChangeReason reason = fantasyPriceChange.getReason();
                        int[] iArr = ud7.a;
                        switch (iArr[reason.ordinal()]) {
                            case 1:
                            case 5:
                                i2 = -1364193653;
                                i3 = R.string.performance;
                                break;
                            case 2:
                            case 3:
                            case 6:
                                i2 = -1364188060;
                                i3 = R.string.form;
                                break;
                            case 4:
                                i2 = -1364185324;
                                i3 = R.string.fantasy_transfers_in;
                                break;
                            case 7:
                                i2 = -1364182091;
                                i3 = R.string.fantasy_transfers_out;
                                break;
                            case 8:
                                av8Var11.d0(660121928);
                                av8Var11.s(false);
                                k = "-";
                                String str2 = k;
                                long D = lz.D(R.color.surface_1, av8Var11);
                                yf8 yf8Var2 = xth.a;
                                dfj b = xth.b();
                                switch (iArr[fantasyPriceChange.getReason().ordinal()]) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                        f = ljg.f(av8Var11, -236816158, R.color.success, av8Var11, false);
                                        break;
                                    case 5:
                                    case 6:
                                    case 7:
                                        f = ljg.f(av8Var11, -236811136, R.color.error, av8Var11, false);
                                        break;
                                    case 8:
                                        f = ljg.f(av8Var11, -236809345, R.color.n_lv_1, av8Var11, false);
                                        break;
                                    default:
                                        throw dmi.h(av8Var11, -236822173, false);
                                }
                                udj.c(str2, l98.d0(n9e.q(utcVar, f, o7g.a(12.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, b, av8Var11, 0, 24960, 110584);
                                av8Var11.s(false);
                            default:
                                throw dmi.h(av8Var11, -1364196855, false);
                        }
                        k = ljg.k(av8Var11, i2, i3, av8Var11, false);
                        String str22 = k;
                        long D2 = lz.D(R.color.surface_1, av8Var11);
                        yf8 yf8Var22 = xth.a;
                        dfj b2 = xth.b();
                        switch (iArr[fantasyPriceChange.getReason().ordinal()]) {
                        }
                        udj.c(str22, l98.d0(n9e.q(utcVar, f, o7g.a(12.0f)), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, b2, av8Var11, 0, 24960, 110584);
                        av8Var11.s(false);
                    }
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 16:
                cz6 cz6Var = (cz6) obj5;
                xpa xpaVar3 = (xpa) obj;
                of3 of3Var10 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                xpaVar3.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((av8) of3Var10).g(xpaVar3) ? 4 : 2;
                }
                av8 av8Var12 = (av8) of3Var10;
                if (av8Var12.T(intValue10 & 1, (intValue10 & 19) != 18)) {
                    fqj.j(cz6Var.a, xpa.a(xpaVar3, l98.c0(utcVar, 16.0f, 8.0f), 7), av8Var12, 0);
                } else {
                    av8Var12.W();
                }
                return Unit.a;
            case 17:
                efi efiVar = (efi) obj5;
                of3 of3Var11 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((n8g) obj).getClass();
                av8 av8Var13 = (av8) of3Var11;
                if (av8Var13.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    nq8.i(oea.v(efiVar.a, av8Var13), haa.t(efiVar.b, 0, av8Var13), l98.b0(utcVar, 8.0f), lz.D(R.color.error, av8Var13), false, av8Var13, 448, 16);
                } else {
                    av8Var13.W();
                }
                return Unit.a;
            case 18:
                imh imhVar = (imh) obj5;
                gmh gmhVar = (gmh) obj;
                of3 of3Var12 = (of3) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                gmhVar.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((av8) of3Var12).g(gmhVar) ? 4 : 2;
                }
                av8 av8Var14 = (av8) of3Var12;
                if (av8Var14.T(intValue12 & 1, (intValue12 & 19) != 18)) {
                    ?? r0 = gmhVar.a;
                    r9 = r0 != null ? r0 : null;
                    if (r9 == null) {
                        return Unit.a;
                    }
                    x2a.k((gmh) ((eoh) imhVar.b).getValue(), null, null, null, yqo.H(-1674583824, av8Var14, new s16(r9, 17)), av8Var14, 24576, 14);
                } else {
                    av8Var14.W();
                }
                return Unit.a;
            case 19:
                FantasyTopPlayersBottomSheet fantasyTopPlayersBottomSheet = (FantasyTopPlayersBottomSheet) obj5;
                rz6 rz6Var = (rz6) obj;
                of3 of3Var13 = (of3) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((av8) of3Var13).e(rz6Var == null ? -1 : rz6Var.ordinal()) ? 4 : 2;
                }
                av8 av8Var15 = (av8) of3Var13;
                if (av8Var15.T(intValue13 & 1, (intValue13 & 19) != 18)) {
                    Integer valueOf = rz6Var != null ? Integer.valueOf(rz6Var.c) : null;
                    if (valueOf == null) {
                        av8Var15.d0(1160815205);
                        av8Var15.s(false);
                    } else {
                        av8Var15.d0(1160815206);
                        H = s02.H(valueOf.intValue(), null, null, av8Var15, 4);
                        av8Var15.s(false);
                    }
                    if (H == null) {
                        H = ljg.k(av8Var15, 314545638, R.string.all_positions, av8Var15, false);
                    } else {
                        av8Var15.d0(314539717);
                        av8Var15.s(false);
                    }
                    String str3 = H;
                    yf8 yf8Var3 = xth.a;
                    udj.c(str3, null, rz6Var == fantasyTopPlayersBottomSheet.G().k().d ? ljg.f(av8Var15, 314552745, R.color.primary_default, av8Var15, false) : ljg.f(av8Var15, 314553535, R.color.n_lv_1, av8Var15, false), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var15, 0, 24960, 110586);
                } else {
                    av8Var15.W();
                }
                return Unit.a;
            case 20:
                rm7 rm7Var = (rm7) obj5;
                of3 of3Var14 = (of3) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var16 = (av8) of3Var14;
                if (av8Var16.T(intValue14 & 1, (intValue14 & 17) != 16)) {
                    n9e.k(rm7Var.c, null, av8Var16, 0);
                } else {
                    av8Var16.W();
                }
                return Unit.a;
            case 21:
                FeaturedOddsView featuredOddsView = (FeaturedOddsView) obj5;
                of3 of3Var15 = (of3) obj2;
                ((Integer) obj3).getClass();
                int i14 = FeaturedOddsView.p;
                ((r70) obj).getClass();
                xtc c0 = l98.c0(utcVar, 8.0f, 4.0f);
                int i15 = ke0.c;
                xmd oddsState = featuredOddsView.getOddsState();
                vmd location = featuredOddsView.getLocation();
                long j = ((r13) featuredOddsView.backgroundColor.invoke(of3Var15, 0)).a;
                av8 av8Var17 = (av8) of3Var15;
                boolean i16 = av8Var17.i(featuredOddsView);
                Object O6 = av8Var17.O();
                if (i16 || O6 == a99Var) {
                    O6 = new x16(featuredOddsView, i5);
                    av8Var17.n0(O6);
                }
                iu7.c(i15, oddsState, location, (Function1) O6, c0, j, av8Var17, 24576);
                return Unit.a;
            case 22:
                FeaturedTournamentCalendarRailView featuredTournamentCalendarRailView = (FeaturedTournamentCalendarRailView) obj5;
                int intValue15 = ((Integer) obj2).intValue();
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj3;
                int i17 = FeaturedTournamentCalendarRailView.f;
                ((View) obj).getClass();
                zonedDateTime.getClass();
                Function1 function1 = featuredTournamentCalendarRailView.dateClickCallback;
                if (function1 != null) {
                    function1.invoke(zonedDateTime);
                }
                mg2 mg2Var = featuredTournamentCalendarRailView.a;
                int i18 = mg2Var.m;
                mg2Var.m = intValue15;
                mg2Var.notifyItemChanged(intValue15);
                mg2Var.notifyItemChanged(i18);
                featuredTournamentCalendarRailView.scrollToPosition(intValue15);
                return Unit.a;
            case 23:
                FeaturedTournamentFragment featuredTournamentFragment = (FeaturedTournamentFragment) obj5;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof iv7) {
                    wxf wxfVar3 = EventActivity.h0;
                    Context requireContext5 = featuredTournamentFragment.requireContext();
                    requireContext5.getClass();
                    wxf.B(requireContext5, ((iv7) obj3).a.getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
                return Unit.a;
            case 24:
                tv7 tv7Var = (tv7) obj5;
                of3 of3Var16 = (of3) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((lrh) obj).getClass();
                av8 av8Var18 = (av8) of3Var16;
                if (av8Var18.T(intValue16 & 1, (intValue16 & 17) != 16)) {
                    cai caiVar = tv7Var.e;
                    boolean i19 = av8Var18.i(tv7Var);
                    Object O7 = av8Var18.O();
                    if (i19 || O7 == a99Var) {
                        O7 = new sv7(tv7Var, 1 == true ? 1 : 0);
                        av8Var18.n0(O7);
                    }
                    g7a.j(caiVar, (Function1) O7, null, null, av8Var18, 0, 12);
                } else {
                    av8Var18.W();
                }
                return Unit.a;
            case 25:
                ((Long) obj3).getClass();
                int i20 = FullScreenVideoActivity.O;
                ((String) obj).getClass();
                ((String) obj2).getClass();
                ((FullScreenVideoActivity) obj5).finish();
                return Unit.a;
            case 26:
                Incident.GoalIncident goalIncident = (Incident.GoalIncident) obj5;
                Player player3 = (Player) obj;
                String str4 = (String) obj2;
                Integer num = (Integer) obj3;
                if (player3 != null && (C = tba.C(player3)) != null) {
                    str4 = C;
                } else if (player3 != null) {
                    str4 = tba.t(player3);
                }
                if (!Intrinsics.c(goalIncident.getSport(), Sports.ICE_HOCKEY) || num == null || str4 == null) {
                    return str4;
                }
                return str4 + " (" + num + ")";
            case 27:
                HighValueStreaksFragment highValueStreaksFragment = (HighValueStreaksFragment) obj5;
                ((Integer) obj2).getClass();
                EventStreak eventStreak = (EventStreak) obj3;
                ((View) obj).getClass();
                eventStreak.getClass();
                wxf wxfVar4 = EventActivity.h0;
                Context requireContext6 = highValueStreaksFragment.requireContext();
                requireContext6.getClass();
                wxf.B(requireContext6, eventStreak.getEvent().getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                Context requireContext7 = highValueStreaksFragment.requireContext();
                requireContext7.getClass();
                yu1[] yu1VarArr = yu1.a;
                zu1 zu1Var = (zu1) highValueStreaksFragment.A().g.d();
                nv.n(requireContext7, "high_value_streaks_event", zu1Var != null ? zu1Var.a : "", Integer.valueOf(eventStreak.getEvent().getId()), null);
                return Unit.a;
            case 28:
                return a(obj, obj2, obj3);
            default:
                w31 w31Var = (w31) obj5;
                of3 of3Var17 = (of3) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var19 = (av8) of3Var17;
                if (av8Var19.T(intValue17 & 1, (intValue17 & 17) != 16)) {
                    String j2 = w31Var.j();
                    String str5 = j2 == null ? "" : j2;
                    bx7 h = w31Var.h();
                    Integer num2 = h != null ? h.c : null;
                    bx7 h2 = w31Var.h();
                    Integer num3 = h2 != null ? h2.b : null;
                    bx7 h3 = w31Var.h();
                    l98.r(str5, num2, num3, h3 != null ? h3.d : null, av8Var19, 0);
                } else {
                    av8Var19.W();
                }
                return Unit.a;
        }
    }
}
