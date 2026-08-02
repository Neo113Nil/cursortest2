package org.maplibre.android.location;

import ag.e;
import ag.f;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.maps.MapLibreMap;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final MapLibreMap f79630a;

    /* renamed from: b, reason: collision with root package name */
    private CameraPosition f79631b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private MapLibreMap.OnCameraMoveListener f79632c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private MapLibreMap.OnCameraIdleListener f79633d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final MapLibreMap.OnDeveloperAnimationListener f79634e;

    /* renamed from: org.maplibre.android.location.a$a, reason: collision with other inner class name */
    final class C1341a implements MapLibreMap.OnDeveloperAnimationListener {
        C1341a() {
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnDeveloperAnimationListener
        public final void a() {
            a.this.getClass();
        }
    }

    final class b implements MapLibreMap.OnCameraMoveListener {
        b() {
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnCameraMoveListener
        public final void onCameraMove() {
            a.a(a.this);
        }
    }

    final class c implements MapLibreMap.OnCameraIdleListener {
        c() {
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnCameraIdleListener
        public final void onCameraIdle() {
            a.a(a.this);
        }
    }

    static final class d implements ag.c<f> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<a> f79638a;

        d(a aVar) {
            this.f79638a = new WeakReference<>(aVar);
        }

        @Override // ag.c
        public final void a(f fVar) {
            if (this.f79638a.get() != null) {
                fVar.b();
            }
        }
    }

    static final class e implements ag.c<f> {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<a> f79639a;

        e(a aVar) {
            this.f79639a = new WeakReference<>(aVar);
        }

        @Override // ag.c
        public final void a(f fVar) {
            if (this.f79639a.get() != null) {
                fVar.b();
            }
        }
    }

    public a(@NonNull MapLibreMap mapLibreMap, @NonNull ArrayList arrayList) {
        e.a aVar = new e.a(1000L);
        aVar.f();
        aVar.d();
        new d(this);
        new e(this);
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        this.f79632c = new b();
        this.f79633d = new c();
        C1341a c1341a = new C1341a();
        this.f79634e = c1341a;
        this.f79630a = mapLibreMap;
        arrayList.add(c1341a);
    }

    static void a(a aVar) {
        CameraPosition k11 = aVar.f79630a.k();
        CameraPosition cameraPosition = aVar.f79631b;
        if (cameraPosition == null) {
            aVar.f79631b = k11;
            double d11 = k11.bearing;
            throw null;
        }
        if (k11.bearing != cameraPosition.bearing) {
            throw null;
        }
        if (k11.tilt != cameraPosition.tilt) {
            throw null;
        }
        if (k11.zoom != cameraPosition.zoom) {
            throw new org.maplibre.android.location.b("The LocationComponent has to be activated with one of the LocationComponent#activateLocationComponent overloads before any other methods are invoked.");
        }
        aVar.f79631b = k11;
    }

    a() {
        e.a aVar = new e.a(1000L);
        aVar.f();
        aVar.d();
        new d(this);
        new e(this);
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        this.f79632c = new b();
        this.f79633d = new c();
        this.f79634e = new C1341a();
        this.f79630a = null;
    }
}
