package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class ManoeuvreVehicleRestriction implements Serializable {
    private PolylinePosition position;
    private VehicleRestriction vehicleRestriction;

    public ManoeuvreVehicleRestriction(@NonNull VehicleRestriction vehicleRestriction, @NonNull PolylinePosition polylinePosition) {
        if (vehicleRestriction == null) {
            throw new IllegalArgumentException("Required field \"vehicleRestriction\" cannot be null");
        }
        if (polylinePosition == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.vehicleRestriction = vehicleRestriction;
        this.position = polylinePosition;
    }

    @NonNull
    public PolylinePosition getPosition() {
        return this.position;
    }

    @NonNull
    public VehicleRestriction getVehicleRestriction() {
        return this.vehicleRestriction;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.vehicleRestriction = (VehicleRestriction) archive.add((Archive) this.vehicleRestriction, false, (Class<Archive>) VehicleRestriction.class);
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
    }

    public ManoeuvreVehicleRestriction() {
    }
}
