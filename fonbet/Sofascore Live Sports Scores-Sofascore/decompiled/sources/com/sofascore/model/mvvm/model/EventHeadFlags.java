package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.buzzer.BuzzerConfigResponseKt;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import defpackage.dmi;
import defpackage.vxd;
import defpackage.w1l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\bH\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003Jå\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0014\u0010I\u001a\u00020\u00032\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010K\u001a\u00020LHÖ\u0081\u0004J\n\u0010M\u001a\u00020NHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001c¨\u0006O"}, d2 = {"Lcom/sofascore/model/mvvm/model/EventHeadFlags;", "", "details", "", BuzzerConfigResponseKt.AI_INSIGHTS, "crowdsourcing", "additionalOdds", "additionalOddsComparison", "overs", "scorecard", U3.i.I0, TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "mmaStatistics", "lineups", "matches", "prematchLineups", "baseballPrematchLineups", "boxScore", "standings", "graphs", "cupTree", "games", "recommendedPrematchOdds", "commentary", "hockeyPlayByPlay", "<init>", "(ZZZZZZZZZZZZZZZZZZZZZZ)V", "getDetails", "()Z", "getAiInsights", "getCrowdsourcing", "getAdditionalOdds", "getAdditionalOddsComparison", "getOvers", "getScorecard", "getMedia", "getStatistics", "getMmaStatistics", "getLineups", "getMatches", "getPrematchLineups", "getBaseballPrematchLineups", "getBoxScore", "getStandings", "getGraphs", "getCupTree", "getGames", "getRecommendedPrematchOdds", "getCommentary", "getHockeyPlayByPlay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventHeadFlags {
    private final boolean additionalOdds;
    private final boolean additionalOddsComparison;
    private final boolean aiInsights;
    private final boolean baseballPrematchLineups;
    private final boolean boxScore;
    private final boolean commentary;
    private final boolean crowdsourcing;
    private final boolean cupTree;
    private final boolean details;
    private final boolean games;
    private final boolean graphs;
    private final boolean hockeyPlayByPlay;
    private final boolean lineups;
    private final boolean matches;
    private final boolean media;
    private final boolean mmaStatistics;
    private final boolean overs;
    private final boolean prematchLineups;
    private final boolean recommendedPrematchOdds;
    private final boolean scorecard;
    private final boolean standings;
    private final boolean statistics;

    public EventHeadFlags(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22) {
        this.details = z;
        this.aiInsights = z2;
        this.crowdsourcing = z3;
        this.additionalOdds = z4;
        this.additionalOddsComparison = z5;
        this.overs = z6;
        this.scorecard = z7;
        this.media = z8;
        this.statistics = z9;
        this.mmaStatistics = z10;
        this.lineups = z11;
        this.matches = z12;
        this.prematchLineups = z13;
        this.baseballPrematchLineups = z14;
        this.boxScore = z15;
        this.standings = z16;
        this.graphs = z17;
        this.cupTree = z18;
        this.games = z19;
        this.recommendedPrematchOdds = z20;
        this.commentary = z21;
        this.hockeyPlayByPlay = z22;
    }

    public static /* synthetic */ EventHeadFlags copy$default(EventHeadFlags eventHeadFlags, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, int i, Object obj) {
        boolean z23;
        boolean z24;
        boolean z25 = (i & 1) != 0 ? eventHeadFlags.details : z;
        boolean z26 = (i & 2) != 0 ? eventHeadFlags.aiInsights : z2;
        boolean z27 = (i & 4) != 0 ? eventHeadFlags.crowdsourcing : z3;
        boolean z28 = (i & 8) != 0 ? eventHeadFlags.additionalOdds : z4;
        boolean z29 = (i & 16) != 0 ? eventHeadFlags.additionalOddsComparison : z5;
        boolean z30 = (i & 32) != 0 ? eventHeadFlags.overs : z6;
        boolean z31 = (i & 64) != 0 ? eventHeadFlags.scorecard : z7;
        boolean z32 = (i & 128) != 0 ? eventHeadFlags.media : z8;
        boolean z33 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? eventHeadFlags.statistics : z9;
        boolean z34 = (i & 512) != 0 ? eventHeadFlags.mmaStatistics : z10;
        boolean z35 = (i & 1024) != 0 ? eventHeadFlags.lineups : z11;
        boolean z36 = (i & a.o) != 0 ? eventHeadFlags.matches : z12;
        boolean z37 = (i & 4096) != 0 ? eventHeadFlags.prematchLineups : z13;
        boolean z38 = (i & 8192) != 0 ? eventHeadFlags.baseballPrematchLineups : z14;
        boolean z39 = z25;
        boolean z40 = (i & 16384) != 0 ? eventHeadFlags.boxScore : z15;
        boolean z41 = (i & 32768) != 0 ? eventHeadFlags.standings : z16;
        boolean z42 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? eventHeadFlags.graphs : z17;
        boolean z43 = (i & 131072) != 0 ? eventHeadFlags.cupTree : z18;
        boolean z44 = (i & 262144) != 0 ? eventHeadFlags.games : z19;
        boolean z45 = (i & 524288) != 0 ? eventHeadFlags.recommendedPrematchOdds : z20;
        boolean z46 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? eventHeadFlags.commentary : z21;
        if ((i & 2097152) != 0) {
            z24 = z46;
            z23 = eventHeadFlags.hockeyPlayByPlay;
        } else {
            z23 = z22;
            z24 = z46;
        }
        return eventHeadFlags.copy(z39, z26, z27, z28, z29, z30, z31, z32, z33, z34, z35, z36, z37, z38, z40, z41, z42, z43, z44, z45, z24, z23);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDetails() {
        return this.details;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getMmaStatistics() {
        return this.mmaStatistics;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getLineups() {
        return this.lineups;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getMatches() {
        return this.matches;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getPrematchLineups() {
        return this.prematchLineups;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getBaseballPrematchLineups() {
        return this.baseballPrematchLineups;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getBoxScore() {
        return this.boxScore;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getStandings() {
        return this.standings;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getGraphs() {
        return this.graphs;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getCupTree() {
        return this.cupTree;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getGames() {
        return this.games;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAiInsights() {
        return this.aiInsights;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getRecommendedPrematchOdds() {
        return this.recommendedPrematchOdds;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getCommentary() {
        return this.commentary;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getHockeyPlayByPlay() {
        return this.hockeyPlayByPlay;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCrowdsourcing() {
        return this.crowdsourcing;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getAdditionalOdds() {
        return this.additionalOdds;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAdditionalOddsComparison() {
        return this.additionalOddsComparison;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getOvers() {
        return this.overs;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getScorecard() {
        return this.scorecard;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getMedia() {
        return this.media;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getStatistics() {
        return this.statistics;
    }

    @NotNull
    public final EventHeadFlags copy(boolean details, boolean aiInsights, boolean crowdsourcing, boolean additionalOdds, boolean additionalOddsComparison, boolean overs, boolean scorecard, boolean media, boolean statistics, boolean mmaStatistics, boolean lineups, boolean matches, boolean prematchLineups, boolean baseballPrematchLineups, boolean boxScore, boolean standings, boolean graphs, boolean cupTree, boolean games, boolean recommendedPrematchOdds, boolean commentary, boolean hockeyPlayByPlay) {
        return new EventHeadFlags(details, aiInsights, crowdsourcing, additionalOdds, additionalOddsComparison, overs, scorecard, media, statistics, mmaStatistics, lineups, matches, prematchLineups, baseballPrematchLineups, boxScore, standings, graphs, cupTree, games, recommendedPrematchOdds, commentary, hockeyPlayByPlay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventHeadFlags)) {
            return false;
        }
        EventHeadFlags eventHeadFlags = (EventHeadFlags) other;
        return this.details == eventHeadFlags.details && this.aiInsights == eventHeadFlags.aiInsights && this.crowdsourcing == eventHeadFlags.crowdsourcing && this.additionalOdds == eventHeadFlags.additionalOdds && this.additionalOddsComparison == eventHeadFlags.additionalOddsComparison && this.overs == eventHeadFlags.overs && this.scorecard == eventHeadFlags.scorecard && this.media == eventHeadFlags.media && this.statistics == eventHeadFlags.statistics && this.mmaStatistics == eventHeadFlags.mmaStatistics && this.lineups == eventHeadFlags.lineups && this.matches == eventHeadFlags.matches && this.prematchLineups == eventHeadFlags.prematchLineups && this.baseballPrematchLineups == eventHeadFlags.baseballPrematchLineups && this.boxScore == eventHeadFlags.boxScore && this.standings == eventHeadFlags.standings && this.graphs == eventHeadFlags.graphs && this.cupTree == eventHeadFlags.cupTree && this.games == eventHeadFlags.games && this.recommendedPrematchOdds == eventHeadFlags.recommendedPrematchOdds && this.commentary == eventHeadFlags.commentary && this.hockeyPlayByPlay == eventHeadFlags.hockeyPlayByPlay;
    }

    public final boolean getAdditionalOdds() {
        return this.additionalOdds;
    }

    public final boolean getAdditionalOddsComparison() {
        return this.additionalOddsComparison;
    }

    public final boolean getAiInsights() {
        return this.aiInsights;
    }

    public final boolean getBaseballPrematchLineups() {
        return this.baseballPrematchLineups;
    }

    public final boolean getBoxScore() {
        return this.boxScore;
    }

    public final boolean getCommentary() {
        return this.commentary;
    }

    public final boolean getCrowdsourcing() {
        return this.crowdsourcing;
    }

    public final boolean getCupTree() {
        return this.cupTree;
    }

    public final boolean getDetails() {
        return this.details;
    }

    public final boolean getGames() {
        return this.games;
    }

    public final boolean getGraphs() {
        return this.graphs;
    }

    public final boolean getHockeyPlayByPlay() {
        return this.hockeyPlayByPlay;
    }

    public final boolean getLineups() {
        return this.lineups;
    }

    public final boolean getMatches() {
        return this.matches;
    }

    public final boolean getMedia() {
        return this.media;
    }

    public final boolean getMmaStatistics() {
        return this.mmaStatistics;
    }

    public final boolean getOvers() {
        return this.overs;
    }

    public final boolean getPrematchLineups() {
        return this.prematchLineups;
    }

    public final boolean getRecommendedPrematchOdds() {
        return this.recommendedPrematchOdds;
    }

    public final boolean getScorecard() {
        return this.scorecard;
    }

    public final boolean getStandings() {
        return this.standings;
    }

    public final boolean getStatistics() {
        return this.statistics;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hockeyPlayByPlay) + dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(Boolean.hashCode(this.details) * 31, 31, this.aiInsights), 31, this.crowdsourcing), 31, this.additionalOdds), 31, this.additionalOddsComparison), 31, this.overs), 31, this.scorecard), 31, this.media), 31, this.statistics), 31, this.mmaStatistics), 31, this.lineups), 31, this.matches), 31, this.prematchLineups), 31, this.baseballPrematchLineups), 31, this.boxScore), 31, this.standings), 31, this.graphs), 31, this.cupTree), 31, this.games), 31, this.recommendedPrematchOdds), 31, this.commentary);
    }

    @NotNull
    public String toString() {
        boolean z = this.details;
        boolean z2 = this.aiInsights;
        boolean z3 = this.crowdsourcing;
        boolean z4 = this.additionalOdds;
        boolean z5 = this.additionalOddsComparison;
        boolean z6 = this.overs;
        boolean z7 = this.scorecard;
        boolean z8 = this.media;
        boolean z9 = this.statistics;
        boolean z10 = this.mmaStatistics;
        boolean z11 = this.lineups;
        boolean z12 = this.matches;
        boolean z13 = this.prematchLineups;
        boolean z14 = this.baseballPrematchLineups;
        boolean z15 = this.boxScore;
        boolean z16 = this.standings;
        boolean z17 = this.graphs;
        boolean z18 = this.cupTree;
        boolean z19 = this.games;
        boolean z20 = this.recommendedPrematchOdds;
        boolean z21 = this.commentary;
        boolean z22 = this.hockeyPlayByPlay;
        StringBuilder k = w1l.k("EventHeadFlags(details=", z, ", aiInsights=", z2, ", crowdsourcing=");
        vxd.t(", additionalOdds=", ", additionalOddsComparison=", k, z3, z4);
        vxd.t(", overs=", ", scorecard=", k, z5, z6);
        vxd.t(", media=", ", statistics=", k, z7, z8);
        vxd.t(", mmaStatistics=", ", lineups=", k, z9, z10);
        vxd.t(", matches=", ", prematchLineups=", k, z11, z12);
        vxd.t(", baseballPrematchLineups=", ", boxScore=", k, z13, z14);
        vxd.t(", standings=", ", graphs=", k, z15, z16);
        vxd.t(", cupTree=", ", games=", k, z17, z18);
        vxd.t(", recommendedPrematchOdds=", ", commentary=", k, z19, z20);
        return w1l.i(", hockeyPlayByPlay=", ")", k, z21, z22);
    }
}
