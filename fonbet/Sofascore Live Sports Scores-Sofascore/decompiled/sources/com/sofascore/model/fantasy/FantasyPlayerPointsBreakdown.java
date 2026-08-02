package com.sofascore.model.fantasy;

import com.ironsource.U3;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import defpackage.a7a;
import defpackage.joa;
import defpackage.m97;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPlayerPointsBreakdown;", "", "", "Lcom/sofascore/model/fantasy/FantasyPlayerStatistic;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", U3.i.l, "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyPlayerPointsBreakdown;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/sofascore/model/fantasy/FantasyPlayerPointsBreakdown;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getStatistics", "Ljava/lang/Integer;", "getTotal", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyPlayerPointsBreakdown {

    @NotNull
    private final List<FantasyPlayerStatistic> statistics;

    @Nullable
    private final Integer total;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new m97(20)), null};

    public /* synthetic */ FantasyPlayerPointsBreakdown(int i, List list, Integer num, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, FantasyPlayerPointsBreakdown$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.statistics = list;
        this.total = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FantasyPlayerStatistic$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasyPlayerPointsBreakdown copy$default(FantasyPlayerPointsBreakdown fantasyPlayerPointsBreakdown, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fantasyPlayerPointsBreakdown.statistics;
        }
        if ((i & 2) != 0) {
            num = fantasyPlayerPointsBreakdown.total;
        }
        return fantasyPlayerPointsBreakdown.copy(list, num);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyPlayerPointsBreakdown self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.statistics);
        output.h(serialDesc, 1, a7a.a, self.total);
    }

    @NotNull
    public final List<FantasyPlayerStatistic> component1() {
        return this.statistics;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getTotal() {
        return this.total;
    }

    @NotNull
    public final FantasyPlayerPointsBreakdown copy(@NotNull List<FantasyPlayerStatistic> statistics, @Nullable Integer total) {
        statistics.getClass();
        return new FantasyPlayerPointsBreakdown(statistics, total);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyPlayerPointsBreakdown)) {
            return false;
        }
        FantasyPlayerPointsBreakdown fantasyPlayerPointsBreakdown = (FantasyPlayerPointsBreakdown) other;
        return Intrinsics.c(this.statistics, fantasyPlayerPointsBreakdown.statistics) && Intrinsics.c(this.total, fantasyPlayerPointsBreakdown.total);
    }

    @NotNull
    public final List<FantasyPlayerStatistic> getStatistics() {
        return this.statistics;
    }

    @Nullable
    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        int hashCode = this.statistics.hashCode() * 31;
        Integer num = this.total;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "FantasyPlayerPointsBreakdown(statistics=" + this.statistics + ", total=" + this.total + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyPlayerPointsBreakdown$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyPlayerPointsBreakdown;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyPlayerPointsBreakdown$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyPlayerPointsBreakdown(@NotNull List<FantasyPlayerStatistic> list, @Nullable Integer num) {
        list.getClass();
        this.statistics = list;
        this.total = num;
    }
}
