package com.sofascore.model.network.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.h75;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b \b\u0087\b\u0018\u0000 j2\u00020\u0001:\u0002kjBí\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB\u0081\u0002\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010#J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010#J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010#J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010#J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010#J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010#J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010#J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010#J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010#J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010#J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010#J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010#J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010#J\u0012\u00108\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b:\u0010;J¤\u0002\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010E\u001a\u00020\u00182\b\u0010D\u001a\u0004\u0018\u00010CHÖ\u0003¢\u0006\u0004\bE\u0010FJ'\u0010O\u001a\u00020L2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0001¢\u0006\u0004\bM\u0010NR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010#R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010P\u001a\u0004\bR\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010P\u001a\u0004\bS\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010P\u001a\u0004\bT\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010P\u001a\u0004\bU\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010P\u001a\u0004\bV\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010P\u001a\u0004\bW\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010P\u001a\u0004\bX\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\bY\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010P\u001a\u0004\bZ\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\b[\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010P\u001a\u0004\b\\\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\b]\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\b^\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\b_\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\b`\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010P\u001a\u0004\ba\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bb\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010P\u001a\u0004\bc\u0010#R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\bd\u0010#R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010P\u001a\u0004\be\u0010#R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010f\u001a\u0004\bg\u00109R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010h\u001a\u0004\bi\u0010;¨\u0006l"}, d2 = {"Lcom/sofascore/model/network/response/BasketballPlayerEventStatistics;", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "", "points", "freeThrowsMade", "twoPointsMade", "threePointsMade", "fieldGoalsMade", "freeThrowAttempts", "twoPointAttempts", "threePointAttempts", "fieldGoalAttempts", "fieldGoalPct", "rebounds", "defensiveRebounds", "offensiveRebounds", "secondsPlayed", "assists", "steals", "turnovers", "blocks", "personalFouls", "pir", "plusMinus", "", "winningTeam", "", CampaignEx.JSON_KEY_STAR, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Double;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Double;Lt5h;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "()Ljava/lang/Boolean;", "component23", "()Ljava/lang/Double;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Double;)Lcom/sofascore/model/network/response/BasketballPlayerEventStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/BasketballPlayerEventStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getPoints", "getFreeThrowsMade", "getTwoPointsMade", "getThreePointsMade", "getFieldGoalsMade", "getFreeThrowAttempts", "getTwoPointAttempts", "getThreePointAttempts", "getFieldGoalAttempts", "getFieldGoalPct", "getRebounds", "getDefensiveRebounds", "getOffensiveRebounds", "getSecondsPlayed", "getAssists", "getSteals", "getTurnovers", "getBlocks", "getPersonalFouls", "getPir", "getPlusMinus", "Ljava/lang/Boolean;", "getWinningTeam", "Ljava/lang/Double;", "getRating", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BasketballPlayerEventStatistics implements PlayerEventStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer blocks;

    @Nullable
    private final Integer defensiveRebounds;

    @Nullable
    private final Integer fieldGoalAttempts;

    @Nullable
    private final Integer fieldGoalPct;

    @Nullable
    private final Integer fieldGoalsMade;

    @Nullable
    private final Integer freeThrowAttempts;

    @Nullable
    private final Integer freeThrowsMade;

    @Nullable
    private final Integer offensiveRebounds;

    @Nullable
    private final Integer personalFouls;

    @Nullable
    private final Integer pir;

    @Nullable
    private final Integer plusMinus;

    @Nullable
    private final Integer points;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer rebounds;

    @Nullable
    private final Integer secondsPlayed;

    @Nullable
    private final Integer steals;

    @Nullable
    private final Integer threePointAttempts;

    @Nullable
    private final Integer threePointsMade;

    @Nullable
    private final Integer turnovers;

    @Nullable
    private final Integer twoPointAttempts;

    @Nullable
    private final Integer twoPointsMade;

    @Nullable
    private final Boolean winningTeam;

    public /* synthetic */ BasketballPlayerEventStatistics(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Boolean bool, Double d, t5h t5hVar) {
        if (8388607 != (i & 8388607)) {
            oea.z(i, 8388607, BasketballPlayerEventStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = num;
        this.freeThrowsMade = num2;
        this.twoPointsMade = num3;
        this.threePointsMade = num4;
        this.fieldGoalsMade = num5;
        this.freeThrowAttempts = num6;
        this.twoPointAttempts = num7;
        this.threePointAttempts = num8;
        this.fieldGoalAttempts = num9;
        this.fieldGoalPct = num10;
        this.rebounds = num11;
        this.defensiveRebounds = num12;
        this.offensiveRebounds = num13;
        this.secondsPlayed = num14;
        this.assists = num15;
        this.steals = num16;
        this.turnovers = num17;
        this.blocks = num18;
        this.personalFouls = num19;
        this.pir = num20;
        this.plusMinus = num21;
        this.winningTeam = bool;
        this.rating = d;
    }

    public static /* synthetic */ BasketballPlayerEventStatistics copy$default(BasketballPlayerEventStatistics basketballPlayerEventStatistics, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Boolean bool, Double d, int i, Object obj) {
        Double d2;
        Boolean bool2;
        Integer num22 = (i & 1) != 0 ? basketballPlayerEventStatistics.points : num;
        Integer num23 = (i & 2) != 0 ? basketballPlayerEventStatistics.freeThrowsMade : num2;
        Integer num24 = (i & 4) != 0 ? basketballPlayerEventStatistics.twoPointsMade : num3;
        Integer num25 = (i & 8) != 0 ? basketballPlayerEventStatistics.threePointsMade : num4;
        Integer num26 = (i & 16) != 0 ? basketballPlayerEventStatistics.fieldGoalsMade : num5;
        Integer num27 = (i & 32) != 0 ? basketballPlayerEventStatistics.freeThrowAttempts : num6;
        Integer num28 = (i & 64) != 0 ? basketballPlayerEventStatistics.twoPointAttempts : num7;
        Integer num29 = (i & 128) != 0 ? basketballPlayerEventStatistics.threePointAttempts : num8;
        Integer num30 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? basketballPlayerEventStatistics.fieldGoalAttempts : num9;
        Integer num31 = (i & 512) != 0 ? basketballPlayerEventStatistics.fieldGoalPct : num10;
        Integer num32 = (i & 1024) != 0 ? basketballPlayerEventStatistics.rebounds : num11;
        Integer num33 = (i & a.o) != 0 ? basketballPlayerEventStatistics.defensiveRebounds : num12;
        Integer num34 = (i & 4096) != 0 ? basketballPlayerEventStatistics.offensiveRebounds : num13;
        Integer num35 = (i & 8192) != 0 ? basketballPlayerEventStatistics.secondsPlayed : num14;
        Integer num36 = num22;
        Integer num37 = (i & 16384) != 0 ? basketballPlayerEventStatistics.assists : num15;
        Integer num38 = (i & 32768) != 0 ? basketballPlayerEventStatistics.steals : num16;
        Integer num39 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? basketballPlayerEventStatistics.turnovers : num17;
        Integer num40 = (i & 131072) != 0 ? basketballPlayerEventStatistics.blocks : num18;
        Integer num41 = (i & 262144) != 0 ? basketballPlayerEventStatistics.personalFouls : num19;
        Integer num42 = (i & 524288) != 0 ? basketballPlayerEventStatistics.pir : num20;
        Integer num43 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? basketballPlayerEventStatistics.plusMinus : num21;
        Boolean bool3 = (i & 2097152) != 0 ? basketballPlayerEventStatistics.winningTeam : bool;
        if ((i & 4194304) != 0) {
            bool2 = bool3;
            d2 = basketballPlayerEventStatistics.rating;
        } else {
            d2 = d;
            bool2 = bool3;
        }
        return basketballPlayerEventStatistics.copy(num36, num23, num24, num25, num26, num27, num28, num29, num30, num31, num32, num33, num34, num35, num37, num38, num39, num40, num41, num42, num43, bool2, d2);
    }

    public static final /* synthetic */ void write$Self$model_release(BasketballPlayerEventStatistics self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.points);
        output.h(serialDesc, 1, a7aVar, self.freeThrowsMade);
        output.h(serialDesc, 2, a7aVar, self.twoPointsMade);
        output.h(serialDesc, 3, a7aVar, self.threePointsMade);
        output.h(serialDesc, 4, a7aVar, self.fieldGoalsMade);
        output.h(serialDesc, 5, a7aVar, self.freeThrowAttempts);
        output.h(serialDesc, 6, a7aVar, self.twoPointAttempts);
        output.h(serialDesc, 7, a7aVar, self.threePointAttempts);
        output.h(serialDesc, 8, a7aVar, self.fieldGoalAttempts);
        output.h(serialDesc, 9, a7aVar, self.fieldGoalPct);
        output.h(serialDesc, 10, a7aVar, self.rebounds);
        output.h(serialDesc, 11, a7aVar, self.defensiveRebounds);
        output.h(serialDesc, 12, a7aVar, self.offensiveRebounds);
        output.h(serialDesc, 13, a7aVar, self.secondsPlayed);
        output.h(serialDesc, 14, a7aVar, self.assists);
        output.h(serialDesc, 15, a7aVar, self.steals);
        output.h(serialDesc, 16, a7aVar, self.turnovers);
        output.h(serialDesc, 17, a7aVar, self.blocks);
        output.h(serialDesc, 18, a7aVar, self.personalFouls);
        output.h(serialDesc, 19, a7aVar, self.pir);
        output.h(serialDesc, 20, a7aVar, self.plusMinus);
        output.h(serialDesc, 21, gz1.a, self.winningTeam);
        output.h(serialDesc, 22, h75.a, self.getRating());
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getFieldGoalPct() {
        return this.fieldGoalPct;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getRebounds() {
        return this.rebounds;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getSecondsPlayed() {
        return this.secondsPlayed;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getTurnovers() {
        return this.turnovers;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getBlocks() {
        return this.blocks;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Integer getPersonalFouls() {
        return this.personalFouls;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getFreeThrowsMade() {
        return this.freeThrowsMade;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getPir() {
        return this.pir;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Boolean getWinningTeam() {
        return this.winningTeam;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getTwoPointsMade() {
        return this.twoPointsMade;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getFieldGoalsMade() {
        return this.fieldGoalsMade;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getFreeThrowAttempts() {
        return this.freeThrowAttempts;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getTwoPointAttempts() {
        return this.twoPointAttempts;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getThreePointAttempts() {
        return this.threePointAttempts;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getFieldGoalAttempts() {
        return this.fieldGoalAttempts;
    }

    @NotNull
    public final BasketballPlayerEventStatistics copy(@Nullable Integer points, @Nullable Integer freeThrowsMade, @Nullable Integer twoPointsMade, @Nullable Integer threePointsMade, @Nullable Integer fieldGoalsMade, @Nullable Integer freeThrowAttempts, @Nullable Integer twoPointAttempts, @Nullable Integer threePointAttempts, @Nullable Integer fieldGoalAttempts, @Nullable Integer fieldGoalPct, @Nullable Integer rebounds, @Nullable Integer defensiveRebounds, @Nullable Integer offensiveRebounds, @Nullable Integer secondsPlayed, @Nullable Integer assists, @Nullable Integer steals, @Nullable Integer turnovers, @Nullable Integer blocks, @Nullable Integer personalFouls, @Nullable Integer pir, @Nullable Integer plusMinus, @Nullable Boolean winningTeam, @Nullable Double rating) {
        return new BasketballPlayerEventStatistics(points, freeThrowsMade, twoPointsMade, threePointsMade, fieldGoalsMade, freeThrowAttempts, twoPointAttempts, threePointAttempts, fieldGoalAttempts, fieldGoalPct, rebounds, defensiveRebounds, offensiveRebounds, secondsPlayed, assists, steals, turnovers, blocks, personalFouls, pir, plusMinus, winningTeam, rating);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketballPlayerEventStatistics)) {
            return false;
        }
        BasketballPlayerEventStatistics basketballPlayerEventStatistics = (BasketballPlayerEventStatistics) other;
        return Intrinsics.c(this.points, basketballPlayerEventStatistics.points) && Intrinsics.c(this.freeThrowsMade, basketballPlayerEventStatistics.freeThrowsMade) && Intrinsics.c(this.twoPointsMade, basketballPlayerEventStatistics.twoPointsMade) && Intrinsics.c(this.threePointsMade, basketballPlayerEventStatistics.threePointsMade) && Intrinsics.c(this.fieldGoalsMade, basketballPlayerEventStatistics.fieldGoalsMade) && Intrinsics.c(this.freeThrowAttempts, basketballPlayerEventStatistics.freeThrowAttempts) && Intrinsics.c(this.twoPointAttempts, basketballPlayerEventStatistics.twoPointAttempts) && Intrinsics.c(this.threePointAttempts, basketballPlayerEventStatistics.threePointAttempts) && Intrinsics.c(this.fieldGoalAttempts, basketballPlayerEventStatistics.fieldGoalAttempts) && Intrinsics.c(this.fieldGoalPct, basketballPlayerEventStatistics.fieldGoalPct) && Intrinsics.c(this.rebounds, basketballPlayerEventStatistics.rebounds) && Intrinsics.c(this.defensiveRebounds, basketballPlayerEventStatistics.defensiveRebounds) && Intrinsics.c(this.offensiveRebounds, basketballPlayerEventStatistics.offensiveRebounds) && Intrinsics.c(this.secondsPlayed, basketballPlayerEventStatistics.secondsPlayed) && Intrinsics.c(this.assists, basketballPlayerEventStatistics.assists) && Intrinsics.c(this.steals, basketballPlayerEventStatistics.steals) && Intrinsics.c(this.turnovers, basketballPlayerEventStatistics.turnovers) && Intrinsics.c(this.blocks, basketballPlayerEventStatistics.blocks) && Intrinsics.c(this.personalFouls, basketballPlayerEventStatistics.personalFouls) && Intrinsics.c(this.pir, basketballPlayerEventStatistics.pir) && Intrinsics.c(this.plusMinus, basketballPlayerEventStatistics.plusMinus) && Intrinsics.c(this.winningTeam, basketballPlayerEventStatistics.winningTeam) && Intrinsics.c(this.rating, basketballPlayerEventStatistics.rating);
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
    public final Integer getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    public final Integer getFieldGoalAttempts() {
        return this.fieldGoalAttempts;
    }

    @Nullable
    public final Integer getFieldGoalPct() {
        return this.fieldGoalPct;
    }

    @Nullable
    public final Integer getFieldGoalsMade() {
        return this.fieldGoalsMade;
    }

    @Nullable
    public final Integer getFreeThrowAttempts() {
        return this.freeThrowAttempts;
    }

    @Nullable
    public final Integer getFreeThrowsMade() {
        return this.freeThrowsMade;
    }

    @Nullable
    public final Integer getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    public final Integer getPersonalFouls() {
        return this.personalFouls;
    }

    @Nullable
    public final Integer getPir() {
        return this.pir;
    }

    @Nullable
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Override // com.sofascore.model.network.response.PlayerEventStatistics
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getRebounds() {
        return this.rebounds;
    }

    @Nullable
    public final Integer getSecondsPlayed() {
        return this.secondsPlayed;
    }

    @Nullable
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    public final Integer getThreePointAttempts() {
        return this.threePointAttempts;
    }

    @Nullable
    public final Integer getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    public final Integer getTurnovers() {
        return this.turnovers;
    }

    @Nullable
    public final Integer getTwoPointAttempts() {
        return this.twoPointAttempts;
    }

    @Nullable
    public final Integer getTwoPointsMade() {
        return this.twoPointsMade;
    }

    @Nullable
    public final Boolean getWinningTeam() {
        return this.winningTeam;
    }

    public int hashCode() {
        Integer num = this.points;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.freeThrowsMade;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.twoPointsMade;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.threePointsMade;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.fieldGoalsMade;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.freeThrowAttempts;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.twoPointAttempts;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.threePointAttempts;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.fieldGoalAttempts;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.fieldGoalPct;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.rebounds;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.defensiveRebounds;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.offensiveRebounds;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.secondsPlayed;
        int hashCode14 = (hashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.assists;
        int hashCode15 = (hashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.steals;
        int hashCode16 = (hashCode15 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.turnovers;
        int hashCode17 = (hashCode16 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.blocks;
        int hashCode18 = (hashCode17 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.personalFouls;
        int hashCode19 = (hashCode18 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.pir;
        int hashCode20 = (hashCode19 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.plusMinus;
        int hashCode21 = (hashCode20 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Boolean bool = this.winningTeam;
        int hashCode22 = (hashCode21 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.rating;
        return hashCode22 + (d != null ? d.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.points;
        Integer num2 = this.freeThrowsMade;
        Integer num3 = this.twoPointsMade;
        Integer num4 = this.threePointsMade;
        Integer num5 = this.fieldGoalsMade;
        Integer num6 = this.freeThrowAttempts;
        Integer num7 = this.twoPointAttempts;
        Integer num8 = this.threePointAttempts;
        Integer num9 = this.fieldGoalAttempts;
        Integer num10 = this.fieldGoalPct;
        Integer num11 = this.rebounds;
        Integer num12 = this.defensiveRebounds;
        Integer num13 = this.offensiveRebounds;
        Integer num14 = this.secondsPlayed;
        Integer num15 = this.assists;
        Integer num16 = this.steals;
        Integer num17 = this.turnovers;
        Integer num18 = this.blocks;
        Integer num19 = this.personalFouls;
        Integer num20 = this.pir;
        Integer num21 = this.plusMinus;
        Boolean bool = this.winningTeam;
        Double d = this.rating;
        StringBuilder k = wv8.k(num, "BasketballPlayerEventStatistics(points=", ", freeThrowsMade=", ", twoPointsMade=", num2);
        vxd.r(num3, num4, ", threePointsMade=", ", fieldGoalsMade=", k);
        vxd.r(num5, num6, ", freeThrowAttempts=", ", twoPointAttempts=", k);
        vxd.r(num7, num8, ", threePointAttempts=", ", fieldGoalAttempts=", k);
        vxd.r(num9, num10, ", fieldGoalPct=", ", rebounds=", k);
        vxd.r(num11, num12, ", defensiveRebounds=", ", offensiveRebounds=", k);
        vxd.r(num13, num14, ", secondsPlayed=", ", assists=", k);
        vxd.r(num15, num16, ", steals=", ", turnovers=", k);
        vxd.r(num17, num18, ", blocks=", ", personalFouls=", k);
        vxd.r(num19, num20, ", pir=", ", plusMinus=", k);
        vxd.v(k, num21, ", winningTeam=", bool, ", rating=");
        k.append(d);
        k.append(")");
        return k.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/BasketballPlayerEventStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/BasketballPlayerEventStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketballPlayerEventStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BasketballPlayerEventStatistics(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Integer num20, @Nullable Integer num21, @Nullable Boolean bool, @Nullable Double d) {
        this.points = num;
        this.freeThrowsMade = num2;
        this.twoPointsMade = num3;
        this.threePointsMade = num4;
        this.fieldGoalsMade = num5;
        this.freeThrowAttempts = num6;
        this.twoPointAttempts = num7;
        this.threePointAttempts = num8;
        this.fieldGoalAttempts = num9;
        this.fieldGoalPct = num10;
        this.rebounds = num11;
        this.defensiveRebounds = num12;
        this.offensiveRebounds = num13;
        this.secondsPlayed = num14;
        this.assists = num15;
        this.steals = num16;
        this.turnovers = num17;
        this.blocks = num18;
        this.personalFouls = num19;
        this.pir = num20;
        this.plusMinus = num21;
        this.winningTeam = bool;
        this.rating = d;
    }
}
