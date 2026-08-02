package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import w7.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class GplOnSuccessListener implements d {

    /* renamed from: a, reason: collision with root package name */
    private final LocationListener f11801a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.f11801a = locationListener;
    }

    @Override // w7.d
    public void onSuccess(Location location) {
        this.f11801a.onLocationChanged(location);
    }
}
