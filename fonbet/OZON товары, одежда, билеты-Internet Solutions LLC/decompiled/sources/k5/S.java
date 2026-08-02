package k5;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class S extends D0<String> implements InterfaceC7500c0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70636e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70637f;

    /* renamed from: g, reason: collision with root package name */
    private final LocationManager f70638g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final Mm0.c f70639h;

    S(@NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0, LocationManager locationManager, @NonNull Mm0.c cVar) {
        super(Mm0.e.Speed);
        this.f70636e = context;
        this.f70637f = abstractC7520h0;
        this.f70638g = locationManager;
        this.f70639h = cVar;
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70637f;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String p11 = p(this.f70639h.a());
        LocationManager locationManager = this.f70638g;
        if (p11 != null && (locationManager == null || !c3.a(locationManager))) {
            return p11;
        }
        if (!Gf.d.l(this.f70636e, EnumC7578w.ACCESS_FINE_LOCATION.a())) {
            throw new C7571u0("permission ACCESS_FINE_LOCATION was not granted");
        }
        if (locationManager == null) {
            throw new C7571u0("mLocationManager == null");
        }
        if (c3.b(locationManager) == null) {
            throw new C7571u0("bestLocation == null");
        }
        String d11 = Double.toString(r0.getSpeed());
        a(d11);
        return d11;
    }
}
