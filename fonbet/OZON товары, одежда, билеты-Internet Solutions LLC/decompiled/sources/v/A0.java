package v;

import B.j;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.camera.core.impl.T;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z.C10966x;

/* loaded from: classes8.dex */
final class A0 {
    private static void a(CaptureRequest.Builder builder, androidx.camera.core.impl.T t2) {
        B.j d11 = j.a.e(t2).d();
        for (T.a<?> aVar : d11.g()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            try {
                builder.set(key, d11.a(aVar));
            } catch (IllegalArgumentException unused) {
                C.S.c("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    private static void b(@NonNull CaptureRequest.Builder builder, int i11, @NonNull C10966x c10966x) {
        for (Map.Entry<CaptureRequest.Key<?>, Object> entry : c10966x.a(i11).entrySet()) {
            builder.set(entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest c(@NonNull androidx.camera.core.impl.Q q11, CameraDevice cameraDevice, @NonNull HashMap hashMap, boolean z11, @NonNull C10966x c10966x) throws CameraAccessException {
        CaptureRequest.Builder createCaptureRequest;
        if (cameraDevice == null) {
            return null;
        }
        List<androidx.camera.core.impl.W> h11 = q11.h();
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.impl.W> it = h11.iterator();
        while (it.hasNext()) {
            Surface surface = (Surface) hashMap.get(it.next());
            if (surface == null) {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
            arrayList.add(surface);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        InterfaceC5130z c11 = q11.c();
        if (q11.j() == 5 && c11 != null && (c11.g() instanceof TotalCaptureResult)) {
            C.S.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            createCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) c11.g());
        } else {
            C.S.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            if (q11.j() == 5) {
                createCaptureRequest = cameraDevice.createCaptureRequest(z11 ? 1 : 2);
            } else {
                createCaptureRequest = cameraDevice.createCaptureRequest(q11.j());
            }
        }
        b(createCaptureRequest, q11.j(), c10966x);
        if (!q11.d().equals(androidx.camera.core.impl.T0.f38211a)) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, q11.d());
        }
        if (q11.g() == 1 || q11.k() == 1) {
            createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (q11.g() == 2) {
            createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (q11.k() == 2) {
            createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        androidx.camera.core.impl.T f7 = q11.f();
        T.a<Integer> aVar = androidx.camera.core.impl.Q.f38177i;
        if (((androidx.camera.core.impl.A0) f7).d(aVar)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) ((androidx.camera.core.impl.A0) q11.f()).a(aVar));
        }
        androidx.camera.core.impl.T f11 = q11.f();
        T.a<Integer> aVar2 = androidx.camera.core.impl.Q.f38178j;
        if (((androidx.camera.core.impl.A0) f11).d(aVar2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) ((androidx.camera.core.impl.A0) q11.f()).a(aVar2)).byteValue()));
        }
        a(createCaptureRequest, q11.f());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            createCaptureRequest.addTarget((Surface) it2.next());
        }
        createCaptureRequest.setTag(q11.i());
        return createCaptureRequest.build();
    }

    public static CaptureRequest d(@NonNull androidx.camera.core.impl.Q q11, CameraDevice cameraDevice, @NonNull C10966x c10966x) throws CameraAccessException {
        if (cameraDevice == null) {
            return null;
        }
        C.S.a("Camera2CaptureRequestBuilder", "template type = " + q11.j());
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(q11.j());
        b(createCaptureRequest, q11.j(), c10966x);
        a(createCaptureRequest, q11.f());
        return createCaptureRequest.build();
    }
}
