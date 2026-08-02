package com.yandex.mapkit.search.search_layer;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class Size implements Serializable {
    private double height;
    private double width;

    public Size(double d11, double d12) {
        this.width = d11;
        this.height = d12;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.width = archive.add(this.width);
        this.height = archive.add(this.height);
    }

    public Size() {
    }
}
