package ru.ozon.mapsdk.libre.placemark.view;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.Projection;
import te0.C9867b;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u000223B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u000e*\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u0010-\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010+R\u0016\u0010.\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00101¨\u00064"}, d2 = {"Lru/ozon/mapsdk/libre/placemark/view/LibreMarkerGestureDetector;", "", "Landroid/content/Context;", "context", "Lorg/maplibre/android/maps/Projection;", "projection", "Lru/ozon/mapsdk/libre/placemark/view/LibreMarkerGestureDetector$a;", "onGestureListener", "<init>", "(Landroid/content/Context;Lorg/maplibre/android/maps/Projection;Lru/ozon/mapsdk/libre/placemark/view/LibreMarkerGestureDetector$a;)V", "Landroid/view/MotionEvent;", "event", "Landroid/view/View;", "view", "", "isTouchDetected", "(Landroid/view/MotionEvent;Landroid/view/View;)Z", "isPositionLessTouchSlop", "(Landroid/view/MotionEvent;)Z", "invokeParentOnTouchEvent", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Lru/ozon/mapsdk/libre/placemark/view/LibreMarkerGestureDetector$b;", "tappableAreaConfig", "", "updateTappableAreaConfig", "(Lru/ozon/mapsdk/libre/placemark/view/LibreMarkerGestureDetector$b;)V", "motionEvent", "isSupportClick", "isSupportDraggable", "onTouchEvent", "(Landroid/view/View;Landroid/view/MotionEvent;ZZ)Z", "Lorg/maplibre/android/maps/Projection;", "Lru/ozon/mapsdk/libre/placemark/view/LibreMarkerGestureDetector$a;", "", "touchSlop", "I", "Landroid/view/GestureDetector;", "simpleGestureDetector", "Landroid/view/GestureDetector;", "wasDragging", "Z", "", "dX", "F", "dY", "startX", "startY", "lastMotionEvent", "Landroid/view/MotionEvent;", "Lru/ozon/mapsdk/libre/placemark/view/LibreMarkerGestureDetector$b;", "b", "a", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LibreMarkerGestureDetector {
    private float dX;
    private float dY;
    private MotionEvent lastMotionEvent;

    @NotNull
    private final a onGestureListener;

    @NotNull
    private final Projection projection;

    @NotNull
    private final GestureDetector simpleGestureDetector;
    private float startX;
    private float startY;
    private b tappableAreaConfig;
    private final int touchSlop;
    private boolean wasDragging;

    public interface a {
        void a();

        void b(float f7, float f11);

        void c();

        void d();
    }

    public static final class b {
    }

    public static final class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            LibreMarkerGestureDetector libreMarkerGestureDetector = LibreMarkerGestureDetector.this;
            if (libreMarkerGestureDetector.wasDragging) {
                libreMarkerGestureDetector.wasDragging = false;
                return true;
            }
            libreMarkerGestureDetector.onGestureListener.d();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            return true;
        }
    }

    public LibreMarkerGestureDetector(@NotNull Context context, @NotNull Projection projection, @NotNull a onGestureListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(onGestureListener, "onGestureListener");
        this.projection = projection;
        this.onGestureListener = onGestureListener;
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.simpleGestureDetector = new GestureDetector(context, new c());
    }

    private final boolean invokeParentOnTouchEvent(View view, MotionEvent motionEvent) {
        try {
            ViewParent parent = view.getParent();
            MapView mapView = parent instanceof MapView ? (MapView) parent : null;
            if (mapView == null) {
                return false;
            }
            Field declaredField = MapView.class.getDeclaredField("mapGestureDetector");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(mapView);
            if (obj == null) {
                return false;
            }
            Method declaredMethod = obj.getClass().getDeclaredMethod("onTouchEvent", MotionEvent.class);
            declaredMethod.setAccessible(true);
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
            Object invoke = declaredMethod.invoke(obj, obtain);
            Intrinsics.g(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) invoke).booleanValue();
        } catch (Exception e11) {
            C9867b.f99466a.a("LibreMarkerGestureDetector", "error delegate touch to MapView", e11);
            return false;
        }
    }

    private final boolean isPositionLessTouchSlop(MotionEvent motionEvent) {
        float abs = Math.abs(motionEvent.getRawX() - this.startX);
        float abs2 = Math.abs(motionEvent.getRawY() - this.startY);
        int i11 = this.touchSlop;
        return abs < ((float) i11) && abs2 < ((float) i11);
    }

    private final boolean isTouchDetected(MotionEvent event, View view) {
        return true;
    }

    public final boolean onTouchEvent(@NotNull View view, MotionEvent motionEvent, boolean isSupportClick, boolean isSupportDraggable) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (motionEvent != null) {
            if (!isSupportClick && !isSupportDraggable) {
                return view.onTouchEvent(motionEvent);
            }
            MotionEvent motionEvent2 = this.lastMotionEvent;
            if ((motionEvent2 != null && motionEvent2.getAction() == 0) || isTouchDetected(motionEvent, view)) {
                if (motionEvent.getAction() == 3) {
                    this.wasDragging = false;
                    return false;
                }
                if (motionEvent.getPointerCount() > 1) {
                    invokeParentOnTouchEvent(view, motionEvent);
                    return true;
                }
                this.simpleGestureDetector.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    invokeParentOnTouchEvent(view, motionEvent);
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.dX = view.getX() - motionEvent.getRawX();
                    this.dY = view.getY() - motionEvent.getRawY();
                    this.startX = motionEvent.getRawX();
                    this.startY = motionEvent.getRawY();
                    this.lastMotionEvent = MotionEvent.obtain(motionEvent);
                    this.wasDragging = false;
                    return true;
                }
                if (action == 1) {
                    if (isSupportDraggable && this.wasDragging) {
                        this.onGestureListener.c();
                    }
                    this.lastMotionEvent = MotionEvent.obtain(motionEvent);
                    return true;
                }
                if (action == 2) {
                    if (!isSupportDraggable) {
                        invokeParentOnTouchEvent(view, motionEvent);
                        this.lastMotionEvent = MotionEvent.obtain(motionEvent);
                        return false;
                    }
                    if (!isSupportClick || !isPositionLessTouchSlop(motionEvent)) {
                        MotionEvent motionEvent3 = this.lastMotionEvent;
                        if (motionEvent3 != null && motionEvent3.getAction() == 0) {
                            this.onGestureListener.a();
                            this.wasDragging = true;
                        }
                        MotionEvent motionEvent4 = this.lastMotionEvent;
                        if (motionEvent4 != null && motionEvent4.getAction() == 2) {
                            this.onGestureListener.b(motionEvent.getRawX() + this.dX, motionEvent.getRawY() + this.dY);
                        }
                        this.lastMotionEvent = MotionEvent.obtain(motionEvent);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void updateTappableAreaConfig(b tappableAreaConfig) {
        this.tappableAreaConfig = tappableAreaConfig;
    }
}
