package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.IceHockeyTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.IceHockeyTopTeamsStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.TopTeamsStatisticsItem;
import defpackage.fc6;
import defpackage.gq9;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABã\u0001\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B÷\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u001e\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u001e\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u001e\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u001e\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u001e\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u001e\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u001e\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u001e\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0080\u0002\u0010!\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0017R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010\u0017R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b:\u0010\u0017R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b;\u0010\u0017R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b<\u0010\u0017R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b=\u0010\u0017R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b>\u0010\u0017R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b?\u0010\u0017R%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b@\u0010\u0017¨\u0006C"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopTeamsStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/TopTeamsStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/IceHockeyTopTeamsStatisticsItem;", "powerPlayPercentage", "penaltyKillPercentage", "goals", "goalsAgainst", "shots", "shotsAgainst", "hits", "blocks", "faceOffPercentage", "penaltyMinutes", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopTeamsStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopTeamsStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPowerPlayPercentage", "getPenaltyKillPercentage", "getGoals", "getGoalsAgainst", "getShots", "getShotsAgainst", "getHits", "getBlocks", "getFaceOffPercentage", "getPenaltyMinutes", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class IceHockeyTopTeamsStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> blocks;

    @Nullable
    private final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> faceOffPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> goals;

    @Nullable
    private final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> goalsAgainst;

    @Nullable
    private final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> hits;

    @Nullable
    private final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> penaltyKillPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> penaltyMinutes;

    @Nullable
    private final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> powerPlayPercentage;

    @Nullable
    private final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> shots;

    @Nullable
    private final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> shotsAgainst;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new gq9(19)), ypa.a(ysaVar, new gq9(20)), ypa.a(ysaVar, new gq9(21)), ypa.a(ysaVar, new gq9(22)), ypa.a(ysaVar, new gq9(23)), ypa.a(ysaVar, new gq9(24)), ypa.a(ysaVar, new gq9(25)), ypa.a(ysaVar, new gq9(26)), ypa.a(ysaVar, new gq9(27)), ypa.a(ysaVar, new gq9(28))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IceHockeyTopTeamsStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, t5h t5hVar) {
        super(i, t5hVar);
        if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
            oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, IceHockeyTopTeamsStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.powerPlayPercentage = list;
        this.penaltyKillPercentage = list2;
        this.goals = list3;
        this.goalsAgainst = list4;
        this.shots = list5;
        this.shotsAgainst = list6;
        this.hits = list7;
        this.blocks = list8;
        this.faceOffPercentage = list9;
        this.penaltyMinutes = list10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(IceHockeyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(IceHockeyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(IceHockeyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(IceHockeyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(IceHockeyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(IceHockeyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(IceHockeyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(IceHockeyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(IceHockeyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopTeamsStatisticsItem.INSTANCE.serializer(IceHockeyTopTeamsStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ IceHockeyTopTeamsStatistics copy$default(IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, int i, Object obj) {
        if ((i & 1) != 0) {
            list = iceHockeyTopTeamsStatistics.powerPlayPercentage;
        }
        if ((i & 2) != 0) {
            list2 = iceHockeyTopTeamsStatistics.penaltyKillPercentage;
        }
        if ((i & 4) != 0) {
            list3 = iceHockeyTopTeamsStatistics.goals;
        }
        if ((i & 8) != 0) {
            list4 = iceHockeyTopTeamsStatistics.goalsAgainst;
        }
        if ((i & 16) != 0) {
            list5 = iceHockeyTopTeamsStatistics.shots;
        }
        if ((i & 32) != 0) {
            list6 = iceHockeyTopTeamsStatistics.shotsAgainst;
        }
        if ((i & 64) != 0) {
            list7 = iceHockeyTopTeamsStatistics.hits;
        }
        if ((i & 128) != 0) {
            list8 = iceHockeyTopTeamsStatistics.blocks;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            list9 = iceHockeyTopTeamsStatistics.faceOffPercentage;
        }
        if ((i & 512) != 0) {
            list10 = iceHockeyTopTeamsStatistics.penaltyMinutes;
        }
        List list11 = list9;
        List list12 = list10;
        List list13 = list7;
        List list14 = list8;
        List list15 = list5;
        List list16 = list6;
        return iceHockeyTopTeamsStatistics.copy(list, list2, list3, list4, list15, list16, list13, list14, list11, list12);
    }

    public static final /* synthetic */ void write$Self$model_release(IceHockeyTopTeamsStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.powerPlayPercentage);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.penaltyKillPercentage);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.goals);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.goalsAgainst);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.shots);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.shotsAgainst);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.hits);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.blocks);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.faceOffPercentage);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.penaltyMinutes);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> component1() {
        return this.powerPlayPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> component10() {
        return this.penaltyMinutes;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> component2() {
        return this.penaltyKillPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> component3() {
        return this.goals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> component4() {
        return this.goalsAgainst;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> component5() {
        return this.shots;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> component6() {
        return this.shotsAgainst;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> component7() {
        return this.hits;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> component8() {
        return this.blocks;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> component9() {
        return this.faceOffPercentage;
    }

    @NotNull
    public final IceHockeyTopTeamsStatistics copy(@Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> powerPlayPercentage, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> penaltyKillPercentage, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> goals, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> goalsAgainst, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> shots, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> shotsAgainst, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> hits, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> blocks, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> faceOffPercentage, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> penaltyMinutes) {
        return new IceHockeyTopTeamsStatistics(powerPlayPercentage, penaltyKillPercentage, goals, goalsAgainst, shots, shotsAgainst, hits, blocks, faceOffPercentage, penaltyMinutes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IceHockeyTopTeamsStatistics)) {
            return false;
        }
        IceHockeyTopTeamsStatistics iceHockeyTopTeamsStatistics = (IceHockeyTopTeamsStatistics) other;
        return Intrinsics.c(this.powerPlayPercentage, iceHockeyTopTeamsStatistics.powerPlayPercentage) && Intrinsics.c(this.penaltyKillPercentage, iceHockeyTopTeamsStatistics.penaltyKillPercentage) && Intrinsics.c(this.goals, iceHockeyTopTeamsStatistics.goals) && Intrinsics.c(this.goalsAgainst, iceHockeyTopTeamsStatistics.goalsAgainst) && Intrinsics.c(this.shots, iceHockeyTopTeamsStatistics.shots) && Intrinsics.c(this.shotsAgainst, iceHockeyTopTeamsStatistics.shotsAgainst) && Intrinsics.c(this.hits, iceHockeyTopTeamsStatistics.hits) && Intrinsics.c(this.blocks, iceHockeyTopTeamsStatistics.blocks) && Intrinsics.c(this.faceOffPercentage, iceHockeyTopTeamsStatistics.faceOffPercentage) && Intrinsics.c(this.penaltyMinutes, iceHockeyTopTeamsStatistics.penaltyMinutes);
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> getBlocks() {
        return this.blocks;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> getFaceOffPercentage() {
        return this.faceOffPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> getGoals() {
        return this.goals;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> getGoalsAgainst() {
        return this.goalsAgainst;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> getHits() {
        return this.hits;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> getPenaltyKillPercentage() {
        return this.penaltyKillPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> getPenaltyMinutes() {
        return this.penaltyMinutes;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> getPowerPlayPercentage() {
        return this.powerPlayPercentage;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> getShots() {
        return this.shots;
    }

    @Nullable
    public final List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> getShotsAgainst() {
        return this.shotsAgainst;
    }

    public int hashCode() {
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list = this.powerPlayPercentage;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list2 = this.penaltyKillPercentage;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list3 = this.goals;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list4 = this.goalsAgainst;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list5 = this.shots;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list6 = this.shotsAgainst;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list7 = this.hits;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list8 = this.blocks;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list9 = this.faceOffPercentage;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list10 = this.penaltyMinutes;
        return hashCode9 + (list10 != null ? list10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list = this.powerPlayPercentage;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list2 = this.penaltyKillPercentage;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list3 = this.goals;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list4 = this.goalsAgainst;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list5 = this.shots;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list6 = this.shotsAgainst;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list7 = this.hits;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list8 = this.blocks;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list9 = this.faceOffPercentage;
        List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list10 = this.penaltyMinutes;
        StringBuilder s = fc6.s("IceHockeyTopTeamsStatistics(powerPlayPercentage=", ", penaltyKillPercentage=", ", goals=", list, list2);
        vxd.w(s, list3, ", goalsAgainst=", list4, ", shots=");
        vxd.w(s, list5, ", shotsAgainst=", list6, ", hits=");
        vxd.w(s, list7, ", blocks=", list8, ", faceOffPercentage=");
        return me4.j(s, list9, ", penaltyMinutes=", list10, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopTeamsStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopTeamsStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return IceHockeyTopTeamsStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public IceHockeyTopTeamsStatistics(@Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list2, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list3, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list4, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list5, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list6, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list7, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list8, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list9, @Nullable List<TopTeamsStatisticsItem<IceHockeyTopTeamsStatisticsItem>> list10) {
        super(null);
        this.powerPlayPercentage = list;
        this.penaltyKillPercentage = list2;
        this.goals = list3;
        this.goalsAgainst = list4;
        this.shots = list5;
        this.shotsAgainst = list6;
        this.hits = list7;
        this.blocks = list8;
        this.faceOffPercentage = list9;
        this.penaltyMinutes = list10;
    }
}
