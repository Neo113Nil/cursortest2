package xe;

import org.jetbrains.annotations.NotNull;

/* renamed from: xe.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10752v<T> extends H0 implements InterfaceC10750u<T> {
    @Override // xe.InterfaceC10750u
    public final boolean L(@NotNull Throwable th2) {
        return e0(new C10760z(false, th2));
    }

    @Override // xe.U
    public final Object s(@NotNull kotlin.coroutines.d<? super T> dVar) {
        Object w11 = w(dVar);
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        return w11;
    }
}
