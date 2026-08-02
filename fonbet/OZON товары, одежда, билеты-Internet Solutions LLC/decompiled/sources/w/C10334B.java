package w;

import C.S;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w.C10336D;
import w.C10349b;

/* renamed from: w.B, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C10334B extends C10333A {
    @Override // w.C10369v.a
    public void a(@NonNull x.m mVar) throws C10348a {
        CameraDevice cameraDevice = this.f103035a;
        cameraDevice.getClass();
        mVar.e().getClass();
        List<x.g> c11 = mVar.c();
        if (c11 == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (mVar.a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        String id2 = cameraDevice.getId();
        Iterator<x.g> it = c11.iterator();
        while (it.hasNext()) {
            String c12 = it.next().c();
            if (c12 != null && !c12.isEmpty()) {
                S.k("CameraDeviceCompat", V.e.a("Camera ", id2, ": Camera doesn't support physicalCameraId ", c12, ". Ignoring."));
            }
        }
        C10349b.c cVar = new C10349b.c(mVar.a(), mVar.e());
        List<x.g> c13 = mVar.c();
        C10336D.a aVar = (C10336D.a) this.f103036b;
        aVar.getClass();
        x.f b11 = mVar.b();
        Handler handler = aVar.f103037a;
        try {
            if (b11 != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) b11.a();
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, x.m.h(c13), cVar, handler);
            } else {
                if (mVar.d() != 1) {
                    cameraDevice.createCaptureSessionByOutputConfigurations(x.m.h(c13), cVar, handler);
                    return;
                }
                ArrayList arrayList = new ArrayList(c13.size());
                Iterator<x.g> it2 = c13.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().d());
                }
                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, cVar, handler);
            }
        } catch (CameraAccessException e11) {
            throw C10348a.b(e11);
        }
    }
}
