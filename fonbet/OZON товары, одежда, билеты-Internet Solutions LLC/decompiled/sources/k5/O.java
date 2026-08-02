package k5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import k5.InterfaceC7518g2;

/* loaded from: classes8.dex */
final class O extends D0<Om0.c> implements InterfaceC7518g2<String>, LocationListener {

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f70619e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final Context f70620f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final AbstractC7520h0 f70621g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final Mm0.c f70622h;

    /* renamed from: i, reason: collision with root package name */
    private final LocationManager f70623i;

    O(@NonNull HashSet hashSet, @NonNull Context context, @NonNull AbstractC7520h0 abstractC7520h0, @NonNull Mm0.c cVar, LocationManager locationManager, @NonNull s3 s3Var, @NonNull C7498b2 c7498b2, @NonNull C7524i0 c7524i0, @NonNull U u11, @NonNull C7519h c7519h, @NonNull C7527j c7527j, @NonNull C7529j1 c7529j1, @NonNull S s11, @NonNull P0 p02, @NonNull S0 s02) {
        super(Mm0.e.GeoLocationInfo);
        ArrayList arrayList = new ArrayList();
        this.f70619e = arrayList;
        this.f70620f = context;
        this.f70621g = abstractC7520h0;
        this.f70622h = cVar;
        this.f70623i = locationManager;
        if (hashSet.contains(Mm0.e.Longitude)) {
            arrayList.add(s3Var);
        }
        if (hashSet.contains(Mm0.e.Latitude)) {
            arrayList.add(c7498b2);
        }
        if (hashSet.contains(Mm0.e.GeoProvider)) {
            arrayList.add(c7524i0);
        }
        if (hashSet.contains(Mm0.e.Altitude)) {
            arrayList.add(u11);
        }
        if (hashSet.contains(Mm0.e.HorizontalAccuracy)) {
            arrayList.add(c7519h);
        }
        if (hashSet.contains(Mm0.e.AltitudeAccuracy)) {
            arrayList.add(c7527j);
        }
        if (hashSet.contains(Mm0.e.Heading)) {
            arrayList.add(c7529j1);
        }
        if (hashSet.contains(Mm0.e.Speed)) {
            arrayList.add(s11);
        }
        if (hashSet.contains(Mm0.e.Status)) {
            arrayList.add(p02);
        }
        if (hashSet.contains(Mm0.e.Timestamp)) {
            arrayList.add(s02);
        }
    }

    @Override // k5.InterfaceC7518g2
    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public final InterfaceC7518g2.a mo68c() {
        return new N(this);
    }

    @Override // k5.InterfaceC7500c0
    @NonNull
    public final AbstractC7520h0 f() {
        return this.f70621g;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i11, Bundle bundle) {
    }

    @Override // k5.D0
    @NonNull
    protected final Om0.c s() throws D1 {
        return new Om0.c(1);
    }

    @Override // k5.D0
    @SuppressLint({"MissingPermission"})
    public final Om0.c u() throws Mm0.a, D1 {
        boolean z11;
        String str;
        Om0.c cVar = (Om0.c) super.u();
        Objects.requireNonNull(cVar);
        Om0.a aVar = new Om0.a();
        ArrayList arrayList = this.f70619e;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            Object obj = (D0) it.next();
            if ((obj instanceof U) && ((InterfaceC7500c0) obj).p(this.f70622h.a()) != null) {
                z11 = true;
                break;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            D0 d02 = (D0) it2.next();
            Mm0.e x11 = d02.x();
            String name = x11.name();
            try {
                Serializable u11 = d02.u();
                if (u11 != null) {
                    aVar.put(name, u11);
                }
            } catch (D1 e11) {
                if (x11.f()) {
                    aVar.put(name, e11.a(x11));
                } else {
                    aVar.remove(name);
                }
            }
        }
        LocationManager locationManager = this.f70623i;
        if ((locationManager == null || c3.b(locationManager) == null) && !z11) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                D0 d03 = (D0) it3.next();
                if ((d03 instanceof P0) && (str = (String) aVar.get(d03.x().name())) != null && str.equals("0")) {
                    aVar.put(d03.x().name(), "2");
                    if (locationManager != null && locationManager.isProviderEnabled("gps")) {
                        new N(this).run();
                    }
                }
            }
        }
        cVar.add(aVar);
        return cVar;
    }
}
