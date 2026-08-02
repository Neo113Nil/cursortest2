package org.maplibre.android.maps;

import B0.A0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.maplibre.android.a;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.annotations.Polygon;
import org.maplibre.android.annotations.Polyline;
import org.maplibre.android.b;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.geometry.ProjectedMeters;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.storage.FileSource;
import org.maplibre.android.style.layers.CannotAddLayerException;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.layers.RasterLayer;
import org.maplibre.android.style.layers.TransitionOptions;
import org.maplibre.android.style.light.Light;
import org.maplibre.android.style.sources.CannotAddSourceException;
import org.maplibre.android.style.sources.Source;
import org.maplibre.android.tile.TileOperation;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Geometry;

/* loaded from: classes10.dex */
final class NativeMapView implements NativeMap {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f79808g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final FileSource f79809a;

    /* renamed from: b, reason: collision with root package name */
    private final MapRenderer f79810b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final Thread f79811c;

    /* renamed from: d, reason: collision with root package name */
    private StateCallback f79812d;

    /* renamed from: e, reason: collision with root package name */
    private final float f79813e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f79814f;

    @Keep
    private long nativePtr;

    /* renamed from: org.maplibre.android.maps.NativeMapView$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* renamed from: org.maplibre.android.maps.NativeMapView$1$1, reason: invalid class name and collision with other inner class name */
        class C13421 implements MapLibreMap.OnFpsChangedListener {
            @Override // org.maplibre.android.maps.MapLibreMap.OnFpsChangedListener
            public final void a() {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i11 = NativeMapView.f79808g;
            throw null;
        }
    }

    interface StateCallback extends StyleCallback {
        void a();

        void b();

        void c();

        void d(boolean z11);

        boolean e(String str);

        void g();

        void h(boolean z11);

        void i(String str);

        void k();

        void l(boolean z11, RenderingStats renderingStats);

        void m(String str, String str2);

        void n(boolean z11);

        void o(String[] strArr, int i11, int i12);

        void p(String str, String str2);

        void q(int i11, int i12, String str);

        void r(int i11, int i12, String str);

        void s(TileOperation tileOperation, int i11, int i12, int i13, int i14, int i15, String str);

        void t(String str, String str2);

        void u(int i11, int i12, String str);

        void v(String[] strArr, int i11, int i12);

        void w(String str);

        void x(String[] strArr, int i11, int i12);

        void y(String str);
    }

    interface StyleCallback {
        void f();

        void j();
    }

    public interface ViewCallback {
    }

    static {
        a.a();
    }

    public NativeMapView(@NonNull Context context, MapLibreMapOptions mapLibreMapOptions, MapView mapView, StateCallback stateCallback, MapRenderer mapRenderer) {
        NativeMapOptions nativeMapOptions = new NativeMapOptions(mapLibreMapOptions);
        this.f79814f = false;
        this.nativePtr = 0L;
        this.f79810b = mapRenderer;
        FileSource b11 = FileSource.b(context);
        this.f79809a = b11;
        this.f79813e = nativeMapOptions.pixelRatio();
        this.f79811c = Thread.currentThread();
        this.f79812d = stateCallback;
        nativeInitialize(this, b11, mapRenderer, nativeMapOptions);
    }

    private boolean X(String str) {
        if (this.f79811c != Thread.currentThread()) {
            throw new Wf.a(A0.b("Map interactions should happen on the UI thread. Method invoked from wrong thread is ", str, "."));
        }
        if (this.f79814f && !TextUtils.isEmpty(str)) {
            String str2 = "You're calling `" + str + "` after the `MapView` was destroyed, were you invoking it after `onDestroy()`?";
            Logger.e("Mbgl-NativeMapView", str2);
            b.c(str2);
        }
        return this.f79814f;
    }

    private double[] Y(double[] dArr) {
        if (dArr == null) {
            dArr = null;
        }
        if (dArr == null) {
            return null;
        }
        double d11 = dArr[1];
        double d12 = this.f79813e;
        return new double[]{d11 / d12, dArr[0] / d12, dArr[3] / d12, dArr[2] / d12};
    }

    @Keep
    private native void nativeAddAnnotationIcon(String str, int i11, int i12, float f7, byte[] bArr);

    @Keep
    private native void nativeAddImage(String str, Bitmap bitmap, float f7, boolean z11);

    @Keep
    private native void nativeAddImages(Image[] imageArr);

    @Keep
    private native void nativeAddLayer(long j11, String str) throws CannotAddLayerException;

    @Keep
    private native void nativeAddLayerAbove(long j11, String str) throws CannotAddLayerException;

    @Keep
    private native void nativeAddLayerAt(long j11, int i11) throws CannotAddLayerException;

    @NonNull
    @Keep
    private native long[] nativeAddMarkers(Marker[] markerArr);

    @NonNull
    @Keep
    private native long[] nativeAddPolygons(Polygon[] polygonArr);

    @NonNull
    @Keep
    private native long[] nativeAddPolylines(Polyline[] polylineArr);

    @Keep
    private native void nativeAddSource(Source source, long j11) throws CannotAddSourceException;

    @Keep
    private native void nativeCancelTransitions();

    @Keep
    private native void nativeClearActionJournalLog();

    @Keep
    private native void nativeDestroy();

    @Keep
    private native void nativeEaseTo(double d11, double d12, double d13, long j11, double d14, double d15, double[] dArr, boolean z11);

    @Keep
    private native void nativeEnableRenderingStatsView(boolean z11);

    @Keep
    private native void nativeFlyTo(double d11, double d12, double d13, long j11, double d14, double d15, double[] dArr);

    @Keep
    private native String[] nativeGetActionJournalLog();

    @Keep
    private native String[] nativeGetActionJournalLogFiles();

    @Keep
    private native double nativeGetBearing();

    @NonNull
    @Keep
    private native CameraPosition nativeGetCameraForGeometry(Geometry geometry, double d11, double d12, double d13, double d14, double d15, double d16);

    @NonNull
    @Keep
    private native CameraPosition nativeGetCameraForLatLngBounds(LatLngBounds latLngBounds, double d11, double d12, double d13, double d14, double d15, double d16);

    @NonNull
    @Keep
    private native CameraPosition nativeGetCameraPosition();

    @Keep
    private native boolean nativeGetDebug();

    @NonNull
    @Keep
    private native Bitmap nativeGetImage(String str);

    @NonNull
    @Keep
    private native LatLng nativeGetLatLng();

    @NonNull
    @Keep
    private native Layer nativeGetLayer(String str);

    @NonNull
    @Keep
    private native Layer[] nativeGetLayers();

    @NonNull
    @Keep
    private native Light nativeGetLight();

    @Keep
    private native double nativeGetMaxPitch();

    @Keep
    private native double nativeGetMaxZoom();

    @Keep
    private native double nativeGetMetersPerPixelAtLatitude(double d11, double d12);

    @Keep
    private native double nativeGetMinPitch();

    @Keep
    private native double nativeGetMinZoom();

    @Keep
    private native double nativeGetPitch();

    @Keep
    private native boolean nativeGetPrefetchTiles();

    @Keep
    private native int nativeGetPrefetchZoomDelta();

    @NonNull
    @Keep
    private native Source nativeGetSource(String str);

    @NonNull
    @Keep
    private native Source[] nativeGetSources();

    @NonNull
    @Keep
    private native String nativeGetStyleJson();

    @NonNull
    @Keep
    private native String nativeGetStyleUrl();

    @Keep
    private native boolean nativeGetTileCacheEnabled();

    @Keep
    private native double nativeGetTileLodMinRadius();

    @Keep
    private native double nativeGetTileLodPitchThreshold();

    @Keep
    private native double nativeGetTileLodScale();

    @Keep
    private native double nativeGetTileLodZoomShift();

    @Keep
    private native double nativeGetTopOffsetPixelsForAnnotationSymbol(String str);

    @Keep
    private native long nativeGetTransitionDelay();

    @Keep
    private native long nativeGetTransitionDuration();

    @NonNull
    @Keep
    private native TransitionOptions nativeGetTransitionOptions();

    @Keep
    private native void nativeGetVisibleCoordinateBounds(double[] dArr);

    @Keep
    private native double nativeGetZoom();

    @Keep
    private native void nativeInitialize(NativeMapView nativeMapView, FileSource fileSource, MapRenderer mapRenderer, NativeMapOptions nativeMapOptions);

    @Keep
    private native boolean nativeIsFullyLoaded();

    @Keep
    private native boolean nativeIsRenderingStatsViewEnabled();

    @Keep
    private native void nativeJumpTo(double d11, double d12, double d13, double d14, double d15, double[] dArr);

    @NonNull
    @Keep
    private native LatLng nativeLatLngForPixel(float f7, float f11);

    @NonNull
    @Keep
    private native LatLng nativeLatLngForProjectedMeters(double d11, double d12);

    @Keep
    private native void nativeLatLngsForPixels(double[] dArr, double[] dArr2, float f7);

    @Keep
    private native void nativeMoveBy(double d11, double d12, long j11);

    @Keep
    private native void nativeOnLowMemory();

    @NonNull
    @Keep
    private native PointF nativePixelForLatLng(double d11, double d12);

    @Keep
    private native void nativePixelsForLatLngs(double[] dArr, double[] dArr2, float f7);

    @NonNull
    @Keep
    private native ProjectedMeters nativeProjectedMetersForLatLng(double d11, double d12);

    @NonNull
    @Keep
    private native long[] nativeQueryPointAnnotations(RectF rectF);

    @NonNull
    @Keep
    private native Feature[] nativeQueryRenderedFeaturesForBox(float f7, float f11, float f12, float f13, String[] strArr, Object[] objArr);

    @NonNull
    @Keep
    private native Feature[] nativeQueryRenderedFeaturesForPoint(float f7, float f11, String[] strArr, Object[] objArr);

    @NonNull
    @Keep
    private native long[] nativeQueryShapeAnnotations(RectF rectF);

    @Keep
    private native void nativeRemoveAnnotationIcon(String str);

    @Keep
    private native void nativeRemoveAnnotations(long[] jArr);

    @Keep
    private native void nativeRemoveImage(String str);

    @Keep
    private native boolean nativeRemoveLayer(long j11);

    @Keep
    private native boolean nativeRemoveLayerAt(int i11);

    @Keep
    private native boolean nativeRemoveSource(Source source, long j11);

    @Keep
    private native void nativeResetNorth();

    @Keep
    private native void nativeResetPosition();

    @Keep
    private native void nativeResetZoom();

    @Keep
    private native void nativeResizeView(int i11, int i12);

    @Keep
    private native void nativeRotateBy(double d11, double d12, double d13, double d14, long j11);

    @Keep
    private native void nativeSetBearing(double d11, long j11);

    @Keep
    private native void nativeSetBearingXY(double d11, double d12, double d13, long j11);

    @Keep
    private native void nativeSetDebug(boolean z11);

    @Keep
    private native void nativeSetFrustumOffset(RectF rectF);

    @Keep
    private native void nativeSetGestureInProgress(boolean z11);

    @Keep
    private native void nativeSetLatLng(double d11, double d12, double[] dArr, long j11);

    @Keep
    private native void nativeSetLatLngBounds(LatLngBounds latLngBounds);

    @Keep
    private native void nativeSetMaxPitch(double d11);

    @Keep
    private native void nativeSetMaxZoom(double d11);

    @Keep
    private native void nativeSetMinPitch(double d11);

    @Keep
    private native void nativeSetMinZoom(double d11);

    @Keep
    private native void nativeSetPitch(double d11, long j11);

    @Keep
    private native void nativeSetPrefetchTiles(boolean z11);

    @Keep
    private native void nativeSetPrefetchZoomDelta(int i11);

    @Keep
    private native void nativeSetReachability(boolean z11);

    @Keep
    private native void nativeSetStyleJson(String str);

    @Keep
    private native void nativeSetStyleUrl(String str);

    @Keep
    private native void nativeSetTileCacheEnabled(boolean z11);

    @Keep
    private native void nativeSetTileLodMinRadius(double d11);

    @Keep
    private native void nativeSetTileLodPitchThreshold(double d11);

    @Keep
    private native void nativeSetTileLodScale(double d11);

    @Keep
    private native void nativeSetTileLodZoomShift(double d11);

    @Keep
    private native void nativeSetTransitionDelay(long j11);

    @Keep
    private native void nativeSetTransitionDuration(long j11);

    @Keep
    private native void nativeSetTransitionOptions(TransitionOptions transitionOptions);

    @Keep
    private native void nativeSetVisibleCoordinateBounds(LatLng[] latLngArr, RectF rectF, double d11, long j11);

    @Keep
    private native void nativeSetZoom(double d11, double d12, double d13, long j11);

    @Keep
    private native void nativeTakeSnapshot();

    @Keep
    private native void nativeTriggerRepaint();

    @Keep
    private native void nativeUpdateMarker(long j11, double d11, double d12, String str);

    @Keep
    private native void nativeUpdatePolygon(long j11, Polygon polygon);

    @Keep
    private native void nativeUpdatePolyline(long j11, Polyline polyline);

    @Keep
    private void onCameraDidChange(boolean z11) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.d(z11);
        }
    }

    @Keep
    private void onCameraIsChanging() {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.a();
        }
    }

    @Keep
    private void onCameraWillChange(boolean z11) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.n(z11);
        }
    }

    @Keep
    private boolean onCanRemoveUnusedStyleImage(String str) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            return stateCallback.e(str);
        }
        return true;
    }

    @Keep
    private void onDidBecomeIdle() {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.k();
        }
    }

    @Keep
    private void onDidFailLoadingMap(String str) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.w(str);
        }
    }

    @Keep
    private void onDidFinishLoadingMap() {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.g();
        }
    }

    @Keep
    private void onDidFinishLoadingStyle() {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.j();
        }
    }

    @Keep
    private void onDidFinishRenderingFrame(boolean z11, RenderingStats renderingStats) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.l(z11, renderingStats);
        }
    }

    @Keep
    private void onDidFinishRenderingMap(boolean z11) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.h(z11);
        }
    }

    @Keep
    private void onGlyphsError(String[] strArr, int i11, int i12) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.v(strArr, i11, i12);
        }
    }

    @Keep
    private void onGlyphsLoaded(String[] strArr, int i11, int i12) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.o(strArr, i11, i12);
        }
    }

    @Keep
    private void onGlyphsRequested(String[] strArr, int i11, int i12) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.x(strArr, i11, i12);
        }
    }

    @Keep
    private void onPostCompileShader(int i11, int i12, String str) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.q(i11, i12, str);
        }
    }

    @Keep
    private void onPreCompileShader(int i11, int i12, String str) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.r(i11, i12, str);
        }
    }

    @Keep
    private void onShaderCompileFailed(int i11, int i12, String str) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.u(i11, i12, str);
        }
    }

    @Keep
    private void onSourceChanged(String str) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.y(str);
        }
    }

    @Keep
    private void onSpriteError(String str, String str2) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.p(str, str2);
        }
    }

    @Keep
    private void onSpriteLoaded(String str, String str2) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.t(str, str2);
        }
    }

    @Keep
    private void onSpriteRequested(String str, String str2) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.m(str, str2);
        }
    }

    @Keep
    private void onStyleImageMissing(String str) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.i(str);
        }
    }

    @Keep
    private void onTileAction(TileOperation tileOperation, int i11, int i12, int i13, int i14, int i15, String str) {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.s(tileOperation, i11, i12, i13, i14, i15, str);
        }
    }

    @Keep
    private void onWillStartLoadingMap() {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.f();
        }
    }

    @Keep
    private void onWillStartRenderingFrame() {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.b();
        }
    }

    @Keep
    private void onWillStartRenderingMap() {
        StateCallback stateCallback = this.f79812d;
        if (stateCallback != null) {
            stateCallback.c();
        }
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void A(double d11, double d12, long j11) {
        if (X("moveBy")) {
            return;
        }
        try {
            double d13 = this.f79813e;
            nativeMoveBy(d11 / d13, d12 / d13, j11);
        } catch (Error e11) {
            Logger.d("Mbgl-NativeMapView", "Error when executing NativeMapView#moveBy", e11);
        }
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void B(@NonNull RasterLayer rasterLayer) {
        if (X("addLayerAt")) {
            return;
        }
        nativeAddLayerAt(rasterLayer.e(), 0);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final double C() {
        if (X("getZoom")) {
            return 0.0d;
        }
        return nativeGetZoom();
    }

    @Override // org.maplibre.android.maps.NativeMap
    @NonNull
    public final long[] D(RectF rectF) {
        return X("queryPointAnnotations") ? new long[0] : nativeQueryPointAnnotations(rectF);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void E(boolean z11) {
        if (X("setDebug")) {
            return;
        }
        nativeSetDebug(z11);
    }

    @Override // org.maplibre.android.maps.NativeMap
    @NonNull
    public final List<Layer> F() {
        return X("getLayers") ? new ArrayList() : Arrays.asList(nativeGetLayers());
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void G(@NonNull Layer layer, @NonNull String str) {
        if (X("addLayerBelow")) {
            return;
        }
        nativeAddLayer(layer.e(), str);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void H() {
        if (X("setStyleUri")) {
            return;
        }
        nativeSetStyleUrl(null);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final LatLng I(@NonNull PointF pointF) {
        if (X("latLngForPixel")) {
            return new LatLng();
        }
        float f7 = pointF.x;
        float f11 = this.f79813e;
        return nativeLatLngForPixel(f7 / f11, pointF.y / f11);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void J(String str) {
        if (X("setApiBaseUrl")) {
            return;
        }
        this.f79809a.setApiBaseUrl(str);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final long K(Marker marker) {
        if (X("addMarker")) {
            return 0L;
        }
        return nativeAddMarkers(new Marker[]{marker})[0];
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void L(@NonNull Image[] imageArr) {
        if (X("addImages")) {
            return;
        }
        nativeAddImages(imageArr);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void M(String str) {
        if (X("removeImage")) {
            return;
        }
        nativeRemoveImage(str);
    }

    @Override // org.maplibre.android.maps.NativeMap
    @NonNull
    public final RectF N(RectF rectF) {
        float f7 = rectF.left;
        float f11 = this.f79813e;
        return new RectF(f7 / f11, rectF.top / f11, rectF.right / f11, rectF.bottom / f11);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final double O() {
        if (X("getPitch")) {
            return 0.0d;
        }
        return nativeGetPitch();
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void P(double d11) {
        if (X("setMinPitch")) {
            return;
        }
        nativeSetMinPitch(d11);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void Q(boolean z11) {
        if (X("setGestureInProgress")) {
            return;
        }
        nativeSetGestureInProgress(z11);
    }

    @Override // org.maplibre.android.maps.NativeMap
    @NonNull
    public final long[] R(RectF rectF) {
        return X("queryShapeAnnotations") ? new long[0] : nativeQueryShapeAnnotations(rectF);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void S(int i11, int i12) {
        if (X("resizeView")) {
            return;
        }
        float f7 = this.f79813e;
        int ceil = (int) Math.ceil(i11 / f7);
        int ceil2 = (int) Math.ceil(i12 / f7);
        if (ceil < 0) {
            Logger.e("Mbgl-NativeMapView", "Device returned a negative width size, setting value to 0 instead of " + ceil);
            ceil = 0;
        }
        if (ceil2 < 0) {
            Logger.e("Mbgl-NativeMapView", "Device returned a negative height size, setting value to 0 instead of " + ceil2);
            ceil2 = 0;
        }
        if (ceil > 65535) {
            Logger.e("Mbgl-NativeMapView", "Device returned an out of range width size, capping value at 65535 instead of " + ceil);
            ceil = 65535;
        }
        if (ceil2 > 65535) {
            Logger.e("Mbgl-NativeMapView", "Device returned an out of range height size, capping value at 65535 instead of " + ceil2);
            ceil2 = 65535;
        }
        nativeResizeView(ceil, ceil2);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void T(double d11) {
        if (X("setPitch")) {
            return;
        }
        nativeSetPitch(d11, 0L);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final boolean U() {
        return this.f79814f;
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void V(double d11, @NonNull PointF pointF) {
        if (X("setZoom")) {
            return;
        }
        float f7 = pointF.x;
        float f11 = this.f79813e;
        nativeSetZoom(d11, f7 / f11, pointF.y / f11, 0L);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void W(int i11) {
        if (X("nativeSetPrefetchZoomDelta")) {
            return;
        }
        nativeSetPrefetchZoomDelta(i11);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void a() {
        this.f79814f = true;
        nativeDestroy();
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void b(@NonNull LatLng latLng, double d11, double d12, double d13, double[] dArr, long j11) {
        if (X("easeTo")) {
            return;
        }
        nativeEaseTo(d12, latLng.getLatitude(), latLng.getLongitude(), j11, d13, d11, Y(dArr), true);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void c() {
        if (X("cancelTransitions")) {
            return;
        }
        nativeCancelTransitions();
    }

    @Override // org.maplibre.android.maps.NativeMap
    @NonNull
    public final List<Source> d() {
        return X("getSources") ? new ArrayList() : Arrays.asList(nativeGetSources());
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void e(long j11) {
        if (X("removeAnnotation")) {
            return;
        }
        long[] jArr = {j11};
        if (X("removeAnnotations")) {
            return;
        }
        nativeRemoveAnnotations(jArr);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final CameraPosition f(@NonNull LatLngBounds latLngBounds, int[] iArr, double d11, double d12) {
        if (X("getCameraForLatLngBounds")) {
            return null;
        }
        float f7 = iArr[1];
        float f11 = this.f79813e;
        return nativeGetCameraForLatLngBounds(latLngBounds, f7 / f11, iArr[0] / f11, iArr[3] / f11, iArr[2] / f11, d11, d12);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void g(int i11, int i12, float f7, byte[] bArr) {
        if (X("addAnnotationIcon")) {
            return;
        }
        nativeAddAnnotationIcon(null, i11, i12, f7, bArr);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final double getBearing() {
        if (X("getBearing")) {
            return 0.0d;
        }
        return nativeGetBearing();
    }

    @Override // org.maplibre.android.maps.NativeMap
    @NonNull
    public final CameraPosition getCameraPosition() {
        return X("getCameraValues") ? new CameraPosition.a().b() : nativeGetCameraPosition();
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final Bitmap getImage(String str) {
        if (X("getImage")) {
            return null;
        }
        return nativeGetImage(str);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final double getMaxZoom() {
        if (X("getMaxZoom")) {
            return 0.0d;
        }
        return nativeGetMaxZoom();
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final double getMinZoom() {
        if (X("getMinZoom")) {
            return 0.0d;
        }
        return nativeGetMinZoom();
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void h(String str) {
        if (X("setStyleJson")) {
            return;
        }
        nativeSetStyleJson(str);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void i(double d11) {
        if (X("setMaxZoom")) {
            return;
        }
        nativeSetMaxZoom(d11);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void j(double d11) {
        if (X("setMaxPitch")) {
            return;
        }
        nativeSetMaxPitch(d11);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void k(boolean z11) {
        if (X("setReachability")) {
            return;
        }
        nativeSetReachability(z11);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final boolean l(@NonNull String str) {
        if (X("removeSource")) {
            return false;
        }
        Source nativeGetSource = X("getSource") ? null : nativeGetSource(str);
        if (nativeGetSource == null || X("removeSource")) {
            return false;
        }
        return nativeRemoveSource(nativeGetSource, nativeGetSource.getNativePtr());
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void m(@NonNull TransitionOptions transitionOptions) {
        nativeSetTransitionOptions(transitionOptions);
    }

    @Override // org.maplibre.android.maps.NativeMap
    @NonNull
    public final PointF n(@NonNull LatLng latLng) {
        if (X("pixelForLatLng")) {
            return new PointF();
        }
        PointF nativePixelForLatLng = nativePixelForLatLng(latLng.getLatitude(), latLng.getLongitude());
        float f7 = nativePixelForLatLng.x;
        float f11 = this.f79813e;
        nativePixelForLatLng.set(f7 * f11, nativePixelForLatLng.y * f11);
        return nativePixelForLatLng;
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final boolean o(@NonNull Layer layer) {
        if (X("removeLayer")) {
            return false;
        }
        return nativeRemoveLayer(layer.e());
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void onLowMemory() {
        if (X("onLowMemory")) {
            return;
        }
        nativeOnLowMemory();
    }

    @Keep
    protected void onSnapshotReady(Bitmap bitmap) {
        X("OnSnapshotReady");
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void p(double d11, double d12, double d13, long j11) {
        if (X("setBearing")) {
            return;
        }
        double d14 = this.f79813e;
        nativeSetBearingXY(d11, d12 / d14, d13 / d14, j11);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final double q(double d11) {
        if (X("getMetersPerPixelAtLatitude")) {
            return 0.0d;
        }
        return nativeGetMetersPerPixelAtLatitude(d11, C());
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void r(@NonNull Layer layer, @NonNull String str) {
        if (X("addLayerAbove")) {
            return;
        }
        nativeAddLayerAbove(layer.e(), str);
    }

    @Override // org.maplibre.android.maps.NativeMap
    @NonNull
    public final List s(@NonNull PointF pointF, String[] strArr) {
        if (X("queryRenderedFeatures")) {
            return new ArrayList();
        }
        float f7 = pointF.x;
        float f11 = this.f79813e;
        Feature[] nativeQueryRenderedFeaturesForPoint = nativeQueryRenderedFeaturesForPoint(f7 / f11, pointF.y / f11, strArr, null);
        return nativeQueryRenderedFeaturesForPoint != null ? Arrays.asList(nativeQueryRenderedFeaturesForPoint) : new ArrayList();
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void t(@NonNull Layer layer) {
        if (X("addLayer")) {
            return;
        }
        nativeAddLayer(layer.e(), null);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void u(@NonNull Source source) {
        if (X("addSource")) {
            return;
        }
        nativeAddSource(source, source.getNativePtr());
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void v(@NonNull LatLng latLng, double d11, double d12, double d13, double[] dArr) {
        if (X("jumpTo")) {
            return;
        }
        nativeJumpTo(d13, latLng.getLatitude(), latLng.getLongitude(), d12, d11, Y(dArr));
    }

    @Override // org.maplibre.android.maps.NativeMap
    @NonNull
    public final String w() {
        return X("getStyleUri") ? "" : nativeGetStyleUrl();
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final Layer x(String str) {
        if (X("getLayer")) {
            return null;
        }
        return nativeGetLayer(str);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final boolean y(@NonNull String str) {
        Layer x11;
        if (X("removeLayer") || (x11 = x(str)) == null) {
            return false;
        }
        return o(x11);
    }

    @Override // org.maplibre.android.maps.NativeMap
    public final void z(double d11) {
        if (X("setMinZoom")) {
            return;
        }
        nativeSetMinZoom(d11);
    }
}
