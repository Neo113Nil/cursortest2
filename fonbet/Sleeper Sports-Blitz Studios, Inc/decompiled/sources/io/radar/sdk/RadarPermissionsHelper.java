package io.radar.sdk;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import androidx.core.location.LocationManagerCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarPermissionsHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0010¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/RadarPermissionsHelper;", "", "()V", "bluetoothPermissionsGranted", "", "context", "Landroid/content/Context;", "bluetoothPermissionsGranted$sdk_release", "coarseLocationPermissionGranted", "coarseLocationPermissionGranted$sdk_release", "fineLocationPermissionGranted", "fineLocationPermissionGranted$sdk_release", "locationServicesEnabled", "locationServicesEnabled$sdk_release", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public class RadarPermissionsHelper {
    public boolean fineLocationPermissionGranted$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public boolean coarseLocationPermissionGranted$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public boolean bluetoothPermissionsGranted$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Build.VERSION.SDK_INT >= 31 ? ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_SCAN") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 : ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_ADMIN") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public boolean locationServicesEnabled$sdk_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        List<String> providers = locationManager.getProviders(true);
        Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
        RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "Location providers: " + providers, null, null, 6, null);
        return LocationManagerCompat.isLocationEnabled(locationManager);
    }
}
