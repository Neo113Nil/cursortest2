package com.yandex.mapkit.road_events_layer;

import androidx.annotation.NonNull;
import com.yandex.mapkit.road_events.EventTag;
import java.util.List;

/* loaded from: classes9.dex */
public interface RoadEventStylingProperties {
    @NonNull
    List<EventTag> getTags();

    boolean hasSignificanceGreaterOrEqual(@NonNull RoadEventSignificance roadEventSignificance);

    boolean isInFuture();

    boolean isOnRoute();

    boolean isSelected();

    boolean isUserEvent();

    boolean isValid();
}
