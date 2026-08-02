package com.sofascore.model.network.response;

import com.sofascore.model.network.response.serializers.PlayerEventStatisticsSerializer;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, d2 = {"Lcom/sofascore/model/network/response/StatisticsForPeriod;", "", "", "period", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "<init>", "(Ljava/lang/String;Lcom/sofascore/model/network/response/PlayerEventStatistics;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/sofascore/model/network/response/PlayerEventStatistics;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/StatisticsForPeriod;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/sofascore/model/network/response/PlayerEventStatistics;", "copy", "(Ljava/lang/String;Lcom/sofascore/model/network/response/PlayerEventStatistics;)Lcom/sofascore/model/network/response/StatisticsForPeriod;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPeriod", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "getStatistics", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatisticsForPeriod {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String period;

    @Nullable
    private final PlayerEventStatistics statistics;

    public /* synthetic */ StatisticsForPeriod(int i, String str, PlayerEventStatistics playerEventStatistics, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, StatisticsForPeriod$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.period = str;
        this.statistics = playerEventStatistics;
    }

    public static /* synthetic */ StatisticsForPeriod copy$default(StatisticsForPeriod statisticsForPeriod, String str, PlayerEventStatistics playerEventStatistics, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statisticsForPeriod.period;
        }
        if ((i & 2) != 0) {
            playerEventStatistics = statisticsForPeriod.statistics;
        }
        return statisticsForPeriod.copy(str, playerEventStatistics);
    }

    public static final /* synthetic */ void write$Self$model_release(StatisticsForPeriod self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.period);
        output.h(serialDesc, 1, PlayerEventStatisticsSerializer.INSTANCE, self.statistics);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final PlayerEventStatistics getStatistics() {
        return this.statistics;
    }

    @NotNull
    public final StatisticsForPeriod copy(@NotNull String period, @Nullable PlayerEventStatistics statistics) {
        period.getClass();
        return new StatisticsForPeriod(period, statistics);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticsForPeriod)) {
            return false;
        }
        StatisticsForPeriod statisticsForPeriod = (StatisticsForPeriod) other;
        return Intrinsics.c(this.period, statisticsForPeriod.period) && Intrinsics.c(this.statistics, statisticsForPeriod.statistics);
    }

    @NotNull
    public final String getPeriod() {
        return this.period;
    }

    @Nullable
    public final PlayerEventStatistics getStatistics() {
        return this.statistics;
    }

    public int hashCode() {
        int hashCode = this.period.hashCode() * 31;
        PlayerEventStatistics playerEventStatistics = this.statistics;
        return hashCode + (playerEventStatistics == null ? 0 : playerEventStatistics.hashCode());
    }

    @NotNull
    public String toString() {
        return "StatisticsForPeriod(period=" + this.period + ", statistics=" + this.statistics + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/StatisticsForPeriod$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/StatisticsForPeriod;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StatisticsForPeriod$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StatisticsForPeriod(@NotNull String str, @Nullable PlayerEventStatistics playerEventStatistics) {
        str.getClass();
        this.period = str;
        this.statistics = playerEventStatistics;
    }
}
