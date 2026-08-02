package com.yandex.mapkit.directions.driving;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class RailwayCrossing implements Serializable {
    private PolylinePosition position;
    private RailwayCrossingType type;

    public RailwayCrossing(@NonNull RailwayCrossingType railwayCrossingType, @NonNull PolylinePosition polylinePosition) {
        if (railwayCrossingType == null) {
            throw new IllegalArgumentException("Required field \"type\" cannot be null");
        }
        if (polylinePosition == null) {
            throw new IllegalArgumentException("Required field \"position\" cannot be null");
        }
        this.type = railwayCrossingType;
        this.position = polylinePosition;
    }

    @NonNull
    public PolylinePosition getPosition() {
        return this.position;
    }

    @NonNull
    public RailwayCrossingType getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (RailwayCrossingType) archive.add((Archive) this.type, false, (Class<Archive>) RailwayCrossingType.class);
        this.position = (PolylinePosition) archive.add((Archive) this.position, false, (Class<Archive>) PolylinePosition.class);
    }

    public RailwayCrossing() {
    }
}
