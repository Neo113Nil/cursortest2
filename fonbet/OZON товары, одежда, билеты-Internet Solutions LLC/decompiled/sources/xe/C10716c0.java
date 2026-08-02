package xe;

import De.C2866i;
import Sc.r;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10716c0 {
    public static final void a(@NotNull C10737n c10737n, @NotNull kotlin.coroutines.d dVar, boolean z11) {
        Object e11;
        Object g10 = c10737n.g();
        Throwable d11 = c10737n.d(g10);
        if (d11 != null) {
            r.Companion companion = Sc.r.INSTANCE;
            e11 = Sc.s.a(d11);
        } else {
            r.Companion companion2 = Sc.r.INSTANCE;
            e11 = c10737n.e(g10);
        }
        if (!z11) {
            dVar.resumeWith(e11);
            return;
        }
        Intrinsics.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C2866i c2866i = (C2866i) dVar;
        kotlin.coroutines.jvm.internal.c cVar = c2866i.f6624e;
        CoroutineContext context = cVar.getContext();
        Object c11 = De.G.c(context, c2866i.f6626g);
        h1<?> d12 = c11 != De.G.f6602a ? G.d(cVar, context, c11) : null;
        try {
            cVar.resumeWith(e11);
            Unit unit = Unit.f71690a;
            if (d12 == null || d12.z0()) {
                De.G.a(context, c11);
            }
        } catch (Throwable th2) {
            if (d12 == null || d12.z0()) {
                De.G.a(context, c11);
            }
            throw th2;
        }
    }
}
