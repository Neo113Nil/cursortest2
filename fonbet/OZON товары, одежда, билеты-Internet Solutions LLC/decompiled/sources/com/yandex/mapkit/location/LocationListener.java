package com.yandex.mapkit.location;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface LocationListener {
    void onLocationStatusUpdated(@NonNull LocationStatus locationStatus);

    void onLocationUpdated(@NonNull Location location);
}
