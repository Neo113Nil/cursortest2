package u0;

import androidx.compose.foundation.layout.LayoutWeightElement;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9896e implements InterfaceC9895d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C9896e f99653a = new C9896e();

    @Override // u0.InterfaceC9895d
    @NotNull
    public final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, boolean z11) {
        if (1.0f > 0.0d) {
            return eVar.l0(new LayoutWeightElement(1.0f, z11));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
