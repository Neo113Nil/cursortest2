package xe;

import De.C2862e;
import Ee.C2968b;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;

/* loaded from: classes.dex */
public final class N {
    @NotNull
    public static final C2862e a(@NotNull CoroutineContext coroutineContext) {
        B0.a aVar = B0.f105374o0;
        if (coroutineContext.get(B0.a.f105375a) == null) {
            coroutineContext = coroutineContext.plus(E0.a());
        }
        return new C2862e(coroutineContext);
    }

    @NotNull
    public static final C2862e b() {
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        return new C2862e(CoroutineContext.Element.a.d(De.s.f6650a, (H0) b11));
    }

    public static final void c(@NotNull M m11, CancellationException cancellationException) {
        CoroutineContext coroutineContext = m11.getCoroutineContext();
        B0.a aVar = B0.f105374o0;
        B0 b02 = (B0) coroutineContext.get(B0.a.f105375a);
        if (b02 != null) {
            b02.j(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + m11).toString());
        }
    }

    public static final <R> Object d(@NotNull Function2<? super M, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super R> frame) {
        De.w wVar = new De.w(frame, frame.getContext());
        Object a11 = C2968b.a(wVar, wVar, function2);
        if (a11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return a11;
    }

    public static final void e(@NotNull M m11) {
        E0.f(m11.getCoroutineContext());
    }

    public static final boolean f(@NotNull M m11) {
        CoroutineContext coroutineContext = m11.getCoroutineContext();
        B0.a aVar = B0.f105374o0;
        B0 b02 = (B0) coroutineContext.get(B0.a.f105375a);
        if (b02 != null) {
            return b02.isActive();
        }
        return true;
    }

    @NotNull
    public static final C2862e g(@NotNull M m11, @NotNull CoroutineContext coroutineContext) {
        return new C2862e(m11.getCoroutineContext().plus(coroutineContext));
    }
}
