package u0;

import D1.A0;
import androidx.compose.ui.e;

/* renamed from: u0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9911u extends e.c implements A0 {

    /* renamed from: a, reason: collision with root package name */
    private float f99684a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f99685b;

    public C9911u(float f7, boolean z11) {
        this.f99684a = f7;
        this.f99685b = z11;
    }

    public final void I1(boolean z11) {
        this.f99685b = z11;
    }

    public final void J1(float f7) {
        this.f99684a = f7;
    }

    @Override // D1.A0
    public final Object M(Z1.d dVar, Object obj) {
        C9889B c9889b = obj instanceof C9889B ? (C9889B) obj : null;
        if (c9889b == null) {
            c9889b = new C9889B(0);
        }
        c9889b.f(this.f99684a);
        c9889b.e(this.f99685b);
        return c9889b;
    }
}
