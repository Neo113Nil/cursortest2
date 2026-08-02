package com.sports.insider.data.room.general.table.predictions;

import androidx.annotation.Keep;
import j$.time.Instant;
import kc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b@\b\u0081\b\u0018\u0000 \u0089\u00012\u00020\u0001:\u0002\u008a\u0001B\u0081\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0017¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020 H\u0017¢\u0006\u0004\b(\u0010\"J\u000f\u0010)\u001a\u00020\u0007H\u0017¢\u0006\u0004\b)\u0010'J\u000f\u0010*\u001a\u00020\u0007H\u0017¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010,J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010,J\u0012\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b1\u0010'J\u0012\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b2\u0010'J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010,J\u0012\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b4\u0010'J\u0012\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b5\u0010'J\u0012\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b6\u0010'J\u0012\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b7\u0010'J\u0012\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b8\u0010'J\u0012\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b9\u0010'J\u0012\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b:\u0010'J\u0012\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b;\u0010'J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010=J\u0012\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b?\u0010'J\u0012\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b@\u0010'J\u0012\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bA\u0010'J\u0012\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bB\u0010'J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010=J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010=J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010=J\u0012\u0010F\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bF\u0010=J¾\u0002\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bI\u0010'J\u0010\u0010J\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bJ\u0010,J\u001a\u0010M\u001a\u00020 2\b\u0010L\u001a\u0004\u0018\u00010KHÖ\u0003¢\u0006\u0004\bM\u0010NR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010RR\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010O\u001a\u0004\bS\u0010,\"\u0004\bT\u0010RR\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010O\u001a\u0004\bU\u0010,\"\u0004\bV\u0010RR\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010O\u001a\u0004\bW\u0010,\"\u0004\bX\u0010RR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010Y\u001a\u0004\bZ\u0010'\"\u0004\b[\u0010\\R$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010Y\u001a\u0004\b]\u0010'\"\u0004\b^\u0010\\R$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010Y\u001a\u0004\b_\u0010'\"\u0004\b`\u0010\\R\"\u0010\u000b\u001a\u00020\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010O\u001a\u0004\ba\u0010,\"\u0004\bb\u0010RR$\u0010\f\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010Y\u001a\u0004\bc\u0010'\"\u0004\bd\u0010\\R$\u0010\r\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010Y\u001a\u0004\be\u0010'\"\u0004\bf\u0010\\R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010Y\u001a\u0004\bg\u0010'\"\u0004\bh\u0010\\R$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010Y\u001a\u0004\bi\u0010'\"\u0004\bj\u0010\\R$\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010Y\u001a\u0004\bk\u0010'\"\u0004\bl\u0010\\R$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010Y\u001a\u0004\bm\u0010'\"\u0004\bn\u0010\\R$\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010Y\u001a\u0004\bo\u0010'\"\u0004\bp\u0010\\R$\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010Y\u001a\u0004\bq\u0010'\"\u0004\br\u0010\\R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010s\u001a\u0004\bt\u0010=\"\u0004\bu\u0010vR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010s\u001a\u0004\bw\u0010=\"\u0004\bx\u0010vR$\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010Y\u001a\u0004\by\u0010'\"\u0004\bz\u0010\\R$\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010Y\u001a\u0004\b{\u0010'\"\u0004\b|\u0010\\R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010Y\u001a\u0004\b}\u0010'\"\u0004\b~\u0010\\R%\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0013\n\u0004\b\u0019\u0010Y\u001a\u0004\b\u007f\u0010'\"\u0005\b\u0080\u0001\u0010\\R&\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0004\b\u001a\u0010s\u001a\u0005\b\u0081\u0001\u0010=\"\u0005\b\u0082\u0001\u0010vR&\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0004\b\u001b\u0010s\u001a\u0005\b\u0083\u0001\u0010=\"\u0005\b\u0084\u0001\u0010vR&\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0004\b\u001c\u0010s\u001a\u0005\b\u0085\u0001\u0010=\"\u0005\b\u0086\u0001\u0010vR&\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0004\b\u001d\u0010s\u001a\u0005\b\u0087\u0001\u0010=\"\u0005\b\u0088\u0001\u0010v¨\u0006\u008b\u0001"}, d2 = {"Lcom/sports/insider/data/room/general/table/predictions/PredictionTable;", "Lkc/b;", "", "id", PredictionTable.startTimeColumn, PredictionTable.publicationColumn, "type", "", PredictionTable.statusColumn, PredictionTable.imageBackgroundColumn, PredictionTable.oddsColumn, PredictionTable.resultsIsViewedColumn, PredictionTable.analyticsFullColumn, PredictionTable.analyticsShortColumn, PredictionTable.leagueColumn, PredictionTable.forecastsColumn, PredictionTable.arrayKindColumn, PredictionTable.arrayPredictionColumn, PredictionTable.oddsForecastColumn, PredictionTable.forecastColumn, PredictionTable.teamHomeIdColumn, PredictionTable.teamGuestIdColumn, PredictionTable.teamHomeFlagColumn, PredictionTable.teamGuestFlagColumn, PredictionTable.teamHomeNameColumn, PredictionTable.teamGuestNameColumn, PredictionTable.scoreHomeColumn, PredictionTable.scoreGuestColumn, PredictionTable.scoreHomeExtraColumn, PredictionTable.scoreGuestExtraColumn, "<init>", "(IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "isMatchStarted", "()Z", "", "startTimeMillisSecond", "()J", "statusPrediction", "()Ljava/lang/String;", "isAwaitingResultGame", "ddMMyyyyString", "HHmmString", "component1", "()I", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "()Ljava/lang/Integer;", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sports/insider/data/room/general/table/predictions/PredictionTable;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "getStartTime", "setStartTime", "getPublication", "setPublication", "getType", "setType", "Ljava/lang/String;", "getStatus", "setStatus", "(Ljava/lang/String;)V", "getImageBackground", "setImageBackground", "getOdds", "setOdds", "getResultsIsViewed", "setResultsIsViewed", "getAnalyticsFull", "setAnalyticsFull", "getAnalyticsShort", "setAnalyticsShort", "getLeague", "setLeague", "getForecasts", "setForecasts", "getArrayKind", "setArrayKind", "getArrayPrediction", "setArrayPrediction", "getOddsForecast", "setOddsForecast", "getForecast", "setForecast", "Ljava/lang/Integer;", "getTeamHomeId", "setTeamHomeId", "(Ljava/lang/Integer;)V", "getTeamGuestId", "setTeamGuestId", "getTeamHomeFlag", "setTeamHomeFlag", "getTeamGuestFlag", "setTeamGuestFlag", "getTeamHomeName", "setTeamHomeName", "getTeamGuestName", "setTeamGuestName", "getScoreHome", "setScoreHome", "getScoreGuest", "setScoreGuest", "getScoreHomeExtra", "setScoreHomeExtra", "getScoreGuestExtra", "setScoreGuestExtra", "PredictionTableNamed", "wb/a", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PredictionTable implements b {

    @NotNull
    public static final a PredictionTableNamed = new a();

    @NotNull
    public static final String analyticsFullColumn = "analyticsFull";

    @NotNull
    public static final String analyticsShortColumn = "analyticsShort";

    @NotNull
    public static final String arrayKindColumn = "arrayKind";

    @NotNull
    public static final String arrayPredictionColumn = "arrayPrediction";

    @NotNull
    public static final String forecastColumn = "forecast";

    @NotNull
    public static final String forecastsColumn = "forecasts";

    @NotNull
    public static final String idColumn = "id";

    @NotNull
    public static final String imageBackgroundColumn = "imageBackground";

    @NotNull
    public static final String leagueColumn = "league";

    @NotNull
    public static final String oddsColumn = "odds";

    @NotNull
    public static final String oddsForecastColumn = "oddsForecast";

    @NotNull
    public static final String publicationColumn = "publication";

    @NotNull
    public static final String resultsIsViewedColumn = "resultsIsViewed";

    @NotNull
    public static final String scoreGuestColumn = "scoreGuest";

    @NotNull
    public static final String scoreGuestExtraColumn = "scoreGuestExtra";

    @NotNull
    public static final String scoreHomeColumn = "scoreHome";

    @NotNull
    public static final String scoreHomeExtraColumn = "scoreHomeExtra";

    @NotNull
    public static final String startTimeColumn = "startTime";

    @NotNull
    public static final String statusColumn = "status";

    @NotNull
    public static final String tableName = "table_prediction";

    @NotNull
    public static final String teamGuestFlagColumn = "teamGuestFlag";

    @NotNull
    public static final String teamGuestIdColumn = "teamGuestId";

    @NotNull
    public static final String teamGuestNameColumn = "teamGuestName";

    @NotNull
    public static final String teamHomeFlagColumn = "teamHomeFlag";

    @NotNull
    public static final String teamHomeIdColumn = "teamHomeId";

    @NotNull
    public static final String teamHomeNameColumn = "teamHomeName";

    @NotNull
    public static final String typeColumn = "type";

    @Nullable
    private String analyticsFull;

    @Nullable
    private String analyticsShort;

    @Nullable
    private String arrayKind;

    @Nullable
    private String arrayPrediction;

    @Nullable
    private String forecast;

    @Nullable
    private String forecasts;
    private int id;

    @Nullable
    private String imageBackground;

    @Nullable
    private String league;

    @Nullable
    private String odds;

    @Nullable
    private String oddsForecast;
    private int publication;
    private int resultsIsViewed;

    @Nullable
    private Integer scoreGuest;

    @Nullable
    private Integer scoreGuestExtra;

    @Nullable
    private Integer scoreHome;

    @Nullable
    private Integer scoreHomeExtra;
    private int startTime;

    @Nullable
    private String status;

    @Nullable
    private String teamGuestFlag;

    @Nullable
    private Integer teamGuestId;

    @Nullable
    private String teamGuestName;

    @Nullable
    private String teamHomeFlag;

    @Nullable
    private Integer teamHomeId;

    @Nullable
    private String teamHomeName;
    private int type;

    public PredictionTable(int i5, int i10, int i11, int i12, @Nullable String str, @Nullable String str2, @Nullable String str3, int i13, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Integer num, @Nullable Integer num2, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6) {
        this.id = i5;
        this.startTime = i10;
        this.publication = i11;
        this.type = i12;
        this.status = str;
        this.imageBackground = str2;
        this.odds = str3;
        this.resultsIsViewed = i13;
        this.analyticsFull = str4;
        this.analyticsShort = str5;
        this.league = str6;
        this.forecasts = str7;
        this.arrayKind = str8;
        this.arrayPrediction = str9;
        this.oddsForecast = str10;
        this.forecast = str11;
        this.teamHomeId = num;
        this.teamGuestId = num2;
        this.teamHomeFlag = str12;
        this.teamGuestFlag = str13;
        this.teamHomeName = str14;
        this.teamGuestName = str15;
        this.scoreHome = num3;
        this.scoreGuest = num4;
        this.scoreHomeExtra = num5;
        this.scoreGuestExtra = num6;
    }

    public static /* synthetic */ PredictionTable copy$default(PredictionTable predictionTable, int i5, int i10, int i11, int i12, String str, String str2, String str3, int i13, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, Integer num2, String str12, String str13, String str14, String str15, Integer num3, Integer num4, Integer num5, Integer num6, int i14, Object obj) {
        Integer num7;
        Integer num8;
        int i15 = (i14 & 1) != 0 ? predictionTable.id : i5;
        int i16 = (i14 & 2) != 0 ? predictionTable.startTime : i10;
        int i17 = (i14 & 4) != 0 ? predictionTable.publication : i11;
        int i18 = (i14 & 8) != 0 ? predictionTable.type : i12;
        String str16 = (i14 & 16) != 0 ? predictionTable.status : str;
        String str17 = (i14 & 32) != 0 ? predictionTable.imageBackground : str2;
        String str18 = (i14 & 64) != 0 ? predictionTable.odds : str3;
        int i19 = (i14 & 128) != 0 ? predictionTable.resultsIsViewed : i13;
        String str19 = (i14 & 256) != 0 ? predictionTable.analyticsFull : str4;
        String str20 = (i14 & 512) != 0 ? predictionTable.analyticsShort : str5;
        String str21 = (i14 & Segment.SHARE_MINIMUM) != 0 ? predictionTable.league : str6;
        String str22 = (i14 & 2048) != 0 ? predictionTable.forecasts : str7;
        String str23 = (i14 & 4096) != 0 ? predictionTable.arrayKind : str8;
        String str24 = (i14 & Segment.SIZE) != 0 ? predictionTable.arrayPrediction : str9;
        int i20 = i15;
        String str25 = (i14 & 16384) != 0 ? predictionTable.oddsForecast : str10;
        String str26 = (i14 & 32768) != 0 ? predictionTable.forecast : str11;
        Integer num9 = (i14 & 65536) != 0 ? predictionTable.teamHomeId : num;
        Integer num10 = (i14 & 131072) != 0 ? predictionTable.teamGuestId : num2;
        String str27 = (i14 & 262144) != 0 ? predictionTable.teamHomeFlag : str12;
        String str28 = (i14 & 524288) != 0 ? predictionTable.teamGuestFlag : str13;
        String str29 = (i14 & 1048576) != 0 ? predictionTable.teamHomeName : str14;
        String str30 = (i14 & 2097152) != 0 ? predictionTable.teamGuestName : str15;
        Integer num11 = (i14 & 4194304) != 0 ? predictionTable.scoreHome : num3;
        Integer num12 = (i14 & 8388608) != 0 ? predictionTable.scoreGuest : num4;
        Integer num13 = (i14 & 16777216) != 0 ? predictionTable.scoreHomeExtra : num5;
        if ((i14 & 33554432) != 0) {
            num8 = num13;
            num7 = predictionTable.scoreGuestExtra;
        } else {
            num7 = num6;
            num8 = num13;
        }
        return predictionTable.copy(i20, i16, i17, i18, str16, str17, str18, i19, str19, str20, str21, str22, str23, str24, str25, str26, num9, num10, str27, str28, str29, str30, num11, num12, num8, num7);
    }

    @Override // kc.b
    @NotNull
    public String HHmmString() {
        return io.sentry.config.a.x(getStartTime(), "HH:mm");
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getAnalyticsShort() {
        return this.analyticsShort;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getLeague() {
        return this.league;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getForecasts() {
        return this.forecasts;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getArrayKind() {
        return this.arrayKind;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getArrayPrediction() {
        return this.arrayPrediction;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getOddsForecast() {
        return this.oddsForecast;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getForecast() {
        return this.forecast;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getTeamHomeId() {
        return this.teamHomeId;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getTeamGuestId() {
        return this.teamGuestId;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getTeamHomeFlag() {
        return this.teamHomeFlag;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getTeamGuestFlag() {
        return this.teamGuestFlag;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final String getTeamHomeName() {
        return this.teamHomeName;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final String getTeamGuestName() {
        return this.teamGuestName;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getScoreHome() {
        return this.scoreHome;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getScoreGuest() {
        return this.scoreGuest;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getScoreHomeExtra() {
        return this.scoreHomeExtra;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final Integer getScoreGuestExtra() {
        return this.scoreGuestExtra;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPublication() {
        return this.publication;
    }

    /* renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getImageBackground() {
        return this.imageBackground;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* renamed from: component8, reason: from getter */
    public final int getResultsIsViewed() {
        return this.resultsIsViewed;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getAnalyticsFull() {
        return this.analyticsFull;
    }

    @NotNull
    public final PredictionTable copy(int id2, int startTime, int publication, int type, @Nullable String status, @Nullable String imageBackground, @Nullable String odds, int resultsIsViewed, @Nullable String analyticsFull, @Nullable String analyticsShort, @Nullable String league, @Nullable String forecasts, @Nullable String arrayKind, @Nullable String arrayPrediction, @Nullable String oddsForecast, @Nullable String forecast, @Nullable Integer teamHomeId, @Nullable Integer teamGuestId, @Nullable String teamHomeFlag, @Nullable String teamGuestFlag, @Nullable String teamHomeName, @Nullable String teamGuestName, @Nullable Integer scoreHome, @Nullable Integer scoreGuest, @Nullable Integer scoreHomeExtra, @Nullable Integer scoreGuestExtra) {
        return new PredictionTable(id2, startTime, publication, type, status, imageBackground, odds, resultsIsViewed, analyticsFull, analyticsShort, league, forecasts, arrayKind, arrayPrediction, oddsForecast, forecast, teamHomeId, teamGuestId, teamHomeFlag, teamGuestFlag, teamHomeName, teamGuestName, scoreHome, scoreGuest, scoreHomeExtra, scoreGuestExtra);
    }

    @Override // kc.b
    @NotNull
    public String ddMMyyyyString() {
        return io.sentry.config.a.x(getStartTime(), "dd.MM.yyyy");
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PredictionTable)) {
            return false;
        }
        PredictionTable predictionTable = (PredictionTable) other;
        return this.id == predictionTable.id && this.startTime == predictionTable.startTime && this.publication == predictionTable.publication && this.type == predictionTable.type && Intrinsics.areEqual(this.status, predictionTable.status) && Intrinsics.areEqual(this.imageBackground, predictionTable.imageBackground) && Intrinsics.areEqual(this.odds, predictionTable.odds) && this.resultsIsViewed == predictionTable.resultsIsViewed && Intrinsics.areEqual(this.analyticsFull, predictionTable.analyticsFull) && Intrinsics.areEqual(this.analyticsShort, predictionTable.analyticsShort) && Intrinsics.areEqual(this.league, predictionTable.league) && Intrinsics.areEqual(this.forecasts, predictionTable.forecasts) && Intrinsics.areEqual(this.arrayKind, predictionTable.arrayKind) && Intrinsics.areEqual(this.arrayPrediction, predictionTable.arrayPrediction) && Intrinsics.areEqual(this.oddsForecast, predictionTable.oddsForecast) && Intrinsics.areEqual(this.forecast, predictionTable.forecast) && Intrinsics.areEqual(this.teamHomeId, predictionTable.teamHomeId) && Intrinsics.areEqual(this.teamGuestId, predictionTable.teamGuestId) && Intrinsics.areEqual(this.teamHomeFlag, predictionTable.teamHomeFlag) && Intrinsics.areEqual(this.teamGuestFlag, predictionTable.teamGuestFlag) && Intrinsics.areEqual(this.teamHomeName, predictionTable.teamHomeName) && Intrinsics.areEqual(this.teamGuestName, predictionTable.teamGuestName) && Intrinsics.areEqual(this.scoreHome, predictionTable.scoreHome) && Intrinsics.areEqual(this.scoreGuest, predictionTable.scoreGuest) && Intrinsics.areEqual(this.scoreHomeExtra, predictionTable.scoreHomeExtra) && Intrinsics.areEqual(this.scoreGuestExtra, predictionTable.scoreGuestExtra);
    }

    @Override // kc.b
    @Nullable
    public String getAnalyticsFull() {
        return this.analyticsFull;
    }

    @Override // kc.b
    @Nullable
    public String getAnalyticsShort() {
        return this.analyticsShort;
    }

    @Override // kc.b
    @Nullable
    public String getArrayKind() {
        return this.arrayKind;
    }

    @Nullable
    public String getArrayPrediction() {
        return this.arrayPrediction;
    }

    @Override // kc.b
    @Nullable
    public String getForecast() {
        return this.forecast;
    }

    @Nullable
    public String getForecasts() {
        return this.forecasts;
    }

    @Override // kc.b
    public int getId() {
        return this.id;
    }

    @Override // kc.b
    @Nullable
    public String getImageBackground() {
        return this.imageBackground;
    }

    @Override // kc.b
    @Nullable
    public String getLeague() {
        return this.league;
    }

    @Override // kc.b
    @Nullable
    public String getOdds() {
        return this.odds;
    }

    @Nullable
    public String getOddsForecast() {
        return this.oddsForecast;
    }

    public int getPublication() {
        return this.publication;
    }

    public int getResultsIsViewed() {
        return this.resultsIsViewed;
    }

    @Override // kc.b
    @Nullable
    public Integer getScoreGuest() {
        return this.scoreGuest;
    }

    @Override // kc.b
    @Nullable
    public Integer getScoreGuestExtra() {
        return this.scoreGuestExtra;
    }

    @Override // kc.b
    @Nullable
    public Integer getScoreHome() {
        return this.scoreHome;
    }

    @Override // kc.b
    @Nullable
    public Integer getScoreHomeExtra() {
        return this.scoreHomeExtra;
    }

    @Override // kc.b
    public int getStartTime() {
        return this.startTime;
    }

    @Override // kc.b
    @Nullable
    public String getStatus() {
        return this.status;
    }

    @Override // kc.b
    @Nullable
    public String getTeamGuestFlag() {
        return this.teamGuestFlag;
    }

    @Nullable
    public Integer getTeamGuestId() {
        return this.teamGuestId;
    }

    @Override // kc.b
    @Nullable
    public String getTeamGuestName() {
        return this.teamGuestName;
    }

    @Override // kc.b
    @Nullable
    public String getTeamHomeFlag() {
        return this.teamHomeFlag;
    }

    @Nullable
    public Integer getTeamHomeId() {
        return this.teamHomeId;
    }

    @Override // kc.b
    @Nullable
    public String getTeamHomeName() {
        return this.teamHomeName;
    }

    @Override // kc.b
    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int i5 = ((((((this.id * 31) + this.startTime) * 31) + this.publication) * 31) + this.type) * 31;
        String str = this.status;
        int hashCode = (i5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageBackground;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.odds;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.resultsIsViewed) * 31;
        String str4 = this.analyticsFull;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.analyticsShort;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.league;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.forecasts;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.arrayKind;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.arrayPrediction;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.oddsForecast;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.forecast;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.teamHomeId;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.teamGuestId;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.teamHomeFlag;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.teamGuestFlag;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.teamHomeName;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.teamGuestName;
        int hashCode17 = (hashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num3 = this.scoreHome;
        int hashCode18 = (hashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.scoreGuest;
        int hashCode19 = (hashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.scoreHomeExtra;
        int hashCode20 = (hashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.scoreGuestExtra;
        return hashCode20 + (num6 != null ? num6.hashCode() : 0);
    }

    public boolean isAwaitingResultGame() {
        return Intrinsics.areEqual(statusPrediction(), "unknown") && isMatchStarted();
    }

    @Override // kc.b
    public boolean isMatchStarted() {
        return ((long) getStartTime()) <= Instant.now().getEpochSecond();
    }

    public void setAnalyticsFull(@Nullable String str) {
        this.analyticsFull = str;
    }

    public void setAnalyticsShort(@Nullable String str) {
        this.analyticsShort = str;
    }

    public void setArrayKind(@Nullable String str) {
        this.arrayKind = str;
    }

    public void setArrayPrediction(@Nullable String str) {
        this.arrayPrediction = str;
    }

    public void setForecast(@Nullable String str) {
        this.forecast = str;
    }

    public void setForecasts(@Nullable String str) {
        this.forecasts = str;
    }

    public void setId(int i5) {
        this.id = i5;
    }

    public void setImageBackground(@Nullable String str) {
        this.imageBackground = str;
    }

    public void setLeague(@Nullable String str) {
        this.league = str;
    }

    public void setOdds(@Nullable String str) {
        this.odds = str;
    }

    public void setOddsForecast(@Nullable String str) {
        this.oddsForecast = str;
    }

    public void setPublication(int i5) {
        this.publication = i5;
    }

    public void setResultsIsViewed(int i5) {
        this.resultsIsViewed = i5;
    }

    public void setScoreGuest(@Nullable Integer num) {
        this.scoreGuest = num;
    }

    public void setScoreGuestExtra(@Nullable Integer num) {
        this.scoreGuestExtra = num;
    }

    public void setScoreHome(@Nullable Integer num) {
        this.scoreHome = num;
    }

    public void setScoreHomeExtra(@Nullable Integer num) {
        this.scoreHomeExtra = num;
    }

    public void setStartTime(int i5) {
        this.startTime = i5;
    }

    public void setStatus(@Nullable String str) {
        this.status = str;
    }

    public void setTeamGuestFlag(@Nullable String str) {
        this.teamGuestFlag = str;
    }

    public void setTeamGuestId(@Nullable Integer num) {
        this.teamGuestId = num;
    }

    public void setTeamGuestName(@Nullable String str) {
        this.teamGuestName = str;
    }

    public void setTeamHomeFlag(@Nullable String str) {
        this.teamHomeFlag = str;
    }

    public void setTeamHomeId(@Nullable Integer num) {
        this.teamHomeId = num;
    }

    public void setTeamHomeName(@Nullable String str) {
        this.teamHomeName = str;
    }

    public void setType(int i5) {
        this.type = i5;
    }

    @Override // kc.b
    public long startTimeMillisSecond() {
        return getStartTime() * 1000;
    }

    @Override // kc.b
    @NotNull
    public String statusPrediction() {
        String status = getStatus();
        return status == null ? "unknown" : status;
    }

    @NotNull
    public String toString() {
        return "PredictionTable(id=" + this.id + ", startTime=" + this.startTime + ", publication=" + this.publication + ", type=" + this.type + ", status=" + this.status + ", imageBackground=" + this.imageBackground + ", odds=" + this.odds + ", resultsIsViewed=" + this.resultsIsViewed + ", analyticsFull=" + this.analyticsFull + ", analyticsShort=" + this.analyticsShort + ", league=" + this.league + ", forecasts=" + this.forecasts + ", arrayKind=" + this.arrayKind + ", arrayPrediction=" + this.arrayPrediction + ", oddsForecast=" + this.oddsForecast + ", forecast=" + this.forecast + ", teamHomeId=" + this.teamHomeId + ", teamGuestId=" + this.teamGuestId + ", teamHomeFlag=" + this.teamHomeFlag + ", teamGuestFlag=" + this.teamGuestFlag + ", teamHomeName=" + this.teamHomeName + ", teamGuestName=" + this.teamGuestName + ", scoreHome=" + this.scoreHome + ", scoreGuest=" + this.scoreGuest + ", scoreHomeExtra=" + this.scoreHomeExtra + ", scoreGuestExtra=" + this.scoreGuestExtra + ')';
    }
}
