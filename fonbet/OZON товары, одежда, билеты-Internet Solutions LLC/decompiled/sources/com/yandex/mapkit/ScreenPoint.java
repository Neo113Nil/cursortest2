package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class ScreenPoint implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private float f60716x;

    /* renamed from: y, reason: collision with root package name */
    private float f60717y;

    public ScreenPoint(float f7, float f11) {
        this.f60716x = f7;
        this.f60717y = f11;
    }

    public float getX() {
        return this.f60716x;
    }

    public float getY() {
        return this.f60717y;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f60716x = archive.add(this.f60716x);
        this.f60717y = archive.add(this.f60717y);
    }

    public ScreenPoint() {
    }
}
