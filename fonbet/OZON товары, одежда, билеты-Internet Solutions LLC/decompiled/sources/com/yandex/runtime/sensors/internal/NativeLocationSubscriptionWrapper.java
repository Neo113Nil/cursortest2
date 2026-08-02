package com.yandex.runtime.sensors.internal;

import android.location.Location;
import com.yandex.runtime.NativeObject;

/* loaded from: classes9.dex */
public class NativeLocationSubscriptionWrapper {
    private final NativeObject nativeSubscription;

    public NativeLocationSubscriptionWrapper(NativeObject nativeObject) {
        this.nativeSubscription = nativeObject;
    }

    private static native void onLocationReceived(NativeObject nativeObject, double d11, double d12, boolean z11, double d13, boolean z12, double d14, boolean z13, double d15, boolean z14, double d16, long j11);

    private static native void onStatusReceived(NativeObject nativeObject, boolean z11);

    public void onLocationReceived(Location location) {
        onLocationReceived(this.nativeSubscription, location.getLatitude(), location.getLongitude(), location.hasAccuracy(), location.getAccuracy(), location.hasAltitude(), location.getAltitude(), location.hasSpeed(), location.getSpeed(), location.hasBearing(), location.getBearing(), TimeHelpers.locationAgeMilliseconds(location));
    }

    public void onStatusReceived(boolean z11) {
        onStatusReceived(this.nativeSubscription, z11);
    }
}
