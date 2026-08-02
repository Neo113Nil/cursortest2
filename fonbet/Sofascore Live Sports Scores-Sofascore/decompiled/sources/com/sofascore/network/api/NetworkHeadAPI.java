package com.sofascore.network.api;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.c2g;
import defpackage.iu8;
import defpackage.rq3;
import defpackage.s59;
import defpackage.vae;
import defpackage.wx4;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\bc\bf\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\rJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\rJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\rJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\rJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\rJ4\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0016\u0010\nJ4\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0017\u0010\nJ4\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\rJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u001d\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\u001fJ4\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b \u0010\nJ*\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b!\u0010\u001fJ*\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010\u001fJ>\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010#\u001a\u00020\u0002H§@¢\u0006\u0004\b$\u0010%J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b&\u0010\u001fJ \u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b'\u0010\rJ4\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b(\u0010\nJ \u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010\rJ*\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b*\u0010\u001fJ4\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010#\u001a\u00020\u0002H§@¢\u0006\u0004\b+\u0010,J>\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010#\u001a\u00020\u0002H§@¢\u0006\u0004\b-\u0010%J4\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010#\u001a\u00020\u0002H§@¢\u0006\u0004\b.\u0010,J \u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b/\u0010\rJ4\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020\u0005H§@¢\u0006\u0004\b1\u0010\nJ4\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00102\u001a\u00020\u00052\b\b\u0001\u00103\u001a\u00020\u0005H§@¢\u0006\u0004\b4\u00105J \u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b6\u0010\rJ \u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u00107\u001a\u00020\u0002H§@¢\u0006\u0004\b8\u0010\rJ*\u0010:\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u00109\u001a\u00020\u0002H§@¢\u0006\u0004\b:\u0010\u001fJ*\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010;\u001a\u00020\u0005H§@¢\u0006\u0004\b<\u0010=J*\u0010?\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010>\u001a\u00020\u00022\b\b\u0001\u00109\u001a\u00020\u0002H§@¢\u0006\u0004\b?\u0010\u001fJ*\u0010@\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010>\u001a\u00020\u00022\b\b\u0001\u00109\u001a\u00020\u0002H§@¢\u0006\u0004\b@\u0010\u001fJ*\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010A\u001a\u00020\u0005H§@¢\u0006\u0004\bB\u0010=J*\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u00109\u001a\u00020\u0002H§@¢\u0006\u0004\bC\u0010\u001fJ*\u0010D\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010A\u001a\u00020\u00052\b\b\u0001\u00109\u001a\u00020\u0002H§@¢\u0006\u0004\bD\u0010EJ*\u0010G\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010F\u001a\u00020\u00022\b\b\u0001\u00109\u001a\u00020\u0002H§@¢\u0006\u0004\bG\u0010\u001fJ \u0010H\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\bH\u0010\rJ*\u0010I\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\bI\u0010=J \u0010J\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\bJ\u0010\rJ>\u0010K\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\bK\u0010LJ4\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010M\u001a\u00020\u00052\b\b\u0001\u0010#\u001a\u00020\u0002H§@¢\u0006\u0004\bN\u0010,J>\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010M\u001a\u00020\u00052\b\b\u0001\u0010#\u001a\u00020\u0002H§@¢\u0006\u0004\bN\u0010OJ \u0010P\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\bP\u0010\rJ \u0010Q\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\bQ\u0010\rJ \u0010R\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\bR\u0010\rJ*\u0010S\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\bS\u0010\u001fJ \u0010T\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\bT\u0010\rJ \u0010U\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\bU\u0010\rJ*\u0010W\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010V\u001a\u00020\u0005H§@¢\u0006\u0004\bW\u0010=J \u0010X\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010>\u001a\u00020\u0002H§@¢\u0006\u0004\bX\u0010\rJ \u0010Y\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\bY\u0010\rJ \u0010Z\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\bZ\u0010\rJ \u0010\\\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010[\u001a\u00020\u0002H§@¢\u0006\u0004\b\\\u0010\rJ \u0010]\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010[\u001a\u00020\u0002H§@¢\u0006\u0004\b]\u0010\rJ \u0010^\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\b^\u0010\rJ \u0010_\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\b_\u0010\rJ \u0010`\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b`\u0010\rJ \u0010b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010a\u001a\u00020\u0005H§@¢\u0006\u0004\bb\u0010cJ*\u0010d\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\bd\u0010\u001fJ*\u0010e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\be\u0010\u001fJ*\u0010f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\bf\u0010\u001fJ*\u0010g\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\bg\u0010\u001fJ \u0010h\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\bh\u0010\rJ*\u0010j\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010i\u001a\u00020\u0005H§@¢\u0006\u0004\bj\u0010=¨\u0006kÀ\u0006\u0003"}, d2 = {"Lcom/sofascore/network/api/NetworkHeadAPI;", "", "", "uniqueTournamentId", "seasonId", "", "type", "Lc2g;", "", "hasLeagueTopTeams", "(IILjava/lang/String;Lrq3;)Ljava/lang/Object;", "id", "hasEventIncidents", "(ILrq3;)Ljava/lang/Object;", "hasEventLineups", "hasHighlights", "hasSportRadarLiveMatchTracker", "hasOptaLiveActionWidget", "hasPlayerHighlights", "hasStageHighlights", "hasStageDriverPerformance", "hasEventStatistics", "hasLeagueTopPlayers", "hasLeagueTopStats", "tournamentId", "teamId", "hasPerformanceGraphData", "(IIILrq3;)Ljava/lang/Object;", "hasMmaOrganisationRanking", "uniqueId", "hasPowerRankingRounds", "(IILrq3;)Ljava/lang/Object;", "hasStandings", "hasTournamentPlayerStatisticsTypes", "hasTournamentTeamStatisticsTypes", "page", "hasTournamentSeasonEvents", "(IILjava/lang/String;ILrq3;)Ljava/lang/Object;", "hasUniqueCupTree", "hasEventESportGames", "hasUniqueStandings", "hasEventInnings", "hasUniqueTournamentRounds", "hasUniqueTournamentMainEvents", "(ILjava/lang/String;ILrq3;)Ljava/lang/Object;", "hasUniqueTournamentSeasonEvents", "hasUniqueTournamentEvents", "hasTweets", "mmaEventType", "hasMmaFightNightEvents", "weightClass", InneractiveMediationDefs.KEY_GENDER, "hasMMARankingByWeight", "(ILjava/lang/String;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "hasTeamRankingOld", "rankingId", "hasRankings", "providerId", "hasBetBoost", "languageCode", "hasAllCommentary", "(ILjava/lang/String;Lrq3;)Ljava/lang/Object;", "eventId", "hasAllOdds", "hasEventFeaturedOdds", "sportSlug", "hasDroppingOdds", "hasRecommendedPrematchOdds", "hasRecommendedPrematchTopVotedOdds", "(Ljava/lang/String;ILrq3;)Ljava/lang/Object;", "stageId", "hasStageAllOdds", "hasTeamCareerStatistics", "hasTeamStatisticsSeasons", "hasTeamStandingsSeasons", "hasTeamTopPlayers", "(IIILjava/lang/String;Lrq3;)Ljava/lang/Object;", TtmlNode.TAG_SPAN, "hasTeamEventList", "(ILjava/lang/String;Ljava/lang/String;ILrq3;)Ljava/lang/Object;", "hasDriverStageSeasons", "hasDriverCareerHistory", "hasTeamTransfers", "hasCupTree", "hasEventTweets", "hasTeamTweets", "alpha2code", "hasEventWscStories", "hasEventNews", "hasEventAiInsights", "hasEventAiInsightsPostMatch", "playerId", "hasPlayerNews", "hasPlayerVideos", "hasTeamNews", "hasTeamVideos", "hasLeagueTransactions", "deviceId", "hasSofaSeason", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "hasUniqueTournamentDraftInfo", "hasUniqueTournamentChampions", "hasUniqueTournamentIndividualAwards", "hasUniqueTournamentTeamOfThePeriodAwarded", "hasTeamSquad", "monthYear", "hasTeamEventsByMonth", "network_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface NetworkHeadAPI {
    @s59("api/v1/event/{id}/comments/{languageCode}")
    @Nullable
    Object hasAllCommentary(@vae("id") int i, @NotNull @vae("languageCode") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/event/{id}/odds/{providerId}/all")
    @Nullable
    Object hasAllOdds(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{id}/odds/{providerId}/boost")
    @Nullable
    Object hasBetBoost(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{tid}/season/{sid}/cuptrees")
    @Nullable
    Object hasCupTree(@vae("tid") int i, @vae("sid") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/team/{id}/driver-career-history")
    @Nullable
    Object hasDriverCareerHistory(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/team/{id}/stage-seasons")
    @Nullable
    Object hasDriverStageSeasons(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("/api/v1/odds/{id}/dropping/{sportSlug}")
    @Nullable
    Object hasDroppingOdds(@vae("id") int i, @NotNull @vae("sportSlug") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{eventId}/ai-insights/en")
    @Nullable
    Object hasEventAiInsights(@vae("eventId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{eventId}/ai-insights-postmatch/en")
    @Nullable
    Object hasEventAiInsightsPostMatch(@vae("eventId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{id}/esports-games")
    @Nullable
    Object hasEventESportGames(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{id}/odds/{providerId}/featured")
    @Nullable
    Object hasEventFeaturedOdds(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{eventId}/incidents")
    @Nullable
    Object hasEventIncidents(@vae("eventId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("/api/v1/event/{id}/innings")
    @Nullable
    Object hasEventInnings(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{eventId}/lineups")
    @Nullable
    Object hasEventLineups(@vae("eventId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{eventId}/media/news")
    @Nullable
    Object hasEventNews(@vae("eventId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("/api/v1/event/{id}/statistics")
    @Nullable
    Object hasEventStatistics(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{eventId}/official-tweets")
    @Nullable
    Object hasEventTweets(@vae("eventId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{eventId}/sport-video-highlights/country/{alpha2code}/extended")
    @Nullable
    Object hasEventWscStories(@vae("eventId") int i, @NotNull @vae("alpha2code") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{eventId}/highlights")
    @Nullable
    Object hasHighlights(@vae("eventId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{sid}/top-players/{type}")
    @Nullable
    Object hasLeagueTopPlayers(@vae("id") int i, @vae("sid") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{sid}/top-players-per-game/all/{type}")
    @Nullable
    Object hasLeagueTopStats(@vae("id") int i, @vae("sid") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{sid}/top-teams/{type}")
    @Nullable
    Object hasLeagueTopTeams(@vae("id") int i, @vae("sid") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/player-transfer-history/all/0")
    @Nullable
    Object hasLeagueTransactions(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/rankings/unique-tournament/{uniqueTournamentId}/{weightClass}/{gender}")
    @Nullable
    Object hasMMARankingByWeight(@vae("uniqueTournamentId") int i, @NotNull @vae("weightClass") String str, @NotNull @vae("gender") String str2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{uid}/tournament/{tid}/mma-events/{type}")
    @Nullable
    Object hasMmaFightNightEvents(@vae("uid") int i, @vae("tid") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/rankings/unique-tournament/{id}/summary")
    @Nullable
    Object hasMmaOrganisationRanking(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{id}/live-action-widget")
    @Nullable
    Object hasOptaLiveActionWidget(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{seasonId}/team/{teamId}/team-performance-graph-data")
    @Nullable
    Object hasPerformanceGraphData(@vae("id") int i, @vae("seasonId") int i2, @vae("teamId") int i3, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/player/{playerId}/media")
    @Nullable
    Object hasPlayerHighlights(@vae("playerId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/player/{playerId}/media/news")
    @Nullable
    Object hasPlayerNews(@vae("playerId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/player/{playerId}/media/videos")
    @Nullable
    Object hasPlayerVideos(@vae("playerId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{sid}/power-rankings/rounds")
    @Nullable
    Object hasPowerRankingRounds(@vae("id") int i, @vae("sid") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/rankings/{rankingId}")
    @Nullable
    Object hasRankings(@vae("rankingId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/odds/{providerId}/recommended-prematch/tournament/{tournamentId}")
    @Nullable
    Object hasRecommendedPrematchOdds(@vae("tournamentId") int i, @vae("providerId") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/odds/{providerId}/recommended-prematch-top-voted/sport/{sportSlug}")
    @Nullable
    Object hasRecommendedPrematchTopVotedOdds(@NotNull @vae("sportSlug") String str, @vae("providerId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/sofa-season/2025/{deviceId}")
    @Nullable
    Object hasSofaSeason(@NotNull @vae("deviceId") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{id}/live-match-tracker")
    @Nullable
    Object hasSportRadarLiveMatchTracker(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/odds/stage/{id}/provider/{providerId}/all")
    @Nullable
    Object hasStageAllOdds(@vae("id") int i, @vae("providerId") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/stage/{stageId}/driver-performance")
    @Nullable
    Object hasStageDriverPerformance(@vae("stageId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/stage/{stageId}/highlights")
    @Nullable
    Object hasStageHighlights(@vae("stageId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/tournament/{id}/season/{seasonId}/standings/{type}")
    @Nullable
    Object hasStandings(@vae("id") int i, @vae("seasonId") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/team/{id}/career-statistics")
    @Nullable
    Object hasTeamCareerStatistics(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("/api/v1/team/{id}/events/{span}/{page}")
    @Nullable
    Object hasTeamEventList(@vae("id") int i, @NotNull @vae("span") String str, @vae("page") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("/api/v1/team/{id}/events/{type}/{span}/{page}")
    @Nullable
    Object hasTeamEventList(@vae("id") int i, @NotNull @vae("type") String str, @NotNull @vae("span") String str2, @vae("page") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("/api/v1/team/{id}/events/{monthYear}")
    @Nullable
    Object hasTeamEventsByMonth(@vae("id") int i, @NotNull @vae("monthYear") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/team/{teamId}/media/news")
    @Nullable
    Object hasTeamNews(@vae("teamId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/rankings/type/{type}")
    @wx4
    @Nullable
    Object hasTeamRankingOld(@vae("type") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/team/{id}/players")
    @Nullable
    Object hasTeamSquad(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/team/{id}/standings/seasons")
    @Nullable
    Object hasTeamStandingsSeasons(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/team/{id}/{type}-statistics/seasons")
    @Nullable
    Object hasTeamStatisticsSeasons(@vae("id") int i, @NotNull @vae("type") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/team/{id}/unique-tournament/{tid}/season/{sid}/top-players/{type}")
    @Nullable
    Object hasTeamTopPlayers(@vae("id") int i, @vae("tid") int i2, @vae("sid") int i3, @NotNull @vae("type") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @iu8("api/v1/team/{id}/transfers")
    @Nullable
    Object hasTeamTransfers(@vae("id") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/team/{teamId}/official-tweets")
    @Nullable
    Object hasTeamTweets(@vae("teamId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/team/{teamId}/media/videos")
    @Nullable
    Object hasTeamVideos(@vae("teamId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{sid}/player-statistics/types")
    @Nullable
    Object hasTournamentPlayerStatisticsTypes(@vae("id") int i, @vae("sid") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/tournament/{id}/season/{seasonId}/events/{span}/{page}")
    @Nullable
    Object hasTournamentSeasonEvents(@vae("id") int i, @vae("seasonId") int i2, @NotNull @vae("span") String str, @vae("page") int i3, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{sid}/team-statistics/types")
    @Nullable
    Object hasTournamentTeamStatisticsTypes(@vae("id") int i, @vae("sid") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/event/{eventId}/tweets")
    @Nullable
    Object hasTweets(@vae("eventId") int i, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{tid}/season/{sid}/cuptrees")
    @Nullable
    Object hasUniqueCupTree(@vae("tid") int i, @vae("sid") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{seasonId}/standings/{type}")
    @Nullable
    Object hasUniqueStandings(@vae("id") int i, @vae("seasonId") int i2, @NotNull @vae("type") String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{seasonId}/champions")
    @Nullable
    Object hasUniqueTournamentChampions(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{unique_tournament_id}/season/{season_id}/draft")
    @Nullable
    Object hasUniqueTournamentDraftInfo(@vae("unique_tournament_id") int i, @vae("season_id") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/events/{span}/{page}")
    @Nullable
    Object hasUniqueTournamentEvents(@vae("id") int i, @NotNull @vae("span") String str, @vae("page") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{seasonId}/individual-awards")
    @Nullable
    Object hasUniqueTournamentIndividualAwards(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/main-events/{span}/{page}")
    @Nullable
    Object hasUniqueTournamentMainEvents(@vae("id") int i, @NotNull @vae("span") String str, @vae("page") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{seasonId}/rounds")
    @Nullable
    Object hasUniqueTournamentRounds(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{seasonId}/events/{span}/{page}")
    @Nullable
    Object hasUniqueTournamentSeasonEvents(@vae("id") int i, @vae("seasonId") int i2, @NotNull @vae("span") String str, @vae("page") int i3, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @s59("api/v1/unique-tournament/{id}/season/{seasonId}/team-of-the-period/periods/awarded")
    @Nullable
    Object hasUniqueTournamentTeamOfThePeriodAwarded(@vae("id") int i, @vae("seasonId") int i2, @NotNull rq3<? super c2g<Unit>> rq3Var);
}
