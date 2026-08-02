package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 extends h0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f226c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l0 f227d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f228e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(l0 l0Var, v0 v0Var) {
        super(l0Var);
        this.f227d = l0Var;
        this.f228e = v0Var;
    }

    @Override // androidx.appcompat.app.h0
    public final IntentFilter d() {
        switch (this.f226c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // androidx.appcompat.app.h0
    public final int e() {
        Location location;
        boolean z5;
        long j;
        Location location2;
        switch (this.f226c) {
            case 0:
                return z.a((PowerManager) this.f228e) ? 2 : 1;
            default:
                v0 v0Var = (v0) this.f228e;
                u0 u0Var = (u0) v0Var.f366d;
                LocationManager locationManager = (LocationManager) v0Var.f365c;
                if (u0Var.f352b > System.currentTimeMillis()) {
                    z5 = u0Var.f351a;
                } else {
                    Context context = (Context) v0Var.f364b;
                    Location location3 = null;
                    if (d0.c.b(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (d0.c.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e9) {
                            Log.d("TwilightManager", "Failed to get last known location", e9);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (t0.f346e == null) {
                            t0.f346e = new t0();
                        }
                        t0 t0Var = t0.f346e;
                        t0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        t0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z5 = t0Var.f348b == 1;
                        long j6 = t0Var.f350d;
                        long j10 = t0Var.f349c;
                        t0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j11 = t0Var.f350d;
                        if (j6 == -1 || j10 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j10) {
                                j6 = j11;
                            } else if (currentTimeMillis > j6) {
                                j6 = j10;
                            }
                            j = j6 + 60000;
                        }
                        u0Var.f351a = z5;
                        u0Var.f352b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i5 = Calendar.getInstance().get(11);
                        if (i5 < 6 || i5 >= 22) {
                            z5 = true;
                        }
                    }
                }
                return z5 ? 2 : 1;
        }
    }

    @Override // androidx.appcompat.app.h0
    public final void g() {
        switch (this.f226c) {
            case 0:
                this.f227d.k(true, true);
                break;
            default:
                this.f227d.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(l0 l0Var, Context context) {
        super(l0Var);
        this.f227d = l0Var;
        this.f228e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
