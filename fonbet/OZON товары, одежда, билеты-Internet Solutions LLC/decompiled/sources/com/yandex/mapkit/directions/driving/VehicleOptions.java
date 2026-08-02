package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public final class VehicleOptions implements Serializable {
    private Float axleWeight;
    private Boolean buswayPermitted;
    private Integer ecoClass;
    private Boolean hasTrailer;
    private Float height;
    private Float length;
    private Float maxWeight;
    private Float payload;
    private VehicleType vehicleType;
    private Float weight;
    private Float width;

    public VehicleOptions(@NonNull VehicleType vehicleType, Float f7, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Integer num, Boolean bool, Boolean bool2) {
        this.vehicleType = VehicleType.DEFAULT;
        this.weight = null;
        this.axleWeight = null;
        this.maxWeight = null;
        this.height = null;
        this.width = null;
        this.length = null;
        this.payload = null;
        this.ecoClass = null;
        this.hasTrailer = null;
        this.buswayPermitted = null;
        if (vehicleType == null) {
            throw new IllegalArgumentException("Required field \"vehicleType\" cannot be null");
        }
        this.vehicleType = vehicleType;
        this.weight = f7;
        this.axleWeight = f11;
        this.maxWeight = f12;
        this.height = f13;
        this.width = f14;
        this.length = f15;
        this.payload = f16;
        this.ecoClass = num;
        this.hasTrailer = bool;
        this.buswayPermitted = bool2;
    }

    public Float getAxleWeight() {
        return this.axleWeight;
    }

    public Boolean getBuswayPermitted() {
        return this.buswayPermitted;
    }

    public Integer getEcoClass() {
        return this.ecoClass;
    }

    public Boolean getHasTrailer() {
        return this.hasTrailer;
    }

    public Float getHeight() {
        return this.height;
    }

    public Float getLength() {
        return this.length;
    }

    public Float getMaxWeight() {
        return this.maxWeight;
    }

    public Float getPayload() {
        return this.payload;
    }

    @NonNull
    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public Float getWeight() {
        return this.weight;
    }

    public Float getWidth() {
        return this.width;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.vehicleType = (VehicleType) archive.add((Archive) this.vehicleType, false, (Class<Archive>) VehicleType.class);
        this.weight = archive.add(this.weight, true);
        this.axleWeight = archive.add(this.axleWeight, true);
        this.maxWeight = archive.add(this.maxWeight, true);
        this.height = archive.add(this.height, true);
        this.width = archive.add(this.width, true);
        this.length = archive.add(this.length, true);
        this.payload = archive.add(this.payload, true);
        this.ecoClass = archive.add(this.ecoClass, true);
        this.hasTrailer = archive.add(this.hasTrailer, true);
        this.buswayPermitted = archive.add(this.buswayPermitted, true);
    }

    public VehicleOptions setAxleWeight(Float f7) {
        this.axleWeight = f7;
        return this;
    }

    public VehicleOptions setBuswayPermitted(Boolean bool) {
        this.buswayPermitted = bool;
        return this;
    }

    public VehicleOptions setEcoClass(Integer num) {
        this.ecoClass = num;
        return this;
    }

    public VehicleOptions setHasTrailer(Boolean bool) {
        this.hasTrailer = bool;
        return this;
    }

    public VehicleOptions setHeight(Float f7) {
        this.height = f7;
        return this;
    }

    public VehicleOptions setLength(Float f7) {
        this.length = f7;
        return this;
    }

    public VehicleOptions setMaxWeight(Float f7) {
        this.maxWeight = f7;
        return this;
    }

    public VehicleOptions setPayload(Float f7) {
        this.payload = f7;
        return this;
    }

    public VehicleOptions setVehicleType(@NonNull VehicleType vehicleType) {
        if (vehicleType == null) {
            throw new IllegalArgumentException("Required field \"vehicleType\" cannot be null");
        }
        this.vehicleType = vehicleType;
        return this;
    }

    public VehicleOptions setWeight(Float f7) {
        this.weight = f7;
        return this;
    }

    public VehicleOptions setWidth(Float f7) {
        this.width = f7;
        return this;
    }

    public VehicleOptions() {
        this.vehicleType = VehicleType.DEFAULT;
        this.weight = null;
        this.axleWeight = null;
        this.maxWeight = null;
        this.height = null;
        this.width = null;
        this.length = null;
        this.payload = null;
        this.ecoClass = null;
        this.hasTrailer = null;
        this.buswayPermitted = null;
    }
}
