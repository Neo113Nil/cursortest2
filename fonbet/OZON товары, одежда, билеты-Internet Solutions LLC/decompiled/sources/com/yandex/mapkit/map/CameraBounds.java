package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.BoundingBox;

/* loaded from: classes9.dex */
public interface CameraBounds {
    BoundingBox getLatLngBounds();

    float getMaxZoom();

    float getMinZoom();

    boolean isValid();

    void resetMinMaxZoomPreference();

    void setLatLngBounds(BoundingBox boundingBox);

    void setMaxZoomPreference(float f7);

    void setMinZoomPreference(float f7);
}
