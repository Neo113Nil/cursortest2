package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import java.util.List;

/* loaded from: classes9.dex */
public interface PolylineMapObject extends MapObject {
    @NonNull
    Arrow addArrow(@NonNull PolylinePosition polylinePosition, float f7, int i11);

    @NonNull
    List<Arrow> arrows();

    @Deprecated
    float getArcApproximationStep();

    @Deprecated
    float getDashLength();

    @Deprecated
    float getDashOffset();

    @Deprecated
    float getGapLength();

    @NonNull
    Polyline getGeometry();

    @Deprecated
    float getGradientLength();

    @Deprecated
    int getOutlineColor();

    @Deprecated
    float getOutlineWidth();

    int getPaletteColor(int i11);

    int getStrokeColor(int i11);

    @Deprecated
    float getStrokeWidth();

    @NonNull
    LineStyle getStyle();

    @Deprecated
    float getTurnRadius();

    void hide(@NonNull Subpolyline subpolyline);

    void hide(@NonNull List<Subpolyline> list);

    @Deprecated
    boolean isInnerOutlineEnabled();

    void select(int i11, @NonNull Subpolyline subpolyline);

    @Deprecated
    void setArcApproximationStep(float f7);

    @Deprecated
    void setDashLength(float f7);

    @Deprecated
    void setDashOffset(float f7);

    @Deprecated
    void setGapLength(float f7);

    void setGeometry(@NonNull Polyline polyline);

    @Deprecated
    void setGradientLength(float f7);

    @Deprecated
    void setInnerOutlineEnabled(boolean z11);

    @Deprecated
    void setOutlineColor(int i11);

    @Deprecated
    void setOutlineWidth(float f7);

    void setPaletteColor(int i11, int i12);

    void setStrokeColor(int i11);

    void setStrokeColors(@NonNull List<Integer> list);

    void setStrokeColors(@NonNull List<Integer> list, @NonNull List<Double> list2);

    @Deprecated
    void setStrokeWidth(float f7);

    void setStyle(@NonNull LineStyle lineStyle);

    @Deprecated
    void setTurnRadius(float f7);
}
