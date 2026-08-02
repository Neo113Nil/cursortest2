package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.annotation.NonNull;

/* renamed from: w.C, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10335C extends C10334B {
    @Override // w.C10334B, w.C10369v.a
    public final void a(@NonNull x.m mVar) throws C10348a {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) mVar.i();
        sessionConfiguration.getClass();
        try {
            this.f103035a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e11) {
            throw C10348a.b(e11);
        }
    }
}
