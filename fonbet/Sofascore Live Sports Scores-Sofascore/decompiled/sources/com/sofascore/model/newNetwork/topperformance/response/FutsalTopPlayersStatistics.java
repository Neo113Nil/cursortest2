package com.sofascore.model.newNetwork.topperformance.response;

import com.sofascore.model.newNetwork.topperformance.topPlayers.items.FutsalTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.FutsalTopPlayersStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import defpackage.fc6;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zl8;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B_\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBs\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u001e\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u001e\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJp\u0010\u001e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001aR%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001aR%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u001aR%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b.\u0010\u001a¨\u00061"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/FutsalTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/FutsalTopPlayersStatisticsItem;", "goals", "assists", "yellowCards", "redCards", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/FutsalTopPlayersStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/FutsalTopPlayersStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getGoals", "getAssists", "getYellowCards", "getRedCards", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FutsalTopPlayersStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> assists;

    @Nullable
    private final List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> goals;

    @Nullable
    private final List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> redCards;

    @Nullable
    private final List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> yellowCards;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new zl8(10)), ypa.a(ysaVar, new zl8(11)), ypa.a(ysaVar, new zl8(12)), ypa.a(ysaVar, new zl8(13))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FutsalTopPlayersStatistics(int i, List list, List list2, List list3, List list4, t5h t5hVar) {
        super(i, t5hVar);
        if (15 != (i & 15)) {
            oea.z(i, 15, FutsalTopPlayersStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.goals = list;
        this.assists = list2;
        this.yellowCards = list3;
        this.redCards = list4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FutsalTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FutsalTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FutsalTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(FutsalTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FutsalTopPlayersStatistics copy$default(FutsalTopPlayersStatistics futsalTopPlayersStatistics, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = futsalTopPlayersStatistics.goals;
        }
        if ((i & 2) != 0) {
            list2 = futsalTopPlayersStatistics.assists;
        }
        if ((i & 4) != 0) {
            list3 = futsalTopPlayersStatistics.yellowCards;
        }
        if ((i & 8) != 0) {
            list4 = futsalTopPlayersStatistics.redCards;
        }
        return futsalTopPlayersStatistics.copy(list, list2, list3, list4);
    }

    public static final /* synthetic */ void write$Self$model_release(FutsalTopPlayersStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.goals);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.assists);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.yellowCards);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.redCards);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> component1() {
        return this.goals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> component2() {
        return this.assists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> component3() {
        return this.yellowCards;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> component4() {
        return this.redCards;
    }

    @NotNull
    public final FutsalTopPlayersStatistics copy(@Nullable List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> goals, @Nullable List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> assists, @Nullable List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> yellowCards, @Nullable List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> redCards) {
        return new FutsalTopPlayersStatistics(goals, assists, yellowCards, redCards);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FutsalTopPlayersStatistics)) {
            return false;
        }
        FutsalTopPlayersStatistics futsalTopPlayersStatistics = (FutsalTopPlayersStatistics) other;
        return Intrinsics.c(this.goals, futsalTopPlayersStatistics.goals) && Intrinsics.c(this.assists, futsalTopPlayersStatistics.assists) && Intrinsics.c(this.yellowCards, futsalTopPlayersStatistics.yellowCards) && Intrinsics.c(this.redCards, futsalTopPlayersStatistics.redCards);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> getAssists() {
        return this.assists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> getGoals() {
        return this.goals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> getRedCards() {
        return this.redCards;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> list = this.goals;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> list2 = this.assists;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> list3 = this.yellowCards;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> list4 = this.redCards;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> list = this.goals;
        List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> list2 = this.assists;
        return me4.j(fc6.s("FutsalTopPlayersStatistics(goals=", ", assists=", ", yellowCards=", list, list2), this.yellowCards, ", redCards=", this.redCards, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/FutsalTopPlayersStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/FutsalTopPlayersStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FutsalTopPlayersStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FutsalTopPlayersStatistics(@Nullable List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> list, @Nullable List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> list2, @Nullable List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> list3, @Nullable List<TopPlayersStatisticsItem<FutsalTopPlayersStatisticsItem>> list4) {
        super(null);
        this.goals = list;
        this.assists = list2;
        this.yellowCards = list3;
        this.redCards = list4;
    }
}
