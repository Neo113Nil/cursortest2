package com.sofascore.model.newNetwork.topperformance.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.fc6;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.us1;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBÇ\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011BÛ\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018Jè\u0001\u0010$\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010\u0018R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b;\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b<\u0010\u0018R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b=\u0010\u0018R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b>\u0010\u0018R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b?\u0010\u0018R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b@\u0010\u0018R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\bA\u0010\u0018R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bB\u0010\u0018R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bC\u0010\u0018R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bD\u0010\u0018R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bE\u0010\u0018¨\u0006H"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopStatsPerGameStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/response/TopStatsItem;", "points", "rebounds", "assists", "threePointsMade", "defensiveRebounds", "offensiveRebounds", "steals", "turnovers", "blocks", "plusMinus", "pir", CampaignEx.JSON_KEY_STAR, "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopStatsPerGameStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopStatsPerGameStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPoints", "getRebounds", "getAssists", "getThreePointsMade", "getDefensiveRebounds", "getOffensiveRebounds", "getSteals", "getTurnovers", "getBlocks", "getPlusMinus", "getPir", "getRating", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BasketballTopStatsPerGameStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopStatsItem> assists;

    @Nullable
    private final List<TopStatsItem> blocks;

    @Nullable
    private final List<TopStatsItem> defensiveRebounds;

    @Nullable
    private final List<TopStatsItem> offensiveRebounds;

    @Nullable
    private final List<TopStatsItem> pir;

    @Nullable
    private final List<TopStatsItem> plusMinus;

    @Nullable
    private final List<TopStatsItem> points;

    @Nullable
    private final List<TopStatsItem> rating;

    @Nullable
    private final List<TopStatsItem> rebounds;

    @Nullable
    private final List<TopStatsItem> steals;

    @Nullable
    private final List<TopStatsItem> threePointsMade;

    @Nullable
    private final List<TopStatsItem> turnovers;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new us1(6)), ypa.a(ysaVar, new us1(11)), ypa.a(ysaVar, new us1(12)), ypa.a(ysaVar, new us1(13)), ypa.a(ysaVar, new us1(14)), ypa.a(ysaVar, new us1(15)), ypa.a(ysaVar, new us1(16)), ypa.a(ysaVar, new us1(17)), ypa.a(ysaVar, new us1(7)), ypa.a(ysaVar, new us1(8)), ypa.a(ysaVar, new us1(9)), ypa.a(ysaVar, new us1(10))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketballTopStatsPerGameStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, t5h t5hVar) {
        super(i, t5hVar);
        if (4095 != (i & 4095)) {
            oea.z(i, 4095, BasketballTopStatsPerGameStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = list;
        this.rebounds = list2;
        this.assists = list3;
        this.threePointsMade = list4;
        this.defensiveRebounds = list5;
        this.offensiveRebounds = list6;
        this.steals = list7;
        this.turnovers = list8;
        this.blocks = list9;
        this.plusMinus = list10;
        this.pir = list11;
        this.rating = list12;
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
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$10() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$6() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$7() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$8() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$9() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ BasketballTopStatsPerGameStatistics copy$default(BasketballTopStatsPerGameStatistics basketballTopStatsPerGameStatistics, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, int i, Object obj) {
        if ((i & 1) != 0) {
            list = basketballTopStatsPerGameStatistics.points;
        }
        if ((i & 2) != 0) {
            list2 = basketballTopStatsPerGameStatistics.rebounds;
        }
        if ((i & 4) != 0) {
            list3 = basketballTopStatsPerGameStatistics.assists;
        }
        if ((i & 8) != 0) {
            list4 = basketballTopStatsPerGameStatistics.threePointsMade;
        }
        if ((i & 16) != 0) {
            list5 = basketballTopStatsPerGameStatistics.defensiveRebounds;
        }
        if ((i & 32) != 0) {
            list6 = basketballTopStatsPerGameStatistics.offensiveRebounds;
        }
        if ((i & 64) != 0) {
            list7 = basketballTopStatsPerGameStatistics.steals;
        }
        if ((i & 128) != 0) {
            list8 = basketballTopStatsPerGameStatistics.turnovers;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            list9 = basketballTopStatsPerGameStatistics.blocks;
        }
        if ((i & 512) != 0) {
            list10 = basketballTopStatsPerGameStatistics.plusMinus;
        }
        if ((i & 1024) != 0) {
            list11 = basketballTopStatsPerGameStatistics.pir;
        }
        if ((i & a.o) != 0) {
            list12 = basketballTopStatsPerGameStatistics.rating;
        }
        List list13 = list11;
        List list14 = list12;
        List list15 = list9;
        List list16 = list10;
        List list17 = list7;
        List list18 = list8;
        List list19 = list5;
        List list20 = list6;
        return basketballTopStatsPerGameStatistics.copy(list, list2, list3, list4, list19, list20, list17, list18, list15, list16, list13, list14);
    }

    public static final /* synthetic */ void write$Self$model_release(BasketballTopStatsPerGameStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.points);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.rebounds);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.assists);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.threePointsMade);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.defensiveRebounds);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.offensiveRebounds);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.steals);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.turnovers);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.blocks);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.plusMinus);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.pir);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.rating);
    }

    @Nullable
    public final List<TopStatsItem> component1() {
        return this.points;
    }

    @Nullable
    public final List<TopStatsItem> component10() {
        return this.plusMinus;
    }

    @Nullable
    public final List<TopStatsItem> component11() {
        return this.pir;
    }

    @Nullable
    public final List<TopStatsItem> component12() {
        return this.rating;
    }

    @Nullable
    public final List<TopStatsItem> component2() {
        return this.rebounds;
    }

    @Nullable
    public final List<TopStatsItem> component3() {
        return this.assists;
    }

    @Nullable
    public final List<TopStatsItem> component4() {
        return this.threePointsMade;
    }

    @Nullable
    public final List<TopStatsItem> component5() {
        return this.defensiveRebounds;
    }

    @Nullable
    public final List<TopStatsItem> component6() {
        return this.offensiveRebounds;
    }

    @Nullable
    public final List<TopStatsItem> component7() {
        return this.steals;
    }

    @Nullable
    public final List<TopStatsItem> component8() {
        return this.turnovers;
    }

    @Nullable
    public final List<TopStatsItem> component9() {
        return this.blocks;
    }

    @NotNull
    public final BasketballTopStatsPerGameStatistics copy(@Nullable List<TopStatsItem> points, @Nullable List<TopStatsItem> rebounds, @Nullable List<TopStatsItem> assists, @Nullable List<TopStatsItem> threePointsMade, @Nullable List<TopStatsItem> defensiveRebounds, @Nullable List<TopStatsItem> offensiveRebounds, @Nullable List<TopStatsItem> steals, @Nullable List<TopStatsItem> turnovers, @Nullable List<TopStatsItem> blocks, @Nullable List<TopStatsItem> plusMinus, @Nullable List<TopStatsItem> pir, @Nullable List<TopStatsItem> rating) {
        return new BasketballTopStatsPerGameStatistics(points, rebounds, assists, threePointsMade, defensiveRebounds, offensiveRebounds, steals, turnovers, blocks, plusMinus, pir, rating);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketballTopStatsPerGameStatistics)) {
            return false;
        }
        BasketballTopStatsPerGameStatistics basketballTopStatsPerGameStatistics = (BasketballTopStatsPerGameStatistics) other;
        return Intrinsics.c(this.points, basketballTopStatsPerGameStatistics.points) && Intrinsics.c(this.rebounds, basketballTopStatsPerGameStatistics.rebounds) && Intrinsics.c(this.assists, basketballTopStatsPerGameStatistics.assists) && Intrinsics.c(this.threePointsMade, basketballTopStatsPerGameStatistics.threePointsMade) && Intrinsics.c(this.defensiveRebounds, basketballTopStatsPerGameStatistics.defensiveRebounds) && Intrinsics.c(this.offensiveRebounds, basketballTopStatsPerGameStatistics.offensiveRebounds) && Intrinsics.c(this.steals, basketballTopStatsPerGameStatistics.steals) && Intrinsics.c(this.turnovers, basketballTopStatsPerGameStatistics.turnovers) && Intrinsics.c(this.blocks, basketballTopStatsPerGameStatistics.blocks) && Intrinsics.c(this.plusMinus, basketballTopStatsPerGameStatistics.plusMinus) && Intrinsics.c(this.pir, basketballTopStatsPerGameStatistics.pir) && Intrinsics.c(this.rating, basketballTopStatsPerGameStatistics.rating);
    }

    @Nullable
    public final List<TopStatsItem> getAssists() {
        return this.assists;
    }

    @Nullable
    public final List<TopStatsItem> getBlocks() {
        return this.blocks;
    }

    @Nullable
    public final List<TopStatsItem> getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    public final List<TopStatsItem> getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    public final List<TopStatsItem> getPir() {
        return this.pir;
    }

    @Nullable
    public final List<TopStatsItem> getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    public final List<TopStatsItem> getPoints() {
        return this.points;
    }

    @Nullable
    public final List<TopStatsItem> getRating() {
        return this.rating;
    }

    @Nullable
    public final List<TopStatsItem> getRebounds() {
        return this.rebounds;
    }

    @Nullable
    public final List<TopStatsItem> getSteals() {
        return this.steals;
    }

    @Nullable
    public final List<TopStatsItem> getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    public final List<TopStatsItem> getTurnovers() {
        return this.turnovers;
    }

    public int hashCode() {
        List<TopStatsItem> list = this.points;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopStatsItem> list2 = this.rebounds;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopStatsItem> list3 = this.assists;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopStatsItem> list4 = this.threePointsMade;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopStatsItem> list5 = this.defensiveRebounds;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopStatsItem> list6 = this.offensiveRebounds;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopStatsItem> list7 = this.steals;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopStatsItem> list8 = this.turnovers;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopStatsItem> list9 = this.blocks;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopStatsItem> list10 = this.plusMinus;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopStatsItem> list11 = this.pir;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopStatsItem> list12 = this.rating;
        return hashCode11 + (list12 != null ? list12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopStatsItem> list = this.points;
        List<TopStatsItem> list2 = this.rebounds;
        List<TopStatsItem> list3 = this.assists;
        List<TopStatsItem> list4 = this.threePointsMade;
        List<TopStatsItem> list5 = this.defensiveRebounds;
        List<TopStatsItem> list6 = this.offensiveRebounds;
        List<TopStatsItem> list7 = this.steals;
        List<TopStatsItem> list8 = this.turnovers;
        List<TopStatsItem> list9 = this.blocks;
        List<TopStatsItem> list10 = this.plusMinus;
        List<TopStatsItem> list11 = this.pir;
        List<TopStatsItem> list12 = this.rating;
        StringBuilder s = fc6.s("BasketballTopStatsPerGameStatistics(points=", ", rebounds=", ", assists=", list, list2);
        vxd.w(s, list3, ", threePointsMade=", list4, ", defensiveRebounds=");
        vxd.w(s, list5, ", offensiveRebounds=", list6, ", steals=");
        vxd.w(s, list7, ", turnovers=", list8, ", blocks=");
        vxd.w(s, list9, ", plusMinus=", list10, ", pir=");
        return me4.j(s, list11, ", rating=", list12, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopStatsPerGameStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/BasketballTopStatsPerGameStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketballTopStatsPerGameStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BasketballTopStatsPerGameStatistics(@Nullable List<TopStatsItem> list, @Nullable List<TopStatsItem> list2, @Nullable List<TopStatsItem> list3, @Nullable List<TopStatsItem> list4, @Nullable List<TopStatsItem> list5, @Nullable List<TopStatsItem> list6, @Nullable List<TopStatsItem> list7, @Nullable List<TopStatsItem> list8, @Nullable List<TopStatsItem> list9, @Nullable List<TopStatsItem> list10, @Nullable List<TopStatsItem> list11, @Nullable List<TopStatsItem> list12) {
        super(null);
        this.points = list;
        this.rebounds = list2;
        this.assists = list3;
        this.threePointsMade = list4;
        this.defensiveRebounds = list5;
        this.offensiveRebounds = list6;
        this.steals = list7;
        this.turnovers = list8;
        this.blocks = list9;
        this.plusMinus = list10;
        this.pir = list11;
        this.rating = list12;
    }
}
