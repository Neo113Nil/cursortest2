package com.sofascore.model.newNetwork.topperformance;

import defpackage.bf3;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;", "", "", "sportSlug", "statisticsType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSportSlug", "getStatisticsType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StatisticsType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String sportSlug;

    @NotNull
    private final String statisticsType;

    public /* synthetic */ StatisticsType(int i, String str, String str2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, StatisticsType$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.sportSlug = str;
        this.statisticsType = str2;
    }

    public static /* synthetic */ StatisticsType copy$default(StatisticsType statisticsType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statisticsType.sportSlug;
        }
        if ((i & 2) != 0) {
            str2 = statisticsType.statisticsType;
        }
        return statisticsType.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(StatisticsType self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.sportSlug);
        output.y(serialDesc, 1, self.statisticsType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSportSlug() {
        return this.sportSlug;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getStatisticsType() {
        return this.statisticsType;
    }

    @NotNull
    public final StatisticsType copy(@NotNull String sportSlug, @NotNull String statisticsType) {
        sportSlug.getClass();
        statisticsType.getClass();
        return new StatisticsType(sportSlug, statisticsType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticsType)) {
            return false;
        }
        StatisticsType statisticsType = (StatisticsType) other;
        return Intrinsics.c(this.sportSlug, statisticsType.sportSlug) && Intrinsics.c(this.statisticsType, statisticsType.statisticsType);
    }

    @NotNull
    public final String getSportSlug() {
        return this.sportSlug;
    }

    @NotNull
    public final String getStatisticsType() {
        return this.statisticsType;
    }

    public int hashCode() {
        return this.statisticsType.hashCode() + (this.sportSlug.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return bf3.k("StatisticsType(sportSlug=", this.sportSlug, ", statisticsType=", this.statisticsType, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/StatisticsType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/StatisticsType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StatisticsType$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StatisticsType(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.sportSlug = str;
        this.statisticsType = str2;
    }
}
