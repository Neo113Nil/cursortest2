package com.vk.superapp.api.dto.geo.common;

import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.subjects.b;
import xsna.pmi0;
import xsna.uwj;
import xsna.xq;
import xsna.zcl;

/* compiled from: CostingOption.kt */
/* loaded from: classes6.dex */
public final class BicycleOption extends uwj {

    @pmi0("cycling_speed")
    private final float cyclingSpeed;

    @pmi0("use_border_crossing")
    private final float useBorderCrossing;

    @pmi0("use_ferry")
    private final float useFerry;

    @pmi0("use_roads")
    private final float useRoads;

    @pmi0("use_unpaved")
    private final float useUnpaved;

    public BicycleOption() {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BicycleOption)) {
            return false;
        }
        BicycleOption bicycleOption = (BicycleOption) obj;
        return Float.compare(this.cyclingSpeed, bicycleOption.cyclingSpeed) == 0 && Float.compare(this.useFerry, bicycleOption.useFerry) == 0 && Float.compare(this.useUnpaved, bicycleOption.useUnpaved) == 0 && Float.compare(this.useRoads, bicycleOption.useRoads) == 0 && Float.compare(this.useBorderCrossing, bicycleOption.useBorderCrossing) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.useBorderCrossing) + b.a(this.useRoads, b.a(this.useUnpaved, b.a(this.useFerry, Float.hashCode(this.cyclingSpeed) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BicycleOption(cyclingSpeed=");
        sb.append(this.cyclingSpeed);
        sb.append(", useFerry=");
        sb.append(this.useFerry);
        sb.append(", useUnpaved=");
        sb.append(this.useUnpaved);
        sb.append(", useRoads=");
        sb.append(this.useRoads);
        sb.append(", useBorderCrossing=");
        return xq.c(')', this.useBorderCrossing, sb);
    }

    public /* synthetic */ BicycleOption(float f, float f2, float f3, float f4, float f5, int i, zcl zclVar) {
        this((i & 1) != 0 ? 20.0f : f, (i & 2) != 0 ? 0.5f : f2, (i & 4) != 0 ? 0.5f : f3, (i & 8) != 0 ? 0.5f : f4, (i & 16) != 0 ? 1.0f : f5);
    }

    public BicycleOption(float f, float f2, float f3, float f4, float f5) {
        super(null);
        this.cyclingSpeed = f;
        this.useFerry = f2;
        this.useUnpaved = f3;
        this.useRoads = f4;
        this.useBorderCrossing = f5;
    }
}
