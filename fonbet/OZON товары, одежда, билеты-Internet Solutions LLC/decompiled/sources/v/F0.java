package v;

import B.j;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.T;
import java.util.Iterator;
import u.C9887a;
import v.K0;
import v.S;
import z.C10957o;

/* loaded from: classes8.dex */
final class F0 implements O0.e {

    /* renamed from: a, reason: collision with root package name */
    static final F0 f100928a = new F0();

    @Override // androidx.camera.core.impl.O0.e
    public final void a(@NonNull Size size, @NonNull androidx.camera.core.impl.b1<?> b1Var, @NonNull O0.b bVar) {
        androidx.camera.core.impl.O0 x11 = b1Var.x();
        androidx.camera.core.impl.T P11 = androidx.camera.core.impl.A0.P();
        int p11 = androidx.camera.core.impl.O0.b().p();
        if (x11 != null) {
            p11 = x11.p();
            Iterator<CameraDevice.StateCallback> it = x11.c().iterator();
            while (it.hasNext()) {
                bVar.d(it.next());
            }
            Iterator<CameraCaptureSession.StateCallback> it2 = x11.l().iterator();
            while (it2.hasNext()) {
                bVar.h(it2.next());
            }
            bVar.b(x11.j());
            P11 = x11.f();
        }
        bVar.r(P11);
        if (b1Var instanceof androidx.camera.core.impl.D0) {
            Rational rational = C10957o.f106835a;
            if (((PreviewPixelHDRnetQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(PreviewPixelHDRnetQuirk.class)) != null) {
                if (!C10957o.f106835a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                    C9887a.C2193a c2193a = new C9887a.C2193a();
                    c2193a.e(CaptureRequest.TONEMAP_MODE, 2);
                    bVar.e(c2193a.c());
                }
            }
        }
        C9887a c9887a = new C9887a(b1Var);
        bVar.v(((Integer) c9887a.s().c(C9887a.f99589H, Integer.valueOf(p11))).intValue());
        bVar.d((CameraDevice.StateCallback) c9887a.s().c(C9887a.f99591J, new K0.b()));
        bVar.h((CameraCaptureSession.StateCallback) c9887a.s().c(C9887a.f99592K, new J0()));
        bVar.c(P0.e((CameraCaptureSession.CaptureCallback) c9887a.s().c(C9887a.f99593L, new S.b())));
        bVar.w(b1Var.o());
        bVar.u(b1Var.p());
        C5123v0 R11 = C5123v0.R();
        T.a<String> aVar = C9887a.f99594M;
        R11.U(aVar, (String) c9887a.s().c(aVar, null));
        T.a<Long> aVar2 = C9887a.f99590I;
        Long l11 = (Long) c9887a.s().c(aVar2, -1L);
        l11.getClass();
        R11.U(aVar2, l11);
        bVar.e(R11);
        bVar.e(j.a.e(c9887a.s()).d());
    }
}
