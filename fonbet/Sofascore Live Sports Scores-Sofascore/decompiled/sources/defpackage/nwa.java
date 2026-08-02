package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Round;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.model.newNetwork.UniqueTournamentGroup;
import com.sofascore.model.newNetwork.UniqueTournamentGroupsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentRoundsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentTeamsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentVenuesResponse;
import com.sofascore.results.R;
import com.sofascore.results.league.fragment.events.LeagueEventsFragment;
import com.sofascore.results.view.InformationView;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class nwa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueEventsFragment b;

    public /* synthetic */ nwa(LeagueEventsFragment leagueEventsFragment, int i) {
        this.a = i;
        this.b = leagueEventsFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0187, code lost:
    
        if (r2.getBoolean("PREF_TENNIS_COURT_DISCLAIMER", true) != false) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        SharedPreferences d;
        int i = this.a;
        int i2 = 0;
        Object obj2 = null;
        Object[] objArr = 0;
        LeagueEventsFragment leagueEventsFragment = this.b;
        switch (i) {
            case 0:
                kya kyaVar = (kya) obj;
                kyaVar.getClass();
                u6e.b(leagueEventsFragment.E());
                leagueEventsFragment.D().s();
                leagueEventsFragment.v = true;
                zwa G = leagueEventsFragment.G();
                G.q.put(G.p, kyaVar);
                G.t();
                G.m();
                krk krkVar = leagueEventsFragment.l;
                krkVar.getClass();
                InformationView informationView = ((po8) krkVar).d;
                zwa G2 = leagueEventsFragment.G();
                if (G2.v() != null) {
                    Context i3 = G2.i();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = i3.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    break;
                }
                i2 = 8;
                informationView.setVisibility(i2);
                return Unit.a;
            case 1:
                String str = (String) obj;
                str.getClass();
                Iterator<E> it = uwa.h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((uwa) next).a.equals(str)) {
                            obj2 = next;
                        }
                    }
                }
                uwa uwaVar = (uwa) obj2;
                if (uwaVar != null) {
                    String F = leagueEventsFragment.F();
                    F.getClass();
                    String string = leagueEventsFragment.getString((uwaVar == uwa.d && F.equals(Sports.AMERICAN_FOOTBALL)) ? R.string.chip_by_week : uwaVar.b);
                    if (string != null) {
                        return string;
                    }
                }
                return "";
            case 2:
                vwa vwaVar = (vwa) obj;
                Set set = wyh.a;
                boolean e = wyh.e(leagueEventsFragment.F());
                xbb b = a.b();
                uwa uwaVar2 = uwa.c;
                b.add("date");
                UniqueTournamentRoundsResponse uniqueTournamentRoundsResponse = vwaVar.a;
                List<Round> rounds = uniqueTournamentRoundsResponse != null ? uniqueTournamentRoundsResponse.getRounds() : null;
                if (rounds != null && !rounds.isEmpty()) {
                    b.add(TeamOfTheWeekRoundsResponseKt.TOTW_ROUND);
                }
                UniqueTournamentVenuesResponse uniqueTournamentVenuesResponse = vwaVar.d;
                List<Venue> venues = uniqueTournamentVenuesResponse != null ? uniqueTournamentVenuesResponse.getVenues() : null;
                if (venues != null && !venues.isEmpty()) {
                    b.add("court");
                }
                UniqueTournamentGroupsResponse uniqueTournamentGroupsResponse = vwaVar.b;
                List<UniqueTournamentGroup> groups = uniqueTournamentGroupsResponse != null ? uniqueTournamentGroupsResponse.getGroups() : null;
                if (groups != null && !groups.isEmpty()) {
                    b.add("group");
                }
                UniqueTournamentTeamsResponse uniqueTournamentTeamsResponse = vwaVar.c;
                List<Team> teams = uniqueTournamentTeamsResponse != null ? uniqueTournamentTeamsResponse.getTeams() : null;
                if (teams != null && !teams.isEmpty()) {
                    b.add(e ? SearchResponseKt.PLAYER_ENTITY : "team");
                }
                xbb a = a.a(b);
                krk krkVar2 = leagueEventsFragment.l;
                krkVar2.getClass();
                TypeHeaderView.z(((po8) krkVar2).f, a, null, 2);
                krk krkVar3 = leagueEventsFragment.l;
                krkVar3.getClass();
                ((po8) krkVar3).j.setAdapter((twa) leagueEventsFragment.y.getValue());
                return Unit.a;
            default:
                Pair pair = (Pair) obj;
                List list = (List) pair.a;
                boolean booleanValue = ((Boolean) pair.b).booleanValue();
                if (list.isEmpty()) {
                    leagueEventsFragment.D().s();
                } else {
                    kda.p(wca.x(leagueEventsFragment.getLifecycle()), new pwa(leagueEventsFragment, list, objArr == true ? 1 : 0, i2), new sx0(leagueEventsFragment, booleanValue, 3));
                }
                return Unit.a;
        }
    }
}
