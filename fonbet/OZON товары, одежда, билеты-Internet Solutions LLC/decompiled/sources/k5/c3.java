package k5;

import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class c3 {
    public static boolean a(@NonNull LocationManager locationManager) {
        if (locationManager.isProviderEnabled("gps")) {
            return locationManager.getProvider("gps") != null;
        }
        return false;
    }

    public static Location b(@NonNull LocationManager locationManager) {
        Iterator<String> it = locationManager.getProviders(true).iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && (location == null || lastKnownLocation.getAccuracy() < location.getAccuracy())) {
                location = lastKnownLocation;
            }
        }
        return location;
    }
}
