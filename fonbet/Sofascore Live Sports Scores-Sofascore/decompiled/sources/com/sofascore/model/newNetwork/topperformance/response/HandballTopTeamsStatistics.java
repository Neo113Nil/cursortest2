package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.HandballTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.HandballTopTeamsStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TopTeamsStatisticsItem;
import defpackage.fc6;
import defpackage.j69;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BÍ\u0001\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBá\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u001e\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u001e\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u001e\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u001e\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u001e\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u001e\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u001e\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016Jè\u0001\u0010\u001f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b6\u0010\u0016R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b7\u0010\u0016R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b8\u0010\u0016R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b9\u0010\u0016R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b:\u0010\u0016R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b;\u0010\u0016R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b<\u0010\u0016R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b=\u0010\u0016¨\u0006@"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/TopTeamsStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/HandballTopTeamsStatisticsItem;", "goalsScored", "goalsConceded", "shootingPercentage", "fastbreakGoals", "sevenMetersScored", "steals", "twoMinutePenalties", "goalsInPowerplay", "shorthandedGoals", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopTeamsStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopTeamsStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getGoalsScored", "getGoalsConceded", "getShootingPercentage", "getFastbreakGoals", "getSevenMetersScored", "getSteals", "getTwoMinutePenalties", "getGoalsInPowerplay", "getShorthandedGoals", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HandballTopTeamsStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> fastbreakGoals;

    @Nullable
    private final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> goalsConceded;

    @Nullable
    private final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> goalsInPowerplay;

    @Nullable
    private final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> goalsScored;

    @Nullable
    private final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> sevenMetersScored;

    @Nullable
    private final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> shootingPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> shorthandedGoals;

    @Nullable
    private final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> steals;

    @Nullable
    private final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> twoMinutePenalties;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new j69(7)), ypa.a(ysaVar, new j69(8)), ypa.a(ysaVar, new j69(9)), ypa.a(ysaVar, new j69(10)), ypa.a(ysaVar, new j69(11)), ypa.a(ysaVar, new j69(12)), ypa.a(ysaVar, new j69(13)), ypa.a(ysaVar, new j69(14)), ypa.a(ysaVar, new j69(15))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandballTopTeamsStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, t5h t5hVar) {
        super(i, t5hVar);
        if (511 != (i & 511)) {
            oea.z(i, 511, HandballTopTeamsStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.goalsScored = list;
        this.goalsConceded = list2;
        this.shootingPercentage = list3;
        this.fastbreakGoals = list4;
        this.sevenMetersScored = list5;
        this.steals = list6;
        this.twoMinutePenalties = list7;
        this.goalsInPowerplay = list8;
        this.shorthandedGoals = list9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(HandballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(HandballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(HandballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(HandballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(HandballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(HandballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(HandballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(HandballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(HandballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ HandballTopTeamsStatistics copy$default(HandballTopTeamsStatistics handballTopTeamsStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, int i, Object obj) {
        if ((i & 1) != 0) {
            list = handballTopTeamsStatistics.goalsScored;
        }
        if ((i & 2) != 0) {
            list2 = handballTopTeamsStatistics.goalsConceded;
        }
        if ((i & 4) != 0) {
            list3 = handballTopTeamsStatistics.shootingPercentage;
        }
        if ((i & 8) != 0) {
            list4 = handballTopTeamsStatistics.fastbreakGoals;
        }
        if ((i & 16) != 0) {
            list5 = handballTopTeamsStatistics.sevenMetersScored;
        }
        if ((i & 32) != 0) {
            list6 = handballTopTeamsStatistics.steals;
        }
        if ((i & 64) != 0) {
            list7 = handballTopTeamsStatistics.twoMinutePenalties;
        }
        if ((i & 128) != 0) {
            list8 = handballTopTeamsStatistics.goalsInPowerplay;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            list9 = handballTopTeamsStatistics.shorthandedGoals;
        }
        List list10 = list8;
        List list11 = list9;
        List list12 = list6;
        List list13 = list7;
        List list14 = list5;
        List list15 = list3;
        return handballTopTeamsStatistics.copy(list, list2, list15, list4, list14, list12, list13, list10, list11);
    }

    public static final /* synthetic */ void write$Self$model_release(HandballTopTeamsStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.goalsScored);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.goalsConceded);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.shootingPercentage);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.fastbreakGoals);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.sevenMetersScored);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.steals);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.twoMinutePenalties);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.goalsInPowerplay);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.shorthandedGoals);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> component1() {
        return this.goalsScored;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> component2() {
        return this.goalsConceded;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> component3() {
        return this.shootingPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> component4() {
        return this.fastbreakGoals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> component5() {
        return this.sevenMetersScored;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> component6() {
        return this.steals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> component7() {
        return this.twoMinutePenalties;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> component8() {
        return this.goalsInPowerplay;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> component9() {
        return this.shorthandedGoals;
    }

    @NotNull
    public final HandballTopTeamsStatistics copy(@Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> goalsScored, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> goalsConceded, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> shootingPercentage, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> fastbreakGoals, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> sevenMetersScored, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> steals, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> twoMinutePenalties, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> goalsInPowerplay, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> shorthandedGoals) {
        return new HandballTopTeamsStatistics(goalsScored, goalsConceded, shootingPercentage, fastbreakGoals, sevenMetersScored, steals, twoMinutePenalties, goalsInPowerplay, shorthandedGoals);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandballTopTeamsStatistics)) {
            return false;
        }
        HandballTopTeamsStatistics handballTopTeamsStatistics = (HandballTopTeamsStatistics) other;
        return Intrinsics.c(this.goalsScored, handballTopTeamsStatistics.goalsScored) && Intrinsics.c(this.goalsConceded, handballTopTeamsStatistics.goalsConceded) && Intrinsics.c(this.shootingPercentage, handballTopTeamsStatistics.shootingPercentage) && Intrinsics.c(this.fastbreakGoals, handballTopTeamsStatistics.fastbreakGoals) && Intrinsics.c(this.sevenMetersScored, handballTopTeamsStatistics.sevenMetersScored) && Intrinsics.c(this.steals, handballTopTeamsStatistics.steals) && Intrinsics.c(this.twoMinutePenalties, handballTopTeamsStatistics.twoMinutePenalties) && Intrinsics.c(this.goalsInPowerplay, handballTopTeamsStatistics.goalsInPowerplay) && Intrinsics.c(this.shorthandedGoals, handballTopTeamsStatistics.shorthandedGoals);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> getFastbreakGoals() {
        return this.fastbreakGoals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> getGoalsConceded() {
        return this.goalsConceded;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> getGoalsInPowerplay() {
        return this.goalsInPowerplay;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> getGoalsScored() {
        return this.goalsScored;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> getSevenMetersScored() {
        return this.sevenMetersScored;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> getShootingPercentage() {
        return this.shootingPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> getShorthandedGoals() {
        return this.shorthandedGoals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> getSteals() {
        return this.steals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> getTwoMinutePenalties() {
        return this.twoMinutePenalties;
    }

    public int hashCode() {
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list = this.goalsScored;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list2 = this.goalsConceded;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list3 = this.shootingPercentage;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list4 = this.fastbreakGoals;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list5 = this.sevenMetersScored;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list6 = this.steals;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list7 = this.twoMinutePenalties;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list8 = this.goalsInPowerplay;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list9 = this.shorthandedGoals;
        return hashCode8 + (list9 != null ? list9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list = this.goalsScored;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list2 = this.goalsConceded;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list3 = this.shootingPercentage;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list4 = this.fastbreakGoals;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list5 = this.sevenMetersScored;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list6 = this.steals;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list7 = this.twoMinutePenalties;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list8 = this.goalsInPowerplay;
        List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list9 = this.shorthandedGoals;
        StringBuilder s = fc6.s("HandballTopTeamsStatistics(goalsScored=", ", goalsConceded=", ", shootingPercentage=", list, list2);
        vxd.w(s, list3, ", fastbreakGoals=", list4, ", sevenMetersScored=");
        vxd.w(s, list5, ", steals=", list6, ", twoMinutePenalties=");
        vxd.w(s, list7, ", goalsInPowerplay=", list8, ", shorthandedGoals=");
        return mz1.p(s, list9, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopTeamsStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/HandballTopTeamsStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HandballTopTeamsStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HandballTopTeamsStatistics(@Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list2, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list3, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list4, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list5, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list6, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list7, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list8, @Nullable List<TopTeamsStatisticsItem<HandballTopTeamsStatisticsItem>> list9) {
        super(null);
        this.goalsScored = list;
        this.goalsConceded = list2;
        this.shootingPercentage = list3;
        this.fastbreakGoals = list4;
        this.sevenMetersScored = list5;
        this.steals = list6;
        this.twoMinutePenalties = list7;
        this.goalsInPowerplay = list8;
        this.shorthandedGoals = list9;
    }
}
