package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics$$serializer;
import defpackage.boe;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\n\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J<\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010%¨\u0006;"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerOfTheSeasonResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lcom/sofascore/model/newNetwork/statistics/season/player/FootballPlayerSeasonStatistics;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", "playerOfTheTournament", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/statistics/season/player/FootballPlayerSeasonStatistics;Z)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/statistics/season/player/FootballPlayerSeasonStatistics;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerOfTheSeasonResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "()Lcom/sofascore/model/newNetwork/statistics/season/player/FootballPlayerSeasonStatistics;", "component4", "()Z", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/statistics/season/player/FootballPlayerSeasonStatistics;Z)Lcom/sofascore/model/newNetwork/PlayerOfTheSeasonResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Lcom/sofascore/model/newNetwork/statistics/season/player/FootballPlayerSeasonStatistics;", "getStatistics", "Z", "getPlayerOfTheTournament", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerOfTheSeasonResponse extends NetworkResponse {

    @NotNull
    private final Player player;
    private final boolean playerOfTheTournament;

    @Nullable
    private final FootballPlayerSeasonStatistics statistics;

    @Nullable
    private final Team team;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new boe(18)), null, null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayerOfTheSeasonResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, Player player, Team team, FootballPlayerSeasonStatistics footballPlayerSeasonStatistics, boolean z, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (28 != (i & 28)) {
            oea.z(i, 28, PlayerOfTheSeasonResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.team = team;
        this.statistics = footballPlayerSeasonStatistics;
        if ((i & 32) == 0) {
            this.playerOfTheTournament = false;
        } else {
            this.playerOfTheTournament = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ PlayerOfTheSeasonResponse copy$default(PlayerOfTheSeasonResponse playerOfTheSeasonResponse, Player player, Team team, FootballPlayerSeasonStatistics footballPlayerSeasonStatistics, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            player = playerOfTheSeasonResponse.player;
        }
        if ((i & 2) != 0) {
            team = playerOfTheSeasonResponse.team;
        }
        if ((i & 4) != 0) {
            footballPlayerSeasonStatistics = playerOfTheSeasonResponse.statistics;
        }
        if ((i & 8) != 0) {
            z = playerOfTheSeasonResponse.playerOfTheTournament;
        }
        return playerOfTheSeasonResponse.copy(player, team, footballPlayerSeasonStatistics, z);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerOfTheSeasonResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 2, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.team);
        output.h(serialDesc, 4, FootballPlayerSeasonStatistics$$serializer.INSTANCE, self.statistics);
        if (output.o(serialDesc) || self.playerOfTheTournament) {
            output.x(serialDesc, 5, self.playerOfTheTournament);
        }
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final FootballPlayerSeasonStatistics getStatistics() {
        return this.statistics;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPlayerOfTheTournament() {
        return this.playerOfTheTournament;
    }

    @NotNull
    public final PlayerOfTheSeasonResponse copy(@NotNull Player player, @Nullable Team team, @Nullable FootballPlayerSeasonStatistics statistics, boolean playerOfTheTournament) {
        player.getClass();
        return new PlayerOfTheSeasonResponse(player, team, statistics, playerOfTheTournament);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerOfTheSeasonResponse)) {
            return false;
        }
        PlayerOfTheSeasonResponse playerOfTheSeasonResponse = (PlayerOfTheSeasonResponse) other;
        return Intrinsics.c(this.player, playerOfTheSeasonResponse.player) && Intrinsics.c(this.team, playerOfTheSeasonResponse.team) && Intrinsics.c(this.statistics, playerOfTheSeasonResponse.statistics) && this.playerOfTheTournament == playerOfTheSeasonResponse.playerOfTheTournament;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    public final boolean getPlayerOfTheTournament() {
        return this.playerOfTheTournament;
    }

    @Nullable
    public final FootballPlayerSeasonStatistics getStatistics() {
        return this.statistics;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        int hashCode = this.player.hashCode() * 31;
        Team team = this.team;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        FootballPlayerSeasonStatistics footballPlayerSeasonStatistics = this.statistics;
        return Boolean.hashCode(this.playerOfTheTournament) + ((hashCode2 + (footballPlayerSeasonStatistics != null ? footballPlayerSeasonStatistics.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "PlayerOfTheSeasonResponse(player=" + this.player + ", team=" + this.team + ", statistics=" + this.statistics + ", playerOfTheTournament=" + this.playerOfTheTournament + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerOfTheSeasonResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerOfTheSeasonResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerOfTheSeasonResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlayerOfTheSeasonResponse(@NotNull Player player, @Nullable Team team, @Nullable FootballPlayerSeasonStatistics footballPlayerSeasonStatistics, boolean z) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        player.getClass();
        this.player = player;
        this.team = team;
        this.statistics = footballPlayerSeasonStatistics;
        this.playerOfTheTournament = z;
    }

    public /* synthetic */ PlayerOfTheSeasonResponse(Player player, Team team, FootballPlayerSeasonStatistics footballPlayerSeasonStatistics, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(player, team, footballPlayerSeasonStatistics, (i & 8) != 0 ? false : z);
    }
}
