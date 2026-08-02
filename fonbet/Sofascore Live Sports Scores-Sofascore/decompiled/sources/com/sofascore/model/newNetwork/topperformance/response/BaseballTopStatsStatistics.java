package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.fc6;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ym1;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0002_^BÇ\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019BÛ\u0002\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010 J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010 J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010 J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010 Jø\u0002\u00104\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b>\u0010?J'\u0010H\u001a\u00020E2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0001¢\u0006\u0004\bF\u0010GR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010I\u001a\u0004\bJ\u0010 R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bK\u0010 R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bL\u0010 R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bM\u0010 R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bN\u0010 R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bO\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bP\u0010 R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bQ\u0010 R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bR\u0010 R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bS\u0010 R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bT\u0010 R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bU\u0010 R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bV\u0010 R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bW\u0010 R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bX\u0010 R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010I\u001a\u0004\bY\u0010 R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bZ\u0010 R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\b[\u0010 R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\b\\\u0010 R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010I\u001a\u0004\b]\u0010 ¨\u0006`"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/BaseballTopStatsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/response/TopStatsItem;", "battingAtBats", "battingHits", "battingHomeRuns", "battingAverage", "battingRuns", "battingRbi", "battingStolenBases", "battingOnBasePercentage", "battingSluggingPercentage", "pitchingInningsPitched", "pitchingEarnedRunsAverage", "pitchingStrikeOuts", "pitchingWhip", "pitchingFieldingIndependentPitching", "pitchingOpponentBattingAvg", "fieldingPutOuts", "fieldingAssists", "fieldingTotalErrors", "fieldingTotalChances", "fieldingDoublePlays", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/BaseballTopStatsStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/BaseballTopStatsStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getBattingAtBats", "getBattingHits", "getBattingHomeRuns", "getBattingAverage", "getBattingRuns", "getBattingRbi", "getBattingStolenBases", "getBattingOnBasePercentage", "getBattingSluggingPercentage", "getPitchingInningsPitched", "getPitchingEarnedRunsAverage", "getPitchingStrikeOuts", "getPitchingWhip", "getPitchingFieldingIndependentPitching", "getPitchingOpponentBattingAvg", "getFieldingPutOuts", "getFieldingAssists", "getFieldingTotalErrors", "getFieldingTotalChances", "getFieldingDoublePlays", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BaseballTopStatsStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopStatsItem> battingAtBats;

    @Nullable
    private final List<TopStatsItem> battingAverage;

    @Nullable
    private final List<TopStatsItem> battingHits;

    @Nullable
    private final List<TopStatsItem> battingHomeRuns;

    @Nullable
    private final List<TopStatsItem> battingOnBasePercentage;

    @Nullable
    private final List<TopStatsItem> battingRbi;

    @Nullable
    private final List<TopStatsItem> battingRuns;

    @Nullable
    private final List<TopStatsItem> battingSluggingPercentage;

    @Nullable
    private final List<TopStatsItem> battingStolenBases;

    @Nullable
    private final List<TopStatsItem> fieldingAssists;

    @Nullable
    private final List<TopStatsItem> fieldingDoublePlays;

    @Nullable
    private final List<TopStatsItem> fieldingPutOuts;

    @Nullable
    private final List<TopStatsItem> fieldingTotalChances;

    @Nullable
    private final List<TopStatsItem> fieldingTotalErrors;

    @Nullable
    private final List<TopStatsItem> pitchingEarnedRunsAverage;

    @Nullable
    private final List<TopStatsItem> pitchingFieldingIndependentPitching;

    @Nullable
    private final List<TopStatsItem> pitchingInningsPitched;

    @Nullable
    private final List<TopStatsItem> pitchingOpponentBattingAvg;

    @Nullable
    private final List<TopStatsItem> pitchingStrikeOuts;

    @Nullable
    private final List<TopStatsItem> pitchingWhip;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new ym1(7)), ypa.a(ysaVar, new ym1(9)), ypa.a(ysaVar, new ym1(10)), ypa.a(ysaVar, new ym1(11)), ypa.a(ysaVar, new ym1(12)), ypa.a(ysaVar, new ym1(13)), ypa.a(ysaVar, new ym1(14)), ypa.a(ysaVar, new ym1(15)), ypa.a(ysaVar, new ym1(16)), ypa.a(ysaVar, new ym1(17)), ypa.a(ysaVar, new ym1(18)), ypa.a(ysaVar, new ym1(19)), ypa.a(ysaVar, new ym1(20)), ypa.a(ysaVar, new ym1(21)), ypa.a(ysaVar, new ym1(22)), ypa.a(ysaVar, new ym1(23)), ypa.a(ysaVar, new ym1(24)), ypa.a(ysaVar, new ym1(25)), ypa.a(ysaVar, new ym1(26)), ypa.a(ysaVar, new ym1(8))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseballTopStatsStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, t5h t5hVar) {
        super(i, t5hVar);
        if (1048575 != (i & 1048575)) {
            oea.z(i, 1048575, BaseballTopStatsStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.battingAtBats = list;
        this.battingHits = list2;
        this.battingHomeRuns = list3;
        this.battingAverage = list4;
        this.battingRuns = list5;
        this.battingRbi = list6;
        this.battingStolenBases = list7;
        this.battingOnBasePercentage = list8;
        this.battingSluggingPercentage = list9;
        this.pitchingInningsPitched = list10;
        this.pitchingEarnedRunsAverage = list11;
        this.pitchingStrikeOuts = list12;
        this.pitchingWhip = list13;
        this.pitchingFieldingIndependentPitching = list14;
        this.pitchingOpponentBattingAvg = list15;
        this.fieldingPutOuts = list16;
        this.fieldingAssists = list17;
        this.fieldingTotalErrors = list18;
        this.fieldingTotalChances = list19;
        this.fieldingDoublePlays = list20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$13() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$14() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$15() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$16() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$17() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$18() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ BaseballTopStatsStatistics copy$default(BaseballTopStatsStatistics baseballTopStatsStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, int i, Object obj) {
        List list21;
        List list22;
        List list23 = (i & 1) != 0 ? baseballTopStatsStatistics.battingAtBats : list;
        List list24 = (i & 2) != 0 ? baseballTopStatsStatistics.battingHits : list2;
        List list25 = (i & 4) != 0 ? baseballTopStatsStatistics.battingHomeRuns : list3;
        List list26 = (i & 8) != 0 ? baseballTopStatsStatistics.battingAverage : list4;
        List list27 = (i & 16) != 0 ? baseballTopStatsStatistics.battingRuns : list5;
        List list28 = (i & 32) != 0 ? baseballTopStatsStatistics.battingRbi : list6;
        List list29 = (i & 64) != 0 ? baseballTopStatsStatistics.battingStolenBases : list7;
        List list30 = (i & 128) != 0 ? baseballTopStatsStatistics.battingOnBasePercentage : list8;
        List list31 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? baseballTopStatsStatistics.battingSluggingPercentage : list9;
        List list32 = (i & 512) != 0 ? baseballTopStatsStatistics.pitchingInningsPitched : list10;
        List list33 = (i & 1024) != 0 ? baseballTopStatsStatistics.pitchingEarnedRunsAverage : list11;
        List list34 = (i & a.o) != 0 ? baseballTopStatsStatistics.pitchingStrikeOuts : list12;
        List list35 = (i & 4096) != 0 ? baseballTopStatsStatistics.pitchingWhip : list13;
        List list36 = (i & 8192) != 0 ? baseballTopStatsStatistics.pitchingFieldingIndependentPitching : list14;
        List list37 = list23;
        List list38 = (i & 16384) != 0 ? baseballTopStatsStatistics.pitchingOpponentBattingAvg : list15;
        List list39 = (i & 32768) != 0 ? baseballTopStatsStatistics.fieldingPutOuts : list16;
        List list40 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? baseballTopStatsStatistics.fieldingAssists : list17;
        List list41 = (i & 131072) != 0 ? baseballTopStatsStatistics.fieldingTotalErrors : list18;
        List list42 = (i & 262144) != 0 ? baseballTopStatsStatistics.fieldingTotalChances : list19;
        if ((i & 524288) != 0) {
            list22 = list42;
            list21 = baseballTopStatsStatistics.fieldingDoublePlays;
        } else {
            list21 = list20;
            list22 = list42;
        }
        return baseballTopStatsStatistics.copy(list37, list24, list25, list26, list27, list28, list29, list30, list31, list32, list33, list34, list35, list36, list38, list39, list40, list41, list22, list21);
    }

    public static final /* synthetic */ void write$Self$model_release(BaseballTopStatsStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.battingAtBats);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.battingHits);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.battingHomeRuns);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.battingAverage);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.battingRuns);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.battingRbi);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.battingStolenBases);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.battingOnBasePercentage);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.battingSluggingPercentage);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.pitchingInningsPitched);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.pitchingEarnedRunsAverage);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.pitchingStrikeOuts);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.pitchingWhip);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.pitchingFieldingIndependentPitching);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.pitchingOpponentBattingAvg);
        output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.fieldingPutOuts);
        output.h(serialDesc, 16, (KSerializer) joaVarArr[16].getValue(), self.fieldingAssists);
        output.h(serialDesc, 17, (KSerializer) joaVarArr[17].getValue(), self.fieldingTotalErrors);
        output.h(serialDesc, 18, (KSerializer) joaVarArr[18].getValue(), self.fieldingTotalChances);
        output.h(serialDesc, 19, (KSerializer) joaVarArr[19].getValue(), self.fieldingDoublePlays);
    }

    @Nullable
    public final List<TopStatsItem> component1() {
        return this.battingAtBats;
    }

    @Nullable
    public final List<TopStatsItem> component10() {
        return this.pitchingInningsPitched;
    }

    @Nullable
    public final List<TopStatsItem> component11() {
        return this.pitchingEarnedRunsAverage;
    }

    @Nullable
    public final List<TopStatsItem> component12() {
        return this.pitchingStrikeOuts;
    }

    @Nullable
    public final List<TopStatsItem> component13() {
        return this.pitchingWhip;
    }

    @Nullable
    public final List<TopStatsItem> component14() {
        return this.pitchingFieldingIndependentPitching;
    }

    @Nullable
    public final List<TopStatsItem> component15() {
        return this.pitchingOpponentBattingAvg;
    }

    @Nullable
    public final List<TopStatsItem> component16() {
        return this.fieldingPutOuts;
    }

    @Nullable
    public final List<TopStatsItem> component17() {
        return this.fieldingAssists;
    }

    @Nullable
    public final List<TopStatsItem> component18() {
        return this.fieldingTotalErrors;
    }

    @Nullable
    public final List<TopStatsItem> component19() {
        return this.fieldingTotalChances;
    }

    @Nullable
    public final List<TopStatsItem> component2() {
        return this.battingHits;
    }

    @Nullable
    public final List<TopStatsItem> component20() {
        return this.fieldingDoublePlays;
    }

    @Nullable
    public final List<TopStatsItem> component3() {
        return this.battingHomeRuns;
    }

    @Nullable
    public final List<TopStatsItem> component4() {
        return this.battingAverage;
    }

    @Nullable
    public final List<TopStatsItem> component5() {
        return this.battingRuns;
    }

    @Nullable
    public final List<TopStatsItem> component6() {
        return this.battingRbi;
    }

    @Nullable
    public final List<TopStatsItem> component7() {
        return this.battingStolenBases;
    }

    @Nullable
    public final List<TopStatsItem> component8() {
        return this.battingOnBasePercentage;
    }

    @Nullable
    public final List<TopStatsItem> component9() {
        return this.battingSluggingPercentage;
    }

    @NotNull
    public final BaseballTopStatsStatistics copy(@Nullable List<TopStatsItem> battingAtBats, @Nullable List<TopStatsItem> battingHits, @Nullable List<TopStatsItem> battingHomeRuns, @Nullable List<TopStatsItem> battingAverage, @Nullable List<TopStatsItem> battingRuns, @Nullable List<TopStatsItem> battingRbi, @Nullable List<TopStatsItem> battingStolenBases, @Nullable List<TopStatsItem> battingOnBasePercentage, @Nullable List<TopStatsItem> battingSluggingPercentage, @Nullable List<TopStatsItem> pitchingInningsPitched, @Nullable List<TopStatsItem> pitchingEarnedRunsAverage, @Nullable List<TopStatsItem> pitchingStrikeOuts, @Nullable List<TopStatsItem> pitchingWhip, @Nullable List<TopStatsItem> pitchingFieldingIndependentPitching, @Nullable List<TopStatsItem> pitchingOpponentBattingAvg, @Nullable List<TopStatsItem> fieldingPutOuts, @Nullable List<TopStatsItem> fieldingAssists, @Nullable List<TopStatsItem> fieldingTotalErrors, @Nullable List<TopStatsItem> fieldingTotalChances, @Nullable List<TopStatsItem> fieldingDoublePlays) {
        return new BaseballTopStatsStatistics(battingAtBats, battingHits, battingHomeRuns, battingAverage, battingRuns, battingRbi, battingStolenBases, battingOnBasePercentage, battingSluggingPercentage, pitchingInningsPitched, pitchingEarnedRunsAverage, pitchingStrikeOuts, pitchingWhip, pitchingFieldingIndependentPitching, pitchingOpponentBattingAvg, fieldingPutOuts, fieldingAssists, fieldingTotalErrors, fieldingTotalChances, fieldingDoublePlays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseballTopStatsStatistics)) {
            return false;
        }
        BaseballTopStatsStatistics baseballTopStatsStatistics = (BaseballTopStatsStatistics) other;
        return Intrinsics.c(this.battingAtBats, baseballTopStatsStatistics.battingAtBats) && Intrinsics.c(this.battingHits, baseballTopStatsStatistics.battingHits) && Intrinsics.c(this.battingHomeRuns, baseballTopStatsStatistics.battingHomeRuns) && Intrinsics.c(this.battingAverage, baseballTopStatsStatistics.battingAverage) && Intrinsics.c(this.battingRuns, baseballTopStatsStatistics.battingRuns) && Intrinsics.c(this.battingRbi, baseballTopStatsStatistics.battingRbi) && Intrinsics.c(this.battingStolenBases, baseballTopStatsStatistics.battingStolenBases) && Intrinsics.c(this.battingOnBasePercentage, baseballTopStatsStatistics.battingOnBasePercentage) && Intrinsics.c(this.battingSluggingPercentage, baseballTopStatsStatistics.battingSluggingPercentage) && Intrinsics.c(this.pitchingInningsPitched, baseballTopStatsStatistics.pitchingInningsPitched) && Intrinsics.c(this.pitchingEarnedRunsAverage, baseballTopStatsStatistics.pitchingEarnedRunsAverage) && Intrinsics.c(this.pitchingStrikeOuts, baseballTopStatsStatistics.pitchingStrikeOuts) && Intrinsics.c(this.pitchingWhip, baseballTopStatsStatistics.pitchingWhip) && Intrinsics.c(this.pitchingFieldingIndependentPitching, baseballTopStatsStatistics.pitchingFieldingIndependentPitching) && Intrinsics.c(this.pitchingOpponentBattingAvg, baseballTopStatsStatistics.pitchingOpponentBattingAvg) && Intrinsics.c(this.fieldingPutOuts, baseballTopStatsStatistics.fieldingPutOuts) && Intrinsics.c(this.fieldingAssists, baseballTopStatsStatistics.fieldingAssists) && Intrinsics.c(this.fieldingTotalErrors, baseballTopStatsStatistics.fieldingTotalErrors) && Intrinsics.c(this.fieldingTotalChances, baseballTopStatsStatistics.fieldingTotalChances) && Intrinsics.c(this.fieldingDoublePlays, baseballTopStatsStatistics.fieldingDoublePlays);
    }

    @Nullable
    public final List<TopStatsItem> getBattingAtBats() {
        return this.battingAtBats;
    }

    @Nullable
    public final List<TopStatsItem> getBattingAverage() {
        return this.battingAverage;
    }

    @Nullable
    public final List<TopStatsItem> getBattingHits() {
        return this.battingHits;
    }

    @Nullable
    public final List<TopStatsItem> getBattingHomeRuns() {
        return this.battingHomeRuns;
    }

    @Nullable
    public final List<TopStatsItem> getBattingOnBasePercentage() {
        return this.battingOnBasePercentage;
    }

    @Nullable
    public final List<TopStatsItem> getBattingRbi() {
        return this.battingRbi;
    }

    @Nullable
    public final List<TopStatsItem> getBattingRuns() {
        return this.battingRuns;
    }

    @Nullable
    public final List<TopStatsItem> getBattingSluggingPercentage() {
        return this.battingSluggingPercentage;
    }

    @Nullable
    public final List<TopStatsItem> getBattingStolenBases() {
        return this.battingStolenBases;
    }

    @Nullable
    public final List<TopStatsItem> getFieldingAssists() {
        return this.fieldingAssists;
    }

    @Nullable
    public final List<TopStatsItem> getFieldingDoublePlays() {
        return this.fieldingDoublePlays;
    }

    @Nullable
    public final List<TopStatsItem> getFieldingPutOuts() {
        return this.fieldingPutOuts;
    }

    @Nullable
    public final List<TopStatsItem> getFieldingTotalChances() {
        return this.fieldingTotalChances;
    }

    @Nullable
    public final List<TopStatsItem> getFieldingTotalErrors() {
        return this.fieldingTotalErrors;
    }

    @Nullable
    public final List<TopStatsItem> getPitchingEarnedRunsAverage() {
        return this.pitchingEarnedRunsAverage;
    }

    @Nullable
    public final List<TopStatsItem> getPitchingFieldingIndependentPitching() {
        return this.pitchingFieldingIndependentPitching;
    }

    @Nullable
    public final List<TopStatsItem> getPitchingInningsPitched() {
        return this.pitchingInningsPitched;
    }

    @Nullable
    public final List<TopStatsItem> getPitchingOpponentBattingAvg() {
        return this.pitchingOpponentBattingAvg;
    }

    @Nullable
    public final List<TopStatsItem> getPitchingStrikeOuts() {
        return this.pitchingStrikeOuts;
    }

    @Nullable
    public final List<TopStatsItem> getPitchingWhip() {
        return this.pitchingWhip;
    }

    public int hashCode() {
        List<TopStatsItem> list = this.battingAtBats;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopStatsItem> list2 = this.battingHits;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopStatsItem> list3 = this.battingHomeRuns;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopStatsItem> list4 = this.battingAverage;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopStatsItem> list5 = this.battingRuns;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopStatsItem> list6 = this.battingRbi;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopStatsItem> list7 = this.battingStolenBases;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopStatsItem> list8 = this.battingOnBasePercentage;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopStatsItem> list9 = this.battingSluggingPercentage;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopStatsItem> list10 = this.pitchingInningsPitched;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopStatsItem> list11 = this.pitchingEarnedRunsAverage;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopStatsItem> list12 = this.pitchingStrikeOuts;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TopStatsItem> list13 = this.pitchingWhip;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TopStatsItem> list14 = this.pitchingFieldingIndependentPitching;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TopStatsItem> list15 = this.pitchingOpponentBattingAvg;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<TopStatsItem> list16 = this.fieldingPutOuts;
        int hashCode16 = (hashCode15 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<TopStatsItem> list17 = this.fieldingAssists;
        int hashCode17 = (hashCode16 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<TopStatsItem> list18 = this.fieldingTotalErrors;
        int hashCode18 = (hashCode17 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<TopStatsItem> list19 = this.fieldingTotalChances;
        int hashCode19 = (hashCode18 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<TopStatsItem> list20 = this.fieldingDoublePlays;
        return hashCode19 + (list20 != null ? list20.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopStatsItem> list = this.battingAtBats;
        List<TopStatsItem> list2 = this.battingHits;
        List<TopStatsItem> list3 = this.battingHomeRuns;
        List<TopStatsItem> list4 = this.battingAverage;
        List<TopStatsItem> list5 = this.battingRuns;
        List<TopStatsItem> list6 = this.battingRbi;
        List<TopStatsItem> list7 = this.battingStolenBases;
        List<TopStatsItem> list8 = this.battingOnBasePercentage;
        List<TopStatsItem> list9 = this.battingSluggingPercentage;
        List<TopStatsItem> list10 = this.pitchingInningsPitched;
        List<TopStatsItem> list11 = this.pitchingEarnedRunsAverage;
        List<TopStatsItem> list12 = this.pitchingStrikeOuts;
        List<TopStatsItem> list13 = this.pitchingWhip;
        List<TopStatsItem> list14 = this.pitchingFieldingIndependentPitching;
        List<TopStatsItem> list15 = this.pitchingOpponentBattingAvg;
        List<TopStatsItem> list16 = this.fieldingPutOuts;
        List<TopStatsItem> list17 = this.fieldingAssists;
        List<TopStatsItem> list18 = this.fieldingTotalErrors;
        List<TopStatsItem> list19 = this.fieldingTotalChances;
        List<TopStatsItem> list20 = this.fieldingDoublePlays;
        StringBuilder s = fc6.s("BaseballTopStatsStatistics(battingAtBats=", ", battingHits=", ", battingHomeRuns=", list, list2);
        vxd.w(s, list3, ", battingAverage=", list4, ", battingRuns=");
        vxd.w(s, list5, ", battingRbi=", list6, ", battingStolenBases=");
        vxd.w(s, list7, ", battingOnBasePercentage=", list8, ", battingSluggingPercentage=");
        vxd.w(s, list9, ", pitchingInningsPitched=", list10, ", pitchingEarnedRunsAverage=");
        vxd.w(s, list11, ", pitchingStrikeOuts=", list12, ", pitchingWhip=");
        vxd.w(s, list13, ", pitchingFieldingIndependentPitching=", list14, ", pitchingOpponentBattingAvg=");
        vxd.w(s, list15, ", fieldingPutOuts=", list16, ", fieldingAssists=");
        vxd.w(s, list17, ", fieldingTotalErrors=", list18, ", fieldingTotalChances=");
        return me4.j(s, list19, ", fieldingDoublePlays=", list20, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/BaseballTopStatsStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/BaseballTopStatsStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballTopStatsStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BaseballTopStatsStatistics(@Nullable List<TopStatsItem> list, @Nullable List<TopStatsItem> list2, @Nullable List<TopStatsItem> list3, @Nullable List<TopStatsItem> list4, @Nullable List<TopStatsItem> list5, @Nullable List<TopStatsItem> list6, @Nullable List<TopStatsItem> list7, @Nullable List<TopStatsItem> list8, @Nullable List<TopStatsItem> list9, @Nullable List<TopStatsItem> list10, @Nullable List<TopStatsItem> list11, @Nullable List<TopStatsItem> list12, @Nullable List<TopStatsItem> list13, @Nullable List<TopStatsItem> list14, @Nullable List<TopStatsItem> list15, @Nullable List<TopStatsItem> list16, @Nullable List<TopStatsItem> list17, @Nullable List<TopStatsItem> list18, @Nullable List<TopStatsItem> list19, @Nullable List<TopStatsItem> list20) {
        super(null);
        this.battingAtBats = list;
        this.battingHits = list2;
        this.battingHomeRuns = list3;
        this.battingAverage = list4;
        this.battingRuns = list5;
        this.battingRbi = list6;
        this.battingStolenBases = list7;
        this.battingOnBasePercentage = list8;
        this.battingSluggingPercentage = list9;
        this.pitchingInningsPitched = list10;
        this.pitchingEarnedRunsAverage = list11;
        this.pitchingStrikeOuts = list12;
        this.pitchingWhip = list13;
        this.pitchingFieldingIndependentPitching = list14;
        this.pitchingOpponentBattingAvg = list15;
        this.fieldingPutOuts = list16;
        this.fieldingAssists = list17;
        this.fieldingTotalErrors = list18;
        this.fieldingTotalChances = list19;
        this.fieldingDoublePlays = list20;
    }
}
