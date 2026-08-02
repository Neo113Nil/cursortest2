package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.VolleyballTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.VolleyballTopTeamsStatisticsItem$$serializer;
import defpackage.fc6;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.pxk;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABã\u0001\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B÷\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u001e\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u001e\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u001e\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u001e\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u001e\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u001e\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u001e\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u001e\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0080\u0002\u0010!\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0017R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010\u0017R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b:\u0010\u0017R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b;\u0010\u0017R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b<\u0010\u0017R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b=\u0010\u0017R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b>\u0010\u0017R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b?\u0010\u0017R%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b@\u0010\u0017¨\u0006C"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/TopTeamsStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/VolleyballTopTeamsStatisticsItem;", "pointsTotal", "aces", "serveEfficiency", "blockPoints", "attackPoints", "attacksEfficiency", "attackErrors", "serveErrors", "receptionErrors", "attacksBlocked", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopTeamsStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopTeamsStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPointsTotal", "getAces", "getServeEfficiency", "getBlockPoints", "getAttackPoints", "getAttacksEfficiency", "getAttackErrors", "getServeErrors", "getReceptionErrors", "getAttacksBlocked", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VolleyballTopTeamsStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> aces;

    @Nullable
    private final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> attackErrors;

    @Nullable
    private final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> attackPoints;

    @Nullable
    private final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> attacksBlocked;

    @Nullable
    private final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> attacksEfficiency;

    @Nullable
    private final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> blockPoints;

    @Nullable
    private final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> pointsTotal;

    @Nullable
    private final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> receptionErrors;

    @Nullable
    private final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> serveEfficiency;

    @Nullable
    private final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> serveErrors;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new pxk(10)), ypa.a(ysaVar, new pxk(11)), ypa.a(ysaVar, new pxk(12)), ypa.a(ysaVar, new pxk(13)), ypa.a(ysaVar, new pxk(14)), ypa.a(ysaVar, new pxk(15)), ypa.a(ysaVar, new pxk(16)), ypa.a(ysaVar, new pxk(17)), ypa.a(ysaVar, new pxk(18)), ypa.a(ysaVar, new pxk(19))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VolleyballTopTeamsStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, t5h t5hVar) {
        super(i, t5hVar);
        if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
            oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, VolleyballTopTeamsStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.pointsTotal = list;
        this.aces = list2;
        this.serveEfficiency = list3;
        this.blockPoints = list4;
        this.attackPoints = list5;
        this.attacksEfficiency = list6;
        this.attackErrors = list7;
        this.serveErrors = list8;
        this.receptionErrors = list9;
        this.attacksBlocked = list10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(VolleyballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(VolleyballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(VolleyballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(VolleyballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(VolleyballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(VolleyballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(VolleyballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(VolleyballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(VolleyballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(VolleyballTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ VolleyballTopTeamsStatistics copy$default(VolleyballTopTeamsStatistics volleyballTopTeamsStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, int i, Object obj) {
        if ((i & 1) != 0) {
            list = volleyballTopTeamsStatistics.pointsTotal;
        }
        if ((i & 2) != 0) {
            list2 = volleyballTopTeamsStatistics.aces;
        }
        if ((i & 4) != 0) {
            list3 = volleyballTopTeamsStatistics.serveEfficiency;
        }
        if ((i & 8) != 0) {
            list4 = volleyballTopTeamsStatistics.blockPoints;
        }
        if ((i & 16) != 0) {
            list5 = volleyballTopTeamsStatistics.attackPoints;
        }
        if ((i & 32) != 0) {
            list6 = volleyballTopTeamsStatistics.attacksEfficiency;
        }
        if ((i & 64) != 0) {
            list7 = volleyballTopTeamsStatistics.attackErrors;
        }
        if ((i & 128) != 0) {
            list8 = volleyballTopTeamsStatistics.serveErrors;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            list9 = volleyballTopTeamsStatistics.receptionErrors;
        }
        if ((i & 512) != 0) {
            list10 = volleyballTopTeamsStatistics.attacksBlocked;
        }
        List list11 = list9;
        List list12 = list10;
        List list13 = list7;
        List list14 = list8;
        List list15 = list5;
        List list16 = list6;
        return volleyballTopTeamsStatistics.copy(list, list2, list3, list4, list15, list16, list13, list14, list11, list12);
    }

    public static final /* synthetic */ void write$Self$model_release(VolleyballTopTeamsStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.pointsTotal);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.aces);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.serveEfficiency);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.blockPoints);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.attackPoints);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.attacksEfficiency);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.attackErrors);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.serveErrors);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.receptionErrors);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.attacksBlocked);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> component1() {
        return this.pointsTotal;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> component10() {
        return this.attacksBlocked;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> component2() {
        return this.aces;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> component3() {
        return this.serveEfficiency;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> component4() {
        return this.blockPoints;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> component5() {
        return this.attackPoints;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> component6() {
        return this.attacksEfficiency;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> component7() {
        return this.attackErrors;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> component8() {
        return this.serveErrors;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> component9() {
        return this.receptionErrors;
    }

    @NotNull
    public final VolleyballTopTeamsStatistics copy(@Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> pointsTotal, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> aces, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> serveEfficiency, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> blockPoints, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> attackPoints, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> attacksEfficiency, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> attackErrors, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> serveErrors, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> receptionErrors, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> attacksBlocked) {
        return new VolleyballTopTeamsStatistics(pointsTotal, aces, serveEfficiency, blockPoints, attackPoints, attacksEfficiency, attackErrors, serveErrors, receptionErrors, attacksBlocked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VolleyballTopTeamsStatistics)) {
            return false;
        }
        VolleyballTopTeamsStatistics volleyballTopTeamsStatistics = (VolleyballTopTeamsStatistics) other;
        return Intrinsics.c(this.pointsTotal, volleyballTopTeamsStatistics.pointsTotal) && Intrinsics.c(this.aces, volleyballTopTeamsStatistics.aces) && Intrinsics.c(this.serveEfficiency, volleyballTopTeamsStatistics.serveEfficiency) && Intrinsics.c(this.blockPoints, volleyballTopTeamsStatistics.blockPoints) && Intrinsics.c(this.attackPoints, volleyballTopTeamsStatistics.attackPoints) && Intrinsics.c(this.attacksEfficiency, volleyballTopTeamsStatistics.attacksEfficiency) && Intrinsics.c(this.attackErrors, volleyballTopTeamsStatistics.attackErrors) && Intrinsics.c(this.serveErrors, volleyballTopTeamsStatistics.serveErrors) && Intrinsics.c(this.receptionErrors, volleyballTopTeamsStatistics.receptionErrors) && Intrinsics.c(this.attacksBlocked, volleyballTopTeamsStatistics.attacksBlocked);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> getAces() {
        return this.aces;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> getAttackErrors() {
        return this.attackErrors;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> getAttackPoints() {
        return this.attackPoints;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> getAttacksBlocked() {
        return this.attacksBlocked;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> getAttacksEfficiency() {
        return this.attacksEfficiency;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> getBlockPoints() {
        return this.blockPoints;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> getPointsTotal() {
        return this.pointsTotal;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> getReceptionErrors() {
        return this.receptionErrors;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> getServeEfficiency() {
        return this.serveEfficiency;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> getServeErrors() {
        return this.serveErrors;
    }

    public int hashCode() {
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list = this.pointsTotal;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list2 = this.aces;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list3 = this.serveEfficiency;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list4 = this.blockPoints;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list5 = this.attackPoints;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list6 = this.attacksEfficiency;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list7 = this.attackErrors;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list8 = this.serveErrors;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list9 = this.receptionErrors;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list10 = this.attacksBlocked;
        return hashCode9 + (list10 != null ? list10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list = this.pointsTotal;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list2 = this.aces;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list3 = this.serveEfficiency;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list4 = this.blockPoints;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list5 = this.attackPoints;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list6 = this.attacksEfficiency;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list7 = this.attackErrors;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list8 = this.serveErrors;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list9 = this.receptionErrors;
        List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list10 = this.attacksBlocked;
        StringBuilder s = fc6.s("VolleyballTopTeamsStatistics(pointsTotal=", ", aces=", ", serveEfficiency=", list, list2);
        vxd.w(s, list3, ", blockPoints=", list4, ", attackPoints=");
        vxd.w(s, list5, ", attacksEfficiency=", list6, ", attackErrors=");
        vxd.w(s, list7, ", serveErrors=", list8, ", receptionErrors=");
        return me4.j(s, list9, ", attacksBlocked=", list10, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopTeamsStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopTeamsStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VolleyballTopTeamsStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VolleyballTopTeamsStatistics(@Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list2, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list3, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list4, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list5, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list6, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list7, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list8, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list9, @Nullable List<TopTeamsStatisticsItem<VolleyballTopTeamsStatisticsItem>> list10) {
        super(null);
        this.pointsTotal = list;
        this.aces = list2;
        this.serveEfficiency = list3;
        this.blockPoints = list4;
        this.attackPoints = list5;
        this.attacksEfficiency = list6;
        this.attackErrors = list7;
        this.serveErrors = list8;
        this.receptionErrors = list9;
        this.attacksBlocked = list10;
    }
}
