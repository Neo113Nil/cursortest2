package n0;

import B1.k0;
import D1.InterfaceC2803h;
import D1.r0;
import D1.s0;
import androidx.compose.ui.e;

/* renamed from: n0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8405z extends e.c implements InterfaceC2803h, r0 {

    /* renamed from: a, reason: collision with root package name */
    private k0.a f76249a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f76250b;

    public final void I1(boolean z11) {
        if (z11) {
            kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
            s0.a(this, new C8404y(m11, this));
            k0 k0Var = (k0) m11.f71787a;
            this.f76249a = k0Var != null ? k0Var.a() : null;
        } else {
            k0.a aVar = this.f76249a;
            if (aVar != null) {
                aVar.release();
            }
            this.f76249a = null;
        }
        this.f76250b = z11;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // D1.r0
    public final void onObservedReadsChanged() {
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        s0.a(this, new C8404y(m11, this));
        k0 k0Var = (k0) m11.f71787a;
        if (this.f76250b) {
            k0.a aVar = this.f76249a;
            if (aVar != null) {
                aVar.release();
            }
            this.f76249a = k0Var != null ? k0Var.a() : null;
        }
    }

    @Override // androidx.compose.ui.e.c
    public final void onReset() {
        k0.a aVar = this.f76249a;
        if (aVar != null) {
            aVar.release();
        }
        this.f76249a = null;
    }
}
