package org.maplibre.android.maps;

import Sf.a;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.C5153w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.maplibre.android.MapLibre;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.annotations.Polygon;
import org.maplibre.android.annotations.Polyline;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
class AnnotationManager {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final MapView f79642a;

    /* renamed from: b, reason: collision with root package name */
    private final IconManager f79643b;

    /* renamed from: d, reason: collision with root package name */
    private final C5153w<a> f79645d;

    /* renamed from: f, reason: collision with root package name */
    private MapLibreMap f79647f;

    /* renamed from: g, reason: collision with root package name */
    private AnnotationContainer f79648g;

    /* renamed from: h, reason: collision with root package name */
    private ShapeAnnotationContainer f79649h;

    /* renamed from: i, reason: collision with root package name */
    private MarkerContainer f79650i;

    /* renamed from: c, reason: collision with root package name */
    private final InfoWindowManager f79644c = new InfoWindowManager();

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList f79646e = new ArrayList();

    private static class MarkerHit {

        /* renamed from: a, reason: collision with root package name */
        private final List<Marker> f79651a;

        MarkerHit(RectF rectF, List<Marker> list) {
            this.f79651a = list;
        }
    }

    private static class MarkerHitResolver {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final Projection f79652a;

        /* renamed from: b, reason: collision with root package name */
        private long f79653b;

        MarkerHitResolver(@NonNull MapLibreMap mapLibreMap) {
            new Rect();
            new RectF();
            new RectF();
            this.f79653b = -1L;
            this.f79652a = mapLibreMap.t();
            float f7 = MapLibre.getApplicationContext().getResources().getDisplayMetrics().density;
        }

        public final long a(@NonNull MarkerHit markerHit) {
            Iterator it = markerHit.f79651a.iterator();
            if (!it.hasNext()) {
                return this.f79653b;
            }
            this.f79652a.g(((Marker) it.next()).c());
            throw null;
        }
    }

    private static class ShapeAnnotationHit {

        /* renamed from: a, reason: collision with root package name */
        private final RectF f79654a;

        ShapeAnnotationHit(RectF rectF) {
            this.f79654a = rectF;
        }
    }

    private static class ShapeAnnotationHitResolver {

        /* renamed from: a, reason: collision with root package name */
        private ShapeAnnotationContainer f79655a;

        ShapeAnnotationHitResolver(ShapeAnnotationContainer shapeAnnotationContainer) {
            this.f79655a = shapeAnnotationContainer;
        }

        public final a a(@NonNull ShapeAnnotationHit shapeAnnotationHit) {
            ArrayList a11 = this.f79655a.a(shapeAnnotationHit.f79654a);
            if (a11.size() > 0) {
                return (a) a11.get(0);
            }
            return null;
        }
    }

    AnnotationManager(@NonNull MapView mapView, C5153w c5153w, IconManager iconManager, AnnotationContainer annotationContainer, MarkerContainer markerContainer, PolygonContainer polygonContainer, PolylineContainer polylineContainer, ShapeAnnotationContainer shapeAnnotationContainer) {
        this.f79642a = mapView;
        this.f79645d = c5153w;
        this.f79643b = iconManager;
        this.f79648g = annotationContainer;
        this.f79650i = markerContainer;
        this.f79649h = shapeAnnotationContainer;
    }

    final void a(@NonNull MapLibreMap mapLibreMap) {
        C5153w<a> c5153w = this.f79645d;
        int h11 = c5153w.h();
        for (int i11 = 0; i11 < h11; i11++) {
            a b11 = c5153w.b(i11);
            if (b11 instanceof Marker) {
                ((Marker) b11).getClass();
                this.f79643b.getClass();
                throw null;
            }
        }
        Iterator it = this.f79646e.iterator();
        while (it.hasNext()) {
            Marker marker = (Marker) it.next();
            if (marker.e()) {
                marker.d();
                marker.f(mapLibreMap, this.f79642a);
            }
        }
    }

    @NonNull
    final void b(MapLibreMap mapLibreMap) {
        this.f79647f = mapLibreMap;
    }

    final void c(@NonNull Marker marker) {
        ArrayList arrayList = this.f79646e;
        if (arrayList.contains(marker)) {
            if (marker.e()) {
                marker.d();
            }
            arrayList.remove(marker);
        }
    }

    final void d() {
        ArrayList arrayList = this.f79646e;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Marker marker = (Marker) it.next();
            if (marker != null && marker.e()) {
                marker.d();
            }
        }
        arrayList.clear();
    }

    @NonNull
    final InfoWindowManager e() {
        return this.f79644c;
    }

    final boolean f(@NonNull PointF pointF) {
        this.f79643b.getClass();
        float f7 = pointF.x;
        float f11 = (int) (0 * 1.5d);
        float f12 = pointF.y;
        RectF rectF = new RectF(f7 - f11, f12 - f11, f7 + f11, f12 + f11);
        long a11 = new MarkerHitResolver(this.f79647f).a(new MarkerHit(rectF, this.f79650i.a(rectF)));
        if (a11 == -1) {
            float dimension = MapLibre.getApplicationContext().getResources().getDimension(R.dimen.maplibre_eight_dp);
            float f13 = pointF.x;
            float f14 = pointF.y;
            a a12 = new ShapeAnnotationHitResolver(this.f79649h).a(new ShapeAnnotationHit(new RectF(f13 - dimension, f14 - dimension, f13 + dimension, f14 + dimension)));
            if (a12 != null) {
                boolean z11 = a12 instanceof Polygon;
                boolean z12 = a12 instanceof Polyline;
            }
            return false;
        }
        Marker marker = (Marker) this.f79648g.a(a11);
        ArrayList arrayList = this.f79646e;
        if (arrayList.contains(marker)) {
            c(marker);
            return true;
        }
        if (arrayList.contains(marker)) {
            return true;
        }
        InfoWindowManager infoWindowManager = this.f79644c;
        infoWindowManager.getClass();
        d();
        if (marker != null && (!TextUtils.isEmpty(null) || !TextUtils.isEmpty(null))) {
            infoWindowManager.a(marker.f(this.f79647f, this.f79642a));
        }
        arrayList.add(marker);
        return true;
    }

    final void g() {
        this.f79650i.b();
    }

    final void h() {
        this.f79644c.b();
    }
}
