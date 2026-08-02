package bo.app;

import android.location.Location;
import android.os.Build;

/* loaded from: classes.dex */
public final class z1 {
    public static final Double a(z1 z1Var, Location location) {
        boolean hasVerticalAccuracy;
        float verticalAccuracyMeters;
        z1Var.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            hasVerticalAccuracy = location.hasVerticalAccuracy();
            if (hasVerticalAccuracy) {
                verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                return Double.valueOf(verticalAccuracyMeters);
            }
        }
        return null;
    }
}
