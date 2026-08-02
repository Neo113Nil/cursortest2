package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.network.response.BasketballPlayerEventStatistics;
import com.sofascore.model.network.response.PlayerEventStatistics;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.PlayerEventStatisticsSerializer;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import defpackage.a7a;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001eR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0013\u00109\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/sofascore/model/newNetwork/FeaturedPlayer;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/network/response/PlayerEventStatistics;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", "eventId", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/network/response/PlayerEventStatistics;Ljava/lang/Integer;)V", "seen0", "Lcom/sofascore/model/newNetwork/AttributeOverviewData;", "attributeOverview", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/network/response/PlayerEventStatistics;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/AttributeOverviewData;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/FeaturedPlayer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Lcom/sofascore/model/network/response/PlayerEventStatistics;", "component3", "()Ljava/lang/Integer;", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/network/response/PlayerEventStatistics;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/FeaturedPlayer;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "getStatistics", "Ljava/lang/Integer;", "getEventId", "Lcom/sofascore/model/newNetwork/AttributeOverviewData;", "getAttributeOverview", "()Lcom/sofascore/model/newNetwork/AttributeOverviewData;", "setAttributeOverview", "(Lcom/sofascore/model/newNetwork/AttributeOverviewData;)V", "Lcom/sofascore/model/network/response/BasketballPlayerEventStatistics;", "getBasketballStatistics", "()Lcom/sofascore/model/network/response/BasketballPlayerEventStatistics;", "basketballStatistics", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FeaturedPlayer implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private AttributeOverviewData attributeOverview;

    @Nullable
    private final Integer eventId;

    @NotNull
    private final Player player;

    @NotNull
    private final PlayerEventStatistics statistics;

    public /* synthetic */ FeaturedPlayer(int i, Player player, PlayerEventStatistics playerEventStatistics, Integer num, AttributeOverviewData attributeOverviewData, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, FeaturedPlayer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.statistics = playerEventStatistics;
        this.eventId = num;
        if ((i & 8) == 0) {
            this.attributeOverview = null;
        } else {
            this.attributeOverview = attributeOverviewData;
        }
    }

    public static /* synthetic */ FeaturedPlayer copy$default(FeaturedPlayer featuredPlayer, Player player, PlayerEventStatistics playerEventStatistics, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            player = featuredPlayer.player;
        }
        if ((i & 2) != 0) {
            playerEventStatistics = featuredPlayer.statistics;
        }
        if ((i & 4) != 0) {
            num = featuredPlayer.eventId;
        }
        return featuredPlayer.copy(player, playerEventStatistics, num);
    }

    public static final /* synthetic */ void write$Self$model_release(FeaturedPlayer self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.f(serialDesc, 1, PlayerEventStatisticsSerializer.INSTANCE, self.statistics);
        output.h(serialDesc, 2, a7a.a, self.eventId);
        if (!output.o(serialDesc) && self.attributeOverview == null) {
            return;
        }
        output.h(serialDesc, 3, AttributeOverviewData$$serializer.INSTANCE, self.attributeOverview);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PlayerEventStatistics getStatistics() {
        return this.statistics;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getEventId() {
        return this.eventId;
    }

    @NotNull
    public final FeaturedPlayer copy(@NotNull Player player, @NotNull PlayerEventStatistics statistics, @Nullable Integer eventId) {
        player.getClass();
        statistics.getClass();
        return new FeaturedPlayer(player, statistics, eventId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturedPlayer)) {
            return false;
        }
        FeaturedPlayer featuredPlayer = (FeaturedPlayer) other;
        return Intrinsics.c(this.player, featuredPlayer.player) && Intrinsics.c(this.statistics, featuredPlayer.statistics) && Intrinsics.c(this.eventId, featuredPlayer.eventId);
    }

    @Nullable
    public final AttributeOverviewData getAttributeOverview() {
        return this.attributeOverview;
    }

    @Nullable
    public final BasketballPlayerEventStatistics getBasketballStatistics() {
        PlayerEventStatistics playerEventStatistics = this.statistics;
        if (playerEventStatistics instanceof BasketballPlayerEventStatistics) {
            return (BasketballPlayerEventStatistics) playerEventStatistics;
        }
        return null;
    }

    @Nullable
    public final Integer getEventId() {
        return this.eventId;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    public final PlayerEventStatistics getStatistics() {
        return this.statistics;
    }

    public int hashCode() {
        int hashCode = (this.statistics.hashCode() + (this.player.hashCode() * 31)) * 31;
        Integer num = this.eventId;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setAttributeOverview(@Nullable AttributeOverviewData attributeOverviewData) {
        this.attributeOverview = attributeOverviewData;
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        PlayerEventStatistics playerEventStatistics = this.statistics;
        Integer num = this.eventId;
        StringBuilder sb = new StringBuilder("FeaturedPlayer(player=");
        sb.append(player);
        sb.append(", statistics=");
        sb.append(playerEventStatistics);
        sb.append(", eventId=");
        return vxd.n(sb, num, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/FeaturedPlayer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/FeaturedPlayer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FeaturedPlayer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FeaturedPlayer(@NotNull Player player, @NotNull PlayerEventStatistics playerEventStatistics, @Nullable Integer num) {
        player.getClass();
        playerEventStatistics.getClass();
        this.player = player;
        this.statistics = playerEventStatistics;
        this.eventId = num;
    }
}
