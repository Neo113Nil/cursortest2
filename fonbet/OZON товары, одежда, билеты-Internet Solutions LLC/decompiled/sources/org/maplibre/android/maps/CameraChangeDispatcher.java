package org.maplibre.android.maps;

import Le0.C;
import Le0.C3585b;
import Le0.D;
import Le0.E;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.maps.MapLibreMap;

/* loaded from: classes10.dex */
class CameraChangeDispatcher implements MapLibreMap.OnCameraMoveStartedListener, MapLibreMap.OnCameraMoveListener, MapLibreMap.OnCameraMoveCanceledListener, MapLibreMap.OnCameraIdleListener {

    /* renamed from: c, reason: collision with root package name */
    private int f79664c;

    /* renamed from: a, reason: collision with root package name */
    private final CameraChangeHandler f79662a = new CameraChangeHandler(this);

    /* renamed from: b, reason: collision with root package name */
    private boolean f79663b = true;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList<MapLibreMap.OnCameraMoveStartedListener> f79665d = new CopyOnWriteArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList<MapLibreMap.OnCameraMoveCanceledListener> f79666e = new CopyOnWriteArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArrayList<MapLibreMap.OnCameraMoveListener> f79667f = new CopyOnWriteArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArrayList<MapLibreMap.OnCameraIdleListener> f79668g = new CopyOnWriteArrayList<>();

    private static class CameraChangeHandler extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<CameraChangeDispatcher> f79669a;

        CameraChangeHandler(CameraChangeDispatcher cameraChangeDispatcher) {
            this.f79669a = new WeakReference<>(cameraChangeDispatcher);
        }

        final void a(int i11) {
            CameraChangeDispatcher cameraChangeDispatcher = this.f79669a.get();
            if (cameraChangeDispatcher != null) {
                if (i11 == 0) {
                    boolean z11 = !cameraChangeDispatcher.f79663b && (hasMessages(3) || hasMessages(2));
                    removeMessages(3);
                    removeMessages(2);
                    if (z11) {
                        return;
                    }
                }
                Message message = new Message();
                message.what = i11;
                sendMessage(message);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            CameraChangeDispatcher cameraChangeDispatcher = this.f79669a.get();
            if (cameraChangeDispatcher != null) {
                int i11 = message.what;
                if (i11 == 0) {
                    CameraChangeDispatcher.e(cameraChangeDispatcher);
                    return;
                }
                if (i11 == 1) {
                    CameraChangeDispatcher.c(cameraChangeDispatcher);
                } else if (i11 == 2) {
                    CameraChangeDispatcher.d(cameraChangeDispatcher);
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    CameraChangeDispatcher.b(cameraChangeDispatcher);
                }
            }
        }
    }

    CameraChangeDispatcher() {
    }

    static void b(CameraChangeDispatcher cameraChangeDispatcher) {
        if (cameraChangeDispatcher.f79663b) {
            return;
        }
        cameraChangeDispatcher.f79663b = true;
        CopyOnWriteArrayList<MapLibreMap.OnCameraIdleListener> copyOnWriteArrayList = cameraChangeDispatcher.f79668g;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator<MapLibreMap.OnCameraIdleListener> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().onCameraIdle();
        }
    }

    static void c(CameraChangeDispatcher cameraChangeDispatcher) {
        CopyOnWriteArrayList<MapLibreMap.OnCameraMoveListener> copyOnWriteArrayList = cameraChangeDispatcher.f79667f;
        if (copyOnWriteArrayList.isEmpty() || cameraChangeDispatcher.f79663b) {
            return;
        }
        Iterator<MapLibreMap.OnCameraMoveListener> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().onCameraMove();
        }
    }

    static void d(CameraChangeDispatcher cameraChangeDispatcher) {
        CopyOnWriteArrayList<MapLibreMap.OnCameraMoveCanceledListener> copyOnWriteArrayList = cameraChangeDispatcher.f79666e;
        if (copyOnWriteArrayList.isEmpty() || cameraChangeDispatcher.f79663b) {
            return;
        }
        Iterator<MapLibreMap.OnCameraMoveCanceledListener> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().onCameraMoveCanceled();
        }
    }

    static void e(CameraChangeDispatcher cameraChangeDispatcher) {
        if (cameraChangeDispatcher.f79663b) {
            cameraChangeDispatcher.f79663b = false;
            CopyOnWriteArrayList<MapLibreMap.OnCameraMoveStartedListener> copyOnWriteArrayList = cameraChangeDispatcher.f79665d;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            Iterator<MapLibreMap.OnCameraMoveStartedListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onCameraMoveStarted(cameraChangeDispatcher.f79664c);
            }
        }
    }

    final void f(@NonNull MapLibreMap.OnCameraIdleListener onCameraIdleListener) {
        this.f79668g.add(onCameraIdleListener);
    }

    final void g(MapLibreMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.f79666e.add(onCameraMoveCanceledListener);
    }

    final void h(C3585b c3585b) {
        this.f79667f.add(c3585b);
    }

    final void i(MapLibreMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.f79665d.add(onCameraMoveStartedListener);
    }

    final void j() {
        this.f79662a.removeCallbacksAndMessages(null);
        this.f79665d.clear();
        this.f79666e.clear();
        this.f79667f.clear();
        this.f79668g.clear();
    }

    final void k(@NonNull D d11) {
        CopyOnWriteArrayList<MapLibreMap.OnCameraIdleListener> copyOnWriteArrayList = this.f79668g;
        if (copyOnWriteArrayList.contains(d11)) {
            copyOnWriteArrayList.remove(d11);
        }
    }

    final void l(E e11) {
        CopyOnWriteArrayList<MapLibreMap.OnCameraMoveCanceledListener> copyOnWriteArrayList = this.f79666e;
        if (copyOnWriteArrayList.contains(e11)) {
            copyOnWriteArrayList.remove(e11);
        }
    }

    final void m(C c11) {
        CopyOnWriteArrayList<MapLibreMap.OnCameraMoveStartedListener> copyOnWriteArrayList = this.f79665d;
        if (copyOnWriteArrayList.contains(c11)) {
            copyOnWriteArrayList.remove(c11);
        }
    }

    @Override // org.maplibre.android.maps.MapLibreMap.OnCameraIdleListener
    public final void onCameraIdle() {
        this.f79662a.a(3);
    }

    @Override // org.maplibre.android.maps.MapLibreMap.OnCameraMoveListener
    public final void onCameraMove() {
        this.f79662a.a(1);
    }

    @Override // org.maplibre.android.maps.MapLibreMap.OnCameraMoveCanceledListener
    public final void onCameraMoveCanceled() {
        this.f79662a.a(2);
    }

    @Override // org.maplibre.android.maps.MapLibreMap.OnCameraMoveStartedListener
    public final void onCameraMoveStarted(int i11) {
        this.f79664c = i11;
        this.f79662a.a(0);
    }
}
