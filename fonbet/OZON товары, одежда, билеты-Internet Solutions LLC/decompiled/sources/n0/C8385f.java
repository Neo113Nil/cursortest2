package n0;

import androidx.compose.foundation.BorderModifierNodeElement;
import k1.C7455a;
import k1.C7456b;
import k1.C7462h;
import l1.AbstractC7799Q;
import l1.C7786D;
import l1.C7790H;
import l1.J0;
import l1.K0;
import l1.s0;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8385f {
    public static final void a(s0 s0Var, C7462h c7462h, float f7, boolean z11) {
        s0Var.reset();
        s0.a aVar = s0.a.CounterClockwise;
        s0Var.s(c7462h, aVar);
        if (z11) {
            return;
        }
        C7786D a11 = C7790H.a();
        a11.s(new C7462h(f7, f7, c7462h.j() - f7, c7462h.d() - f7, e(f7, c7462h.h()), e(f7, c7462h.i()), e(f7, c7462h.c()), e(f7, c7462h.b())), aVar);
        s0Var.k(s0Var, a11, 0);
    }

    @NotNull
    public static final androidx.compose.ui.e c(float f7, long j11, @NotNull androidx.compose.ui.e eVar, @NotNull J0 j02) {
        return d(eVar, f7, new K0(j11), j02);
    }

    @NotNull
    public static final androidx.compose.ui.e d(@NotNull androidx.compose.ui.e eVar, float f7, @NotNull AbstractC7799Q abstractC7799Q, @NotNull J0 j02) {
        return eVar.l0(new BorderModifierNodeElement(f7, abstractC7799Q, j02));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(float f7, long j11) {
        return C7456b.a(Math.max(0.0f, C7455a.d(j11) - f7), Math.max(0.0f, C7455a.e(j11) - f7));
    }
}
