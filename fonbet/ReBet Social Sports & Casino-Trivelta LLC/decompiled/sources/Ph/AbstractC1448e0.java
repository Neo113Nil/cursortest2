package Ph;

import Sh.AbstractC1572j;
import Sh.C1571i;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ph.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1448e0 {
    public static final void a(AbstractC1446d0 abstractC1446d0, int i10) {
        Continuation g10 = abstractC1446d0.g();
        boolean z10 = i10 == 4;
        if (z10 || !(g10 instanceof C1571i) || b(i10) != b(abstractC1446d0.f9066c)) {
            d(abstractC1446d0, g10, z10);
            return;
        }
        C1571i c1571i = (C1571i) g10;
        L l10 = c1571i.f10789d;
        CoroutineContext coroutineContext = c1571i.get$context();
        if (AbstractC1572j.d(l10, coroutineContext)) {
            AbstractC1572j.c(l10, coroutineContext, abstractC1446d0);
        } else {
            e(abstractC1446d0);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final void d(AbstractC1446d0 abstractC1446d0, Continuation continuation, boolean z10) {
        Object i10;
        Object k10 = abstractC1446d0.k();
        Throwable h10 = abstractC1446d0.h(k10);
        if (h10 != null) {
            Result.Companion companion = Result.INSTANCE;
            i10 = ResultKt.createFailure(h10);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            i10 = abstractC1446d0.i(k10);
        }
        Object m147constructorimpl = Result.m147constructorimpl(i10);
        if (!z10) {
            continuation.resumeWith(m147constructorimpl);
            return;
        }
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C1571i c1571i = (C1571i) continuation;
        Continuation continuation2 = c1571i.f10790e;
        Object obj = c1571i.f10792g;
        CoroutineContext coroutineContext = continuation2.get$context();
        Object i11 = Sh.N.i(coroutineContext, obj);
        j1 m10 = i11 != Sh.N.f10769a ? J.m(continuation2, coroutineContext, i11) : null;
        try {
            c1571i.f10790e.resumeWith(m147constructorimpl);
            Unit unit = Unit.INSTANCE;
            if (m10 == null || m10.P0()) {
                Sh.N.f(coroutineContext, i11);
            }
        } catch (Throwable th2) {
            if (m10 == null || m10.P0()) {
                Sh.N.f(coroutineContext, i11);
            }
            throw th2;
        }
    }

    public static final void e(AbstractC1446d0 abstractC1446d0) {
        AbstractC1464m0 b10 = a1.f9061a.b();
        if (b10.l2()) {
            b10.h2(abstractC1446d0);
            return;
        }
        b10.j2(true);
        try {
            d(abstractC1446d0, abstractC1446d0.g(), true);
            do {
            } while (b10.o2());
        } finally {
            try {
            } finally {
            }
        }
    }
}
