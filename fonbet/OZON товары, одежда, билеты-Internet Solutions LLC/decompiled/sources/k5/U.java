package k5;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class U extends D0<String> implements InterfaceC7500c0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70647e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70648f;

    /* renamed from: g, reason: collision with root package name */
    private final LocationManager f70649g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final Mm0.c f70650h;

    U(@NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0, LocationManager locationManager, @NonNull Mm0.c cVar) {
        super(Mm0.e.Altitude);
        this.f70647e = context;
        this.f70648f = abstractC7520h0;
        this.f70649g = locationManager;
        this.f70650h = cVar;
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70648f;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String p11 = p(this.f70650h.a());
        LocationManager locationManager = this.f70649g;
        if (p11 != null && (locationManager == null || !c3.a(locationManager))) {
            return p11;
        }
        if (!Gf.d.l(this.f70647e, EnumC7578w.ACCESS_FINE_LOCATION.a())) {
            throw new C7571u0("permission ACCESS_FINE_LOCATION was not granted");
        }
        if (locationManager == null) {
            throw new C7571u0("mLocationManager == null");
        }
        Location b11 = c3.b(locationManager);
        if (b11 == null) {
            throw new C7571u0("bestLocation == null");
        }
        String d11 = Double.toString(b11.getAltitude());
        String substring = (d11.isEmpty() || !d11.contains(".")) ? "" : d11.substring(0, d11.indexOf(46));
        a(substring);
        return substring;
    }
}
