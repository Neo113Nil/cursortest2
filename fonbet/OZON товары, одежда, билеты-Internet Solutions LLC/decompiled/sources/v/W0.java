package v;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.List;
import v.E1;

/* loaded from: classes8.dex */
interface W0 {
    void a(@NonNull HashMap hashMap);

    androidx.camera.core.impl.O0 b();

    @NonNull
    com.google.common.util.concurrent.m<Void> c(@NonNull androidx.camera.core.impl.O0 o02, @NonNull CameraDevice cameraDevice, @NonNull E1.a aVar);

    void close();

    void d(androidx.camera.core.impl.O0 o02);

    void e(@NonNull List<androidx.camera.core.impl.Q> list);

    boolean f();

    void g();

    @NonNull
    List<androidx.camera.core.impl.Q> h();

    @NonNull
    com.google.common.util.concurrent.m release();
}
