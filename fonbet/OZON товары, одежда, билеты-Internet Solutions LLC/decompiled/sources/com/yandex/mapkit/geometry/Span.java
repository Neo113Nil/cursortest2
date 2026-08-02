package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Span implements Serializable {
    private double horizontalAngle;
    private double verticalAngle;

    public Span(double d11, double d12) {
        this.horizontalAngle = d11;
        this.verticalAngle = d12;
    }

    public double getHorizontalAngle() {
        return this.horizontalAngle;
    }

    public double getVerticalAngle() {
        return this.verticalAngle;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.horizontalAngle = archive.add(this.horizontalAngle);
        this.verticalAngle = archive.add(this.verticalAngle);
    }

    public Span() {
    }
}
