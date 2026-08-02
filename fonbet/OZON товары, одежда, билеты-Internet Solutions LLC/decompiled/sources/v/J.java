package v;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.Objects;

/* loaded from: classes8.dex */
final class J extends CameraDevice.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b.a f100948a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f100949b;

    J(L l11, b.a aVar) {
        this.f100949b = l11;
        this.f100948a = aVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(@NonNull CameraDevice cameraDevice) {
        this.f100949b.M("openCameraConfigAndClose camera closed");
        this.f100948a.c(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
        this.f100949b.M("openCameraConfigAndClose camera disconnected");
        this.f100948a.c(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(@NonNull CameraDevice cameraDevice, int i11) {
        this.f100949b.M(Ej.b.a(i11, "openCameraConfigAndClose camera error "));
        this.f100948a.c(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(@NonNull CameraDevice cameraDevice) {
        L l11 = this.f100949b;
        l11.M("openCameraConfigAndClose camera opened");
        I.d H11 = L.H(l11, cameraDevice);
        Objects.requireNonNull(cameraDevice);
        H11.a(new B90.q0(cameraDevice, 5), l11.f100983c);
    }
}
