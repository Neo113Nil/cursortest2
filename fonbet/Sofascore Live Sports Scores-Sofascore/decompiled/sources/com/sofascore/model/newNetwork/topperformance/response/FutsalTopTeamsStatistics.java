package com.sofascore.model.newNetwork.topperformance.response;

import com.sofascore.model.newNetwork.topperformance.topTeams.items.FutsalTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FutsalTopTeamsStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TopTeamsStatisticsItem;
import defpackage.fc6;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B\u008b\u0001\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB\u009f\u0001\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u001e\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u001e\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u001e\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u001e\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ \u0001\u0010\"\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001cR%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u001cR%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b1\u0010\u001cR%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b2\u0010\u001cR%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b3\u0010\u001cR%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b4\u0010\u001c¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/FutsalTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/TopTeamsStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/FutsalTopTeamsStatisticsItem;", "goalsScored", "goalsConceded", "cleanSheets", "yellowCards", "redCards", "penaltyGoals", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/FutsalTopTeamsStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/FutsalTopTeamsStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getGoalsScored", "getGoalsConceded", "getCleanSheets", "getYellowCards", "getRedCards", "getPenaltyGoals", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FutsalTopTeamsStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> cleanSheets;

    @Nullable
    private final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> goalsConceded;

    @Nullable
    private final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> goalsScored;

    @Nullable
    private final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> penaltyGoals;

    @Nullable
    private final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> redCards;

    @Nullable
    private final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> yellowCards;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new zl8(14)), ypa.a(ysaVar, new zl8(15)), ypa.a(ysaVar, new zl8(16)), ypa.a(ysaVar, new zl8(17)), ypa.a(ysaVar, new zl8(18)), ypa.a(ysaVar, new zl8(19))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FutsalTopTeamsStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, t5h t5hVar) {
        super(i, t5hVar);
        if (63 != (i & 63)) {
            oea.z(i, 63, FutsalTopTeamsStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.goalsScored = list;
        this.goalsConceded = list2;
        this.cleanSheets = list3;
        this.yellowCards = list4;
        this.redCards = list5;
        this.penaltyGoals = list6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FutsalTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FutsalTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FutsalTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FutsalTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FutsalTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(FutsalTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ FutsalTopTeamsStatistics copy$default(FutsalTopTeamsStatistics futsalTopTeamsStatistics, List list, List list2, List list3, List list4, List list5, List list6, int i, Object obj) {
        if ((i & 1) != 0) {
            list = futsalTopTeamsStatistics.goalsScored;
        }
        if ((i & 2) != 0) {
            list2 = futsalTopTeamsStatistics.goalsConceded;
        }
        if ((i & 4) != 0) {
            list3 = futsalTopTeamsStatistics.cleanSheets;
        }
        if ((i & 8) != 0) {
            list4 = futsalTopTeamsStatistics.yellowCards;
        }
        if ((i & 16) != 0) {
            list5 = futsalTopTeamsStatistics.redCards;
        }
        if ((i & 32) != 0) {
            list6 = futsalTopTeamsStatistics.penaltyGoals;
        }
        List list7 = list5;
        List list8 = list6;
        return futsalTopTeamsStatistics.copy(list, list2, list3, list4, list7, list8);
    }

    public static final /* synthetic */ void write$Self$model_release(FutsalTopTeamsStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.goalsScored);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.goalsConceded);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.cleanSheets);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.yellowCards);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.redCards);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.penaltyGoals);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> component1() {
        return this.goalsScored;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> component2() {
        return this.goalsConceded;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> component3() {
        return this.cleanSheets;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> component4() {
        return this.yellowCards;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> component5() {
        return this.redCards;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> component6() {
        return this.penaltyGoals;
    }

    @NotNull
    public final FutsalTopTeamsStatistics copy(@Nullable List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> goalsScored, @Nullable List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> goalsConceded, @Nullable List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> cleanSheets, @Nullable List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> yellowCards, @Nullable List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> redCards, @Nullable List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> penaltyGoals) {
        return new FutsalTopTeamsStatistics(goalsScored, goalsConceded, cleanSheets, yellowCards, redCards, penaltyGoals);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FutsalTopTeamsStatistics)) {
            return false;
        }
        FutsalTopTeamsStatistics futsalTopTeamsStatistics = (FutsalTopTeamsStatistics) other;
        return Intrinsics.c(this.goalsScored, futsalTopTeamsStatistics.goalsScored) && Intrinsics.c(this.goalsConceded, futsalTopTeamsStatistics.goalsConceded) && Intrinsics.c(this.cleanSheets, futsalTopTeamsStatistics.cleanSheets) && Intrinsics.c(this.yellowCards, futsalTopTeamsStatistics.yellowCards) && Intrinsics.c(this.redCards, futsalTopTeamsStatistics.redCards) && Intrinsics.c(this.penaltyGoals, futsalTopTeamsStatistics.penaltyGoals);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> getCleanSheets() {
        return this.cleanSheets;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> getGoalsConceded() {
        return this.goalsConceded;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> getGoalsScored() {
        return this.goalsScored;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> getRedCards() {
        return this.redCards;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list = this.goalsScored;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list2 = this.goalsConceded;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list3 = this.cleanSheets;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list4 = this.yellowCards;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list5 = this.redCards;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list6 = this.penaltyGoals;
        return hashCode5 + (list6 != null ? list6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list = this.goalsScored;
        List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list2 = this.goalsConceded;
        List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list3 = this.cleanSheets;
        List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list4 = this.yellowCards;
        List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list5 = this.redCards;
        List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list6 = this.penaltyGoals;
        StringBuilder s = fc6.s("FutsalTopTeamsStatistics(goalsScored=", ", goalsConceded=", ", cleanSheets=", list, list2);
        vxd.w(s, list3, ", yellowCards=", list4, ", redCards=");
        return me4.j(s, list5, ", penaltyGoals=", list6, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/FutsalTopTeamsStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/FutsalTopTeamsStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FutsalTopTeamsStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FutsalTopTeamsStatistics(@Nullable List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list, @Nullable List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list2, @Nullable List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list3, @Nullable List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list4, @Nullable List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list5, @Nullable List<TopTeamsStatisticsItem<FutsalTopTeamsStatisticsItem>> list6) {
        super(null);
        this.goalsScored = list;
        this.goalsConceded = list2;
        this.cleanSheets = list3;
        this.yellowCards = list4;
        this.redCards = list5;
        this.penaltyGoals = list6;
    }
}
