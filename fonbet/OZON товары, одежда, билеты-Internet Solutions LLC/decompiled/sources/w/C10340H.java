package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import java.util.Set;
import java.util.concurrent.Executor;
import w.C10340H;
import w.C10344L;

/* renamed from: w.H, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10340H {

    /* renamed from: a, reason: collision with root package name */
    private final b f103043a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayMap f103044b = new ArrayMap(4);

    /* renamed from: w.H$a */
    static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f103045a;

        /* renamed from: b, reason: collision with root package name */
        final CameraManager.AvailabilityCallback f103046b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f103047c = new Object();

        /* renamed from: d, reason: collision with root package name */
        private boolean f103048d = false;

        a(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
            this.f103045a = executor;
            this.f103046b = availabilityCallback;
        }

        final void a() {
            synchronized (this.f103047c) {
                this.f103048d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAccessPrioritiesChanged() {
            synchronized (this.f103047c) {
                try {
                    if (!this.f103048d) {
                        this.f103045a.execute(new Runnable() { // from class: w.F
                            @Override // java.lang.Runnable
                            public final void run() {
                                C10340H.a.this.f103046b.onCameraAccessPrioritiesChanged();
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(@NonNull final String str) {
            synchronized (this.f103047c) {
                try {
                    if (!this.f103048d) {
                        this.f103045a.execute(new Runnable() { // from class: w.E
                            @Override // java.lang.Runnable
                            public final void run() {
                                C10340H.a.this.f103046b.onCameraAvailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(@NonNull final String str) {
            synchronized (this.f103047c) {
                try {
                    if (!this.f103048d) {
                        this.f103045a.execute(new Runnable() { // from class: w.G
                            @Override // java.lang.Runnable
                            public final void run() {
                                C10340H.a.this.f103046b.onCameraUnavailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: w.H$b */
    public interface b {
        void a(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback);

        void b(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws C10348a;

        @NonNull
        CameraCharacteristics c(@NonNull String str) throws C10348a;

        @NonNull
        Set<Set<String>> d() throws C10348a;

        void e(@NonNull CameraManager.AvailabilityCallback availabilityCallback);
    }

    private C10340H(b bVar) {
        this.f103043a = bVar;
    }

    @NonNull
    public static C10340H a(@NonNull Context context, @NonNull Handler handler) {
        int i11 = Build.VERSION.SDK_INT;
        return new C10340H(i11 >= 30 ? new C10343K(context, null) : i11 >= 29 ? new C10342J(context, null) : i11 >= 28 ? new C10341I(context, null) : new C10344L(context, new C10344L.a(handler)));
    }

    @NonNull
    public final C10368u b(@NonNull String str) throws C10348a {
        C10368u c10368u;
        synchronized (this.f103044b) {
            c10368u = (C10368u) this.f103044b.get(str);
            if (c10368u == null) {
                try {
                    c10368u = C10368u.d(this.f103043a.c(str), str);
                    this.f103044b.put(str, c10368u);
                } catch (AssertionError e11) {
                    throw new C10348a(e11.getMessage(), e11);
                }
            }
        }
        return c10368u;
    }

    @NonNull
    public final String[] c() throws C10348a {
        C10344L c10344l = (C10344L) this.f103043a;
        c10344l.getClass();
        try {
            return c10344l.f103049a.getCameraIdList();
        } catch (CameraAccessException e11) {
            throw C10348a.b(e11);
        }
    }

    @NonNull
    public final Set<Set<String>> d() throws C10348a {
        return this.f103043a.d();
    }

    public final void e(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws C10348a {
        this.f103043a.b(str, executor, stateCallback);
    }

    public final void f(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.f103043a.a(executor, availabilityCallback);
    }

    public final void g(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.f103043a.e(availabilityCallback);
    }
}
