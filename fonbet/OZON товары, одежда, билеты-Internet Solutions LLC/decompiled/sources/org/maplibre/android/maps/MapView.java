package org.maplibre.android.maps;

import Fv.RunnableC3061a;
import Le0.C3588e;
import Wf.c;
import Yf.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.collection.C5153w;
import java.util.ArrayList;
import java.util.Iterator;
import org.maplibre.android.MapLibre;
import org.maplibre.android.b;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.NativeMapView;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.maps.widgets.CompassView;
import org.maplibre.android.storage.FileSource;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public class MapView extends FrameLayout implements NativeMapView.ViewCallback {
    private AttributionClickListener attributionClickListener;
    private final CameraChangeDispatcher cameraDispatcher;
    private CompassView compassView;
    private boolean destroyed;
    private final FocalPointInvalidator focalInvalidator;
    private PointF focalPoint;
    private final InitialRenderCallback initialRenderCallback;
    private boolean isStarted;
    private final MapCallback mapCallback;
    private final MapChangeReceiver mapChangeReceiver;
    private MapGestureDetector mapGestureDetector;
    private MapKeyListener mapKeyListener;
    private MapRenderer mapRenderer;
    private MapLibreMap maplibreMap;
    MapLibreMapOptions maplibreMapOptions;
    private NativeMap nativeMapView;
    private final GesturesManagerInteractionListener registerTouchListener;
    private View renderView;
    private Bundle savedInstanceState;

    private static class AttributionClickListener implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final AttributionDialogManager f79796a;

        /* renamed from: b, reason: collision with root package name */
        private UiSettings f79797b;

        AttributionClickListener(Context context, MapLibreMap mapLibreMap) {
            this.f79796a = new AttributionDialogManager(context, mapLibreMap);
            this.f79797b = mapLibreMap.w();
        }

        public final void a() {
            this.f79797b.getClass();
            this.f79796a.a();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f79797b.getClass();
            this.f79796a.onClick(view);
        }
    }

    private class FocalPointInvalidator implements FocalPointChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f79798a = new ArrayList();

        FocalPointInvalidator() {
        }

        @Override // org.maplibre.android.maps.FocalPointChangeListener
        public final void a(PointF pointF) {
            MapView.this.mapGestureDetector.setFocalPoint(pointF);
            Iterator it = this.f79798a.iterator();
            while (it.hasNext()) {
                ((FocalPointChangeListener) it.next()).a(pointF);
            }
        }

        final void b(FocalPointChangeListener focalPointChangeListener) {
            this.f79798a.add(focalPointChangeListener);
        }
    }

    private class GesturesManagerInteractionListener implements MapLibreMap.OnGesturesManagerInteractionListener {
        GesturesManagerInteractionListener() {
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnGesturesManagerInteractionListener
        public final a a() {
            return MapView.this.mapGestureDetector.getGesturesManager();
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnGesturesManagerInteractionListener
        public final void b(MapLibreMap.OnMapClickListener onMapClickListener) {
            MapView.this.mapGestureDetector.removeOnMapClickListener(onMapClickListener);
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnGesturesManagerInteractionListener
        public final void c(MapLibreMap.OnMapLongClickListener onMapLongClickListener) {
            MapView.this.mapGestureDetector.addOnMapLongClickListener(onMapLongClickListener);
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnGesturesManagerInteractionListener
        public final void d(C3588e.a.d dVar) {
            MapView.this.mapGestureDetector.addOnMoveListener(dVar);
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnGesturesManagerInteractionListener
        public final void e(MapLibreMap.OnMapLongClickListener onMapLongClickListener) {
            MapView.this.mapGestureDetector.removeOnMapLongClickListener(onMapLongClickListener);
        }

        @Override // org.maplibre.android.maps.MapLibreMap.OnGesturesManagerInteractionListener
        public final void f(MapLibreMap.OnMapClickListener onMapClickListener) {
            MapView.this.mapGestureDetector.addOnMapClickListener(onMapClickListener);
        }
    }

    private class InitialRenderCallback implements OnDidFinishRenderingFrameWithStatsListener {

        /* renamed from: a, reason: collision with root package name */
        private int f79801a;

        InitialRenderCallback() {
            MapView.this.addOnDidFinishRenderingFrameListener(this);
        }

        @Override // org.maplibre.android.maps.MapView.OnDidFinishRenderingFrameWithStatsListener
        public final void b() {
            MapView mapView = MapView.this;
            if (mapView.maplibreMap == null || mapView.maplibreMap.u() == null || !mapView.maplibreMap.u().n()) {
                return;
            }
            int i11 = this.f79801a + 1;
            this.f79801a = i11;
            if (i11 == 3) {
                mapView.setForeground(null);
                mapView.removeOnDidFinishRenderingFrameListener(this);
            }
        }
    }

    private class MapCallback implements OnDidFinishLoadingStyleListener, OnDidFinishRenderingFrameWithStatsListener, OnDidFinishLoadingMapListener, OnCameraIsChangingListener, OnCameraDidChangeListener, OnDidFailLoadingMapListener {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f79803a = new ArrayList();

        MapCallback() {
            MapView.this.addOnDidFinishLoadingStyleListener(this);
            MapView.this.addOnDidFinishRenderingFrameListener(this);
            MapView.this.addOnDidFinishLoadingMapListener(this);
            MapView.this.addOnCameraIsChangingListener(this);
            MapView.this.addOnCameraDidChangeListener(this);
            MapView.this.addOnDidFailLoadingMapListener(this);
        }

        @Override // org.maplibre.android.maps.MapView.OnCameraIsChangingListener
        public final void a() {
            MapView mapView = MapView.this;
            if (mapView.maplibreMap != null) {
                mapView.maplibreMap.N();
            }
        }

        @Override // org.maplibre.android.maps.MapView.OnDidFinishRenderingFrameWithStatsListener
        public final void b() {
            MapView mapView = MapView.this;
            if (mapView.maplibreMap != null) {
                mapView.maplibreMap.M();
            }
        }

        @Override // org.maplibre.android.maps.MapView.OnDidFailLoadingMapListener
        public final void c() {
            MapView mapView = MapView.this;
            if (mapView.maplibreMap != null) {
                mapView.maplibreMap.E();
            }
        }

        @Override // org.maplibre.android.maps.MapView.OnCameraDidChangeListener
        public final void d(boolean z11) {
            MapView mapView = MapView.this;
            if (mapView.maplibreMap != null) {
                mapView.maplibreMap.N();
            }
        }

        final void e(OnMapReadyCallback onMapReadyCallback) {
            this.f79803a.add(onMapReadyCallback);
        }

        final void f() {
            MapView mapView = MapView.this;
            mapView.maplibreMap.H();
            ArrayList arrayList = this.f79803a;
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    OnMapReadyCallback onMapReadyCallback = (OnMapReadyCallback) it.next();
                    if (onMapReadyCallback != null) {
                        onMapReadyCallback.d(mapView.maplibreMap);
                    }
                    it.remove();
                }
            }
            mapView.maplibreMap.G();
        }

        @Override // org.maplibre.android.maps.MapView.OnDidFinishLoadingMapListener
        public final void g() {
            MapView mapView = MapView.this;
            if (mapView.maplibreMap != null) {
                mapView.maplibreMap.N();
            }
        }

        final void h() {
            this.f79803a.clear();
            MapView mapView = MapView.this;
            mapView.removeOnDidFinishLoadingStyleListener(this);
            mapView.removeOnDidFinishRenderingFrameListener(this);
            mapView.removeOnDidFinishLoadingMapListener(this);
            mapView.removeOnCameraIsChangingListener(this);
            mapView.removeOnCameraDidChangeListener(this);
            mapView.removeOnDidFailLoadingMapListener(this);
        }

        @Override // org.maplibre.android.maps.MapView.OnDidFinishLoadingStyleListener
        public final void j() {
            MapView mapView = MapView.this;
            if (mapView.maplibreMap != null) {
                mapView.maplibreMap.F();
            }
        }
    }

    public interface OnCameraDidChangeListener {
        void d(boolean z11);
    }

    public interface OnCameraIsChangingListener {
        void a();
    }

    public interface OnCameraWillChangeListener {
        void a();
    }

    public interface OnCanRemoveUnusedStyleImageListener {
        boolean e(@NonNull String str);
    }

    public interface OnDidBecomeIdleListener {
        void k();
    }

    public interface OnDidFailLoadingMapListener {
        void c();
    }

    public interface OnDidFinishLoadingMapListener {
        void g();
    }

    public interface OnDidFinishLoadingStyleListener {
        void j();
    }

    public interface OnDidFinishRenderingFrameListener {
        void a(boolean z11);
    }

    public interface OnDidFinishRenderingFrameWithStatsListener {
        void b();
    }

    public interface OnDidFinishRenderingMapListener {
        void h(boolean z11);
    }

    public interface OnGlyphsErrorListener {
        void a();
    }

    public interface OnGlyphsLoadedListener {
        void a();
    }

    public interface OnGlyphsRequestedListener {
        void a();
    }

    public interface OnPostCompileShaderListener {
        void a();
    }

    public interface OnPreCompileShaderListener {
        void a();
    }

    public interface OnShaderCompileFailedListener {
        void a();
    }

    public interface OnSourceChangedListener {
        void a();
    }

    public interface OnSpriteErrorListener {
        void a();
    }

    public interface OnSpriteLoadedListener {
        void a();
    }

    public interface OnSpriteRequestedListener {
        void a();
    }

    public interface OnStyleImageMissingListener {
        void i(@NonNull String str);
    }

    public interface OnTileActionListener {
        void a();
    }

    public interface OnWillStartLoadingMapListener {
        void f();
    }

    public interface OnWillStartRenderingFrameListener {
        void b();
    }

    public interface OnWillStartRenderingMapListener {
        void c();
    }

    public MapView(@NonNull Context context) {
        super(context);
        this.mapChangeReceiver = new MapChangeReceiver();
        this.mapCallback = new MapCallback();
        this.initialRenderCallback = new InitialRenderCallback();
        this.focalInvalidator = new FocalPointInvalidator();
        this.registerTouchListener = new GesturesManagerInteractionListener();
        this.cameraDispatcher = new CameraChangeDispatcher();
        Lm0.a.f17149a.d("MapView constructed with context", new Object[0]);
        initialize(context, MapLibreMapOptions.c(context, null));
    }

    private MapLibreMap.OnCompassAnimationListener createCompassAnimationListener(@NonNull final CameraChangeDispatcher cameraChangeDispatcher) {
        return new MapLibreMap.OnCompassAnimationListener() { // from class: org.maplibre.android.maps.MapView.2
            @Override // org.maplibre.android.maps.MapLibreMap.OnCompassAnimationListener
            public final void a() {
                cameraChangeDispatcher.onCameraMove();
            }

            @Override // org.maplibre.android.maps.MapLibreMap.OnCompassAnimationListener
            public final void b() {
                MapView mapView = MapView.this;
                if (mapView.compassView != null) {
                    mapView.compassView.c(false);
                }
                cameraChangeDispatcher.onCameraIdle();
            }
        };
    }

    private View.OnClickListener createCompassClickListener(@NonNull final CameraChangeDispatcher cameraChangeDispatcher) {
        return new View.OnClickListener() { // from class: org.maplibre.android.maps.MapView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MapView mapView = MapView.this;
                if (mapView.maplibreMap == null || mapView.compassView == null) {
                    return;
                }
                if (mapView.focalPoint != null) {
                    mapView.maplibreMap.U(mapView.focalPoint.x, mapView.focalPoint.y);
                } else {
                    mapView.maplibreMap.U(mapView.maplibreMap.x() / 2.0f, mapView.maplibreMap.m() / 2.0f);
                }
                cameraChangeDispatcher.onCameraMoveStarted(3);
                mapView.compassView.c(true);
                mapView.compassView.postDelayed(mapView.compassView, 650L);
            }
        };
    }

    private FocalPointChangeListener createFocalPointChangeListener() {
        return new FocalPointChangeListener() { // from class: org.maplibre.android.maps.MapView.1
            @Override // org.maplibre.android.maps.FocalPointChangeListener
            public final void a(PointF pointF) {
                MapView.this.focalPoint = pointF;
            }
        };
    }

    private void initializeDrawingSurface(MapLibreMapOptions mapLibreMapOptions) {
        MapRenderer create = MapRenderer.create(mapLibreMapOptions, getContext(), new RunnableC3061a(this, 2));
        this.mapRenderer = create;
        View view = create.getView();
        this.renderView = view;
        addView(view, 0);
        mapLibreMapOptions.e0(getPixelRatio());
        this.nativeMapView = new NativeMapView(getContext(), mapLibreMapOptions, this, this.mapChangeReceiver, this.mapRenderer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeMap() {
        Context context = getContext();
        this.focalInvalidator.b(createFocalPointChangeListener());
        Projection projection = new Projection(this.nativeMapView, this);
        UiSettings uiSettings = new UiSettings(projection, this.focalInvalidator, getPixelRatio(), this);
        C5153w c5153w = new C5153w();
        IconManager iconManager = new IconManager(this.nativeMapView);
        NativeMap nativeMap = this.nativeMapView;
        AnnotationManager annotationManager = new AnnotationManager(this, c5153w, iconManager, new AnnotationContainer(nativeMap, c5153w), new MarkerContainer(nativeMap, c5153w, iconManager), new PolygonContainer(nativeMap), new PolylineContainer(nativeMap), new ShapeAnnotationContainer(nativeMap, c5153w));
        Transform transform = new Transform(this, this.nativeMapView, this.cameraDispatcher);
        ArrayList arrayList = new ArrayList();
        MapLibreMap mapLibreMap = new MapLibreMap(this.nativeMapView, transform, uiSettings, projection, this.registerTouchListener, this.cameraDispatcher, arrayList);
        this.maplibreMap = mapLibreMap;
        mapLibreMap.z(annotationManager);
        MapGestureDetector mapGestureDetector = new MapGestureDetector(context, transform, projection, uiSettings, annotationManager, this.cameraDispatcher);
        this.mapGestureDetector = mapGestureDetector;
        this.mapKeyListener = new MapKeyListener(transform, uiSettings, mapGestureDetector);
        MapLibreMap mapLibreMap2 = this.maplibreMap;
        mapLibreMap2.A(new org.maplibre.android.location.a(mapLibreMap2, arrayList));
        setClickable(true);
        setLongClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestDisallowInterceptTouchEvent(true);
        this.nativeMapView.k(MapLibre.isConnected().booleanValue());
        Bundle bundle = this.savedInstanceState;
        if (bundle == null) {
            this.maplibreMap.y(context, this.maplibreMapOptions);
        } else {
            this.maplibreMap.I(bundle);
        }
        this.mapCallback.f();
    }

    private boolean isGestureDetectorInitialized() {
        return this.mapGestureDetector != null;
    }

    private boolean isKeyDetectorInitialized() {
        return this.mapKeyListener != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceCreated() {
        post(new Runnable() { // from class: org.maplibre.android.maps.MapView.4
            @Override // java.lang.Runnable
            public final void run() {
                MapView mapView = MapView.this;
                if (mapView.destroyed || mapView.maplibreMap != null) {
                    return;
                }
                mapView.initializeMap();
                mapView.maplibreMap.K();
            }
        });
    }

    public static void setMapStrictModeEnabled(boolean z11) {
        b.a(z11);
    }

    public void addOnCameraDidChangeListener(@NonNull OnCameraDidChangeListener onCameraDidChangeListener) {
        this.mapChangeReceiver.z(onCameraDidChangeListener);
    }

    public void addOnCameraIsChangingListener(@NonNull OnCameraIsChangingListener onCameraIsChangingListener) {
        this.mapChangeReceiver.A(onCameraIsChangingListener);
    }

    public void addOnCameraWillChangeListener(@NonNull OnCameraWillChangeListener onCameraWillChangeListener) {
        this.mapChangeReceiver.B(onCameraWillChangeListener);
    }

    public void addOnCanRemoveUnusedStyleImageListener(@NonNull OnCanRemoveUnusedStyleImageListener onCanRemoveUnusedStyleImageListener) {
        this.mapChangeReceiver.C(onCanRemoveUnusedStyleImageListener);
    }

    public void addOnDidBecomeIdleListener(@NonNull OnDidBecomeIdleListener onDidBecomeIdleListener) {
        this.mapChangeReceiver.D(onDidBecomeIdleListener);
    }

    public void addOnDidFailLoadingMapListener(@NonNull OnDidFailLoadingMapListener onDidFailLoadingMapListener) {
        this.mapChangeReceiver.E(onDidFailLoadingMapListener);
    }

    public void addOnDidFinishLoadingMapListener(@NonNull OnDidFinishLoadingMapListener onDidFinishLoadingMapListener) {
        this.mapChangeReceiver.F(onDidFinishLoadingMapListener);
    }

    public void addOnDidFinishLoadingStyleListener(@NonNull OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener) {
        this.mapChangeReceiver.G(onDidFinishLoadingStyleListener);
    }

    public void addOnDidFinishRenderingFrameListener(@NonNull OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener) {
        this.mapChangeReceiver.H(onDidFinishRenderingFrameListener);
    }

    public void addOnDidFinishRenderingMapListener(@NonNull OnDidFinishRenderingMapListener onDidFinishRenderingMapListener) {
        this.mapChangeReceiver.J(onDidFinishRenderingMapListener);
    }

    public void addOnGlyphsErrorListener(OnGlyphsErrorListener onGlyphsErrorListener) {
        this.mapChangeReceiver.K(onGlyphsErrorListener);
    }

    public void addOnGlyphsLoadedListener(OnGlyphsLoadedListener onGlyphsLoadedListener) {
        this.mapChangeReceiver.L(onGlyphsLoadedListener);
    }

    public void addOnGlyphsRequestedListener(OnGlyphsRequestedListener onGlyphsRequestedListener) {
        this.mapChangeReceiver.M(onGlyphsRequestedListener);
    }

    public void addOnPostCompileShaderListener(OnPostCompileShaderListener onPostCompileShaderListener) {
        this.mapChangeReceiver.N(onPostCompileShaderListener);
    }

    public void addOnPreCompileShaderListener(OnPreCompileShaderListener onPreCompileShaderListener) {
        this.mapChangeReceiver.O(onPreCompileShaderListener);
    }

    public void addOnShaderCompileFailedListener(OnShaderCompileFailedListener onShaderCompileFailedListener) {
        this.mapChangeReceiver.P(onShaderCompileFailedListener);
    }

    public void addOnSourceChangedListener(@NonNull OnSourceChangedListener onSourceChangedListener) {
        this.mapChangeReceiver.Q(onSourceChangedListener);
    }

    public void addOnSpriteErrorListener(OnSpriteErrorListener onSpriteErrorListener) {
        this.mapChangeReceiver.R(onSpriteErrorListener);
    }

    public void addOnSpriteLoadedListener(OnSpriteLoadedListener onSpriteLoadedListener) {
        this.mapChangeReceiver.S(onSpriteLoadedListener);
    }

    public void addOnSpriteRequestedListener(OnSpriteRequestedListener onSpriteRequestedListener) {
        this.mapChangeReceiver.T(onSpriteRequestedListener);
    }

    public void addOnStyleImageMissingListener(@NonNull OnStyleImageMissingListener onStyleImageMissingListener) {
        this.mapChangeReceiver.U(onStyleImageMissingListener);
    }

    public void addOnTileActionListener(OnTileActionListener onTileActionListener) {
        this.mapChangeReceiver.V(onTileActionListener);
    }

    public void addOnWillStartLoadingMapListener(@NonNull OnWillStartLoadingMapListener onWillStartLoadingMapListener) {
        this.mapChangeReceiver.W(onWillStartLoadingMapListener);
    }

    public void addOnWillStartRenderingFrameListener(@NonNull OnWillStartRenderingFrameListener onWillStartRenderingFrameListener) {
        this.mapChangeReceiver.X(onWillStartRenderingFrameListener);
    }

    public void addOnWillStartRenderingMapListener(@NonNull OnWillStartRenderingMapListener onWillStartRenderingMapListener) {
        this.mapChangeReceiver.Y(onWillStartRenderingMapListener);
    }

    public void getMapAsync(@NonNull OnMapReadyCallback onMapReadyCallback) {
        MapLibreMap mapLibreMap = this.maplibreMap;
        if (mapLibreMap == null) {
            this.mapCallback.e(onMapReadyCallback);
        } else {
            onMapReadyCallback.d(mapLibreMap);
        }
    }

    MapLibreMap getMapLibreMap() {
        return this.maplibreMap;
    }

    public float getPixelRatio() {
        float pixelRatio = this.maplibreMapOptions.getPixelRatio();
        return pixelRatio == 0.0f ? getResources().getDisplayMetrics().density : pixelRatio;
    }

    @NonNull
    public View getRenderView() {
        return this.renderView;
    }

    public MapRenderer.RenderingRefreshMode getRenderingRefreshMode() {
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer != null) {
            return mapRenderer.getRenderingRefreshMode();
        }
        throw new IllegalStateException("Calling MapView#getRenderingRefreshMode before mapRenderer is created.");
    }

    public Bitmap getViewContent() {
        setDrawingCacheEnabled(true);
        setDrawingCacheQuality(524288);
        buildDrawingCache();
        if (getDrawingCache() == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getDrawingCache());
        setDrawingCacheEnabled(false);
        destroyDrawingCache();
        return createBitmap;
    }

    protected ImageView initialiseAttributionView() {
        ImageView imageView = new ImageView(getContext());
        addView(imageView);
        imageView.setTag("attrView");
        imageView.getLayoutParams().width = -2;
        imageView.getLayoutParams().height = -2;
        imageView.setAdjustViewBounds(true);
        imageView.setClickable(true);
        imageView.setFocusable(true);
        imageView.setContentDescription(getResources().getString(R.string.maplibre_attributionsIconContentDescription));
        Drawable drawable = androidx.core.content.a.getDrawable(getContext(), R.drawable.maplibre_info_bg_selector);
        if (drawable == null) {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        AttributionClickListener attributionClickListener = new AttributionClickListener(getContext(), this.maplibreMap);
        this.attributionClickListener = attributionClickListener;
        imageView.setOnClickListener(attributionClickListener);
        return imageView;
    }

    protected CompassView initialiseCompassView() {
        CompassView compassView = new CompassView(getContext());
        this.compassView = compassView;
        addView(compassView);
        this.compassView.setTag("compassView");
        this.compassView.getLayoutParams().width = -2;
        this.compassView.getLayoutParams().height = -2;
        this.compassView.setContentDescription(getResources().getString(R.string.maplibre_compassContentDescription));
        this.compassView.b(createCompassAnimationListener(this.cameraDispatcher));
        this.compassView.setOnClickListener(createCompassClickListener(this.cameraDispatcher));
        return this.compassView;
    }

    protected ImageView initialiseLogoView() {
        ImageView imageView = new ImageView(getContext());
        addView(imageView);
        imageView.setTag("logoView");
        imageView.getLayoutParams().width = -2;
        imageView.getLayoutParams().height = -2;
        Drawable drawable = androidx.core.content.a.getDrawable(getContext(), 2131235762);
        if (drawable == null) {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        return imageView;
    }

    protected void initialize(@NonNull Context context, @NonNull MapLibreMapOptions mapLibreMapOptions) {
        if (isInEditMode()) {
            return;
        }
        if (!MapLibre.hasInstance()) {
            throw new c();
        }
        setForeground(new ColorDrawable(mapLibreMapOptions.z()));
        this.maplibreMapOptions = mapLibreMapOptions;
        setContentDescription(context.getString(R.string.maplibre_mapActionDescription));
        setWillNotDraw(false);
        initializeDrawingSurface(mapLibreMapOptions);
    }

    public boolean isDestroyed() {
        return this.destroyed;
    }

    public void onCreate(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("maplibre_savedState")) {
            return;
        }
        this.savedInstanceState = bundle;
    }

    public void onDestroy() {
        this.destroyed = true;
        this.mapChangeReceiver.Z();
        this.mapCallback.h();
        InitialRenderCallback initialRenderCallback = this.initialRenderCallback;
        MapView.this.removeOnDidFinishRenderingFrameListener(initialRenderCallback);
        CompassView compassView = this.compassView;
        if (compassView != null) {
            compassView.f();
        }
        MapLibreMap mapLibreMap = this.maplibreMap;
        if (mapLibreMap != null) {
            mapLibreMap.D();
        }
        NativeMap nativeMap = this.nativeMapView;
        if (nativeMap != null) {
            nativeMap.a();
            this.nativeMapView = null;
        }
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer != null) {
            mapRenderer.onDestroy();
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        return !isGestureDetectorInitialized() ? super.onGenericMotionEvent(motionEvent) : this.mapGestureDetector.onGenericMotionEvent(motionEvent) || super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, @NonNull KeyEvent keyEvent) {
        return !isKeyDetectorInitialized() ? super.onKeyDown(i11, keyEvent) : this.mapKeyListener.d(i11, keyEvent) || super.onKeyDown(i11, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i11, KeyEvent keyEvent) {
        return !isKeyDetectorInitialized() ? super.onKeyLongPress(i11, keyEvent) : this.mapKeyListener.e(i11) || super.onKeyLongPress(i11, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, @NonNull KeyEvent keyEvent) {
        return !isKeyDetectorInitialized() ? super.onKeyUp(i11, keyEvent) : this.mapKeyListener.f(i11, keyEvent) || super.onKeyUp(i11, keyEvent);
    }

    public void onLowMemory() {
        NativeMap nativeMap = this.nativeMapView;
        if (nativeMap == null || this.maplibreMap == null || this.destroyed) {
            return;
        }
        nativeMap.onLowMemory();
    }

    public void onPause() {
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer != null) {
            mapRenderer.onPause();
        }
    }

    public void onResume() {
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer != null) {
            mapRenderer.onResume();
        }
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        if (this.maplibreMap != null) {
            bundle.putBoolean("maplibre_savedState", true);
            this.maplibreMap.J(bundle);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        NativeMap nativeMap;
        if (isInEditMode() || (nativeMap = this.nativeMapView) == null) {
            return;
        }
        nativeMap.S(i11, i12);
    }

    public void onStart() {
        if (!this.isStarted) {
            org.maplibre.android.net.b.c(getContext()).a();
            FileSource.b(getContext()).activate();
            this.isStarted = true;
        }
        MapLibreMap mapLibreMap = this.maplibreMap;
        if (mapLibreMap != null) {
            mapLibreMap.K();
        }
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer != null) {
            mapRenderer.onStart();
        }
    }

    public void onStop() {
        AttributionClickListener attributionClickListener = this.attributionClickListener;
        if (attributionClickListener != null) {
            attributionClickListener.a();
        }
        if (this.maplibreMap != null) {
            this.mapGestureDetector.cancelAnimators();
            this.maplibreMap.L();
        }
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer != null) {
            mapRenderer.onStop();
        }
        if (this.isStarted) {
            org.maplibre.android.net.b.c(getContext()).b();
            FileSource.b(getContext()).deactivate();
            this.isStarted = false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !isGestureDetectorInitialized() ? super.onTouchEvent(motionEvent) : this.mapGestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTrackballEvent(@NonNull MotionEvent motionEvent) {
        return !isKeyDetectorInitialized() ? super.onTrackballEvent(motionEvent) : this.mapKeyListener.g(motionEvent) || super.onTrackballEvent(motionEvent);
    }

    public void queueEvent(@NonNull Runnable runnable) {
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer == null) {
            throw new IllegalStateException("Calling MapView#queueEvent before mapRenderer is created.");
        }
        mapRenderer.queueEvent(runnable);
    }

    public void removeOnCameraDidChangeListener(@NonNull OnCameraDidChangeListener onCameraDidChangeListener) {
        this.mapChangeReceiver.a0(onCameraDidChangeListener);
    }

    public void removeOnCameraIsChangingListener(@NonNull OnCameraIsChangingListener onCameraIsChangingListener) {
        this.mapChangeReceiver.b0(onCameraIsChangingListener);
    }

    public void removeOnCameraWillChangeListener(@NonNull OnCameraWillChangeListener onCameraWillChangeListener) {
        this.mapChangeReceiver.c0(onCameraWillChangeListener);
    }

    public void removeOnCanRemoveUnusedStyleImageListener(@NonNull OnCanRemoveUnusedStyleImageListener onCanRemoveUnusedStyleImageListener) {
        this.mapChangeReceiver.d0(onCanRemoveUnusedStyleImageListener);
    }

    public void removeOnDidBecomeIdleListener(@NonNull OnDidBecomeIdleListener onDidBecomeIdleListener) {
        this.mapChangeReceiver.e0(onDidBecomeIdleListener);
    }

    public void removeOnDidFailLoadingMapListener(@NonNull OnDidFailLoadingMapListener onDidFailLoadingMapListener) {
        this.mapChangeReceiver.f0(onDidFailLoadingMapListener);
    }

    public void removeOnDidFinishLoadingMapListener(@NonNull OnDidFinishLoadingMapListener onDidFinishLoadingMapListener) {
        this.mapChangeReceiver.g0(onDidFinishLoadingMapListener);
    }

    public void removeOnDidFinishLoadingStyleListener(@NonNull OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener) {
        this.mapChangeReceiver.h0(onDidFinishLoadingStyleListener);
    }

    public void removeOnDidFinishRenderingFrameListener(@NonNull OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener) {
        this.mapChangeReceiver.i0(onDidFinishRenderingFrameListener);
    }

    public void removeOnDidFinishRenderingMapListener(OnDidFinishRenderingMapListener onDidFinishRenderingMapListener) {
        this.mapChangeReceiver.k0(onDidFinishRenderingMapListener);
    }

    public void removeOnGlyphsErrorListener(OnGlyphsErrorListener onGlyphsErrorListener) {
        this.mapChangeReceiver.l0(onGlyphsErrorListener);
    }

    public void removeOnGlyphsLoadedListener(OnGlyphsLoadedListener onGlyphsLoadedListener) {
        this.mapChangeReceiver.m0(onGlyphsLoadedListener);
    }

    public void removeOnGlyphsRequestedListener(OnGlyphsRequestedListener onGlyphsRequestedListener) {
        this.mapChangeReceiver.n0(onGlyphsRequestedListener);
    }

    public void removeOnPostCompileShaderListener(OnPostCompileShaderListener onPostCompileShaderListener) {
        this.mapChangeReceiver.o0(onPostCompileShaderListener);
    }

    public void removeOnPreCompileShaderListener(OnPreCompileShaderListener onPreCompileShaderListener) {
        this.mapChangeReceiver.p0(onPreCompileShaderListener);
    }

    public void removeOnShaderCompileFailedListener(OnShaderCompileFailedListener onShaderCompileFailedListener) {
        this.mapChangeReceiver.q0(onShaderCompileFailedListener);
    }

    public void removeOnSourceChangedListener(@NonNull OnSourceChangedListener onSourceChangedListener) {
        this.mapChangeReceiver.r0(onSourceChangedListener);
    }

    public void removeOnSpriteErrorListener(OnSpriteErrorListener onSpriteErrorListener) {
        this.mapChangeReceiver.s0(onSpriteErrorListener);
    }

    public void removeOnSpriteLoadedListener(OnSpriteLoadedListener onSpriteLoadedListener) {
        this.mapChangeReceiver.t0(onSpriteLoadedListener);
    }

    public void removeOnSpriteRequestedListener(OnSpriteRequestedListener onSpriteRequestedListener) {
        this.mapChangeReceiver.u0(onSpriteRequestedListener);
    }

    public void removeOnStyleImageMissingListener(@NonNull OnStyleImageMissingListener onStyleImageMissingListener) {
        this.mapChangeReceiver.v0(onStyleImageMissingListener);
    }

    public void removeOnTileActionListener(OnTileActionListener onTileActionListener) {
        this.mapChangeReceiver.w0(onTileActionListener);
    }

    public void removeOnWillStartLoadingMapListener(@NonNull OnWillStartLoadingMapListener onWillStartLoadingMapListener) {
        this.mapChangeReceiver.x0(onWillStartLoadingMapListener);
    }

    public void removeOnWillStartRenderingFrameListener(@NonNull OnWillStartRenderingFrameListener onWillStartRenderingFrameListener) {
        this.mapChangeReceiver.y0(onWillStartRenderingFrameListener);
    }

    public void removeOnWillStartRenderingMapListener(@NonNull OnWillStartRenderingMapListener onWillStartRenderingMapListener) {
        this.mapChangeReceiver.z0(onWillStartRenderingMapListener);
    }

    void setMapLibreMap(MapLibreMap mapLibreMap) {
        this.maplibreMap = mapLibreMap;
    }

    public void setMaximumFps(int i11) {
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer == null) {
            throw new IllegalStateException("Calling MapView#setMaximumFps before mapRenderer is created.");
        }
        mapRenderer.setMaximumFps(i11);
    }

    public void setRenderingRefreshMode(MapRenderer.RenderingRefreshMode renderingRefreshMode) {
        MapRenderer mapRenderer = this.mapRenderer;
        if (mapRenderer == null) {
            throw new IllegalStateException("Calling MapView#setRenderingRefreshMode before mapRenderer is created.");
        }
        mapRenderer.setRenderingRefreshMode(renderingRefreshMode);
    }

    public void addOnDidFinishRenderingFrameListener(@NonNull OnDidFinishRenderingFrameWithStatsListener onDidFinishRenderingFrameWithStatsListener) {
        this.mapChangeReceiver.I(onDidFinishRenderingFrameWithStatsListener);
    }

    public void removeOnDidFinishRenderingFrameListener(@NonNull OnDidFinishRenderingFrameWithStatsListener onDidFinishRenderingFrameWithStatsListener) {
        this.mapChangeReceiver.j0(onDidFinishRenderingFrameWithStatsListener);
    }

    public MapView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mapChangeReceiver = new MapChangeReceiver();
        this.mapCallback = new MapCallback();
        this.initialRenderCallback = new InitialRenderCallback();
        this.focalInvalidator = new FocalPointInvalidator();
        this.registerTouchListener = new GesturesManagerInteractionListener();
        this.cameraDispatcher = new CameraChangeDispatcher();
        Lm0.a.f17149a.d("MapView constructed with context and attribute set", new Object[0]);
        initialize(context, MapLibreMapOptions.c(context, attributeSet));
    }

    public MapView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mapChangeReceiver = new MapChangeReceiver();
        this.mapCallback = new MapCallback();
        this.initialRenderCallback = new InitialRenderCallback();
        this.focalInvalidator = new FocalPointInvalidator();
        this.registerTouchListener = new GesturesManagerInteractionListener();
        this.cameraDispatcher = new CameraChangeDispatcher();
        Lm0.a.f17149a.d("MapView constructed with context, attributeSet and defStyleAttr", new Object[0]);
        initialize(context, MapLibreMapOptions.c(context, attributeSet));
    }

    public MapView(@NonNull Context context, MapLibreMapOptions mapLibreMapOptions) {
        super(context);
        this.mapChangeReceiver = new MapChangeReceiver();
        this.mapCallback = new MapCallback();
        this.initialRenderCallback = new InitialRenderCallback();
        this.focalInvalidator = new FocalPointInvalidator();
        this.registerTouchListener = new GesturesManagerInteractionListener();
        this.cameraDispatcher = new CameraChangeDispatcher();
        Lm0.a.f17149a.d("MapView constructed with context and MapLibreMapOptions", new Object[0]);
        initialize(context, mapLibreMapOptions == null ? MapLibreMapOptions.c(context, null) : mapLibreMapOptions);
    }
}
