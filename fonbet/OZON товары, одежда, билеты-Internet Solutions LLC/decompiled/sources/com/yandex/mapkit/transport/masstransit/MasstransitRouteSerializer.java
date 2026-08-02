package com.yandex.mapkit.transport.masstransit;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface MasstransitRouteSerializer {
    Route load(@NonNull byte[] bArr);

    @NonNull
    byte[] save(@NonNull Route route);
}
