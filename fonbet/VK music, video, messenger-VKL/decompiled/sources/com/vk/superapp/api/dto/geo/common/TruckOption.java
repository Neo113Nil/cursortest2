package com.vk.superapp.api.dto.geo.common;

import io.reactivex.rxjava3.subjects.b;
import xsna.pmi0;
import xsna.uwj;
import xsna.xq;
import xsna.zcl;

/* compiled from: CostingOption.kt */
/* loaded from: classes6.dex */
public final class TruckOption extends uwj {

    @pmi0("max_weight")
    private final float maxWeight;

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

    public /* synthetic */ TruckOption(float f, float f2, float f3, float f4, float f5, float f6, int i, zcl zclVar) {
        this(f, (i & 2) != 0 ? 0.5f : f2, (i & 4) != 0 ? 1.0f : f3, (i & 8) != 0 ? 0.5f : f4, (i & 16) != 0 ? 0.5f : f5, (i & 32) != 0 ? 1.0f : f6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TruckOption)) {
            return false;
        }
        TruckOption truckOption = (TruckOption) obj;
        return Float.compare(this.maxWeight, truckOption.maxWeight) == 0 && Float.compare(this.useUnpaved, truckOption.useUnpaved) == 0 && Float.compare(this.useHighways, truckOption.useHighways) == 0 && Float.compare(this.useTolls, truckOption.useTolls) == 0 && Float.compare(this.useFerry, truckOption.useFerry) == 0 && Float.compare(this.useBorderCrossing, truckOption.useBorderCrossing) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.useBorderCrossing) + b.a(this.useFerry, b.a(this.useTolls, b.a(this.useHighways, b.a(this.useUnpaved, Float.hashCode(this.maxWeight) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TruckOption(maxWeight=");
        sb.append(this.maxWeight);
        sb.append(", useUnpaved=");
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

    public TruckOption(float f, float f2, float f3, float f4, float f5, float f6) {
        super(null);
        this.maxWeight = f;
        this.useUnpaved = f2;
        this.useHighways = f3;
        this.useTolls = f4;
        this.useFerry = f5;
        this.useBorderCrossing = f6;
    }
}
