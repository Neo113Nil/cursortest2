package com.yandex.mapkit.places.panorama;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class AngularBoundingBox implements Serializable {
    private float bottom;
    private float left;
    private float right;
    private float top;

    public AngularBoundingBox(float f7, float f11, float f12, float f13) {
        this.left = f7;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getLeft() {
        return this.left;
    }

    public float getRight() {
        return this.right;
    }

    public float getTop() {
        return this.top;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.left = archive.add(this.left);
        this.top = archive.add(this.top);
        this.right = archive.add(this.right);
        this.bottom = archive.add(this.bottom);
    }

    public AngularBoundingBox() {
    }
}
