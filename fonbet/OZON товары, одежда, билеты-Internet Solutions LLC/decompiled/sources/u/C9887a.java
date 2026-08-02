package u;

import B.j;
import C.B;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.InterfaceC5121u0;
import androidx.camera.core.impl.T;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9887a extends j {

    /* renamed from: H, reason: collision with root package name */
    public static final T.a<Integer> f99589H = T.a.a(Integer.TYPE, "camera2.captureRequest.templateType");

    /* renamed from: I, reason: collision with root package name */
    public static final T.a<Long> f99590I = T.a.a(Long.TYPE, "camera2.cameraCaptureSession.streamUseCase");

    /* renamed from: J, reason: collision with root package name */
    public static final T.a<CameraDevice.StateCallback> f99591J = T.a.a(CameraDevice.StateCallback.class, "camera2.cameraDevice.stateCallback");

    /* renamed from: K, reason: collision with root package name */
    public static final T.a<CameraCaptureSession.StateCallback> f99592K = T.a.a(CameraCaptureSession.StateCallback.class, "camera2.cameraCaptureSession.stateCallback");

    /* renamed from: L, reason: collision with root package name */
    public static final T.a<CameraCaptureSession.CaptureCallback> f99593L = T.a.a(CameraCaptureSession.CaptureCallback.class, "camera2.cameraCaptureSession.captureCallback");

    /* renamed from: M, reason: collision with root package name */
    public static final T.a<String> f99594M;

    /* renamed from: u.a$a, reason: collision with other inner class name */
    public static final class C2193a implements B<C9887a> {

        /* renamed from: a, reason: collision with root package name */
        private final C5123v0 f99595a = C5123v0.R();

        @Override // C.B
        @NonNull
        public final InterfaceC5121u0 a() {
            return this.f99595a;
        }

        @NonNull
        public final C9887a c() {
            return new C9887a(A0.Q(this.f99595a));
        }

        @NonNull
        public final void d(@NonNull T t2, @NonNull T.b bVar) {
            for (T.a<?> aVar : t2.g()) {
                this.f99595a.T(aVar, bVar, t2.a(aVar));
            }
        }

        @NonNull
        public final void e(@NonNull CaptureRequest.Key key, @NonNull Object obj) {
            this.f99595a.U(C9887a.P(key), obj);
        }

        @NonNull
        public final void f(@NonNull CaptureRequest.Key key, @NonNull Object obj, @NonNull T.b bVar) {
            this.f99595a.T(C9887a.P(key), bVar, obj);
        }
    }

    static {
        T.a.a(Object.class, "camera2.captureRequest.tag");
        f99594M = T.a.a(String.class, "camera2.cameraCaptureSession.physicalCameraId");
    }

    @NonNull
    public static T.a<Object> P(@NonNull CaptureRequest.Key<?> key) {
        return T.a.b("camera2.captureRequest.option." + key.getName(), key);
    }
}
