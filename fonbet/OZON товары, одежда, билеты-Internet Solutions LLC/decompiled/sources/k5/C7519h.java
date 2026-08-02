package k5;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;

/* renamed from: k5.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7519h extends D0<String> implements InterfaceC7500c0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70741e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70742f;

    /* renamed from: g, reason: collision with root package name */
    private final LocationManager f70743g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final Mm0.c f70744h;

    C7519h(@NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0, LocationManager locationManager, @NonNull Mm0.c cVar) {
        super(Mm0.e.HorizontalAccuracy);
        this.f70741e = context;
        this.f70742f = abstractC7520h0;
        this.f70743g = locationManager;
        this.f70744h = cVar;
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70742f;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String p11 = p(this.f70744h.a());
        LocationManager locationManager = this.f70743g;
        if (p11 != null && (locationManager == null || !c3.a(locationManager))) {
            return p11;
        }
        if (!Gf.d.l(this.f70741e, EnumC7578w.ACCESS_FINE_LOCATION.a())) {
            throw new C7571u0("permission ACCESS_FINE_LOCATION was not granted");
        }
        if (locationManager == null) {
            throw new C7571u0("mLocationManager == null");
        }
        Location b11 = c3.b(locationManager);
        if (b11 == null) {
            throw new C7571u0("bestLocation == null");
        }
        String valueOf = String.valueOf(Math.round(b11.getAccuracy()));
        a(valueOf);
        return valueOf;
    }
}
