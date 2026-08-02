package c;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.surt.guardian.utils.Logger;
import com.twilio.voice.EventKeys;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;

/* loaded from: classes.dex */
public final class K0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Cc.b f26452b = new Cc.b(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f26453a;

    public K0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26453a = context;
    }

    public static Location a(LocationManager locationManager) {
        List<String> providers = locationManager.getProviders(true);
        Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
        Iterator<String> it = providers.iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && (location == null || lastKnownLocation.getAccuracy() < location.getAccuracy())) {
                location = lastKnownLocation;
            }
        }
        return location;
    }

    public final Map b() {
        if (AbstractC5338c.checkSelfPermission(this.f26453a, "android.permission.ACCESS_FINE_LOCATION") != 0 && AbstractC5338c.checkSelfPermission(this.f26453a, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            Logger.f41582a.f("LocationModule", "Location permission not granted");
            return null;
        }
        try {
            Object systemService = this.f26453a.getSystemService("location");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            Location a10 = a((LocationManager) systemService);
            if (a10 != null) {
                return MapsKt.mapOf(TuplesKt.to("latitude", Double.valueOf(a10.getLatitude())), TuplesKt.to("longitude", Double.valueOf(a10.getLongitude())), TuplesKt.to("accuracy", Float.valueOf(a10.getAccuracy())), TuplesKt.to("altitude", a10.hasAltitude() ? Double.valueOf(a10.getAltitude()) : null), TuplesKt.to("speed", a10.hasSpeed() ? Float.valueOf(a10.getSpeed()) : null), TuplesKt.to("bearing", a10.hasBearing() ? Float.valueOf(a10.getBearing()) : null), TuplesKt.to(EventKeys.TIMESTAMP, Long.valueOf(a10.getTime())), TuplesKt.to("provider", a10.getProvider()));
            }
            Logger.f41582a.f("LocationModule", "No location available");
            return null;
        } catch (SecurityException e10) {
            Logger.f41582a.b("LocationModule", "Security exception getting location", e10);
            return null;
        } catch (Exception e11) {
            Logger.f41582a.b("LocationModule", "Error getting location", e11);
            return null;
        }
    }
}
