package k5;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;

/* renamed from: k5.b2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7498b2 extends D0<String> implements InterfaceC7500c0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70712e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70713f;

    /* renamed from: g, reason: collision with root package name */
    private final LocationManager f70714g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final Mm0.c f70715h;

    C7498b2(@NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0, LocationManager locationManager, @NonNull Mm0.c cVar) {
        super(Mm0.e.Latitude);
        this.f70712e = context;
        this.f70713f = abstractC7520h0;
        this.f70714g = locationManager;
        this.f70715h = cVar;
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70713f;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String p11 = p(this.f70715h.a());
        LocationManager locationManager = this.f70714g;
        if (p11 != null && (locationManager == null || !c3.a(locationManager))) {
            return p11;
        }
        if (!Gf.d.l(this.f70712e, EnumC7578w.ACCESS_FINE_LOCATION.a())) {
            throw new C7571u0("permission ACCESS_FINE_LOCATION was not granted");
        }
        if (locationManager == null) {
            throw new C7571u0("mLocationManager == null");
        }
        Location b11 = c3.b(locationManager);
        if (b11 == null) {
            throw new C7571u0("bestLocation == null");
        }
        String a11 = C7575v0.a(b11.getLatitude());
        a(a11);
        return a11;
    }
}
