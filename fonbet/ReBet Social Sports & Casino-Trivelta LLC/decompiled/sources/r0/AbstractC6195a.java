package r0;

import android.location.LocationManager;
import android.os.Build;
import java.util.WeakHashMap;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6195a {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f63736a = new WeakHashMap();

    /* renamed from: r0.a$a, reason: collision with other inner class name */
    public static class C0886a {
        public static boolean a(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    public static boolean a(LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? C0886a.a(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }
}
