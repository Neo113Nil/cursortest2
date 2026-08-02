package ru.ozon.mapsdk.common.clustercontroller.corecluster.geometry;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class Point {

    /* renamed from: x, reason: collision with root package name */
    public final double f97555x;

    /* renamed from: y, reason: collision with root package name */
    public final double f97556y;

    public Point(double d11, double d12) {
        this.f97555x = d11;
        this.f97556y = d12;
    }

    @NonNull
    public String toString() {
        return "Point{x=" + this.f97555x + ", y=" + this.f97556y + '}';
    }
}
