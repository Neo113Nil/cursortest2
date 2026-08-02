package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z7c extends hoi implements et8 {
    public final /* synthetic */ int r;
    public int s;
    public /* synthetic */ Event t;
    public /* synthetic */ Player u;
    public /* synthetic */ Team v;
    public final /* synthetic */ MediaPost w;
    public final /* synthetic */ ku3 x;
    public final /* synthetic */ u8c y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z7c(MediaPost mediaPost, ku3 ku3Var, u8c u8cVar, rq3 rq3Var, int i) {
        super(4, rq3Var);
        this.r = i;
        this.w = mediaPost;
        this.x = ku3Var;
        this.y = u8cVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Event event = (Event) obj;
        Player player = (Player) obj2;
        Team team = (Team) obj3;
        rq3 rq3Var = (rq3) obj4;
        switch (this.r) {
            case 0:
                z7c z7cVar = new z7c(this.w, this.x, this.y, rq3Var, 0);
                z7cVar.t = event;
                z7cVar.u = player;
                z7cVar.v = team;
                return z7cVar.invokeSuspend(Unit.a);
            case 1:
                z7c z7cVar2 = new z7c(this.w, this.x, this.y, rq3Var, 1);
                z7cVar2.t = event;
                z7cVar2.u = player;
                z7cVar2.v = team;
                return z7cVar2.invokeSuspend(Unit.a);
            default:
                z7c z7cVar3 = new z7c(this.w, this.x, this.y, rq3Var, 2);
                z7cVar3.t = event;
                z7cVar3.u = player;
                z7cVar3.v = team;
                return z7cVar3.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object w;
        iy7 iy7Var;
        Object w2;
        PlayerEventStatistics statistics;
        Team team;
        Player player;
        PlayerEventStatistics playerEventStatistics;
        Object w3;
        Pair pair;
        Pair pair2;
        Context context;
        Player player2;
        Team team2;
        MediaPost mediaPost;
        Event event;
        List q;
        p1k p1kVar;
        List q2;
        List q3;
        List q4;
        List q5;
        p1k p1kVar2;
        int i = this.r;
        ku3 ku3Var = this.x;
        MediaPost mediaPost2 = this.w;
        switch (i) {
            case 0:
                u8c u8cVar = this.y;
                Context context2 = u8cVar.a;
                Event event2 = this.t;
                Player player3 = this.u;
                Team team3 = this.v;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    Integer playerId = mediaPost2.getPlayerId();
                    if (playerId != null) {
                        int intValue = playerId.intValue();
                        Integer eventId = mediaPost2.getEventId();
                        if (eventId != null) {
                            av4 t = xw3.t(ku3Var, null, new y7c(u8cVar, eventId.intValue(), intValue, null, 0), 3);
                            this.t = event2;
                            this.u = player3;
                            this.v = team3;
                            this.s = 1;
                            w = t.w(this);
                            if (w == lu3Var) {
                                break;
                            }
                        }
                    }
                    break;
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    w = obj;
                }
                PlayerEventStatisticsResponse playerEventStatisticsResponse = (PlayerEventStatisticsResponse) yaa.x((x2g) w);
                if (playerEventStatisticsResponse != null) {
                    PlayerEventStatistics statistics2 = playerEventStatisticsResponse.getStatistics();
                    String position = playerEventStatisticsResponse.getPosition();
                    if (position == null) {
                        position = player3.getPosition();
                    }
                    List F = kda.F(statistics2, position, hkg.c0(context2), false);
                    if (F != null && F.size() >= 4) {
                        int id = mediaPost2.getId();
                        long createdAtTimestamp = mediaPost2.getCreatedAtTimestamp();
                        Sport sport = mediaPost2.getSport();
                        if (sport != null && (r30 = sport.getSlug()) != null) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                u8c u8cVar2 = this.y;
                Context context3 = u8cVar2.a;
                Event event3 = this.t;
                Player player4 = this.u;
                Team team4 = this.v;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    Integer playerId2 = mediaPost2.getPlayerId();
                    if (playerId2 != null) {
                        int intValue2 = playerId2.intValue();
                        Integer eventId2 = mediaPost2.getEventId();
                        if (eventId2 != null) {
                            y7c y7cVar = new y7c(u8cVar2, eventId2.intValue(), intValue2, null, 10);
                            iy7Var = null;
                            av4 t2 = xw3.t(ku3Var, null, y7cVar, 3);
                            this.t = event3;
                            this.u = player4;
                            this.v = team4;
                            this.s = 1;
                            w2 = t2.w(this);
                            if (w2 == lu3Var2) {
                                break;
                            }
                        }
                    }
                    break;
                } else if (i3 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    w2 = obj;
                    iy7Var = null;
                }
                PlayerEventStatisticsResponse playerEventStatisticsResponse2 = (PlayerEventStatisticsResponse) yaa.x((x2g) w2);
                if (playerEventStatisticsResponse2 != null && (statistics = playerEventStatisticsResponse2.getStatistics()) != null && Intrinsics.a(statistics.getRating(), 10.0d)) {
                    int id2 = mediaPost2.getId();
                    String string = context3.getString(R.string.perfect_10_rating_title);
                    String string2 = context3.getString(R.string.perfect_10_rating_body);
                    long createdAtTimestamp2 = mediaPost2.getCreatedAtTimestamp();
                    bx7 F2 = uxf.F(event3, context3, true, false, null, null, 60);
                    ux7 G = uxf.G(player4);
                    fy7 J = uxf.J(team4, context3, null, false, null, 30);
                    UniqueTournament uniqueTournament = event3.getTournament().getUniqueTournament();
                    break;
                }
                break;
            default:
                u8c u8cVar3 = this.y;
                Context context4 = u8cVar3.a;
                Event event4 = this.t;
                Player player5 = this.u;
                Team team5 = this.v;
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    Integer playerId3 = mediaPost2.getPlayerId();
                    if (playerId3 != null) {
                        int intValue3 = playerId3.intValue();
                        Integer eventId3 = mediaPost2.getEventId();
                        if (eventId3 != null) {
                            int intValue4 = eventId3.intValue();
                            team = team5;
                            player = player5;
                            playerEventStatistics = null;
                            av4 t3 = xw3.t(ku3Var, null, new y7c(u8cVar3, intValue4, intValue3, null, 11), 3);
                            this.t = event4;
                            this.u = player;
                            this.v = team;
                            this.s = 1;
                            w3 = t3.w(this);
                            if (w3 == lu3Var3) {
                                break;
                            }
                        }
                    }
                } else if (i4 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    w3 = obj;
                    player = player5;
                    team = team5;
                    playerEventStatistics = null;
                }
                PlayerEventStatisticsResponse playerEventStatisticsResponse3 = (PlayerEventStatisticsResponse) yaa.x((x2g) w3);
                if (playerEventStatisticsResponse3 != null) {
                    PlayerEventStatistics statistics3 = playerEventStatisticsResponse3.getStatistics();
                    if (!(statistics3 instanceof BasketballPlayerEventStatistics)) {
                        statistics3 = playerEventStatistics;
                    }
                    BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) statistics3;
                    if (basketballPlayerEventStatistics != null) {
                        List<String> tags = mediaPost2.getTags();
                        tags.getClass();
                        if (tags.contains("exceptional")) {
                            if (tags.contains("full")) {
                                pair2 = new Pair(context4.getString(R.string.basketball_triple_double_everything_title), context4.getString(R.string.basketball_triple_double_everything_body));
                            } else if (tags.contains("steal")) {
                                pair2 = new Pair(context4.getString(R.string.basketball_triple_double_steal_title), context4.getString(R.string.basketball_triple_double_steal_body));
                            } else if (tags.contains("block")) {
                                pair2 = new Pair(context4.getString(R.string.basketball_triple_double_block_title), context4.getString(R.string.basketball_triple_double_block_body));
                            } else if (tags.contains("assist")) {
                                pair2 = new Pair(context4.getString(R.string.basketball_triple_double_assist_title), context4.getString(R.string.basketball_triple_double_assist_body));
                            } else if (tags.contains("points")) {
                                pair2 = new Pair(context4.getString(R.string.basketball_triple_double_points_title), context4.getString(R.string.basketball_triple_double_points_body));
                            } else if (tags.contains("basic")) {
                                pair2 = new Pair(context4.getString(R.string.basketball_triple_double_title), context4.getString(R.string.basketball_triple_double_body));
                            } else {
                                playerEventStatistics = null;
                                pair = new Pair(null, null);
                            }
                            pair = pair2;
                            playerEventStatistics = null;
                        } else {
                            pair = new Pair(playerEventStatistics, playerEventStatistics);
                        }
                        String str = (String) pair.a;
                        String str2 = (String) pair.b;
                        List<String> tags2 = mediaPost2.getTags();
                        tags2.getClass();
                        if (tags2.contains("exceptional")) {
                            context = context4;
                            player2 = player;
                            team2 = team;
                            mediaPost = mediaPost2;
                            event = event4;
                            Map h = tub.h(new Pair("points", new o1k(R.string.basketball_lineups_points, basketballPlayerEventStatistics.getPoints())), new Pair("rebounds", new o1k(R.string.basketball_lineups_rebounds, basketballPlayerEventStatistics.getRebounds())), new Pair("assists", new o1k(R.string.basketball_lineups_assists, basketballPlayerEventStatistics.getAssists())), new Pair("steals", new o1k(R.string.basketball_lineups_steals, basketballPlayerEventStatistics.getSteals())), new Pair("blocks", new o1k(R.string.basketball_lineups_blocks, basketballPlayerEventStatistics.getBlocks())));
                            if (tags2.contains("full")) {
                                List q6 = mha.q(h, 3, "points", "rebounds", "assists");
                                if (q6 != null) {
                                    p1kVar = new p1k((o1k) q6.get(0), (o1k) q6.get(1), (o1k) q6.get(2));
                                    p1kVar2 = p1kVar;
                                }
                                p1kVar2 = 0;
                            } else if (tags2.contains("steal")) {
                                o1k s = mha.s("steals", h);
                                if (s != null && (q5 = mha.q(h, 2, "points", "rebounds", "assists", "blocks")) != null) {
                                    p1kVar = new p1k(s, (o1k) q5.get(0), (o1k) q5.get(1));
                                    p1kVar2 = p1kVar;
                                }
                                p1kVar2 = 0;
                            } else if (tags2.contains("block")) {
                                o1k s2 = mha.s("blocks", h);
                                if (s2 != null && (q4 = mha.q(h, 2, "points", "rebounds", "assists", "steals")) != null) {
                                    p1kVar = new p1k(s2, (o1k) q4.get(0), (o1k) q4.get(1));
                                    p1kVar2 = p1kVar;
                                }
                                p1kVar2 = 0;
                            } else if (tags2.contains("assist")) {
                                o1k s3 = mha.s("assists", h);
                                if (s3 != null && (q3 = mha.q(h, 2, "points", "rebounds", "blocks", "steals")) != null) {
                                    p1kVar = new p1k(s3, (o1k) q3.get(0), (o1k) q3.get(1));
                                    p1kVar2 = p1kVar;
                                }
                                p1kVar2 = 0;
                            } else if (tags2.contains("points")) {
                                o1k s4 = mha.s("points", h);
                                if (s4 != null && (q2 = mha.q(h, 2, "rebounds", "assists", "blocks", "steals")) != null) {
                                    p1kVar = new p1k(s4, (o1k) q2.get(0), (o1k) q2.get(1));
                                    p1kVar2 = p1kVar;
                                }
                                p1kVar2 = 0;
                            } else {
                                if (tags2.contains("basic") && (q = mha.q(h, 3, "points", "rebounds", "assists", "steals")) != null) {
                                    p1kVar = new p1k((o1k) q.get(0), (o1k) q.get(1), (o1k) q.get(2));
                                    p1kVar2 = p1kVar;
                                }
                                p1kVar2 = 0;
                            }
                        } else {
                            context = context4;
                            player2 = player;
                            team2 = team;
                            mediaPost = mediaPost2;
                            p1kVar2 = playerEventStatistics;
                            event = event4;
                        }
                        if (p1kVar2 != 0) {
                            Context context5 = context;
                            Player player6 = player2;
                            int id3 = mediaPost.getId();
                            Team team6 = team2;
                            long createdAtTimestamp3 = mediaPost.getCreatedAtTimestamp();
                            bx7 F3 = uxf.F(event, context5, true, false, null, null, 60);
                            ux7 G2 = uxf.G(player6);
                            fy7 J2 = uxf.J(team6, context5, null, false, null, 30);
                            UniqueTournament uniqueTournament2 = event.getTournament().getUniqueTournament();
                            break;
                        }
                    }
                }
                break;
        }
        return null;
    }
}
