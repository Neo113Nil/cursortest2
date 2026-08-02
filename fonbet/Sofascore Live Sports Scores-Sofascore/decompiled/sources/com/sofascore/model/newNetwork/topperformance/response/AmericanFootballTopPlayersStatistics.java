package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.AmericanFootballTopPlayersStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.AmericanFootballTopPlayersStatisticsItem$$serializer;
import com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem;
import defpackage.fc6;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.st;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBù\u0001\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u008d\u0002\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u001e\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u001e\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u001e\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u001e\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u001e\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u001e\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u001e\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u001e\u0010 \u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u001e\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u001e\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0098\u0002\u0010#\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u0018R%\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b:\u0010\u0018R%\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b;\u0010\u0018R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b<\u0010\u0018R%\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b=\u0010\u0018R%\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b>\u0010\u0018R%\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b?\u0010\u0018R%\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b@\u0010\u0018R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\bA\u0010\u0018R%\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\bB\u0010\u0018R%\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\bC\u0010\u0018¨\u0006F"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/AmericanFootballTopPlayersStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/AmericanFootballTopPlayersStatisticsItem;", "passingTouchdowns", "rushingTouchdowns", "receivingTouchdowns", "passingCompletionPercentage", "passingTouchdownInterceptionRatio", "rushingYardsPerAttempt", "receivingYardsPerReception", "defensiveInterceptions", "defensiveTotalTackles", "defensiveSacks", "kickingFgMade", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/AmericanFootballTopPlayersStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/AmericanFootballTopPlayersStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPassingTouchdowns", "getRushingTouchdowns", "getReceivingTouchdowns", "getPassingCompletionPercentage", "getPassingTouchdownInterceptionRatio", "getRushingYardsPerAttempt", "getReceivingYardsPerReception", "getDefensiveInterceptions", "getDefensiveTotalTackles", "getDefensiveSacks", "getKickingFgMade", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AmericanFootballTopPlayersStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> defensiveInterceptions;

    @Nullable
    private final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> defensiveSacks;

    @Nullable
    private final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> defensiveTotalTackles;

    @Nullable
    private final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> kickingFgMade;

    @Nullable
    private final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> passingCompletionPercentage;

    @Nullable
    private final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> passingTouchdownInterceptionRatio;

    @Nullable
    private final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> passingTouchdowns;

    @Nullable
    private final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> receivingTouchdowns;

    @Nullable
    private final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> receivingYardsPerReception;

    @Nullable
    private final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> rushingTouchdowns;

    @Nullable
    private final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> rushingYardsPerAttempt;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new st(3)), ypa.a(ysaVar, new st(6)), ypa.a(ysaVar, new st(7)), ypa.a(ysaVar, new st(8)), ypa.a(ysaVar, new st(9)), ypa.a(ysaVar, new st(10)), ypa.a(ysaVar, new st(11)), ypa.a(ysaVar, new st(12)), ypa.a(ysaVar, new st(13)), ypa.a(ysaVar, new st(4)), ypa.a(ysaVar, new st(5))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmericanFootballTopPlayersStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, t5h t5hVar) {
        super(i, t5hVar);
        if (2047 != (i & 2047)) {
            oea.z(i, 2047, AmericanFootballTopPlayersStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.passingTouchdowns = list;
        this.rushingTouchdowns = list2;
        this.receivingTouchdowns = list3;
        this.passingCompletionPercentage = list4;
        this.passingTouchdownInterceptionRatio = list5;
        this.rushingYardsPerAttempt = list6;
        this.receivingYardsPerReception = list7;
        this.defensiveInterceptions = list8;
        this.defensiveTotalTackles = list9;
        this.defensiveSacks = list10;
        this.kickingFgMade = list11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopPlayersStatisticsItem.INSTANCE.serializer(AmericanFootballTopPlayersStatisticsItem$$serializer.INSTANCE), 0);
    }

    public static /* synthetic */ AmericanFootballTopPlayersStatistics copy$default(AmericanFootballTopPlayersStatistics americanFootballTopPlayersStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, int i, Object obj) {
        if ((i & 1) != 0) {
            list = americanFootballTopPlayersStatistics.passingTouchdowns;
        }
        if ((i & 2) != 0) {
            list2 = americanFootballTopPlayersStatistics.rushingTouchdowns;
        }
        if ((i & 4) != 0) {
            list3 = americanFootballTopPlayersStatistics.receivingTouchdowns;
        }
        if ((i & 8) != 0) {
            list4 = americanFootballTopPlayersStatistics.passingCompletionPercentage;
        }
        if ((i & 16) != 0) {
            list5 = americanFootballTopPlayersStatistics.passingTouchdownInterceptionRatio;
        }
        if ((i & 32) != 0) {
            list6 = americanFootballTopPlayersStatistics.rushingYardsPerAttempt;
        }
        if ((i & 64) != 0) {
            list7 = americanFootballTopPlayersStatistics.receivingYardsPerReception;
        }
        if ((i & 128) != 0) {
            list8 = americanFootballTopPlayersStatistics.defensiveInterceptions;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            list9 = americanFootballTopPlayersStatistics.defensiveTotalTackles;
        }
        if ((i & 512) != 0) {
            list10 = americanFootballTopPlayersStatistics.defensiveSacks;
        }
        if ((i & 1024) != 0) {
            list11 = americanFootballTopPlayersStatistics.kickingFgMade;
        }
        List list12 = list10;
        List list13 = list11;
        List list14 = list8;
        List list15 = list9;
        List list16 = list6;
        List list17 = list7;
        List list18 = list5;
        List list19 = list3;
        return americanFootballTopPlayersStatistics.copy(list, list2, list19, list4, list18, list16, list17, list14, list15, list12, list13);
    }

    public static final /* synthetic */ void write$Self$model_release(AmericanFootballTopPlayersStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.passingTouchdowns);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.rushingTouchdowns);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.receivingTouchdowns);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.passingCompletionPercentage);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.passingTouchdownInterceptionRatio);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.rushingYardsPerAttempt);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.receivingYardsPerReception);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.defensiveInterceptions);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.defensiveTotalTackles);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.defensiveSacks);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.kickingFgMade);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> component1() {
        return this.passingTouchdowns;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> component10() {
        return this.defensiveSacks;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> component11() {
        return this.kickingFgMade;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> component2() {
        return this.rushingTouchdowns;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> component3() {
        return this.receivingTouchdowns;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> component4() {
        return this.passingCompletionPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> component5() {
        return this.passingTouchdownInterceptionRatio;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> component6() {
        return this.rushingYardsPerAttempt;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> component7() {
        return this.receivingYardsPerReception;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> component8() {
        return this.defensiveInterceptions;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> component9() {
        return this.defensiveTotalTackles;
    }

    @NotNull
    public final AmericanFootballTopPlayersStatistics copy(@Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> passingTouchdowns, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> rushingTouchdowns, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> receivingTouchdowns, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> passingCompletionPercentage, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> passingTouchdownInterceptionRatio, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> rushingYardsPerAttempt, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> receivingYardsPerReception, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> defensiveInterceptions, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> defensiveTotalTackles, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> defensiveSacks, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> kickingFgMade) {
        return new AmericanFootballTopPlayersStatistics(passingTouchdowns, rushingTouchdowns, receivingTouchdowns, passingCompletionPercentage, passingTouchdownInterceptionRatio, rushingYardsPerAttempt, receivingYardsPerReception, defensiveInterceptions, defensiveTotalTackles, defensiveSacks, kickingFgMade);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmericanFootballTopPlayersStatistics)) {
            return false;
        }
        AmericanFootballTopPlayersStatistics americanFootballTopPlayersStatistics = (AmericanFootballTopPlayersStatistics) other;
        return Intrinsics.c(this.passingTouchdowns, americanFootballTopPlayersStatistics.passingTouchdowns) && Intrinsics.c(this.rushingTouchdowns, americanFootballTopPlayersStatistics.rushingTouchdowns) && Intrinsics.c(this.receivingTouchdowns, americanFootballTopPlayersStatistics.receivingTouchdowns) && Intrinsics.c(this.passingCompletionPercentage, americanFootballTopPlayersStatistics.passingCompletionPercentage) && Intrinsics.c(this.passingTouchdownInterceptionRatio, americanFootballTopPlayersStatistics.passingTouchdownInterceptionRatio) && Intrinsics.c(this.rushingYardsPerAttempt, americanFootballTopPlayersStatistics.rushingYardsPerAttempt) && Intrinsics.c(this.receivingYardsPerReception, americanFootballTopPlayersStatistics.receivingYardsPerReception) && Intrinsics.c(this.defensiveInterceptions, americanFootballTopPlayersStatistics.defensiveInterceptions) && Intrinsics.c(this.defensiveTotalTackles, americanFootballTopPlayersStatistics.defensiveTotalTackles) && Intrinsics.c(this.defensiveSacks, americanFootballTopPlayersStatistics.defensiveSacks) && Intrinsics.c(this.kickingFgMade, americanFootballTopPlayersStatistics.kickingFgMade);
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> getDefensiveInterceptions() {
        return this.defensiveInterceptions;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> getDefensiveSacks() {
        return this.defensiveSacks;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> getDefensiveTotalTackles() {
        return this.defensiveTotalTackles;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> getKickingFgMade() {
        return this.kickingFgMade;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> getPassingCompletionPercentage() {
        return this.passingCompletionPercentage;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> getPassingTouchdownInterceptionRatio() {
        return this.passingTouchdownInterceptionRatio;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> getPassingTouchdowns() {
        return this.passingTouchdowns;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> getReceivingTouchdowns() {
        return this.receivingTouchdowns;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> getReceivingYardsPerReception() {
        return this.receivingYardsPerReception;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> getRushingTouchdowns() {
        return this.rushingTouchdowns;
    }

    @Nullable
    public final List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> getRushingYardsPerAttempt() {
        return this.rushingYardsPerAttempt;
    }

    public int hashCode() {
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list = this.passingTouchdowns;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list2 = this.rushingTouchdowns;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list3 = this.receivingTouchdowns;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list4 = this.passingCompletionPercentage;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list5 = this.passingTouchdownInterceptionRatio;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list6 = this.rushingYardsPerAttempt;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list7 = this.receivingYardsPerReception;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list8 = this.defensiveInterceptions;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list9 = this.defensiveTotalTackles;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list10 = this.defensiveSacks;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list11 = this.kickingFgMade;
        return hashCode10 + (list11 != null ? list11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list = this.passingTouchdowns;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list2 = this.rushingTouchdowns;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list3 = this.receivingTouchdowns;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list4 = this.passingCompletionPercentage;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list5 = this.passingTouchdownInterceptionRatio;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list6 = this.rushingYardsPerAttempt;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list7 = this.receivingYardsPerReception;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list8 = this.defensiveInterceptions;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list9 = this.defensiveTotalTackles;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list10 = this.defensiveSacks;
        List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list11 = this.kickingFgMade;
        StringBuilder s = fc6.s("AmericanFootballTopPlayersStatistics(passingTouchdowns=", ", rushingTouchdowns=", ", receivingTouchdowns=", list, list2);
        vxd.w(s, list3, ", passingCompletionPercentage=", list4, ", passingTouchdownInterceptionRatio=");
        vxd.w(s, list5, ", rushingYardsPerAttempt=", list6, ", receivingYardsPerReception=");
        vxd.w(s, list7, ", defensiveInterceptions=", list8, ", defensiveTotalTackles=");
        vxd.w(s, list9, ", defensiveSacks=", list10, ", kickingFgMade=");
        return mz1.p(s, list11, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/AmericanFootballTopPlayersStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/AmericanFootballTopPlayersStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AmericanFootballTopPlayersStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AmericanFootballTopPlayersStatistics(@Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list2, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list3, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list4, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list5, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list6, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list7, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list8, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list9, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list10, @Nullable List<TopPlayersStatisticsItem<AmericanFootballTopPlayersStatisticsItem>> list11) {
        super(null);
        this.passingTouchdowns = list;
        this.rushingTouchdowns = list2;
        this.receivingTouchdowns = list3;
        this.passingCompletionPercentage = list4;
        this.passingTouchdownInterceptionRatio = list5;
        this.rushingYardsPerAttempt = list6;
        this.receivingYardsPerReception = list7;
        this.defensiveInterceptions = list8;
        this.defensiveTotalTackles = list9;
        this.defensiveSacks = list10;
        this.kickingFgMade = list11;
    }
}
