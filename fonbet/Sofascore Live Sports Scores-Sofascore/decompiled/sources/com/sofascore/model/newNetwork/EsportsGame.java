package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.Score$$serializer;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Status$$serializer;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.TeamSides;
import defpackage.a7a;
import defpackage.ljg;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011By\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010+Jr\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010#J\u001a\u00104\u001a\u00020\u00132\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b6\u0010)J\u0010\u00107\u001a\u00020\fHÂ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\fHÂ\u0003¢\u0006\u0004\b9\u00108J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b:\u0010)J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010%R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010HR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010H\u001a\u0004\bK\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010NR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010NR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010HR\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010O\u001a\u0004\bP\u0010\u0019\"\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/sofascore/model/newNetwork/EsportsGame;", "Ljava/io/Serializable;", "", "id", "Lcom/sofascore/model/mvvm/model/Status;", "status", "winnerCode", "", "startTimestamp", "length", "Lcom/sofascore/model/newNetwork/ESportMap;", "map", "Lcom/sofascore/model/mvvm/model/Score;", "homeScore", "awayScore", "homeTeamStartingSide", "<init>", "(ILcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;JLjava/lang/Integer;Lcom/sofascore/model/newNetwork/ESportMap;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;Ljava/lang/Integer;)V", "seen0", "", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;JLjava/lang/Integer;Lcom/sofascore/model/newNetwork/ESportMap;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;Ljava/lang/Integer;ZLt5h;)V", "isLive", "()Z", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHomeScore", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Lcom/sofascore/model/mvvm/model/Score;", "getAwayScore", "getHomeTeamStartingSide", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/Integer;", "getWinnerCode", "component1", "()I", "component2", "()Lcom/sofascore/model/mvvm/model/Status;", "component4", "()J", "component5", "()Ljava/lang/Integer;", "component6", "()Lcom/sofascore/model/newNetwork/ESportMap;", "copy", "(ILcom/sofascore/model/mvvm/model/Status;Ljava/lang/Integer;JLjava/lang/Integer;Lcom/sofascore/model/newNetwork/ESportMap;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/EsportsGame;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "component3", "component7", "()Lcom/sofascore/model/mvvm/model/Score;", "component8", "component9", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/EsportsGame;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/mvvm/model/Status;", "getStatus", "Ljava/lang/Integer;", "J", "getStartTimestamp", "getLength", "Lcom/sofascore/model/newNetwork/ESportMap;", "getMap", "Lcom/sofascore/model/mvvm/model/Score;", "Z", "getShouldReverseTeams", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EsportsGame implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Score awayScore;

    @NotNull
    private final Score homeScore;

    @Nullable
    private final Integer homeTeamStartingSide;
    private final int id;

    @Nullable
    private final Integer length;

    @Nullable
    private final ESportMap map;
    private boolean shouldReverseTeams;
    private final long startTimestamp;

    @NotNull
    private final Status status;

    @Nullable
    private final Integer winnerCode;

    public /* synthetic */ EsportsGame(int i, int i2, Status status, Integer num, long j, Integer num2, ESportMap eSportMap, Score score, Score score2, Integer num3, boolean z, t5h t5hVar) {
        if (511 != (i & 511)) {
            oea.z(i, 511, EsportsGame$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.status = status;
        this.winnerCode = num;
        this.startTimestamp = j;
        this.length = num2;
        this.map = eSportMap;
        this.homeScore = score;
        this.awayScore = score2;
        this.homeTeamStartingSide = num3;
        if ((i & 512) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
    }

    /* renamed from: component3, reason: from getter */
    private final Integer getWinnerCode() {
        return this.winnerCode;
    }

    /* renamed from: component7, reason: from getter */
    private final Score getHomeScore() {
        return this.homeScore;
    }

    /* renamed from: component8, reason: from getter */
    private final Score getAwayScore() {
        return this.awayScore;
    }

    /* renamed from: component9, reason: from getter */
    private final Integer getHomeTeamStartingSide() {
        return this.homeTeamStartingSide;
    }

    public static /* synthetic */ EsportsGame copy$default(EsportsGame esportsGame, int i, Status status, Integer num, long j, Integer num2, ESportMap eSportMap, Score score, Score score2, Integer num3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = esportsGame.id;
        }
        if ((i2 & 2) != 0) {
            status = esportsGame.status;
        }
        if ((i2 & 4) != 0) {
            num = esportsGame.winnerCode;
        }
        if ((i2 & 8) != 0) {
            j = esportsGame.startTimestamp;
        }
        if ((i2 & 16) != 0) {
            num2 = esportsGame.length;
        }
        if ((i2 & 32) != 0) {
            eSportMap = esportsGame.map;
        }
        if ((i2 & 64) != 0) {
            score = esportsGame.homeScore;
        }
        if ((i2 & 128) != 0) {
            score2 = esportsGame.awayScore;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num3 = esportsGame.homeTeamStartingSide;
        }
        Integer num4 = num3;
        Score score3 = score;
        Integer num5 = num2;
        long j2 = j;
        Integer num6 = num;
        return esportsGame.copy(i, status, num6, j2, num5, eSportMap, score3, score2, num4);
    }

    public static /* synthetic */ Score getAwayScore$default(EsportsGame esportsGame, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return esportsGame.getAwayScore(teamSides);
    }

    public static /* synthetic */ Score getHomeScore$default(EsportsGame esportsGame, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return esportsGame.getHomeScore(teamSides);
    }

    public static /* synthetic */ Integer getHomeTeamStartingSide$default(EsportsGame esportsGame, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return esportsGame.getHomeTeamStartingSide(teamSides);
    }

    public static /* synthetic */ Integer getWinnerCode$default(EsportsGame esportsGame, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return esportsGame.getWinnerCode(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(EsportsGame self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.f(serialDesc, 1, Status$$serializer.INSTANCE, self.status);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.winnerCode);
        output.E(serialDesc, 3, self.startTimestamp);
        output.h(serialDesc, 4, a7aVar, self.length);
        output.h(serialDesc, 5, ESportMap$$serializer.INSTANCE, self.map);
        Score$$serializer score$$serializer = Score$$serializer.INSTANCE;
        output.f(serialDesc, 6, score$$serializer, self.homeScore);
        output.f(serialDesc, 7, score$$serializer, self.awayScore);
        output.h(serialDesc, 8, a7aVar, self.homeTeamStartingSide);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 9, self.shouldReverseTeams);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getLength() {
        return this.length;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final ESportMap getMap() {
        return this.map;
    }

    @NotNull
    public final EsportsGame copy(int id, @NotNull Status status, @Nullable Integer winnerCode, long startTimestamp, @Nullable Integer length, @Nullable ESportMap map, @NotNull Score homeScore, @NotNull Score awayScore, @Nullable Integer homeTeamStartingSide) {
        status.getClass();
        homeScore.getClass();
        awayScore.getClass();
        return new EsportsGame(id, status, winnerCode, startTimestamp, length, map, homeScore, awayScore, homeTeamStartingSide);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EsportsGame)) {
            return false;
        }
        EsportsGame esportsGame = (EsportsGame) other;
        return this.id == esportsGame.id && Intrinsics.c(this.status, esportsGame.status) && Intrinsics.c(this.winnerCode, esportsGame.winnerCode) && this.startTimestamp == esportsGame.startTimestamp && Intrinsics.c(this.length, esportsGame.length) && Intrinsics.c(this.map, esportsGame.map) && Intrinsics.c(this.homeScore, esportsGame.homeScore) && Intrinsics.c(this.awayScore, esportsGame.awayScore) && Intrinsics.c(this.homeTeamStartingSide, esportsGame.homeTeamStartingSide);
    }

    @NotNull
    public final Score getAwayScore(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homeScore : this.awayScore;
    }

    @NotNull
    public final Score getHomeScore(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayScore : this.homeScore;
    }

    @Nullable
    public final Integer getHomeTeamStartingSide(@NotNull TeamSides side) {
        side.getClass();
        Integer num = this.homeTeamStartingSide;
        if (num != null) {
            return Integer.valueOf(EsportsGameKt.reverseESportsSide(num.intValue(), side == TeamSides.REVERSIBLE && this.shouldReverseTeams));
        }
        return null;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getLength() {
        return this.length;
    }

    @Nullable
    public final ESportMap getMap() {
        return this.map;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getWinnerCode(@NotNull TeamSides side) {
        Integer num;
        side.getClass();
        Integer num2 = this.winnerCode;
        if (num2 != null && num2.intValue() == 1) {
            num = (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? null : 1;
            return Integer.valueOf(num != null ? num.intValue() : 2);
        }
        if (num2 == null || num2.intValue() != 2) {
            return this.winnerCode;
        }
        num = (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? null : 2;
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
        Integer num = this.winnerCode;
        int c = ljg.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.startTimestamp);
        Integer num2 = this.length;
        int hashCode2 = (c + (num2 == null ? 0 : num2.hashCode())) * 31;
        ESportMap eSportMap = this.map;
        int c2 = me4.c(this.awayScore, me4.c(this.homeScore, (hashCode2 + (eSportMap == null ? 0 : eSportMap.hashCode())) * 31, 31), 31);
        Integer num3 = this.homeTeamStartingSide;
        return c2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final boolean isLive() {
        return Intrinsics.c(this.status.getType(), StatusKt.STATUS_IN_PROGRESS);
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        return "EsportsGame(id=" + this.id + ", status=" + this.status + ", winnerCode=" + this.winnerCode + ", startTimestamp=" + this.startTimestamp + ", length=" + this.length + ", map=" + this.map + ", homeScore=" + this.homeScore + ", awayScore=" + this.awayScore + ", homeTeamStartingSide=" + this.homeTeamStartingSide + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/EsportsGame$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/EsportsGame;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EsportsGame$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EsportsGame(int i, @NotNull Status status, @Nullable Integer num, long j, @Nullable Integer num2, @Nullable ESportMap eSportMap, @NotNull Score score, @NotNull Score score2, @Nullable Integer num3) {
        status.getClass();
        score.getClass();
        score2.getClass();
        this.id = i;
        this.status = status;
        this.winnerCode = num;
        this.startTimestamp = j;
        this.length = num2;
        this.map = eSportMap;
        this.homeScore = score;
        this.awayScore = score2;
        this.homeTeamStartingSide = num3;
    }
}
