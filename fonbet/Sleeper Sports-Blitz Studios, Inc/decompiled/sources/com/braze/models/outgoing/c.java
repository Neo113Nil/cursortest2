package com.braze.models.outgoing;

import android.location.Location;
import android.os.Build;

/* loaded from: classes6.dex */
public final class c {
    public static final Double a(c cVar, Location location) {
        boolean hasVerticalAccuracy;
        float verticalAccuracyMeters;
        cVar.getClass();
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        hasVerticalAccuracy = location.hasVerticalAccuracy();
        if (!hasVerticalAccuracy) {
            return null;
        }
        verticalAccuracyMeters = location.getVerticalAccuracyMeters();
        return Double.valueOf(verticalAccuracyMeters);
    }
}
