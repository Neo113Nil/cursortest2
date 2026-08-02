package k5;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Semaphore;

/* loaded from: classes8.dex */
public final class M0 extends D0<Boolean> {

    /* renamed from: e, reason: collision with root package name */
    private Semaphore f70601e;

    /* renamed from: f, reason: collision with root package name */
    private final CameraManager f70602f;

    /* renamed from: g, reason: collision with root package name */
    private final Om0.a f70603g;

    /* renamed from: h, reason: collision with root package name */
    private final CameraManager.AvailabilityCallback f70604h;

    final class a extends CameraManager.AvailabilityCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            M0 m02 = M0.this;
            m02.f70603g.put(str, Boolean.FALSE);
            m02.f70601e.release();
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            M0 m02 = M0.this;
            m02.f70603g.put(str, Boolean.TRUE);
            m02.f70601e.release();
        }
    }

    M0(@NonNull Context context) {
        super(Mm0.e.CameraUse);
        this.f70603g = new Om0.a();
        this.f70604h = new a();
        this.f70602f = (CameraManager) context.getSystemService("camera");
    }

    @Override // k5.D0
    @NonNull
    protected final Boolean s() throws D1 {
        Looper looper;
        CameraManager cameraManager = this.f70602f;
        try {
            this.f70601e = new Semaphore(1 - cameraManager.getCameraIdList().length, true);
            HandlerThread handlerThread = new HandlerThread("some");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            CameraManager.AvailabilityCallback availabilityCallback = this.f70604h;
            cameraManager.registerAvailabilityCallback(availabilityCallback, handler);
            try {
                this.f70601e.acquire();
                cameraManager.unregisterAvailabilityCallback(availabilityCallback);
                looper = handlerThread.getLooper();
            } catch (Throwable unused) {
                cameraManager.unregisterAvailabilityCallback(availabilityCallback);
                looper = handlerThread.getLooper();
            }
            looper.quit();
        } catch (Throwable unused2) {
        }
        Boolean bool = Boolean.TRUE;
        Om0.a aVar = this.f70603g;
        return Boolean.valueOf(aVar.containsValue(bool) && aVar.containsValue(Boolean.FALSE));
    }
}
