package W9;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final X9.b f13156a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f13157b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f13158c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public h f13159d;

    public interface a {
        void a(LatLng latLng);
    }

    public c(X9.b bVar) {
        this.f13156a = (X9.b) AbstractC3191o.m(bVar);
    }

    public final Y9.d a(CircleOptions circleOptions) {
        try {
            AbstractC3191o.n(circleOptions, "CircleOptions must not be null.");
            return new Y9.d(this.f13156a.p(circleOptions));
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    public final Y9.e b(MarkerOptions markerOptions) {
        try {
            AbstractC3191o.n(markerOptions, "MarkerOptions must not be null.");
            zzaj U10 = this.f13156a.U(markerOptions);
            if (U10 != null) {
                return markerOptions.f0() == 1 ? new Y9.a(U10) : new Y9.e(U10);
            }
            return null;
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    public final void c() {
        try {
            this.f13156a.clear();
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    public final h d() {
        try {
            if (this.f13159d == null) {
                this.f13159d = new h(this.f13156a.q0());
            }
            return this.f13159d;
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    public final void e(W9.a aVar) {
        try {
            AbstractC3191o.n(aVar, "CameraUpdate must not be null.");
            this.f13156a.C(aVar.a());
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    public void f(LatLngBounds latLngBounds) {
        try {
            this.f13156a.n(latLngBounds);
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    public final void g(boolean z10) {
        try {
            this.f13156a.B0(z10);
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }

    public final void h(a aVar) {
        try {
            if (aVar == null) {
                this.f13156a.k0(null);
            } else {
                this.f13156a.k0(new m(this, aVar));
            }
        } catch (RemoteException e10) {
            throw new Y9.f(e10);
        }
    }
}
