package com.sofascore.model.mvvm.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.IUrlSharing;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.EventSerializer;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.model.util.ChatInterface;
import defpackage.a70;
import defpackage.bf3;
import defpackage.k13;
import defpackage.me4;
import defpackage.mz1;
import defpackage.r5h;
import defpackage.v6a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = EventSerializer.class)
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 Ú\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Ú\u0001B\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0007\u0010Á\u0001\u001a\u00020;J\u0007\u0010Â\u0001\u001a\u00020;J\u0007\u0010Ã\u0001\u001a\u00020\rJ\u0007\u0010Ä\u0001\u001a\u00020HJ\u000e\u0010Å\u0001\u001a\u0004\u0018\u00010H¢\u0006\u0002\u0010MJ\u0012\u00100\u001a\u00020/2\n\b\u0002\u0010Ð\u0001\u001a\u00030Ñ\u0001J\u0012\u00103\u001a\u00020/2\n\b\u0002\u0010Ð\u0001\u001a\u00030Ñ\u0001J\u0012\u00106\u001a\u0002052\n\b\u0002\u0010Ð\u0001\u001a\u00030Ñ\u0001J\u0012\u00109\u001a\u0002052\n\b\u0002\u0010Ð\u0001\u001a\u00030Ñ\u0001J\u0016\u0010Ò\u0001\u001a\u0005\u0018\u00010\u0092\u00012\n\b\u0002\u0010Ð\u0001\u001a\u00030Ñ\u0001J\u0016\u0010Ó\u0001\u001a\u0005\u0018\u00010\u0092\u00012\n\b\u0002\u0010Ð\u0001\u001a\u00030Ñ\u0001J\u001a\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010Ð\u0001\u001a\u00030Ñ\u0001¢\u0006\u0003\u0010Ô\u0001J\u001a\u0010#\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010Ð\u0001\u001a\u00030Ñ\u0001¢\u0006\u0003\u0010Ô\u0001J\u0017\u0010Õ\u0001\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010Ð\u0001\u001a\u00030Ñ\u0001H\u0016J\u0017\u0010Ö\u0001\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010Ð\u0001\u001a\u00030Ñ\u0001H\u0016J\u0007\u0010×\u0001\u001a\u00020;J\u0007\u0010Ø\u0001\u001a\u00020;J\t\u0010Ù\u0001\u001a\u00020\u0000H&R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001fX¤\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u0004\u0018\u00010\u001fX¤\u0004¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0014\u0010$\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0014\u0010&\u001a\u0004\u0018\u00010'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u0004\u0018\u00010+X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0012\u0010.\u001a\u00020/X¤\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0012\u00102\u001a\u00020/X¤\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0012\u00104\u001a\u000205X¤\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0012\u00108\u001a\u000205X¤\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010:\u001a\u0004\u0018\u00010;X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u0004\u0018\u00010;X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0012\u0010@\u001a\u00020;X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010C\u001a\u0004\u0018\u00010;X¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010=R\u0012\u0010E\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u000fR\u0012\u0010G\u001a\u00020HX¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010K\u001a\u0004\u0018\u00010HX¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010N\u001a\u0004\u0018\u00010OX¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u001a\u0010R\u001a\u0004\u0018\u00010SX¦\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0014\u0010X\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010!R\u0014\u0010Z\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010!R\u0014\u0010\\\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010!R\u0014\u0010^\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u000fR\u0012\u0010`\u001a\u00020;X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010BR\u0014\u0010b\u001a\u0004\u0018\u00010;X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010=R\u0012\u0010c\u001a\u00020;X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010BR\u0014\u0010d\u001a\u0004\u0018\u00010eX¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010h\u001a\u0004\u0018\u00010HX¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010MR \u0010j\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010kX¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010n\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010!R\u0014\u0010p\u001a\u0004\u0018\u00010qX¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0012\u0010t\u001a\u00020;X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010BR\u001a\u0010v\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010wX¦\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0012\u0010z\u001a\u00020\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0014\u0010}\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u000fR\u0015\u0010\u007f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u000fR\u0018\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001X¦\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0085\u0001\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u000fR\u0016\u0010\u0087\u0001\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u000fR\u0016\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010!R\u0016\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010!R\u0014\u0010\u008d\u0001\u001a\u00020;X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010BR\u0014\u0010\u008f\u0001\u001a\u00020;X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010BR\u0018\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001X¤\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0092\u0001X¤\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0094\u0001R\u0016\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010!R\u001c\u0010\u0099\u0001\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010wX¦\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010yR\u0016\u0010\u009b\u0001\u001a\u00020;X\u0096D¢\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010BR\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010;X\u0096\u0004¢\u0006\f\n\u0003\u0010\u009f\u0001\u001a\u0005\b\u009e\u0001\u0010=R(\u0010 \u0001\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0w\u0018\u00010kX¦\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010mR\u001e\u0010¢\u0001\u001a\u00020;X\u0096\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b¢\u0001\u0010B\"\u0006\b£\u0001\u0010¤\u0001R\u001e\u0010¥\u0001\u001a\u00020;X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b¦\u0001\u0010B\"\u0006\b§\u0001\u0010¤\u0001R\u0016\u0010¨\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010\u000fR&\u0010ª\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010wX\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b«\u0001\u0010y\"\u0006\b¬\u0001\u0010\u00ad\u0001R\u001e\u0010®\u0001\u001a\u00020;X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b¯\u0001\u0010B\"\u0006\b°\u0001\u0010¤\u0001R#\u0010±\u0001\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0014\n\u0003\u0010µ\u0001\u001a\u0005\b²\u0001\u0010!\"\u0006\b³\u0001\u0010´\u0001R7\u0010¶\u0001\u001a\u001a\u0012\u0005\u0012\u00030¸\u0001\u0018\u00010·\u0001j\f\u0012\u0005\u0012\u00030¸\u0001\u0018\u0001`¹\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R7\u0010¾\u0001\u001a\u001a\u0012\u0005\u0012\u00030¸\u0001\u0018\u00010·\u0001j\f\u0012\u0005\u0012\u00030¸\u0001\u0018\u0001`¹\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¿\u0001\u0010»\u0001\"\u0006\bÀ\u0001\u0010½\u0001R\u0016\u0010Æ\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010|R\u0016\u0010È\u0001\u001a\u00020H8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010JR\u0016\u0010Ê\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010\u000fR\u0016\u0010Ì\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010\u000fR\u0016\u0010Î\u0001\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010\u000f\u0082\u0001\u0012Û\u0001Ü\u0001Ý\u0001Þ\u0001ß\u0001à\u0001á\u0001â\u0001ã\u0001¨\u0006ä\u0001"}, d2 = {"Lcom/sofascore/model/mvvm/model/Event;", "Ljava/io/Serializable;", "Lcom/sofascore/model/util/ChatInterface;", "Lcom/sofascore/model/mvvm/IRecent;", "Lcom/sofascore/model/mvvm/IUrlSharing;", "Lcom/sofascore/model/mvvm/model/IShareContent;", "<init>", "()V", "tournament", "Lcom/sofascore/model/mvvm/model/Tournament;", "getTournament", "()Lcom/sofascore/model/mvvm/model/Tournament;", "slug", "", "getSlug", "()Ljava/lang/String;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "()Lcom/sofascore/model/mvvm/model/Season;", "roundInfo", "Lcom/sofascore/model/mvvm/model/Round;", "getRoundInfo", "()Lcom/sofascore/model/mvvm/model/Round;", "setRoundInfo", "(Lcom/sofascore/model/mvvm/model/Round;)V", "status", "Lcom/sofascore/model/mvvm/model/Status;", "getStatus", "()Lcom/sofascore/model/mvvm/model/Status;", "winnerCode", "", "getWinnerCode", "()Ljava/lang/Integer;", "aggregatedWinnerCode", "getAggregatedWinnerCode", "attendance", "getAttendance", "venue", "Lcom/sofascore/model/mvvm/model/Venue;", "getVenue", "()Lcom/sofascore/model/mvvm/model/Venue;", SearchResponseKt.REFEREE_ENTITY, "Lcom/sofascore/model/mvvm/model/Referee;", "getReferee", "()Lcom/sofascore/model/mvvm/model/Referee;", "homeTeam", "Lcom/sofascore/model/mvvm/model/Team;", "getHomeTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "awayTeam", "getAwayTeam", "homeScore", "Lcom/sofascore/model/mvvm/model/Score;", "getHomeScore", "()Lcom/sofascore/model/mvvm/model/Score;", "awayScore", "getAwayScore", "hasGlobalHighlights", "", "getHasGlobalHighlights", "()Ljava/lang/Boolean;", "hasEventPlayerStatistics", "getHasEventPlayerStatistics", "hasEventPlayerHeatMap", "getHasEventPlayerHeatMap", "()Z", "hasXg", "getHasXg", "customId", "getCustomId", "startTimestamp", "", "getStartTimestamp", "()J", "endTimestamp", "getEndTimestamp", "()Ljava/lang/Long;", "time", "Lcom/sofascore/model/mvvm/model/Time;", "getTime", "()Lcom/sofascore/model/mvvm/model/Time;", "changes", "Lcom/sofascore/model/mvvm/model/EventChanges;", "getChanges", "()Lcom/sofascore/model/mvvm/model/EventChanges;", "setChanges", "(Lcom/sofascore/model/mvvm/model/EventChanges;)V", "coverage", "getCoverage", "previousLegEventId", "getPreviousLegEventId", "parentEventId", "getParentEventId", "lastPeriod", "getLastPeriod", "finalResultOnly", "getFinalResultOnly", "isEditor", "isAwarded", "manOfMatch", "Lcom/sofascore/model/mvvm/model/Player;", "getManOfMatch", "()Lcom/sofascore/model/mvvm/model/Player;", "currentPeriodStartTimestamp", "getCurrentPeriodStartTimestamp", "periods", "", "getPeriods", "()Ljava/util/Map;", "defaultPeriodCount", "getDefaultPeriodCount", "timeouts", "Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "getTimeouts", "()Lcom/sofascore/model/mvvm/model/TimeoutsInfo;", "hasBet365LiveStream", "getHasBet365LiveStream", "bet365ExcludedCountryCodes", "", "getBet365ExcludedCountryCodes", "()Ljava/util/List;", "cupMatchesInRound", "getCupMatchesInRound", "()I", "statusReason", "getStatusReason", "eventEditorName", "getEventEditorName", "eventEditor", "Lcom/sofascore/model/mvvm/model/EventEditor;", "getEventEditor", "()Lcom/sofascore/model/mvvm/model/EventEditor;", "eventType", "getEventType", "seasonStatisticsType", "getSeasonStatisticsType", "homeTeamRanking", "getHomeTeamRanking", "awayTeamRanking", "getAwayTeamRanking", "crowdsourcingDataDisplayEnabled", "getCrowdsourcingDataDisplayEnabled", "crowdsourcingDataDisplayPermanent", "getCrowdsourcingDataDisplayPermanent", "homeTeamSeasonHistoricalForm", "Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "getHomeTeamSeasonHistoricalForm", "()Lcom/sofascore/model/mvvm/model/TeamSeasonForm;", "awayTeamSeasonHistoricalForm", "getAwayTeamSeasonHistoricalForm", "streamContentId", "getStreamContentId", "streamContentGeoRestrictions", "getStreamContentGeoRestrictions", "crowdsourcingEnabled", "getCrowdsourcingEnabled", "correctAiInsight", "getCorrectAiInsight", "Ljava/lang/Boolean;", "eventFilters", "getEventFilters", "isRecent", "setRecent", "(Z)V", "hideDate", "getHideDate", "setHideDate", "sportSlug", "getSportSlug", "childEvents", "getChildEvents", "setChildEvents", "(Ljava/util/List;)V", "hide", "getHide", "setHide", CampaignEx.JSON_NATIVE_VIDEO_MUTE, "getMute", "setMute", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "typeList", "Ljava/util/HashSet;", "Lcom/sofascore/model/mvvm/model/EventType;", "Lkotlin/collections/HashSet;", "getTypeList", "()Ljava/util/HashSet;", "setTypeList", "(Ljava/util/HashSet;)V", "typeListNotifications", "getTypeListNotifications", "setTypeListNotifications", "shouldReverseTeams", "isDoublesMatch", "getStatusDescription", "getTotalPeriodTime", "getCurrentPeriodTime", "chatId", "getChatId", "timestamp", "getTimestamp", "statusType", "getStatusType", "channelName", "getChannelName", "webUrl", "getWebUrl", "side", "Lcom/sofascore/model/mvvm/model/TeamSides;", "getHomeSeasonForm", "getAwaySeasonForm", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/Integer;", "getHomeTeamSeed", "getAwayTeamSeed", "isCrowdsourcingLive", "isCrowdsourcingAwaitingResults", "copyEvent", "Companion", "Lcom/sofascore/model/mvvm/model/AmericanFootballEvent;", "Lcom/sofascore/model/mvvm/model/BaseballEvent;", "Lcom/sofascore/model/mvvm/model/BasketballEvent;", "Lcom/sofascore/model/mvvm/model/CricketEvent;", "Lcom/sofascore/model/mvvm/model/ESportsEvent;", "Lcom/sofascore/model/mvvm/model/FootballEvent;", "Lcom/sofascore/model/mvvm/model/MmaEvent;", "Lcom/sofascore/model/mvvm/model/OtherEvent;", "Lcom/sofascore/model/mvvm/model/ServableEvent;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class Event implements Serializable, ChatInterface, IRecent, IUrlSharing, IShareContent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<Integer> childEvents;

    @Nullable
    private final Boolean correctAiInsight;
    private final boolean crowdsourcingEnabled;
    private boolean hide;
    private boolean hideDate;
    private boolean isRecent;

    @Nullable
    private Integer mute;

    @Nullable
    private HashSet<EventType> typeList;

    @Nullable
    private HashSet<EventType> typeListNotifications;

    private Event() {
        this.mute = -1;
    }

    public static /* synthetic */ Integer getAggregatedWinnerCode$default(Event event, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getAggregatedWinnerCode");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return event.getAggregatedWinnerCode(teamSides);
    }

    public static /* synthetic */ Score getAwayScore$default(Event event, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getAwayScore");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return event.getAwayScore(teamSides);
    }

    public static /* synthetic */ TeamSeasonForm getAwaySeasonForm$default(Event event, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getAwaySeasonForm");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return event.getAwaySeasonForm(teamSides);
    }

    public static /* synthetic */ Team getAwayTeam$default(Event event, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getAwayTeam");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return event.getAwayTeam(teamSides);
    }

    public static /* synthetic */ String getAwayTeamSeed$default(Event event, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getAwayTeamSeed");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return event.getAwayTeamSeed(teamSides);
    }

    public static /* synthetic */ Score getHomeScore$default(Event event, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getHomeScore");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return event.getHomeScore(teamSides);
    }

    public static /* synthetic */ TeamSeasonForm getHomeSeasonForm$default(Event event, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getHomeSeasonForm");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return event.getHomeSeasonForm(teamSides);
    }

    public static /* synthetic */ Team getHomeTeam$default(Event event, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getHomeTeam");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return event.getHomeTeam(teamSides);
    }

    public static /* synthetic */ String getHomeTeamSeed$default(Event event, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getHomeTeamSeed");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return event.getHomeTeamSeed(teamSides);
    }

    public static /* synthetic */ Integer getWinnerCode$default(Event event, TeamSides teamSides, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getWinnerCode");
            return null;
        }
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return event.getWinnerCode(teamSides);
    }

    @NotNull
    public abstract Event copyEvent();

    @Nullable
    public abstract Integer getAggregatedWinnerCode();

    @Nullable
    public final Integer getAggregatedWinnerCode(@NotNull TeamSides side) {
        Integer num;
        side.getClass();
        Integer aggregatedWinnerCode = getAggregatedWinnerCode();
        if (aggregatedWinnerCode != null && aggregatedWinnerCode.intValue() == 1) {
            num = (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? null : 1;
            return Integer.valueOf(num != null ? num.intValue() : 2);
        }
        if (aggregatedWinnerCode == null || aggregatedWinnerCode.intValue() != 2) {
            return getAggregatedWinnerCode();
        }
        num = (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? null : 2;
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }

    @Nullable
    public abstract Integer getAttendance();

    @NotNull
    public abstract Score getAwayScore();

    @NotNull
    public final Score getAwayScore(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? getHomeScore() : getAwayScore();
    }

    @Nullable
    public final TeamSeasonForm getAwaySeasonForm(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? getHomeTeamSeasonHistoricalForm() : getAwayTeamSeasonHistoricalForm();
    }

    @NotNull
    public abstract Team getAwayTeam();

    @NotNull
    public final Team getAwayTeam(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? getHomeTeam() : getAwayTeam();
    }

    @Nullable
    public abstract Integer getAwayTeamRanking();

    @Nullable
    public abstract TeamSeasonForm getAwayTeamSeasonHistoricalForm();

    @Nullable
    public String getAwayTeamSeed(@NotNull TeamSides side) {
        side.getClass();
        return null;
    }

    @Nullable
    public abstract List<String> getBet365ExcludedCountryCodes();

    @Nullable
    public abstract EventChanges getChanges();

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getChannelName() {
        return "event";
    }

    @Override // com.sofascore.model.util.ChatInterface
    public int getChatId() {
        return getId();
    }

    @Nullable
    public final List<Integer> getChildEvents() {
        return this.childEvents;
    }

    @Nullable
    public Boolean getCorrectAiInsight() {
        return this.correctAiInsight;
    }

    @Nullable
    public abstract Integer getCoverage();

    public abstract boolean getCrowdsourcingDataDisplayEnabled();

    public abstract boolean getCrowdsourcingDataDisplayPermanent();

    public boolean getCrowdsourcingEnabled() {
        return this.crowdsourcingEnabled;
    }

    public abstract int getCupMatchesInRound();

    @Nullable
    public abstract Long getCurrentPeriodStartTimestamp();

    @Nullable
    public final Long getCurrentPeriodTime() {
        if (StatusKt.STATUS_IN_PROGRESS.equals(getStatus().getType())) {
            Long currentPeriodStartTimestamp = getCurrentPeriodStartTimestamp();
            if ((currentPeriodStartTimestamp != null ? currentPeriodStartTimestamp.longValue() : 0L) > 0) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                Long currentPeriodStartTimestamp2 = getCurrentPeriodStartTimestamp();
                Long valueOf = Long.valueOf(currentTimeMillis - (currentPeriodStartTimestamp2 != null ? currentPeriodStartTimestamp2.longValue() : 0L));
                if (valueOf.longValue() > 0) {
                    return valueOf;
                }
            }
        }
        return null;
    }

    @NotNull
    public abstract String getCustomId();

    @Nullable
    public abstract Integer getDefaultPeriodCount();

    @Nullable
    public abstract Long getEndTimestamp();

    @Nullable
    public abstract EventEditor getEventEditor();

    @Nullable
    public abstract String getEventEditorName();

    @Nullable
    public abstract Map<String, List<String>> getEventFilters();

    @Nullable
    public abstract String getEventType();

    public abstract boolean getFinalResultOnly();

    public abstract boolean getHasBet365LiveStream();

    public abstract boolean getHasEventPlayerHeatMap();

    @Nullable
    public abstract Boolean getHasEventPlayerStatistics();

    @Nullable
    public abstract Boolean getHasGlobalHighlights();

    @Nullable
    public abstract Boolean getHasXg();

    public final boolean getHide() {
        return this.hide;
    }

    public final boolean getHideDate() {
        return this.hideDate;
    }

    @NotNull
    public abstract Score getHomeScore();

    @NotNull
    public final Score getHomeScore(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? getAwayScore() : getHomeScore();
    }

    @Nullable
    public final TeamSeasonForm getHomeSeasonForm(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? getAwayTeamSeasonHistoricalForm() : getHomeTeamSeasonHistoricalForm();
    }

    @NotNull
    public abstract Team getHomeTeam();

    @NotNull
    public final Team getHomeTeam(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? getAwayTeam() : getHomeTeam();
    }

    @Nullable
    public abstract Integer getHomeTeamRanking();

    @Nullable
    public abstract TeamSeasonForm getHomeTeamSeasonHistoricalForm();

    @Nullable
    public String getHomeTeamSeed(@NotNull TeamSides side) {
        side.getClass();
        return null;
    }

    @Nullable
    public abstract String getLastPeriod();

    @Nullable
    public abstract Player getManOfMatch();

    @Nullable
    public final Integer getMute() {
        return this.mute;
    }

    @Nullable
    public abstract Integer getParentEventId();

    @Nullable
    public abstract Map<String, String> getPeriods();

    @Nullable
    public abstract Integer getPreviousLegEventId();

    @Nullable
    public abstract Referee getReferee();

    @Nullable
    public abstract Round getRoundInfo();

    @Nullable
    public abstract Season getSeason();

    @Nullable
    public abstract String getSeasonStatisticsType();

    @NotNull
    public abstract String getSlug();

    @Override // com.sofascore.model.mvvm.IRecent
    @NotNull
    public String getSportSlug() {
        return getTournament().getCategory().getSport().getSlug();
    }

    public abstract long getStartTimestamp();

    @NotNull
    public abstract Status getStatus();

    @NotNull
    public final String getStatusDescription() {
        return getStatus().getDescription(getTournament().getCategory().getSport().getSlug());
    }

    @Nullable
    public abstract String getStatusReason();

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getStatusType() {
        return getStatus().getType();
    }

    @Nullable
    public abstract List<String> getStreamContentGeoRestrictions();

    @Nullable
    public abstract Integer getStreamContentId();

    @Nullable
    public abstract Time getTime();

    @Nullable
    public abstract TimeoutsInfo getTimeouts();

    @Override // com.sofascore.model.util.ChatInterface
    public long getTimestamp() {
        return getStartTimestamp();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long getTotalPeriodTime() {
        long j;
        Long l;
        String lastPeriod;
        Time time = getTime();
        Map<String, Long> timeMap = time != null ? time.getTimeMap() : null;
        IntRange intRange = new IntRange(1, 7, 1);
        ArrayList arrayList = new ArrayList(k13.r(intRange, 10));
        v6a it = intRange.iterator();
        while (it.c) {
            arrayList.add("period" + it.nextInt());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str = (String) it2.next();
            if (StatusKt.STATUS_IN_PROGRESS.equals(getStatus().getType()) && (lastPeriod = getLastPeriod()) != null && StringsKt.J(lastPeriod, str, false)) {
                Long currentPeriodStartTimestamp = getCurrentPeriodStartTimestamp();
                if ((currentPeriodStartTimestamp != null ? currentPeriodStartTimestamp.longValue() : 0L) > 0) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Long currentPeriodStartTimestamp2 = getCurrentPeriodStartTimestamp();
                    l = Long.valueOf(currentTimeMillis - (currentPeriodStartTimestamp2 != null ? currentPeriodStartTimestamp2.longValue() : 0L));
                    if (l == null) {
                        arrayList2.add(l);
                    }
                }
            }
            l = timeMap != null ? timeMap.get(str) : null;
            if (l == null) {
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            j += ((Number) it3.next()).longValue();
        }
        return j;
    }

    @NotNull
    public abstract Tournament getTournament();

    @Nullable
    public final HashSet<EventType> getTypeList() {
        return this.typeList;
    }

    @Nullable
    public final HashSet<EventType> getTypeListNotifications() {
        return this.typeListNotifications;
    }

    @Nullable
    public abstract Venue getVenue();

    @Override // com.sofascore.model.mvvm.IUrlSharing
    @NotNull
    public String getWebUrl() {
        String sportSlug = getSportSlug();
        String slug = getSlug();
        return bf3.h(getId(), getCustomId(), "#id:", mz1.s("/", sportSlug, "/match/", slug, "/"));
    }

    @Nullable
    public abstract Integer getWinnerCode();

    @Nullable
    public final Integer getWinnerCode(@NotNull TeamSides side) {
        Integer num;
        side.getClass();
        Integer winnerCode = getWinnerCode();
        if (winnerCode != null && winnerCode.intValue() == 1) {
            num = (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? null : 1;
            return Integer.valueOf(num != null ? num.intValue() : 2);
        }
        if (winnerCode == null || winnerCode.intValue() != 2) {
            return getWinnerCode();
        }
        num = (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? null : 2;
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }

    public abstract boolean isAwarded();

    public final boolean isCrowdsourcingAwaitingResults() {
        return getCrowdsourcingEnabled() && getCrowdsourcingDataDisplayEnabled() && me4.t(StatusKt.STATUS_FINISHED, this);
    }

    public final boolean isCrowdsourcingLive() {
        return getCrowdsourcingEnabled() && getCrowdsourcingDataDisplayEnabled() && me4.t(StatusKt.STATUS_IN_PROGRESS, this);
    }

    public final boolean isDoublesMatch() {
        return (getHomeTeam$default(this, null, 1, null).getSubTeam1() == null || getHomeTeam$default(this, null, 1, null).getSubTeam2() == null || getAwayTeam$default(this, null, 1, null).getSubTeam1() == null || getAwayTeam$default(this, null, 1, null).getSubTeam2() == null) ? false : true;
    }

    @Nullable
    public abstract Boolean isEditor();

    @Override // com.sofascore.model.mvvm.IRecent
    /* renamed from: isRecent, reason: from getter */
    public boolean getIsRecent() {
        return this.isRecent;
    }

    public abstract void setChanges(@Nullable EventChanges eventChanges);

    public final void setChildEvents(@Nullable List<Integer> list) {
        this.childEvents = list;
    }

    public final void setHide(boolean z) {
        this.hide = z;
    }

    public final void setHideDate(boolean z) {
        this.hideDate = z;
    }

    public final void setMute(@Nullable Integer num) {
        this.mute = num;
    }

    @Override // com.sofascore.model.mvvm.IRecent
    public void setRecent(boolean z) {
        this.isRecent = z;
    }

    public abstract void setRoundInfo(@Nullable Round round);

    public final void setTypeList(@Nullable HashSet<EventType> hashSet) {
        this.typeList = hashSet;
    }

    public final void setTypeListNotifications(@Nullable HashSet<EventType> hashSet) {
        this.typeListNotifications = hashSet;
    }

    public final boolean shouldReverseTeams() {
        UniqueTournament uniqueTournament = getTournament().getUniqueTournament();
        return uniqueTournament != null && uniqueTournament.shouldReverseTeams();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/mvvm/model/Event$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/mvvm/model/Event;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
