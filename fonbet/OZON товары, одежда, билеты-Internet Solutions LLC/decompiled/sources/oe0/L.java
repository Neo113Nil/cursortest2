package oe0;

import android.location.LocationManager;
import android.location.provider.ProviderProperties;
import android.os.Build;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LocationManager f78132a;

    public L(LocationManager locationManager) {
        this.f78132a = locationManager;
    }

    private static boolean c(LocationManager locationManager, String str) {
        ProviderProperties providerProperties;
        try {
            if (locationManager.isProviderEnabled(str)) {
                if (Build.VERSION.SDK_INT >= 31) {
                    providerProperties = locationManager.getProviderProperties(str);
                    if (providerProperties != null) {
                        return true;
                    }
                } else if (locationManager.getProvider(str) != null) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @NotNull
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int i11 = Build.VERSION.SDK_INT;
        LocationManager locationManager = this.f78132a;
        if (i11 > 30 && c(locationManager, "fused")) {
            arrayList.add("fused");
        }
        if (c(locationManager, "gps")) {
            arrayList.add("gps");
        }
        if (c(locationManager, "network")) {
            arrayList.add("network");
        }
        if (c(locationManager, "passive")) {
            arrayList.add("passive");
        }
        return arrayList;
    }

    @NotNull
    public final LocationManager b() {
        return this.f78132a;
    }
}
