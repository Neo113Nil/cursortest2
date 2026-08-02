package com.sofascore.model.newNetwork.topperformance;

import com.sofascore.model.network.response.serializers.TopPerformanceResponseSerializer;
import com.sofascore.model.network.response.serializers.TopPerformanceResponseSerializerKt;
import com.sofascore.model.newNetwork.ErrorResponse;
import com.sofascore.model.newNetwork.HeadResponse;
import com.sofascore.model.newNetwork.NetworkResponse;
import defpackage.dmi;
import defpackage.fga;
import defpackage.r5h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = TopPerformanceResponseSerializer.class)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\"B-\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0015\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\bHÆ\u0003J>\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u001e\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/TopPerformanceResponse;", "T", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "topPerformanceItems", "playerOfTheTournament", "", "ineligibleTopPlayers", "statisticsType", "Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;", "<init>", "(Ljava/lang/Object;ZLjava/lang/Object;Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;)V", "getTopPerformanceItems$annotations", "()V", "getTopPerformanceItems", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getPlayerOfTheTournament", "()Z", "getIneligibleTopPlayers", "getStatisticsType", "()Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;ZLjava/lang/Object;Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;)Lcom/sofascore/model/newNetwork/topperformance/TopPerformanceResponse;", "equals", "other", "", "hashCode", "", "toString", "", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TopPerformanceResponse<T> extends NetworkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final T ineligibleTopPlayers;
    private final boolean playerOfTheTournament;

    @NotNull
    private final StatisticsType statisticsType;
    private final T topPerformanceItems;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopPerformanceResponse(T t, boolean z, @Nullable T t2, @NotNull StatisticsType statisticsType) {
        super((HeadResponse) null, (ErrorResponse) null, 3, (DefaultConstructorMarker) null);
        statisticsType.getClass();
        this.topPerformanceItems = t;
        this.playerOfTheTournament = z;
        this.ineligibleTopPlayers = t2;
        this.statisticsType = statisticsType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopPerformanceResponse copy$default(TopPerformanceResponse topPerformanceResponse, Object obj, boolean z, Object obj2, StatisticsType statisticsType, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = topPerformanceResponse.topPerformanceItems;
        }
        if ((i & 2) != 0) {
            z = topPerformanceResponse.playerOfTheTournament;
        }
        if ((i & 4) != 0) {
            obj2 = topPerformanceResponse.ineligibleTopPlayers;
        }
        if ((i & 8) != 0) {
            statisticsType = topPerformanceResponse.statisticsType;
        }
        return topPerformanceResponse.copy(obj, z, obj2, statisticsType);
    }

    public final T component1() {
        return this.topPerformanceItems;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPlayerOfTheTournament() {
        return this.playerOfTheTournament;
    }

    @Nullable
    public final T component3() {
        return this.ineligibleTopPlayers;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final StatisticsType getStatisticsType() {
        return this.statisticsType;
    }

    @NotNull
    public final TopPerformanceResponse<T> copy(T topPerformanceItems, boolean playerOfTheTournament, @Nullable T ineligibleTopPlayers, @NotNull StatisticsType statisticsType) {
        statisticsType.getClass();
        return new TopPerformanceResponse<>(topPerformanceItems, playerOfTheTournament, ineligibleTopPlayers, statisticsType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopPerformanceResponse)) {
            return false;
        }
        TopPerformanceResponse topPerformanceResponse = (TopPerformanceResponse) other;
        return Intrinsics.c(this.topPerformanceItems, topPerformanceResponse.topPerformanceItems) && this.playerOfTheTournament == topPerformanceResponse.playerOfTheTournament && Intrinsics.c(this.ineligibleTopPlayers, topPerformanceResponse.ineligibleTopPlayers) && Intrinsics.c(this.statisticsType, topPerformanceResponse.statisticsType);
    }

    @Nullable
    public final T getIneligibleTopPlayers() {
        return this.ineligibleTopPlayers;
    }

    public final boolean getPlayerOfTheTournament() {
        return this.playerOfTheTournament;
    }

    @NotNull
    public final StatisticsType getStatisticsType() {
        return this.statisticsType;
    }

    public final T getTopPerformanceItems() {
        return this.topPerformanceItems;
    }

    public int hashCode() {
        T t = this.topPerformanceItems;
        int e = dmi.e((t == null ? 0 : t.hashCode()) * 31, 31, this.playerOfTheTournament);
        T t2 = this.ineligibleTopPlayers;
        return this.statisticsType.hashCode() + ((e + (t2 != null ? t2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "TopPerformanceResponse(topPerformanceItems=" + this.topPerformanceItems + ", playerOfTheTournament=" + this.playerOfTheTournament + ", ineligibleTopPlayers=" + this.ineligibleTopPlayers + ", statisticsType=" + this.statisticsType + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/TopPerformanceResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/TopPerformanceResponse;", "T", "typeSerial0", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> KSerializer serializer(@NotNull KSerializer typeSerial0) {
            typeSerial0.getClass();
            return new TopPerformanceResponseSerializer();
        }

        private Companion() {
        }
    }

    @fga(names = {TopPerformanceResponseSerializerKt.PROPERTY_TOP_TEAMS, TopPerformanceResponseSerializerKt.PROPERTY_TOP_PLAYERS, TopPerformanceResponseSerializerKt.PROPERTY_TOP_STATS})
    public static /* synthetic */ void getTopPerformanceItems$annotations() {
    }

    public /* synthetic */ TopPerformanceResponse(Object obj, boolean z, Object obj2, StatisticsType statisticsType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : obj2, statisticsType);
    }
}
