package io.radar.sdk;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;
import r0.AbstractC6195a;

/* loaded from: classes3.dex */
public class J0 {
    public boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Build.VERSION.SDK_INT >= 31 ? AbstractC5338c.checkSelfPermission(context, "android.permission.BLUETOOTH_SCAN") == 0 && AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 : AbstractC5338c.checkSelfPermission(context, "android.permission.BLUETOOTH") == 0 && AbstractC5338c.checkSelfPermission(context, "android.permission.BLUETOOTH_ADMIN") == 0 && AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public boolean c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return AbstractC5338c.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public boolean d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("location");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
        }
        LocationManager locationManager = (LocationManager) systemService;
        List<String> providers = locationManager.getProviders(true);
        Intrinsics.checkNotNullExpressionValue(providers, "locationManager.getProviders(true)");
        G0.b(C4589c.f49918a.y(), "Location providers: " + providers, null, null, 6, null);
        return AbstractC6195a.a(locationManager);
    }
}
