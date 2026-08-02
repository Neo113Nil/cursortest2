package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TennisTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TennisTopTeamsStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TopTeamsStatisticsItem;
import defpackage.fc6;
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
import defpackage.z2j;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BÍ\u0001\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBá\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u001e\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u001e\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u001e\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u001e\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u001e\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u001e\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u001e\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016Jè\u0001\u0010\u001f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b6\u0010\u0016R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b7\u0010\u0016R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b8\u0010\u0016R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b9\u0010\u0016R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b:\u0010\u0016R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b;\u0010\u0016R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b<\u0010\u0016R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b=\u0010\u0016¨\u0006@"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/TennisTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/TopTeamsStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/TennisTopTeamsStatisticsItem;", "firstServePercentage", "firstServePointsWonPercentage", "secondServePercentage", "secondServePointsWonPercentage", "avgAces", "avgDoubleFaults", "breakPointsSavedPercentage", "breakPointsSavedConvertedPercentage", "tiebreakWinPercentage", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/TennisTopTeamsStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/TennisTopTeamsStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getFirstServePercentage", "getFirstServePointsWonPercentage", "getSecondServePercentage", "getSecondServePointsWonPercentage", "getAvgAces", "getAvgDoubleFaults", "getBreakPointsSavedPercentage", "getBreakPointsSavedConvertedPercentage", "getTiebreakWinPercentage", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TennisTopTeamsStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> avgAces;

    @Nullable
    private final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> avgDoubleFaults;

    @Nullable
    private final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> breakPointsSavedConvertedPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> breakPointsSavedPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> firstServePercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> firstServePointsWonPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> secondServePercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> secondServePointsWonPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> tiebreakWinPercentage;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new z2j(16)), ypa.a(ysaVar, new z2j(17)), ypa.a(ysaVar, new z2j(18)), ypa.a(ysaVar, new z2j(19)), ypa.a(ysaVar, new z2j(20)), ypa.a(ysaVar, new z2j(21)), ypa.a(ysaVar, new z2j(22)), ypa.a(ysaVar, new z2j(23)), ypa.a(ysaVar, new z2j(24))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TennisTopTeamsStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, t5h t5hVar) {
        super(i, t5hVar);
        if (511 != (i & 511)) {
            oea.z(i, 511, TennisTopTeamsStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.firstServePercentage = list;
        this.firstServePointsWonPercentage = list2;
        this.secondServePercentage = list3;
        this.secondServePointsWonPercentage = list4;
        this.avgAces = list5;
        this.avgDoubleFaults = list6;
        this.breakPointsSavedPercentage = list7;
        this.breakPointsSavedConvertedPercentage = list8;
        this.tiebreakWinPercentage = list9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(TennisTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(TennisTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(TennisTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(TennisTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(TennisTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(TennisTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(TennisTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(TennisTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(TennisTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ TennisTopTeamsStatistics copy$default(TennisTopTeamsStatistics tennisTopTeamsStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tennisTopTeamsStatistics.firstServePercentage;
        }
        if ((i & 2) != 0) {
            list2 = tennisTopTeamsStatistics.firstServePointsWonPercentage;
        }
        if ((i & 4) != 0) {
            list3 = tennisTopTeamsStatistics.secondServePercentage;
        }
        if ((i & 8) != 0) {
            list4 = tennisTopTeamsStatistics.secondServePointsWonPercentage;
        }
        if ((i & 16) != 0) {
            list5 = tennisTopTeamsStatistics.avgAces;
        }
        if ((i & 32) != 0) {
            list6 = tennisTopTeamsStatistics.avgDoubleFaults;
        }
        if ((i & 64) != 0) {
            list7 = tennisTopTeamsStatistics.breakPointsSavedPercentage;
        }
        if ((i & 128) != 0) {
            list8 = tennisTopTeamsStatistics.breakPointsSavedConvertedPercentage;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            list9 = tennisTopTeamsStatistics.tiebreakWinPercentage;
        }
        List list10 = list8;
        List list11 = list9;
        List list12 = list6;
        List list13 = list7;
        List list14 = list5;
        List list15 = list3;
        return tennisTopTeamsStatistics.copy(list, list2, list15, list4, list14, list12, list13, list10, list11);
    }

    public static final /* synthetic */ void write$Self$model_release(TennisTopTeamsStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.firstServePercentage);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.firstServePointsWonPercentage);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.secondServePercentage);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.secondServePointsWonPercentage);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.avgAces);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.avgDoubleFaults);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.breakPointsSavedPercentage);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.breakPointsSavedConvertedPercentage);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.tiebreakWinPercentage);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> component1() {
        return this.firstServePercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> component2() {
        return this.firstServePointsWonPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> component3() {
        return this.secondServePercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> component4() {
        return this.secondServePointsWonPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> component5() {
        return this.avgAces;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> component6() {
        return this.avgDoubleFaults;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> component7() {
        return this.breakPointsSavedPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> component8() {
        return this.breakPointsSavedConvertedPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> component9() {
        return this.tiebreakWinPercentage;
    }

    @NotNull
    public final TennisTopTeamsStatistics copy(@Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> firstServePercentage, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> firstServePointsWonPercentage, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> secondServePercentage, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> secondServePointsWonPercentage, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> avgAces, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> avgDoubleFaults, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> breakPointsSavedPercentage, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> breakPointsSavedConvertedPercentage, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> tiebreakWinPercentage) {
        return new TennisTopTeamsStatistics(firstServePercentage, firstServePointsWonPercentage, secondServePercentage, secondServePointsWonPercentage, avgAces, avgDoubleFaults, breakPointsSavedPercentage, breakPointsSavedConvertedPercentage, tiebreakWinPercentage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TennisTopTeamsStatistics)) {
            return false;
        }
        TennisTopTeamsStatistics tennisTopTeamsStatistics = (TennisTopTeamsStatistics) other;
        return Intrinsics.c(this.firstServePercentage, tennisTopTeamsStatistics.firstServePercentage) && Intrinsics.c(this.firstServePointsWonPercentage, tennisTopTeamsStatistics.firstServePointsWonPercentage) && Intrinsics.c(this.secondServePercentage, tennisTopTeamsStatistics.secondServePercentage) && Intrinsics.c(this.secondServePointsWonPercentage, tennisTopTeamsStatistics.secondServePointsWonPercentage) && Intrinsics.c(this.avgAces, tennisTopTeamsStatistics.avgAces) && Intrinsics.c(this.avgDoubleFaults, tennisTopTeamsStatistics.avgDoubleFaults) && Intrinsics.c(this.breakPointsSavedPercentage, tennisTopTeamsStatistics.breakPointsSavedPercentage) && Intrinsics.c(this.breakPointsSavedConvertedPercentage, tennisTopTeamsStatistics.breakPointsSavedConvertedPercentage) && Intrinsics.c(this.tiebreakWinPercentage, tennisTopTeamsStatistics.tiebreakWinPercentage);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> getAvgAces() {
        return this.avgAces;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> getAvgDoubleFaults() {
        return this.avgDoubleFaults;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> getBreakPointsSavedConvertedPercentage() {
        return this.breakPointsSavedConvertedPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> getBreakPointsSavedPercentage() {
        return this.breakPointsSavedPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> getFirstServePercentage() {
        return this.firstServePercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> getFirstServePointsWonPercentage() {
        return this.firstServePointsWonPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> getSecondServePercentage() {
        return this.secondServePercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> getSecondServePointsWonPercentage() {
        return this.secondServePointsWonPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> getTiebreakWinPercentage() {
        return this.tiebreakWinPercentage;
    }

    public int hashCode() {
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list = this.firstServePercentage;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list2 = this.firstServePointsWonPercentage;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list3 = this.secondServePercentage;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list4 = this.secondServePointsWonPercentage;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list5 = this.avgAces;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list6 = this.avgDoubleFaults;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list7 = this.breakPointsSavedPercentage;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list8 = this.breakPointsSavedConvertedPercentage;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list9 = this.tiebreakWinPercentage;
        return hashCode8 + (list9 != null ? list9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list = this.firstServePercentage;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list2 = this.firstServePointsWonPercentage;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list3 = this.secondServePercentage;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list4 = this.secondServePointsWonPercentage;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list5 = this.avgAces;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list6 = this.avgDoubleFaults;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list7 = this.breakPointsSavedPercentage;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list8 = this.breakPointsSavedConvertedPercentage;
        List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list9 = this.tiebreakWinPercentage;
        StringBuilder s = fc6.s("TennisTopTeamsStatistics(firstServePercentage=", ", firstServePointsWonPercentage=", ", secondServePercentage=", list, list2);
        vxd.w(s, list3, ", secondServePointsWonPercentage=", list4, ", avgAces=");
        vxd.w(s, list5, ", avgDoubleFaults=", list6, ", breakPointsSavedPercentage=");
        vxd.w(s, list7, ", breakPointsSavedConvertedPercentage=", list8, ", tiebreakWinPercentage=");
        return mz1.p(s, list9, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/TennisTopTeamsStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/TennisTopTeamsStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TennisTopTeamsStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TennisTopTeamsStatistics(@Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list2, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list3, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list4, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list5, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list6, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list7, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list8, @Nullable List<TopTeamsStatisticsItem<TennisTopTeamsStatisticsItem>> list9) {
        super(null);
        this.firstServePercentage = list;
        this.firstServePointsWonPercentage = list2;
        this.secondServePercentage = list3;
        this.secondServePointsWonPercentage = list4;
        this.avgAces = list5;
        this.avgDoubleFaults = list6;
        this.breakPointsSavedPercentage = list7;
        this.breakPointsSavedConvertedPercentage = list8;
        this.tiebreakWinPercentage = list9;
    }
}
