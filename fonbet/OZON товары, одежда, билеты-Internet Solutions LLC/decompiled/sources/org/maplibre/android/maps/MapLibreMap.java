package org.maplibre.android.maps;

import Le0.C;
import Le0.C3585b;
import Le0.C3588e;
import Le0.C3590g;
import Le0.D;
import Le0.E;
import Uf.b;
import Yf.d;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.location.a;
import org.maplibre.android.maps.Style;
import org.maplibre.geojson.Feature;

/* loaded from: classes10.dex */
public final class MapLibreMap {

    /* renamed from: a, reason: collision with root package name */
    private final NativeMap f79735a;

    /* renamed from: b, reason: collision with root package name */
    private final UiSettings f79736b;

    /* renamed from: c, reason: collision with root package name */
    private final Projection f79737c;

    /* renamed from: d, reason: collision with root package name */
    private final Transform f79738d;

    /* renamed from: e, reason: collision with root package name */
    private final CameraChangeDispatcher f79739e;

    /* renamed from: f, reason: collision with root package name */
    private final OnGesturesManagerInteractionListener f79740f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f79741g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f79742h;

    /* renamed from: i, reason: collision with root package name */
    private Style.OnStyleLoaded f79743i;

    /* renamed from: j, reason: collision with root package name */
    private a f79744j;

    /* renamed from: k, reason: collision with root package name */
    private AnnotationManager f79745k;

    /* renamed from: l, reason: collision with root package name */
    private Style f79746l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f79747m;

    public interface CancelableCallback {
    }

    @Deprecated
    public interface InfoWindowAdapter {
    }

    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    public interface OnCameraMoveStartedListener {
        void onCameraMoveStarted(int i11);
    }

    public interface OnCompassAnimationListener {
        void a();

        void b();
    }

    public interface OnDeveloperAnimationListener {
        void a();
    }

    public interface OnFlingListener {
        void a();
    }

    public interface OnFpsChangedListener {
        void a();
    }

    interface OnGesturesManagerInteractionListener {
        Yf.a a();

        void b(OnMapClickListener onMapClickListener);

        void c(OnMapLongClickListener onMapLongClickListener);

        void d(C3588e.a.d dVar);

        void e(OnMapLongClickListener onMapLongClickListener);

        void f(OnMapClickListener onMapClickListener);
    }

    public interface OnInfoWindowClickListener {
    }

    public interface OnInfoWindowCloseListener {
    }

    public interface OnInfoWindowLongClickListener {
    }

    public interface OnMapClickListener {
        boolean e(@NonNull LatLng latLng);
    }

    public interface OnMapLongClickListener {
        boolean a(@NonNull LatLng latLng);
    }

    @Deprecated
    public interface OnMarkerClickListener {
    }

    public interface OnMoveListener {
        void a(@NonNull d dVar);

        void b(@NonNull d dVar);

        void c(@NonNull d dVar);
    }

    @Deprecated
    public interface OnPolygonClickListener {
    }

    @Deprecated
    public interface OnPolylineClickListener {
    }

    public interface OnRotateListener {
        void a();

        void b();

        void c();
    }

    public interface OnScaleListener {
        void a();

        void b();

        void c();
    }

    public interface OnShoveListener {
        void a();

        void b();

        void c();
    }

    public interface SnapshotReadyCallback {
    }

    MapLibreMap(NativeMap nativeMap, Transform transform, UiSettings uiSettings, Projection projection, OnGesturesManagerInteractionListener onGesturesManagerInteractionListener, CameraChangeDispatcher cameraChangeDispatcher, ArrayList arrayList) {
        this.f79735a = nativeMap;
        this.f79736b = uiSettings;
        this.f79737c = projection;
        this.f79738d = transform;
        this.f79740f = onGesturesManagerInteractionListener;
        this.f79739e = cameraChangeDispatcher;
        this.f79742h = arrayList;
    }

    private void C() {
        Iterator it = this.f79742h.iterator();
        while (it.hasNext()) {
            ((OnDeveloperAnimationListener) it.next()).a();
        }
    }

    final void A(a aVar) {
        this.f79744j = aVar;
    }

    public final void B(@NonNull b bVar) {
        C();
        this.f79738d.o(this, bVar);
    }

    final void D() {
        this.f79744j.getClass();
        Style style = this.f79746l;
        if (style != null) {
            style.g();
        }
        this.f79739e.j();
    }

    final void E() {
        this.f79743i = null;
    }

    final void F() {
        if (this.f79735a.U()) {
            return;
        }
        Style style = this.f79746l;
        ArrayList arrayList = this.f79741g;
        if (style != null) {
            style.o();
            this.f79744j.getClass();
            Style.OnStyleLoaded onStyleLoaded = this.f79743i;
            if (onStyleLoaded != null) {
                onStyleLoaded.a(this.f79746l);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Style.OnStyleLoaded) it.next()).a(this.f79746l);
            }
        } else {
            org.maplibre.android.b.c("No style to provide.");
        }
        this.f79743i = null;
        arrayList.clear();
    }

    final void G() {
        this.f79738d.m();
    }

    final void H() {
        this.f79738d.m();
        this.f79745k.g();
        this.f79745k.a(this);
    }

    final void I(@NonNull Bundle bundle) {
        CameraPosition cameraPosition = (CameraPosition) bundle.getParcelable("maplibre_cameraPosition");
        this.f79736b.w(bundle);
        if (cameraPosition != null) {
            B(org.maplibre.android.camera.a.a(new CameraPosition.a(cameraPosition).b()));
        }
        this.f79735a.E(bundle.getBoolean("maplibre_debugActive"));
    }

    final void J(@NonNull Bundle bundle) {
        bundle.putParcelable("maplibre_cameraPosition", this.f79738d.f());
        bundle.putBoolean("maplibre_debugActive", this.f79747m);
        this.f79736b.x(bundle);
    }

    final void K() {
        this.f79744j.getClass();
    }

    final void L() {
        this.f79744j.getClass();
    }

    final void M() {
        CameraPosition m11 = this.f79738d.m();
        if (m11 != null) {
            this.f79736b.H(m11);
        }
    }

    final void N() {
        this.f79745k.h();
    }

    @NonNull
    public final List<Feature> O(@NonNull PointF pointF, String... strArr) {
        return this.f79735a.s(pointF, strArr);
    }

    public final void P(@NonNull D d11) {
        this.f79739e.k(d11);
    }

    public final void Q(@NonNull E e11) {
        this.f79739e.l(e11);
    }

    public final void R(@NonNull C c11) {
        this.f79739e.m(c11);
    }

    public final void S(@NonNull OnMapClickListener onMapClickListener) {
        this.f79740f.b(onMapClickListener);
    }

    public final void T(@NonNull OnMapLongClickListener onMapLongClickListener) {
        this.f79740f.e(onMapLongClickListener);
    }

    public final void U(float f7, float f11) {
        C();
        this.f79738d.q(0.0d, f7, f11, 150L);
    }

    public final void V(double d11) {
        this.f79738d.s(d11);
    }

    public final void W(double d11) {
        this.f79738d.t(d11);
    }

    public final void X(Style.Builder builder, Style.OnStyleLoaded onStyleLoaded) {
        this.f79743i = onStyleLoaded;
        this.f79744j.getClass();
        Style style = this.f79746l;
        if (style != null) {
            style.g();
        }
        builder.getClass();
        NativeMap nativeMap = this.f79735a;
        this.f79746l = new Style(builder, nativeMap);
        if (!TextUtils.isEmpty(null)) {
            nativeMap.H();
        } else if (TextUtils.isEmpty(builder.f())) {
            nativeMap.h("{\"version\": 8,\"sources\": {},\"layers\": []}");
        } else {
            nativeMap.h(builder.f());
        }
    }

    public final void a(@NonNull OnCameraIdleListener onCameraIdleListener) {
        this.f79739e.f(onCameraIdleListener);
    }

    public final void b(@NonNull OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.f79739e.g(onCameraMoveCanceledListener);
    }

    public final void c(@NonNull C3585b c3585b) {
        this.f79739e.h(c3585b);
    }

    public final void d(@NonNull OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.f79739e.i(onCameraMoveStartedListener);
    }

    public final void e(@NonNull OnMapClickListener onMapClickListener) {
        this.f79740f.f(onMapClickListener);
    }

    public final void f(@NonNull OnMapLongClickListener onMapLongClickListener) {
        this.f79740f.c(onMapLongClickListener);
    }

    public final void g(@NonNull C3588e.a.d dVar) {
        this.f79740f.d(dVar);
    }

    @Deprecated
    public final void h(@NonNull Marker marker) {
        this.f79745k.c(marker);
    }

    public final void i(@NonNull C3590g c3590g, int i11, C3588e.b bVar) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("Null duration passed into easeCamera");
        }
        C();
        this.f79738d.e(this, c3590g, i11, bVar);
    }

    public final CameraPosition j(@NonNull LatLngBounds latLngBounds) {
        Transform transform = this.f79738d;
        double i11 = transform.i();
        double k11 = transform.k();
        return this.f79735a.f(latLngBounds, new int[]{0, 0, 0, 0}, i11, k11);
    }

    @NonNull
    public final CameraPosition k() {
        return this.f79738d.f();
    }

    @NonNull
    public final Yf.a l() {
        return this.f79740f.a();
    }

    public final float m() {
        return this.f79737c.c();
    }

    @Deprecated
    public final void n() {
        this.f79745k.e().getClass();
    }

    public final double o() {
        return this.f79738d.g();
    }

    public final double p() {
        return this.f79738d.h();
    }

    public final void q() {
        this.f79745k.e().getClass();
    }

    public final void r() {
        this.f79745k.e().getClass();
    }

    public final void s() {
        this.f79745k.e().getClass();
    }

    @NonNull
    public final Projection t() {
        return this.f79737c;
    }

    public final Style u() {
        Style style = this.f79746l;
        if (style == null || !style.n()) {
            return null;
        }
        return this.f79746l;
    }

    public final void v(@NonNull Style.OnStyleLoaded onStyleLoaded) {
        Style style = this.f79746l;
        if (style == null || !style.n()) {
            this.f79741g.add(onStyleLoaded);
        } else {
            onStyleLoaded.a(this.f79746l);
        }
    }

    @NonNull
    public final UiSettings w() {
        return this.f79736b;
    }

    public final float x() {
        return this.f79737c.f();
    }

    final void y(@NonNull Context context, @NonNull MapLibreMapOptions mapLibreMapOptions) {
        this.f79738d.l(this, mapLibreMapOptions);
        this.f79736b.f(context, mapLibreMapOptions);
        boolean x11 = mapLibreMapOptions.x();
        this.f79747m = x11;
        NativeMap nativeMap = this.f79735a;
        nativeMap.E(x11);
        String i11 = mapLibreMapOptions.i();
        if (!TextUtils.isEmpty(i11)) {
            nativeMap.J(i11);
        }
        if (mapLibreMapOptions.N()) {
            nativeMap.W(mapLibreMapOptions.M());
        } else {
            nativeMap.W(0);
        }
    }

    final void z(AnnotationManager annotationManager) {
        annotationManager.b(this);
        this.f79745k = annotationManager;
    }
}
