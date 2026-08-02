package com.my.tracker.obfuscated;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import xsna.od6;
import xsna.xy6;

/* loaded from: classes.dex */
public final class a1 {
    protected Location a;
    LocationManager c;
    int d = -1;
    protected final LocationListener b = new a();

    public class a implements LocationListener {
        public a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            x2.a("LocationDataProvider: location has been updated");
            a1 a1Var = a1.this;
            a1Var.a = location;
            LocationManager locationManager = a1Var.c;
            if (locationManager != null) {
                locationManager.removeUpdates(this);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            x2.a("LocationDataProvider: onProviderDisabled, provider – " + str);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            x2.a("LocationDataProvider: onProviderEnabled, provider –" + str);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            StringBuilder b = xy6.b(i, "LocationDataProvider: onStatusChanged, provider – ", str, ", status – ", ", extras – ");
            b.append(bundle);
            x2.a(b.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public z0 a(int i, Context context) {
        float f;
        long j;
        String str;
        int i2;
        if (i == 0) {
            return z0.g;
        }
        this.d = -1;
        if (!m1.a("android.permission.ACCESS_FINE_LOCATION", context) || !m1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
            return z0.g;
        }
        if (m1.a()) {
            return z0.g;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        this.c = locationManager;
        if (locationManager == null) {
            return z0.g;
        }
        int i3 = 2;
        if (i == 2) {
            a();
        }
        Location location = this.a;
        if (location != null) {
            f = location.getAccuracy();
            j = location.getTime();
            str = location.getProvider();
        } else {
            location = null;
            f = Float.MAX_VALUE;
            j = 0;
            str = null;
        }
        for (String str2 : this.c.getAllProviders()) {
            try {
                Location lastKnownLocation = this.c.getLastKnownLocation(str2);
                if (lastKnownLocation != null) {
                    float accuracy = lastKnownLocation.getAccuracy();
                    long time = lastKnownLocation.getTime();
                    if (location == null || (time > j && accuracy < f)) {
                        str = str2;
                        location = lastKnownLocation;
                        f = accuracy;
                        j = time;
                    }
                }
            } catch (SecurityException unused) {
                x2.a("LocationDataProvider: Permission android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION check was positive, but still got security exception on the location provider");
            }
        }
        if (location == null) {
            return z0.g;
        }
        str.getClass();
        switch (str) {
            case "passive":
                i3 = 4;
                i2 = i3;
                break;
            case "gps":
                i2 = i3;
                break;
            case "network":
                i3 = 3;
                i2 = i3;
                break;
            default:
                i2 = 1;
                break;
        }
        return new z0(i2, location.getLatitude(), location.getLongitude(), location.getSpeed(), location.getAccuracy(), location.getTime());
    }

    public void a() {
        if (this.c != null) {
            Criteria criteria = new Criteria();
            criteria.setAccuracy(1);
            String bestProvider = this.c.getBestProvider(criteria, true);
            x2.a("LocationDataProvider: best provider is " + bestProvider);
            if (bestProvider != null) {
                m.f(new od6(9, this, bestProvider));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.c.requestLocationUpdates(str, 2000L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.b);
    }
}
