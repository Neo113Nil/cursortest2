package com.sofascore.model.network.response;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.PlayerDataExtras;
import com.sofascore.model.mvvm.model.PlayerDataExtras$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.serializers.PlayerEventStatisticsSerializer;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import defpackage.boe;
import defpackage.fc6;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u000f\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b-\u0010.JX\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b1\u0010*J\u0010\u00102\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010*R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010.¨\u0006G"}, d2 = {"Lcom/sofascore/model/network/response/PlayerEventStatisticsResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", "position", "", "Lcom/sofascore/model/network/response/StatisticsForPeriod;", "periods", "Lcom/sofascore/model/mvvm/model/PlayerDataExtras;", "extra", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/network/response/PlayerEventStatistics;Ljava/lang/String;Ljava/util/List;Lcom/sofascore/model/mvvm/model/PlayerDataExtras;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/network/response/PlayerEventStatistics;Ljava/lang/String;Ljava/util/List;Lcom/sofascore/model/mvvm/model/PlayerDataExtras;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/PlayerEventStatisticsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "()Lcom/sofascore/model/network/response/PlayerEventStatistics;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/util/List;", "component6", "()Lcom/sofascore/model/mvvm/model/PlayerDataExtras;", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/network/response/PlayerEventStatistics;Ljava/lang/String;Ljava/util/List;Lcom/sofascore/model/mvvm/model/PlayerDataExtras;)Lcom/sofascore/model/network/response/PlayerEventStatisticsResponse;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "getStatistics", "Ljava/lang/String;", "getPosition", "Ljava/util/List;", "getPeriods", "Lcom/sofascore/model/mvvm/model/PlayerDataExtras;", "getExtra", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerEventStatisticsResponse extends NetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final PlayerDataExtras extra;

    @Nullable
    private final List<StatisticsForPeriod> periods;

    @NotNull
    private final Player player;

    @Nullable
    private final String position;

    @NotNull
    private final PlayerEventStatistics statistics;

    @NotNull
    private final Team team;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, ypa.a(ysaVar, new boe(5)), null, null, ypa.a(ysaVar, new boe(6)), null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayerEventStatisticsResponse(int i, com.sofascore.model.newNetwork.HeadResponse headResponse, ErrorResponse errorResponse, Player player, Team team, PlayerEventStatistics playerEventStatistics, String str, List list, PlayerDataExtras playerDataExtras, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (252 != (i & 252)) {
            oea.z(i, 252, PlayerEventStatisticsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.team = team;
        this.statistics = playerEventStatistics;
        this.position = str;
        this.periods = list;
        this.extra = playerDataExtras;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(StatisticsForPeriod$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ PlayerEventStatisticsResponse copy$default(PlayerEventStatisticsResponse playerEventStatisticsResponse, Player player, Team team, PlayerEventStatistics playerEventStatistics, String str, List list, PlayerDataExtras playerDataExtras, int i, Object obj) {
        if ((i & 1) != 0) {
            player = playerEventStatisticsResponse.player;
        }
        if ((i & 2) != 0) {
            team = playerEventStatisticsResponse.team;
        }
        if ((i & 4) != 0) {
            playerEventStatistics = playerEventStatisticsResponse.statistics;
        }
        if ((i & 8) != 0) {
            str = playerEventStatisticsResponse.position;
        }
        if ((i & 16) != 0) {
            list = playerEventStatisticsResponse.periods;
        }
        if ((i & 32) != 0) {
            playerDataExtras = playerEventStatisticsResponse.extra;
        }
        List list2 = list;
        PlayerDataExtras playerDataExtras2 = playerDataExtras;
        return playerEventStatisticsResponse.copy(player, team, playerEventStatistics, str, list2, playerDataExtras2);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerEventStatisticsResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 2, Player$$serializer.INSTANCE, self.player);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.team);
        output.f(serialDesc, 4, PlayerEventStatisticsSerializer.INSTANCE, self.statistics);
        output.h(serialDesc, 5, uhi.a, self.position);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.periods);
        output.h(serialDesc, 7, PlayerDataExtras$$serializer.INSTANCE, self.extra);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PlayerEventStatistics getStatistics() {
        return this.statistics;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    public final List<StatisticsForPeriod> component5() {
        return this.periods;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final PlayerDataExtras getExtra() {
        return this.extra;
    }

    @NotNull
    public final PlayerEventStatisticsResponse copy(@NotNull Player player, @NotNull Team team, @NotNull PlayerEventStatistics statistics, @Nullable String position, @Nullable List<StatisticsForPeriod> periods, @Nullable PlayerDataExtras extra) {
        player.getClass();
        team.getClass();
        statistics.getClass();
        return new PlayerEventStatisticsResponse(player, team, statistics, position, periods, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerEventStatisticsResponse)) {
            return false;
        }
        PlayerEventStatisticsResponse playerEventStatisticsResponse = (PlayerEventStatisticsResponse) other;
        return Intrinsics.c(this.player, playerEventStatisticsResponse.player) && Intrinsics.c(this.team, playerEventStatisticsResponse.team) && Intrinsics.c(this.statistics, playerEventStatisticsResponse.statistics) && Intrinsics.c(this.position, playerEventStatisticsResponse.position) && Intrinsics.c(this.periods, playerEventStatisticsResponse.periods) && Intrinsics.c(this.extra, playerEventStatisticsResponse.extra);
    }

    @Nullable
    public final PlayerDataExtras getExtra() {
        return this.extra;
    }

    @Nullable
    public final List<StatisticsForPeriod> getPeriods() {
        return this.periods;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final String getPosition() {
        return this.position;
    }

    @NotNull
    public final PlayerEventStatistics getStatistics() {
        return this.statistics;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        int hashCode = (this.statistics.hashCode() + fc6.b(this.player.hashCode() * 31, 31, this.team)) * 31;
        String str = this.position;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<StatisticsForPeriod> list = this.periods;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        PlayerDataExtras playerDataExtras = this.extra;
        return hashCode3 + (playerDataExtras != null ? playerDataExtras.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlayerEventStatisticsResponse(player=" + this.player + ", team=" + this.team + ", statistics=" + this.statistics + ", position=" + this.position + ", periods=" + this.periods + ", extra=" + this.extra + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/PlayerEventStatisticsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/PlayerEventStatisticsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerEventStatisticsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlayerEventStatisticsResponse(@NotNull Player player, @NotNull Team team, @NotNull PlayerEventStatistics playerEventStatistics, @Nullable String str, @Nullable List<StatisticsForPeriod> list, @Nullable PlayerDataExtras playerDataExtras) {
        super((com.sofascore.model.newNetwork.HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        player.getClass();
        team.getClass();
        playerEventStatistics.getClass();
        this.player = player;
        this.team = team;
        this.statistics = playerEventStatistics;
        this.position = str;
        this.periods = list;
        this.extra = playerDataExtras;
    }
}
