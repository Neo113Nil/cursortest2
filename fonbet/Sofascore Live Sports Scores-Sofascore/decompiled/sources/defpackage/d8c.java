package defpackage;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.PlayerSeasonRatingsResponse;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsResponse;
import com.sofascore.results.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d8c extends hoi implements et8 {
    public /* synthetic */ Team A;
    public final /* synthetic */ MediaPost B;
    public final /* synthetic */ ku3 C;
    public final /* synthetic */ u8c D;
    public String r;
    public av4 s;
    public PlayerSeasonStatisticsResponse t;
    public int u;
    public int v;
    public int w;
    public int x;
    public /* synthetic */ Event y;
    public /* synthetic */ Player z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8c(rq3 rq3Var, ku3 ku3Var, u8c u8cVar, MediaPost mediaPost) {
        super(4, rq3Var);
        this.B = mediaPost;
        this.C = ku3Var;
        this.D = u8cVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        d8c d8cVar = new d8c((rq3) obj4, this.C, this.D, this.B);
        d8cVar.y = (Event) obj;
        d8cVar.z = (Player) obj2;
        d8cVar.A = (Team) obj3;
        return d8cVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
    
        if (r1 == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0111  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String slug;
        MediaPost mediaPost;
        int i;
        int i2;
        int i3;
        String str;
        av4 av4Var;
        Context context;
        av4 t;
        Object w;
        lu3 lu3Var;
        PlayerSeasonStatisticsResponse playerSeasonStatisticsResponse;
        Object T;
        String str2;
        PlayerSeasonRatingsResponse playerSeasonRatingsResponse;
        Context context2;
        Pair pair;
        Pair pair2;
        u8c u8cVar = this.D;
        Context context3 = u8cVar.a;
        Event event = this.y;
        Player player = this.z;
        Team team = this.A;
        lu3 lu3Var2 = lu3.a;
        int i4 = this.x;
        MediaPost mediaPost2 = this.B;
        if (i4 == 0) {
            y6a.M(obj);
            Integer playerId = mediaPost2.getPlayerId();
            if (playerId != null) {
                int intValue = playerId.intValue();
                UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
                if (uniqueTournament != null) {
                    int id = uniqueTournament.getId();
                    Season season = event.getSeason();
                    if (season != null) {
                        int id2 = season.getId();
                        Sport sport = mediaPost2.getSport();
                        if (sport != null && (slug = sport.getSlug()) != null) {
                            String label = Season.SubSeasonType.OVERALL.getLabel();
                            mediaPost = mediaPost2;
                            i = intValue;
                            i2 = id;
                            i3 = id2;
                            str = slug;
                            av4Var = null;
                            c8c c8cVar = new c8c(u8cVar, i, i2, i3, label, null, 1);
                            ku3 ku3Var = this.C;
                            av4 t2 = xw3.t(ku3Var, null, c8cVar, 3);
                            context = context3;
                            t = xw3.t(ku3Var, null, new c8c(u8cVar, i, i2, i3, label, null, 0), 3);
                            this.y = event;
                            this.z = player;
                            this.A = team;
                            this.r = str;
                            this.s = t;
                            this.u = i;
                            this.v = i2;
                            this.w = i3;
                            this.x = 1;
                            w = t2.w(this);
                            lu3Var = lu3Var2;
                        }
                    }
                }
            }
            return null;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            playerSeasonStatisticsResponse = this.t;
            String str3 = this.r;
            y6a.M(obj);
            str2 = str3;
            mediaPost = mediaPost2;
            av4Var = null;
            context = context3;
            T = obj;
            playerSeasonRatingsResponse = (PlayerSeasonRatingsResponse) yaa.x((x2g) T);
            if (playerSeasonRatingsResponse != null) {
                return av4Var;
            }
            syg sygVar = new syg(player, CollectionsKt.M0(5, CollectionsKt.H0(playerSeasonRatingsResponse.getSeasonRatings(), new wpb(7))), playerSeasonStatisticsResponse.getStatistics().getRating(), playerSeasonStatisticsResponse.getTeam());
            List<String> tags = mediaPost.getTags();
            tags.getClass();
            if (tags.contains("exceptional")) {
                if (tags.contains(CampaignEx.JSON_KEY_STAR)) {
                    context2 = context;
                    pair2 = new Pair(context2.getString(R.string.football_solid_rating_streak_title), context2.getString(R.string.football_solid_rating_streak_body));
                } else {
                    context2 = context;
                    if (tags.contains("ratingHigh")) {
                        pair2 = new Pair(context2.getString(R.string.football_heating_up_title), context2.getString(R.string.football_heating_up_body));
                    } else if (tags.contains("ratingLow")) {
                        pair2 = new Pair(context2.getString(R.string.football_cold_streak_title), context2.getString(R.string.football_cold_streak_body));
                    } else {
                        pair = new Pair(av4Var, av4Var);
                    }
                }
                pair = pair2;
            } else {
                pair = new Pair(av4Var, av4Var);
                context2 = context;
            }
            return new gla(mediaPost.getId(), (String) pair.a, (String) pair.b, mediaPost.getCreatedAtTimestamp(), str2, uxf.F(event, context2, false, false, null, null, 62), uxf.G(player), uxf.J(team, context2, null, false, null, 30), sygVar, new x43((MediaReactionType) null, 0, 0, (Boolean) null, 31));
        }
        int i5 = this.w;
        int i6 = this.v;
        int i7 = this.u;
        t = this.s;
        String str4 = this.r;
        y6a.M(obj);
        mediaPost = mediaPost2;
        av4Var = null;
        i = i7;
        str = str4;
        context = context3;
        i3 = i5;
        i2 = i6;
        lu3Var = lu3Var2;
        w = obj;
        playerSeasonStatisticsResponse = (PlayerSeasonStatisticsResponse) yaa.x((x2g) w);
        if (playerSeasonStatisticsResponse == null) {
            return av4Var;
        }
        this.y = event;
        this.z = player;
        this.A = team;
        this.r = str;
        this.s = av4Var;
        this.t = playerSeasonStatisticsResponse;
        this.u = i;
        this.v = i2;
        this.w = i3;
        this.x = 2;
        T = t.T(this);
        if (T != lu3Var) {
            str2 = str;
            playerSeasonRatingsResponse = (PlayerSeasonRatingsResponse) yaa.x((x2g) T);
            if (playerSeasonRatingsResponse != null) {
            }
        }
        return lu3Var;
    }
}
