package defpackage;

import android.content.Context;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatisticsResponse;
import com.sofascore.model.newNetwork.PlayerHeatmapResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class n8c extends hoi implements et8 {
    public /* synthetic */ Player A;
    public /* synthetic */ Team B;
    public final /* synthetic */ MediaPost C;
    public final /* synthetic */ ku3 D;
    public final /* synthetic */ u8c E;
    public av4 r;
    public List s;
    public String t;
    public String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public /* synthetic */ Event z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8c(rq3 rq3Var, ku3 ku3Var, u8c u8cVar, MediaPost mediaPost) {
        super(4, rq3Var);
        this.C = mediaPost;
        this.D = ku3Var;
        this.E = u8cVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        n8c n8cVar = new n8c((rq3) obj4, this.D, this.E, this.C);
        n8cVar.z = (Event) obj;
        n8cVar.A = (Player) obj2;
        n8cVar.B = (Team) obj3;
        return n8cVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01b4  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [av4, com.sofascore.model.mvvm.model.TeamSides, java.lang.Object] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int intValue;
        ?? r1;
        Object w;
        av4 av4Var;
        int i;
        List<Point2D> heatmap;
        Integer num;
        Pair pair;
        Pair pair2;
        int i2;
        Object T;
        String str;
        String str2;
        List<Point2D> list;
        int i3;
        PlayerEventStatistics playerEventStatistics;
        Sport sport;
        String slug;
        u8c u8cVar = this.E;
        Context context = u8cVar.a;
        Event event = this.z;
        Player player = this.A;
        Team team = this.B;
        lu3 lu3Var = lu3.a;
        int i4 = this.y;
        int i5 = 1;
        MediaPost mediaPost = this.C;
        if (i4 == 0) {
            y6a.M(obj);
            Integer playerId = mediaPost.getPlayerId();
            if (playerId != null) {
                int intValue2 = playerId.intValue();
                Integer eventId = mediaPost.getEventId();
                if (eventId != null) {
                    intValue = eventId.intValue();
                    y7c y7cVar = new y7c(u8cVar, intValue, intValue2, null, 3);
                    ku3 ku3Var = this.D;
                    av4 t = xw3.t(ku3Var, null, y7cVar, 3);
                    r1 = 0;
                    av4 t2 = xw3.t(ku3Var, null, new y7c(u8cVar, intValue, intValue2, null, 4), 3);
                    this.z = event;
                    this.A = player;
                    this.B = team;
                    this.r = t2;
                    this.v = intValue2;
                    this.w = intValue;
                    i5 = 1;
                    this.y = 1;
                    w = t.w(this);
                    if (w != lu3Var) {
                        av4Var = t2;
                        i = intValue2;
                    }
                    return lu3Var;
                }
            }
            return null;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = this.x;
            String str3 = this.u;
            String str4 = this.t;
            List<Point2D> list2 = this.s;
            y6a.M(obj);
            i3 = i6;
            str = str3;
            str2 = str4;
            playerEventStatistics = null;
            i2 = 2;
            list = list2;
            T = obj;
            PlayerEventStatisticsResponse playerEventStatisticsResponse = (PlayerEventStatisticsResponse) yaa.x((x2g) T);
            PlayerEventStatistics statistics = playerEventStatisticsResponse == null ? playerEventStatisticsResponse.getStatistics() : playerEventStatistics;
            int id = mediaPost.getId();
            long createdAtTimestamp = mediaPost.getCreatedAtTimestamp();
            sport = mediaPost.getSport();
            if (sport == null && (slug = sport.getSlug()) != null) {
                return new sre(id, str2, str, createdAtTimestamp, uxf.F(event, context, true, false, null, null, 60), slug, uxf.G(player), uxf.J(team, context, null, false, null, 30), l6g.W(list), i3 != 0 ? 1 : i2, statistics != null ? statistics.getRating() : playerEventStatistics, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
            }
        }
        int i7 = this.w;
        i = this.v;
        av4 av4Var2 = this.r;
        y6a.M(obj);
        av4Var = av4Var2;
        intValue = i7;
        r1 = 0;
        w = obj;
        PlayerHeatmapResponse playerHeatmapResponse = (PlayerHeatmapResponse) w;
        if (playerHeatmapResponse == null || (heatmap = playerHeatmapResponse.getHeatmap()) == null) {
            return r1;
        }
        int id2 = Event.getHomeTeam$default(event, r1, i5, r1).getId();
        Integer teamId = mediaPost.getTeamId();
        if (teamId == null) {
            Team team2 = player.getTeam();
            num = team2 != null ? new Integer(team2.getId()) : r1;
        } else {
            num = teamId;
        }
        int i8 = (num != null && id2 == num.intValue()) ? i5 : 0;
        List<String> tags = mediaPost.getTags();
        tags.getClass();
        if (!tags.contains("exceptional")) {
            pair = new Pair(r1, r1);
        } else if (tags.contains("defenseMoveFront")) {
            pair = new Pair(context.getString(R.string.football_defensive_offence_title), context.getString(R.string.football_defensive_offence_body));
        } else {
            if (tags.contains("middleRating")) {
                pair2 = new Pair(context.getString(R.string.football_mid_solid_performance_title), context.getString(R.string.football_mid_solid_performance_body));
            } else if (tags.contains("middleTouch")) {
                pair2 = new Pair(context.getString(R.string.football_mid_high_touch_low_rating_title), context.getString(R.string.football_mid_high_touch_low_rating_body));
            } else if (tags.contains("forwardRating")) {
                pair2 = new Pair(context.getString(R.string.football_attacker_high_rating_high_touches_title), context.getString(R.string.football_attacker_high_rating_high_touches_body));
            } else if (tags.contains("forwardTouch")) {
                pair2 = new Pair(context.getString(R.string.football_attacker_low_rating_high_touches_title), context.getString(R.string.football_attacker_low_rating_high_touches_body));
            } else {
                pair = new Pair(r1, r1);
            }
            pair = pair2;
        }
        String str5 = (String) pair.a;
        String str6 = (String) pair.b;
        this.z = event;
        this.A = player;
        this.B = team;
        this.r = r1;
        this.s = heatmap;
        this.t = str5;
        this.u = str6;
        this.v = i;
        this.w = intValue;
        this.x = i8;
        i2 = 2;
        this.y = 2;
        T = av4Var.T(this);
        if (T != lu3Var) {
            str = str6;
            str2 = str5;
            list = heatmap;
            i3 = i8;
            playerEventStatistics = r1;
            PlayerEventStatisticsResponse playerEventStatisticsResponse2 = (PlayerEventStatisticsResponse) yaa.x((x2g) T);
            if (playerEventStatisticsResponse2 == null) {
            }
            int id3 = mediaPost.getId();
            long createdAtTimestamp2 = mediaPost.getCreatedAtTimestamp();
            sport = mediaPost.getSport();
            return sport == null ? playerEventStatistics : playerEventStatistics;
        }
        return lu3Var;
    }
}
