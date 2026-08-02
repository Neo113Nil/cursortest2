package k5;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;

/* renamed from: k5.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7524i0 extends D0<String> implements InterfaceC7500c0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70748e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70749f;

    /* renamed from: g, reason: collision with root package name */
    private final LocationManager f70750g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final Mm0.c f70751h;

    C7524i0(@NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0, LocationManager locationManager, @NonNull Mm0.c cVar) {
        super(Mm0.e.GeoProvider);
        this.f70748e = context;
        this.f70749f = abstractC7520h0;
        this.f70750g = locationManager;
        this.f70751h = cVar;
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70749f;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String p11 = p(this.f70751h.a());
        LocationManager locationManager = this.f70750g;
        if (p11 != null && (locationManager == null || !c3.a(locationManager))) {
            return p11;
        }
        if (!Gf.d.l(this.f70748e, EnumC7578w.ACCESS_FINE_LOCATION.a())) {
            throw new C7571u0("permission ACCESS_FINE_LOCATION was not granted");
        }
        if (locationManager == null) {
            throw new C7571u0("mLocationManager == null");
        }
        Location b11 = c3.b(locationManager);
        if (b11 == null) {
            throw new C7571u0("bestLocation == null");
        }
        String provider = b11.getProvider();
        if (provider == null) {
            provider = "undefined";
        }
        a(provider);
        return provider;
    }
}
