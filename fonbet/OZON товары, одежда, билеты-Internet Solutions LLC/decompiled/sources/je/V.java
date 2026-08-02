package je;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class V extends AbstractC7403x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(@NotNull Y delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }

    @Override // je.AbstractC7402w, je.N
    public final boolean I0() {
        return false;
    }

    @Override // je.AbstractC7402w
    public final AbstractC7402w S0(Y delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new V(delegate);
    }
}
