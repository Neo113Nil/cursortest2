package v;

import B.j;
import android.hardware.camera2.CameraCaptureSession;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.C5098i0;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.T;
import u.C9887a;
import v.S;

/* loaded from: classes8.dex */
class T implements Q.b {

    /* renamed from: a, reason: collision with root package name */
    static final T f101077a = new T();

    @Override // androidx.camera.core.impl.Q.b
    public void a(@NonNull C5098i0 c5098i0, @NonNull Q.a aVar) {
        androidx.camera.core.impl.Q q11 = (androidx.camera.core.impl.Q) c5098i0.c(androidx.camera.core.impl.b1.f38268w, null);
        androidx.camera.core.impl.T P11 = androidx.camera.core.impl.A0.P();
        T.a<Integer> aVar2 = androidx.camera.core.impl.Q.f38177i;
        int j11 = new Q.a().h().j();
        if (q11 != null) {
            j11 = q11.j();
            aVar.a(q11.b());
            P11 = q11.f();
        }
        aVar.q(P11);
        C9887a c9887a = new C9887a(c5098i0);
        aVar.s(((Integer) c9887a.s().c(C9887a.f99589H, Integer.valueOf(j11))).intValue());
        aVar.c(P0.e((CameraCaptureSession.CaptureCallback) c9887a.s().c(C9887a.f99593L, new S.b())));
        aVar.e(j.a.e(c9887a.s()).d());
    }
}
