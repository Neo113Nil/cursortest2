package w;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.annotation.NonNull;
import w.C10369v;

/* renamed from: w.D, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C10336D implements C10369v.a {

    /* renamed from: a, reason: collision with root package name */
    final CameraDevice f103035a;

    /* renamed from: b, reason: collision with root package name */
    final Object f103036b;

    /* renamed from: w.D$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Handler f103037a;

        a(@NonNull Handler handler) {
            this.f103037a = handler;
        }
    }

    C10336D(@NonNull CameraDevice cameraDevice, Object obj) {
        cameraDevice.getClass();
        this.f103035a = cameraDevice;
        this.f103036b = obj;
    }
}
