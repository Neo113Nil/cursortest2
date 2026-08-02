package org.maplibre.android.maps;

import Le0.C3588e;
import Le0.C3590g;
import Uf.b;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.camera.a;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.MapView;

/* loaded from: classes10.dex */
public class Transform implements MapView.OnCameraDidChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final NativeMap f79839a;

    /* renamed from: b, reason: collision with root package name */
    private final MapView f79840b;

    /* renamed from: d, reason: collision with root package name */
    private CameraPosition f79842d;

    /* renamed from: e, reason: collision with root package name */
    private C3588e.b f79843e;

    /* renamed from: f, reason: collision with root package name */
    private CameraChangeDispatcher f79844f;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f79841c = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    private final MapView.OnCameraDidChangeListener f79845g = new MapView.OnCameraDidChangeListener() { // from class: org.maplibre.android.maps.Transform.1
        @Override // org.maplibre.android.maps.MapView.OnCameraDidChangeListener
        public final void d(boolean z11) {
            if (z11) {
                Transform transform = Transform.this;
                transform.f79844f.onCameraIdle();
                transform.f79840b.removeOnCameraDidChangeListener(this);
            }
        }
    };

    /* renamed from: org.maplibre.android.maps.Transform$3, reason: invalid class name */
    class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    Transform(MapView mapView, NativeMap nativeMap, CameraChangeDispatcher cameraChangeDispatcher) {
        this.f79840b = mapView;
        this.f79839a = nativeMap;
        this.f79844f = cameraChangeDispatcher;
    }

    final void c() {
        CameraChangeDispatcher cameraChangeDispatcher = this.f79844f;
        cameraChangeDispatcher.onCameraMoveCanceled();
        final C3588e.b bVar = this.f79843e;
        if (bVar != null) {
            cameraChangeDispatcher.onCameraIdle();
            this.f79843e = null;
            this.f79841c.post(new Runnable() { // from class: org.maplibre.android.maps.Transform.4
                @Override // java.lang.Runnable
                public final void run() {
                    C3588e.b.this.a();
                }
            });
        }
        this.f79839a.c();
        cameraChangeDispatcher.onCameraIdle();
    }

    @Override // org.maplibre.android.maps.MapView.OnCameraDidChangeListener
    public final void d(boolean z11) {
        if (z11) {
            m();
            final C3588e.b bVar = this.f79843e;
            if (bVar != null) {
                this.f79843e = null;
                this.f79841c.post(new Runnable() { // from class: org.maplibre.android.maps.Transform.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3588e.b.this.b();
                    }
                });
            }
            this.f79844f.onCameraIdle();
            this.f79840b.removeOnCameraDidChangeListener(this);
        }
    }

    final void e(@NonNull MapLibreMap mapLibreMap, C3590g c3590g, int i11, C3588e.b bVar) {
        CameraPosition a11 = c3590g.a(mapLibreMap);
        if (a11.equals(this.f79842d)) {
            bVar.b();
            return;
        }
        c();
        this.f79844f.onCameraMoveStarted(3);
        this.f79843e = bVar;
        this.f79840b.addOnCameraDidChangeListener(this);
        this.f79839a.b(a11.target, a11.zoom, a11.bearing, a11.tilt, a11.padding, i11);
    }

    public final CameraPosition f() {
        if (this.f79842d == null) {
            this.f79842d = m();
        }
        return this.f79842d;
    }

    final double g() {
        return this.f79839a.getMaxZoom();
    }

    final double h() {
        return this.f79839a.getMinZoom();
    }

    final double i() {
        return this.f79839a.getBearing();
    }

    final double j() {
        return this.f79839a.C();
    }

    final double k() {
        return this.f79839a.O();
    }

    final void l(@NonNull MapLibreMap mapLibreMap, @NonNull MapLibreMapOptions mapLibreMapOptions) {
        CameraPosition o11 = mapLibreMapOptions.o();
        if (o11 != null && !o11.equals(CameraPosition.f79608a)) {
            o(mapLibreMap, a.a(o11));
        }
        t(mapLibreMapOptions.K());
        s(mapLibreMapOptions.H());
        double J11 = mapLibreMapOptions.J();
        NativeMap nativeMap = this.f79839a;
        if (J11 < 0.0d || J11 > 60.0d) {
            Logger.e("Mbgl-Transform", "Not setting minPitchPreference, value is in unsupported range: " + J11);
        } else {
            nativeMap.P(J11);
        }
        double G11 = mapLibreMapOptions.G();
        if (G11 >= 0.0d && G11 <= 60.0d) {
            nativeMap.j(G11);
            return;
        }
        Logger.e("Mbgl-Transform", "Not setting maxPitchPreference, value is in unsupported range: " + G11);
    }

    final CameraPosition m() {
        NativeMap nativeMap = this.f79839a;
        if (nativeMap != null) {
            CameraPosition cameraPosition = nativeMap.getCameraPosition();
            CameraPosition cameraPosition2 = this.f79842d;
            if (cameraPosition2 != null && !cameraPosition2.equals(cameraPosition)) {
                this.f79844f.onCameraMove();
            }
            this.f79842d = cameraPosition;
        }
        return this.f79842d;
    }

    final void n(double d11, double d12, long j11) {
        if (j11 > 0) {
            this.f79840b.addOnCameraDidChangeListener(this.f79845g);
        }
        this.f79839a.A(d11, d12, j11);
    }

    public final void o(@NonNull MapLibreMap mapLibreMap, b bVar) {
        CameraPosition a11 = bVar.a(mapLibreMap);
        if (a11.equals(this.f79842d)) {
            return;
        }
        c();
        CameraChangeDispatcher cameraChangeDispatcher = this.f79844f;
        cameraChangeDispatcher.onCameraMoveStarted(3);
        this.f79839a.v(a11.target, a11.zoom, a11.tilt, a11.bearing, a11.padding);
        m();
        cameraChangeDispatcher.onCameraIdle();
        this.f79841c.post(new AnonymousClass3());
    }

    final void p(double d11, float f7, float f11) {
        this.f79839a.p(d11, f7, f11, 0L);
    }

    final void q(double d11, float f7, float f11, long j11) {
        this.f79839a.p(d11, f7, f11, j11);
    }

    final void r(boolean z11) {
        this.f79839a.Q(z11);
        if (z11) {
            return;
        }
        m();
    }

    final void s(double d11) {
        if (d11 >= 0.0d && d11 <= 25.5d) {
            this.f79839a.i(d11);
            return;
        }
        Logger.e("Mbgl-Transform", "Not setting maxZoomPreference, value is in unsupported range: " + d11);
    }

    final void t(double d11) {
        if (d11 >= 0.0d && d11 <= 25.5d) {
            this.f79839a.z(d11);
            return;
        }
        Logger.e("Mbgl-Transform", "Not setting minZoomPreference, value is in unsupported range: " + d11);
    }

    final void u(Double d11) {
        this.f79839a.T(d11.doubleValue());
    }

    final void v(double d11, @NonNull PointF pointF) {
        this.f79839a.V(d11, pointF);
    }

    final void w(double d11, @NonNull PointF pointF) {
        v(this.f79839a.C() + d11, pointF);
    }
}
