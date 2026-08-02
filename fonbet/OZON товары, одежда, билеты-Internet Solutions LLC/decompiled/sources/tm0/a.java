package tm0;

import E0.U0;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import um0.e;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f99570a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final um0.a f99571b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e f99572c;

    public a(@NotNull Context appContext, @NotNull um0.a batteryLevelProvider, @NotNull U0 locationProvider, @NotNull e networkProvider) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(batteryLevelProvider, "batteryLevelProvider");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(networkProvider, "networkProvider");
        this.f99570a = appContext;
        this.f99571b = batteryLevelProvider;
        this.f99572c = networkProvider;
    }

    public final void a(@NotNull wm0.a event) {
        LocationManager locationManager;
        Intrinsics.checkNotNullParameter(event, "event");
        String a11 = this.f99571b.a();
        if (a11.length() > 0) {
            event.b(a11);
        }
        Context context = this.f99570a;
        Intrinsics.checkNotNullParameter(context, "context");
        Location location = null;
        try {
            if ((ym0.a.a(context, "android.permission.ACCESS_FINE_LOCATION") || ym0.a.a(context, "android.permission.ACCESS_COARSE_LOCATION")) && (locationManager = (LocationManager) context.getSystemService("location")) != null) {
                Location lastKnownLocation = locationManager.isProviderEnabled("gps") ? locationManager.getLastKnownLocation("gps") : null;
                if (lastKnownLocation == null) {
                    lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                    if (lastKnownLocation == null) {
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("passive") ? locationManager.getLastKnownLocation("passive") : null;
                        if (lastKnownLocation2 != null) {
                            location = lastKnownLocation2;
                        }
                    }
                }
                location = lastKnownLocation;
            }
        } catch (Exception unused) {
        }
        if (location != null) {
            event.e(String.valueOf(location.getLatitude()));
            event.f(String.valueOf(location.getLongitude()));
        }
        e eVar = this.f99572c;
        String b11 = eVar.b();
        if (b11.length() > 0) {
            event.d(b11);
        }
        String c11 = eVar.c();
        if (c11.length() > 0) {
            event.g(c11);
        }
        String a12 = eVar.a();
        if (a12.length() > 0) {
            event.c(a12);
        }
    }
}
