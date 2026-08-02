package com.sofascore.model.newNetwork.statistics.season.team;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 j2\u00020\u0001:\u0002kjBÙ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aB\u0081\u0002\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u0019\u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010#J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010#J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010#J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010#J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010#J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010#J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010#J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010#J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010#J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010#J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010#J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010#J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010#J\u0012\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010#J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010#J\u008c\u0002\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b;\u00106J\u0010\u0010<\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020\u001d2\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AJ'\u0010J\u001a\u00020G2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0001¢\u0006\u0004\bH\u0010IR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010K\u001a\u0004\bL\u0010#R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010K\u001a\u0004\bM\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010K\u001a\u0004\bN\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010K\u001a\u0004\bO\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bP\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bQ\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010K\u001a\u0004\bR\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bS\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bT\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bU\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bV\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bW\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bX\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010K\u001a\u0004\bY\u0010#R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\bZ\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\b[\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\b\\\u0010#R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\b]\u0010#R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010^\u001a\u0004\b_\u00106R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010K\u001a\u0004\b`\u0010#R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\ba\u0010#R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010^\u001a\u0004\bb\u00106\"\u0004\bc\u0010dR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010i¨\u0006l"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/TennisTeamSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "", "matches", "wins", "awardedMatches", "aces", "breakPointsScored", "breakPointsTotal", "opponentBreakPointsScored", "opponentBreakPointsTotal", "firstServePointsScored", "firstServePointsTotal", "firstServeTotal", "secondServePointsScored", "secondServePointsTotal", "secondServeTotal", "tiebreakLosses", "tiebreaksWon", "totalServeAttempts", "doubleFaults", "", "groundType", "tournamentsWon", "tournamentsPlayed", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "placementRoundName", "", "placementIsWinner", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lt5h;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "()Ljava/lang/String;", "component20", "component21", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/statistics/season/team/TennisTeamSeasonStatistics;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/team/TennisTeamSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getMatches", "getWins", "getAwardedMatches", "getAces", "getBreakPointsScored", "getBreakPointsTotal", "getOpponentBreakPointsScored", "getOpponentBreakPointsTotal", "getFirstServePointsScored", "getFirstServePointsTotal", "getFirstServeTotal", "getSecondServePointsScored", "getSecondServePointsTotal", "getSecondServeTotal", "getTiebreakLosses", "getTiebreaksWon", "getTotalServeAttempts", "getDoubleFaults", "Ljava/lang/String;", "getGroundType", "getTournamentsWon", "getTournamentsPlayed", "getPlacementRoundName", "setPlacementRoundName", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getPlacementIsWinner", "()Ljava/lang/Boolean;", "setPlacementIsWinner", "(Ljava/lang/Boolean;)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TennisTeamSeasonStatistics implements TeamSeasonStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer aces;

    @Nullable
    private final Integer awardedMatches;

    @Nullable
    private final Integer breakPointsScored;

    @Nullable
    private final Integer breakPointsTotal;

    @Nullable
    private final Integer doubleFaults;

    @Nullable
    private final Integer firstServePointsScored;

    @Nullable
    private final Integer firstServePointsTotal;

    @Nullable
    private final Integer firstServeTotal;

    @Nullable
    private final String groundType;

    @Nullable
    private final Integer matches;

    @Nullable
    private final Integer opponentBreakPointsScored;

    @Nullable
    private final Integer opponentBreakPointsTotal;

    @Nullable
    private Boolean placementIsWinner;

    @Nullable
    private String placementRoundName;

    @Nullable
    private final Integer secondServePointsScored;

    @Nullable
    private final Integer secondServePointsTotal;

    @Nullable
    private final Integer secondServeTotal;

    @Nullable
    private final Integer tiebreakLosses;

    @Nullable
    private final Integer tiebreaksWon;

    @Nullable
    private final Integer totalServeAttempts;

    @Nullable
    private final Integer tournamentsPlayed;

    @Nullable
    private final Integer tournamentsWon;

    @Nullable
    private final Integer wins;

    public /* synthetic */ TennisTeamSeasonStatistics(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, String str, Integer num19, Integer num20, String str2, Boolean bool, t5h t5hVar) {
        if (2097151 != (i & 2097151)) {
            oea.z(i, 2097151, TennisTeamSeasonStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.matches = num;
        this.wins = num2;
        this.awardedMatches = num3;
        this.aces = num4;
        this.breakPointsScored = num5;
        this.breakPointsTotal = num6;
        this.opponentBreakPointsScored = num7;
        this.opponentBreakPointsTotal = num8;
        this.firstServePointsScored = num9;
        this.firstServePointsTotal = num10;
        this.firstServeTotal = num11;
        this.secondServePointsScored = num12;
        this.secondServePointsTotal = num13;
        this.secondServeTotal = num14;
        this.tiebreakLosses = num15;
        this.tiebreaksWon = num16;
        this.totalServeAttempts = num17;
        this.doubleFaults = num18;
        this.groundType = str;
        this.tournamentsWon = num19;
        this.tournamentsPlayed = num20;
        if ((2097152 & i) == 0) {
            this.placementRoundName = null;
        } else {
            this.placementRoundName = str2;
        }
        if ((i & 4194304) == 0) {
            this.placementIsWinner = null;
        } else {
            this.placementIsWinner = bool;
        }
    }

    public static /* synthetic */ TennisTeamSeasonStatistics copy$default(TennisTeamSeasonStatistics tennisTeamSeasonStatistics, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, String str, Integer num19, Integer num20, int i, Object obj) {
        Integer num21;
        Integer num22;
        Integer num23 = (i & 1) != 0 ? tennisTeamSeasonStatistics.matches : num;
        Integer num24 = (i & 2) != 0 ? tennisTeamSeasonStatistics.wins : num2;
        Integer num25 = (i & 4) != 0 ? tennisTeamSeasonStatistics.awardedMatches : num3;
        Integer num26 = (i & 8) != 0 ? tennisTeamSeasonStatistics.aces : num4;
        Integer num27 = (i & 16) != 0 ? tennisTeamSeasonStatistics.breakPointsScored : num5;
        Integer num28 = (i & 32) != 0 ? tennisTeamSeasonStatistics.breakPointsTotal : num6;
        Integer num29 = (i & 64) != 0 ? tennisTeamSeasonStatistics.opponentBreakPointsScored : num7;
        Integer num30 = (i & 128) != 0 ? tennisTeamSeasonStatistics.opponentBreakPointsTotal : num8;
        Integer num31 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? tennisTeamSeasonStatistics.firstServePointsScored : num9;
        Integer num32 = (i & 512) != 0 ? tennisTeamSeasonStatistics.firstServePointsTotal : num10;
        Integer num33 = (i & 1024) != 0 ? tennisTeamSeasonStatistics.firstServeTotal : num11;
        Integer num34 = (i & a.o) != 0 ? tennisTeamSeasonStatistics.secondServePointsScored : num12;
        Integer num35 = (i & 4096) != 0 ? tennisTeamSeasonStatistics.secondServePointsTotal : num13;
        Integer num36 = (i & 8192) != 0 ? tennisTeamSeasonStatistics.secondServeTotal : num14;
        Integer num37 = num23;
        Integer num38 = (i & 16384) != 0 ? tennisTeamSeasonStatistics.tiebreakLosses : num15;
        Integer num39 = (i & 32768) != 0 ? tennisTeamSeasonStatistics.tiebreaksWon : num16;
        Integer num40 = (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? tennisTeamSeasonStatistics.totalServeAttempts : num17;
        Integer num41 = (i & 131072) != 0 ? tennisTeamSeasonStatistics.doubleFaults : num18;
        String str2 = (i & 262144) != 0 ? tennisTeamSeasonStatistics.groundType : str;
        Integer num42 = (i & 524288) != 0 ? tennisTeamSeasonStatistics.tournamentsWon : num19;
        if ((i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
            num22 = num42;
            num21 = tennisTeamSeasonStatistics.tournamentsPlayed;
        } else {
            num21 = num20;
            num22 = num42;
        }
        return tennisTeamSeasonStatistics.copy(num37, num24, num25, num26, num27, num28, num29, num30, num31, num32, num33, num34, num35, num36, num38, num39, num40, num41, str2, num22, num21);
    }

    public static final /* synthetic */ void write$Self$model_release(TennisTeamSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.matches);
        output.h(serialDesc, 1, a7aVar, self.wins);
        output.h(serialDesc, 2, a7aVar, self.awardedMatches);
        output.h(serialDesc, 3, a7aVar, self.aces);
        output.h(serialDesc, 4, a7aVar, self.breakPointsScored);
        output.h(serialDesc, 5, a7aVar, self.breakPointsTotal);
        output.h(serialDesc, 6, a7aVar, self.opponentBreakPointsScored);
        output.h(serialDesc, 7, a7aVar, self.opponentBreakPointsTotal);
        output.h(serialDesc, 8, a7aVar, self.firstServePointsScored);
        output.h(serialDesc, 9, a7aVar, self.firstServePointsTotal);
        output.h(serialDesc, 10, a7aVar, self.firstServeTotal);
        output.h(serialDesc, 11, a7aVar, self.secondServePointsScored);
        output.h(serialDesc, 12, a7aVar, self.secondServePointsTotal);
        output.h(serialDesc, 13, a7aVar, self.secondServeTotal);
        output.h(serialDesc, 14, a7aVar, self.tiebreakLosses);
        output.h(serialDesc, 15, a7aVar, self.tiebreaksWon);
        output.h(serialDesc, 16, a7aVar, self.totalServeAttempts);
        output.h(serialDesc, 17, a7aVar, self.doubleFaults);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 18, uhiVar, self.groundType);
        output.h(serialDesc, 19, a7aVar, self.tournamentsWon);
        output.h(serialDesc, 20, a7aVar, self.tournamentsPlayed);
        if (output.o(serialDesc) || self.placementRoundName != null) {
            output.h(serialDesc, 21, uhiVar, self.placementRoundName);
        }
        if (!output.o(serialDesc) && self.placementIsWinner == null) {
            return;
        }
        output.h(serialDesc, 22, gz1.a, self.placementIsWinner);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getFirstServePointsTotal() {
        return this.firstServePointsTotal;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getFirstServeTotal() {
        return this.firstServeTotal;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getSecondServePointsScored() {
        return this.secondServePointsScored;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getSecondServePointsTotal() {
        return this.secondServePointsTotal;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getSecondServeTotal() {
        return this.secondServeTotal;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getTiebreakLosses() {
        return this.tiebreakLosses;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getTiebreaksWon() {
        return this.tiebreaksWon;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getTotalServeAttempts() {
        return this.totalServeAttempts;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getDoubleFaults() {
        return this.doubleFaults;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getGroundType() {
        return this.groundType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getWins() {
        return this.wins;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Integer getTournamentsWon() {
        return this.tournamentsWon;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getTournamentsPlayed() {
        return this.tournamentsPlayed;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAwardedMatches() {
        return this.awardedMatches;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getAces() {
        return this.aces;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getBreakPointsScored() {
        return this.breakPointsScored;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getBreakPointsTotal() {
        return this.breakPointsTotal;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getOpponentBreakPointsScored() {
        return this.opponentBreakPointsScored;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getOpponentBreakPointsTotal() {
        return this.opponentBreakPointsTotal;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getFirstServePointsScored() {
        return this.firstServePointsScored;
    }

    @NotNull
    public final TennisTeamSeasonStatistics copy(@Nullable Integer matches, @Nullable Integer wins, @Nullable Integer awardedMatches, @Nullable Integer aces, @Nullable Integer breakPointsScored, @Nullable Integer breakPointsTotal, @Nullable Integer opponentBreakPointsScored, @Nullable Integer opponentBreakPointsTotal, @Nullable Integer firstServePointsScored, @Nullable Integer firstServePointsTotal, @Nullable Integer firstServeTotal, @Nullable Integer secondServePointsScored, @Nullable Integer secondServePointsTotal, @Nullable Integer secondServeTotal, @Nullable Integer tiebreakLosses, @Nullable Integer tiebreaksWon, @Nullable Integer totalServeAttempts, @Nullable Integer doubleFaults, @Nullable String groundType, @Nullable Integer tournamentsWon, @Nullable Integer tournamentsPlayed) {
        return new TennisTeamSeasonStatistics(matches, wins, awardedMatches, aces, breakPointsScored, breakPointsTotal, opponentBreakPointsScored, opponentBreakPointsTotal, firstServePointsScored, firstServePointsTotal, firstServeTotal, secondServePointsScored, secondServePointsTotal, secondServeTotal, tiebreakLosses, tiebreaksWon, totalServeAttempts, doubleFaults, groundType, tournamentsWon, tournamentsPlayed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TennisTeamSeasonStatistics)) {
            return false;
        }
        TennisTeamSeasonStatistics tennisTeamSeasonStatistics = (TennisTeamSeasonStatistics) other;
        return Intrinsics.c(this.matches, tennisTeamSeasonStatistics.matches) && Intrinsics.c(this.wins, tennisTeamSeasonStatistics.wins) && Intrinsics.c(this.awardedMatches, tennisTeamSeasonStatistics.awardedMatches) && Intrinsics.c(this.aces, tennisTeamSeasonStatistics.aces) && Intrinsics.c(this.breakPointsScored, tennisTeamSeasonStatistics.breakPointsScored) && Intrinsics.c(this.breakPointsTotal, tennisTeamSeasonStatistics.breakPointsTotal) && Intrinsics.c(this.opponentBreakPointsScored, tennisTeamSeasonStatistics.opponentBreakPointsScored) && Intrinsics.c(this.opponentBreakPointsTotal, tennisTeamSeasonStatistics.opponentBreakPointsTotal) && Intrinsics.c(this.firstServePointsScored, tennisTeamSeasonStatistics.firstServePointsScored) && Intrinsics.c(this.firstServePointsTotal, tennisTeamSeasonStatistics.firstServePointsTotal) && Intrinsics.c(this.firstServeTotal, tennisTeamSeasonStatistics.firstServeTotal) && Intrinsics.c(this.secondServePointsScored, tennisTeamSeasonStatistics.secondServePointsScored) && Intrinsics.c(this.secondServePointsTotal, tennisTeamSeasonStatistics.secondServePointsTotal) && Intrinsics.c(this.secondServeTotal, tennisTeamSeasonStatistics.secondServeTotal) && Intrinsics.c(this.tiebreakLosses, tennisTeamSeasonStatistics.tiebreakLosses) && Intrinsics.c(this.tiebreaksWon, tennisTeamSeasonStatistics.tiebreaksWon) && Intrinsics.c(this.totalServeAttempts, tennisTeamSeasonStatistics.totalServeAttempts) && Intrinsics.c(this.doubleFaults, tennisTeamSeasonStatistics.doubleFaults) && Intrinsics.c(this.groundType, tennisTeamSeasonStatistics.groundType) && Intrinsics.c(this.tournamentsWon, tennisTeamSeasonStatistics.tournamentsWon) && Intrinsics.c(this.tournamentsPlayed, tennisTeamSeasonStatistics.tournamentsPlayed);
    }

    @Nullable
    public final Integer getAces() {
        return this.aces;
    }

    @Nullable
    public final Integer getAwardedMatches() {
        return this.awardedMatches;
    }

    @Nullable
    public final Integer getBreakPointsScored() {
        return this.breakPointsScored;
    }

    @Nullable
    public final Integer getBreakPointsTotal() {
        return this.breakPointsTotal;
    }

    @Nullable
    public final Integer getDoubleFaults() {
        return this.doubleFaults;
    }

    @Nullable
    public final Integer getFirstServePointsScored() {
        return this.firstServePointsScored;
    }

    @Nullable
    public final Integer getFirstServePointsTotal() {
        return this.firstServePointsTotal;
    }

    @Nullable
    public final Integer getFirstServeTotal() {
        return this.firstServeTotal;
    }

    @Nullable
    public final String getGroundType() {
        return this.groundType;
    }

    @Nullable
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    public final Integer getOpponentBreakPointsScored() {
        return this.opponentBreakPointsScored;
    }

    @Nullable
    public final Integer getOpponentBreakPointsTotal() {
        return this.opponentBreakPointsTotal;
    }

    @Nullable
    public final Boolean getPlacementIsWinner() {
        return this.placementIsWinner;
    }

    @Nullable
    public final String getPlacementRoundName() {
        return this.placementRoundName;
    }

    @Nullable
    public final Integer getSecondServePointsScored() {
        return this.secondServePointsScored;
    }

    @Nullable
    public final Integer getSecondServePointsTotal() {
        return this.secondServePointsTotal;
    }

    @Nullable
    public final Integer getSecondServeTotal() {
        return this.secondServeTotal;
    }

    @Nullable
    public final Integer getTiebreakLosses() {
        return this.tiebreakLosses;
    }

    @Nullable
    public final Integer getTiebreaksWon() {
        return this.tiebreaksWon;
    }

    @Nullable
    public final Integer getTotalServeAttempts() {
        return this.totalServeAttempts;
    }

    @Nullable
    public final Integer getTournamentsPlayed() {
        return this.tournamentsPlayed;
    }

    @Nullable
    public final Integer getTournamentsWon() {
        return this.tournamentsWon;
    }

    @Nullable
    public final Integer getWins() {
        return this.wins;
    }

    public int hashCode() {
        Integer num = this.matches;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.wins;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.awardedMatches;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.aces;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.breakPointsScored;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.breakPointsTotal;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.opponentBreakPointsScored;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.opponentBreakPointsTotal;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.firstServePointsScored;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.firstServePointsTotal;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.firstServeTotal;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.secondServePointsScored;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.secondServePointsTotal;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.secondServeTotal;
        int hashCode14 = (hashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.tiebreakLosses;
        int hashCode15 = (hashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.tiebreaksWon;
        int hashCode16 = (hashCode15 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.totalServeAttempts;
        int hashCode17 = (hashCode16 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.doubleFaults;
        int hashCode18 = (hashCode17 + (num18 == null ? 0 : num18.hashCode())) * 31;
        String str = this.groundType;
        int hashCode19 = (hashCode18 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num19 = this.tournamentsWon;
        int hashCode20 = (hashCode19 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.tournamentsPlayed;
        return hashCode20 + (num20 != null ? num20.hashCode() : 0);
    }

    public final void setPlacementIsWinner(@Nullable Boolean bool) {
        this.placementIsWinner = bool;
    }

    public final void setPlacementRoundName(@Nullable String str) {
        this.placementRoundName = str;
    }

    @NotNull
    public String toString() {
        Integer num = this.matches;
        Integer num2 = this.wins;
        Integer num3 = this.awardedMatches;
        Integer num4 = this.aces;
        Integer num5 = this.breakPointsScored;
        Integer num6 = this.breakPointsTotal;
        Integer num7 = this.opponentBreakPointsScored;
        Integer num8 = this.opponentBreakPointsTotal;
        Integer num9 = this.firstServePointsScored;
        Integer num10 = this.firstServePointsTotal;
        Integer num11 = this.firstServeTotal;
        Integer num12 = this.secondServePointsScored;
        Integer num13 = this.secondServePointsTotal;
        Integer num14 = this.secondServeTotal;
        Integer num15 = this.tiebreakLosses;
        Integer num16 = this.tiebreaksWon;
        Integer num17 = this.totalServeAttempts;
        Integer num18 = this.doubleFaults;
        String str = this.groundType;
        Integer num19 = this.tournamentsWon;
        Integer num20 = this.tournamentsPlayed;
        StringBuilder k = wv8.k(num, "TennisTeamSeasonStatistics(matches=", ", wins=", ", awardedMatches=", num2);
        vxd.r(num3, num4, ", aces=", ", breakPointsScored=", k);
        vxd.r(num5, num6, ", breakPointsTotal=", ", opponentBreakPointsScored=", k);
        vxd.r(num7, num8, ", opponentBreakPointsTotal=", ", firstServePointsScored=", k);
        vxd.r(num9, num10, ", firstServePointsTotal=", ", firstServeTotal=", k);
        vxd.r(num11, num12, ", secondServePointsScored=", ", secondServePointsTotal=", k);
        vxd.r(num13, num14, ", secondServeTotal=", ", tiebreakLosses=", k);
        vxd.r(num15, num16, ", tiebreaksWon=", ", totalServeAttempts=", k);
        vxd.r(num17, num18, ", doubleFaults=", ", groundType=", k);
        me4.o(num19, str, ", tournamentsWon=", ", tournamentsPlayed=", k);
        return vxd.n(k, num20, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/TennisTeamSeasonStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TennisTeamSeasonStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TennisTeamSeasonStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TennisTeamSeasonStatistics(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable String str, @Nullable Integer num19, @Nullable Integer num20) {
        this.matches = num;
        this.wins = num2;
        this.awardedMatches = num3;
        this.aces = num4;
        this.breakPointsScored = num5;
        this.breakPointsTotal = num6;
        this.opponentBreakPointsScored = num7;
        this.opponentBreakPointsTotal = num8;
        this.firstServePointsScored = num9;
        this.firstServePointsTotal = num10;
        this.firstServeTotal = num11;
        this.secondServePointsScored = num12;
        this.secondServePointsTotal = num13;
        this.secondServeTotal = num14;
        this.tiebreakLosses = num15;
        this.tiebreaksWon = num16;
        this.totalServeAttempts = num17;
        this.doubleFaults = num18;
        this.groundType = str;
        this.tournamentsWon = num19;
        this.tournamentsPlayed = num20;
    }
}
