package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.network.response.AveragePositionsResponse;
import com.sofascore.model.network.response.Duel;
import com.sofascore.model.network.response.EventManagersResponse;
import com.sofascore.model.network.response.Head2HeadResponse;
import com.sofascore.model.newNetwork.EsportsGame;
import com.sofascore.model.newNetwork.EsportsGamesResponse;
import com.sofascore.model.newNetwork.EventBestPlayersResponse;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.GamePP;
import com.sofascore.model.newNetwork.LegPP;
import com.sofascore.model.newNetwork.PointByPointResponse;
import com.sofascore.model.newNetwork.PointPP;
import com.sofascore.model.newNetwork.ScorePP;
import com.sofascore.model.newNetwork.SetPP;
import com.sofascore.model.newNetwork.commentary.HockeyPlayByPlayResponse;
import com.sofascore.model.newNetwork.hockeyplaybyplay.HockeyIncident;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d86 extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ s96 t;
    public final /* synthetic */ Event u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d86(s96 s96Var, Event event, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.t = s96Var;
        this.u = event;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        Event event = this.u;
        s96 s96Var = this.t;
        switch (i) {
            case 0:
                return new d86(s96Var, event, rq3Var, 0);
            case 1:
                return new d86(s96Var, event, rq3Var, 1);
            case 2:
                return new d86(s96Var, event, rq3Var, 2);
            case 3:
                return new d86(s96Var, event, rq3Var, 3);
            case 4:
                return new d86(s96Var, event, rq3Var, 4);
            case 5:
                return new d86(s96Var, event, rq3Var, 5);
            case 6:
                return new d86(s96Var, event, rq3Var, 6);
            default:
                return new d86(s96Var, event, rq3Var, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((d86) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        s96 s96Var = this.t;
        Event event = this.u;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI = s96Var.a;
                    int id = event.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI.getAveragePositions(id, this);
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
                ((AveragePositionsResponse) obj).setShouldReverseTeams(event.shouldReverseTeams());
                return obj;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI2 = s96Var.a;
                    int id2 = event.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI2.bestPlayers(id2, this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ((EventBestPlayersResponse) obj).setShouldReverseTeams(event.shouldReverseTeams());
                return obj;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI3 = s96Var.a;
                    int id3 = event.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI3.esportsGames(id3, this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterator<T> it = ((EsportsGamesResponse) obj).getGames().iterator();
                while (it.hasNext()) {
                    ((EsportsGame) it.next()).setShouldReverseTeams(event.shouldReverseTeams());
                }
                return obj;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI4 = s96Var.a;
                    int id4 = event.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI4.getHead2Head(id4, this);
                    if (obj == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i5 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Head2HeadResponse head2HeadResponse = (Head2HeadResponse) obj;
                Duel managerDuel = head2HeadResponse.getManagerDuel();
                if (managerDuel != null) {
                    managerDuel.setShouldReverseTeams(event.shouldReverseTeams());
                }
                Duel teamDuel = head2HeadResponse.getTeamDuel();
                if (teamDuel != null) {
                    teamDuel.setShouldReverseTeams(event.shouldReverseTeams());
                }
                return obj;
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI5 = s96Var.a;
                    int id5 = event.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI5.getEventIncidents(id5, this);
                    if (obj == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return ((EventIncidentsResponse) obj).mapIncidents(event.getSportSlug(), event);
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI6 = s96Var.a;
                    int id6 = event.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI6.getEventManagers(id6, this);
                    if (obj == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ((EventManagersResponse) obj).setShouldReverseTeams(event.shouldReverseTeams());
                return obj;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI7 = s96Var.a;
                    int id7 = event.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI7.pointByPoint(id7, this);
                    if (obj == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i8 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                for (SetPP setPP : ((PointByPointResponse) obj).getPointByPoint()) {
                    List<GamePP> games = setPP.getGames();
                    if (games != null) {
                        for (GamePP gamePP : games) {
                            ScorePP score = gamePP.getScore();
                            if (score != null) {
                                score.setShouldReverseTeams(event.shouldReverseTeams());
                            }
                            Iterator<T> it2 = gamePP.getPoints().iterator();
                            while (it2.hasNext()) {
                                ((PointPP) it2.next()).setShouldReverseTeams(event.shouldReverseTeams());
                            }
                        }
                    }
                    List<LegPP> legs = setPP.getLegs();
                    if (legs != null) {
                        for (LegPP legPP : legs) {
                            ScorePP score2 = legPP.getScore();
                            if (score2 != null) {
                                score2.setShouldReverseTeams(event.shouldReverseTeams());
                            }
                            Iterator<T> it3 = legPP.getPoints().iterator();
                            while (it3.hasNext()) {
                                ((PointPP) it3.next()).setShouldReverseTeams(event.shouldReverseTeams());
                            }
                        }
                    }
                }
                return obj;
            default:
                lu3 lu3Var8 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    NetworkCoroutineAPI networkCoroutineAPI8 = s96Var.a;
                    int id8 = event.getId();
                    this.s = 1;
                    obj = networkCoroutineAPI8.getHockeyPlayByPlay(id8, this);
                    if (obj == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i9 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List<HockeyIncident> comments = ((HockeyPlayByPlayResponse) obj).getComments();
                Iterator<T> it4 = comments.iterator();
                while (it4.hasNext()) {
                    ((HockeyIncident) it4.next()).setShouldReverseTeams(event.shouldReverseTeams());
                }
                return comments;
        }
    }
}
