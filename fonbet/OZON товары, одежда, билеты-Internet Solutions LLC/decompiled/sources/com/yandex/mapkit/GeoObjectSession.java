package com.yandex.mapkit;

import androidx.annotation.NonNull;
import com.yandex.runtime.Error;

/* loaded from: classes9.dex */
public interface GeoObjectSession {

    public interface GeoObjectListener {
        void onGeoObjectError(@NonNull Error error);

        void onGeoObjectResult(@NonNull GeoObject geoObject);
    }

    void cancel();

    void retry(@NonNull GeoObjectListener geoObjectListener);
}
