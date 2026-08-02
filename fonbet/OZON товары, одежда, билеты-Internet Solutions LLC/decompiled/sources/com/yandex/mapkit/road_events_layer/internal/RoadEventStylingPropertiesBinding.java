package com.yandex.mapkit.road_events_layer.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events_layer.RoadEventSignificance;
import com.yandex.mapkit.road_events_layer.RoadEventStylingProperties;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes9.dex */
public class RoadEventStylingPropertiesBinding implements RoadEventStylingProperties {
    private final NativeObject nativeObject;

    protected RoadEventStylingPropertiesBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStylingProperties
    @NonNull
    public native List<EventTag> getTags();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStylingProperties
    public native boolean hasSignificanceGreaterOrEqual(@NonNull RoadEventSignificance roadEventSignificance);

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStylingProperties
    public native boolean isInFuture();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStylingProperties
    public native boolean isOnRoute();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStylingProperties
    public native boolean isSelected();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStylingProperties
    public native boolean isUserEvent();

    @Override // com.yandex.mapkit.road_events_layer.RoadEventStylingProperties
    public native boolean isValid();
}
