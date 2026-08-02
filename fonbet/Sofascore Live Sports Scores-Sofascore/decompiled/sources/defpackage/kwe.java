package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.PlayerSeasonShotActionsResponse;
import com.sofascore.model.network.response.SeasonShotActionAreaResponse;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.model.newNetwork.PlayerSeasonHeatMapResponse;
import com.sofascore.model.newNetwork.PlayerSeasonRatingsResponse;
import com.sofascore.model.newNetwork.SeasonHeatMapPoint;
import com.sofascore.model.newNetwork.SeasonShotAction;
import com.sofascore.model.newNetwork.SeasonStatisticsResponse;
import com.sofascore.model.newNetwork.statistics.season.player.HighlightedPlayerStatistic;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kwe extends hoi implements Function2 {
    public final /* synthetic */ nwe A;
    public final /* synthetic */ v2g B;
    public final /* synthetic */ awe C;
    public final /* synthetic */ x2g D;
    public final /* synthetic */ x2g E;
    public final /* synthetic */ x2g F;
    public final /* synthetic */ x2g G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ zu4 I;
    public final /* synthetic */ x2g J;
    public yzc r;
    public wyg s;
    public ryg t;
    public syg u;
    public dzg v;
    public Team w;
    public PlayerPenaltyHistoryResponse x;
    public Map y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwe(nwe nweVar, v2g v2gVar, awe aweVar, x2g x2gVar, x2g x2gVar2, x2g x2gVar3, x2g x2gVar4, boolean z, zu4 zu4Var, x2g x2gVar5, rq3 rq3Var) {
        super(2, rq3Var);
        this.A = nweVar;
        this.B = v2gVar;
        this.C = aweVar;
        this.D = x2gVar;
        this.E = x2gVar2;
        this.F = x2gVar3;
        this.G = x2gVar4;
        this.H = z;
        this.I = zu4Var;
        this.J = x2gVar5;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new kwe(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kwe) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0163  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yzc yzcVar;
        wyg wygVar;
        ryg rygVar;
        syg sygVar;
        dzg dzgVar;
        Team team;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse;
        Map<String, HighlightedPlayerStatistic> highlighted;
        boolean z;
        Object T;
        Team team2;
        Map<String, HighlightedPlayerStatistic> map;
        dzg dzgVar2;
        PlayerSeasonShotActionsResponse playerSeasonShotActionsResponse;
        PlayerSeasonRatingsResponse playerSeasonRatingsResponse;
        PlayerSeasonHeatMapResponse playerSeasonHeatMapResponse;
        Integer num;
        boolean z2;
        dzg dzgVar3;
        List<String> types;
        awe aweVar = this.C;
        Player player = aweVar.a;
        Object obj2 = this.B.a;
        lu3 lu3Var = lu3.a;
        int i = this.z;
        if (i == 0) {
            y6a.M(obj);
            yzcVar = this.A.g;
            wygVar = new wyg(((PlayerSeasonStatisticsResponse) obj2).getStatistics(), player.getPosition(), aweVar.e);
            x2g x2gVar = this.D;
            if (x2gVar == null || (playerSeasonHeatMapResponse = (PlayerSeasonHeatMapResponse) yaa.x(x2gVar)) == null) {
                rygVar = null;
            } else {
                Set set = jwe.a;
                int id = player.getId();
                int i2 = aweVar.b;
                int i3 = aweVar.c;
                ArrayList arrayList = new ArrayList();
                List<SeasonHeatMapPoint> points = playerSeasonHeatMapResponse.getPoints();
                if (points != null) {
                    Iterator<SeasonHeatMapPoint> it = points.iterator();
                    while (it.hasNext()) {
                        SeasonHeatMapPoint next = it.next();
                        Integer count = next.getCount();
                        if (count != null) {
                            int intValue = count.intValue();
                            Double x = next.getX();
                            PlayerSeasonHeatMapResponse playerSeasonHeatMapResponse2 = playerSeasonHeatMapResponse;
                            if (x != null) {
                                double doubleValue = x.doubleValue();
                                Double y = next.getY();
                                if (y != null) {
                                    double doubleValue2 = y.doubleValue();
                                    int i4 = 0;
                                    while (i4 < intValue) {
                                        arrayList.add(new Point2D(doubleValue, doubleValue2));
                                        i4++;
                                        i2 = i2;
                                        it = it;
                                    }
                                }
                            }
                            playerSeasonHeatMapResponse = playerSeasonHeatMapResponse2;
                            i2 = i2;
                            it = it;
                        }
                    }
                }
                int i5 = i2;
                Integer matches = playerSeasonHeatMapResponse.getMatches();
                rygVar = new ryg(matches != null ? matches.intValue() : 0, arrayList, id, i5, i3);
            }
            x2g x2gVar2 = this.E;
            sygVar = (x2gVar2 == null || (playerSeasonRatingsResponse = (PlayerSeasonRatingsResponse) yaa.x(x2gVar2)) == null) ? null : new syg(player, CollectionsKt.B0(playerSeasonRatingsResponse.getSeasonRatings()), ((PlayerSeasonStatisticsResponse) obj2).getStatistics().getRating(), ((PlayerSeasonStatisticsResponse) obj2).getTeam());
            x2g x2gVar3 = this.F;
            if (x2gVar3 != null && (playerSeasonShotActionsResponse = (PlayerSeasonShotActionsResponse) yaa.x(x2gVar3)) != null) {
                x2g x2gVar4 = this.J;
                SeasonShotActionAreaResponse seasonShotActionAreaResponse = x2gVar4 != null ? (SeasonShotActionAreaResponse) yaa.x(x2gVar4) : null;
                Integer appearances = ((PlayerSeasonStatisticsResponse) obj2).getStatistics().getAppearances();
                if (appearances != null) {
                    int intValue2 = appearances.intValue();
                    List<SeasonShotAction> shotActions = playerSeasonShotActionsResponse.getShotActions();
                    if (shotActions == null) {
                        shotActions = km5.a;
                    }
                    dzgVar = new dzg(intValue2, shotActions, seasonShotActionAreaResponse != null ? seasonShotActionAreaResponse.getShotActionAreas() : null);
                    team = ((PlayerSeasonStatisticsResponse) obj2).getTeam();
                    x2g x2gVar5 = this.G;
                    playerPenaltyHistoryResponse = x2gVar5 == null ? (PlayerPenaltyHistoryResponse) yaa.x(x2gVar5) : null;
                    highlighted = ((PlayerSeasonStatisticsResponse) obj2).getHighlighted();
                    if (this.H) {
                        z = true;
                        dzgVar3 = dzgVar;
                        z2 = z;
                        yzcVar.k(new owe(wygVar, rygVar, sygVar, dzgVar3, team, playerPenaltyHistoryResponse, highlighted, z2));
                        return Unit.a;
                    }
                    zu4 zu4Var = this.I;
                    if (zu4Var != null) {
                        this.r = yzcVar;
                        this.s = wygVar;
                        this.t = rygVar;
                        this.u = sygVar;
                        this.v = dzgVar;
                        this.w = team;
                        this.x = playerPenaltyHistoryResponse;
                        this.y = highlighted;
                        this.z = 1;
                        T = zu4Var.T(this);
                        if (T == lu3Var) {
                            return lu3Var;
                        }
                        team2 = team;
                        map = highlighted;
                        dzgVar2 = dzgVar;
                    }
                    dzgVar2 = dzgVar;
                    num = null;
                    z = true;
                    if (yid.m(num) <= 1) {
                        dzgVar3 = dzgVar2;
                        z2 = false;
                        yzcVar.k(new owe(wygVar, rygVar, sygVar, dzgVar3, team, playerPenaltyHistoryResponse, highlighted, z2));
                        return Unit.a;
                    }
                    dzgVar = dzgVar2;
                    dzgVar3 = dzgVar;
                    z2 = z;
                    yzcVar.k(new owe(wygVar, rygVar, sygVar, dzgVar3, team, playerPenaltyHistoryResponse, highlighted, z2));
                    return Unit.a;
                }
            }
            dzgVar = null;
            team = ((PlayerSeasonStatisticsResponse) obj2).getTeam();
            x2g x2gVar52 = this.G;
            if (x2gVar52 == null) {
            }
            highlighted = ((PlayerSeasonStatisticsResponse) obj2).getHighlighted();
            if (this.H) {
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = this.y;
            playerPenaltyHistoryResponse = this.x;
            team2 = this.w;
            dzgVar2 = this.v;
            syg sygVar2 = this.u;
            rygVar = this.t;
            wygVar = this.s;
            yzc yzcVar2 = this.r;
            y6a.M(obj);
            sygVar = sygVar2;
            yzcVar = yzcVar2;
            T = obj;
        }
        SeasonStatisticsResponse seasonStatisticsResponse = (SeasonStatisticsResponse) T;
        if (seasonStatisticsResponse == null || (types = seasonStatisticsResponse.getTypes()) == null) {
            Team team3 = team2;
            highlighted = map;
            team = team3;
            dzgVar = dzgVar2;
            dzgVar2 = dzgVar;
            num = null;
            z = true;
            if (yid.m(num) <= 1) {
            }
        } else {
            num = new Integer(types.size());
            Team team4 = team2;
            highlighted = map;
            team = team4;
            z = true;
            if (yid.m(num) <= 1) {
            }
        }
    }
}
