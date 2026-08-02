package xe;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import xe.B0;

/* loaded from: classes.dex */
public final class E0 {
    public static D0 a() {
        return new D0(null);
    }

    public static final void b(@NotNull CoroutineContext coroutineContext, CancellationException cancellationException) {
        B0.a aVar = B0.f105374o0;
        B0 b02 = (B0) coroutineContext.get(B0.a.f105375a);
        if (b02 != null) {
            b02.j(cancellationException);
        }
    }

    public static final Object c(@NotNull B0 b02, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b02.j(null);
        Object r02 = b02.r0(dVar);
        return r02 == Wc.a.COROUTINE_SUSPENDED ? r02 : Unit.f71690a;
    }

    public static void d(CoroutineContext coroutineContext) {
        Sequence<B0> d11;
        B0.a aVar = B0.f105374o0;
        B0 b02 = (B0) coroutineContext.get(B0.a.f105375a);
        if (b02 == null || (d11 = b02.d()) == null) {
            return;
        }
        Iterator<B0> it = d11.iterator();
        while (it.hasNext()) {
            it.next().j(null);
        }
    }

    public static void e(B0 b02) {
        Iterator<B0> it = b02.d().iterator();
        while (it.hasNext()) {
            it.next().j(null);
        }
    }

    public static final void f(@NotNull CoroutineContext coroutineContext) {
        B0.a aVar = B0.f105374o0;
        B0 b02 = (B0) coroutineContext.get(B0.a.f105375a);
        if (b02 != null && !b02.isActive()) {
            throw b02.Z();
        }
    }

    @NotNull
    public static final B0 g(@NotNull CoroutineContext coroutineContext) {
        B0.a aVar = B0.f105374o0;
        B0 b02 = (B0) coroutineContext.get(B0.a.f105375a);
        if (b02 != null) {
            return b02;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static InterfaceC10724g0 h(B0 b02, G0 g02) {
        return b02 instanceof H0 ? ((H0) b02).a0(true, g02) : b02.X(g02.n(), true, new F0(1, g02, G0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }

    public static final boolean i(@NotNull CoroutineContext coroutineContext) {
        B0.a aVar = B0.f105374o0;
        B0 b02 = (B0) coroutineContext.get(B0.a.f105375a);
        if (b02 != null) {
            return b02.isActive();
        }
        return true;
    }
}
