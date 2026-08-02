package com.vk.superapp.api.dto.geo.common;

import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.subjects.b;
import xsna.pmi0;
import xsna.uwj;
import xsna.xq;
import xsna.zcl;

/* compiled from: CostingOption.kt */
/* loaded from: classes6.dex */
public final class PedestrianOption extends uwj {

    @pmi0("use_border_crossing")
    private final float useBorderCrossing;

    @pmi0("use_roads")
    private final float useRoads;

    @pmi0("use_unpaved")
    private final float useUnpaved;

    @pmi0("walking_speed")
    private final float walkingSpeed;

    public PedestrianOption() {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PedestrianOption)) {
            return false;
        }
        PedestrianOption pedestrianOption = (PedestrianOption) obj;
        return Float.compare(this.walkingSpeed, pedestrianOption.walkingSpeed) == 0 && Float.compare(this.useUnpaved, pedestrianOption.useUnpaved) == 0 && Float.compare(this.useRoads, pedestrianOption.useRoads) == 0 && Float.compare(this.useBorderCrossing, pedestrianOption.useBorderCrossing) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.useBorderCrossing) + b.a(this.useRoads, b.a(this.useUnpaved, Float.hashCode(this.walkingSpeed) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PedestrianOption(walkingSpeed=");
        sb.append(this.walkingSpeed);
        sb.append(", useUnpaved=");
        sb.append(this.useUnpaved);
        sb.append(", useRoads=");
        sb.append(this.useRoads);
        sb.append(", useBorderCrossing=");
        return xq.c(')', this.useBorderCrossing, sb);
    }

    public /* synthetic */ PedestrianOption(float f, float f2, float f3, float f4, int i, zcl zclVar) {
        this((i & 1) != 0 ? 5.1f : f, (i & 2) != 0 ? 0.5f : f2, (i & 4) != 0 ? 0.5f : f3, (i & 8) != 0 ? 1.0f : f4);
    }

    public PedestrianOption(float f, float f2, float f3, float f4) {
        super(null);
        this.walkingSpeed = f;
        this.useUnpaved = f2;
        this.useRoads = f3;
        this.useBorderCrossing = f4;
    }
}
