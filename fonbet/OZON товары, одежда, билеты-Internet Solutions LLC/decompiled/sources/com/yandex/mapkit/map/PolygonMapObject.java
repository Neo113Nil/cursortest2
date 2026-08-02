package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes9.dex */
public interface PolygonMapObject extends MapObject {
    int getFillColor();

    @NonNull
    Polygon getGeometry();

    int getStrokeColor();

    float getStrokeWidth();

    boolean isGeodesic();

    void resetPattern();

    void setFillColor(int i11);

    void setGeodesic(boolean z11);

    void setGeometry(@NonNull Polygon polygon);

    void setPattern(@NonNull AnimatedImageProvider animatedImageProvider, float f7);

    void setPattern(@NonNull ImageProvider imageProvider, float f7);

    void setStrokeColor(int i11);

    void setStrokeWidth(float f7);
}
