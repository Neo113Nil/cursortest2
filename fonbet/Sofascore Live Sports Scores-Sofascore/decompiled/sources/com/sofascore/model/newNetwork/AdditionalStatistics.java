package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u007f\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0088\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b<\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b=\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b>\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b?\u0010\u001e¨\u0006B"}, d2 = {"Lcom/sofascore/model/newNetwork/AdditionalStatistics;", "", "", "points", "assists", "rebounds", "steals", "blocks", "", CampaignEx.JSON_KEY_STAR, "pointsTotal", "attackPoints", "blockPoints", "aces", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/AdditionalStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Double;", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/AdditionalStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getPoints", "getAssists", "getRebounds", "getSteals", "getBlocks", "Ljava/lang/Double;", "getRating", "getPointsTotal", "getAttackPoints", "getBlockPoints", "getAces", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AdditionalStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer aces;

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer attackPoints;

    @Nullable
    private final Integer blockPoints;

    @Nullable
    private final Integer blocks;

    @Nullable
    private final Integer points;

    @Nullable
    private final Integer pointsTotal;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer rebounds;

    @Nullable
    private final Integer steals;

    public /* synthetic */ AdditionalStatistics(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Double d, Integer num6, Integer num7, Integer num8, Integer num9, t5h t5hVar) {
        if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
            oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, AdditionalStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = num;
        this.assists = num2;
        this.rebounds = num3;
        this.steals = num4;
        this.blocks = num5;
        this.rating = d;
        this.pointsTotal = num6;
        this.attackPoints = num7;
        this.blockPoints = num8;
        this.aces = num9;
    }

    public static /* synthetic */ AdditionalStatistics copy$default(AdditionalStatistics additionalStatistics, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Double d, Integer num6, Integer num7, Integer num8, Integer num9, int i, Object obj) {
        if ((i & 1) != 0) {
            num = additionalStatistics.points;
        }
        if ((i & 2) != 0) {
            num2 = additionalStatistics.assists;
        }
        if ((i & 4) != 0) {
            num3 = additionalStatistics.rebounds;
        }
        if ((i & 8) != 0) {
            num4 = additionalStatistics.steals;
        }
        if ((i & 16) != 0) {
            num5 = additionalStatistics.blocks;
        }
        if ((i & 32) != 0) {
            d = additionalStatistics.rating;
        }
        if ((i & 64) != 0) {
            num6 = additionalStatistics.pointsTotal;
        }
        if ((i & 128) != 0) {
            num7 = additionalStatistics.attackPoints;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            num8 = additionalStatistics.blockPoints;
        }
        if ((i & 512) != 0) {
            num9 = additionalStatistics.aces;
        }
        Integer num10 = num8;
        Integer num11 = num9;
        Integer num12 = num6;
        Integer num13 = num7;
        Integer num14 = num5;
        Double d2 = d;
        return additionalStatistics.copy(num, num2, num3, num4, num14, d2, num12, num13, num10, num11);
    }

    public static final /* synthetic */ void write$Self$model_release(AdditionalStatistics self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.points);
        output.h(serialDesc, 1, a7aVar, self.assists);
        output.h(serialDesc, 2, a7aVar, self.rebounds);
        output.h(serialDesc, 3, a7aVar, self.steals);
        output.h(serialDesc, 4, a7aVar, self.blocks);
        output.h(serialDesc, 5, h75.a, self.rating);
        output.h(serialDesc, 6, a7aVar, self.pointsTotal);
        output.h(serialDesc, 7, a7aVar, self.attackPoints);
        output.h(serialDesc, 8, a7aVar, self.blockPoints);
        output.h(serialDesc, 9, a7aVar, self.aces);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getAces() {
        return this.aces;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getRebounds() {
        return this.rebounds;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getBlocks() {
        return this.blocks;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getPointsTotal() {
        return this.pointsTotal;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getAttackPoints() {
        return this.attackPoints;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getBlockPoints() {
        return this.blockPoints;
    }

    @NotNull
    public final AdditionalStatistics copy(@Nullable Integer points, @Nullable Integer assists, @Nullable Integer rebounds, @Nullable Integer steals, @Nullable Integer blocks, @Nullable Double rating, @Nullable Integer pointsTotal, @Nullable Integer attackPoints, @Nullable Integer blockPoints, @Nullable Integer aces) {
        return new AdditionalStatistics(points, assists, rebounds, steals, blocks, rating, pointsTotal, attackPoints, blockPoints, aces);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalStatistics)) {
            return false;
        }
        AdditionalStatistics additionalStatistics = (AdditionalStatistics) other;
        return Intrinsics.c(this.points, additionalStatistics.points) && Intrinsics.c(this.assists, additionalStatistics.assists) && Intrinsics.c(this.rebounds, additionalStatistics.rebounds) && Intrinsics.c(this.steals, additionalStatistics.steals) && Intrinsics.c(this.blocks, additionalStatistics.blocks) && Intrinsics.c(this.rating, additionalStatistics.rating) && Intrinsics.c(this.pointsTotal, additionalStatistics.pointsTotal) && Intrinsics.c(this.attackPoints, additionalStatistics.attackPoints) && Intrinsics.c(this.blockPoints, additionalStatistics.blockPoints) && Intrinsics.c(this.aces, additionalStatistics.aces);
    }

    @Nullable
    public final Integer getAces() {
        return this.aces;
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final Integer getAttackPoints() {
        return this.attackPoints;
    }

    @Nullable
    public final Integer getBlockPoints() {
        return this.blockPoints;
    }

    @Nullable
    public final Integer getBlocks() {
        return this.blocks;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPointsTotal() {
        return this.pointsTotal;
    }

    @Nullable
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getRebounds() {
        return this.rebounds;
    }

    @Nullable
    public final Integer getSteals() {
        return this.steals;
    }

    public int hashCode() {
        Integer num = this.points;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.assists;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rebounds;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.steals;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.blocks;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d = this.rating;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num6 = this.pointsTotal;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.attackPoints;
        int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.blockPoints;
        int hashCode9 = (hashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.aces;
        return hashCode9 + (num9 != null ? num9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.points;
        Integer num2 = this.assists;
        Integer num3 = this.rebounds;
        Integer num4 = this.steals;
        Integer num5 = this.blocks;
        Double d = this.rating;
        Integer num6 = this.pointsTotal;
        Integer num7 = this.attackPoints;
        Integer num8 = this.blockPoints;
        Integer num9 = this.aces;
        StringBuilder k = wv8.k(num, "AdditionalStatistics(points=", ", assists=", ", rebounds=", num2);
        vxd.r(num3, num4, ", steals=", ", blocks=", k);
        fn0.v(d, num5, ", rating=", ", pointsTotal=", k);
        vxd.r(num6, num7, ", attackPoints=", ", blockPoints=", k);
        return fc6.l(num8, num9, ", aces=", ")", k);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/AdditionalStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/AdditionalStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AdditionalStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AdditionalStatistics(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Double d, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9) {
        this.points = num;
        this.assists = num2;
        this.rebounds = num3;
        this.steals = num4;
        this.blocks = num5;
        this.rating = d;
        this.pointsTotal = num6;
        this.attackPoints = num7;
        this.blockPoints = num8;
        this.aces = num9;
    }
}
