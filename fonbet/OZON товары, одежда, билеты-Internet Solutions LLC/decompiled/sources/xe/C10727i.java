package xe;

import Ee.C2967a;
import Ee.C2968b;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10727i {
    public static U a(M m11, CoroutineContext coroutineContext, O o11, Function2 function2, int i11) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f71771a;
        }
        if ((i11 & 2) != 0) {
            o11 = O.DEFAULT;
        }
        CoroutineContext c11 = G.c(m11, coroutineContext);
        o11.getClass();
        V j02 = o11 == O.LAZY ? new J0(c11, function2) : new V(c11, true, true);
        j02.y0(o11, j02, function2);
        return j02;
    }

    @NotNull
    public static final B0 b(@NotNull M m11, @NotNull CoroutineContext coroutineContext, @NotNull O o11, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        CoroutineContext c11 = G.c(m11, coroutineContext);
        o11.getClass();
        AbstractC10711a k02 = o11 == O.LAZY ? new K0(c11, function2) : new U0(c11, true, true);
        k02.y0(o11, k02, function2);
        return k02;
    }

    public static /* synthetic */ B0 c(M m11, CoroutineContext coroutineContext, O o11, Function2 function2, int i11) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f71771a;
        }
        if ((i11 & 2) != 0) {
            o11 = O.DEFAULT;
        }
        return b(m11, coroutineContext, o11, function2);
    }

    public static final <T> T d(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) throws InterruptedException {
        AbstractC10732k0 a11;
        CoroutineContext c11;
        Thread currentThread = Thread.currentThread();
        kotlin.coroutines.e eVar = (kotlin.coroutines.e) coroutineContext.get(kotlin.coroutines.e.INSTANCE);
        C10749t0 c10749t0 = C10749t0.f105499a;
        if (eVar == null) {
            a11 = Z0.b();
            c11 = G.c(c10749t0, coroutineContext.plus(a11));
        } else {
            if (eVar instanceof AbstractC10732k0) {
            }
            a11 = Z0.a();
            c11 = G.c(c10749t0, coroutineContext);
        }
        C10723g c10723g = new C10723g(c11, currentThread, a11);
        c10723g.y0(O.DEFAULT, c10723g, function2);
        return (T) c10723g.z0();
    }

    public static final <T> Object f(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super M, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> frame) {
        Object z02;
        CoroutineContext context = frame.getContext();
        CoroutineContext b11 = G.b(context, coroutineContext);
        E0.f(b11);
        if (b11 == context) {
            De.w wVar = new De.w(frame, b11);
            z02 = C2968b.a(wVar, wVar, function2);
        } else {
            e.Companion companion = kotlin.coroutines.e.INSTANCE;
            if (Intrinsics.d(b11.get(companion), context.get(companion))) {
                h1 h1Var = new h1(frame, b11);
                CoroutineContext context2 = h1Var.getContext();
                Object c11 = De.G.c(context2, null);
                try {
                    Object a11 = C2968b.a(h1Var, h1Var, function2);
                    De.G.a(context2, c11);
                    z02 = a11;
                } catch (Throwable th2) {
                    De.G.a(context2, c11);
                    throw th2;
                }
            } else {
                C10712a0 c10712a0 = new C10712a0(frame, b11);
                C2967a.b(function2, c10712a0, c10712a0);
                z02 = c10712a0.z0();
            }
        }
        if (z02 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return z02;
    }
}
