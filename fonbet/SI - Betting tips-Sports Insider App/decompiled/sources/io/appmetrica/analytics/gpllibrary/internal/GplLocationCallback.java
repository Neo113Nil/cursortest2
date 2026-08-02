package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import p7.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class GplLocationCallback extends b {

    /* renamed from: a, reason: collision with root package name */
    private final LocationListener f11800a;

    public GplLocationCallback(LocationListener locationListener) {
        this.f11800a = locationListener;
    }

    @Override // p7.b
    public void onLocationResult(LocationResult locationResult) {
        LocationListener locationListener = this.f11800a;
        List list = locationResult.f5728a;
        int size = list.size();
        locationListener.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
    }
}
