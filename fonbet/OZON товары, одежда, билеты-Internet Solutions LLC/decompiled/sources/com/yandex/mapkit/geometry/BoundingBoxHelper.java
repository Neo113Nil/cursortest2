package com.yandex.mapkit.geometry;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class BoundingBoxHelper {
    @NonNull
    public static native BoundingBox getBounds(@NonNull BoundingBox boundingBox);

    @NonNull
    public static native BoundingBox getBounds(@NonNull BoundingBox boundingBox, @NonNull BoundingBox boundingBox2);

    @NonNull
    public static native BoundingBox getBounds(@NonNull LinearRing linearRing);

    @NonNull
    public static native BoundingBox getBounds(@NonNull Point point);

    @NonNull
    public static native BoundingBox getBounds(@NonNull Polygon polygon);

    @NonNull
    public static native BoundingBox getBounds(@NonNull Polyline polyline);
}
