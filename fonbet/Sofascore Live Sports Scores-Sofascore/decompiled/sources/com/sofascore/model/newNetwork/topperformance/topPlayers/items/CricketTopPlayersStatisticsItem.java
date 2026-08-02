package com.sofascore.model.newNetwork.topperformance.topPlayers.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 s2\u00020\u0001:\u0002tsB\u0089\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001f\u0010 B\u009d\u0002\b\u0010\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010(J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010(J\u0012\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b1\u0010*J\u0012\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b2\u0010,J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010(J\u0012\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b4\u0010,J\u0012\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b5\u0010,J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010(J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010(J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010(J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010(J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010(J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010(J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010(J\u0012\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b=\u0010,J\u0012\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b>\u0010,J\u0012\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b?\u0010,J\u0012\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b@\u0010,J\u0012\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bA\u0010*J\u0012\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bB\u0010*JÄ\u0002\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bE\u0010*J\u0010\u0010F\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bF\u0010&J\u001a\u0010J\u001a\u00020I2\b\u0010H\u001a\u0004\u0018\u00010GHÖ\u0003¢\u0006\u0004\bJ\u0010KJ'\u0010T\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u00002\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020OH\u0001¢\u0006\u0004\bR\u0010SR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010U\u001a\u0004\bV\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010W\u001a\u0004\bX\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010Y\u001a\u0004\bZ\u0010*R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010[\u001a\u0004\b\\\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010W\u001a\u0004\b]\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010W\u001a\u0004\b^\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010W\u001a\u0004\b_\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\b`\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010Y\u001a\u0004\ba\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010[\u001a\u0004\bb\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010W\u001a\u0004\bc\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010[\u001a\u0004\bd\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010[\u001a\u0004\be\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010W\u001a\u0004\bf\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010W\u001a\u0004\bg\u0010(R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010W\u001a\u0004\bh\u0010(R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010W\u001a\u0004\bi\u0010(R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010W\u001a\u0004\bj\u0010(R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010W\u001a\u0004\bk\u0010(R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010W\u001a\u0004\bl\u0010(R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010[\u001a\u0004\bm\u0010,R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010[\u001a\u0004\bn\u0010,R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010[\u001a\u0004\bo\u0010,R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010[\u001a\u0004\bp\u0010,R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010Y\u001a\u0004\bq\u0010*R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010Y\u001a\u0004\br\u0010*¨\u0006u"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/CricketTopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseTopPlayersStatisticsItem;", "", "id", "appearances", "", "type", "", CampaignEx.JSON_KEY_STAR, "runsScored", "matches", "battingInnings", "highestScore", "highestScoreVsTeamName", "highestScoreBattingStrikeRate", "highestScoreBattingBalls", "battingAverage", "battingStrikeRate", "hundreds", "fifties", "sixes", "fours", "nineties", "wickets", "fiveWicketsHaul", "overs", "bowlingAverage", "economy", "bowlingStrikeRate", "bowling", "bowlingBestVsTeamName", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/CricketTopPlayersStatisticsItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/CricketTopPlayersStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/String;", "getType", "Ljava/lang/Double;", "getRating", "getRunsScored", "getMatches", "getBattingInnings", "getHighestScore", "getHighestScoreVsTeamName", "getHighestScoreBattingStrikeRate", "getHighestScoreBattingBalls", "getBattingAverage", "getBattingStrikeRate", "getHundreds", "getFifties", "getSixes", "getFours", "getNineties", "getWickets", "getFiveWicketsHaul", "getOvers", "getBowlingAverage", "getEconomy", "getBowlingStrikeRate", "getBowling", "getBowlingBestVsTeamName", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CricketTopPlayersStatisticsItem extends BaseTopPlayersStatisticsItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Double battingAverage;

    @Nullable
    private final Integer battingInnings;

    @Nullable
    private final Double battingStrikeRate;

    @Nullable
    private final String bowling;

    @Nullable
    private final Double bowlingAverage;

    @Nullable
    private final String bowlingBestVsTeamName;

    @Nullable
    private final Double bowlingStrikeRate;

    @Nullable
    private final Double economy;

    @Nullable
    private final Integer fifties;

    @Nullable
    private final Integer fiveWicketsHaul;

    @Nullable
    private final Integer fours;

    @Nullable
    private final Integer highestScore;

    @Nullable
    private final Integer highestScoreBattingBalls;

    @Nullable
    private final Double highestScoreBattingStrikeRate;

    @Nullable
    private final String highestScoreVsTeamName;

    @Nullable
    private final Integer hundreds;
    private final int id;

    @Nullable
    private final Integer matches;

    @Nullable
    private final Integer nineties;

    @Nullable
    private final Double overs;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer runsScored;

    @Nullable
    private final Integer sixes;

    @NotNull
    private final String type;

    @Nullable
    private final Integer wickets;

    public /* synthetic */ CricketTopPlayersStatisticsItem(int i, int i2, Integer num, String str, Double d, Integer num2, Integer num3, Integer num4, Integer num5, String str2, Double d2, Integer num6, Double d3, Double d4, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Double d5, Double d6, Double d7, Double d8, String str3, String str4, t5h t5hVar) {
        if (67108855 != (i & 67108855)) {
            oea.z(i, 67108855, CricketTopPlayersStatisticsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.appearances = num;
        this.type = str;
        if ((i & 8) == 0) {
            this.rating = null;
        } else {
            this.rating = d;
        }
        this.runsScored = num2;
        this.matches = num3;
        this.battingInnings = num4;
        this.highestScore = num5;
        this.highestScoreVsTeamName = str2;
        this.highestScoreBattingStrikeRate = d2;
        this.highestScoreBattingBalls = num6;
        this.battingAverage = d3;
        this.battingStrikeRate = d4;
        this.hundreds = num7;
        this.fifties = num8;
        this.sixes = num9;
        this.fours = num10;
        this.nineties = num11;
        this.wickets = num12;
        this.fiveWicketsHaul = num13;
        this.overs = d5;
        this.bowlingAverage = d6;
        this.economy = d7;
        this.bowlingStrikeRate = d8;
        this.bowling = str3;
        this.bowlingBestVsTeamName = str4;
    }

    public static /* synthetic */ CricketTopPlayersStatisticsItem copy$default(CricketTopPlayersStatisticsItem cricketTopPlayersStatisticsItem, int i, Integer num, String str, Double d, Integer num2, Integer num3, Integer num4, Integer num5, String str2, Double d2, Integer num6, Double d3, Double d4, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Double d5, Double d6, Double d7, Double d8, String str3, String str4, int i2, Object obj) {
        String str5;
        String str6;
        int i3 = (i2 & 1) != 0 ? cricketTopPlayersStatisticsItem.id : i;
        Integer num14 = (i2 & 2) != 0 ? cricketTopPlayersStatisticsItem.appearances : num;
        String str7 = (i2 & 4) != 0 ? cricketTopPlayersStatisticsItem.type : str;
        Double d9 = (i2 & 8) != 0 ? cricketTopPlayersStatisticsItem.rating : d;
        Integer num15 = (i2 & 16) != 0 ? cricketTopPlayersStatisticsItem.runsScored : num2;
        Integer num16 = (i2 & 32) != 0 ? cricketTopPlayersStatisticsItem.matches : num3;
        Integer num17 = (i2 & 64) != 0 ? cricketTopPlayersStatisticsItem.battingInnings : num4;
        Integer num18 = (i2 & 128) != 0 ? cricketTopPlayersStatisticsItem.highestScore : num5;
        String str8 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? cricketTopPlayersStatisticsItem.highestScoreVsTeamName : str2;
        Double d10 = (i2 & 512) != 0 ? cricketTopPlayersStatisticsItem.highestScoreBattingStrikeRate : d2;
        Integer num19 = (i2 & 1024) != 0 ? cricketTopPlayersStatisticsItem.highestScoreBattingBalls : num6;
        Double d11 = (i2 & a.o) != 0 ? cricketTopPlayersStatisticsItem.battingAverage : d3;
        Double d12 = (i2 & 4096) != 0 ? cricketTopPlayersStatisticsItem.battingStrikeRate : d4;
        Integer num20 = (i2 & 8192) != 0 ? cricketTopPlayersStatisticsItem.hundreds : num7;
        int i4 = i3;
        Integer num21 = (i2 & 16384) != 0 ? cricketTopPlayersStatisticsItem.fifties : num8;
        Integer num22 = (i2 & 32768) != 0 ? cricketTopPlayersStatisticsItem.sixes : num9;
        Integer num23 = (i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? cricketTopPlayersStatisticsItem.fours : num10;
        Integer num24 = (i2 & 131072) != 0 ? cricketTopPlayersStatisticsItem.nineties : num11;
        Integer num25 = (i2 & 262144) != 0 ? cricketTopPlayersStatisticsItem.wickets : num12;
        Integer num26 = (i2 & 524288) != 0 ? cricketTopPlayersStatisticsItem.fiveWicketsHaul : num13;
        Double d13 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? cricketTopPlayersStatisticsItem.overs : d5;
        Double d14 = (i2 & 2097152) != 0 ? cricketTopPlayersStatisticsItem.bowlingAverage : d6;
        Double d15 = (i2 & 4194304) != 0 ? cricketTopPlayersStatisticsItem.economy : d7;
        Double d16 = (i2 & 8388608) != 0 ? cricketTopPlayersStatisticsItem.bowlingStrikeRate : d8;
        String str9 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? cricketTopPlayersStatisticsItem.bowling : str3;
        if ((i2 & 33554432) != 0) {
            str6 = str9;
            str5 = cricketTopPlayersStatisticsItem.bowlingBestVsTeamName;
        } else {
            str5 = str4;
            str6 = str9;
        }
        return cricketTopPlayersStatisticsItem.copy(i4, num14, str7, d9, num15, num16, num17, num18, str8, d10, num19, d11, d12, num20, num21, num22, num23, num24, num25, num26, d13, d14, d15, d16, str6, str5);
    }

    public static final /* synthetic */ void write$Self$model_release(CricketTopPlayersStatisticsItem self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.getAppearances());
        output.y(serialDesc, 2, self.getType());
        if (output.o(serialDesc) || self.getRating() != null) {
            output.h(serialDesc, 3, h75.a, self.getRating());
        }
        output.h(serialDesc, 4, a7aVar, self.runsScored);
        output.h(serialDesc, 5, a7aVar, self.matches);
        output.h(serialDesc, 6, a7aVar, self.battingInnings);
        output.h(serialDesc, 7, a7aVar, self.highestScore);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 8, uhiVar, self.highestScoreVsTeamName);
        h75 h75Var = h75.a;
        output.h(serialDesc, 9, h75Var, self.highestScoreBattingStrikeRate);
        output.h(serialDesc, 10, a7aVar, self.highestScoreBattingBalls);
        output.h(serialDesc, 11, h75Var, self.battingAverage);
        output.h(serialDesc, 12, h75Var, self.battingStrikeRate);
        output.h(serialDesc, 13, a7aVar, self.hundreds);
        output.h(serialDesc, 14, a7aVar, self.fifties);
        output.h(serialDesc, 15, a7aVar, self.sixes);
        output.h(serialDesc, 16, a7aVar, self.fours);
        output.h(serialDesc, 17, a7aVar, self.nineties);
        output.h(serialDesc, 18, a7aVar, self.wickets);
        output.h(serialDesc, 19, a7aVar, self.fiveWicketsHaul);
        output.h(serialDesc, 20, h75Var, self.overs);
        output.h(serialDesc, 21, h75Var, self.bowlingAverage);
        output.h(serialDesc, 22, h75Var, self.economy);
        output.h(serialDesc, 23, h75Var, self.bowlingStrikeRate);
        output.h(serialDesc, 24, uhiVar, self.bowling);
        output.h(serialDesc, 25, uhiVar, self.bowlingBestVsTeamName);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getHighestScoreBattingStrikeRate() {
        return this.highestScoreBattingStrikeRate;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getHighestScoreBattingBalls() {
        return this.highestScoreBattingBalls;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getBattingAverage() {
        return this.battingAverage;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Double getBattingStrikeRate() {
        return this.battingStrikeRate;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getHundreds() {
        return this.hundreds;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getFifties() {
        return this.fifties;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getSixes() {
        return this.sixes;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getFours() {
        return this.fours;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getNineties() {
        return this.nineties;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getWickets() {
        return this.wickets;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getFiveWicketsHaul() {
        return this.fiveWicketsHaul;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Double getOvers() {
        return this.overs;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Double getBowlingAverage() {
        return this.bowlingAverage;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Double getEconomy() {
        return this.economy;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Double getBowlingStrikeRate() {
        return this.bowlingStrikeRate;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final String getBowling() {
        return this.bowling;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final String getBowlingBestVsTeamName() {
        return this.bowlingBestVsTeamName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getRunsScored() {
        return this.runsScored;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getBattingInnings() {
        return this.battingInnings;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getHighestScore() {
        return this.highestScore;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getHighestScoreVsTeamName() {
        return this.highestScoreVsTeamName;
    }

    @NotNull
    public final CricketTopPlayersStatisticsItem copy(int id, @Nullable Integer appearances, @NotNull String type, @Nullable Double rating, @Nullable Integer runsScored, @Nullable Integer matches, @Nullable Integer battingInnings, @Nullable Integer highestScore, @Nullable String highestScoreVsTeamName, @Nullable Double highestScoreBattingStrikeRate, @Nullable Integer highestScoreBattingBalls, @Nullable Double battingAverage, @Nullable Double battingStrikeRate, @Nullable Integer hundreds, @Nullable Integer fifties, @Nullable Integer sixes, @Nullable Integer fours, @Nullable Integer nineties, @Nullable Integer wickets, @Nullable Integer fiveWicketsHaul, @Nullable Double overs, @Nullable Double bowlingAverage, @Nullable Double economy, @Nullable Double bowlingStrikeRate, @Nullable String bowling, @Nullable String bowlingBestVsTeamName) {
        type.getClass();
        return new CricketTopPlayersStatisticsItem(id, appearances, type, rating, runsScored, matches, battingInnings, highestScore, highestScoreVsTeamName, highestScoreBattingStrikeRate, highestScoreBattingBalls, battingAverage, battingStrikeRate, hundreds, fifties, sixes, fours, nineties, wickets, fiveWicketsHaul, overs, bowlingAverage, economy, bowlingStrikeRate, bowling, bowlingBestVsTeamName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CricketTopPlayersStatisticsItem)) {
            return false;
        }
        CricketTopPlayersStatisticsItem cricketTopPlayersStatisticsItem = (CricketTopPlayersStatisticsItem) other;
        return this.id == cricketTopPlayersStatisticsItem.id && Intrinsics.c(this.appearances, cricketTopPlayersStatisticsItem.appearances) && Intrinsics.c(this.type, cricketTopPlayersStatisticsItem.type) && Intrinsics.c(this.rating, cricketTopPlayersStatisticsItem.rating) && Intrinsics.c(this.runsScored, cricketTopPlayersStatisticsItem.runsScored) && Intrinsics.c(this.matches, cricketTopPlayersStatisticsItem.matches) && Intrinsics.c(this.battingInnings, cricketTopPlayersStatisticsItem.battingInnings) && Intrinsics.c(this.highestScore, cricketTopPlayersStatisticsItem.highestScore) && Intrinsics.c(this.highestScoreVsTeamName, cricketTopPlayersStatisticsItem.highestScoreVsTeamName) && Intrinsics.c(this.highestScoreBattingStrikeRate, cricketTopPlayersStatisticsItem.highestScoreBattingStrikeRate) && Intrinsics.c(this.highestScoreBattingBalls, cricketTopPlayersStatisticsItem.highestScoreBattingBalls) && Intrinsics.c(this.battingAverage, cricketTopPlayersStatisticsItem.battingAverage) && Intrinsics.c(this.battingStrikeRate, cricketTopPlayersStatisticsItem.battingStrikeRate) && Intrinsics.c(this.hundreds, cricketTopPlayersStatisticsItem.hundreds) && Intrinsics.c(this.fifties, cricketTopPlayersStatisticsItem.fifties) && Intrinsics.c(this.sixes, cricketTopPlayersStatisticsItem.sixes) && Intrinsics.c(this.fours, cricketTopPlayersStatisticsItem.fours) && Intrinsics.c(this.nineties, cricketTopPlayersStatisticsItem.nineties) && Intrinsics.c(this.wickets, cricketTopPlayersStatisticsItem.wickets) && Intrinsics.c(this.fiveWicketsHaul, cricketTopPlayersStatisticsItem.fiveWicketsHaul) && Intrinsics.c(this.overs, cricketTopPlayersStatisticsItem.overs) && Intrinsics.c(this.bowlingAverage, cricketTopPlayersStatisticsItem.bowlingAverage) && Intrinsics.c(this.economy, cricketTopPlayersStatisticsItem.economy) && Intrinsics.c(this.bowlingStrikeRate, cricketTopPlayersStatisticsItem.bowlingStrikeRate) && Intrinsics.c(this.bowling, cricketTopPlayersStatisticsItem.bowling) && Intrinsics.c(this.bowlingBestVsTeamName, cricketTopPlayersStatisticsItem.bowlingBestVsTeamName);
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @Nullable
    public Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    public final Double getBattingAverage() {
        return this.battingAverage;
    }

    @Nullable
    public final Integer getBattingInnings() {
        return this.battingInnings;
    }

    @Nullable
    public final Double getBattingStrikeRate() {
        return this.battingStrikeRate;
    }

    @Nullable
    public final String getBowling() {
        return this.bowling;
    }

    @Nullable
    public final Double getBowlingAverage() {
        return this.bowlingAverage;
    }

    @Nullable
    public final String getBowlingBestVsTeamName() {
        return this.bowlingBestVsTeamName;
    }

    @Nullable
    public final Double getBowlingStrikeRate() {
        return this.bowlingStrikeRate;
    }

    @Nullable
    public final Double getEconomy() {
        return this.economy;
    }

    @Nullable
    public final Integer getFifties() {
        return this.fifties;
    }

    @Nullable
    public final Integer getFiveWicketsHaul() {
        return this.fiveWicketsHaul;
    }

    @Nullable
    public final Integer getFours() {
        return this.fours;
    }

    @Nullable
    public final Integer getHighestScore() {
        return this.highestScore;
    }

    @Nullable
    public final Integer getHighestScoreBattingBalls() {
        return this.highestScoreBattingBalls;
    }

    @Nullable
    public final Double getHighestScoreBattingStrikeRate() {
        return this.highestScoreBattingStrikeRate;
    }

    @Nullable
    public final String getHighestScoreVsTeamName() {
        return this.highestScoreVsTeamName;
    }

    @Nullable
    public final Integer getHundreds() {
        return this.hundreds;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    public final Integer getNineties() {
        return this.nineties;
    }

    @Nullable
    public final Double getOvers() {
        return this.overs;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getRunsScored() {
        return this.runsScored;
    }

    @Nullable
    public final Integer getSixes() {
        return this.sixes;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @NotNull
    public String getType() {
        return this.type;
    }

    @Nullable
    public final Integer getWickets() {
        return this.wickets;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.appearances;
        int c = dmi.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.type);
        Double d = this.rating;
        int hashCode2 = (c + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.runsScored;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.matches;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.battingInnings;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.highestScore;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str = this.highestScoreVsTeamName;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.highestScoreBattingStrikeRate;
        int hashCode8 = (hashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num6 = this.highestScoreBattingBalls;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Double d3 = this.battingAverage;
        int hashCode10 = (hashCode9 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.battingStrikeRate;
        int hashCode11 = (hashCode10 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num7 = this.hundreds;
        int hashCode12 = (hashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.fifties;
        int hashCode13 = (hashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.sixes;
        int hashCode14 = (hashCode13 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.fours;
        int hashCode15 = (hashCode14 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.nineties;
        int hashCode16 = (hashCode15 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.wickets;
        int hashCode17 = (hashCode16 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.fiveWicketsHaul;
        int hashCode18 = (hashCode17 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Double d5 = this.overs;
        int hashCode19 = (hashCode18 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.bowlingAverage;
        int hashCode20 = (hashCode19 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.economy;
        int hashCode21 = (hashCode20 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.bowlingStrikeRate;
        int hashCode22 = (hashCode21 + (d8 == null ? 0 : d8.hashCode())) * 31;
        String str2 = this.bowling;
        int hashCode23 = (hashCode22 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bowlingBestVsTeamName;
        return hashCode23 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Integer num = this.appearances;
        String str = this.type;
        Double d = this.rating;
        Integer num2 = this.runsScored;
        Integer num3 = this.matches;
        Integer num4 = this.battingInnings;
        Integer num5 = this.highestScore;
        String str2 = this.highestScoreVsTeamName;
        Double d2 = this.highestScoreBattingStrikeRate;
        Integer num6 = this.highestScoreBattingBalls;
        Double d3 = this.battingAverage;
        Double d4 = this.battingStrikeRate;
        Integer num7 = this.hundreds;
        Integer num8 = this.fifties;
        Integer num9 = this.sixes;
        Integer num10 = this.fours;
        Integer num11 = this.nineties;
        Integer num12 = this.wickets;
        Integer num13 = this.fiveWicketsHaul;
        Double d5 = this.overs;
        Double d6 = this.bowlingAverage;
        Double d7 = this.economy;
        Double d8 = this.bowlingStrikeRate;
        String str3 = this.bowling;
        String str4 = this.bowlingBestVsTeamName;
        StringBuilder r = fc6.r("CricketTopPlayersStatisticsItem(id=", ", appearances=", ", type=", num, i);
        r.append(str);
        r.append(", rating=");
        r.append(d);
        r.append(", runsScored=");
        vxd.r(num2, num3, ", matches=", ", battingInnings=", r);
        vxd.r(num4, num5, ", highestScore=", ", highestScoreVsTeamName=", r);
        r.append(str2);
        r.append(", highestScoreBattingStrikeRate=");
        r.append(d2);
        r.append(", highestScoreBattingBalls=");
        fn0.v(d3, num6, ", battingAverage=", ", battingStrikeRate=", r);
        mz1.x(d4, num7, ", hundreds=", ", fifties=", r);
        vxd.r(num8, num9, ", sixes=", ", fours=", r);
        vxd.r(num10, num11, ", nineties=", ", wickets=", r);
        vxd.r(num12, num13, ", fiveWicketsHaul=", ", overs=", r);
        fc6.A(r, d5, ", bowlingAverage=", d6, ", economy=");
        fc6.A(r, d7, ", bowlingStrikeRate=", d8, ", bowling=");
        return fc6.o(r, str3, ", bowlingBestVsTeamName=", str4, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/CricketTopPlayersStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/CricketTopPlayersStatisticsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CricketTopPlayersStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CricketTopPlayersStatisticsItem(int i, @Nullable Integer num, @NotNull String str, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str2, @Nullable Double d2, @Nullable Integer num6, @Nullable Double d3, @Nullable Double d4, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Double d5, @Nullable Double d6, @Nullable Double d7, @Nullable Double d8, @Nullable String str3, @Nullable String str4) {
        str.getClass();
        this.id = i;
        this.appearances = num;
        this.type = str;
        this.rating = d;
        this.runsScored = num2;
        this.matches = num3;
        this.battingInnings = num4;
        this.highestScore = num5;
        this.highestScoreVsTeamName = str2;
        this.highestScoreBattingStrikeRate = d2;
        this.highestScoreBattingBalls = num6;
        this.battingAverage = d3;
        this.battingStrikeRate = d4;
        this.hundreds = num7;
        this.fifties = num8;
        this.sixes = num9;
        this.fours = num10;
        this.nineties = num11;
        this.wickets = num12;
        this.fiveWicketsHaul = num13;
        this.overs = d5;
        this.bowlingAverage = d6;
        this.economy = d7;
        this.bowlingStrikeRate = d8;
        this.bowling = str3;
        this.bowlingBestVsTeamName = str4;
    }

    public /* synthetic */ CricketTopPlayersStatisticsItem(int i, Integer num, String str, Double d, Integer num2, Integer num3, Integer num4, Integer num5, String str2, Double d2, Integer num6, Double d3, Double d4, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Double d5, Double d6, Double d7, Double d8, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, str, (i2 & 8) != 0 ? null : d, num2, num3, num4, num5, str2, d2, num6, d3, d4, num7, num8, num9, num10, num11, num12, num13, d5, d6, d7, d8, str3, str4);
    }
}
