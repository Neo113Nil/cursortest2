package com.yandex.mapkit.places.panorama;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Position implements Serializable {
    private double altitude;
    private Point point;

    public Position(@NonNull Point point, double d11) {
        if (point == null) {
            throw new IllegalArgumentException("Required field \"point\" cannot be null");
        }
        this.point = point;
        this.altitude = d11;
    }

    public double getAltitude() {
        return this.altitude;
    }

    @NonNull
    public Point getPoint() {
        return this.point;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.point = (Point) archive.add((Archive) this.point, false, (Class<Archive>) Point.class);
        this.altitude = archive.add(this.altitude);
    }

    public Position() {
    }
}
