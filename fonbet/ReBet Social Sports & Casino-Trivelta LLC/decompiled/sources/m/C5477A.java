package m;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import l0.AbstractC5342g;

/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5477A {

    /* renamed from: d, reason: collision with root package name */
    public static C5477A f55874d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f55875a;

    /* renamed from: b, reason: collision with root package name */
    public final LocationManager f55876b;

    /* renamed from: c, reason: collision with root package name */
    public final a f55877c = new a();

    /* renamed from: m.A$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f55878a;

        /* renamed from: b, reason: collision with root package name */
        public long f55879b;
    }

    public C5477A(Context context, LocationManager locationManager) {
        this.f55875a = context;
        this.f55876b = locationManager;
    }

    public static C5477A a(Context context) {
        if (f55874d == null) {
            Context applicationContext = context.getApplicationContext();
            f55874d = new C5477A(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f55874d;
    }

    public final Location b() {
        Location c10 = AbstractC5342g.b(this.f55875a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c11 = AbstractC5342g.b(this.f55875a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c11 == null || c10 == null) ? c11 != null ? c11 : c10 : c11.getTime() > c10.getTime() ? c11 : c10;
    }

    public final Location c(String str) {
        try {
            if (this.f55876b.isProviderEnabled(str)) {
                return this.f55876b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f55877c;
        if (e()) {
            return aVar.f55878a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f55878a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    public final boolean e() {
        return this.f55877c.f55879b > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j10;
        a aVar = this.f55877c;
        long currentTimeMillis = System.currentTimeMillis();
        z b10 = z.b();
        b10.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b10.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = b10.f56072c == 1;
        long j11 = b10.f56071b;
        long j12 = b10.f56070a;
        b10.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = b10.f56071b;
        if (j11 == -1 || j12 == -1) {
            j10 = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis > j12) {
                j11 = j13;
            } else if (currentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + 60000;
        }
        aVar.f55878a = z10;
        aVar.f55879b = j10;
    }
}
