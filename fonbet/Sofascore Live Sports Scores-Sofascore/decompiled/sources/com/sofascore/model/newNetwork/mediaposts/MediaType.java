package com.sofascore.model.newNetwork.mediaposts;

import com.appsflyer.sdk_base.referrer.Payload;
import com.sofascore.model.buzzer.BuzzerConfigResponseKt;
import com.sofascore.model.network.response.MediaHighlightedItemResponseKt;
import defpackage.b1c;
import defpackage.fga;
import defpackage.gz8;
import defpackage.joa;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = MediaTypeSerializer.class)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\u0081\u0002\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006'"}, d2 = {"Lcom/sofascore/model/newNetwork/mediaposts/MediaType;", "", "requestType", "", "isStackable", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getRequestType", "()Ljava/lang/String;", "()Z", "TripleDouble", "TournamentWinner", "MatchShotmap", "PlayerShotmap", "EventPlayer", "AttackMomentum", "SofascoreRating", "PlayerHeatmap", "Event", "SofaRating10", "LastMatchesRating", "BestPlayer", "VideoHighlight", "TennisPower", "ExternalVideo", "NewsArticle", "PlayerOfTheMatch", "GroupPost", "YTShortVideo", "RoundAnnouncement", "FunFacts", "Lineups", "Custom", "RoundHighlights", "Announcement", "InfluencerVideo", "GameLeader", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ MediaType[] $VALUES;

    @NotNull
    private static final joa $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final boolean isStackable;

    @NotNull
    private final String requestType;

    @fga(names = {"tripleDouble", "tripledouble"})
    public static final MediaType TripleDouble = new MediaType("TripleDouble", 0, "tripleDouble", true);

    @q5h("tournamentWinner")
    public static final MediaType TournamentWinner = new MediaType("TournamentWinner", 1, "tournamentWinner", true);

    @fga(names = {"matchShotMap", "matchshotmap"})
    public static final MediaType MatchShotmap = new MediaType("MatchShotmap", 2, "matchShotMap", true);

    @fga(names = {"playerShotMap", "playershotmap"})
    public static final MediaType PlayerShotmap = new MediaType("PlayerShotmap", 3, "playerShotMap", true);

    @fga(names = {"eventPlayer", "eventplayer"})
    public static final MediaType EventPlayer = new MediaType("EventPlayer", 4, "eventPlayer", true);

    @fga(names = {"attackMomentum", "attackmomentum"})
    public static final MediaType AttackMomentum = new MediaType("AttackMomentum", 5, "attackMomentum", true);

    @fga(names = {BuzzerConfigResponseKt.SOFASCORE_RATING, "sofascorerating"})
    public static final MediaType SofascoreRating = new MediaType("SofascoreRating", 6, BuzzerConfigResponseKt.SOFASCORE_RATING, true);

    @fga(names = {"playerHeatMap", "playerheatmap"})
    public static final MediaType PlayerHeatmap = new MediaType("PlayerHeatmap", 7, "playerHeatMap", true);

    @q5h("event")
    public static final MediaType Event = new MediaType("Event", 8, "event", true);

    @fga(names = {"sofaRating", "sofarating"})
    public static final MediaType SofaRating10 = new MediaType("SofaRating10", 9, "sofaRating", true);

    @fga(names = {"lastMatchesRating", "lastmatchesrating"})
    public static final MediaType LastMatchesRating = new MediaType("LastMatchesRating", 10, "lastMatchesRating", false);

    @fga(names = {"bestPlayer", "bestplayer"})
    public static final MediaType BestPlayer = new MediaType("BestPlayer", 11, "bestPlayer", true);

    @fga(names = {"videoHighlight", "videohighlight"})
    public static final MediaType VideoHighlight = new MediaType("VideoHighlight", 12, "videoHighlight", false);

    @q5h("tennisPower")
    public static final MediaType TennisPower = new MediaType("TennisPower", 13, "tennisPower", true);

    @q5h("externalVideo")
    public static final MediaType ExternalVideo = new MediaType("ExternalVideo", 14, "externalVideo", false);

    @q5h(MediaHighlightedItemResponseKt.NEWS_ARTICLE)
    public static final MediaType NewsArticle = new MediaType("NewsArticle", 15, MediaHighlightedItemResponseKt.NEWS_ARTICLE, false);

    @q5h("potm")
    public static final MediaType PlayerOfTheMatch = new MediaType("PlayerOfTheMatch", 16, "potm", false);

    @q5h("postsGroup")
    public static final MediaType GroupPost = new MediaType("GroupPost", 17, "postsGroup", false);

    @q5h("youtubeShorts")
    public static final MediaType YTShortVideo = new MediaType("YTShortVideo", 18, "youtubeShorts", false);

    @q5h("roundAnnouncement")
    public static final MediaType RoundAnnouncement = new MediaType("RoundAnnouncement", 19, "roundAnnouncement", false);

    @q5h("funFacts")
    public static final MediaType FunFacts = new MediaType("FunFacts", 20, "funFacts", false);

    @q5h("lineups")
    public static final MediaType Lineups = new MediaType("Lineups", 21, "lineups", false);

    @q5h(Payload.CUSTOM)
    public static final MediaType Custom = new MediaType("Custom", 22, Payload.CUSTOM, false);

    @q5h("roundHighlights")
    public static final MediaType RoundHighlights = new MediaType("RoundHighlights", 23, "roundHighlights", false);

    @q5h("announcement")
    public static final MediaType Announcement = new MediaType("Announcement", 24, "announcement", false);

    @q5h("influencerVideo")
    public static final MediaType InfluencerVideo = new MediaType("InfluencerVideo", 25, "influencerVideo", false);

    @q5h("gameLeader")
    public static final MediaType GameLeader = new MediaType("GameLeader", 26, "gameLeader", true);

    private static final /* synthetic */ MediaType[] $values() {
        return new MediaType[]{TripleDouble, TournamentWinner, MatchShotmap, PlayerShotmap, EventPlayer, AttackMomentum, SofascoreRating, PlayerHeatmap, Event, SofaRating10, LastMatchesRating, BestPlayer, VideoHighlight, TennisPower, ExternalVideo, NewsArticle, PlayerOfTheMatch, GroupPost, YTShortVideo, RoundAnnouncement, FunFacts, Lineups, Custom, RoundHighlights, Announcement, InfluencerVideo, GameLeader};
    }

    static {
        MediaType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = ypa.a(ysa.b, new b1c(9));
    }

    private MediaType(String str, int i, String str2, boolean z) {
        this.requestType = str2;
        this.isStackable = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new MediaTypeSerializer();
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static MediaType valueOf(String str) {
        return (MediaType) Enum.valueOf(MediaType.class, str);
    }

    public static MediaType[] values() {
        return (MediaType[]) $VALUES.clone();
    }

    @NotNull
    public final String getRequestType() {
        return this.requestType;
    }

    /* renamed from: isStackable, reason: from getter */
    public final boolean getIsStackable() {
        return this.isStackable;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/mediaposts/MediaType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/mediaposts/MediaType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) MediaType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }
}
