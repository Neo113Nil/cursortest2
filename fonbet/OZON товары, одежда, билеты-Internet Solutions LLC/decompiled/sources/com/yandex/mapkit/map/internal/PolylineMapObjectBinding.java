package com.yandex.mapkit.map.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.map.Arrow;
import com.yandex.mapkit.map.LineStyle;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes9.dex */
public class PolylineMapObjectBinding extends MapObjectBinding implements PolylineMapObject {
    protected PolylineMapObjectBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @NonNull
    public native Arrow addArrow(@NonNull PolylinePosition polylinePosition, float f7, int i11);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @NonNull
    public native List<Arrow> arrows();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native float getArcApproximationStep();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native float getDashLength();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native float getDashOffset();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native float getGapLength();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @NonNull
    public native Polyline getGeometry();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native float getGradientLength();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native int getOutlineColor();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native float getOutlineWidth();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native int getPaletteColor(int i11);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native int getStrokeColor(int i11);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native float getStrokeWidth();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @NonNull
    public native LineStyle getStyle();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native float getTurnRadius();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void hide(@NonNull Subpolyline subpolyline);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void hide(@NonNull List<Subpolyline> list);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native boolean isInnerOutlineEnabled();

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void select(int i11, @NonNull Subpolyline subpolyline);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native void setArcApproximationStep(float f7);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native void setDashLength(float f7);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native void setDashOffset(float f7);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native void setGapLength(float f7);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setGeometry(@NonNull Polyline polyline);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native void setGradientLength(float f7);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native void setInnerOutlineEnabled(boolean z11);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native void setOutlineColor(int i11);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native void setOutlineWidth(float f7);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setPaletteColor(int i11, int i12);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setStrokeColor(int i11);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setStrokeColors(@NonNull List<Integer> list);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setStrokeColors(@NonNull List<Integer> list, @NonNull List<Double> list2);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native void setStrokeWidth(float f7);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    public native void setStyle(@NonNull LineStyle lineStyle);

    @Override // com.yandex.mapkit.map.PolylineMapObject
    @Deprecated
    public native void setTurnRadius(float f7);
}
