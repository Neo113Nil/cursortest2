package k5;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class P0 extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70626e;

    /* renamed from: f, reason: collision with root package name */
    private final LocationManager f70627f;

    P0(@NonNull Context context, LocationManager locationManager) {
        super(Mm0.e.Status);
        this.f70626e = context;
        this.f70627f = locationManager;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String a11 = EnumC7578w.ACCESS_FINE_LOCATION.a();
        Context context = this.f70626e;
        if (!Gf.d.l(context, a11) && !Gf.d.l(context, EnumC7578w.ACCESS_COARSE_LOCATION.a())) {
            return "1";
        }
        LocationManager locationManager = this.f70627f;
        if (locationManager == null) {
            return "4";
        }
        try {
            locationManager.isProviderEnabled("gps");
            return locationManager.getProvider("gps") != null ? "0" : "4";
        } catch (Exception unused) {
            return "4";
        }
    }
}
