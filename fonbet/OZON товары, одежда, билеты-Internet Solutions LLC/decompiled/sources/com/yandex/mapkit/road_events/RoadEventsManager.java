package com.yandex.mapkit.road_events;

import androidx.annotation.NonNull;
import com.yandex.mapkit.road_events.EventInfoSession;

/* loaded from: classes9.dex */
public interface RoadEventsManager {
    @NonNull
    EventInfoSession requestEventInfo(@NonNull String str, @NonNull EventInfoSession.EventInfoListener eventInfoListener);
}
