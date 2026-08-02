package v;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;
import java.util.concurrent.Executor;
import u.C9887a;

/* renamed from: v.c1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10087c1 {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final Executor f101222b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f101223c = false;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final C10090d1 f101221a = new C10090d1();

    C10087c1(@NonNull C10132s c10132s, @NonNull Executor executor) {
        this.f101222b = executor;
    }

    final void a(boolean z11) {
        if (z11 == this.f101223c) {
            return;
        }
        this.f101223c = z11;
        if (z11) {
            return;
        }
        this.f101221a.b();
    }

    final void b(@NonNull C9887a.C2193a c2193a) {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        this.f101221a.a();
        c2193a.f(key, 0, T.b.REQUIRED);
    }
}
