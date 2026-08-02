package com.sofascore.model.newNetwork.topperformance.topPlayers.items;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0002POB\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014B¥\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001cJ´\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b-\u0010\u001eJ\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001aJ\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bE\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bF\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bG\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bH\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\bI\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bJ\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bK\u0010\u001cR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bL\u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bM\u0010\u001cR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bN\u0010\u001c¨\u0006Q"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/VolleyballTopPlayersStatisticsItem;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseTopPlayersStatisticsItem;", "", "id", "appearances", "", "type", "", CampaignEx.JSON_KEY_STAR, "pointsTotal", "aces", "serveEfficiency", "blockPoints", "attackPoints", "attacksEfficiency", "attackErrors", "serveErrors", "receptionErrors", "attacksBlocked", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/VolleyballTopPlayersStatisticsItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/VolleyballTopPlayersStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "Ljava/lang/Integer;", "getAppearances", "Ljava/lang/String;", "getType", "Ljava/lang/Double;", "getRating", "getPointsTotal", "getAces", "getServeEfficiency", "getBlockPoints", "getAttackPoints", "getAttacksEfficiency", "getAttackErrors", "getServeErrors", "getReceptionErrors", "getAttacksBlocked", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VolleyballTopPlayersStatisticsItem extends BaseTopPlayersStatisticsItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer aces;

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Integer attackErrors;

    @Nullable
    private final Integer attackPoints;

    @Nullable
    private final Integer attacksBlocked;

    @Nullable
    private final Double attacksEfficiency;

    @Nullable
    private final Integer blockPoints;
    private final int id;

    @Nullable
    private final Integer pointsTotal;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer receptionErrors;

    @Nullable
    private final Double serveEfficiency;

    @Nullable
    private final Integer serveErrors;

    @NotNull
    private final String type;

    public /* synthetic */ VolleyballTopPlayersStatisticsItem(int i, int i2, Integer num, String str, Double d, Integer num2, Integer num3, Double d2, Integer num4, Integer num5, Double d3, Integer num6, Integer num7, Integer num8, Integer num9, t5h t5hVar) {
        if (16375 != (i & 16375)) {
            oea.z(i, 16375, VolleyballTopPlayersStatisticsItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.appearances = num;
        this.type = str;
        if ((i & 8) == 0) {
            this.rating = null;
        } else {
            this.rating = d;
        }
        this.pointsTotal = num2;
        this.aces = num3;
        this.serveEfficiency = d2;
        this.blockPoints = num4;
        this.attackPoints = num5;
        this.attacksEfficiency = d3;
        this.attackErrors = num6;
        this.serveErrors = num7;
        this.receptionErrors = num8;
        this.attacksBlocked = num9;
    }

    public static final /* synthetic */ void write$Self$model_release(VolleyballTopPlayersStatisticsItem self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.getId(), serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.getAppearances());
        output.y(serialDesc, 2, self.getType());
        if (output.o(serialDesc) || self.getRating() != null) {
            output.h(serialDesc, 3, h75.a, self.getRating());
        }
        output.h(serialDesc, 4, a7aVar, self.pointsTotal);
        output.h(serialDesc, 5, a7aVar, self.aces);
        h75 h75Var = h75.a;
        output.h(serialDesc, 6, h75Var, self.serveEfficiency);
        output.h(serialDesc, 7, a7aVar, self.blockPoints);
        output.h(serialDesc, 8, a7aVar, self.attackPoints);
        output.h(serialDesc, 9, h75Var, self.attacksEfficiency);
        output.h(serialDesc, 10, a7aVar, self.attackErrors);
        output.h(serialDesc, 11, a7aVar, self.serveErrors);
        output.h(serialDesc, 12, a7aVar, self.receptionErrors);
        output.h(serialDesc, 13, a7aVar, self.attacksBlocked);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Double getAttacksEfficiency() {
        return this.attacksEfficiency;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getAttackErrors() {
        return this.attackErrors;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getServeErrors() {
        return this.serveErrors;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getReceptionErrors() {
        return this.receptionErrors;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getAttacksBlocked() {
        return this.attacksBlocked;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getPointsTotal() {
        return this.pointsTotal;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getAces() {
        return this.aces;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getServeEfficiency() {
        return this.serveEfficiency;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getBlockPoints() {
        return this.blockPoints;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getAttackPoints() {
        return this.attackPoints;
    }

    @NotNull
    public final VolleyballTopPlayersStatisticsItem copy(int id, @Nullable Integer appearances, @NotNull String type, @Nullable Double rating, @Nullable Integer pointsTotal, @Nullable Integer aces, @Nullable Double serveEfficiency, @Nullable Integer blockPoints, @Nullable Integer attackPoints, @Nullable Double attacksEfficiency, @Nullable Integer attackErrors, @Nullable Integer serveErrors, @Nullable Integer receptionErrors, @Nullable Integer attacksBlocked) {
        type.getClass();
        return new VolleyballTopPlayersStatisticsItem(id, appearances, type, rating, pointsTotal, aces, serveEfficiency, blockPoints, attackPoints, attacksEfficiency, attackErrors, serveErrors, receptionErrors, attacksBlocked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VolleyballTopPlayersStatisticsItem)) {
            return false;
        }
        VolleyballTopPlayersStatisticsItem volleyballTopPlayersStatisticsItem = (VolleyballTopPlayersStatisticsItem) other;
        return this.id == volleyballTopPlayersStatisticsItem.id && Intrinsics.c(this.appearances, volleyballTopPlayersStatisticsItem.appearances) && Intrinsics.c(this.type, volleyballTopPlayersStatisticsItem.type) && Intrinsics.c(this.rating, volleyballTopPlayersStatisticsItem.rating) && Intrinsics.c(this.pointsTotal, volleyballTopPlayersStatisticsItem.pointsTotal) && Intrinsics.c(this.aces, volleyballTopPlayersStatisticsItem.aces) && Intrinsics.c(this.serveEfficiency, volleyballTopPlayersStatisticsItem.serveEfficiency) && Intrinsics.c(this.blockPoints, volleyballTopPlayersStatisticsItem.blockPoints) && Intrinsics.c(this.attackPoints, volleyballTopPlayersStatisticsItem.attackPoints) && Intrinsics.c(this.attacksEfficiency, volleyballTopPlayersStatisticsItem.attacksEfficiency) && Intrinsics.c(this.attackErrors, volleyballTopPlayersStatisticsItem.attackErrors) && Intrinsics.c(this.serveErrors, volleyballTopPlayersStatisticsItem.serveErrors) && Intrinsics.c(this.receptionErrors, volleyballTopPlayersStatisticsItem.receptionErrors) && Intrinsics.c(this.attacksBlocked, volleyballTopPlayersStatisticsItem.attacksBlocked);
    }

    @Nullable
    public final Integer getAces() {
        return this.aces;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @Nullable
    public Integer getAppearances() {
        return this.appearances;
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
    public final Double getAttacksEfficiency() {
        return this.attacksEfficiency;
    }

    @Nullable
    public final Integer getBlockPoints() {
        return this.blockPoints;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    public int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getPointsTotal() {
        return this.pointsTotal;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @Nullable
    public Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getReceptionErrors() {
        return this.receptionErrors;
    }

    @Nullable
    public final Double getServeEfficiency() {
        return this.serveEfficiency;
    }

    @Nullable
    public final Integer getServeErrors() {
        return this.serveErrors;
    }

    @Override // com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseTopPlayersStatisticsItem
    @NotNull
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.appearances;
        int c = dmi.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.type);
        Double d = this.rating;
        int hashCode2 = (c + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.pointsTotal;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.aces;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d2 = this.serveEfficiency;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num4 = this.blockPoints;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.attackPoints;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d3 = this.attacksEfficiency;
        int hashCode8 = (hashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num6 = this.attackErrors;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.serveErrors;
        int hashCode10 = (hashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.receptionErrors;
        int hashCode11 = (hashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.attacksBlocked;
        return hashCode11 + (num9 != null ? num9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        Integer num = this.appearances;
        String str = this.type;
        Double d = this.rating;
        Integer num2 = this.pointsTotal;
        Integer num3 = this.aces;
        Double d2 = this.serveEfficiency;
        Integer num4 = this.blockPoints;
        Integer num5 = this.attackPoints;
        Double d3 = this.attacksEfficiency;
        Integer num6 = this.attackErrors;
        Integer num7 = this.serveErrors;
        Integer num8 = this.receptionErrors;
        Integer num9 = this.attacksBlocked;
        StringBuilder r = fc6.r("VolleyballTopPlayersStatisticsItem(id=", ", appearances=", ", type=", num, i);
        r.append(str);
        r.append(", rating=");
        r.append(d);
        r.append(", pointsTotal=");
        vxd.r(num2, num3, ", aces=", ", serveEfficiency=", r);
        mz1.x(d2, num4, ", blockPoints=", ", attackPoints=", r);
        fn0.v(d3, num5, ", attacksEfficiency=", ", attackErrors=", r);
        vxd.r(num6, num7, ", serveErrors=", ", receptionErrors=", r);
        return fc6.l(num8, num9, ", attacksBlocked=", ")", r);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/VolleyballTopPlayersStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/VolleyballTopPlayersStatisticsItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VolleyballTopPlayersStatisticsItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VolleyballTopPlayersStatisticsItem(int i, @Nullable Integer num, @NotNull String str, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Double d2, @Nullable Integer num4, @Nullable Integer num5, @Nullable Double d3, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9) {
        str.getClass();
        this.id = i;
        this.appearances = num;
        this.type = str;
        this.rating = d;
        this.pointsTotal = num2;
        this.aces = num3;
        this.serveEfficiency = d2;
        this.blockPoints = num4;
        this.attackPoints = num5;
        this.attacksEfficiency = d3;
        this.attackErrors = num6;
        this.serveErrors = num7;
        this.receptionErrors = num8;
        this.attacksBlocked = num9;
    }

    public /* synthetic */ VolleyballTopPlayersStatisticsItem(int i, Integer num, String str, Double d, Integer num2, Integer num3, Double d2, Integer num4, Integer num5, Double d3, Integer num6, Integer num7, Integer num8, Integer num9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, str, (i2 & 8) != 0 ? null : d, num2, num3, d2, num4, num5, d3, num6, num7, num8, num9);
    }
}
