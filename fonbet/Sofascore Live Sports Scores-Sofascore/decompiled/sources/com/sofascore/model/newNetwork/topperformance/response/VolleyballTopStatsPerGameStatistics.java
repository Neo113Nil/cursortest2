package com.sofascore.model.newNetwork.topperformance.response;

import defpackage.fc6;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.pxk;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.BG\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB[\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019JX\u0010\u001d\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0019R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b-\u0010\u0019¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopStatsPerGameStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/response/TopStatsItem;", "pointsTotal", "aces", "blockPoints", "attackPoints", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopStatsPerGameStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopStatsPerGameStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPointsTotal", "getAces", "getBlockPoints", "getAttackPoints", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VolleyballTopStatsPerGameStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopStatsItem> aces;

    @Nullable
    private final List<TopStatsItem> attackPoints;

    @Nullable
    private final List<TopStatsItem> blockPoints;

    @Nullable
    private final List<TopStatsItem> pointsTotal;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new pxk(6)), ypa.a(ysaVar, new pxk(7)), ypa.a(ysaVar, new pxk(8)), ypa.a(ysaVar, new pxk(9))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VolleyballTopStatsPerGameStatistics(int i, List list, List list2, List list3, List list4, t5h t5hVar) {
        super(i, t5hVar);
        if (15 != (i & 15)) {
            oea.z(i, 15, VolleyballTopStatsPerGameStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.pointsTotal = list;
        this.aces = list2;
        this.blockPoints = list3;
        this.attackPoints = list4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VolleyballTopStatsPerGameStatistics copy$default(VolleyballTopStatsPerGameStatistics volleyballTopStatsPerGameStatistics, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = volleyballTopStatsPerGameStatistics.pointsTotal;
        }
        if ((i & 2) != 0) {
            list2 = volleyballTopStatsPerGameStatistics.aces;
        }
        if ((i & 4) != 0) {
            list3 = volleyballTopStatsPerGameStatistics.blockPoints;
        }
        if ((i & 8) != 0) {
            list4 = volleyballTopStatsPerGameStatistics.attackPoints;
        }
        return volleyballTopStatsPerGameStatistics.copy(list, list2, list3, list4);
    }

    public static final /* synthetic */ void write$Self$model_release(VolleyballTopStatsPerGameStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.pointsTotal);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.aces);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.blockPoints);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.attackPoints);
    }

    @Nullable
    public final List<TopStatsItem> component1() {
        return this.pointsTotal;
    }

    @Nullable
    public final List<TopStatsItem> component2() {
        return this.aces;
    }

    @Nullable
    public final List<TopStatsItem> component3() {
        return this.blockPoints;
    }

    @Nullable
    public final List<TopStatsItem> component4() {
        return this.attackPoints;
    }

    @NotNull
    public final VolleyballTopStatsPerGameStatistics copy(@Nullable List<TopStatsItem> pointsTotal, @Nullable List<TopStatsItem> aces, @Nullable List<TopStatsItem> blockPoints, @Nullable List<TopStatsItem> attackPoints) {
        return new VolleyballTopStatsPerGameStatistics(pointsTotal, aces, blockPoints, attackPoints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VolleyballTopStatsPerGameStatistics)) {
            return false;
        }
        VolleyballTopStatsPerGameStatistics volleyballTopStatsPerGameStatistics = (VolleyballTopStatsPerGameStatistics) other;
        return Intrinsics.c(this.pointsTotal, volleyballTopStatsPerGameStatistics.pointsTotal) && Intrinsics.c(this.aces, volleyballTopStatsPerGameStatistics.aces) && Intrinsics.c(this.blockPoints, volleyballTopStatsPerGameStatistics.blockPoints) && Intrinsics.c(this.attackPoints, volleyballTopStatsPerGameStatistics.attackPoints);
    }

    @Nullable
    public final List<TopStatsItem> getAces() {
        return this.aces;
    }

    @Nullable
    public final List<TopStatsItem> getAttackPoints() {
        return this.attackPoints;
    }

    @Nullable
    public final List<TopStatsItem> getBlockPoints() {
        return this.blockPoints;
    }

    @Nullable
    public final List<TopStatsItem> getPointsTotal() {
        return this.pointsTotal;
    }

    public int hashCode() {
        List<TopStatsItem> list = this.pointsTotal;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopStatsItem> list2 = this.aces;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopStatsItem> list3 = this.blockPoints;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopStatsItem> list4 = this.attackPoints;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopStatsItem> list = this.pointsTotal;
        List<TopStatsItem> list2 = this.aces;
        return me4.j(fc6.s("VolleyballTopStatsPerGameStatistics(pointsTotal=", ", aces=", ", blockPoints=", list, list2), this.blockPoints, ", attackPoints=", this.attackPoints, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopStatsPerGameStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopStatsPerGameStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VolleyballTopStatsPerGameStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VolleyballTopStatsPerGameStatistics(@Nullable List<TopStatsItem> list, @Nullable List<TopStatsItem> list2, @Nullable List<TopStatsItem> list3, @Nullable List<TopStatsItem> list4) {
        super(null);
        this.pointsTotal = list;
        this.aces = list2;
        this.blockPoints = list3;
        this.attackPoints = list4;
    }
}
