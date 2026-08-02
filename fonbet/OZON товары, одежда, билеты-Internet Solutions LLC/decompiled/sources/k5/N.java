package k5;

import android.content.Context;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import k5.InterfaceC7518g2;

/* loaded from: classes8.dex */
final class N extends InterfaceC7518g2.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ O f70608a;

    N(O o11) {
        this.f70608a = o11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: k5.M
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                Context context2;
                Context context3;
                N n11 = N.this;
                O o11 = n11.f70608a;
                try {
                    context = o11.f70620f;
                    LocationManager locationManager = (LocationManager) context.getSystemService("location");
                    if (locationManager != null) {
                        context2 = o11.f70620f;
                        if (Gf.d.l(context2, EnumC7578w.ACCESS_FINE_LOCATION.a())) {
                            context3 = o11.f70620f;
                            if (Gf.d.l(context3, EnumC7578w.ACCESS_COARSE_LOCATION.a())) {
                                boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
                                boolean isProviderEnabled2 = locationManager.isProviderEnabled("passive");
                                boolean isProviderEnabled3 = locationManager.isProviderEnabled("network");
                                if (isProviderEnabled || isProviderEnabled3 || isProviderEnabled2) {
                                    if (isProviderEnabled) {
                                        locationManager.requestLocationUpdates("gps", 10000L, 10000.0f, n11.f70608a);
                                    }
                                    if (isProviderEnabled2) {
                                        locationManager.requestLocationUpdates("passive", 10000L, 10000.0f, n11.f70608a);
                                    }
                                    if (isProviderEnabled3) {
                                        locationManager.requestLocationUpdates("network", 10000L, 10000.0f, n11.f70608a);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        });
    }
}
