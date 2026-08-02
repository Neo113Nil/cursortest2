package ze;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import xe.K;

/* loaded from: classes.dex */
final class t<E> extends i<E> implements u<E> {
    @Override // ze.u
    public final x k() {
        return this;
    }

    @Override // xe.AbstractC10711a
    protected final void w0(boolean z11, @NotNull Throwable th2) {
        if (((C11115c) z0()).y(false, th2) || z11) {
            return;
        }
        K.a(getContext(), th2);
    }

    @Override // xe.AbstractC10711a
    public final void x0(Unit unit) {
        ((C11115c) z0()).l(null);
    }
}
