package com.sofascore.model.newNetwork.topperformance.topTeams.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 o2\u00020\u0001:\u0002poBý\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eB\u0091\u0002\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b-\u0010+J\u0012\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b.\u0010+J\u0012\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u0010+J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010'J\u0012\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b1\u0010+J\u0012\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b2\u0010+J\u0012\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b3\u0010+J\u0012\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b4\u0010+J\u0012\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b5\u0010+J\u0012\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b6\u0010+J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010'J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010'J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010'J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010'J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010'J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010'J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010'J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b>\u0010'J¸\u0002\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020AHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bD\u0010$J\u001a\u0010H\u001a\u00020G2\b\u0010F\u001a\u0004\u0018\u00010EHÖ\u0003¢\u0006\u0004\bH\u0010IJ'\u0010R\u001a\u00020O2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0001¢\u0006\u0004\bP\u0010QR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010$R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010S\u001a\u0004\bU\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010V\u001a\u0004\bW\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010V\u001a\u0004\bX\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bY\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010Z\u001a\u0004\b[\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010Z\u001a\u0004\b\\\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\b]\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010Z\u001a\u0004\b^\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010Z\u001a\u0004\b_\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010V\u001a\u0004\b`\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\ba\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\bb\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010Z\u001a\u0004\bc\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010Z\u001a\u0004\bd\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010Z\u001a\u0004\be\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010Z\u001a\u0004\bf\u0010+R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010V\u001a\u0004\bg\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\bh\u0010'R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\bi\u0010'R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010V\u001a\u0004\bj\u0010'R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010V\u001a\u0004\bk\u0010'R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010V\u001a\u0004\bl\u0010'R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010V\u001a\u0004\bm\u0010'R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010V\u001a\u0004\bn\u0010'¨\u0006q"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BasketballTopTeamsStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BaseTopTeamsStatisticsItem;", "", "id", "matches", "points", "pointsAgainst", "plusMinus", "", "fieldGoalsPercentage", "fieldGoalsPercentageAgainst", "freeThrowsPercentage", "threePointsPercentage", "threePointsPercentageAgainst", "threePointsMade", "trueShootingPercentage", "effectiveFieldGoalPercentage", "pace", "offensiveRating", "defensiveRating", "netRating", "assists", "rebounds", "defensiveRebounds", "offensiveRebounds", "steals", "turnovers", "blocks", "fastbreakPoints", "<init>", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "()Ljava/lang/Double;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BasketballTopTeamsStatisticsItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BasketballTopTeamsStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "getMatches", "Ljava/lang/Integer;", "getPoints", "getPointsAgainst", "getPlusMinus", "Ljava/lang/Double;", "getFieldGoalsPercentage", "getFieldGoalsPercentageAgainst", "getFreeThrowsPercentage", "getThreePointsPercentage", "getThreePointsPercentageAgainst", "getThreePointsMade", "getTrueShootingPercentage", "getEffectiveFieldGoalPercentage", "getPace", "getOffensiveRating", "getDefensiveRating", "getNetRating", "getAssists", "getRebounds", "getDefensiveRebounds", "getOffensiveRebounds", "getSteals", "getTurnovers", "getBlocks", "getFastbreakPoints", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BasketballTopTeamsStatisticsItem extends BaseTopTeamsStatisticsItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer blocks;

    @Nullable
    private final Double defensiveRating;

    @Nullable
    private final Integer defensiveRebounds;

    @Nullable
    private final Double effectiveFieldGoalPercentage;

    @Nullable
    private final Integer fastbreakPoints;

    @Nullable
    private final Double fieldGoalsPercentage;

    @Nullable
    private final Double fieldGoalsPercentageAgainst;

    @Nullable
    private final Double freeThrowsPercentage;
    private final int id;
    private final int matches;

    @Nullable
    private final Double netRating;

    @Nullable
    private final Double offensiveRating;

    @Nullable
    private final Integer offensiveRebounds;

    @Nullable
    private final Double pace;

    @Nullable
    private final Integer plusMinus;

    @Nullable
    private final Integer points;

    @Nullable
    private final Integer pointsAgainst;

    @Nullable
    private final Integer rebounds;

    @Nullable
    private final Integer steals;

    @Nullable
    private final Integer threePointsMade;

    @Nullable
    private final Double threePointsPercentage;

    @Nullable
    private final Double threePointsPercentageAgainst;

    @Nullable
    private final Double trueShootingPercentage;

    @Nullable
    private final Integer turnovers;

    public /* synthetic */ BasketballTopTeamsStatisticsItem(int i, int i2, int i3, Integer num, Integer num2, Integer num3, Double d, Double d2, Double d3, Double d4, Double d5, Integer num4, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, t5h t5hVar) {
        if (33554431 != (i & 33554431)) {
            oea.z(i, 33554431, BasketballTopTeamsStatisticsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.matches = i3;
        this.points = num;
        this.pointsAgainst = num2;
        this.plusMinus = num3;
        this.fieldGoalsPercentage = d;
        this.fieldGoalsPercentageAgainst = d2;
        this.freeThrowsPercentage = d3;
        this.threePointsPercentage = d4;
        this.threePointsPercentageAgainst = d5;
        this.threePointsMade = num4;
        this.trueShootingPercentage = d6;
        this.effectiveFieldGoalPercentage = d7;
        this.pace = d8;
        this.offensiveRating = d9;
        this.defensiveRating = d10;
        this.netRating = d11;
        this.assists = num5;
        this.rebounds = num6;
        this.defensiveRebounds = num7;
        this.offensiveRebounds = num8;
        this.steals = num9;
        this.turnovers = num10;
        this.blocks = num11;
        this.fastbreakPoints = num12;
    }

    public static /* synthetic */ BasketballTopTeamsStatisticsItem copy$default(BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem, int i, int i2, Integer num, Integer num2, Integer num3, Double d, Double d2, Double d3, Double d4, Double d5, Integer num4, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i3, Object obj) {
        Integer num13;
        Integer num14;
        int i4 = (i3 & 1) != 0 ? basketballTopTeamsStatisticsItem.id : i;
        int i5 = (i3 & 2) != 0 ? basketballTopTeamsStatisticsItem.matches : i2;
        Integer num15 = (i3 & 4) != 0 ? basketballTopTeamsStatisticsItem.points : num;
        Integer num16 = (i3 & 8) != 0 ? basketballTopTeamsStatisticsItem.pointsAgainst : num2;
        Integer num17 = (i3 & 16) != 0 ? basketballTopTeamsStatisticsItem.plusMinus : num3;
        Double d12 = (i3 & 32) != 0 ? basketballTopTeamsStatisticsItem.fieldGoalsPercentage : d;
        Double d13 = (i3 & 64) != 0 ? basketballTopTeamsStatisticsItem.fieldGoalsPercentageAgainst : d2;
        Double d14 = (i3 & 128) != 0 ? basketballTopTeamsStatisticsItem.freeThrowsPercentage : d3;
        Double d15 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? basketballTopTeamsStatisticsItem.threePointsPercentage : d4;
        Double d16 = (i3 & 512) != 0 ? basketballTopTeamsStatisticsItem.threePointsPercentageAgainst : d5;
        Integer num18 = (i3 & 1024) != 0 ? basketballTopTeamsStatisticsItem.threePointsMade : num4;
        Double d17 = (i3 & a.o) != 0 ? basketballTopTeamsStatisticsItem.trueShootingPercentage : d6;
        Double d18 = (i3 & 4096) != 0 ? basketballTopTeamsStatisticsItem.effectiveFieldGoalPercentage : d7;
        Double d19 = (i3 & 8192) != 0 ? basketballTopTeamsStatisticsItem.pace : d8;
        int i6 = i4;
        Double d20 = (i3 & 16384) != 0 ? basketballTopTeamsStatisticsItem.offensiveRating : d9;
        Double d21 = (i3 & 32768) != 0 ? basketballTopTeamsStatisticsItem.defensiveRating : d10;
        Double d22 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? basketballTopTeamsStatisticsItem.netRating : d11;
        Integer num19 = (i3 & 131072) != 0 ? basketballTopTeamsStatisticsItem.assists : num5;
        Integer num20 = (i3 & 262144) != 0 ? basketballTopTeamsStatisticsItem.rebounds : num6;
        Integer num21 = (i3 & 524288) != 0 ? basketballTopTeamsStatisticsItem.defensiveRebounds : num7;
        Integer num22 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? basketballTopTeamsStatisticsItem.offensiveRebounds : num8;
        Integer num23 = (i3 & 2097152) != 0 ? basketballTopTeamsStatisticsItem.steals : num9;
        Integer num24 = (i3 & 4194304) != 0 ? basketballTopTeamsStatisticsItem.turnovers : num10;
        Integer num25 = (i3 & 8388608) != 0 ? basketballTopTeamsStatisticsItem.blocks : num11;
        if ((i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0) {
            num14 = num25;
            num13 = basketballTopTeamsStatisticsItem.fastbreakPoints;
        } else {
            num13 = num12;
            num14 = num25;
        }
        return basketballTopTeamsStatisticsItem.copy(i6, i5, num15, num16, num17, d12, d13, d14, d15, d16, num18, d17, d18, d19, d20, d21, d22, num19, num20, num21, num22, num23, num24, num14, num13);
    }

    public static final /* synthetic */ void write$Self$model_release(BasketballTopTeamsStatisticsItem self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        output.u(1, self.getMatches(), serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.points);
        output.h(serialDesc, 3, a7aVar, self.pointsAgainst);
        output.h(serialDesc, 4, a7aVar, self.plusMinus);
        h75 h75Var = h75.a;
        output.h(serialDesc, 5, h75Var, self.fieldGoalsPercentage);
        output.h(serialDesc, 6, h75Var, self.fieldGoalsPercentageAgainst);
        output.h(serialDesc, 7, h75Var, self.freeThrowsPercentage);
        output.h(serialDesc, 8, h75Var, self.threePointsPercentage);
        output.h(serialDesc, 9, h75Var, self.threePointsPercentageAgainst);
        output.h(serialDesc, 10, a7aVar, self.threePointsMade);
        output.h(serialDesc, 11, h75Var, self.trueShootingPercentage);
        output.h(serialDesc, 12, h75Var, self.effectiveFieldGoalPercentage);
        output.h(serialDesc, 13, h75Var, self.pace);
        output.h(serialDesc, 14, h75Var, self.offensiveRating);
        output.h(serialDesc, 15, h75Var, self.defensiveRating);
        output.h(serialDesc, 16, h75Var, self.netRating);
        output.h(serialDesc, 17, a7aVar, self.assists);
        output.h(serialDesc, 18, a7aVar, self.rebounds);
        output.h(serialDesc, 19, a7aVar, self.defensiveRebounds);
        output.h(serialDesc, 20, a7aVar, self.offensiveRebounds);
        output.h(serialDesc, 21, a7aVar, self.steals);
        output.h(serialDesc, 22, a7aVar, self.turnovers);
        output.h(serialDesc, 23, a7aVar, self.blocks);
        output.h(serialDesc, 24, a7aVar, self.fastbreakPoints);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getThreePointsPercentageAgainst() {
        return this.threePointsPercentageAgainst;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Double getTrueShootingPercentage() {
        return this.trueShootingPercentage;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Double getEffectiveFieldGoalPercentage() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Double getPace() {
        return this.pace;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Double getOffensiveRating() {
        return this.offensiveRating;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Double getDefensiveRating() {
        return this.defensiveRating;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Double getNetRating() {
        return this.netRating;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getRebounds() {
        return this.rebounds;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMatches() {
        return this.matches;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Integer getTurnovers() {
        return this.turnovers;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final Integer getBlocks() {
        return this.blocks;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getFastbreakPoints() {
        return this.fastbreakPoints;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getPointsAgainst() {
        return this.pointsAgainst;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getFieldGoalsPercentage() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getFieldGoalsPercentageAgainst() {
        return this.fieldGoalsPercentageAgainst;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getFreeThrowsPercentage() {
        return this.freeThrowsPercentage;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Double getThreePointsPercentage() {
        return this.threePointsPercentage;
    }

    @NotNull
    public final BasketballTopTeamsStatisticsItem copy(int id, int matches, @Nullable Integer points, @Nullable Integer pointsAgainst, @Nullable Integer plusMinus, @Nullable Double fieldGoalsPercentage, @Nullable Double fieldGoalsPercentageAgainst, @Nullable Double freeThrowsPercentage, @Nullable Double threePointsPercentage, @Nullable Double threePointsPercentageAgainst, @Nullable Integer threePointsMade, @Nullable Double trueShootingPercentage, @Nullable Double effectiveFieldGoalPercentage, @Nullable Double pace, @Nullable Double offensiveRating, @Nullable Double defensiveRating, @Nullable Double netRating, @Nullable Integer assists, @Nullable Integer rebounds, @Nullable Integer defensiveRebounds, @Nullable Integer offensiveRebounds, @Nullable Integer steals, @Nullable Integer turnovers, @Nullable Integer blocks, @Nullable Integer fastbreakPoints) {
        return new BasketballTopTeamsStatisticsItem(id, matches, points, pointsAgainst, plusMinus, fieldGoalsPercentage, fieldGoalsPercentageAgainst, freeThrowsPercentage, threePointsPercentage, threePointsPercentageAgainst, threePointsMade, trueShootingPercentage, effectiveFieldGoalPercentage, pace, offensiveRating, defensiveRating, netRating, assists, rebounds, defensiveRebounds, offensiveRebounds, steals, turnovers, blocks, fastbreakPoints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketballTopTeamsStatisticsItem)) {
            return false;
        }
        BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem = (BasketballTopTeamsStatisticsItem) other;
        return this.id == basketballTopTeamsStatisticsItem.id && this.matches == basketballTopTeamsStatisticsItem.matches && Intrinsics.c(this.points, basketballTopTeamsStatisticsItem.points) && Intrinsics.c(this.pointsAgainst, basketballTopTeamsStatisticsItem.pointsAgainst) && Intrinsics.c(this.plusMinus, basketballTopTeamsStatisticsItem.plusMinus) && Intrinsics.c(this.fieldGoalsPercentage, basketballTopTeamsStatisticsItem.fieldGoalsPercentage) && Intrinsics.c(this.fieldGoalsPercentageAgainst, basketballTopTeamsStatisticsItem.fieldGoalsPercentageAgainst) && Intrinsics.c(this.freeThrowsPercentage, basketballTopTeamsStatisticsItem.freeThrowsPercentage) && Intrinsics.c(this.threePointsPercentage, basketballTopTeamsStatisticsItem.threePointsPercentage) && Intrinsics.c(this.threePointsPercentageAgainst, basketballTopTeamsStatisticsItem.threePointsPercentageAgainst) && Intrinsics.c(this.threePointsMade, basketballTopTeamsStatisticsItem.threePointsMade) && Intrinsics.c(this.trueShootingPercentage, basketballTopTeamsStatisticsItem.trueShootingPercentage) && Intrinsics.c(this.effectiveFieldGoalPercentage, basketballTopTeamsStatisticsItem.effectiveFieldGoalPercentage) && Intrinsics.c(this.pace, basketballTopTeamsStatisticsItem.pace) && Intrinsics.c(this.offensiveRating, basketballTopTeamsStatisticsItem.offensiveRating) && Intrinsics.c(this.defensiveRating, basketballTopTeamsStatisticsItem.defensiveRating) && Intrinsics.c(this.netRating, basketballTopTeamsStatisticsItem.netRating) && Intrinsics.c(this.assists, basketballTopTeamsStatisticsItem.assists) && Intrinsics.c(this.rebounds, basketballTopTeamsStatisticsItem.rebounds) && Intrinsics.c(this.defensiveRebounds, basketballTopTeamsStatisticsItem.defensiveRebounds) && Intrinsics.c(this.offensiveRebounds, basketballTopTeamsStatisticsItem.offensiveRebounds) && Intrinsics.c(this.steals, basketballTopTeamsStatisticsItem.steals) && Intrinsics.c(this.turnovers, basketballTopTeamsStatisticsItem.turnovers) && Intrinsics.c(this.blocks, basketballTopTeamsStatisticsItem.blocks) && Intrinsics.c(this.fastbreakPoints, basketballTopTeamsStatisticsItem.fastbreakPoints);
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final Integer getBlocks() {
        return this.blocks;
    }

    @Nullable
    public final Double getDefensiveRating() {
        return this.defensiveRating;
    }

    @Nullable
    public final Integer getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    public final Double getEffectiveFieldGoalPercentage() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    public final Integer getFastbreakPoints() {
        return this.fastbreakPoints;
    }

    @Nullable
    public final Double getFieldGoalsPercentage() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    public final Double getFieldGoalsPercentageAgainst() {
        return this.fieldGoalsPercentageAgainst;
    }

    @Nullable
    public final Double getFreeThrowsPercentage() {
        return this.freeThrowsPercentage;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topTeams.items.BaseTopTeamsStatisticsItem
    public int getId() {
        return this.id;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topTeams.items.BaseTopTeamsStatisticsItem
    public int getMatches() {
        return this.matches;
    }

    @Nullable
    public final Double getNetRating() {
        return this.netRating;
    }

    @Nullable
    public final Double getOffensiveRating() {
        return this.offensiveRating;
    }

    @Nullable
    public final Integer getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    public final Double getPace() {
        return this.pace;
    }

    @Nullable
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPointsAgainst() {
        return this.pointsAgainst;
    }

    @Nullable
    public final Integer getRebounds() {
        return this.rebounds;
    }

    @Nullable
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    public final Integer getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    public final Double getThreePointsPercentage() {
        return this.threePointsPercentage;
    }

    @Nullable
    public final Double getThreePointsPercentageAgainst() {
        return this.threePointsPercentageAgainst;
    }

    @Nullable
    public final Double getTrueShootingPercentage() {
        return this.trueShootingPercentage;
    }

    @Nullable
    public final Integer getTurnovers() {
        return this.turnovers;
    }

    public int hashCode() {
        int a = wv8.a(this.matches, Integer.hashCode(this.id) * 31, 31);
        Integer num = this.points;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pointsAgainst;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.plusMinus;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d = this.fieldGoalsPercentage;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.fieldGoalsPercentageAgainst;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.freeThrowsPercentage;
        int hashCode6 = (hashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.threePointsPercentage;
        int hashCode7 = (hashCode6 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.threePointsPercentageAgainst;
        int hashCode8 = (hashCode7 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num4 = this.threePointsMade;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d6 = this.trueShootingPercentage;
        int hashCode10 = (hashCode9 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.effectiveFieldGoalPercentage;
        int hashCode11 = (hashCode10 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.pace;
        int hashCode12 = (hashCode11 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.offensiveRating;
        int hashCode13 = (hashCode12 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Double d10 = this.defensiveRating;
        int hashCode14 = (hashCode13 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.netRating;
        int hashCode15 = (hashCode14 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Integer num5 = this.assists;
        int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.rebounds;
        int hashCode17 = (hashCode16 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.defensiveRebounds;
        int hashCode18 = (hashCode17 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.offensiveRebounds;
        int hashCode19 = (hashCode18 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.steals;
        int hashCode20 = (hashCode19 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.turnovers;
        int hashCode21 = (hashCode20 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.blocks;
        int hashCode22 = (hashCode21 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.fastbreakPoints;
        return hashCode22 + (num12 != null ? num12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.matches;
        Integer num = this.points;
        Integer num2 = this.pointsAgainst;
        Integer num3 = this.plusMinus;
        Double d = this.fieldGoalsPercentage;
        Double d2 = this.fieldGoalsPercentageAgainst;
        Double d3 = this.freeThrowsPercentage;
        Double d4 = this.threePointsPercentage;
        Double d5 = this.threePointsPercentageAgainst;
        Integer num4 = this.threePointsMade;
        Double d6 = this.trueShootingPercentage;
        Double d7 = this.effectiveFieldGoalPercentage;
        Double d8 = this.pace;
        Double d9 = this.offensiveRating;
        Double d10 = this.defensiveRating;
        Double d11 = this.netRating;
        Integer num5 = this.assists;
        Integer num6 = this.rebounds;
        Integer num7 = this.defensiveRebounds;
        Integer num8 = this.offensiveRebounds;
        Integer num9 = this.steals;
        Integer num10 = this.turnovers;
        Integer num11 = this.blocks;
        Integer num12 = this.fastbreakPoints;
        StringBuilder s = lnb.s(i, i2, "BasketballTopTeamsStatisticsItem(id=", ", matches=", ", points=");
        vxd.r(num, num2, ", pointsAgainst=", ", plusMinus=", s);
        fn0.v(d, num3, ", fieldGoalsPercentage=", ", fieldGoalsPercentageAgainst=", s);
        fc6.A(s, d2, ", freeThrowsPercentage=", d3, ", threePointsPercentage=");
        fc6.A(s, d4, ", threePointsPercentageAgainst=", d5, ", threePointsMade=");
        fn0.v(d6, num4, ", trueShootingPercentage=", ", effectiveFieldGoalPercentage=", s);
        fc6.A(s, d7, ", pace=", d8, ", offensiveRating=");
        fc6.A(s, d9, ", defensiveRating=", d10, ", netRating=");
        mz1.x(d11, num5, ", assists=", ", rebounds=", s);
        vxd.r(num6, num7, ", defensiveRebounds=", ", offensiveRebounds=", s);
        vxd.r(num8, num9, ", steals=", ", turnovers=", s);
        vxd.r(num10, num11, ", blocks=", ", fastbreakPoints=", s);
        return vxd.n(s, num12, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BasketballTopTeamsStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BasketballTopTeamsStatisticsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketballTopTeamsStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BasketballTopTeamsStatisticsItem(int i, int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Integer num4, @Nullable Double d6, @Nullable Double d7, @Nullable Double d8, @Nullable Double d9, @Nullable Double d10, @Nullable Double d11, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12) {
        this.id = i;
        this.matches = i2;
        this.points = num;
        this.pointsAgainst = num2;
        this.plusMinus = num3;
        this.fieldGoalsPercentage = d;
        this.fieldGoalsPercentageAgainst = d2;
        this.freeThrowsPercentage = d3;
        this.threePointsPercentage = d4;
        this.threePointsPercentageAgainst = d5;
        this.threePointsMade = num4;
        this.trueShootingPercentage = d6;
        this.effectiveFieldGoalPercentage = d7;
        this.pace = d8;
        this.offensiveRating = d9;
        this.defensiveRating = d10;
        this.netRating = d11;
        this.assists = num5;
        this.rebounds = num6;
        this.defensiveRebounds = num7;
        this.offensiveRebounds = num8;
        this.steals = num9;
        this.turnovers = num10;
        this.blocks = num11;
        this.fastbreakPoints = num12;
    }
}
