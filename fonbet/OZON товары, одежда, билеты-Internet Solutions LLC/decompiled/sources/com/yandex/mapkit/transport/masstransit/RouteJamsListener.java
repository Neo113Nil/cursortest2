package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface RouteJamsListener {
    void onJamsOutdated(@NonNull Route route);

    void onJamsUpdated(@NonNull Route route);
}
