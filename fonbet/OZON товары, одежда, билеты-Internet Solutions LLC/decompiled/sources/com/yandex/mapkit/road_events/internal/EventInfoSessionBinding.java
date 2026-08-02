package com.yandex.mapkit.road_events.internal;

import androidx.annotation.NonNull;
import com.yandex.mapkit.road_events.EventInfoSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class EventInfoSessionBinding implements EventInfoSession {
    private final NativeObject nativeObject;

    protected EventInfoSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events.EventInfoSession
    public native void cancel();

    @Override // com.yandex.mapkit.road_events.EventInfoSession
    public native void retry(@NonNull EventInfoSession.EventInfoListener eventInfoListener);
}
