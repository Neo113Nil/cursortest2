package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.VolleyballTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.VolleyballTopPlayersStatisticsItem$$serializer;
import defpackage.fc6;
import defpackage.joa;
import defpackage.khk;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABã\u0001\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B÷\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u001e\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u001e\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u001e\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u001e\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u001e\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u001e\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u001e\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u001e\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0080\u0002\u0010!\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0017R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010\u0017R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b:\u0010\u0017R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b;\u0010\u0017R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b<\u0010\u0017R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b=\u0010\u0017R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b>\u0010\u0017R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b?\u0010\u0017R%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b@\u0010\u0017¨\u0006C"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/VolleyballTopPlayersStatisticsItem;", "pointsTotal", "aces", "serveEfficiency", "blockPoints", "attackPoints", "attacksEfficiency", "attackErrors", "serveErrors", "receptionErrors", "attacksBlocked", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopPlayersStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopPlayersStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPointsTotal", "getAces", "getServeEfficiency", "getBlockPoints", "getAttackPoints", "getAttacksEfficiency", "getAttackErrors", "getServeErrors", "getReceptionErrors", "getAttacksBlocked", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VolleyballTopPlayersStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> aces;

    @Nullable
    private final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> attackErrors;

    @Nullable
    private final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> attackPoints;

    @Nullable
    private final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> attacksBlocked;

    @Nullable
    private final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> attacksEfficiency;

    @Nullable
    private final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> blockPoints;

    @Nullable
    private final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> pointsTotal;

    @Nullable
    private final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> receptionErrors;

    @Nullable
    private final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> serveEfficiency;

    @Nullable
    private final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> serveErrors;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new khk(26)), ypa.a(ysaVar, new khk(27)), ypa.a(ysaVar, new khk(28)), ypa.a(ysaVar, new khk(29)), ypa.a(ysaVar, new pxk(0)), ypa.a(ysaVar, new pxk(1)), ypa.a(ysaVar, new pxk(2)), ypa.a(ysaVar, new pxk(3)), ypa.a(ysaVar, new pxk(4)), ypa.a(ysaVar, new pxk(5))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VolleyballTopPlayersStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, t5h t5hVar) {
        super(i, t5hVar);
        if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
            oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, VolleyballTopPlayersStatistics$$serializer.INSTANCE.getDescriptor());
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
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(VolleyballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(VolleyballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(VolleyballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(VolleyballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(VolleyballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(VolleyballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(VolleyballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(VolleyballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(VolleyballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(VolleyballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ VolleyballTopPlayersStatistics copy$default(VolleyballTopPlayersStatistics volleyballTopPlayersStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, int i, Object obj) {
        if ((i & 1) != 0) {
            list = volleyballTopPlayersStatistics.pointsTotal;
        }
        if ((i & 2) != 0) {
            list2 = volleyballTopPlayersStatistics.aces;
        }
        if ((i & 4) != 0) {
            list3 = volleyballTopPlayersStatistics.serveEfficiency;
        }
        if ((i & 8) != 0) {
            list4 = volleyballTopPlayersStatistics.blockPoints;
        }
        if ((i & 16) != 0) {
            list5 = volleyballTopPlayersStatistics.attackPoints;
        }
        if ((i & 32) != 0) {
            list6 = volleyballTopPlayersStatistics.attacksEfficiency;
        }
        if ((i & 64) != 0) {
            list7 = volleyballTopPlayersStatistics.attackErrors;
        }
        if ((i & 128) != 0) {
            list8 = volleyballTopPlayersStatistics.serveErrors;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            list9 = volleyballTopPlayersStatistics.receptionErrors;
        }
        if ((i & 512) != 0) {
            list10 = volleyballTopPlayersStatistics.attacksBlocked;
        }
        List list11 = list9;
        List list12 = list10;
        List list13 = list7;
        List list14 = list8;
        List list15 = list5;
        List list16 = list6;
        return volleyballTopPlayersStatistics.copy(list, list2, list3, list4, list15, list16, list13, list14, list11, list12);
    }

    public static final /* synthetic */ void write$Self$model_release(VolleyballTopPlayersStatistics self, wf3 output, SerialDescriptor serialDesc) {
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
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> component1() {
        return this.pointsTotal;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> component10() {
        return this.attacksBlocked;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> component2() {
        return this.aces;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> component3() {
        return this.serveEfficiency;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> component4() {
        return this.blockPoints;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> component5() {
        return this.attackPoints;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> component6() {
        return this.attacksEfficiency;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> component7() {
        return this.attackErrors;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> component8() {
        return this.serveErrors;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> component9() {
        return this.receptionErrors;
    }

    @NotNull
    public final VolleyballTopPlayersStatistics copy(@Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> pointsTotal, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> aces, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> serveEfficiency, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> blockPoints, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> attackPoints, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> attacksEfficiency, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> attackErrors, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> serveErrors, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> receptionErrors, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> attacksBlocked) {
        return new VolleyballTopPlayersStatistics(pointsTotal, aces, serveEfficiency, blockPoints, attackPoints, attacksEfficiency, attackErrors, serveErrors, receptionErrors, attacksBlocked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VolleyballTopPlayersStatistics)) {
            return false;
        }
        VolleyballTopPlayersStatistics volleyballTopPlayersStatistics = (VolleyballTopPlayersStatistics) other;
        return Intrinsics.c(this.pointsTotal, volleyballTopPlayersStatistics.pointsTotal) && Intrinsics.c(this.aces, volleyballTopPlayersStatistics.aces) && Intrinsics.c(this.serveEfficiency, volleyballTopPlayersStatistics.serveEfficiency) && Intrinsics.c(this.blockPoints, volleyballTopPlayersStatistics.blockPoints) && Intrinsics.c(this.attackPoints, volleyballTopPlayersStatistics.attackPoints) && Intrinsics.c(this.attacksEfficiency, volleyballTopPlayersStatistics.attacksEfficiency) && Intrinsics.c(this.attackErrors, volleyballTopPlayersStatistics.attackErrors) && Intrinsics.c(this.serveErrors, volleyballTopPlayersStatistics.serveErrors) && Intrinsics.c(this.receptionErrors, volleyballTopPlayersStatistics.receptionErrors) && Intrinsics.c(this.attacksBlocked, volleyballTopPlayersStatistics.attacksBlocked);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> getAces() {
        return this.aces;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> getAttackErrors() {
        return this.attackErrors;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> getAttackPoints() {
        return this.attackPoints;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> getAttacksBlocked() {
        return this.attacksBlocked;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> getAttacksEfficiency() {
        return this.attacksEfficiency;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> getBlockPoints() {
        return this.blockPoints;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> getPointsTotal() {
        return this.pointsTotal;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> getReceptionErrors() {
        return this.receptionErrors;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> getServeEfficiency() {
        return this.serveEfficiency;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> getServeErrors() {
        return this.serveErrors;
    }

    public int hashCode() {
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list = this.pointsTotal;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list2 = this.aces;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list3 = this.serveEfficiency;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list4 = this.blockPoints;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list5 = this.attackPoints;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list6 = this.attacksEfficiency;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list7 = this.attackErrors;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list8 = this.serveErrors;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list9 = this.receptionErrors;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list10 = this.attacksBlocked;
        return hashCode9 + (list10 != null ? list10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list = this.pointsTotal;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list2 = this.aces;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list3 = this.serveEfficiency;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list4 = this.blockPoints;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list5 = this.attackPoints;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list6 = this.attacksEfficiency;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list7 = this.attackErrors;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list8 = this.serveErrors;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list9 = this.receptionErrors;
        List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list10 = this.attacksBlocked;
        StringBuilder s = fc6.s("VolleyballTopPlayersStatistics(pointsTotal=", ", aces=", ", serveEfficiency=", list, list2);
        vxd.w(s, list3, ", blockPoints=", list4, ", attackPoints=");
        vxd.w(s, list5, ", attacksEfficiency=", list6, ", attackErrors=");
        vxd.w(s, list7, ", serveErrors=", list8, ", receptionErrors=");
        return me4.j(s, list9, ", attacksBlocked=", list10, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopPlayersStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/VolleyballTopPlayersStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VolleyballTopPlayersStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VolleyballTopPlayersStatistics(@Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list2, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list3, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list4, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list5, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list6, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list7, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list8, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list9, @Nullable List<TopPlayersStatisticsItem<VolleyballTopPlayersStatisticsItem>> list10) {
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
