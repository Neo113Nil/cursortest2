package com.yandex.mapkit.geometry;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class Geo {
    @NonNull
    public static native Point closestPoint(@NonNull Point point, @NonNull Segment segment);

    public static native double course(@NonNull Point point, @NonNull Point point2);

    public static native double distance(@NonNull Point point, @NonNull Point point2);

    @NonNull
    public static native Point pointOnSegmentByFactor(@NonNull Segment segment, double d11);
}
