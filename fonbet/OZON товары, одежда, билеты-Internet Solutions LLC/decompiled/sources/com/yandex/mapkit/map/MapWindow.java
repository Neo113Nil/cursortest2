package com.yandex.mapkit.map;

import androidx.annotation.NonNull;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.ui.Overlay;
import com.yandex.runtime.view.Surface;

/* loaded from: classes9.dex */
public interface MapWindow {
    @NonNull
    Overlay addRasterScreenOverlay();

    void addSizeChangedListener(@NonNull SizeChangedListener sizeChangedListener);

    void addSurface(@NonNull Surface surface);

    ScreenPoint getFocusPoint();

    ScreenRect getFocusRect();

    @NonNull
    VisibleRegion getFocusRegion();

    ScreenPoint getGestureFocusPoint();

    @NonNull
    GestureFocusPointMode getGestureFocusPointMode();

    @NonNull
    Map getMap();

    @NonNull
    PointOfView getPointOfView();

    float getScaleFactor();

    int height();

    boolean isValid();

    void removeSizeChangedListener(@NonNull SizeChangedListener sizeChangedListener);

    void removeSurface(@NonNull Surface surface);

    Point screenToWorld(@NonNull ScreenPoint screenPoint);

    void setFocusPoint(ScreenPoint screenPoint);

    void setFocusRect(ScreenRect screenRect);

    void setGestureFocusPoint(ScreenPoint screenPoint);

    void setGestureFocusPointMode(@NonNull GestureFocusPointMode gestureFocusPointMode);

    void setMaxFps(float f7);

    void setPointOfView(@NonNull PointOfView pointOfView);

    void setScaleFactor(float f7);

    void startMemoryMetricsCapture();

    void startPerformanceMetricsCapture();

    @NonNull
    String stopMemoryMetricsCapture();

    @NonNull
    String stopPerformanceMetricsCapture();

    int width();

    ScreenPoint worldToScreen(@NonNull Point point);
}
