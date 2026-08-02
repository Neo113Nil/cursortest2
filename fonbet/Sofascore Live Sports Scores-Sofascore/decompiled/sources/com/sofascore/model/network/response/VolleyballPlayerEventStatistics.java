package com.sofascore.model.network.response;

import defpackage.a7a;
import defpackage.fn0;
import defpackage.h75;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QPB\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014B±\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001aJÄ\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\bA\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\bB\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bC\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\bD\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\bE\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bF\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bG\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bH\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\bK\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bL\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bM\u0010\u001aR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bN\u0010\u001aR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bO\u0010\u001a¨\u0006R"}, d2 = {"Lcom/sofascore/model/network/response/VolleyballPlayerEventStatistics;", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "", "pointsTotal", "breakPoints", "winLoss", "blockPoints", "serves", "serveErrors", "aces", "receptionsTotal", "receptionErrors", "", "receptionPositivity", "receptionPerf", "attacksTotal", "attackErrors", "attacksBlocked", "attackPoints", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/lang/Double;", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/network/response/VolleyballPlayerEventStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/VolleyballPlayerEventStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getPointsTotal", "getBreakPoints", "getWinLoss", "getBlockPoints", "getServes", "getServeErrors", "getAces", "getReceptionsTotal", "getReceptionErrors", "Ljava/lang/Double;", "getReceptionPositivity", "getReceptionPerf", "getAttacksTotal", "getAttackErrors", "getAttacksBlocked", "getAttackPoints", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VolleyballPlayerEventStatistics implements PlayerEventStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer aces;

    @Nullable
    private final Integer attackErrors;

    @Nullable
    private final Integer attackPoints;

    @Nullable
    private final Integer attacksBlocked;

    @Nullable
    private final Integer attacksTotal;

    @Nullable
    private final Integer blockPoints;

    @Nullable
    private final Integer breakPoints;

    @Nullable
    private final Integer pointsTotal;

    @Nullable
    private final Integer receptionErrors;

    @Nullable
    private final Double receptionPerf;

    @Nullable
    private final Double receptionPositivity;

    @Nullable
    private final Integer receptionsTotal;

    @Nullable
    private final Integer serveErrors;

    @Nullable
    private final Integer serves;

    @Nullable
    private final Integer winLoss;

    public /* synthetic */ VolleyballPlayerEventStatistics(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Double d, Double d2, Integer num10, Integer num11, Integer num12, Integer num13, t5h t5hVar) {
        if (32767 != (i & 32767)) {
            oea.z(i, 32767, VolleyballPlayerEventStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.pointsTotal = num;
        this.breakPoints = num2;
        this.winLoss = num3;
        this.blockPoints = num4;
        this.serves = num5;
        this.serveErrors = num6;
        this.aces = num7;
        this.receptionsTotal = num8;
        this.receptionErrors = num9;
        this.receptionPositivity = d;
        this.receptionPerf = d2;
        this.attacksTotal = num10;
        this.attackErrors = num11;
        this.attacksBlocked = num12;
        this.attackPoints = num13;
    }

    public static final /* synthetic */ void write$Self$model_release(VolleyballPlayerEventStatistics self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.pointsTotal);
        output.h(serialDesc, 1, a7aVar, self.breakPoints);
        output.h(serialDesc, 2, a7aVar, self.winLoss);
        output.h(serialDesc, 3, a7aVar, self.blockPoints);
        output.h(serialDesc, 4, a7aVar, self.serves);
        output.h(serialDesc, 5, a7aVar, self.serveErrors);
        output.h(serialDesc, 6, a7aVar, self.aces);
        output.h(serialDesc, 7, a7aVar, self.receptionsTotal);
        output.h(serialDesc, 8, a7aVar, self.receptionErrors);
        h75 h75Var = h75.a;
        output.h(serialDesc, 9, h75Var, self.receptionPositivity);
        output.h(serialDesc, 10, h75Var, self.receptionPerf);
        output.h(serialDesc, 11, a7aVar, self.attacksTotal);
        output.h(serialDesc, 12, a7aVar, self.attackErrors);
        output.h(serialDesc, 13, a7aVar, self.attacksBlocked);
        output.h(serialDesc, 14, a7aVar, self.attackPoints);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getPointsTotal() {
        return this.pointsTotal;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getReceptionPositivity() {
        return this.receptionPositivity;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Double getReceptionPerf() {
        return this.receptionPerf;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getAttacksTotal() {
        return this.attacksTotal;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getAttackErrors() {
        return this.attackErrors;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getAttacksBlocked() {
        return this.attacksBlocked;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Integer getAttackPoints() {
        return this.attackPoints;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getBreakPoints() {
        return this.breakPoints;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getWinLoss() {
        return this.winLoss;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getBlockPoints() {
        return this.blockPoints;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getServes() {
        return this.serves;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getServeErrors() {
        return this.serveErrors;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getAces() {
        return this.aces;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getReceptionsTotal() {
        return this.receptionsTotal;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getReceptionErrors() {
        return this.receptionErrors;
    }

    @NotNull
    public final VolleyballPlayerEventStatistics copy(@Nullable Integer pointsTotal, @Nullable Integer breakPoints, @Nullable Integer winLoss, @Nullable Integer blockPoints, @Nullable Integer serves, @Nullable Integer serveErrors, @Nullable Integer aces, @Nullable Integer receptionsTotal, @Nullable Integer receptionErrors, @Nullable Double receptionPositivity, @Nullable Double receptionPerf, @Nullable Integer attacksTotal, @Nullable Integer attackErrors, @Nullable Integer attacksBlocked, @Nullable Integer attackPoints) {
        return new VolleyballPlayerEventStatistics(pointsTotal, breakPoints, winLoss, blockPoints, serves, serveErrors, aces, receptionsTotal, receptionErrors, receptionPositivity, receptionPerf, attacksTotal, attackErrors, attacksBlocked, attackPoints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VolleyballPlayerEventStatistics)) {
            return false;
        }
        VolleyballPlayerEventStatistics volleyballPlayerEventStatistics = (VolleyballPlayerEventStatistics) other;
        return Intrinsics.c(this.pointsTotal, volleyballPlayerEventStatistics.pointsTotal) && Intrinsics.c(this.breakPoints, volleyballPlayerEventStatistics.breakPoints) && Intrinsics.c(this.winLoss, volleyballPlayerEventStatistics.winLoss) && Intrinsics.c(this.blockPoints, volleyballPlayerEventStatistics.blockPoints) && Intrinsics.c(this.serves, volleyballPlayerEventStatistics.serves) && Intrinsics.c(this.serveErrors, volleyballPlayerEventStatistics.serveErrors) && Intrinsics.c(this.aces, volleyballPlayerEventStatistics.aces) && Intrinsics.c(this.receptionsTotal, volleyballPlayerEventStatistics.receptionsTotal) && Intrinsics.c(this.receptionErrors, volleyballPlayerEventStatistics.receptionErrors) && Intrinsics.c(this.receptionPositivity, volleyballPlayerEventStatistics.receptionPositivity) && Intrinsics.c(this.receptionPerf, volleyballPlayerEventStatistics.receptionPerf) && Intrinsics.c(this.attacksTotal, volleyballPlayerEventStatistics.attacksTotal) && Intrinsics.c(this.attackErrors, volleyballPlayerEventStatistics.attackErrors) && Intrinsics.c(this.attacksBlocked, volleyballPlayerEventStatistics.attacksBlocked) && Intrinsics.c(this.attackPoints, volleyballPlayerEventStatistics.attackPoints);
    }

    @Nullable
    public final Integer getAces() {
        return this.aces;
    }

    @Nullable
    public final Integer getAttackErrors() {
        return this.attackErrors;
    }

    @Nullable
    public final Integer getAttackPoints() {
        return this.attackPoints;
    }

    @Nullable
    public final Integer getAttacksBlocked() {
        return this.attacksBlocked;
    }

    @Nullable
    public final Integer getAttacksTotal() {
        return this.attacksTotal;
    }

    @Nullable
    public final Integer getBlockPoints() {
        return this.blockPoints;
    }

    @Nullable
    public final Integer getBreakPoints() {
        return this.breakPoints;
    }

    @Nullable
    public final Integer getPointsTotal() {
        return this.pointsTotal;
    }

    @Override // com.sofascore.model.network.response.PlayerEventStatistics
    @Nullable
    public /* bridge */ Double getRating() {
        return super.getRating();
    }

    @Nullable
    public final Integer getReceptionErrors() {
        return this.receptionErrors;
    }

    @Nullable
    public final Double getReceptionPerf() {
        return this.receptionPerf;
    }

    @Nullable
    public final Double getReceptionPositivity() {
        return this.receptionPositivity;
    }

    @Nullable
    public final Integer getReceptionsTotal() {
        return this.receptionsTotal;
    }

    @Nullable
    public final Integer getServeErrors() {
        return this.serveErrors;
    }

    @Nullable
    public final Integer getServes() {
        return this.serves;
    }

    @Nullable
    public final Integer getWinLoss() {
        return this.winLoss;
    }

    public int hashCode() {
        Integer num = this.pointsTotal;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.breakPoints;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.winLoss;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.blockPoints;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.serves;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.serveErrors;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.aces;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.receptionsTotal;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.receptionErrors;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Double d = this.receptionPositivity;
        int hashCode10 = (hashCode9 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.receptionPerf;
        int hashCode11 = (hashCode10 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num10 = this.attacksTotal;
        int hashCode12 = (hashCode11 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.attackErrors;
        int hashCode13 = (hashCode12 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.attacksBlocked;
        int hashCode14 = (hashCode13 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.attackPoints;
        return hashCode14 + (num13 != null ? num13.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.pointsTotal;
        Integer num2 = this.breakPoints;
        Integer num3 = this.winLoss;
        Integer num4 = this.blockPoints;
        Integer num5 = this.serves;
        Integer num6 = this.serveErrors;
        Integer num7 = this.aces;
        Integer num8 = this.receptionsTotal;
        Integer num9 = this.receptionErrors;
        Double d = this.receptionPositivity;
        Double d2 = this.receptionPerf;
        Integer num10 = this.attacksTotal;
        Integer num11 = this.attackErrors;
        Integer num12 = this.attacksBlocked;
        Integer num13 = this.attackPoints;
        StringBuilder k = wv8.k(num, "VolleyballPlayerEventStatistics(pointsTotal=", ", breakPoints=", ", winLoss=", num2);
        vxd.r(num3, num4, ", blockPoints=", ", serves=", k);
        vxd.r(num5, num6, ", serveErrors=", ", aces=", k);
        vxd.r(num7, num8, ", receptionsTotal=", ", receptionErrors=", k);
        fn0.v(d, num9, ", receptionPositivity=", ", receptionPerf=", k);
        mz1.x(d2, num10, ", attacksTotal=", ", attackErrors=", k);
        vxd.r(num11, num12, ", attacksBlocked=", ", attackPoints=", k);
        return vxd.n(k, num13, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/VolleyballPlayerEventStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/VolleyballPlayerEventStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VolleyballPlayerEventStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VolleyballPlayerEventStatistics(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Double d, @Nullable Double d2, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13) {
        this.pointsTotal = num;
        this.breakPoints = num2;
        this.winLoss = num3;
        this.blockPoints = num4;
        this.serves = num5;
        this.serveErrors = num6;
        this.aces = num7;
        this.receptionsTotal = num8;
        this.receptionErrors = num9;
        this.receptionPositivity = d;
        this.receptionPerf = d2;
        this.attacksTotal = num10;
        this.attackErrors = num11;
        this.attacksBlocked = num12;
        this.attackPoints = num13;
    }
}
