package defpackage;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.SeasonSpinnerData;
import com.sofascore.model.Sports;
import com.sofascore.model.UniqueTournamentSeasonsSpinnerData;
import com.sofascore.model.UniqueTournamentSpinnerData;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentSeasons;
import com.sofascore.results.R;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.team.statistics.TeamSeasonStatisticsFragment;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class p0j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TeamSeasonStatisticsFragment b;

    public /* synthetic */ p0j(TeamSeasonStatisticsFragment teamSeasonStatisticsFragment, int i) {
        this.a = i;
        this.b = teamSeasonStatisticsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        List<String> list;
        int i = this.a;
        TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.b;
        switch (i) {
            case 0:
                e1d e1dVar = teamSeasonStatisticsFragment.w;
                e1d e1dVar2 = teamSeasonStatisticsFragment.v;
                StatisticsSeasonsResponse statisticsSeasonsResponse = (StatisticsSeasonsResponse) obj;
                teamSeasonStatisticsFragment.n();
                statisticsSeasonsResponse.getClass();
                xbb b = a.b();
                if (Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.TENNIS)) {
                    UniqueTournamentSpinnerData uniqueTournamentSpinnerData = new UniqueTournamentSpinnerData(-1000, teamSeasonStatisticsFragment.requireContext().getString(R.string.tennis_all_tournaments), null, 4, null);
                    List list2 = teamSeasonStatisticsFragment.L().n;
                    ArrayList arrayList = new ArrayList(k13.r(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        arrayList.add(new SeasonSpinnerData(-intValue, String.valueOf(intValue)));
                    }
                    b.add(new UniqueTournamentSeasonsSpinnerData(uniqueTournamentSpinnerData, arrayList));
                }
                for (UniqueTournamentSeasons uniqueTournamentSeasons : statisticsSeasonsResponse.getUniqueTournamentSeasons()) {
                    Map<Integer, Map<Integer, List<String>>> typesMap = statisticsSeasonsResponse.getTypesMap();
                    if (typesMap != null) {
                        teamSeasonStatisticsFragment.C = typesMap;
                        if (typesMap.containsKey(Integer.valueOf(uniqueTournamentSeasons.getUniqueTournament().getId()))) {
                            Map<Integer, List<String>> map = typesMap.get(Integer.valueOf(uniqueTournamentSeasons.getUniqueTournament().getId()));
                            ArrayList arrayList2 = new ArrayList();
                            for (Season season : uniqueTournamentSeasons.getSeasons()) {
                                if (map != null && map.containsKey(Integer.valueOf(season.getId())) && (list = map.get(Integer.valueOf(season.getId()))) != null && ((Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.BASKETBALL) && list.contains(Season.SubSeasonType.REGULAR_SEASON.getLabel())) || list.contains(Season.SubSeasonType.OVERALL.getLabel()))) {
                                    arrayList2.add(new SeasonSpinnerData(season.getId(), season.getYear()));
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                UniqueTournament uniqueTournament = uniqueTournamentSeasons.getUniqueTournament();
                                b.add(new UniqueTournamentSeasonsSpinnerData(new UniqueTournamentSpinnerData(uniqueTournament.getId(), tba.x(uniqueTournament), uniqueTournament.getTennisPoints()), arrayList2));
                            }
                        }
                    }
                }
                ((eoh) e1dVar2).setValue(a.a(b));
                Iterator it2 = ((List) ((eoh) e1dVar2).getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((UniqueTournamentSeasonsSpinnerData) obj2).getUniqueTournament().getId() == ((Number) teamSeasonStatisticsFragment.y.getValue()).intValue()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData = (UniqueTournamentSeasonsSpinnerData) obj2;
                if (uniqueTournamentSeasonsSpinnerData == null) {
                    uniqueTournamentSeasonsSpinnerData = (UniqueTournamentSeasonsSpinnerData) CollectionsKt.firstOrNull((List) ((eoh) e1dVar2).getValue());
                }
                ((eoh) teamSeasonStatisticsFragment.z).setValue(uniqueTournamentSeasonsSpinnerData);
                UniqueTournamentSeasonsSpinnerData G = teamSeasonStatisticsFragment.G();
                List<SeasonSpinnerData> seasons = G != null ? G.getSeasons() : null;
                if (seasons == null) {
                    seasons = km5.a;
                }
                ((eoh) e1dVar).setValue(seasons);
                ((eoh) teamSeasonStatisticsFragment.A).setValue((SeasonSpinnerData) CollectionsKt.firstOrNull((List) ((eoh) e1dVar).getValue()));
                teamSeasonStatisticsFragment.N();
                if (((List) ((eoh) e1dVar2).getValue()).isEmpty()) {
                    r14.p(teamSeasonStatisticsFragment.E().g.size(), (GraphicLarge) teamSeasonStatisticsFragment.G.getValue());
                }
                break;
            case 1:
                z0j z0jVar = (z0j) obj;
                ((SegmentedButtonsView) teamSeasonStatisticsFragment.D.getValue()).setFallbackToLabel(Boolean.valueOf(z0jVar.b));
                teamSeasonStatisticsFragment.M(z0jVar.a);
                break;
            case 2:
                List list3 = (List) obj;
                krk krkVar = teamSeasonStatisticsFragment.l;
                krkVar.getClass();
                TypeHeaderView typeHeaderView = ((eq8) krkVar).f;
                Context requireContext = teamSeasonStatisticsFragment.requireContext();
                requireContext.getClass();
                list3.getClass();
                ArrayList u = uaa.u(requireContext, list3);
                Boolean bool = Boolean.TRUE;
                int i2 = TypeHeaderView.q;
                typeHeaderView.w(u, null, bool);
                break;
            case 3:
                mqi mqiVar = teamSeasonStatisticsFragment.G;
                n0j n0jVar = (n0j) obj;
                if (n0jVar != null) {
                    List list4 = n0jVar.a;
                    Double d = n0jVar.b;
                    TeamAverageRatingVersion teamAverageRatingVersion = n0jVar.d;
                    if (d == null) {
                        v0j E = teamSeasonStatisticsFragment.E();
                        ConstraintLayout constraintLayout = teamSeasonStatisticsFragment.K().a;
                        constraintLayout.getClass();
                        E.C(constraintLayout);
                    } else {
                        v0j E2 = teamSeasonStatisticsFragment.E();
                        ConstraintLayout constraintLayout2 = teamSeasonStatisticsFragment.K().a;
                        constraintLayout2.getClass();
                        E2.p(0, constraintLayout2);
                        teamSeasonStatisticsFragment.K().c.setText(teamSeasonStatisticsFragment.getString(R.string.average_sofascore_rating));
                        teamSeasonStatisticsFragment.K().d.m(d.doubleValue(), true);
                        aba.t(teamSeasonStatisticsFragment.K().c);
                        z8e.a0(teamSeasonStatisticsFragment.K().c, 1000L, new mth(2, teamSeasonStatisticsFragment, d, teamAverageRatingVersion));
                    }
                    teamSeasonStatisticsFragment.E().n = n0jVar.c;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            if (!(it3.next() instanceof w5b)) {
                                teamSeasonStatisticsFragment.E().C((GraphicLarge) mqiVar.getValue());
                                teamSeasonStatisticsFragment.E().F(list4);
                            }
                        }
                    }
                    r13.p(teamSeasonStatisticsFragment.E().g.size(), (GraphicLarge) mqiVar.getValue());
                }
                break;
            case 4:
                oei oeiVar = (oei) obj;
                oeiVar.getClass();
                ((eoh) teamSeasonStatisticsFragment.B).setValue(oeiVar);
                z0j z0jVar2 = (z0j) teamSeasonStatisticsFragment.L().j.d();
                if (z0jVar2 != null) {
                    teamSeasonStatisticsFragment.M(z0jVar2.a);
                }
                break;
            case 5:
                UniqueTournamentSeasonsSpinnerData uniqueTournamentSeasonsSpinnerData2 = (UniqueTournamentSeasonsSpinnerData) obj;
                uniqueTournamentSeasonsSpinnerData2.getClass();
                ((eoh) teamSeasonStatisticsFragment.z).setValue(uniqueTournamentSeasonsSpinnerData2);
                List<SeasonSpinnerData> seasons2 = uniqueTournamentSeasonsSpinnerData2.getSeasons();
                e1d e1dVar3 = teamSeasonStatisticsFragment.w;
                ((eoh) e1dVar3).setValue(seasons2);
                ((eoh) teamSeasonStatisticsFragment.A).setValue((SeasonSpinnerData) CollectionsKt.firstOrNull((List) ((eoh) e1dVar3).getValue()));
                teamSeasonStatisticsFragment.N();
                if (Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.TENNIS)) {
                    Context requireContext2 = teamSeasonStatisticsFragment.requireContext();
                    requireContext2.getClass();
                    nv.z0(requireContext2, kv.CLICK, "tournament_filter", "team_statistics");
                }
                break;
            case 6:
                SeasonSpinnerData seasonSpinnerData = (SeasonSpinnerData) obj;
                seasonSpinnerData.getClass();
                ((eoh) teamSeasonStatisticsFragment.A).setValue(seasonSpinnerData);
                teamSeasonStatisticsFragment.N();
                if (Intrinsics.c(teamSeasonStatisticsFragment.H(), Sports.TENNIS)) {
                    Context requireContext3 = teamSeasonStatisticsFragment.requireContext();
                    requireContext3.getClass();
                    nv.z0(requireContext3, kv.CLICK, "year_filter", "team_statistics");
                }
                break;
            default:
                float floatValue = ((Float) obj).floatValue();
                krk krkVar2 = teamSeasonStatisticsFragment.l;
                krkVar2.getClass();
                ((eq8) krkVar2).b.setElevation(floatValue);
                break;
        }
        return Unit.a;
    }
}
