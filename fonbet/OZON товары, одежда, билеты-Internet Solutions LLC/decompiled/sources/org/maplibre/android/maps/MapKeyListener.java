package org.maplibre.android.maps;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
final class MapKeyListener {

    /* renamed from: a, reason: collision with root package name */
    private final Transform f79729a;

    /* renamed from: b, reason: collision with root package name */
    private final UiSettings f79730b;

    /* renamed from: c, reason: collision with root package name */
    private final MapGestureDetector f79731c;

    /* renamed from: d, reason: collision with root package name */
    private TrackballLongPressTimeOut f79732d;

    private class TrackballLongPressTimeOut implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private boolean f79733a = false;

        TrackballLongPressTimeOut() {
        }

        public final void a() {
            this.f79733a = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f79733a) {
                return;
            }
            MapKeyListener mapKeyListener = MapKeyListener.this;
            mapKeyListener.f79731c.zoomOutAnimated(new PointF(mapKeyListener.f79730b.d() / 2.0f, mapKeyListener.f79730b.b() / 2.0f), true);
            mapKeyListener.f79732d = null;
        }
    }

    MapKeyListener(Transform transform, UiSettings uiSettings, MapGestureDetector mapGestureDetector) {
        this.f79729a = transform;
        this.f79730b = uiSettings;
        this.f79731c = mapGestureDetector;
    }

    final boolean d(int i11, @NonNull KeyEvent keyEvent) {
        double d11 = keyEvent.getRepeatCount() >= 5 ? 50.0d : 10.0d;
        if (i11 != 66) {
            Transform transform = this.f79729a;
            UiSettings uiSettings = this.f79730b;
            switch (i11) {
                case 19:
                    if (uiSettings.t()) {
                        transform.c();
                        this.f79729a.n(0.0d, d11, 0L);
                        break;
                    }
                    break;
                case 20:
                    if (uiSettings.t()) {
                        transform.c();
                        this.f79729a.n(0.0d, -d11, 0L);
                        break;
                    }
                    break;
                case 21:
                    if (uiSettings.t()) {
                        transform.c();
                        this.f79729a.n(d11, 0.0d, 0L);
                        break;
                    }
                    break;
                case 22:
                    if (uiSettings.t()) {
                        transform.c();
                        this.f79729a.n(-d11, 0.0d, 0L);
                        break;
                    }
                    break;
            }
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    final boolean e(int i11) {
        if (i11 != 23 && i11 != 66) {
            return false;
        }
        UiSettings uiSettings = this.f79730b;
        if (!uiSettings.v()) {
            return false;
        }
        this.f79731c.zoomOutAnimated(new PointF(uiSettings.d() / 2.0f, uiSettings.b() / 2.0f), true);
        return true;
    }

    final boolean f(int i11, KeyEvent keyEvent) {
        if (keyEvent.isCanceled()) {
            return false;
        }
        if (i11 != 23 && i11 != 66) {
            return false;
        }
        UiSettings uiSettings = this.f79730b;
        if (!uiSettings.v()) {
            return false;
        }
        this.f79731c.zoomInAnimated(new PointF(uiSettings.d() / 2.0f, uiSettings.b() / 2.0f), true);
        return true;
    }

    final boolean g(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            TrackballLongPressTimeOut trackballLongPressTimeOut = this.f79732d;
            if (trackballLongPressTimeOut != null) {
                trackballLongPressTimeOut.a();
                this.f79732d = null;
            }
            this.f79732d = new TrackballLongPressTimeOut();
            new Handler(Looper.getMainLooper()).postDelayed(this.f79732d, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        UiSettings uiSettings = this.f79730b;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!uiSettings.t()) {
                    return false;
                }
                Transform transform = this.f79729a;
                transform.c();
                transform.n(motionEvent.getX() * (-10.0d), motionEvent.getY() * (-10.0d), 0L);
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
            TrackballLongPressTimeOut trackballLongPressTimeOut2 = this.f79732d;
            if (trackballLongPressTimeOut2 != null) {
                trackballLongPressTimeOut2.a();
                this.f79732d = null;
                return true;
            }
        } else {
            if (!uiSettings.v()) {
                return false;
            }
            if (this.f79732d != null) {
                this.f79731c.zoomInAnimated(new PointF(uiSettings.d() / 2.0f, uiSettings.b() / 2.0f), true);
            }
        }
        return true;
    }
}
