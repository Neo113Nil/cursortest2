package org.maplibre.android.maps;

import Yf.a;
import Yf.d;
import Yf.g;
import Yf.k;
import Yf.l;
import Yf.n;
import Yf.o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.MapLibreMap;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
final class MapGestureDetector {
    private static final String TAG = "MapGestureDetector";
    private final AnnotationManager annotationManager;
    private final CameraChangeDispatcher cameraChangeDispatcher;
    private PointF constantFocalPoint;
    private boolean doubleTapRegistered;
    private a gesturesManager;
    private final Projection projection;
    private Animator rotateAnimator;
    private Animator scaleAnimator;
    private final Transform transform;
    private final UiSettings uiSettings;
    private final CopyOnWriteArrayList<MapLibreMap.OnMapClickListener> onMapClickListenerList = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<MapLibreMap.OnMapLongClickListener> onMapLongClickListenerList = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<MapLibreMap.OnFlingListener> onFlingListenerList = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<MapLibreMap.OnMoveListener> onMoveListenerList = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<MapLibreMap.OnRotateListener> onRotateListenerList = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<MapLibreMap.OnScaleListener> onScaleListenerList = new CopyOnWriteArrayList<>();
    private final CopyOnWriteArrayList<MapLibreMap.OnShoveListener> onShoveListenerList = new CopyOnWriteArrayList<>();

    @NonNull
    private PointF doubleTapFocalPoint = new PointF();
    private final List<Animator> scheduledAnimators = new ArrayList();

    @NonNull
    private Handler animationsTimeoutHandler = new Handler(Looper.getMainLooper());

    @NonNull
    private final Runnable cancelAnimatorsRunnable = new Runnable() { // from class: org.maplibre.android.maps.MapGestureDetector.1
        @Override // java.lang.Runnable
        public final void run() {
            MapGestureDetector.this.cancelAnimators();
        }
    };

    private final class MoveGestureListener extends d.b {
        MoveGestureListener() {
        }

        @Override // Yf.d.a
        public final boolean a(@NonNull d dVar) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (!mapGestureDetector.uiSettings.t()) {
                return false;
            }
            mapGestureDetector.cancelTransitionsIfRequired();
            mapGestureDetector.notifyOnMoveBeginListeners(dVar);
            return true;
        }

        @Override // Yf.d.a
        public final void b(@NonNull d dVar) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            mapGestureDetector.dispatchCameraIdle();
            mapGestureDetector.notifyOnMoveEndListeners(dVar);
        }

        @Override // Yf.d.a
        public final boolean c(@NonNull d dVar, float f7, float f11) {
            if (Float.isNaN(f7) || Float.isNaN(f11)) {
                Logger.e(MapGestureDetector.TAG, "Could not call onMove with parameters " + f7 + "," + f11);
                return true;
            }
            if (f7 == 0.0f && f11 == 0.0f) {
                return true;
            }
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            mapGestureDetector.cameraChangeDispatcher.onCameraMoveStarted(1);
            if (!mapGestureDetector.uiSettings.n()) {
                f7 = 0.0f;
            }
            mapGestureDetector.transform.n(-f7, -f11, 0L);
            mapGestureDetector.notifyOnMoveListeners(dVar);
            return true;
        }
    }

    private final class RotateGestureListener extends k.b {

        /* renamed from: a, reason: collision with root package name */
        private final float f79707a;

        /* renamed from: b, reason: collision with root package name */
        private final float f79708b;

        /* renamed from: c, reason: collision with root package name */
        private final float f79709c;

        /* renamed from: d, reason: collision with root package name */
        private final double f79710d;

        /* renamed from: e, reason: collision with root package name */
        private final float f79711e;

        RotateGestureListener(float f7, double d11, float f11, float f12, float f13) {
            this.f79707a = f7;
            this.f79708b = f11;
            this.f79709c = f12;
            this.f79710d = d11 * 2.2000000000000003E-4d;
            this.f79711e = f13;
        }

        @Override // Yf.k.a
        public final void a(@NonNull k kVar, float f7) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            mapGestureDetector.cameraChangeDispatcher.onCameraMoveStarted(1);
            double i11 = mapGestureDetector.transform.i() + f7;
            PointF i12 = mapGestureDetector.constantFocalPoint != null ? mapGestureDetector.constantFocalPoint : kVar.i();
            mapGestureDetector.transform.p(i11, i12.x, i12.y);
            mapGestureDetector.notifyOnRotateListeners(kVar);
        }

        @Override // Yf.k.a
        public final boolean b(@NonNull k kVar) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (!mapGestureDetector.uiSettings.q()) {
                return false;
            }
            float abs = Math.abs(kVar.v());
            double eventTime = kVar.c().getEventTime();
            double eventTime2 = kVar.e().getEventTime();
            if (eventTime == eventTime2) {
                return false;
            }
            double d11 = abs / (eventTime - eventTime2);
            float abs2 = Math.abs(kVar.w());
            if (d11 < 0.04d) {
                return false;
            }
            if (d11 > 0.07d && abs2 < 5.0f) {
                return false;
            }
            if (d11 > 0.15d && abs2 < 7.0f) {
                return false;
            }
            if (d11 > 0.5d && abs2 < 15.0f) {
                return false;
            }
            if (mapGestureDetector.uiSettings.o()) {
                mapGestureDetector.gesturesManager.f().B(this.f79707a);
                mapGestureDetector.gesturesManager.f().s();
            }
            mapGestureDetector.cancelTransitionsIfRequired();
            mapGestureDetector.notifyOnRotateBeginListeners(kVar);
            return true;
        }

        @Override // Yf.k.a
        public final void c(@NonNull k kVar, float f7, float f11, float f12) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (mapGestureDetector.uiSettings.o()) {
                mapGestureDetector.gesturesManager.f().B(this.f79711e);
            }
            mapGestureDetector.notifyOnRotateEndListeners(kVar);
            float max = Math.max(-30.0f, Math.min(30.0f, f12 * this.f79708b));
            double abs = Math.abs(kVar.v()) / (Math.abs(f11) + Math.abs(f7));
            if (!mapGestureDetector.uiSettings.r() || Math.abs(max) < this.f79709c || (mapGestureDetector.gesturesManager.f().t() && abs < this.f79710d)) {
                mapGestureDetector.dispatchCameraIdle();
                return;
            }
            long log = (long) ((Math.log((1.0d / Math.pow(2.718281828459045d, 2.0d)) + Math.abs(max)) + 2.0d) * 150.0d);
            final PointF i11 = mapGestureDetector.constantFocalPoint != null ? mapGestureDetector.constantFocalPoint : kVar.i();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(max, 0.0f);
            ofFloat.setDuration(log);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.maplibre.android.maps.MapGestureDetector.RotateGestureListener.1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                    RotateGestureListener rotateGestureListener = RotateGestureListener.this;
                    Transform transform = MapGestureDetector.this.transform;
                    double floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() + MapGestureDetector.this.transform.i();
                    PointF pointF = i11;
                    transform.q(floatValue, pointF.x, pointF.y, 0L);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.maplibre.android.maps.MapGestureDetector.RotateGestureListener.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    MapGestureDetector.this.transform.c();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    MapGestureDetector.this.dispatchCameraIdle();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    RotateGestureListener rotateGestureListener = RotateGestureListener.this;
                    MapGestureDetector.this.transform.c();
                    MapGestureDetector.this.cameraChangeDispatcher.onCameraMoveStarted(1);
                }
            });
            mapGestureDetector.rotateAnimator = ofFloat;
            mapGestureDetector.scheduleAnimator(mapGestureDetector.rotateAnimator);
        }
    }

    private final class ScaleGestureListener extends o.b {

        /* renamed from: a, reason: collision with root package name */
        private final float f79716a;

        /* renamed from: b, reason: collision with root package name */
        private final float f79717b;

        /* renamed from: c, reason: collision with root package name */
        private final float f79718c;

        /* renamed from: d, reason: collision with root package name */
        private final double f79719d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f79720e;

        /* renamed from: f, reason: collision with root package name */
        private float f79721f;

        /* renamed from: g, reason: collision with root package name */
        private double f79722g;

        /* renamed from: h, reason: collision with root package name */
        private double f79723h;

        ScaleGestureListener(double d11, float f7, float f11, float f12) {
            this.f79716a = f7;
            this.f79717b = f11;
            this.f79718c = f12;
            this.f79719d = d11 * 0.004d;
        }

        @NonNull
        private PointF d(@NonNull o oVar) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            return mapGestureDetector.constantFocalPoint != null ? mapGestureDetector.constantFocalPoint : this.f79720e ? new PointF(mapGestureDetector.uiSettings.d() / 2.0f, mapGestureDetector.uiSettings.b() / 2.0f) : oVar.i();
        }

        @Override // Yf.o.c
        public final void a(@NonNull o oVar) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            mapGestureDetector.cameraChangeDispatcher.onCameraMoveStarted(1);
            PointF d11 = d(oVar);
            if (this.f79720e) {
                double abs = Math.abs(oVar.c().getY() - mapGestureDetector.doubleTapFocalPoint.y);
                boolean z11 = oVar.c().getY() < mapGestureDetector.doubleTapFocalPoint.y;
                double d12 = (((abs - 0.0d) / (this.f79722g - 0.0d)) * 4.0d) + 0.0d;
                double d13 = this.f79723h;
                mapGestureDetector.transform.v((z11 ? d13 - d12 : d13 + d12) * mapGestureDetector.uiSettings.e(), d11);
            } else {
                mapGestureDetector.transform.w((Math.log(oVar.z()) / Math.log(1.5707963267948966d)) * 0.6499999761581421d * mapGestureDetector.uiSettings.e(), d11);
            }
            mapGestureDetector.notifyOnScaleListeners(oVar);
            this.f79721f = Math.abs(oVar.x() - oVar.y());
        }

        @Override // Yf.o.c
        public final boolean b(@NonNull o oVar) {
            this.f79720e = oVar.j() == 1;
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (mapGestureDetector.uiSettings.v()) {
                if (this.f79720e) {
                    if (mapGestureDetector.uiSettings.p()) {
                        mapGestureDetector.gesturesManager.b().g(false);
                        this.f79722g = Resources.getSystem().getDisplayMetrics().heightPixels;
                        this.f79723h = mapGestureDetector.transform.j();
                        mapGestureDetector.cancelTransitionsIfRequired();
                        mapGestureDetector.notifyOnScaleBeginListeners(oVar);
                        this.f79721f = Math.abs(oVar.x() - oVar.y());
                        return true;
                    }
                } else if (oVar.y() > 0.0f) {
                    float x11 = oVar.x();
                    float y11 = oVar.y();
                    double eventTime = oVar.c().getEventTime();
                    double eventTime2 = oVar.e().getEventTime();
                    if (eventTime != eventTime2) {
                        double abs = Math.abs(x11 - y11) / (eventTime - eventTime2);
                        if (abs >= this.f79716a) {
                            if (!mapGestureDetector.gesturesManager.d().t()) {
                                if (Math.abs(mapGestureDetector.gesturesManager.d().v()) <= 0.4d || abs >= this.f79717b) {
                                    if (mapGestureDetector.uiSettings.k()) {
                                        mapGestureDetector.gesturesManager.d().g(false);
                                    }
                                }
                            }
                            this.f79722g = Resources.getSystem().getDisplayMetrics().heightPixels;
                            this.f79723h = mapGestureDetector.transform.j();
                            mapGestureDetector.cancelTransitionsIfRequired();
                            mapGestureDetector.notifyOnScaleBeginListeners(oVar);
                            this.f79721f = Math.abs(oVar.x() - oVar.y());
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override // Yf.o.c
        public final void c(@NonNull o oVar, float f7, float f11) {
            boolean z11 = this.f79720e;
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (z11) {
                mapGestureDetector.gesturesManager.b().g(true);
            } else {
                mapGestureDetector.gesturesManager.d().g(true);
            }
            mapGestureDetector.notifyOnScaleEndListeners(oVar);
            float abs = Math.abs(f11) + Math.abs(f7);
            if (!mapGestureDetector.uiSettings.s() || abs < this.f79718c || this.f79721f / abs < this.f79719d) {
                mapGestureDetector.dispatchCameraIdle();
                return;
            }
            boolean A11 = oVar.A();
            double max = Math.max(0.0d, Math.min(2.5d, abs * 2.5d * 1.0E-4d));
            if (A11) {
                max = -max;
            }
            double d11 = max;
            mapGestureDetector.scaleAnimator = mapGestureDetector.createScaleAnimator(mapGestureDetector.transform.j(), d11, d(oVar), (long) ((Math.log((1.0d / Math.pow(2.718281828459045d, 2.0d)) + Math.abs(d11)) + 2.0d) * 150.0d));
            mapGestureDetector.scheduleAnimator(mapGestureDetector.scaleAnimator);
        }
    }

    private final class ShoveGestureListener extends l.b {
        ShoveGestureListener() {
        }

        @Override // Yf.l.a
        public final void a(@NonNull l lVar) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            mapGestureDetector.dispatchCameraIdle();
            mapGestureDetector.gesturesManager.b().g(true);
            mapGestureDetector.notifyOnShoveEndListeners(lVar);
        }

        @Override // Yf.l.a
        public final void b(@NonNull l lVar, float f7) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            mapGestureDetector.cameraChangeDispatcher.onCameraMoveStarted(1);
            mapGestureDetector.transform.u(Double.valueOf(Math.max(0.0d, Math.min(60.0d, mapGestureDetector.transform.k() - (f7 * 0.1f)))));
            mapGestureDetector.notifyOnShoveListeners(lVar);
        }

        @Override // Yf.l.a
        public final boolean c(@NonNull l lVar) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (!mapGestureDetector.uiSettings.u()) {
                return false;
            }
            mapGestureDetector.cancelTransitionsIfRequired();
            mapGestureDetector.gesturesManager.b().g(false);
            mapGestureDetector.notifyOnShoveBeginListeners(lVar);
            return true;
        }
    }

    private final class StandardGestureListener extends n.b {

        /* renamed from: a, reason: collision with root package name */
        private final float f79726a;

        StandardGestureListener(float f7) {
            this.f79726a = f7;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (actionMasked == 0) {
                mapGestureDetector.doubleTapFocalPoint = new PointF(motionEvent.getX(), motionEvent.getY());
                mapGestureDetector.doubleTapStarted();
            }
            if (motionEvent.getActionMasked() == 1) {
                float abs = Math.abs(motionEvent.getX() - mapGestureDetector.doubleTapFocalPoint.x);
                float abs2 = Math.abs(motionEvent.getY() - mapGestureDetector.doubleTapFocalPoint.y);
                float f7 = this.f79726a;
                if (abs <= f7 && abs2 <= f7 && mapGestureDetector.uiSettings.v() && mapGestureDetector.uiSettings.l()) {
                    if (mapGestureDetector.constantFocalPoint != null) {
                        mapGestureDetector.doubleTapFocalPoint = mapGestureDetector.constantFocalPoint;
                    }
                    mapGestureDetector.zoomInAnimated(mapGestureDetector.doubleTapFocalPoint, false);
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f11) {
            double d11;
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (!mapGestureDetector.uiSettings.t() || !mapGestureDetector.uiSettings.m()) {
                return false;
            }
            float c11 = mapGestureDetector.uiSettings.c();
            double hypot = Math.hypot(f7 / c11, f11 / c11);
            mapGestureDetector.uiSettings.getClass();
            if (hypot < 1000) {
                return false;
            }
            double k11 = mapGestureDetector.transform.k();
            double d12 = (hypot / 7.0d) / ((k11 != 0.0d ? k11 / 10.0d : 0.0d) + 1.5d);
            mapGestureDetector.uiSettings.getClass();
            long j11 = (long) (d12 + 150);
            float f12 = j11;
            double d13 = ((f7 * f12) * 0.28d) / 1000.0d;
            double d14 = ((f12 * f11) * 0.28d) / 1000.0d;
            if (mapGestureDetector.uiSettings.n()) {
                d11 = d13;
            } else {
                if (Math.abs(Math.toDegrees(Math.atan(d13 / d14))) > 75.0d) {
                    return false;
                }
                d11 = 0.0d;
            }
            mapGestureDetector.transform.c();
            mapGestureDetector.notifyOnFlingListeners();
            mapGestureDetector.cameraChangeDispatcher.onCameraMoveStarted(1);
            mapGestureDetector.transform.n(d11, d14, j11);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            MapGestureDetector.this.notifyOnMapLongClickListeners(new PointF(motionEvent.getX(), motionEvent.getY()));
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (mapGestureDetector.annotationManager.f(pointF)) {
                return true;
            }
            if (mapGestureDetector.uiSettings.j()) {
                mapGestureDetector.annotationManager.d();
            }
            mapGestureDetector.notifyOnMapClickListeners(pointF);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            MapGestureDetector.this.transform.c();
            return true;
        }
    }

    private final class TapGestureListener implements g.a {
        TapGestureListener() {
        }

        @Override // Yf.g.a
        public final boolean a(@NonNull g gVar, int i11) {
            MapGestureDetector mapGestureDetector = MapGestureDetector.this;
            if (!mapGestureDetector.uiSettings.v() || i11 != 2) {
                return false;
            }
            mapGestureDetector.transform.c();
            mapGestureDetector.cameraChangeDispatcher.onCameraMoveStarted(1);
            mapGestureDetector.zoomOutAnimated(mapGestureDetector.constantFocalPoint != null ? mapGestureDetector.constantFocalPoint : gVar.i(), false);
            return true;
        }
    }

    MapGestureDetector(Context context, Transform transform, Projection projection, UiSettings uiSettings, AnnotationManager annotationManager, CameraChangeDispatcher cameraChangeDispatcher) {
        this.annotationManager = annotationManager;
        this.transform = transform;
        this.projection = projection;
        this.uiSettings = uiSettings;
        this.cameraChangeDispatcher = cameraChangeDispatcher;
        if (context != null) {
            initializeGesturesManager(new a(context, true), true);
            initializeGestureListeners(context, true);
        }
    }

    private void cancelAnimator(Animator animator) {
        if (animator == null || !animator.isStarted()) {
            return;
        }
        animator.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTransitionsIfRequired() {
        if (noGesturesInProgress()) {
            this.transform.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animator createScaleAnimator(double d11, double d12, @NonNull final PointF pointF, long j11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat((float) d11, (float) (d11 + d12));
        ofFloat.setDuration(j11);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.maplibre.android.maps.MapGestureDetector.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                MapGestureDetector.this.transform.v(((Float) valueAnimator.getAnimatedValue()).floatValue(), pointF);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: org.maplibre.android.maps.MapGestureDetector.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                MapGestureDetector.this.transform.c();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                MapGestureDetector.this.dispatchCameraIdle();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                MapGestureDetector mapGestureDetector = MapGestureDetector.this;
                mapGestureDetector.transform.c();
                mapGestureDetector.cameraChangeDispatcher.onCameraMoveStarted(1);
            }
        });
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCameraIdle() {
        if (noGesturesInProgress()) {
            this.transform.m();
            this.cameraChangeDispatcher.onCameraIdle();
        }
    }

    private void doubleTapFinished() {
        if (this.doubleTapRegistered) {
            this.gesturesManager.b().g(true);
            this.doubleTapRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doubleTapStarted() {
        this.gesturesManager.b().g(false);
        this.doubleTapRegistered = true;
    }

    private void initializeGestureListeners(@NonNull Context context, boolean z11) {
        if (z11) {
            StandardGestureListener standardGestureListener = new StandardGestureListener(context.getResources().getDimension(R.dimen.mapbox_defaultScaleSpanSinceStartThreshold));
            MoveGestureListener moveGestureListener = new MoveGestureListener();
            ScaleGestureListener scaleGestureListener = new ScaleGestureListener(context.getResources().getDimension(R.dimen.maplibre_density_constant), context.getResources().getDimension(R.dimen.maplibre_minimum_scale_speed), context.getResources().getDimension(R.dimen.maplibre_minimum_angled_scale_speed), context.getResources().getDimension(R.dimen.maplibre_minimum_scale_velocity));
            RotateGestureListener rotateGestureListener = new RotateGestureListener(context.getResources().getDimension(R.dimen.maplibre_minimum_scale_span_when_rotating), context.getResources().getDimension(R.dimen.maplibre_density_constant), context.getResources().getDimension(R.dimen.maplibre_angular_velocity_multiplier), context.getResources().getDimension(R.dimen.maplibre_minimum_angular_velocity), context.getResources().getDimension(R.dimen.mapbox_defaultScaleSpanSinceStartThreshold));
            ShoveGestureListener shoveGestureListener = new ShoveGestureListener();
            TapGestureListener tapGestureListener = new TapGestureListener();
            this.gesturesManager.m(standardGestureListener);
            this.gesturesManager.h(moveGestureListener);
            this.gesturesManager.n(scaleGestureListener);
            this.gesturesManager.k(rotateGestureListener);
            this.gesturesManager.l(shoveGestureListener);
            this.gesturesManager.i(tapGestureListener);
        }
    }

    private void initializeGesturesManager(@NonNull a aVar, boolean z11) {
        if (z11) {
            HashSet hashSet = new HashSet();
            hashSet.add(3);
            hashSet.add(1);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(3);
            hashSet2.add(2);
            HashSet hashSet3 = new HashSet();
            hashSet3.add(1);
            hashSet3.add(6);
            aVar.j(hashSet, hashSet2, hashSet3);
        }
        aVar.d().x(3.0f);
        aVar.b().x();
        this.gesturesManager = aVar;
    }

    private boolean noGesturesInProgress() {
        if (this.uiSettings.t() && this.gesturesManager.b().t()) {
            return false;
        }
        if (this.uiSettings.v() && this.gesturesManager.f().t()) {
            return false;
        }
        if (this.uiSettings.q() && this.gesturesManager.d().t()) {
            return false;
        }
        return (this.uiSettings.u() && this.gesturesManager.e().t()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleAnimator(Animator animator) {
        this.scheduledAnimators.add(animator);
        this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
        this.animationsTimeoutHandler.postDelayed(this.cancelAnimatorsRunnable, 150L);
    }

    private void zoomAnimated(boolean z11, @NonNull PointF pointF, boolean z12) {
        cancelAnimator(this.scaleAnimator);
        Animator createScaleAnimator = createScaleAnimator(this.transform.j(), z11 ? 1.0d : -1.0d, pointF, 300L);
        this.scaleAnimator = createScaleAnimator;
        if (z12) {
            createScaleAnimator.start();
        } else {
            scheduleAnimator(createScaleAnimator);
        }
    }

    void addOnFlingListener(MapLibreMap.OnFlingListener onFlingListener) {
        this.onFlingListenerList.add(onFlingListener);
    }

    void addOnMapClickListener(MapLibreMap.OnMapClickListener onMapClickListener) {
        this.onMapClickListenerList.add(onMapClickListener);
    }

    void addOnMapLongClickListener(MapLibreMap.OnMapLongClickListener onMapLongClickListener) {
        this.onMapLongClickListenerList.add(onMapLongClickListener);
    }

    void addOnMoveListener(MapLibreMap.OnMoveListener onMoveListener) {
        this.onMoveListenerList.add(onMoveListener);
    }

    void addOnRotateListener(MapLibreMap.OnRotateListener onRotateListener) {
        this.onRotateListenerList.add(onRotateListener);
    }

    void addOnScaleListener(MapLibreMap.OnScaleListener onScaleListener) {
        this.onScaleListenerList.add(onScaleListener);
    }

    void addShoveListener(MapLibreMap.OnShoveListener onShoveListener) {
        this.onShoveListenerList.add(onShoveListener);
    }

    void cancelAnimators() {
        this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
        this.scheduledAnimators.clear();
        cancelAnimator(this.scaleAnimator);
        cancelAnimator(this.rotateAnimator);
        dispatchCameraIdle();
    }

    a getGesturesManager() {
        return this.gesturesManager;
    }

    void notifyOnFlingListeners() {
        Iterator<MapLibreMap.OnFlingListener> it = this.onFlingListenerList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    void notifyOnMapClickListeners(@NonNull PointF pointF) {
        Iterator<MapLibreMap.OnMapClickListener> it = this.onMapClickListenerList.iterator();
        while (it.hasNext() && !it.next().e(this.projection.b(pointF))) {
        }
    }

    void notifyOnMapLongClickListeners(@NonNull PointF pointF) {
        Iterator<MapLibreMap.OnMapLongClickListener> it = this.onMapLongClickListenerList.iterator();
        while (it.hasNext() && !it.next().a(this.projection.b(pointF))) {
        }
    }

    void notifyOnMoveBeginListeners(@NonNull d dVar) {
        Iterator<MapLibreMap.OnMoveListener> it = this.onMoveListenerList.iterator();
        while (it.hasNext()) {
            it.next().a(dVar);
        }
    }

    void notifyOnMoveEndListeners(@NonNull d dVar) {
        Iterator<MapLibreMap.OnMoveListener> it = this.onMoveListenerList.iterator();
        while (it.hasNext()) {
            it.next().b(dVar);
        }
    }

    void notifyOnMoveListeners(@NonNull d dVar) {
        Iterator<MapLibreMap.OnMoveListener> it = this.onMoveListenerList.iterator();
        while (it.hasNext()) {
            it.next().c(dVar);
        }
    }

    void notifyOnRotateBeginListeners(@NonNull k kVar) {
        Iterator<MapLibreMap.OnRotateListener> it = this.onRotateListenerList.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    void notifyOnRotateEndListeners(@NonNull k kVar) {
        Iterator<MapLibreMap.OnRotateListener> it = this.onRotateListenerList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    void notifyOnRotateListeners(@NonNull k kVar) {
        Iterator<MapLibreMap.OnRotateListener> it = this.onRotateListenerList.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    void notifyOnScaleBeginListeners(@NonNull o oVar) {
        Iterator<MapLibreMap.OnScaleListener> it = this.onScaleListenerList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    void notifyOnScaleEndListeners(@NonNull o oVar) {
        Iterator<MapLibreMap.OnScaleListener> it = this.onScaleListenerList.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    void notifyOnScaleListeners(@NonNull o oVar) {
        Iterator<MapLibreMap.OnScaleListener> it = this.onScaleListenerList.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    void notifyOnShoveBeginListeners(@NonNull l lVar) {
        Iterator<MapLibreMap.OnShoveListener> it = this.onShoveListenerList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    void notifyOnShoveEndListeners(@NonNull l lVar) {
        Iterator<MapLibreMap.OnShoveListener> it = this.onShoveListenerList.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    void notifyOnShoveListeners(@NonNull l lVar) {
        Iterator<MapLibreMap.OnShoveListener> it = this.onShoveListenerList.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 2 || motionEvent.getActionMasked() != 8 || !this.uiSettings.v()) {
            return false;
        }
        this.transform.c();
        this.transform.w(motionEvent.getAxisValue(9), new PointF(motionEvent.getX(), motionEvent.getY()));
        return true;
    }

    boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getButtonState() != 0 && motionEvent.getButtonState() != 1) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            cancelAnimators();
            this.transform.r(true);
        }
        boolean g10 = this.gesturesManager.g(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            doubleTapFinished();
            this.transform.r(false);
            if (!this.scheduledAnimators.isEmpty()) {
                this.animationsTimeoutHandler.removeCallbacksAndMessages(null);
                Iterator<Animator> it = this.scheduledAnimators.iterator();
                while (it.hasNext()) {
                    it.next().start();
                }
                this.scheduledAnimators.clear();
            }
        } else {
            if (actionMasked == 3) {
                this.scheduledAnimators.clear();
                this.transform.r(false);
                doubleTapFinished();
                return g10;
            }
            if (actionMasked == 5) {
                doubleTapFinished();
                return g10;
            }
        }
        return g10;
    }

    void removeOnFlingListener(MapLibreMap.OnFlingListener onFlingListener) {
        this.onFlingListenerList.remove(onFlingListener);
    }

    void removeOnMapClickListener(MapLibreMap.OnMapClickListener onMapClickListener) {
        this.onMapClickListenerList.remove(onMapClickListener);
    }

    void removeOnMapLongClickListener(MapLibreMap.OnMapLongClickListener onMapLongClickListener) {
        this.onMapLongClickListenerList.remove(onMapLongClickListener);
    }

    void removeOnMoveListener(MapLibreMap.OnMoveListener onMoveListener) {
        this.onMoveListenerList.remove(onMoveListener);
    }

    void removeOnRotateListener(MapLibreMap.OnRotateListener onRotateListener) {
        this.onRotateListenerList.remove(onRotateListener);
    }

    void removeOnScaleListener(MapLibreMap.OnScaleListener onScaleListener) {
        this.onScaleListenerList.remove(onScaleListener);
    }

    void removeShoveListener(MapLibreMap.OnShoveListener onShoveListener) {
        this.onShoveListenerList.remove(onShoveListener);
    }

    void setFocalPoint(PointF pointF) {
        if (pointF == null && this.uiSettings.a() != null) {
            pointF = this.uiSettings.a();
        }
        this.constantFocalPoint = pointF;
    }

    void setGesturesManager(@NonNull Context context, @NonNull a aVar, boolean z11, boolean z12) {
        initializeGesturesManager(aVar, z12);
        initializeGestureListeners(context, z11);
    }

    void zoomInAnimated(@NonNull PointF pointF, boolean z11) {
        zoomAnimated(true, pointF, z11);
    }

    void zoomOutAnimated(@NonNull PointF pointF, boolean z11) {
        zoomAnimated(false, pointF, z11);
    }
}
