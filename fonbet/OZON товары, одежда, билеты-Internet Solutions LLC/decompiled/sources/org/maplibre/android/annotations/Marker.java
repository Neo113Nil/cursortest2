package org.maplibre.android.annotations;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;

@Deprecated
/* loaded from: classes10.dex */
public class Marker extends Sf.a {

    /* renamed from: c, reason: collision with root package name */
    private c f79583c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f79584d;

    @Keep
    private String iconId;

    @Keep
    private LatLng position;

    Marker() {
    }

    public final LatLng c() {
        return this.position;
    }

    public final void d() {
        c cVar = this.f79583c;
        if (cVar != null) {
            cVar.d();
        }
        this.f79584d = false;
    }

    public final boolean e() {
        return this.f79584d;
    }

    public final c f(@NonNull MapLibreMap mapLibreMap, @NonNull MapView mapView) {
        this.f26193b = mapLibreMap;
        mapLibreMap.n();
        if (this.f79583c == null && mapView.getContext() != null) {
            this.f79583c = new c(this.f26193b, mapView);
        }
        c cVar = this.f79583c;
        if (mapView.getContext() != null) {
            cVar.c(this, mapLibreMap, mapView);
        }
        cVar.f(mapView, this, this.position);
        this.f79584d = true;
        return cVar;
    }

    public final String toString() {
        return "Marker [position[" + this.position + "]]";
    }
}
