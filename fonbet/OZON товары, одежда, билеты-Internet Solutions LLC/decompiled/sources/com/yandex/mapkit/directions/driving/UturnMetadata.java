package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class UturnMetadata implements Serializable {
    private double length;

    public UturnMetadata(double d11) {
        this.length = d11;
    }

    public double getLength() {
        return this.length;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.length = archive.add(this.length);
    }

    public UturnMetadata() {
    }
}
