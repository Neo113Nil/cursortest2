package v;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.InterfaceC5130z;
import androidx.concurrent.futures.b;

/* renamed from: v.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10101h0 extends AbstractC5111p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b.a f101259a;

    C10101h0(b.a aVar) {
        this.f101259a = aVar;
    }

    @Override // androidx.camera.core.impl.AbstractC5111p
    public final void a(int i11) {
        this.f101259a.e(new C.K("Capture request is cancelled because camera is closed", null));
    }

    @Override // androidx.camera.core.impl.AbstractC5111p
    public final void b(int i11, @NonNull InterfaceC5130z interfaceC5130z) {
        this.f101259a.c(null);
    }

    @Override // androidx.camera.core.impl.AbstractC5111p
    public final void c(int i11, @NonNull androidx.camera.core.impl.r rVar) {
        this.f101259a.e(new C.K("Capture request failed with reason " + rVar.b(), null));
    }
}
