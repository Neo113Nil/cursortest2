package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.Sports;
import com.sofascore.model.cuptree.CupTree;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.EventStatisticsGroup;
import com.sofascore.model.network.response.EventStatisticsPeriod;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.EventBestPlayersSummaryResponse;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.FanPlayerOfTheMatchResponse;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.model.newNetwork.PregameFormResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.details.EventDetailsFragment;
import com.sofascore.results.event.lineups.football.EventFootballLineupsFragment;
import com.sofascore.results.event.standings.EventStandingsFragment;
import com.sofascore.results.event.statistics.EventStatisticsFragment;
import com.sofascore.results.fantasy.comparison.FantasyPlayerComparisonActivity;
import com.sofascore.results.fantasy.competition.fixtures.FantasyCompetitionFixturesFragment;
import com.sofascore.results.fantasy.competition.fixtures.FantasyFdrInfoBottomSheetModal;
import com.sofascore.results.fantasy.competition.statistics.FantasyCompetitionStatisticsFragment;
import com.sofascore.results.fantasy.competition.team.FantasyCompetitionMyTeamFragment;
import com.sofascore.results.fantasy.competition.team.bottomsheet.FantasyShareSquadBottomSheet;
import com.sofascore.results.fantasy.teammanagement.substitutions.FantasySubstitutionsActivity;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersFragment;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.fantasy.walkthrough.createteam.FantasyWalkthroughCreateTeamFragment;
import com.sofascore.results.league.dialog.TennisSeedingsDescriptionModal;
import com.sofascore.results.league.fragment.cuptree.BaseCupTreeFragment;
import com.sofascore.results.league.fragment.standings.LeagueStandingsFragment;
import com.sofascore.results.profile.edit.ProfileEditFragment;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardFragment;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardInfoModal;
import com.sofascore.results.settings.about.AboutActivity;
import com.sofascore.results.settings.developer.DeveloperOptionsFullScreenDialog;
import com.sofascore.results.sharemodal.league.ShareLeagueStandingsModal;
import com.sofascore.results.sharemodal.match.ShareMatchDetailsModal;
import com.sofascore.results.sharemodal.match.ShareMatchLineupsModal;
import com.sofascore.results.sharemodal.match.ShareMatchStandingsModal;
import com.sofascore.results.sharemodal.match.ShareMatchStatisticsModal;
import com.sofascore.results.sharemodal.team.ShareTeamStandingsModal;
import com.sofascore.results.team.standings.TeamStandingsFragment;
import com.sofascore.results.view.CupTreeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class k0 implements zfc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0427, code lost:
    
        if (defpackage.tgj.N(r0.D().getStatus(), r0.D().getTime()) != false) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // defpackage.zfc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(MenuItem menuItem) {
        ShareMatchDetailsModal shareMatchDetailsModal;
        ly5 ly5Var;
        ly5 ly5Var2;
        EventIncidentsResponse eventIncidentsResponse;
        EventIncidentsResponse eventIncidentsResponse2;
        List list;
        ml8 E;
        ml8 E2;
        List list2;
        EventStatisticsPeriod eventStatisticsPeriod;
        do7 do7Var;
        ho7 ho7Var;
        gv9 gv9Var;
        Object value;
        ll7 ll7Var;
        ho7 ho7Var2;
        gv9 W;
        gv9 gv9Var2;
        boolean z;
        List list3;
        SharedPreferences d;
        Object value2;
        FragmentActivity activity;
        int i = 3;
        switch (this.a) {
            case 0:
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.settings) {
                    new DeveloperOptionsFullScreenDialog().p(((AboutActivity) this.b).k(), "developerOptions");
                }
                return true;
            case 1:
                BaseCupTreeFragment baseCupTreeFragment = (BaseCupTreeFragment) this.b;
                menuItem.getClass();
                int itemId = menuItem.getItemId();
                if (itemId == R.id.share) {
                    UniqueTournament uniqueTournament = baseCupTreeFragment.H().getUniqueTournament();
                    if (uniqueTournament != null) {
                        Context requireContext = baseCupTreeFragment.requireContext();
                        requireContext.getClass();
                        nv.u0(requireContext, Integer.valueOf(uniqueTournament.getId()), "cup_tree");
                        Context requireContext2 = baseCupTreeFragment.requireContext();
                        requireContext2.getClass();
                        f5p.E(requireContext2, new g2(uniqueTournament, baseCupTreeFragment, r8, 13));
                    }
                } else if (itemId == R.id.info) {
                    Context requireContext3 = baseCupTreeFragment.requireContext();
                    requireContext3.getClass();
                    TennisSeedingsDescriptionModal tennisSeedingsDescriptionModal = new TennisSeedingsDescriptionModal();
                    if (requireContext3 instanceof csk) {
                        requireContext3 = ((csk) requireContext3).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = requireContext3 instanceof AppCompatActivity ? (AppCompatActivity) requireContext3 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(tennisSeedingsDescriptionModal, appCompatActivity, r8, i));
                    }
                }
                return true;
            case 2:
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.share) {
                    EventDetailsFragment eventDetailsFragment = (EventDetailsFragment) this.b;
                    if (ok3.E(eventDetailsFragment.F())) {
                        gch gchVar = new gch(eventDetailsFragment.F());
                        iy5 iy5Var = (iy5) eventDetailsFragment.E().x.d();
                        PregameFormResponse pregameFormResponse = iy5Var != null ? iy5Var.m : null;
                        iy5 iy5Var2 = (iy5) eventDetailsFragment.E().x.d();
                        ky5 ky5Var = iy5Var2 != null ? iy5Var2.k : null;
                        shareMatchDetailsModal = new ShareMatchDetailsModal();
                        shareMatchDetailsModal.setArguments(fz8.C(fz8.G("ARG_DATA_HOLDER", gchVar), fz8.G("ARG_PREGAME_FORM", pregameFormResponse), fz8.G("ARG_FEATURED_PLAYERS", ky5Var)));
                    } else if (ok3.D(eventDetailsFragment.F()) || ok3.C(eventDetailsFragment.F())) {
                        gch gchVar2 = new gch(eventDetailsFragment.F());
                        iy5 iy5Var3 = (iy5) eventDetailsFragment.E().x.d();
                        List<Incident> incidents = (iy5Var3 == null || (eventIncidentsResponse = iy5Var3.a) == null) ? null : eventIncidentsResponse.getIncidents();
                        iy5 iy5Var4 = (iy5) eventDetailsFragment.E().x.d();
                        EventGraphResponse eventGraphResponse = iy5Var4 != null ? iy5Var4.g : null;
                        iy5 iy5Var5 = (iy5) eventDetailsFragment.E().x.d();
                        EventBestPlayersSummaryResponse eventBestPlayersSummaryResponse = iy5Var5 != null ? iy5Var5.v : null;
                        iy5 iy5Var6 = (iy5) eventDetailsFragment.E().x.d();
                        FanPlayerOfTheMatchResponse fanPlayerOfTheMatchResponse = (iy5Var6 == null || (ly5Var2 = iy5Var6.w) == null) ? null : ly5Var2.a;
                        iy5 iy5Var7 = (iy5) eventDetailsFragment.E().x.d();
                        Integer num = (iy5Var7 == null || (ly5Var = iy5Var7.w) == null) ? null : ly5Var.b;
                        ShareMatchDetailsModal shareMatchDetailsModal2 = new ShareMatchDetailsModal();
                        shareMatchDetailsModal2.setArguments(fz8.C(fz8.G("ARG_DATA_HOLDER", gchVar2), fz8.G("ARG_INCIDENTS", incidents != null ? new ArrayList(incidents) : 0), fz8.G("ARG_GRAPH_DATA", eventGraphResponse), fz8.G("ARG_BEST_PLAYERS", eventBestPlayersSummaryResponse), fz8.G("ARG_POTM_VOTING_OPTIONS", fanPlayerOfTheMatchResponse), fz8.G("ARG_POTM_VOTED_PLAYER_ID", num)));
                        shareMatchDetailsModal = shareMatchDetailsModal2;
                    } else {
                        gch gchVar3 = new gch(eventDetailsFragment.F());
                        iy5 iy5Var8 = (iy5) eventDetailsFragment.E().x.d();
                        List<Incident> incidents2 = (iy5Var8 == null || (eventIncidentsResponse2 = iy5Var8.a) == null) ? null : eventIncidentsResponse2.getIncidents();
                        ShareMatchDetailsModal shareMatchDetailsModal3 = new ShareMatchDetailsModal();
                        shareMatchDetailsModal3.setArguments(fz8.C(fz8.G("ARG_DATA_HOLDER", gchVar3), fz8.G("ARG_INCIDENTS", incidents2 != null ? new ArrayList(incidents2) : null)));
                        shareMatchDetailsModal = shareMatchDetailsModal3;
                    }
                    Context requireContext4 = eventDetailsFragment.requireContext();
                    requireContext4.getClass();
                    nv.u0(requireContext4, Integer.valueOf(eventDetailsFragment.F().getId()), "event_details");
                    shareMatchDetailsModal.p(eventDetailsFragment.requireActivity().k(), "ShareMatchDetailsModal");
                }
                return true;
            case 3:
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.share) {
                    EventFootballLineupsFragment eventFootballLineupsFragment = (EventFootballLineupsFragment) this.b;
                    f06 f06Var = (f06) ((p06) eventFootballLineupsFragment.s.getValue()).l().a();
                    if (f06Var != null && f06Var.a != null) {
                        gch gchVar4 = new gch(eventFootballLineupsFragment.B());
                        ShareMatchLineupsModal shareMatchLineupsModal = new ShareMatchLineupsModal();
                        shareMatchLineupsModal.setArguments(fz8.C(fz8.G("ARG_DATA_HOLDER", gchVar4)));
                        Context requireContext5 = eventFootballLineupsFragment.requireContext();
                        requireContext5.getClass();
                        nv.u0(requireContext5, Integer.valueOf(eventFootballLineupsFragment.B().getId()), "event_lineups");
                        shareMatchLineupsModal.p(eventFootballLineupsFragment.requireActivity().k(), "ShareMatchLineupsModal");
                    }
                }
                return true;
            case 4:
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.share) {
                    EventStandingsFragment eventStandingsFragment = (EventStandingsFragment) this.b;
                    List list4 = (List) eventStandingsFragment.E().i.d();
                    if (list4 != null) {
                        Event D = eventStandingsFragment.D();
                        tsi k = eventStandingsFragment.E().k();
                        Season season = eventStandingsFragment.D().getSeason();
                        hch hchVar = new hch(D, k, season != null ? season.getYear() : null);
                        ShareMatchStandingsModal shareMatchStandingsModal = new ShareMatchStandingsModal();
                        shareMatchStandingsModal.setArguments(fz8.C(fz8.G("ARG_DATA_HOLDER", hchVar), fz8.G("ARG_STANDINGS_RESPONSE", new ArrayList(list4))));
                        Context requireContext6 = eventStandingsFragment.requireContext();
                        requireContext6.getClass();
                        kch kchVar = kch.EVENT_DETAILS;
                        nv.u0(requireContext6, Integer.valueOf(eventStandingsFragment.D().getId()), "event_standings");
                        shareMatchStandingsModal.p(eventStandingsFragment.requireActivity().k(), "ShareMatchStandingsModal");
                    }
                }
                return true;
            case 5:
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.share) {
                    EventStatisticsFragment eventStatisticsFragment = (EventStatisticsFragment) this.b;
                    List list5 = ShareMatchStatisticsModal.I;
                    gch gchVar5 = new gch(eventStatisticsFragment.D());
                    qei qeiVar = (qei) eventStatisticsFragment.F().h.d();
                    List<EventStatisticsGroup> groups = (qeiVar == null || (list2 = qeiVar.a) == null || (eventStatisticsPeriod = (EventStatisticsPeriod) CollectionsKt.firstOrNull(list2)) == null) ? null : eventStatisticsPeriod.getGroups();
                    qei qeiVar2 = (qei) eventStatisticsFragment.F().h.d();
                    if (qeiVar2 == null || (list = qeiVar2.c) == null || list.isEmpty()) {
                        list = null;
                    }
                    ml8 E3 = eventStatisticsFragment.E();
                    vk8 teamSide = (E3 == null || !(E3.k.isEmpty() ^ true) || (E2 = eventStatisticsFragment.E()) == null) ? null : E2.getTeamSide();
                    ml8 E4 = eventStatisticsFragment.E();
                    FootballShotmapItem selectedShot = (E4 == null || !(E4.k.isEmpty() ^ true) || (E = eventStatisticsFragment.E()) == null) ? null : E.getSelectedShot();
                    qei qeiVar3 = (qei) eventStatisticsFragment.F().h.d();
                    if (qeiVar3 != null && (r6 = qeiVar3.b) != null) {
                        int i2 = b56.j;
                        break;
                    }
                    gc6 gc6Var = null;
                    b56 b56Var = (b56) eventStatisticsFragment.y.getValue();
                    Boolean valueOf = b56Var != null ? Boolean.valueOf(b56Var.i) : null;
                    ShareMatchStatisticsModal shareMatchStatisticsModal = new ShareMatchStatisticsModal();
                    shareMatchStatisticsModal.setArguments(fz8.C(fz8.G("ARG_DATA_HOLDER", gchVar5), fz8.G("ARG_STATISTICS", groups != null ? new ArrayList(groups) : null), fz8.G("ARG_SHOTMAP", list != null ? new ArrayList(list) : null), fz8.G("ARG_SHOTMAP_TEAM", teamSide), fz8.G("ARG_SHOTMAP_LAST_SHOT", selectedShot), fz8.G("ARG_HEATMAP", gc6Var), fz8.J("ARG_HEATMAP_HOME_TEAM_SELECTED", valueOf != null ? valueOf.booleanValue() : true)));
                    Context requireContext7 = eventStatisticsFragment.requireContext();
                    requireContext7.getClass();
                    nv.u0(requireContext7, Integer.valueOf(eventStatisticsFragment.D().getId()), "event_statistics");
                    shareMatchStatisticsModal.p(eventStatisticsFragment.requireActivity().k(), "ShareMatchStatisticsModal");
                }
                return true;
            case 6:
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.info) {
                    FragmentActivity requireActivity = ((FantasyCompetitionFixturesFragment) this.b).requireActivity();
                    requireActivity.getClass();
                    FantasyFdrInfoBottomSheetModal fantasyFdrInfoBottomSheetModal = new FantasyFdrInfoBottomSheetModal();
                    AppCompatActivity appCompatActivity2 = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(fantasyFdrInfoBottomSheetModal, appCompatActivity2, r8, i));
                    }
                }
                return true;
            case 7:
                FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment = (FantasyCompetitionMyTeamFragment) this.b;
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.share && (do7Var = fantasyCompetitionMyTeamFragment.D().l().b) != null && (ho7Var = fantasyCompetitionMyTeamFragment.D().l().c) != null && (gv9Var = fantasyCompetitionMyTeamFragment.D().l().f) != null) {
                    Context requireContext8 = fantasyCompetitionMyTeamFragment.requireContext();
                    requireContext8.getClass();
                    nv.u0(requireContext8, Integer.valueOf(fantasyCompetitionMyTeamFragment.D().m().c.c), "fantasy_squad");
                    FragmentActivity requireActivity2 = fantasyCompetitionMyTeamFragment.requireActivity();
                    requireActivity2.getClass();
                    FantasyShareSquadBottomSheet fantasyShareSquadBottomSheet = new FantasyShareSquadBottomSheet();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("gameweek", ho7Var);
                    bundle.putSerializable("competition", do7Var);
                    bundle.putParcelableArrayList("squad", new ArrayList<>(gv9Var));
                    fantasyShareSquadBottomSheet.setArguments(bundle);
                    AppCompatActivity appCompatActivity3 = requireActivity2 instanceof AppCompatActivity ? (AppCompatActivity) requireActivity2 : null;
                    if (appCompatActivity3 != null) {
                        wca.x(appCompatActivity3.getLifecycle()).b(new r1(fantasyShareSquadBottomSheet, appCompatActivity3, r8, i));
                    }
                }
                return true;
            case 8:
                FantasyCompetitionStatisticsFragment fantasyCompetitionStatisticsFragment = (FantasyCompetitionStatisticsFragment) this.b;
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.compare) {
                    Context requireContext9 = fantasyCompetitionStatisticsFragment.requireContext();
                    requireContext9.getClass();
                    nv.A(requireContext9, "player_compare", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS);
                    int i3 = FantasyPlayerComparisonActivity.L;
                    Context requireContext10 = fantasyCompetitionStatisticsFragment.requireContext();
                    requireContext10.getClass();
                    ml4.p0(requireContext10, fantasyCompetitionStatisticsFragment.D().u.c.c, fantasyCompetitionStatisticsFragment.D().v.a, null, fantasyCompetitionStatisticsFragment.D().u.c.A);
                }
                return true;
            case 9:
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.reset) {
                    FantasySubstitutionsActivity fantasySubstitutionsActivity = (FantasySubstitutionsActivity) this.b;
                    int i4 = FantasySubstitutionsActivity.M;
                    ml7 Q = fantasySubstitutionsActivity.Q();
                    Q.s = null;
                    Q.t = null;
                    fdi fdiVar = Q.m;
                    do {
                        value = fdiVar.getValue();
                        ll7Var = (ll7) value;
                        ho7Var2 = Q.g;
                        W = l6g.W(Q.i);
                        gv9Var2 = ((ll7) Q.m.getValue()).e;
                        if (Q.g.a.g() && ((list3 = Q.i) == null || !list3.isEmpty())) {
                            Iterator it = list3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((FantasyRoundPlayerUiModel) it.next()).v) {
                                        Application application = Q.b;
                                        application.getClass();
                                        SharedPreferences sharedPreferences = uic.j;
                                        if (sharedPreferences == null) {
                                            Context applicationContext = application.getApplicationContext();
                                            synchronized (uic.i) {
                                                d = a5f.d(applicationContext);
                                                uic.j = d;
                                            }
                                            d.getClass();
                                            sharedPreferences = d;
                                        }
                                        if (!sharedPreferences.getBoolean("PREF_SUBSTITUTIONS_INFO_DISMISSED", false)) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                        z = false;
                    } while (!fdiVar.k(value, ll7.a(ll7Var, ho7Var2, W, gv9Var2, false, false, z, false, 298)));
                }
                return true;
            case 10:
                FantasyTransfersFragment fantasyTransfersFragment = (FantasyTransfersFragment) this.b;
                menuItem.getClass();
                int itemId2 = menuItem.getItemId();
                if (itemId2 == R.id.reset) {
                    ao7 D2 = fantasyTransfersFragment.D();
                    fdi fdiVar2 = D2.n;
                    do {
                        value2 = fdiVar2.getValue();
                    } while (!fdiVar2.k(value2, D2.k()));
                    D2.r.clear();
                    D2.t = null;
                    D2.s = null;
                } else if (itemId2 == R.id.search) {
                    v8a.D(fantasyTransfersFragment, new ln7(fantasyTransfersFragment.D().f.a.a, fantasyTransfersFragment.D().f.a.j));
                }
                return true;
            case 11:
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.search) {
                    ((FantasyWalkthroughCreateTeamFragment) this.b).D("");
                }
                return true;
            case 12:
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.share) {
                    LeagueStandingsFragment leagueStandingsFragment = (LeagueStandingsFragment) this.b;
                    List list6 = (List) leagueStandingsFragment.F().i.d();
                    if (list6 != null) {
                        Season l = leagueStandingsFragment.C().l();
                        hch hchVar2 = new hch(leagueStandingsFragment.E(), leagueStandingsFragment.F().k(), l != null ? l.getYear() : null);
                        ShareLeagueStandingsModal shareLeagueStandingsModal = new ShareLeagueStandingsModal();
                        shareLeagueStandingsModal.setArguments(fz8.C(fz8.G("ARG_DATA_HOLDER", hchVar2), fz8.G("ARG_STANDINGS_RESPONSE", new ArrayList(list6))));
                        Context requireContext11 = leagueStandingsFragment.requireContext();
                        requireContext11.getClass();
                        kch kchVar2 = kch.EVENT_DETAILS;
                        Integer F = o3a.F(leagueStandingsFragment.E());
                        nv.u0(requireContext11, Integer.valueOf(F != null ? F.intValue() : 0), "league_standings");
                        shareLeagueStandingsModal.p(leagueStandingsFragment.requireActivity().k(), "ShareLeagueStandingsModal");
                    }
                }
                return true;
            case 13:
                menuItem.getClass();
                return true;
            case 14:
                ProfileTopLeaderboardFragment profileTopLeaderboardFragment = (ProfileTopLeaderboardFragment) this.b;
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.info && (activity = profileTopLeaderboardFragment.getActivity()) != null) {
                    gta gtaVar = (gta) profileTopLeaderboardFragment.s.getValue();
                    gtaVar.getClass();
                    ProfileTopLeaderboardInfoModal profileTopLeaderboardInfoModal = new ProfileTopLeaderboardInfoModal();
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("LEADERBOARD_TYPE", gtaVar);
                    profileTopLeaderboardInfoModal.setArguments(bundle2);
                    AppCompatActivity appCompatActivity4 = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                    if (appCompatActivity4 != null) {
                        wca.x(appCompatActivity4.getLifecycle()).b(new r1(profileTopLeaderboardInfoModal, appCompatActivity4, r8, i));
                    }
                }
                return true;
            default:
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.share) {
                    TeamStandingsFragment teamStandingsFragment = (TeamStandingsFragment) this.b;
                    List list7 = (List) teamStandingsFragment.E().i.d();
                    if (list7 != null) {
                        Team D3 = teamStandingsFragment.D();
                        tsi k2 = teamStandingsFragment.E().k();
                        Season season2 = (Season) ((eoh) teamStandingsFragment.A).getValue();
                        hch hchVar3 = new hch(D3, k2, season2 != null ? season2.getYear() : null);
                        ShareTeamStandingsModal shareTeamStandingsModal = new ShareTeamStandingsModal();
                        shareTeamStandingsModal.setArguments(fz8.C(fz8.G("ARG_DATA_HOLDER", hchVar3), fz8.G("ARG_STANDINGS_RESPONSE", new ArrayList(list7))));
                        Context requireContext12 = teamStandingsFragment.requireContext();
                        requireContext12.getClass();
                        kch kchVar3 = kch.EVENT_DETAILS;
                        nv.u0(requireContext12, Integer.valueOf(teamStandingsFragment.D().getId()), "team_standings");
                        shareTeamStandingsModal.p(teamStandingsFragment.requireActivity().k(), "ShareTeamStandingsModal");
                    }
                }
                return true;
        }
    }

    @Override // defpackage.zfc
    public final void d(Menu menu, MenuInflater menuInflater) {
        int i = this.a;
        Object obj = this.b;
        menu.getClass();
        menuInflater.getClass();
        switch (i) {
            case 0:
                menuInflater.inflate(R.menu.menu_dev_options, menu);
                AboutActivity aboutActivity = (AboutActivity) obj;
                MenuItem findItem = menu.findItem(R.id.settings);
                int i2 = AboutActivity.O;
                findItem.setVisible(aboutActivity.D().getDevMod());
                aboutActivity.J = findItem;
                break;
            case 1:
                menuInflater.inflate(R.menu.menu_cuptree, menu);
                BaseCupTreeFragment baseCupTreeFragment = (BaseCupTreeFragment) obj;
                MenuItem findItem2 = menu.findItem(R.id.share);
                int i3 = CupTreeView.q;
                findItem2.setVisible(t62.x((CupTree) ((eoh) baseCupTreeFragment.s).getValue()));
                findItem2.setEnabled(findItem2.isVisible());
                baseCupTreeFragment.p = findItem2;
                MenuItem findItem3 = menu.findItem(R.id.info);
                findItem3.setVisible(Intrinsics.c(baseCupTreeFragment.H().getSportSlug(), Sports.TENNIS));
                findItem3.setEnabled(findItem3.isVisible());
                baseCupTreeFragment.j(menu);
                break;
            case 2:
                menuInflater.inflate(R.menu.menu_share, menu);
                EventDetailsFragment eventDetailsFragment = (EventDetailsFragment) obj;
                if (eventDetailsFragment.u == null) {
                    MenuItem findItem4 = menu.findItem(R.id.share);
                    eventDetailsFragment.u = findItem4;
                    if (findItem4 != null) {
                        findItem4.setEnabled(eventDetailsFragment.r);
                    }
                }
                eventDetailsFragment.j(menu);
                break;
            case 3:
                menuInflater.inflate(R.menu.menu_share, menu);
                EventFootballLineupsFragment eventFootballLineupsFragment = (EventFootballLineupsFragment) obj;
                if (!((p06) eventFootballLineupsFragment.s.getValue()).v) {
                    menu.removeItem(R.id.share);
                }
                eventFootballLineupsFragment.j(menu);
                break;
            case 4:
                menuInflater.inflate(R.menu.menu_share, menu);
                ((EventStandingsFragment) obj).j(menu);
                break;
            case 5:
                menuInflater.inflate(R.menu.menu_share, menu);
                menu.findItem(R.id.share);
                ((EventStatisticsFragment) obj).j(menu);
                break;
            case 6:
                menuInflater.inflate(R.menu.menu_info, menu);
                FantasyCompetitionFixturesFragment fantasyCompetitionFixturesFragment = (FantasyCompetitionFixturesFragment) obj;
                MenuItem findItem5 = menu.findItem(R.id.info);
                findItem5.setVisible(fantasyCompetitionFixturesFragment.D().p.getValue() == gy6.b);
                fantasyCompetitionFixturesFragment.x = findItem5;
                break;
            case 7:
                menuInflater.inflate(R.menu.menu_share, menu);
                FantasyCompetitionMyTeamFragment fantasyCompetitionMyTeamFragment = (FantasyCompetitionMyTeamFragment) obj;
                MenuItem findItem6 = menu.findItem(R.id.share);
                gv9 gv9Var = fantasyCompetitionMyTeamFragment.D().l().f;
                findItem6.setVisible(!(gv9Var == null || gv9Var.isEmpty()));
                fantasyCompetitionMyTeamFragment.v = findItem6;
                break;
            case 8:
                menuInflater.inflate(R.menu.menu_comparison, menu);
                break;
            case 9:
                menuInflater.inflate(R.menu.menu_reset, menu);
                ((FantasySubstitutionsActivity) obj).L = menu.findItem(R.id.reset);
                break;
            case 10:
                menuInflater.inflate(R.menu.menu_transfers, menu);
                ((FantasyTransfersFragment) obj).u = menu.findItem(R.id.reset);
                break;
            case 11:
                menuInflater.inflate(R.menu.menu_search, menu);
                MenuItem findItem7 = menu.findItem(R.id.search);
                ((FantasyWalkthroughCreateTeamFragment) obj).u = findItem7;
                if (findItem7 != null) {
                    findItem7.setVisible(!r8.C().k().g);
                    break;
                }
                break;
            case 12:
                menuInflater.inflate(R.menu.menu_share, menu);
                ((LeagueStandingsFragment) obj).j(menu);
                break;
            case 13:
                menuInflater.inflate(R.menu.menu_edit_profile, menu);
                View actionView = menu.findItem(R.id.save).getActionView();
                if (actionView != null) {
                    actionView.setOnClickListener(new cne((ProfileEditFragment) obj, 9));
                    break;
                }
                break;
            case 14:
                menuInflater.inflate(R.menu.menu_info, menu);
                ((ProfileTopLeaderboardFragment) obj).j(menu);
                break;
            default:
                menuInflater.inflate(R.menu.menu_share, menu);
                ((TeamStandingsFragment) obj).j(menu);
                break;
        }
    }
}
