package com.yandex.mapkit.road_events.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.road_events.EventInfoSession;
import com.yandex.mapkit.road_events.RoadEventsManager;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class RoadEventsManagerBinding implements RoadEventsManager {
    private final NativeObject nativeObject;

    protected RoadEventsManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events.RoadEventsManager
    @NonNull
    public native EventInfoSession requestEventInfo(@NonNull String str, @NonNull EventInfoSession.EventInfoListener eventInfoListener);
}
