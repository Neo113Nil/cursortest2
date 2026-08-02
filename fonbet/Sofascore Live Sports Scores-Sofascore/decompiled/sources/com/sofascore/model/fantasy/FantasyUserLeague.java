package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a7a;
import defpackage.bf3;
import defpackage.c88;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.ljg;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0002^]B§\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019BÁ\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010!J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010!J\u0012\u00100\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b0\u0010!J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010!J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010!J\u0012\u00103\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b3\u00104JÒ\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b7\u0010'J\u0010\u00108\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b8\u0010$J\u001a\u0010;\u001a\u00020:2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<J'\u0010E\u001a\u00020B2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bC\u0010DR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bI\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bJ\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010H\u001a\u0004\bM\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bO\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bP\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010N\u001a\u0004\bQ\u0010'R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bR\u0010'R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bT\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bU\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bV\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bW\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bX\u0010!R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bY\u0010!R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bZ\u0010!R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010[\u001a\u0004\b\\\u00104¨\u0006_"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUserLeague;", "", "Lcom/sofascore/model/fantasy/FantasyLeague;", "league", "", "rank", "totalScore", "joinedInRoundId", "previousRank", "", "userId", "userName", "userImageUrl", "teamName", "", "recalculatedAt", "roundId", "currentScore", "wins", "draws", "losses", "points", "", "scoreAgainst", "<init>", "(Lcom/sofascore/model/fantasy/FantasyLeague;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/fantasy/FantasyLeague;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lt5h;)V", "component1", "()Lcom/sofascore/model/fantasy/FantasyLeague;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()I", "component5", "component6", "()Ljava/lang/String;", "component7", "component8", "component9", "component10", "()J", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "()Ljava/lang/Float;", "copy", "(Lcom/sofascore/model/fantasy/FantasyLeague;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;)Lcom/sofascore/model/fantasy/FantasyUserLeague;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyUserLeague;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/fantasy/FantasyLeague;", "getLeague", "Ljava/lang/Integer;", "getRank", "getTotalScore", "I", "getJoinedInRoundId", "getPreviousRank", "Ljava/lang/String;", "getUserId", "getUserName", "getUserImageUrl", "getTeamName", "J", "getRecalculatedAt", "getRoundId", "getCurrentScore", "getWins", "getDraws", "getLosses", "getPoints", "Ljava/lang/Float;", "getScoreAgainst", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyUserLeague {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer currentScore;

    @Nullable
    private final Integer draws;
    private final int joinedInRoundId;

    @Nullable
    private final FantasyLeague league;

    @Nullable
    private final Integer losses;

    @Nullable
    private final Integer points;

    @Nullable
    private final Integer previousRank;

    @Nullable
    private final Integer rank;
    private final long recalculatedAt;

    @Nullable
    private final Integer roundId;

    @Nullable
    private final Float scoreAgainst;

    @NotNull
    private final String teamName;

    @Nullable
    private final Integer totalScore;

    @NotNull
    private final String userId;

    @Nullable
    private final String userImageUrl;

    @NotNull
    private final String userName;

    @Nullable
    private final Integer wins;

    public /* synthetic */ FantasyUserLeague(int i, FantasyLeague fantasyLeague, Integer num, Integer num2, int i2, Integer num3, String str, String str2, String str3, String str4, long j, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Float f, t5h t5hVar) {
        if (131071 != (i & 131071)) {
            oea.z(i, 131071, FantasyUserLeague$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.league = fantasyLeague;
        this.rank = num;
        this.totalScore = num2;
        this.joinedInRoundId = i2;
        this.previousRank = num3;
        this.userId = str;
        this.userName = str2;
        this.userImageUrl = str3;
        this.teamName = str4;
        this.recalculatedAt = j;
        this.roundId = num4;
        this.currentScore = num5;
        this.wins = num6;
        this.draws = num7;
        this.losses = num8;
        this.points = num9;
        this.scoreAgainst = f;
    }

    public static /* synthetic */ FantasyUserLeague copy$default(FantasyUserLeague fantasyUserLeague, FantasyLeague fantasyLeague, Integer num, Integer num2, int i, Integer num3, String str, String str2, String str3, String str4, long j, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Float f, int i2, Object obj) {
        Float f2;
        Integer num10;
        FantasyLeague fantasyLeague2 = (i2 & 1) != 0 ? fantasyUserLeague.league : fantasyLeague;
        Integer num11 = (i2 & 2) != 0 ? fantasyUserLeague.rank : num;
        Integer num12 = (i2 & 4) != 0 ? fantasyUserLeague.totalScore : num2;
        int i3 = (i2 & 8) != 0 ? fantasyUserLeague.joinedInRoundId : i;
        Integer num13 = (i2 & 16) != 0 ? fantasyUserLeague.previousRank : num3;
        String str5 = (i2 & 32) != 0 ? fantasyUserLeague.userId : str;
        String str6 = (i2 & 64) != 0 ? fantasyUserLeague.userName : str2;
        String str7 = (i2 & 128) != 0 ? fantasyUserLeague.userImageUrl : str3;
        String str8 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? fantasyUserLeague.teamName : str4;
        long j2 = (i2 & 512) != 0 ? fantasyUserLeague.recalculatedAt : j;
        Integer num14 = (i2 & 1024) != 0 ? fantasyUserLeague.roundId : num4;
        Integer num15 = (i2 & a.o) != 0 ? fantasyUserLeague.currentScore : num5;
        Integer num16 = (i2 & 4096) != 0 ? fantasyUserLeague.wins : num6;
        FantasyLeague fantasyLeague3 = fantasyLeague2;
        Integer num17 = (i2 & 8192) != 0 ? fantasyUserLeague.draws : num7;
        Integer num18 = (i2 & 16384) != 0 ? fantasyUserLeague.losses : num8;
        Integer num19 = (i2 & 32768) != 0 ? fantasyUserLeague.points : num9;
        if ((i2 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            num10 = num19;
            f2 = fantasyUserLeague.scoreAgainst;
        } else {
            f2 = f;
            num10 = num19;
        }
        return fantasyUserLeague.copy(fantasyLeague3, num11, num12, i3, num13, str5, str6, str7, str8, j2, num14, num15, num16, num17, num18, num10, f2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyUserLeague self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, FantasyLeague$$serializer.INSTANCE, self.league);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.rank);
        output.h(serialDesc, 2, a7aVar, self.totalScore);
        output.u(3, self.joinedInRoundId, serialDesc);
        output.h(serialDesc, 4, a7aVar, self.previousRank);
        output.y(serialDesc, 5, self.userId);
        output.y(serialDesc, 6, self.userName);
        output.h(serialDesc, 7, uhi.a, self.userImageUrl);
        output.y(serialDesc, 8, self.teamName);
        output.E(serialDesc, 9, self.recalculatedAt);
        output.h(serialDesc, 10, a7aVar, self.roundId);
        output.h(serialDesc, 11, a7aVar, self.currentScore);
        output.h(serialDesc, 12, a7aVar, self.wins);
        output.h(serialDesc, 13, a7aVar, self.draws);
        output.h(serialDesc, 14, a7aVar, self.losses);
        output.h(serialDesc, 15, a7aVar, self.points);
        output.h(serialDesc, 16, c88.a, self.scoreAgainst);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final FantasyLeague getLeague() {
        return this.league;
    }

    /* renamed from: component10, reason: from getter */
    public final long getRecalculatedAt() {
        return this.recalculatedAt;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getRoundId() {
        return this.roundId;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getCurrentScore() {
        return this.currentScore;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getWins() {
        return this.wins;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getDraws() {
        return this.draws;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getLosses() {
        return this.losses;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Float getScoreAgainst() {
        return this.scoreAgainst;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getRank() {
        return this.rank;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getTotalScore() {
        return this.totalScore;
    }

    /* renamed from: component4, reason: from getter */
    public final int getJoinedInRoundId() {
        return this.joinedInRoundId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getPreviousRank() {
        return this.previousRank;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getUserImageUrl() {
        return this.userImageUrl;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getTeamName() {
        return this.teamName;
    }

    @NotNull
    public final FantasyUserLeague copy(@Nullable FantasyLeague league, @Nullable Integer rank, @Nullable Integer totalScore, int joinedInRoundId, @Nullable Integer previousRank, @NotNull String userId, @NotNull String userName, @Nullable String userImageUrl, @NotNull String teamName, long recalculatedAt, @Nullable Integer roundId, @Nullable Integer currentScore, @Nullable Integer wins, @Nullable Integer draws, @Nullable Integer losses, @Nullable Integer points, @Nullable Float scoreAgainst) {
        userId.getClass();
        userName.getClass();
        teamName.getClass();
        return new FantasyUserLeague(league, rank, totalScore, joinedInRoundId, previousRank, userId, userName, userImageUrl, teamName, recalculatedAt, roundId, currentScore, wins, draws, losses, points, scoreAgainst);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyUserLeague)) {
            return false;
        }
        FantasyUserLeague fantasyUserLeague = (FantasyUserLeague) other;
        return Intrinsics.c(this.league, fantasyUserLeague.league) && Intrinsics.c(this.rank, fantasyUserLeague.rank) && Intrinsics.c(this.totalScore, fantasyUserLeague.totalScore) && this.joinedInRoundId == fantasyUserLeague.joinedInRoundId && Intrinsics.c(this.previousRank, fantasyUserLeague.previousRank) && Intrinsics.c(this.userId, fantasyUserLeague.userId) && Intrinsics.c(this.userName, fantasyUserLeague.userName) && Intrinsics.c(this.userImageUrl, fantasyUserLeague.userImageUrl) && Intrinsics.c(this.teamName, fantasyUserLeague.teamName) && this.recalculatedAt == fantasyUserLeague.recalculatedAt && Intrinsics.c(this.roundId, fantasyUserLeague.roundId) && Intrinsics.c(this.currentScore, fantasyUserLeague.currentScore) && Intrinsics.c(this.wins, fantasyUserLeague.wins) && Intrinsics.c(this.draws, fantasyUserLeague.draws) && Intrinsics.c(this.losses, fantasyUserLeague.losses) && Intrinsics.c(this.points, fantasyUserLeague.points) && Intrinsics.c(this.scoreAgainst, fantasyUserLeague.scoreAgainst);
    }

    @Nullable
    public final Integer getCurrentScore() {
        return this.currentScore;
    }

    @Nullable
    public final Integer getDraws() {
        return this.draws;
    }

    public final int getJoinedInRoundId() {
        return this.joinedInRoundId;
    }

    @Nullable
    public final FantasyLeague getLeague() {
        return this.league;
    }

    @Nullable
    public final Integer getLosses() {
        return this.losses;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPreviousRank() {
        return this.previousRank;
    }

    @Nullable
    public final Integer getRank() {
        return this.rank;
    }

    public final long getRecalculatedAt() {
        return this.recalculatedAt;
    }

    @Nullable
    public final Integer getRoundId() {
        return this.roundId;
    }

    @Nullable
    public final Float getScoreAgainst() {
        return this.scoreAgainst;
    }

    @NotNull
    public final String getTeamName() {
        return this.teamName;
    }

    @Nullable
    public final Integer getTotalScore() {
        return this.totalScore;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getUserImageUrl() {
        return this.userImageUrl;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    @Nullable
    public final Integer getWins() {
        return this.wins;
    }

    public int hashCode() {
        FantasyLeague fantasyLeague = this.league;
        int hashCode = (fantasyLeague == null ? 0 : fantasyLeague.hashCode()) * 31;
        Integer num = this.rank;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalScore;
        int a = wv8.a(this.joinedInRoundId, (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        Integer num3 = this.previousRank;
        int c = dmi.c(dmi.c((a + (num3 == null ? 0 : num3.hashCode())) * 31, 31, this.userId), 31, this.userName);
        String str = this.userImageUrl;
        int c2 = ljg.c(dmi.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.teamName), 31, this.recalculatedAt);
        Integer num4 = this.roundId;
        int hashCode3 = (c2 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.currentScore;
        int hashCode4 = (hashCode3 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.wins;
        int hashCode5 = (hashCode4 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.draws;
        int hashCode6 = (hashCode5 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.losses;
        int hashCode7 = (hashCode6 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.points;
        int hashCode8 = (hashCode7 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Float f = this.scoreAgainst;
        return hashCode8 + (f != null ? f.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        FantasyLeague fantasyLeague = this.league;
        Integer num = this.rank;
        Integer num2 = this.totalScore;
        int i = this.joinedInRoundId;
        Integer num3 = this.previousRank;
        String str = this.userId;
        String str2 = this.userName;
        String str3 = this.userImageUrl;
        String str4 = this.teamName;
        long j = this.recalculatedAt;
        Integer num4 = this.roundId;
        Integer num5 = this.currentScore;
        Integer num6 = this.wins;
        Integer num7 = this.draws;
        Integer num8 = this.losses;
        Integer num9 = this.points;
        Float f = this.scoreAgainst;
        StringBuilder sb = new StringBuilder("FantasyUserLeague(league=");
        sb.append(fantasyLeague);
        sb.append(", rank=");
        sb.append(num);
        sb.append(", totalScore=");
        sb.append(num2);
        sb.append(", joinedInRoundId=");
        sb.append(i);
        sb.append(", previousRank=");
        vxd.s(num3, ", userId=", str, ", userName=", sb);
        bf3.v(sb, str2, ", userImageUrl=", str3, ", teamName=");
        i.n(j, str4, ", recalculatedAt=", sb);
        fn0.w(num4, num5, ", roundId=", ", currentScore=", sb);
        fn0.w(num6, num7, ", wins=", ", draws=", sb);
        fn0.w(num8, num9, ", losses=", ", points=", sb);
        sb.append(", scoreAgainst=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUserLeague$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyUserLeague;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyUserLeague$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyUserLeague(@Nullable FantasyLeague fantasyLeague, @Nullable Integer num, @Nullable Integer num2, int i, @Nullable Integer num3, @NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, long j, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Float f) {
        me4.p(str, str2, str4);
        this.league = fantasyLeague;
        this.rank = num;
        this.totalScore = num2;
        this.joinedInRoundId = i;
        this.previousRank = num3;
        this.userId = str;
        this.userName = str2;
        this.userImageUrl = str3;
        this.teamName = str4;
        this.recalculatedAt = j;
        this.roundId = num4;
        this.currentScore = num5;
        this.wins = num6;
        this.draws = num7;
        this.losses = num8;
        this.points = num9;
        this.scoreAgainst = f;
    }
}
