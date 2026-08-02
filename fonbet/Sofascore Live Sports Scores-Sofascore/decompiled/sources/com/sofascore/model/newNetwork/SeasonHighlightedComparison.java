package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.Team;
import defpackage.dtg;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011Bu\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b-\u0010,Jz\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b=\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\b@\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bC\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bF\u0010,¨\u0006I"}, d2 = {"Lcom/sofascore/model/newNetwork/SeasonHighlightedComparison;", "", "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "Lcom/sofascore/model/mvvm/model/Team;", "homeTeam", "awayTeam", "Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;", "homeTeamStatistics", "awayTeamStatistics", "Lcom/sofascore/model/newNetwork/PlayerTeam;", "player1", "player2", "Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;", "player1Statistics", "player2Statistics", "<init>", "(Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;Lcom/sofascore/model/newNetwork/PlayerTeam;Lcom/sofascore/model/newNetwork/PlayerTeam;Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;Lcom/sofascore/model/newNetwork/PlayerTeam;Lcom/sofascore/model/newNetwork/PlayerTeam;Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/SeasonHighlightedComparison;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Season;", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "component4", "()Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;", "component5", "component6", "()Lcom/sofascore/model/newNetwork/PlayerTeam;", "component7", "component8", "()Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;", "component9", "copy", "(Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;Lcom/sofascore/model/newNetwork/PlayerTeam;Lcom/sofascore/model/newNetwork/PlayerTeam;Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;)Lcom/sofascore/model/newNetwork/SeasonHighlightedComparison;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "Lcom/sofascore/model/mvvm/model/Team;", "getHomeTeam", "getAwayTeam", "Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;", "getHomeTeamStatistics", "getAwayTeamStatistics", "Lcom/sofascore/model/newNetwork/PlayerTeam;", "getPlayer1", "getPlayer2", "Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;", "getPlayer1Statistics", "getPlayer2Statistics", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SeasonHighlightedComparison {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Team awayTeam;

    @Nullable
    private final FootballTeamHighlightedStatistics awayTeamStatistics;

    @Nullable
    private final Team homeTeam;

    @Nullable
    private final FootballTeamHighlightedStatistics homeTeamStatistics;

    @Nullable
    private final PlayerTeam player1;

    @Nullable
    private final FootballPlayerHighlightedStatistics player1Statistics;

    @Nullable
    private final PlayerTeam player2;

    @Nullable
    private final FootballPlayerHighlightedStatistics player2Statistics;

    @NotNull
    private final Season season;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new dtg(12)), ypa.a(ysaVar, new dtg(13)), null, null, null, null, null, null};
    }

    public /* synthetic */ SeasonHighlightedComparison(int i, Season season, Team team, Team team2, FootballTeamHighlightedStatistics footballTeamHighlightedStatistics, FootballTeamHighlightedStatistics footballTeamHighlightedStatistics2, PlayerTeam playerTeam, PlayerTeam playerTeam2, FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics, FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics2, t5h t5hVar) {
        if (511 != (i & 511)) {
            oea.z(i, 511, SeasonHighlightedComparison$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.season = season;
        this.homeTeam = team;
        this.awayTeam = team2;
        this.homeTeamStatistics = footballTeamHighlightedStatistics;
        this.awayTeamStatistics = footballTeamHighlightedStatistics2;
        this.player1 = playerTeam;
        this.player2 = playerTeam2;
        this.player1Statistics = footballPlayerHighlightedStatistics;
        this.player2Statistics = footballPlayerHighlightedStatistics2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ SeasonHighlightedComparison copy$default(SeasonHighlightedComparison seasonHighlightedComparison, Season season, Team team, Team team2, FootballTeamHighlightedStatistics footballTeamHighlightedStatistics, FootballTeamHighlightedStatistics footballTeamHighlightedStatistics2, PlayerTeam playerTeam, PlayerTeam playerTeam2, FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics, FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics2, int i, Object obj) {
        if ((i & 1) != 0) {
            season = seasonHighlightedComparison.season;
        }
        if ((i & 2) != 0) {
            team = seasonHighlightedComparison.homeTeam;
        }
        if ((i & 4) != 0) {
            team2 = seasonHighlightedComparison.awayTeam;
        }
        if ((i & 8) != 0) {
            footballTeamHighlightedStatistics = seasonHighlightedComparison.homeTeamStatistics;
        }
        if ((i & 16) != 0) {
            footballTeamHighlightedStatistics2 = seasonHighlightedComparison.awayTeamStatistics;
        }
        if ((i & 32) != 0) {
            playerTeam = seasonHighlightedComparison.player1;
        }
        if ((i & 64) != 0) {
            playerTeam2 = seasonHighlightedComparison.player2;
        }
        if ((i & 128) != 0) {
            footballPlayerHighlightedStatistics = seasonHighlightedComparison.player1Statistics;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            footballPlayerHighlightedStatistics2 = seasonHighlightedComparison.player2Statistics;
        }
        FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics3 = footballPlayerHighlightedStatistics;
        FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics4 = footballPlayerHighlightedStatistics2;
        PlayerTeam playerTeam3 = playerTeam;
        PlayerTeam playerTeam4 = playerTeam2;
        FootballTeamHighlightedStatistics footballTeamHighlightedStatistics3 = footballTeamHighlightedStatistics2;
        Team team3 = team2;
        return seasonHighlightedComparison.copy(season, team, team3, footballTeamHighlightedStatistics, footballTeamHighlightedStatistics3, playerTeam3, playerTeam4, footballPlayerHighlightedStatistics3, footballPlayerHighlightedStatistics4);
    }

    public static final /* synthetic */ void write$Self$model_release(SeasonHighlightedComparison self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, Season$$serializer.INSTANCE, self.season);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.homeTeam);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.awayTeam);
        FootballTeamHighlightedStatistics$$serializer footballTeamHighlightedStatistics$$serializer = FootballTeamHighlightedStatistics$$serializer.INSTANCE;
        output.h(serialDesc, 3, footballTeamHighlightedStatistics$$serializer, self.homeTeamStatistics);
        output.h(serialDesc, 4, footballTeamHighlightedStatistics$$serializer, self.awayTeamStatistics);
        PlayerTeam$$serializer playerTeam$$serializer = PlayerTeam$$serializer.INSTANCE;
        output.h(serialDesc, 5, playerTeam$$serializer, self.player1);
        output.h(serialDesc, 6, playerTeam$$serializer, self.player2);
        FootballPlayerHighlightedStatistics$$serializer footballPlayerHighlightedStatistics$$serializer = FootballPlayerHighlightedStatistics$$serializer.INSTANCE;
        output.h(serialDesc, 7, footballPlayerHighlightedStatistics$$serializer, self.player1Statistics);
        output.h(serialDesc, 8, footballPlayerHighlightedStatistics$$serializer, self.player2Statistics);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Season getSeason() {
        return this.season;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Team getHomeTeam() {
        return this.homeTeam;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Team getAwayTeam() {
        return this.awayTeam;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final FootballTeamHighlightedStatistics getHomeTeamStatistics() {
        return this.homeTeamStatistics;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final FootballTeamHighlightedStatistics getAwayTeamStatistics() {
        return this.awayTeamStatistics;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final PlayerTeam getPlayer1() {
        return this.player1;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final PlayerTeam getPlayer2() {
        return this.player2;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final FootballPlayerHighlightedStatistics getPlayer1Statistics() {
        return this.player1Statistics;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final FootballPlayerHighlightedStatistics getPlayer2Statistics() {
        return this.player2Statistics;
    }

    @NotNull
    public final SeasonHighlightedComparison copy(@NotNull Season season, @Nullable Team homeTeam, @Nullable Team awayTeam, @Nullable FootballTeamHighlightedStatistics homeTeamStatistics, @Nullable FootballTeamHighlightedStatistics awayTeamStatistics, @Nullable PlayerTeam player1, @Nullable PlayerTeam player2, @Nullable FootballPlayerHighlightedStatistics player1Statistics, @Nullable FootballPlayerHighlightedStatistics player2Statistics) {
        season.getClass();
        return new SeasonHighlightedComparison(season, homeTeam, awayTeam, homeTeamStatistics, awayTeamStatistics, player1, player2, player1Statistics, player2Statistics);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonHighlightedComparison)) {
            return false;
        }
        SeasonHighlightedComparison seasonHighlightedComparison = (SeasonHighlightedComparison) other;
        return Intrinsics.c(this.season, seasonHighlightedComparison.season) && Intrinsics.c(this.homeTeam, seasonHighlightedComparison.homeTeam) && Intrinsics.c(this.awayTeam, seasonHighlightedComparison.awayTeam) && Intrinsics.c(this.homeTeamStatistics, seasonHighlightedComparison.homeTeamStatistics) && Intrinsics.c(this.awayTeamStatistics, seasonHighlightedComparison.awayTeamStatistics) && Intrinsics.c(this.player1, seasonHighlightedComparison.player1) && Intrinsics.c(this.player2, seasonHighlightedComparison.player2) && Intrinsics.c(this.player1Statistics, seasonHighlightedComparison.player1Statistics) && Intrinsics.c(this.player2Statistics, seasonHighlightedComparison.player2Statistics);
    }

    @Nullable
    public final Team getAwayTeam() {
        return this.awayTeam;
    }

    @Nullable
    public final FootballTeamHighlightedStatistics getAwayTeamStatistics() {
        return this.awayTeamStatistics;
    }

    @Nullable
    public final Team getHomeTeam() {
        return this.homeTeam;
    }

    @Nullable
    public final FootballTeamHighlightedStatistics getHomeTeamStatistics() {
        return this.homeTeamStatistics;
    }

    @Nullable
    public final PlayerTeam getPlayer1() {
        return this.player1;
    }

    @Nullable
    public final FootballPlayerHighlightedStatistics getPlayer1Statistics() {
        return this.player1Statistics;
    }

    @Nullable
    public final PlayerTeam getPlayer2() {
        return this.player2;
    }

    @Nullable
    public final FootballPlayerHighlightedStatistics getPlayer2Statistics() {
        return this.player2Statistics;
    }

    @NotNull
    public final Season getSeason() {
        return this.season;
    }

    public int hashCode() {
        int hashCode = this.season.hashCode() * 31;
        Team team = this.homeTeam;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        Team team2 = this.awayTeam;
        int hashCode3 = (hashCode2 + (team2 == null ? 0 : team2.hashCode())) * 31;
        FootballTeamHighlightedStatistics footballTeamHighlightedStatistics = this.homeTeamStatistics;
        int hashCode4 = (hashCode3 + (footballTeamHighlightedStatistics == null ? 0 : footballTeamHighlightedStatistics.hashCode())) * 31;
        FootballTeamHighlightedStatistics footballTeamHighlightedStatistics2 = this.awayTeamStatistics;
        int hashCode5 = (hashCode4 + (footballTeamHighlightedStatistics2 == null ? 0 : footballTeamHighlightedStatistics2.hashCode())) * 31;
        PlayerTeam playerTeam = this.player1;
        int hashCode6 = (hashCode5 + (playerTeam == null ? 0 : playerTeam.hashCode())) * 31;
        PlayerTeam playerTeam2 = this.player2;
        int hashCode7 = (hashCode6 + (playerTeam2 == null ? 0 : playerTeam2.hashCode())) * 31;
        FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics = this.player1Statistics;
        int hashCode8 = (hashCode7 + (footballPlayerHighlightedStatistics == null ? 0 : footballPlayerHighlightedStatistics.hashCode())) * 31;
        FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics2 = this.player2Statistics;
        return hashCode8 + (footballPlayerHighlightedStatistics2 != null ? footballPlayerHighlightedStatistics2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SeasonHighlightedComparison(season=" + this.season + ", homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ", homeTeamStatistics=" + this.homeTeamStatistics + ", awayTeamStatistics=" + this.awayTeamStatistics + ", player1=" + this.player1 + ", player2=" + this.player2 + ", player1Statistics=" + this.player1Statistics + ", player2Statistics=" + this.player2Statistics + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/SeasonHighlightedComparison$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/SeasonHighlightedComparison;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SeasonHighlightedComparison$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SeasonHighlightedComparison(@NotNull Season season, @Nullable Team team, @Nullable Team team2, @Nullable FootballTeamHighlightedStatistics footballTeamHighlightedStatistics, @Nullable FootballTeamHighlightedStatistics footballTeamHighlightedStatistics2, @Nullable PlayerTeam playerTeam, @Nullable PlayerTeam playerTeam2, @Nullable FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics, @Nullable FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics2) {
        season.getClass();
        this.season = season;
        this.homeTeam = team;
        this.awayTeam = team2;
        this.homeTeamStatistics = footballTeamHighlightedStatistics;
        this.awayTeamStatistics = footballTeamHighlightedStatistics2;
        this.player1 = playerTeam;
        this.player2 = playerTeam2;
        this.player1Statistics = footballPlayerHighlightedStatistics;
        this.player2Statistics = footballPlayerHighlightedStatistics2;
    }
}
