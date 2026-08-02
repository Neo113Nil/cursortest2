package com.yandex.mapkit.transport.bicycle;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class BicycleRouteSerializer {
    @NonNull
    public static native Route load(@NonNull byte[] bArr);

    @NonNull
    public static native byte[] save(@NonNull Route route);
}
