package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class RoadVehicleRestriction implements Serializable {
    private Subpolyline position;
    private VehicleRestriction vehicleRestriction;

    public RoadVehicleRestriction(@NonNull VehicleRestriction vehicleRestriction, @NonNull Subpolyline subpolyline) {
        if (vehicleRestriction == null) {
            throw new IllegalArgumentException("Required field \"vehicleRestriction\" cannot be null");
        }
        if (subpolyline == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.vehicleRestriction = vehicleRestriction;
        this.position = subpolyline;
    }

    @NonNull
    public Subpolyline getPosition() {
        return this.position;
    }

    @NonNull
    public VehicleRestriction getVehicleRestriction() {
        return this.vehicleRestriction;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.vehicleRestriction = (VehicleRestriction) archive.add((Archive) this.vehicleRestriction, false, (Class<Archive>) VehicleRestriction.class);
        this.position = (Subpolyline) archive.add((Archive) this.position, false, (Class<Archive>) Subpolyline.class);
    }

    public RoadVehicleRestriction() {
    }
}
