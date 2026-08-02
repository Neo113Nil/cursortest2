package k5;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import java.util.Locale;

/* renamed from: k5.j1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7529j1 extends D0<String> implements InterfaceC7500c0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70762e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70763f;

    /* renamed from: g, reason: collision with root package name */
    private final LocationManager f70764g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final Mm0.c f70765h;

    C7529j1(@NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0, LocationManager locationManager, @NonNull Mm0.c cVar) {
        super(Mm0.e.Heading);
        this.f70762e = context;
        this.f70763f = abstractC7520h0;
        this.f70764g = locationManager;
        this.f70765h = cVar;
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70763f;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        String p11 = p(this.f70765h.a());
        LocationManager locationManager = this.f70764g;
        if (p11 != null && (locationManager == null || !c3.a(locationManager))) {
            return p11;
        }
        if (!Gf.d.l(this.f70762e, EnumC7578w.ACCESS_FINE_LOCATION.a())) {
            throw new C7571u0("permission ACCESS_FINE_LOCATION was not granted");
        }
        if (locationManager == null) {
            throw new C7571u0("mLocationManager == null");
        }
        Location b11 = c3.b(locationManager);
        if (b11 == null) {
            throw new C7571u0("bestLocation == null");
        }
        String format = String.format(Locale.US, "%.1f", Float.valueOf(b11.getBearing()));
        a(format);
        return format;
    }
}
