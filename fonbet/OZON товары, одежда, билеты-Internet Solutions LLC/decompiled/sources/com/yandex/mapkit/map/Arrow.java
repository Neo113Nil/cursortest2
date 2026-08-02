package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.PolylinePosition;

/* loaded from: classes9.dex */
public interface Arrow {
    int getFillColor();

    float getLength();

    int getOutlineColor();

    float getOutlineWidth();

    @NonNull
    PolylinePosition getPosition();

    float getTriangleHeight();

    boolean isValid();

    boolean isVisible();

    void setFillColor(int i11);

    void setLength(float f7);

    void setOutlineColor(int i11);

    void setOutlineWidth(float f7);

    void setTriangleHeight(float f7);

    void setVisible(boolean z11);
}
