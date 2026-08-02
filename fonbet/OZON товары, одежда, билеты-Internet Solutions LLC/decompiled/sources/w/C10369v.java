package w;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import w.C10336D;
import w.C10369v;

/* renamed from: w.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10369v {

    /* renamed from: a, reason: collision with root package name */
    private final C10334B f103118a;

    /* renamed from: w.v$a */
    interface a {
        void a(@NonNull x.m mVar) throws C10348a;
    }

    /* renamed from: w.v$b */
    static final class b extends CameraDevice.StateCallback {

        /* renamed from: a, reason: collision with root package name */
        final CameraDevice.StateCallback f103119a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f103120b;

        b(@NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) {
            this.f103120b = executor;
            this.f103119a = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(@NonNull final CameraDevice cameraDevice) {
            this.f103120b.execute(new Runnable() { // from class: w.w
                @Override // java.lang.Runnable
                public final void run() {
                    C10369v.b.this.f103119a.onClosed(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(@NonNull final CameraDevice cameraDevice) {
            this.f103120b.execute(new Runnable() { // from class: w.y
                @Override // java.lang.Runnable
                public final void run() {
                    C10369v.b.this.f103119a.onDisconnected(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(@NonNull final CameraDevice cameraDevice, final int i11) {
            this.f103120b.execute(new Runnable() { // from class: w.x
                @Override // java.lang.Runnable
                public final void run() {
                    C10369v.b.this.f103119a.onError(cameraDevice, i11);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(@NonNull final CameraDevice cameraDevice) {
            this.f103120b.execute(new Runnable() { // from class: w.z
                @Override // java.lang.Runnable
                public final void run() {
                    C10369v.b.this.f103119a.onOpened(cameraDevice);
                }
            });
        }
    }

    private C10369v(@NonNull CameraDevice cameraDevice, @NonNull Handler handler) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f103118a = new C10334B(cameraDevice, new C10336D.a(handler));
        } else {
            cameraDevice.getClass();
            this.f103118a = new C10335C(cameraDevice, null);
        }
    }

    @NonNull
    public static C10369v b(@NonNull CameraDevice cameraDevice, @NonNull Handler handler) {
        return new C10369v(cameraDevice, handler);
    }

    public final void a(@NonNull x.m mVar) throws C10348a {
        this.f103118a.a(mVar);
    }
}
