package com.yandex.mapkit.map.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.GestureFocusPointMode;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.PointOfView;
import com.yandex.mapkit.map.SizeChangedListener;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.mapkit.ui.Overlay;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import com.yandex.runtime.view.Surface;

/* loaded from: classes9.dex */
public class MapWindowBinding implements MapWindow {
    private final NativeObject nativeObject;
    protected Subscription<SizeChangedListener> sizeChangedListenerSubscription = new Subscription<SizeChangedListener>() { // from class: com.yandex.mapkit.map.internal.MapWindowBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(SizeChangedListener sizeChangedListener) {
            return MapWindowBinding.createSizeChangedListener(sizeChangedListener);
        }
    };

    protected MapWindowBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createSizeChangedListener(SizeChangedListener sizeChangedListener);

    @Override // com.yandex.mapkit.map.MapWindow
    @NonNull
    public native Overlay addRasterScreenOverlay();

    @Override // com.yandex.mapkit.map.MapWindow
    public native void addSizeChangedListener(@NonNull SizeChangedListener sizeChangedListener);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void addSurface(@NonNull Surface surface);

    @Override // com.yandex.mapkit.map.MapWindow
    public native ScreenPoint getFocusPoint();

    @Override // com.yandex.mapkit.map.MapWindow
    public native ScreenRect getFocusRect();

    @Override // com.yandex.mapkit.map.MapWindow
    @NonNull
    public native VisibleRegion getFocusRegion();

    @Override // com.yandex.mapkit.map.MapWindow
    public native ScreenPoint getGestureFocusPoint();

    @Override // com.yandex.mapkit.map.MapWindow
    @NonNull
    public native GestureFocusPointMode getGestureFocusPointMode();

    @Override // com.yandex.mapkit.map.MapWindow
    @NonNull
    public native Map getMap();

    @Override // com.yandex.mapkit.map.MapWindow
    @NonNull
    public native PointOfView getPointOfView();

    @Override // com.yandex.mapkit.map.MapWindow
    public native float getScaleFactor();

    @Override // com.yandex.mapkit.map.MapWindow
    public native int height();

    @Override // com.yandex.mapkit.map.MapWindow
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.MapWindow
    public native void removeSizeChangedListener(@NonNull SizeChangedListener sizeChangedListener);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void removeSurface(@NonNull Surface surface);

    @Override // com.yandex.mapkit.map.MapWindow
    public native Point screenToWorld(@NonNull ScreenPoint screenPoint);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setFocusPoint(ScreenPoint screenPoint);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setFocusRect(ScreenRect screenRect);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setGestureFocusPoint(ScreenPoint screenPoint);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setGestureFocusPointMode(@NonNull GestureFocusPointMode gestureFocusPointMode);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setMaxFps(float f7);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setPointOfView(@NonNull PointOfView pointOfView);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void setScaleFactor(float f7);

    @Override // com.yandex.mapkit.map.MapWindow
    public native void startMemoryMetricsCapture();

    @Override // com.yandex.mapkit.map.MapWindow
    public native void startPerformanceMetricsCapture();

    @Override // com.yandex.mapkit.map.MapWindow
    @NonNull
    public native String stopMemoryMetricsCapture();

    @Override // com.yandex.mapkit.map.MapWindow
    @NonNull
    public native String stopPerformanceMetricsCapture();

    @Override // com.yandex.mapkit.map.MapWindow
    public native int width();

    @Override // com.yandex.mapkit.map.MapWindow
    public native ScreenPoint worldToScreen(@NonNull Point point);
}
