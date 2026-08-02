package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Direction implements Serializable {
    private double azimuth;
    private double tilt;

    public Direction(double d11, double d12) {
        this.azimuth = d11;
        this.tilt = d12;
    }

    public double getAzimuth() {
        return this.azimuth;
    }

    public double getTilt() {
        return this.tilt;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.azimuth = archive.add(this.azimuth);
        this.tilt = archive.add(this.tilt);
    }

    public Direction() {
    }
}
