package com.yandex.mapkit.geometry;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class SubpolylineHelper {
    @NonNull
    public static native Polyline subpolyline(@NonNull Polyline polyline, @NonNull Subpolyline subpolyline);

    public static native double subpolylineLength(@NonNull Polyline polyline, @NonNull Subpolyline subpolyline);
}
