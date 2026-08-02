package xe;

import De.C2866i;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10741p {
    public static final void a(@NotNull C10737n c10737n, @NotNull InterfaceC10724g0 interfaceC10724g0) {
        c10737n.s(new C10726h0(interfaceC10724g0));
    }

    @NotNull
    public static final <T> C10737n<T> b(@NotNull kotlin.coroutines.d<? super T> dVar) {
        if (!(dVar instanceof C2866i)) {
            return new C10737n<>(1, dVar);
        }
        C10737n<T> h11 = ((C2866i) dVar).h();
        if (h11 != null) {
            if (!h11.B()) {
                h11 = null;
            }
            if (h11 != null) {
                return h11;
            }
        }
        return new C10737n<>(2, dVar);
    }
}
