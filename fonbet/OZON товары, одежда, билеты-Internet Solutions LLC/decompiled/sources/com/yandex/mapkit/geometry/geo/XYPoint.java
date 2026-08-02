package com.yandex.mapkit.geometry.geo;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class XYPoint implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    private double f60722x;

    /* renamed from: y, reason: collision with root package name */
    private double f60723y;

    public XYPoint(double d11, double d12) {
        this.f60722x = d11;
        this.f60723y = d12;
    }

    public double getX() {
        return this.f60722x;
    }

    public double getY() {
        return this.f60723y;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.f60722x = archive.add(this.f60722x);
        this.f60723y = archive.add(this.f60723y);
    }

    public XYPoint() {
    }
}
