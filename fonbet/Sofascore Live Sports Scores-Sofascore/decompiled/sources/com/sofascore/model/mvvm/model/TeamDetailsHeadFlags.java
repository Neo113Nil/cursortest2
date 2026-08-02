package com.sofascore.model.mvvm.model;

import com.ironsource.U3;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.network.response.serializers.TopPerformanceResponseSerializerKt;
import defpackage.dmi;
import defpackage.vxd;
import defpackage.w1l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006'"}, d2 = {"Lcom/sofascore/model/mvvm/model/TeamDetailsHeadFlags;", "", "team", "Lcom/sofascore/model/mvvm/model/Team;", "standings", "", "squad", TopPerformanceResponseSerializerKt.PROPERTY_TOP_PLAYERS, TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "playerStatistics", "transfers", U3.i.I0, "<init>", "(Lcom/sofascore/model/mvvm/model/Team;ZZZZZZZ)V", "getTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "getStandings", "()Z", "getSquad", "getTopPlayers", "getStatistics", "getPlayerStatistics", "getTransfers", "getMedia", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamDetailsHeadFlags {
    private final boolean media;
    private final boolean playerStatistics;
    private final boolean squad;
    private final boolean standings;
    private final boolean statistics;

    @NotNull
    private final Team team;
    private final boolean topPlayers;
    private final boolean transfers;

    public TeamDetailsHeadFlags(@NotNull Team team, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        team.getClass();
        this.team = team;
        this.standings = z;
        this.squad = z2;
        this.topPlayers = z3;
        this.statistics = z4;
        this.playerStatistics = z5;
        this.transfers = z6;
        this.media = z7;
    }

    public static /* synthetic */ TeamDetailsHeadFlags copy$default(TeamDetailsHeadFlags teamDetailsHeadFlags, Team team, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        if ((i & 1) != 0) {
            team = teamDetailsHeadFlags.team;
        }
        if ((i & 2) != 0) {
            z = teamDetailsHeadFlags.standings;
        }
        if ((i & 4) != 0) {
            z2 = teamDetailsHeadFlags.squad;
        }
        if ((i & 8) != 0) {
            z3 = teamDetailsHeadFlags.topPlayers;
        }
        if ((i & 16) != 0) {
            z4 = teamDetailsHeadFlags.statistics;
        }
        if ((i & 32) != 0) {
            z5 = teamDetailsHeadFlags.playerStatistics;
        }
        if ((i & 64) != 0) {
            z6 = teamDetailsHeadFlags.transfers;
        }
        if ((i & 128) != 0) {
            z7 = teamDetailsHeadFlags.media;
        }
        boolean z8 = z6;
        boolean z9 = z7;
        boolean z10 = z4;
        boolean z11 = z5;
        return teamDetailsHeadFlags.copy(team, z, z2, z3, z10, z11, z8, z9);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getStandings() {
        return this.standings;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSquad() {
        return this.squad;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getTopPlayers() {
        return this.topPlayers;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getStatistics() {
        return this.statistics;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPlayerStatistics() {
        return this.playerStatistics;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getTransfers() {
        return this.transfers;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getMedia() {
        return this.media;
    }

    @NotNull
    public final TeamDetailsHeadFlags copy(@NotNull Team team, boolean standings, boolean squad, boolean topPlayers, boolean statistics, boolean playerStatistics, boolean transfers, boolean media) {
        team.getClass();
        return new TeamDetailsHeadFlags(team, standings, squad, topPlayers, statistics, playerStatistics, transfers, media);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamDetailsHeadFlags)) {
            return false;
        }
        TeamDetailsHeadFlags teamDetailsHeadFlags = (TeamDetailsHeadFlags) other;
        return Intrinsics.c(this.team, teamDetailsHeadFlags.team) && this.standings == teamDetailsHeadFlags.standings && this.squad == teamDetailsHeadFlags.squad && this.topPlayers == teamDetailsHeadFlags.topPlayers && this.statistics == teamDetailsHeadFlags.statistics && this.playerStatistics == teamDetailsHeadFlags.playerStatistics && this.transfers == teamDetailsHeadFlags.transfers && this.media == teamDetailsHeadFlags.media;
    }

    public final boolean getMedia() {
        return this.media;
    }

    public final boolean getPlayerStatistics() {
        return this.playerStatistics;
    }

    public final boolean getSquad() {
        return this.squad;
    }

    public final boolean getStandings() {
        return this.standings;
    }

    public final boolean getStatistics() {
        return this.statistics;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    public final boolean getTopPlayers() {
        return this.topPlayers;
    }

    public final boolean getTransfers() {
        return this.transfers;
    }

    public int hashCode() {
        return Boolean.hashCode(this.media) + dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(dmi.e(this.team.hashCode() * 31, 31, this.standings), 31, this.squad), 31, this.topPlayers), 31, this.statistics), 31, this.playerStatistics), 31, this.transfers);
    }

    @NotNull
    public String toString() {
        Team team = this.team;
        boolean z = this.standings;
        boolean z2 = this.squad;
        boolean z3 = this.topPlayers;
        boolean z4 = this.statistics;
        boolean z5 = this.playerStatistics;
        boolean z6 = this.transfers;
        boolean z7 = this.media;
        StringBuilder sb = new StringBuilder("TeamDetailsHeadFlags(team=");
        sb.append(team);
        sb.append(", standings=");
        sb.append(z);
        sb.append(", squad=");
        vxd.t(", topPlayers=", ", statistics=", sb, z2, z3);
        vxd.t(", playerStatistics=", ", transfers=", sb, z4, z5);
        return w1l.i(", media=", ")", sb, z6, z7);
    }
}
