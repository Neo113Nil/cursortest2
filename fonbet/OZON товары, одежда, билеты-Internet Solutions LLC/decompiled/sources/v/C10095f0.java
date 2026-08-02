package v;

import android.hardware.camera2.TotalCaptureResult;
import v.X;

/* renamed from: v.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C10095f0 implements X.f.a {
    @Override // v.X.f.a
    public final boolean a(TotalCaptureResult totalCaptureResult) {
        if (totalCaptureResult == null) {
            return false;
        }
        return androidx.camera.core.impl.V.a(new C10100h(totalCaptureResult), false);
    }
}
