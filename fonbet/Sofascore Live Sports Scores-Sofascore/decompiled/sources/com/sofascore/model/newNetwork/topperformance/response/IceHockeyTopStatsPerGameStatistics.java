package com.sofascore.model.newNetwork.topperformance.response;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 R2\u00020\u0001:\u0002SRB\u0087\u0002\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015B\u009b\u0002\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001cJ\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001cJ°\u0002\u0010,\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bB\u0010\u001cR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bC\u0010\u001cR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bD\u0010\u001cR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bE\u0010\u001cR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bF\u0010\u001cR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bG\u0010\u001cR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bH\u0010\u001cR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bI\u0010\u001cR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bJ\u0010\u001cR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bK\u0010\u001cR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bL\u0010\u001cR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bM\u0010\u001cR\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bN\u0010\u001cR\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bO\u0010\u001cR\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bP\u0010\u001cR\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bQ\u0010\u001c¨\u0006T"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopStatsPerGameStatistics;", "Lcom/sofascore/model/newNetwork/topperformance/response/TopPerformanceStatistics;", "", "Lcom/sofascore/model/newNetwork/topperformance/response/TopStatsItem;", "points", "goals", "assists", "powerPlayGoals", "shortHandedGoals", "powerPlayAssists", "shortHandedAssists", "plusMinus", "secondsPlayed", "blocked", "hits", "penaltyMinutes", "saves", "evenSaves", "powerPlaySaves", "shortHandedSaves", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopStatsPerGameStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopStatsPerGameStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPoints", "getGoals", "getAssists", "getPowerPlayGoals", "getShortHandedGoals", "getPowerPlayAssists", "getShortHandedAssists", "getPlusMinus", "getSecondsPlayed", "getBlocked", "getHits", "getPenaltyMinutes", "getSaves", "getEvenSaves", "getPowerPlaySaves", "getShortHandedSaves", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class IceHockeyTopStatsPerGameStatistics extends TopPerformanceStatistics {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final List<TopStatsItem> assists;

    @Nullable
    private final List<TopStatsItem> blocked;

    @Nullable
    private final List<TopStatsItem> evenSaves;

    @Nullable
    private final List<TopStatsItem> goals;

    @Nullable
    private final List<TopStatsItem> hits;

    @Nullable
    private final List<TopStatsItem> penaltyMinutes;

    @Nullable
    private final List<TopStatsItem> plusMinus;

    @Nullable
    private final List<TopStatsItem> points;

    @Nullable
    private final List<TopStatsItem> powerPlayAssists;

    @Nullable
    private final List<TopStatsItem> powerPlayGoals;

    @Nullable
    private final List<TopStatsItem> powerPlaySaves;

    @Nullable
    private final List<TopStatsItem> saves;

    @Nullable
    private final List<TopStatsItem> secondsPlayed;

    @Nullable
    private final List<TopStatsItem> shortHandedAssists;

    @Nullable
    private final List<TopStatsItem> shortHandedGoals;

    @Nullable
    private final List<TopStatsItem> shortHandedSaves;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new gq9(3)), ypa.a(ysaVar, new gq9(16)), ypa.a(ysaVar, new gq9(17)), ypa.a(ysaVar, new gq9(18)), ypa.a(ysaVar, new gq9(4)), ypa.a(ysaVar, new gq9(5)), ypa.a(ysaVar, new gq9(6)), ypa.a(ysaVar, new gq9(7)), ypa.a(ysaVar, new gq9(8)), ypa.a(ysaVar, new gq9(9)), ypa.a(ysaVar, new gq9(10)), ypa.a(ysaVar, new gq9(11)), ypa.a(ysaVar, new gq9(12)), ypa.a(ysaVar, new gq9(13)), ypa.a(ysaVar, new gq9(14)), ypa.a(ysaVar, new gq9(15))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IceHockeyTopStatsPerGameStatistics(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, t5h t5hVar) {
        super(i, t5hVar);
        if (65535 != (i & 65535)) {
            oea.z(i, 65535, IceHockeyTopStatsPerGameStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = list;
        this.goals = list2;
        this.assists = list3;
        this.powerPlayGoals = list4;
        this.shortHandedGoals = list5;
        this.powerPlayAssists = list6;
        this.shortHandedAssists = list7;
        this.plusMinus = list8;
        this.secondsPlayed = list9;
        this.blocked = list10;
        this.hits = list11;
        this.penaltyMinutes = list12;
        this.saves = list13;
        this.evenSaves = list14;
        this.powerPlaySaves = list15;
        this.shortHandedSaves = list16;
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
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$11() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$12() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$13() {
        return new xg0(TopStatsItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$14() {
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

    public static final /* synthetic */ void write$Self$model_release(IceHockeyTopStatsPerGameStatistics self, wf3 output, SerialDescriptor serialDesc) {
        TopPerformanceStatistics.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.points);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.goals);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.assists);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.powerPlayGoals);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.shortHandedGoals);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.powerPlayAssists);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.shortHandedAssists);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.plusMinus);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.secondsPlayed);
        output.h(serialDesc, 9, (KSerializer) joaVarArr[9].getValue(), self.blocked);
        output.h(serialDesc, 10, (KSerializer) joaVarArr[10].getValue(), self.hits);
        output.h(serialDesc, 11, (KSerializer) joaVarArr[11].getValue(), self.penaltyMinutes);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.saves);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.evenSaves);
        output.h(serialDesc, 14, (KSerializer) joaVarArr[14].getValue(), self.powerPlaySaves);
        output.h(serialDesc, 15, (KSerializer) joaVarArr[15].getValue(), self.shortHandedSaves);
    }

    @Nullable
    public final List<TopStatsItem> component1() {
        return this.points;
    }

    @Nullable
    public final List<TopStatsItem> component10() {
        return this.blocked;
    }

    @Nullable
    public final List<TopStatsItem> component11() {
        return this.hits;
    }

    @Nullable
    public final List<TopStatsItem> component12() {
        return this.penaltyMinutes;
    }

    @Nullable
    public final List<TopStatsItem> component13() {
        return this.saves;
    }

    @Nullable
    public final List<TopStatsItem> component14() {
        return this.evenSaves;
    }

    @Nullable
    public final List<TopStatsItem> component15() {
        return this.powerPlaySaves;
    }

    @Nullable
    public final List<TopStatsItem> component16() {
        return this.shortHandedSaves;
    }

    @Nullable
    public final List<TopStatsItem> component2() {
        return this.goals;
    }

    @Nullable
    public final List<TopStatsItem> component3() {
        return this.assists;
    }

    @Nullable
    public final List<TopStatsItem> component4() {
        return this.powerPlayGoals;
    }

    @Nullable
    public final List<TopStatsItem> component5() {
        return this.shortHandedGoals;
    }

    @Nullable
    public final List<TopStatsItem> component6() {
        return this.powerPlayAssists;
    }

    @Nullable
    public final List<TopStatsItem> component7() {
        return this.shortHandedAssists;
    }

    @Nullable
    public final List<TopStatsItem> component8() {
        return this.plusMinus;
    }

    @Nullable
    public final List<TopStatsItem> component9() {
        return this.secondsPlayed;
    }

    @NotNull
    public final IceHockeyTopStatsPerGameStatistics copy(@Nullable List<TopStatsItem> points, @Nullable List<TopStatsItem> goals, @Nullable List<TopStatsItem> assists, @Nullable List<TopStatsItem> powerPlayGoals, @Nullable List<TopStatsItem> shortHandedGoals, @Nullable List<TopStatsItem> powerPlayAssists, @Nullable List<TopStatsItem> shortHandedAssists, @Nullable List<TopStatsItem> plusMinus, @Nullable List<TopStatsItem> secondsPlayed, @Nullable List<TopStatsItem> blocked, @Nullable List<TopStatsItem> hits, @Nullable List<TopStatsItem> penaltyMinutes, @Nullable List<TopStatsItem> saves, @Nullable List<TopStatsItem> evenSaves, @Nullable List<TopStatsItem> powerPlaySaves, @Nullable List<TopStatsItem> shortHandedSaves) {
        return new IceHockeyTopStatsPerGameStatistics(points, goals, assists, powerPlayGoals, shortHandedGoals, powerPlayAssists, shortHandedAssists, plusMinus, secondsPlayed, blocked, hits, penaltyMinutes, saves, evenSaves, powerPlaySaves, shortHandedSaves);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IceHockeyTopStatsPerGameStatistics)) {
            return false;
        }
        IceHockeyTopStatsPerGameStatistics iceHockeyTopStatsPerGameStatistics = (IceHockeyTopStatsPerGameStatistics) other;
        return Intrinsics.c(this.points, iceHockeyTopStatsPerGameStatistics.points) && Intrinsics.c(this.goals, iceHockeyTopStatsPerGameStatistics.goals) && Intrinsics.c(this.assists, iceHockeyTopStatsPerGameStatistics.assists) && Intrinsics.c(this.powerPlayGoals, iceHockeyTopStatsPerGameStatistics.powerPlayGoals) && Intrinsics.c(this.shortHandedGoals, iceHockeyTopStatsPerGameStatistics.shortHandedGoals) && Intrinsics.c(this.powerPlayAssists, iceHockeyTopStatsPerGameStatistics.powerPlayAssists) && Intrinsics.c(this.shortHandedAssists, iceHockeyTopStatsPerGameStatistics.shortHandedAssists) && Intrinsics.c(this.plusMinus, iceHockeyTopStatsPerGameStatistics.plusMinus) && Intrinsics.c(this.secondsPlayed, iceHockeyTopStatsPerGameStatistics.secondsPlayed) && Intrinsics.c(this.blocked, iceHockeyTopStatsPerGameStatistics.blocked) && Intrinsics.c(this.hits, iceHockeyTopStatsPerGameStatistics.hits) && Intrinsics.c(this.penaltyMinutes, iceHockeyTopStatsPerGameStatistics.penaltyMinutes) && Intrinsics.c(this.saves, iceHockeyTopStatsPerGameStatistics.saves) && Intrinsics.c(this.evenSaves, iceHockeyTopStatsPerGameStatistics.evenSaves) && Intrinsics.c(this.powerPlaySaves, iceHockeyTopStatsPerGameStatistics.powerPlaySaves) && Intrinsics.c(this.shortHandedSaves, iceHockeyTopStatsPerGameStatistics.shortHandedSaves);
    }

    @Nullable
    public final List<TopStatsItem> getAssists() {
        return this.assists;
    }

    @Nullable
    public final List<TopStatsItem> getBlocked() {
        return this.blocked;
    }

    @Nullable
    public final List<TopStatsItem> getEvenSaves() {
        return this.evenSaves;
    }

    @Nullable
    public final List<TopStatsItem> getGoals() {
        return this.goals;
    }

    @Nullable
    public final List<TopStatsItem> getHits() {
        return this.hits;
    }

    @Nullable
    public final List<TopStatsItem> getPenaltyMinutes() {
        return this.penaltyMinutes;
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
    public final List<TopStatsItem> getPowerPlayAssists() {
        return this.powerPlayAssists;
    }

    @Nullable
    public final List<TopStatsItem> getPowerPlayGoals() {
        return this.powerPlayGoals;
    }

    @Nullable
    public final List<TopStatsItem> getPowerPlaySaves() {
        return this.powerPlaySaves;
    }

    @Nullable
    public final List<TopStatsItem> getSaves() {
        return this.saves;
    }

    @Nullable
    public final List<TopStatsItem> getSecondsPlayed() {
        return this.secondsPlayed;
    }

    @Nullable
    public final List<TopStatsItem> getShortHandedAssists() {
        return this.shortHandedAssists;
    }

    @Nullable
    public final List<TopStatsItem> getShortHandedGoals() {
        return this.shortHandedGoals;
    }

    @Nullable
    public final List<TopStatsItem> getShortHandedSaves() {
        return this.shortHandedSaves;
    }

    public int hashCode() {
        List<TopStatsItem> list = this.points;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TopStatsItem> list2 = this.goals;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<TopStatsItem> list3 = this.assists;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<TopStatsItem> list4 = this.powerPlayGoals;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<TopStatsItem> list5 = this.shortHandedGoals;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<TopStatsItem> list6 = this.powerPlayAssists;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<TopStatsItem> list7 = this.shortHandedAssists;
        int hashCode7 = (hashCode6 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<TopStatsItem> list8 = this.plusMinus;
        int hashCode8 = (hashCode7 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<TopStatsItem> list9 = this.secondsPlayed;
        int hashCode9 = (hashCode8 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<TopStatsItem> list10 = this.blocked;
        int hashCode10 = (hashCode9 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<TopStatsItem> list11 = this.hits;
        int hashCode11 = (hashCode10 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<TopStatsItem> list12 = this.penaltyMinutes;
        int hashCode12 = (hashCode11 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<TopStatsItem> list13 = this.saves;
        int hashCode13 = (hashCode12 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<TopStatsItem> list14 = this.evenSaves;
        int hashCode14 = (hashCode13 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<TopStatsItem> list15 = this.powerPlaySaves;
        int hashCode15 = (hashCode14 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<TopStatsItem> list16 = this.shortHandedSaves;
        return hashCode15 + (list16 != null ? list16.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TopStatsItem> list = this.points;
        List<TopStatsItem> list2 = this.goals;
        List<TopStatsItem> list3 = this.assists;
        List<TopStatsItem> list4 = this.powerPlayGoals;
        List<TopStatsItem> list5 = this.shortHandedGoals;
        List<TopStatsItem> list6 = this.powerPlayAssists;
        List<TopStatsItem> list7 = this.shortHandedAssists;
        List<TopStatsItem> list8 = this.plusMinus;
        List<TopStatsItem> list9 = this.secondsPlayed;
        List<TopStatsItem> list10 = this.blocked;
        List<TopStatsItem> list11 = this.hits;
        List<TopStatsItem> list12 = this.penaltyMinutes;
        List<TopStatsItem> list13 = this.saves;
        List<TopStatsItem> list14 = this.evenSaves;
        List<TopStatsItem> list15 = this.powerPlaySaves;
        List<TopStatsItem> list16 = this.shortHandedSaves;
        StringBuilder s = fc6.s("IceHockeyTopStatsPerGameStatistics(points=", ", goals=", ", assists=", list, list2);
        vxd.w(s, list3, ", powerPlayGoals=", list4, ", shortHandedGoals=");
        vxd.w(s, list5, ", powerPlayAssists=", list6, ", shortHandedAssists=");
        vxd.w(s, list7, ", plusMinus=", list8, ", secondsPlayed=");
        vxd.w(s, list9, ", blocked=", list10, ", hits=");
        vxd.w(s, list11, ", penaltyMinutes=", list12, ", saves=");
        vxd.w(s, list13, ", evenSaves=", list14, ", powerPlaySaves=");
        return me4.j(s, list15, ", shortHandedSaves=", list16, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopStatsPerGameStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/response/IceHockeyTopStatsPerGameStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return IceHockeyTopStatsPerGameStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public IceHockeyTopStatsPerGameStatistics(@Nullable List<TopStatsItem> list, @Nullable List<TopStatsItem> list2, @Nullable List<TopStatsItem> list3, @Nullable List<TopStatsItem> list4, @Nullable List<TopStatsItem> list5, @Nullable List<TopStatsItem> list6, @Nullable List<TopStatsItem> list7, @Nullable List<TopStatsItem> list8, @Nullable List<TopStatsItem> list9, @Nullable List<TopStatsItem> list10, @Nullable List<TopStatsItem> list11, @Nullable List<TopStatsItem> list12, @Nullable List<TopStatsItem> list13, @Nullable List<TopStatsItem> list14, @Nullable List<TopStatsItem> list15, @Nullable List<TopStatsItem> list16) {
        super(null);
        this.points = list;
        this.goals = list2;
        this.assists = list3;
        this.powerPlayGoals = list4;
        this.shortHandedGoals = list5;
        this.powerPlayAssists = list6;
        this.shortHandedAssists = list7;
        this.plusMinus = list8;
        this.secondsPlayed = list9;
        this.blocked = list10;
        this.hits = list11;
        this.penaltyMinutes = list12;
        this.saves = list13;
        this.evenSaves = list14;
        this.powerPlaySaves = list15;
        this.shortHandedSaves = list16;
    }
}
