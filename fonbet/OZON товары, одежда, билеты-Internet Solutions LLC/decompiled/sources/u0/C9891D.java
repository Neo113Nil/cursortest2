package u0;

import E0.C2942q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import e1.d;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9891D implements InterfaceC9890C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C9891D f99599a = new C9891D();

    @Override // u0.InterfaceC9890C
    @NotNull
    public final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, float f7, boolean z11) {
        if (f7 <= 0.0d) {
            throw new IllegalArgumentException(C2942q.b(f7, "invalid weight ", "; must be greater than zero").toString());
        }
        if (f7 > Float.MAX_VALUE) {
            f7 = Float.MAX_VALUE;
        }
        return eVar.l0(new LayoutWeightElement(f7, z11));
    }

    @Override // u0.InterfaceC9890C
    @NotNull
    public final androidx.compose.ui.e b(@NotNull androidx.compose.ui.e eVar, @NotNull d.b bVar) {
        return eVar.l0(new VerticalAlignElement(bVar));
    }
}
