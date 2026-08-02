package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import defpackage.wt3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0014\u001a\u00020\bHÆ\u0003J4\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamPlayerSeasonStatistics;", "T", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Player;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "playedEnough", "", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;Z)V", "getPlayer", "()Lcom/sofascore/model/mvvm/model/Player;", "getStatistics", "()Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "getPlayedEnough", "()Z", "component1", "component2", "component3", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;Z)Lcom/sofascore/model/newNetwork/TeamPlayerSeasonStatistics;", "equals", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamPlayerSeasonStatistics<T extends AbstractPlayerSeasonStatistics> {
    private final boolean playedEnough;

    @NotNull
    private final Player player;

    @Nullable
    private final T statistics;

    public TeamPlayerSeasonStatistics(@NotNull Player player, @Nullable T t, boolean z) {
        player.getClass();
        this.player = player;
        this.statistics = t;
        this.playedEnough = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamPlayerSeasonStatistics copy$default(TeamPlayerSeasonStatistics teamPlayerSeasonStatistics, Player player, AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            player = teamPlayerSeasonStatistics.player;
        }
        if ((i & 2) != 0) {
            abstractPlayerSeasonStatistics = teamPlayerSeasonStatistics.statistics;
        }
        if ((i & 4) != 0) {
            z = teamPlayerSeasonStatistics.playedEnough;
        }
        return teamPlayerSeasonStatistics.copy(player, abstractPlayerSeasonStatistics, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final T component2() {
        return this.statistics;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPlayedEnough() {
        return this.playedEnough;
    }

    @NotNull
    public final TeamPlayerSeasonStatistics<T> copy(@NotNull Player player, @Nullable T statistics, boolean playedEnough) {
        player.getClass();
        return new TeamPlayerSeasonStatistics<>(player, statistics, playedEnough);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamPlayerSeasonStatistics)) {
            return false;
        }
        TeamPlayerSeasonStatistics teamPlayerSeasonStatistics = (TeamPlayerSeasonStatistics) other;
        return Intrinsics.c(this.player, teamPlayerSeasonStatistics.player) && Intrinsics.c(this.statistics, teamPlayerSeasonStatistics.statistics) && this.playedEnough == teamPlayerSeasonStatistics.playedEnough;
    }

    public final boolean getPlayedEnough() {
        return this.playedEnough;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final T getStatistics() {
        return this.statistics;
    }

    public int hashCode() {
        int hashCode = this.player.hashCode() * 31;
        T t = this.statistics;
        return Boolean.hashCode(this.playedEnough) + ((hashCode + (t == null ? 0 : t.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        T t = this.statistics;
        boolean z = this.playedEnough;
        StringBuilder sb = new StringBuilder("TeamPlayerSeasonStatistics(player=");
        sb.append(player);
        sb.append(", statistics=");
        sb.append(t);
        sb.append(", playedEnough=");
        return wt3.p(sb, z, ")");
    }
}
