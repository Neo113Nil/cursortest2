package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Circle;

/* loaded from: classes9.dex */
public interface CircleMapObject extends MapObject {
    int getFillColor();

    @NonNull
    Circle getGeometry();

    int getStrokeColor();

    float getStrokeWidth();

    boolean isGeodesic();

    void setFillColor(int i11);

    void setGeodesic(boolean z11);

    void setGeometry(@NonNull Circle circle);

    void setStrokeColor(int i11);

    void setStrokeWidth(float f7);
}
