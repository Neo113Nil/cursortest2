package com.yandex.mapkit.geometry;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface PolylineBuilder {
    void append(@NonNull Point point);

    void append(@NonNull Polyline polyline);

    @NonNull
    Polyline build();
}
