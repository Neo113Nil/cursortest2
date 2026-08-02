package com.sofascore.model.newNetwork.topperformance.response;

import com.sofascore.model.newNetwork.topperformance.topPlayers.items.HandballTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.HandballTopPlayersStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import defpackage.fc6;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.xt8;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B·\u0001\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBË\u0001\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u001e\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u001e\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u001e\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u001e\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u001e\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u001e\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u001e\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015JÐ\u0001\u0010\u001d\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J'\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0015R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\u0015R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b5\u0010\u0015R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b6\u0010\u0015R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b7\u0010\u0015R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b8\u0010\u0015R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b9\u0010\u0015R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b:\u0010\u0015¨\u0006="}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/HandballTopPlayersStatisticsItem;", "goals", "assists", "goals7m", "steals", "twoMinutePenalties", "saves", "goalkeeperEfficiencyPercentage", "gk7mSaves", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopPlayersStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopPlayersStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getGoals", "getAssists", "getGoals7m", "getSteals", "getTwoMinutePenalties", "getSaves", "getGoalkeeperEfficiencyPercentage", "getGk7mSaves", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HandballTopPlayersStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> assists;

    @Nullable
    private final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> gk7mSaves;

    @Nullable
    private final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> goalkeeperEfficiencyPercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> goals;

    @Nullable
    private final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> goals7m;

    @Nullable
    private final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> saves;

    @Nullable
    private final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> steals;

    @Nullable
    private final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> twoMinutePenalties;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new xt8(21)), ypa.a(ysaVar, new xt8(22)), ypa.a(ysaVar, new xt8(23)), ypa.a(ysaVar, new xt8(24)), ypa.a(ysaVar, new xt8(25)), ypa.a(ysaVar, new xt8(26)), ypa.a(ysaVar, new xt8(27)), ypa.a(ysaVar, new xt8(28))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandballTopPlayersStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, t5h t5hVar) {
        super(i, t5hVar);
        if (255 != (i & 255)) {
            oea.z(i, 255, HandballTopPlayersStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.goals = list;
        this.assists = list2;
        this.goals7m = list3;
        this.steals = list4;
        this.twoMinutePenalties = list5;
        this.saves = list6;
        this.goalkeeperEfficiencyPercentage = list7;
        this.gk7mSaves = list8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(HandballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(HandballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(HandballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(HandballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(HandballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(HandballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(HandballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(HandballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ HandballTopPlayersStatistics copy$default(HandballTopPlayersStatistics handballTopPlayersStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i, Object obj) {
        if ((i & 1) != 0) {
            list = handballTopPlayersStatistics.goals;
        }
        if ((i & 2) != 0) {
            list2 = handballTopPlayersStatistics.assists;
        }
        if ((i & 4) != 0) {
            list3 = handballTopPlayersStatistics.goals7m;
        }
        if ((i & 8) != 0) {
            list4 = handballTopPlayersStatistics.steals;
        }
        if ((i & 16) != 0) {
            list5 = handballTopPlayersStatistics.twoMinutePenalties;
        }
        if ((i & 32) != 0) {
            list6 = handballTopPlayersStatistics.saves;
        }
        if ((i & 64) != 0) {
            list7 = handballTopPlayersStatistics.goalkeeperEfficiencyPercentage;
        }
        if ((i & 128) != 0) {
            list8 = handballTopPlayersStatistics.gk7mSaves;
        }
        List list9 = list7;
        List list10 = list8;
        List list11 = list5;
        List list12 = list6;
        return handballTopPlayersStatistics.copy(list, list2, list3, list4, list11, list12, list9, list10);
    }

    public static final /* synthetic */ void write$Self$model_release(HandballTopPlayersStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.goals);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.assists);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.goals7m);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.steals);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.twoMinutePenalties);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.saves);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.goalkeeperEfficiencyPercentage);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.gk7mSaves);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> component1() {
        return this.goals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> component2() {
        return this.assists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> component3() {
        return this.goals7m;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> component4() {
        return this.steals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> component5() {
        return this.twoMinutePenalties;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> component6() {
        return this.saves;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> component7() {
        return this.goalkeeperEfficiencyPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> component8() {
        return this.gk7mSaves;
    }

    @NotNull
    public final HandballTopPlayersStatistics copy(@Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> goals, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> assists, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> goals7m, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> steals, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> twoMinutePenalties, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> saves, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> goalkeeperEfficiencyPercentage, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> gk7mSaves) {
        return new HandballTopPlayersStatistics(goals, assists, goals7m, steals, twoMinutePenalties, saves, goalkeeperEfficiencyPercentage, gk7mSaves);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandballTopPlayersStatistics)) {
            return false;
        }
        HandballTopPlayersStatistics handballTopPlayersStatistics = (HandballTopPlayersStatistics) other;
        return Intrinsics.c(this.goals, handballTopPlayersStatistics.goals) && Intrinsics.c(this.assists, handballTopPlayersStatistics.assists) && Intrinsics.c(this.goals7m, handballTopPlayersStatistics.goals7m) && Intrinsics.c(this.steals, handballTopPlayersStatistics.steals) && Intrinsics.c(this.twoMinutePenalties, handballTopPlayersStatistics.twoMinutePenalties) && Intrinsics.c(this.saves, handballTopPlayersStatistics.saves) && Intrinsics.c(this.goalkeeperEfficiencyPercentage, handballTopPlayersStatistics.goalkeeperEfficiencyPercentage) && Intrinsics.c(this.gk7mSaves, handballTopPlayersStatistics.gk7mSaves);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> getAssists() {
        return this.assists;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> getGk7mSaves() {
        return this.gk7mSaves;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> getGoalkeeperEfficiencyPercentage() {
        return this.goalkeeperEfficiencyPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> getGoals() {
        return this.goals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> getGoals7m() {
        return this.goals7m;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> getSaves() {
        return this.saves;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> getSteals() {
        return this.steals;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> getTwoMinutePenalties() {
        return this.twoMinutePenalties;
    }

    public int hashCode() {
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list = this.goals;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list2 = this.assists;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list3 = this.goals7m;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list4 = this.steals;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list5 = this.twoMinutePenalties;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list6 = this.saves;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list7 = this.goalkeeperEfficiencyPercentage;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list8 = this.gk7mSaves;
        return hashCode7 + (list8 != null ? list8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list = this.goals;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list2 = this.assists;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list3 = this.goals7m;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list4 = this.steals;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list5 = this.twoMinutePenalties;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list6 = this.saves;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list7 = this.goalkeeperEfficiencyPercentage;
        List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list8 = this.gk7mSaves;
        StringBuilder s = fc6.s("HandballTopPlayersStatistics(goals=", ", assists=", ", goals7m=", list, list2);
        vxd.w(s, list3, ", steals=", list4, ", twoMinutePenalties=");
        vxd.w(s, list5, ", saves=", list6, ", goalkeeperEfficiencyPercentage=");
        return me4.j(s, list7, ", gk7mSaves=", list8, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopPlayersStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopPlayersStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HandballTopPlayersStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HandballTopPlayersStatistics(@Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list2, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list3, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list4, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list5, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list6, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list7, @Nullable List<TopPlayersStatisticsItem<HandballTopPlayersStatisticsItem>> list8) {
        super(null);
        this.goals = list;
        this.assists = list2;
        this.goals7m = list3;
        this.steals = list4;
        this.twoMinutePenalties = list5;
        this.saves = list6;
        this.goalkeeperEfficiencyPercentage = list7;
        this.gk7mSaves = list8;
    }
}
