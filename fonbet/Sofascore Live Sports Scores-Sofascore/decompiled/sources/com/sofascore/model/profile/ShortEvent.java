package com.sofascore.model.profile;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.Score;
import com.sofascore.model.mvvm.model.Score$$serializer;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.Status$$serializer;
import com.sofascore.model.mvvm.model.TeamSides;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.mvvm.model.Time$$serializer;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fn0;
import defpackage.ljg;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002YXBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b#\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b0\u0010\u001bJ\u0010\u00101\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b1\u0010\u001bJ\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b6\u00107J\u0080\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b=\u0010'J\u001a\u0010?\u001a\u00020\f2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@J'\u0010I\u001a\u00020F2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0001¢\u0006\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\b\u001e\u0010)R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010L\u001a\u0004\b \u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\b!\u0010,R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010M\u001a\u0004\b#\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\bQ\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010P\u001a\u0004\bR\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\b$\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010T\u001a\u0004\bU\u00105R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bW\u00107¨\u0006Z"}, d2 = {"Lcom/sofascore/model/profile/ShortEvent;", "", "", "id", "Lcom/sofascore/model/profile/ShortTeam;", "homeTeam", "awayTeam", "Lcom/sofascore/model/mvvm/model/Score;", "homeScore", "awayScore", "", "startTimestamp", "", "displayInverseHomeAwayTeams", "crowdsourcingDataDisplayEnabled", "winnerCode", "Lcom/sofascore/model/mvvm/model/Status;", "status", "Lcom/sofascore/model/mvvm/model/Time;", "time", "<init>", "(ILcom/sofascore/model/profile/ShortTeam;Lcom/sofascore/model/profile/ShortTeam;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;JZZLjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Status;Lcom/sofascore/model/mvvm/model/Time;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILcom/sofascore/model/profile/ShortTeam;Lcom/sofascore/model/profile/ShortTeam;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;JZZLjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Status;Lcom/sofascore/model/mvvm/model/Time;Lt5h;)V", "shouldReverseTeams", "()Z", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHomeTeam", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Lcom/sofascore/model/profile/ShortTeam;", "getAwayTeam", "getHomeScore", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Lcom/sofascore/model/mvvm/model/Score;", "getAwayScore", "getWinnerCode", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/Integer;", "component1", "()I", "component2", "()Lcom/sofascore/model/profile/ShortTeam;", "component3", "component4", "()Lcom/sofascore/model/mvvm/model/Score;", "component5", "component6", "()J", "component7", "component8", "component9", "()Ljava/lang/Integer;", "component10", "()Lcom/sofascore/model/mvvm/model/Status;", "component11", "()Lcom/sofascore/model/mvvm/model/Time;", "copy", "(ILcom/sofascore/model/profile/ShortTeam;Lcom/sofascore/model/profile/ShortTeam;Lcom/sofascore/model/mvvm/model/Score;Lcom/sofascore/model/mvvm/model/Score;JZZLjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Status;Lcom/sofascore/model/mvvm/model/Time;)Lcom/sofascore/model/profile/ShortEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/ShortEvent;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Lcom/sofascore/model/profile/ShortTeam;", "Lcom/sofascore/model/mvvm/model/Score;", "J", "getStartTimestamp", "Z", "getDisplayInverseHomeAwayTeams", "getCrowdsourcingDataDisplayEnabled", "Ljava/lang/Integer;", "Lcom/sofascore/model/mvvm/model/Status;", "getStatus", "Lcom/sofascore/model/mvvm/model/Time;", "getTime", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShortEvent {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Score awayScore;

    @NotNull
    private final ShortTeam awayTeam;
    private final boolean crowdsourcingDataDisplayEnabled;
    private final boolean displayInverseHomeAwayTeams;

    @NotNull
    private final Score homeScore;

    @NotNull
    private final ShortTeam homeTeam;
    private final int id;
    private final long startTimestamp;

    @NotNull
    private final Status status;

    @NotNull
    private final Time time;

    @Nullable
    private final Integer winnerCode;

    public ShortEvent(int i, @NotNull ShortTeam shortTeam, @NotNull ShortTeam shortTeam2, @NotNull Score score, @NotNull Score score2, long j, boolean z, boolean z2, @Nullable Integer num, @NotNull Status status, @NotNull Time time) {
        shortTeam.getClass();
        shortTeam2.getClass();
        score.getClass();
        score2.getClass();
        status.getClass();
        time.getClass();
        this.id = i;
        this.homeTeam = shortTeam;
        this.awayTeam = shortTeam2;
        this.homeScore = score;
        this.awayScore = score2;
        this.startTimestamp = j;
        this.displayInverseHomeAwayTeams = z;
        this.crowdsourcingDataDisplayEnabled = z2;
        this.winnerCode = num;
        this.status = status;
        this.time = time;
    }

    public static /* synthetic */ ShortEvent copy$default(ShortEvent shortEvent, int i, ShortTeam shortTeam, ShortTeam shortTeam2, Score score, Score score2, long j, boolean z, boolean z2, Integer num, Status status, Time time, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shortEvent.id;
        }
        if ((i2 & 2) != 0) {
            shortTeam = shortEvent.homeTeam;
        }
        if ((i2 & 4) != 0) {
            shortTeam2 = shortEvent.awayTeam;
        }
        if ((i2 & 8) != 0) {
            score = shortEvent.homeScore;
        }
        if ((i2 & 16) != 0) {
            score2 = shortEvent.awayScore;
        }
        if ((i2 & 32) != 0) {
            j = shortEvent.startTimestamp;
        }
        if ((i2 & 64) != 0) {
            z = shortEvent.displayInverseHomeAwayTeams;
        }
        if ((i2 & 128) != 0) {
            z2 = shortEvent.crowdsourcingDataDisplayEnabled;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num = shortEvent.winnerCode;
        }
        if ((i2 & 512) != 0) {
            status = shortEvent.status;
        }
        if ((i2 & 1024) != 0) {
            time = shortEvent.time;
        }
        Time time2 = time;
        Integer num2 = num;
        boolean z3 = z;
        long j2 = j;
        Score score3 = score;
        Score score4 = score2;
        ShortTeam shortTeam3 = shortTeam2;
        return shortEvent.copy(i, shortTeam, shortTeam3, score3, score4, j2, z3, z2, num2, status, time2);
    }

    public static /* synthetic */ Score getAwayScore$default(ShortEvent shortEvent, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return shortEvent.getAwayScore(teamSides);
    }

    public static /* synthetic */ ShortTeam getAwayTeam$default(ShortEvent shortEvent, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return shortEvent.getAwayTeam(teamSides);
    }

    public static /* synthetic */ Score getHomeScore$default(ShortEvent shortEvent, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return shortEvent.getHomeScore(teamSides);
    }

    public static /* synthetic */ ShortTeam getHomeTeam$default(ShortEvent shortEvent, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return shortEvent.getHomeTeam(teamSides);
    }

    public static /* synthetic */ Integer getWinnerCode$default(ShortEvent shortEvent, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return shortEvent.getWinnerCode(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(ShortEvent self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        ShortTeam$$serializer shortTeam$$serializer = ShortTeam$$serializer.INSTANCE;
        output.f(serialDesc, 1, shortTeam$$serializer, self.homeTeam);
        output.f(serialDesc, 2, shortTeam$$serializer, self.awayTeam);
        Score$$serializer score$$serializer = Score$$serializer.INSTANCE;
        output.f(serialDesc, 3, score$$serializer, self.homeScore);
        output.f(serialDesc, 4, score$$serializer, self.awayScore);
        output.E(serialDesc, 5, self.startTimestamp);
        output.x(serialDesc, 6, self.displayInverseHomeAwayTeams);
        output.x(serialDesc, 7, self.crowdsourcingDataDisplayEnabled);
        output.h(serialDesc, 8, a7a.a, self.winnerCode);
        output.f(serialDesc, 9, Status$$serializer.INSTANCE, self.status);
        output.f(serialDesc, 10, Time$$serializer.INSTANCE, self.time);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final Time getTime() {
        return this.time;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ShortTeam getHomeTeam() {
        return this.homeTeam;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ShortTeam getAwayTeam() {
        return this.awayTeam;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Score getHomeScore() {
        return this.homeScore;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Score getAwayScore() {
        return this.awayScore;
    }

    /* renamed from: component6, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDisplayInverseHomeAwayTeams() {
        return this.displayInverseHomeAwayTeams;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getCrowdsourcingDataDisplayEnabled() {
        return this.crowdsourcingDataDisplayEnabled;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getWinnerCode() {
        return this.winnerCode;
    }

    @NotNull
    public final ShortEvent copy(int id, @NotNull ShortTeam homeTeam, @NotNull ShortTeam awayTeam, @NotNull Score homeScore, @NotNull Score awayScore, long startTimestamp, boolean displayInverseHomeAwayTeams, boolean crowdsourcingDataDisplayEnabled, @Nullable Integer winnerCode, @NotNull Status status, @NotNull Time time) {
        homeTeam.getClass();
        awayTeam.getClass();
        homeScore.getClass();
        awayScore.getClass();
        status.getClass();
        time.getClass();
        return new ShortEvent(id, homeTeam, awayTeam, homeScore, awayScore, startTimestamp, displayInverseHomeAwayTeams, crowdsourcingDataDisplayEnabled, winnerCode, status, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortEvent)) {
            return false;
        }
        ShortEvent shortEvent = (ShortEvent) other;
        return this.id == shortEvent.id && Intrinsics.c(this.homeTeam, shortEvent.homeTeam) && Intrinsics.c(this.awayTeam, shortEvent.awayTeam) && Intrinsics.c(this.homeScore, shortEvent.homeScore) && Intrinsics.c(this.awayScore, shortEvent.awayScore) && this.startTimestamp == shortEvent.startTimestamp && this.displayInverseHomeAwayTeams == shortEvent.displayInverseHomeAwayTeams && this.crowdsourcingDataDisplayEnabled == shortEvent.crowdsourcingDataDisplayEnabled && Intrinsics.c(this.winnerCode, shortEvent.winnerCode) && Intrinsics.c(this.status, shortEvent.status) && Intrinsics.c(this.time, shortEvent.time);
    }

    @NotNull
    public final Score getAwayScore(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? this.homeScore : this.awayScore;
    }

    @NotNull
    public final ShortTeam getAwayTeam(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? this.homeTeam : this.awayTeam;
    }

    public final boolean getCrowdsourcingDataDisplayEnabled() {
        return this.crowdsourcingDataDisplayEnabled;
    }

    public final boolean getDisplayInverseHomeAwayTeams() {
        return this.displayInverseHomeAwayTeams;
    }

    @NotNull
    public final Score getHomeScore(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? this.awayScore : this.homeScore;
    }

    @NotNull
    public final ShortTeam getHomeTeam(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? this.awayTeam : this.homeTeam;
    }

    public final int getId() {
        return this.id;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    @NotNull
    public final Time getTime() {
        return this.time;
    }

    @Nullable
    public final Integer getWinnerCode(@NotNull TeamSides side) {
        Integer num;
        side.getClass();
        Integer num2 = this.winnerCode;
        if (num2 != null && num2.intValue() == 1) {
            num = (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? null : 1;
            return Integer.valueOf(num != null ? num.intValue() : 2);
        }
        if (num2 == null || num2.intValue() != 2) {
            return this.winnerCode;
        }
        num = (side == TeamSides.REVERSIBLE && shouldReverseTeams()) ? null : 2;
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }

    public int hashCode() {
        int e = dmi.e(dmi.e(ljg.c(me4.c(this.awayScore, me4.c(this.homeScore, (this.awayTeam.hashCode() + ((this.homeTeam.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31, 31), 31), 31, this.startTimestamp), 31, this.displayInverseHomeAwayTeams), 31, this.crowdsourcingDataDisplayEnabled);
        Integer num = this.winnerCode;
        return this.time.hashCode() + ((this.status.hashCode() + ((e + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }

    public final boolean shouldReverseTeams() {
        return this.displayInverseHomeAwayTeams;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        ShortTeam shortTeam = this.homeTeam;
        ShortTeam shortTeam2 = this.awayTeam;
        Score score = this.homeScore;
        Score score2 = this.awayScore;
        long j = this.startTimestamp;
        boolean z = this.displayInverseHomeAwayTeams;
        boolean z2 = this.crowdsourcingDataDisplayEnabled;
        Integer num = this.winnerCode;
        Status status = this.status;
        Time time = this.time;
        StringBuilder sb = new StringBuilder("ShortEvent(id=");
        sb.append(i);
        sb.append(", homeTeam=");
        sb.append(shortTeam);
        sb.append(", awayTeam=");
        sb.append(shortTeam2);
        sb.append(", homeScore=");
        sb.append(score);
        sb.append(", awayScore=");
        sb.append(score2);
        sb.append(", startTimestamp=");
        sb.append(j);
        fn0.y(", displayInverseHomeAwayTeams=", ", crowdsourcingDataDisplayEnabled=", sb, z, z2);
        sb.append(", winnerCode=");
        sb.append(num);
        sb.append(", status=");
        sb.append(status);
        sb.append(", time=");
        sb.append(time);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/ShortEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/ShortEvent;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ShortEvent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @NotNull
    public final Score getAwayScore() {
        return this.awayScore;
    }

    @NotNull
    public final ShortTeam getAwayTeam() {
        return this.awayTeam;
    }

    @NotNull
    public final Score getHomeScore() {
        return this.homeScore;
    }

    @NotNull
    public final ShortTeam getHomeTeam() {
        return this.homeTeam;
    }

    public /* synthetic */ ShortEvent(int i, int i2, ShortTeam shortTeam, ShortTeam shortTeam2, Score score, Score score2, long j, boolean z, boolean z2, Integer num, Status status, Time time, t5h t5hVar) {
        if (2047 != (i & 2047)) {
            oea.z(i, 2047, ShortEvent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.homeTeam = shortTeam;
        this.awayTeam = shortTeam2;
        this.homeScore = score;
        this.awayScore = score2;
        this.startTimestamp = j;
        this.displayInverseHomeAwayTeams = z;
        this.crowdsourcingDataDisplayEnabled = z2;
        this.winnerCode = num;
        this.status = status;
        this.time = time;
    }

    @Nullable
    public final Integer getWinnerCode() {
        return this.winnerCode;
    }
}
