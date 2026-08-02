package v;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.core.impl.C5098i0;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.T;
import u.C9887a;

/* renamed from: v.s1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10134s1 extends T {

    /* renamed from: b, reason: collision with root package name */
    static final C10134s1 f101370b = new C10134s1();

    @Override // v.T, androidx.camera.core.impl.Q.b
    public final void a(@NonNull C5098i0 c5098i0, @NonNull Q.a aVar) {
        super.a(c5098i0, aVar);
        if (c5098i0 == null) {
            throw new IllegalArgumentException("config is not ImageCaptureConfig");
        }
        C9887a.C2193a c2193a = new C9887a.C2193a();
        T.a<Integer> aVar2 = C5098i0.f38313H;
        if (c5098i0.d(aVar2)) {
            int intValue = ((Integer) c5098i0.a(aVar2)).intValue();
            if (((ImageCapturePixelHDRPlusQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (intValue == 0) {
                    c2193a.e(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
                } else if (intValue == 1) {
                    c2193a.e(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
                }
            }
        }
        aVar.e(c2193a.c());
    }
}
