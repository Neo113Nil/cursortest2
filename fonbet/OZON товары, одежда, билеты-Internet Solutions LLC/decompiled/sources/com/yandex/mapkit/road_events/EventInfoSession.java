package com.yandex.mapkit.road_events;

import androidx.annotation.NonNull;
import com.yandex.mapkit.GeoObject;
import com.yandex.runtime.Error;

/* loaded from: classes9.dex */
public interface EventInfoSession {

    public interface EventInfoListener {
        void onEventInfoError(@NonNull Error error);

        void onEventInfoReceived(@NonNull GeoObject geoObject);
    }

    void cancel();

    void retry(@NonNull EventInfoListener eventInfoListener);
}
