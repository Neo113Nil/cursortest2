package com.sofascore.model.newNetwork.statistics.season.team;

import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializer;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.newNetwork.HeadResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import com.sofascore.model.newNetwork.topperformance.StatisticsType;
import defpackage.fga;
import defpackage.r5h;
import defpackage.vxd;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = TeamSeasonStatisticsSerializer.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 &*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001&B5\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0018\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JL\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004R\u001e\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0010\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatisticsResponse;", "T", "Lcom/sofascore/model/newNetwork/NetworkResponse;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "teamCount", "", "matches", "awardedMatches", "statisticsType", "Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;", "<init>", "(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;)V", "getStatistics$annotations", "()V", "getStatistics", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTeamCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMatches", "getAwardedMatches", "getStatisticsType", "()Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;)Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatisticsResponse;", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamSeasonStatisticsResponse<T> extends NetworkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer awardedMatches;

    @Nullable
    private final Integer matches;
    private final T statistics;

    @NotNull
    private final StatisticsType statisticsType;

    @Nullable
    private final Integer teamCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TeamSeasonStatisticsResponse(T t, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @NotNull StatisticsType statisticsType) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        statisticsType.getClass();
        this.statistics = t;
        this.teamCount = num;
        this.matches = num2;
        this.awardedMatches = num3;
        this.statisticsType = statisticsType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TeamSeasonStatisticsResponse copy$default(TeamSeasonStatisticsResponse teamSeasonStatisticsResponse, Object obj, Integer num, Integer num2, Integer num3, StatisticsType statisticsType, int i, Object obj2) {
        T t = obj;
        if ((i & 1) != 0) {
            t = teamSeasonStatisticsResponse.statistics;
        }
        if ((i & 2) != 0) {
            num = teamSeasonStatisticsResponse.teamCount;
        }
        if ((i & 4) != 0) {
            num2 = teamSeasonStatisticsResponse.matches;
        }
        if ((i & 8) != 0) {
            num3 = teamSeasonStatisticsResponse.awardedMatches;
        }
        if ((i & 16) != 0) {
            statisticsType = teamSeasonStatisticsResponse.statisticsType;
        }
        StatisticsType statisticsType2 = statisticsType;
        Integer num4 = num2;
        return teamSeasonStatisticsResponse.copy(t, num, num4, num3, statisticsType2);
    }

    public final T component1() {
        return this.statistics;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getTeamCount() {
        return this.teamCount;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getAwardedMatches() {
        return this.awardedMatches;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final StatisticsType getStatisticsType() {
        return this.statisticsType;
    }

    @NotNull
    public final TeamSeasonStatisticsResponse<T> copy(T statistics, @Nullable Integer teamCount, @Nullable Integer matches, @Nullable Integer awardedMatches, @NotNull StatisticsType statisticsType) {
        statisticsType.getClass();
        return new TeamSeasonStatisticsResponse<>(statistics, teamCount, matches, awardedMatches, statisticsType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamSeasonStatisticsResponse)) {
            return false;
        }
        TeamSeasonStatisticsResponse teamSeasonStatisticsResponse = (TeamSeasonStatisticsResponse) other;
        return Intrinsics.c(this.statistics, teamSeasonStatisticsResponse.statistics) && Intrinsics.c(this.teamCount, teamSeasonStatisticsResponse.teamCount) && Intrinsics.c(this.matches, teamSeasonStatisticsResponse.matches) && Intrinsics.c(this.awardedMatches, teamSeasonStatisticsResponse.awardedMatches) && Intrinsics.c(this.statisticsType, teamSeasonStatisticsResponse.statisticsType);
    }

    @Nullable
    public final Integer getAwardedMatches() {
        return this.awardedMatches;
    }

    @Nullable
    public final Integer getMatches() {
        return this.matches;
    }

    public final T getStatistics() {
        return this.statistics;
    }

    @NotNull
    public final StatisticsType getStatisticsType() {
        return this.statisticsType;
    }

    @Nullable
    public final Integer getTeamCount() {
        return this.teamCount;
    }

    public int hashCode() {
        T t = this.statistics;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        Integer num = this.teamCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.matches;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.awardedMatches;
        return this.statisticsType.hashCode() + ((hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        T t = this.statistics;
        Integer num = this.teamCount;
        Integer num2 = this.matches;
        Integer num3 = this.awardedMatches;
        StatisticsType statisticsType = this.statisticsType;
        StringBuilder sb = new StringBuilder("TeamSeasonStatisticsResponse(statistics=");
        sb.append(t);
        sb.append(", teamCount=");
        sb.append(num);
        sb.append(", matches=");
        vxd.r(num2, num3, ", awardedMatches=", ", statisticsType=", sb);
        sb.append(statisticsType);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatisticsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatisticsResponse;", "T", "typeSerial0", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> KSerializer serializer(@NotNull KSerializer typeSerial0) {
            typeSerial0.getClass();
            return new TeamSeasonStatisticsSerializer();
        }

        private Companion() {
        }
    }

    @fga(names = {TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, TeamSeasonStatisticsSerializerKt.PROPERTY_RANKS})
    public static /* synthetic */ void getStatistics$annotations() {
    }
}
