package com.yandex.mapkit.layers;

import androidx.annotation.NonNull;
import com.yandex.mapkit.GeoObject;

/* loaded from: classes9.dex */
public interface GeoObjectTapEvent {
    @NonNull
    GeoObject getGeoObject();

    boolean isValid();
}
