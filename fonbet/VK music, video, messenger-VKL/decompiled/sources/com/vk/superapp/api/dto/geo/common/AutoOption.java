package com.vk.superapp.api.dto.geo.common;

import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.subjects.b;
import xsna.pmi0;
import xsna.uwj;
import xsna.xq;
import xsna.zcl;

/* compiled from: CostingOption.kt */
/* loaded from: classes6.dex */
public final class AutoOption extends uwj {

    @pmi0("use_border_crossing")
    private final float useBorderCrossing;

    @pmi0("use_ferry")
    private final float useFerry;

    @pmi0("use_highways")
    private final float useHighways;

    @pmi0("use_tolls")
    private final float useTolls;

    @pmi0("use_unpaved")
    private final float useUnpaved;

    public AutoOption() {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoOption)) {
            return false;
        }
        AutoOption autoOption = (AutoOption) obj;
        return Float.compare(this.useUnpaved, autoOption.useUnpaved) == 0 && Float.compare(this.useHighways, autoOption.useHighways) == 0 && Float.compare(this.useTolls, autoOption.useTolls) == 0 && Float.compare(this.useFerry, autoOption.useFerry) == 0 && Float.compare(this.useBorderCrossing, autoOption.useBorderCrossing) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.useBorderCrossing) + b.a(this.useFerry, b.a(this.useTolls, b.a(this.useHighways, Float.hashCode(this.useUnpaved) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoOption(useUnpaved=");
        sb.append(this.useUnpaved);
        sb.append(", useHighways=");
        sb.append(this.useHighways);
        sb.append(", useTolls=");
        sb.append(this.useTolls);
        sb.append(", useFerry=");
        sb.append(this.useFerry);
        sb.append(", useBorderCrossing=");
        return xq.c(')', this.useBorderCrossing, sb);
    }

    public /* synthetic */ AutoOption(float f, float f2, float f3, float f4, float f5, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0.5f : f, (i & 2) != 0 ? 1.0f : f2, (i & 4) != 0 ? 0.5f : f3, (i & 8) != 0 ? 0.5f : f4, (i & 16) != 0 ? 1.0f : f5);
    }

    public AutoOption(float f, float f2, float f3, float f4, float f5) {
        super(null);
        this.useUnpaved = f;
        this.useHighways = f2;
        this.useTolls = f3;
        this.useFerry = f4;
        this.useBorderCrossing = f5;
    }
}
