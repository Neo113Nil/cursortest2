package com.sofascore.model.mvvm.model;

import com.ironsource.U3;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatisticsResponse;
import defpackage.dmi;
import defpackage.vxd;
import defpackage.w1l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J]\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\u0014\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u0006+"}, d2 = {"Lcom/sofascore/model/mvvm/model/PlayerHeadFlags;", "", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Player;", "playerStatisticsSeasons", "Lcom/sofascore/model/newNetwork/StatisticsSeasonsResponse;", "careerStatistics", "Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerCareerStatisticsResponse;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", "career", "matches", "fantasy", U3.i.I0, "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/newNetwork/StatisticsSeasonsResponse;Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerCareerStatisticsResponse;ZZZZZ)V", "getPlayer", "()Lcom/sofascore/model/mvvm/model/Player;", "getPlayerStatisticsSeasons", "()Lcom/sofascore/model/newNetwork/StatisticsSeasonsResponse;", "getCareerStatistics", "()Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerCareerStatisticsResponse;", "getStatistics", "()Z", "getCareer", "getMatches", "getFantasy", "getMedia", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerHeadFlags {
    private final boolean career;

    @Nullable
    private final PlayerCareerStatisticsResponse careerStatistics;
    private final boolean fantasy;
    private final boolean matches;
    private final boolean media;

    @NotNull
    private final Player player;

    @Nullable
    private final StatisticsSeasonsResponse playerStatisticsSeasons;
    private final boolean statistics;

    public PlayerHeadFlags(@NotNull Player player, @Nullable StatisticsSeasonsResponse statisticsSeasonsResponse, @Nullable PlayerCareerStatisticsResponse playerCareerStatisticsResponse, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        player.getClass();
        this.player = player;
        this.playerStatisticsSeasons = statisticsSeasonsResponse;
        this.careerStatistics = playerCareerStatisticsResponse;
        this.statistics = z;
        this.career = z2;
        this.matches = z3;
        this.fantasy = z4;
        this.media = z5;
    }

    public static /* synthetic */ PlayerHeadFlags copy$default(PlayerHeadFlags playerHeadFlags, Player player, StatisticsSeasonsResponse statisticsSeasonsResponse, PlayerCareerStatisticsResponse playerCareerStatisticsResponse, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            player = playerHeadFlags.player;
        }
        if ((i & 2) != 0) {
            statisticsSeasonsResponse = playerHeadFlags.playerStatisticsSeasons;
        }
        if ((i & 4) != 0) {
            playerCareerStatisticsResponse = playerHeadFlags.careerStatistics;
        }
        if ((i & 8) != 0) {
            z = playerHeadFlags.statistics;
        }
        if ((i & 16) != 0) {
            z2 = playerHeadFlags.career;
        }
        if ((i & 32) != 0) {
            z3 = playerHeadFlags.matches;
        }
        if ((i & 64) != 0) {
            z4 = playerHeadFlags.fantasy;
        }
        if ((i & 128) != 0) {
            z5 = playerHeadFlags.media;
        }
        boolean z6 = z4;
        boolean z7 = z5;
        boolean z8 = z2;
        boolean z9 = z3;
        return playerHeadFlags.copy(player, statisticsSeasonsResponse, playerCareerStatisticsResponse, z, z8, z9, z6, z7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final StatisticsSeasonsResponse getPlayerStatisticsSeasons() {
        return this.playerStatisticsSeasons;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final PlayerCareerStatisticsResponse getCareerStatistics() {
        return this.careerStatistics;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getStatistics() {
        return this.statistics;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCareer() {
        return this.career;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getMatches() {
        return this.matches;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getFantasy() {
        return this.fantasy;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getMedia() {
        return this.media;
    }

    @NotNull
    public final PlayerHeadFlags copy(@NotNull Player player, @Nullable StatisticsSeasonsResponse playerStatisticsSeasons, @Nullable PlayerCareerStatisticsResponse careerStatistics, boolean statistics, boolean career, boolean matches, boolean fantasy, boolean media) {
        player.getClass();
        return new PlayerHeadFlags(player, playerStatisticsSeasons, careerStatistics, statistics, career, matches, fantasy, media);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerHeadFlags)) {
            return false;
        }
        PlayerHeadFlags playerHeadFlags = (PlayerHeadFlags) other;
        return Intrinsics.c(this.player, playerHeadFlags.player) && Intrinsics.c(this.playerStatisticsSeasons, playerHeadFlags.playerStatisticsSeasons) && Intrinsics.c(this.careerStatistics, playerHeadFlags.careerStatistics) && this.statistics == playerHeadFlags.statistics && this.career == playerHeadFlags.career && this.matches == playerHeadFlags.matches && this.fantasy == playerHeadFlags.fantasy && this.media == playerHeadFlags.media;
    }

    public final boolean getCareer() {
        return this.career;
    }

    @Nullable
    public final PlayerCareerStatisticsResponse getCareerStatistics() {
        return this.careerStatistics;
    }

    public final boolean getFantasy() {
        return this.fantasy;
    }

    public final boolean getMatches() {
        return this.matches;
    }

    public final boolean getMedia() {
        return this.media;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final StatisticsSeasonsResponse getPlayerStatisticsSeasons() {
        return this.playerStatisticsSeasons;
    }

    public final boolean getStatistics() {
        return this.statistics;
    }

    public int hashCode() {
        int hashCode = this.player.hashCode() * 31;
        StatisticsSeasonsResponse statisticsSeasonsResponse = this.playerStatisticsSeasons;
        int hashCode2 = (hashCode + (statisticsSeasonsResponse == null ? 0 : statisticsSeasonsResponse.hashCode())) * 31;
        PlayerCareerStatisticsResponse playerCareerStatisticsResponse = this.careerStatistics;
        return Boolean.hashCode(this.media) + dmi.e(dmi.e(dmi.e(dmi.e((hashCode2 + (playerCareerStatisticsResponse != null ? playerCareerStatisticsResponse.hashCode() : 0)) * 31, 31, this.statistics), 31, this.career), 31, this.matches), 31, this.fantasy);
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        StatisticsSeasonsResponse statisticsSeasonsResponse = this.playerStatisticsSeasons;
        PlayerCareerStatisticsResponse playerCareerStatisticsResponse = this.careerStatistics;
        boolean z = this.statistics;
        boolean z2 = this.career;
        boolean z3 = this.matches;
        boolean z4 = this.fantasy;
        boolean z5 = this.media;
        StringBuilder sb = new StringBuilder("PlayerHeadFlags(player=");
        sb.append(player);
        sb.append(", playerStatisticsSeasons=");
        sb.append(statisticsSeasonsResponse);
        sb.append(", careerStatistics=");
        sb.append(playerCareerStatisticsResponse);
        sb.append(", statistics=");
        sb.append(z);
        sb.append(", career=");
        vxd.t(", matches=", ", fantasy=", sb, z2, z3);
        return w1l.i(", media=", ")", sb, z4, z5);
    }
}
