package defpackage;

import android.app.Application;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.ConferenceChampion;
import com.sofascore.model.newNetwork.TeamOfTheWeekPlayer;
import com.sofascore.model.newNetwork.TeamOfTheWeekResponse;
import com.sofascore.model.newNetwork.UniqueTournamentChampionsResponse;
import com.sofascore.model.newNetwork.UniqueTournamentIndividualAwardType;
import com.sofascore.model.newNetwork.UniqueTournamentIndividualReward;
import com.sofascore.model.newNetwork.UniqueTournamentManagerReward;
import com.sofascore.model.newNetwork.UniqueTournamentPlayerReward;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lnua;", "Lynb;", "Liua;", "Lcua;", "", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class nua extends ynb {
    public final w3b l;
    public int m;
    public int n;
    public g9i o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nua(w3b w3bVar, Application application) {
        super(application, tnb.a);
        w3bVar.getClass();
        this.l = w3bVar;
        this.m = -1;
        this.n = -1;
    }

    public static gv9 w(List list) {
        Object sw0Var;
        String shortName;
        if (list != null) {
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UniqueTournamentIndividualReward uniqueTournamentIndividualReward = (UniqueTournamentIndividualReward) it.next();
                UniqueTournamentIndividualAwardType type = uniqueTournamentIndividualReward.getType();
                r9k b0 = type != null ? tgj.b0(type) : new m9k(uniqueTournamentIndividualReward.getName());
                if (uniqueTournamentIndividualReward instanceof UniqueTournamentPlayerReward) {
                    UniqueTournamentPlayerReward uniqueTournamentPlayerReward = (UniqueTournamentPlayerReward) uniqueTournamentIndividualReward;
                    int id = uniqueTournamentPlayerReward.getPlayer().getId();
                    String C = tba.C(uniqueTournamentPlayerReward.getPlayer());
                    if (C == null) {
                        C = tba.t(uniqueTournamentPlayerReward.getPlayer());
                    }
                    m9k m9kVar = new m9k(C);
                    Team team = uniqueTournamentPlayerReward.getTeam();
                    sw0Var = new uw0(id, b0, m9kVar, team != null ? Integer.valueOf(team.getId()) : null);
                } else if (uniqueTournamentIndividualReward instanceof UniqueTournamentManagerReward) {
                    UniqueTournamentManagerReward uniqueTournamentManagerReward = (UniqueTournamentManagerReward) uniqueTournamentIndividualReward;
                    int id2 = uniqueTournamentManagerReward.getManager().getId();
                    Manager manager = uniqueTournamentManagerReward.getManager();
                    manager.getClass();
                    FieldTranslations fieldTranslations = manager.getFieldTranslations();
                    if (fieldTranslations == null || (shortName = tba.B(fieldTranslations)) == null) {
                        shortName = manager.getShortName();
                    }
                    if (shortName == null) {
                        shortName = tba.s(uniqueTournamentManagerReward.getManager());
                    }
                    m9k m9kVar2 = new m9k(shortName);
                    Team team2 = uniqueTournamentManagerReward.getTeam();
                    sw0Var = new tw0(id2, b0, m9kVar2, team2 != null ? Integer.valueOf(team2.getId()) : null);
                } else {
                    sw0Var = new sw0(new q9k(R.string.coming_soon), b0);
                }
                arrayList.add(sw0Var);
            }
            gv9 W = l6g.W(arrayList);
            if (W != null) {
                return W;
            }
        }
        return rlh.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(int i, sq3 sq3Var) {
        mua muaVar;
        int i2;
        TeamOfTheWeekResponse teamOfTheWeekResponse;
        List<TeamOfTheWeekPlayer> players;
        znj znjVar;
        unj unjVar;
        if (sq3Var instanceof mua) {
            muaVar = (mua) sq3Var;
            int i3 = muaVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                muaVar.t = i3 - Integer.MIN_VALUE;
                Object obj = muaVar.r;
                lu3 lu3Var = lu3.a;
                i2 = muaVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    muaVar.t = 1;
                    obj = this.l.t(i, muaVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                teamOfTheWeekResponse = (TeamOfTheWeekResponse) obj;
                if (teamOfTheWeekResponse != null || (players = teamOfTheWeekResponse.getPlayers()) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (TeamOfTheWeekPlayer teamOfTheWeekPlayer : players) {
                    Player player = teamOfTheWeekPlayer.getPlayer();
                    if (player == null) {
                        unjVar = null;
                    } else {
                        int id = player.getId();
                        String t = tba.t(player);
                        String position = player.getPosition();
                        Gender gender = player.getGender();
                        String string = i().getString(R.string.average_sofascore_rating);
                        string.getClass();
                        String rating = teamOfTheWeekPlayer.getRating();
                        if (rating == null) {
                            rating = "";
                        }
                        umj umjVar = new umj(string, rating);
                        Team team = teamOfTheWeekPlayer.getTeam();
                        if (team != null) {
                            int id2 = team.getId();
                            String p = tba.p(i(), team);
                            Country country = team.getCountry();
                            znjVar = new znj(id2, null, new Integer(team.getType()), p, country != null ? country.getAlpha2() : null);
                        } else {
                            znjVar = null;
                        }
                        unjVar = new unj(id, t, position, gender, umjVar, znjVar, true, null);
                    }
                    if (unjVar != null) {
                        arrayList.add(unjVar);
                    }
                }
                return l6g.W(arrayList);
            }
        }
        muaVar = new mua(this, sq3Var);
        Object obj2 = muaVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = muaVar.t;
        if (i2 != 0) {
        }
        teamOfTheWeekResponse = (TeamOfTheWeekResponse) obj2;
        if (teamOfTheWeekResponse != null) {
        }
        return null;
    }

    public final cn2 u(UniqueTournamentChampionsResponse uniqueTournamentChampionsResponse) {
        if (uniqueTournamentChampionsResponse == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(uniqueTournamentChampionsResponse.getWinner().getTeam().getId());
        String p = tba.p(i(), uniqueTournamentChampionsResponse.getWinner().getTeam());
        String format = String.format("%s %d:%d %s", Arrays.copyOf(new Object[]{uniqueTournamentChampionsResponse.getWinner().getTeam().getNameCode(), Integer.valueOf(uniqueTournamentChampionsResponse.getWinner().getWinCount()), Integer.valueOf(uniqueTournamentChampionsResponse.getRunnerUp().getWinCount()), uniqueTournamentChampionsResponse.getRunnerUp().getTeam().getNameCode()}, 4));
        Player mvp = uniqueTournamentChampionsResponse.getMvp();
        Integer valueOf2 = mvp != null ? Integer.valueOf(mvp.getId()) : null;
        Player mvp2 = uniqueTournamentChampionsResponse.getMvp();
        return new cn2(valueOf, p, format, mvp2 != null ? tba.C(mvp2) : null, valueOf2);
    }

    public final gv9 v(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(k13.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ConferenceChampion conferenceChampion = (ConferenceChampion) it.next();
                int id = conferenceChampion.getTeam().getId();
                String W = ml4.W(i(), conferenceChampion.getConference().getId());
                if (W == null) {
                    W = conferenceChampion.getConference().getName();
                }
                arrayList.add(new rw0(id, new m9k(W), new m9k(tba.p(i(), conferenceChampion.getTeam()))));
            }
            gv9 W2 = l6g.W(arrayList);
            if (W2 != null) {
                return W2;
            }
        }
        return rlh.b;
    }
}
