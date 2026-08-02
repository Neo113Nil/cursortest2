package com.vk.superapp.api.dto.geo.common;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CostingOptions.kt */
/* loaded from: classes6.dex */
public final class CostingOptions {

    @pmi0("auto")
    private final AutoOption auto;

    @pmi0("bicycle")
    private final BicycleOption bicycle;

    @pmi0("pedestrian")
    private final PedestrianOption pedestrian;

    @pmi0("taxt")
    private final TaxiOption taxi;

    @pmi0("truck")
    private final TruckOption truck;

    public CostingOptions() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CostingOptions)) {
            return false;
        }
        CostingOptions costingOptions = (CostingOptions) obj;
        return epx.f(this.auto, costingOptions.auto) && epx.f(this.truck, costingOptions.truck) && epx.f(this.pedestrian, costingOptions.pedestrian) && epx.f(this.bicycle, costingOptions.bicycle) && epx.f(this.taxi, costingOptions.taxi);
    }

    public final int hashCode() {
        AutoOption autoOption = this.auto;
        int hashCode = (autoOption == null ? 0 : autoOption.hashCode()) * 31;
        TruckOption truckOption = this.truck;
        int hashCode2 = (hashCode + (truckOption == null ? 0 : truckOption.hashCode())) * 31;
        PedestrianOption pedestrianOption = this.pedestrian;
        int hashCode3 = (hashCode2 + (pedestrianOption == null ? 0 : pedestrianOption.hashCode())) * 31;
        BicycleOption bicycleOption = this.bicycle;
        int hashCode4 = (hashCode3 + (bicycleOption == null ? 0 : bicycleOption.hashCode())) * 31;
        TaxiOption taxiOption = this.taxi;
        return hashCode4 + (taxiOption != null ? taxiOption.hashCode() : 0);
    }

    public final String toString() {
        return "CostingOptions(auto=" + this.auto + ", truck=" + this.truck + ", pedestrian=" + this.pedestrian + ", bicycle=" + this.bicycle + ", taxi=" + this.taxi + ')';
    }

    public CostingOptions(AutoOption autoOption, TruckOption truckOption, PedestrianOption pedestrianOption, BicycleOption bicycleOption, TaxiOption taxiOption) {
        this.auto = autoOption;
        this.truck = truckOption;
        this.pedestrian = pedestrianOption;
        this.bicycle = bicycleOption;
        this.taxi = taxiOption;
    }

    public /* synthetic */ CostingOptions(AutoOption autoOption, TruckOption truckOption, PedestrianOption pedestrianOption, BicycleOption bicycleOption, TaxiOption taxiOption, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : autoOption, (i & 2) != 0 ? null : truckOption, (i & 4) != 0 ? null : pedestrianOption, (i & 8) != 0 ? null : bicycleOption, (i & 16) != 0 ? null : taxiOption);
    }
}
