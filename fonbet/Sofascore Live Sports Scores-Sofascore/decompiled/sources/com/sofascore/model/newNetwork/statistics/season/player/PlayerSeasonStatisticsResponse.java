package com.sofascore.model.newNetwork.statistics.season.player;

import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.serializers.PlayerSeasonStatisticsSerializer;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import defpackage.boe;
import defpackage.joa;
import defpackage.oea;
import defpackage.q79;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 6*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u000276B>\u0012\u0015\u0010\u0007\u001a\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBE\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014JG\u0010\u001f\u001a\u00020\u001c\"\n\b\u0001\u0010\u0002*\u0004\u0018\u00010\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b$\u0010%JS\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0017\b\u0002\u0010\u0007\u001a\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b.\u0010/R&\u0010\u0007\u001a\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010!R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010%¨\u00068"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsResponse;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "T", "", "Lr5h;", "with", "Lcom/sofascore/model/network/response/serializers/PlayerSeasonStatisticsSerializer;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", "", "Lcom/sofascore/model/newNetwork/statistics/season/player/HighlightedPlayerStatistic;", "highlighted", "Lcom/sofascore/model/mvvm/model/Team;", "team", "<init>", "(Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;Ljava/util/Map;Lcom/sofascore/model/mvvm/model/Team;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;Ljava/util/Map;Lcom/sofascore/model/mvvm/model/Team;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "component1", "()Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "component2", "()Ljava/util/Map;", "component3", "()Lcom/sofascore/model/mvvm/model/Team;", "copy", "(Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;Ljava/util/Map;Lcom/sofascore/model/mvvm/model/Team;)Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "getStatistics", "Ljava/util/Map;", "getHighlighted", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerSeasonStatisticsResponse<T extends AbstractPlayerSeasonStatistics> {

    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Map<String, HighlightedPlayerStatistic> highlighted;

    @NotNull
    private final T statistics;

    @Nullable
    private final Team team;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new boe(27)), ypa.a(ysaVar, new boe(28))};
        uye uyeVar = new uye("com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsResponse", null, 3);
        uyeVar.j(TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, false);
        uyeVar.j("highlighted", false);
        uyeVar.j("team", false);
        $cachedDescriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ PlayerSeasonStatisticsResponse(int i, AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, Map map, Team team, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, $cachedDescriptor);
            throw null;
        }
        this.statistics = abstractPlayerSeasonStatistics;
        this.highlighted = map;
        this.team = team;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new q79(uhi.a, HighlightedPlayerStatistic$$serializer.INSTANCE, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Team.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayerSeasonStatisticsResponse copy$default(PlayerSeasonStatisticsResponse playerSeasonStatisticsResponse, AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, Map map, Team team, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractPlayerSeasonStatistics = playerSeasonStatisticsResponse.statistics;
        }
        if ((i & 2) != 0) {
            map = playerSeasonStatisticsResponse.highlighted;
        }
        if ((i & 4) != 0) {
            team = playerSeasonStatisticsResponse.team;
        }
        return playerSeasonStatisticsResponse.copy(abstractPlayerSeasonStatistics, map, team);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerSeasonStatisticsResponse self, wf3 output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, PlayerSeasonStatisticsSerializer.INSTANCE, self.statistics);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.highlighted);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.team);
    }

    @NotNull
    public final T component1() {
        return this.statistics;
    }

    @Nullable
    public final Map<String, HighlightedPlayerStatistic> component2() {
        return this.highlighted;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @NotNull
    public final PlayerSeasonStatisticsResponse<T> copy(@NotNull T statistics, @Nullable Map<String, HighlightedPlayerStatistic> highlighted, @Nullable Team team) {
        statistics.getClass();
        return new PlayerSeasonStatisticsResponse<>(statistics, highlighted, team);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerSeasonStatisticsResponse)) {
            return false;
        }
        PlayerSeasonStatisticsResponse playerSeasonStatisticsResponse = (PlayerSeasonStatisticsResponse) other;
        return Intrinsics.c(this.statistics, playerSeasonStatisticsResponse.statistics) && Intrinsics.c(this.highlighted, playerSeasonStatisticsResponse.highlighted) && Intrinsics.c(this.team, playerSeasonStatisticsResponse.team);
    }

    @Nullable
    public final Map<String, HighlightedPlayerStatistic> getHighlighted() {
        return this.highlighted;
    }

    @NotNull
    public final T getStatistics() {
        return this.statistics;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        int hashCode = this.statistics.hashCode() * 31;
        Map<String, HighlightedPlayerStatistic> map = this.highlighted;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Team team = this.team;
        return hashCode2 + (team != null ? team.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlayerSeasonStatisticsResponse(statistics=" + this.statistics + ", highlighted=" + this.highlighted + ", team=" + this.team + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsResponse;", "T", "typeSerial0", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> KSerializer serializer(@NotNull KSerializer typeSerial0) {
            typeSerial0.getClass();
            return new PlayerSeasonStatisticsResponse$$serializer(typeSerial0);
        }

        private Companion() {
        }
    }

    public PlayerSeasonStatisticsResponse(@NotNull T t, @Nullable Map<String, HighlightedPlayerStatistic> map, @Nullable Team team) {
        t.getClass();
        this.statistics = t;
        this.highlighted = map;
        this.team = team;
    }
}
