package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.mediaposts.MediaType;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class wdc {
    public static final Map a;

    static {
        Pair pair = new Pair(MediaType.SofascoreRating, b.j(b.j("exceptional", "ratingHigh"), b.j("exceptional", "ratingConsistent")));
        Pair pair2 = new Pair(MediaType.AttackMomentum, b.j(b.j("exceptional", "final"), b.j("exceptional", "winStopTime"), b.j("exceptional", "dominationNoGoal"), b.j("exceptional", "dominationLost"), b.j("exceptional", "domination"), b.j("exceptional", "incident"), b.j("exceptional", "winLastMinute"), b.j("exceptional", "comeback"), b.j("exceptional", "leadLost"), b.j("exceptional", "lead"), b.j("exceptional", "points")));
        Pair pair3 = new Pair(MediaType.PlayerHeatmap, b.j(b.j("exceptional", "defenseMoveFront"), b.j("exceptional", "middleRating"), b.j("exceptional", "middleTouch"), b.j("exceptional", "forwardRating"), b.j("exceptional", "forwardTouch")));
        Pair pair4 = new Pair(MediaType.PlayerShotmap, b.j(b.j("exceptional", "goal"), b.j("exceptional", "shotMiss"), b.j("exceptional", "shotOnTarget"), b.j("exceptional", "shot"), b.j("exceptional", "goalShot"), b.j("exceptional", "quarter"), b.j("exceptional", "secondHalf"), b.j("exceptional", "points"), b.j("exceptional", "firstHalf"), b.j("exceptional", "quarterGreat"), b.j("exceptional", "quarterSingle"), b.j("exceptional", "shotHigh"), b.j("exceptional", "shotLow"), b.j("exceptional", "centerScore"), b.j("exceptional", "shotPercentage")));
        Pair pair5 = new Pair(MediaType.MatchShotmap, b.j(b.j("exceptional", "goal"), b.j("exceptional", "shot"), b.j("exceptional", "shotOnTarget"), b.j("exceptional", "side"), b.j("exceptional", "twoPoint"), b.j("exceptional", "paint"), b.j("exceptional", "threePoint"), b.j("exceptional", "final"), b.j("exceptional", "shotMiss"), b.j("exceptional", "shotPercentage")));
        Pair pair6 = new Pair(MediaType.LastMatchesRating, b.j(b.j("exceptional", CampaignEx.JSON_KEY_STAR), b.j("exceptional", "ratingHigh"), b.j("exceptional", "ratingLow")));
        Pair pair7 = new Pair(MediaType.TripleDouble, b.j(b.j("exceptional", "full"), b.j("exceptional", "steal"), b.j("exceptional", "block"), b.j("exceptional", "assist"), b.j("exceptional", "points"), b.j("exceptional", "basic")));
        Pair pair8 = new Pair(MediaType.TennisPower, b.j(b.j("exceptional", "grandSlam"), b.j("exceptional", "davisCup"), b.j("exceptional", "billieJean"), b.j("exceptional", "comeback"), b.j("exceptional", "underdog"), b.j("exceptional", "tiebreak"), b.j("exceptional", "break"), b.j("exceptional", "comeUp"), b.j("exceptional", "set"), b.j("exceptional", "top10")));
        Pair pair9 = new Pair(MediaType.TournamentWinner, a.c(b.j("exceptional", "noLostSet")));
        MediaType mediaType = MediaType.EventPlayer;
        km5 km5Var = km5.a;
        a = tub.h(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(mediaType, km5Var), new Pair(MediaType.PlayerOfTheMatch, km5Var), new Pair(MediaType.Event, km5Var), new Pair(MediaType.SofaRating10, km5Var), new Pair(MediaType.VideoHighlight, km5Var), new Pair(MediaType.GroupPost, b.j(a.c("event"), a.c("roundHighlight"))), new Pair(MediaType.Custom, b.j(a.c(SearchResponseKt.PLAYER_ENTITY), a.c("team"), a.c(SearchResponseKt.MANAGER_ENTITY), a.c(SearchResponseKt.LEAGUE_ENTITY), a.c("simple"), a.c("stage"), a.c("featured"))), new Pair(MediaType.NewsArticle, km5Var), new Pair(MediaType.ExternalVideo, km5Var), new Pair(MediaType.InfluencerVideo, km5Var), new Pair(MediaType.YTShortVideo, a.c(a.c("youtube"))), new Pair(MediaType.RoundAnnouncement, km5Var), new Pair(MediaType.FunFacts, km5Var), new Pair(MediaType.RoundHighlights, km5Var), new Pair(MediaType.Lineups, km5Var), new Pair(MediaType.Announcement, b.j(a.c("event"), a.c(SearchResponseKt.LEAGUE_ENTITY), a.c("stage"))), new Pair(MediaType.GameLeader, b.j(a.c("passing"), a.c("rushing"), a.c("receiving"))));
    }
}
