package com.yandex.mapkit.road_events_layer.internal;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.yandex.mapkit.road_events_layer.RoadEventStyle;
import com.yandex.mapkit.road_events_layer.TextStyle;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.ImageProvider;
import java.util.List;

/* loaded from: classes9.dex */
public class RoadEventStyleBinding implements RoadEventStyle {
    private final NativeObject nativeObject;

    protected RoadEventStyleBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native TextStyle getCaptionStyle();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    @NonNull
    public native PointF getIconAnchor();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native int getZoomMin();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    @NonNull
    public native List<PointF> getZoomScaleFunction();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native boolean isValid();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native void setCaptionStyle(TextStyle textStyle);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native void setIconAnchor(@NonNull PointF pointF);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native void setIconImage(@NonNull ImageProvider imageProvider);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native void setZoomMin(int i11);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStyle
    public native void setZoomScaleFunction(@NonNull List<PointF> list);
}
