package oe0;

import Sc.r;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import xe.C10737n;

/* loaded from: classes3.dex */
public final class I implements LocationListener {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ LocationManager f78129c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10737n f78130d;

    I(LocationManager locationManager, C10737n c10737n) {
        this.f78129c = locationManager;
        this.f78130d = c10737n;
    }

    @Override // android.location.LocationListener
    public final void onFlushComplete(int i11) {
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f78129c.removeUpdates(this);
        r.Companion companion = Sc.r.INSTANCE;
        this.f78130d.resumeWith(location);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i11, Bundle bundle) {
    }
}
