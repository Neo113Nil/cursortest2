package W9;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static X9.a f13155a;

    public static a a(LatLngBounds latLngBounds, int i10) {
        AbstractC3191o.n(latLngBounds, "bounds must not be null");
        try {
            return new a(d().e(latLngBounds, i10));
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    public static a b(LatLng latLng, float f10) {
        AbstractC3191o.n(latLng, "latLng must not be null");
        try {
            return new a(d().R(latLng, f10));
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    public static void c(X9.a aVar) {
        f13155a = (X9.a) AbstractC3191o.m(aVar);
    }

    public static X9.a d() {
        return (X9.a) AbstractC3191o.n(f13155a, "CameraUpdateFactory is not initialized");
    }
}
