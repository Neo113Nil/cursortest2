package Sh;

import Ph.AbstractC1464m0;
import Ph.C0;
import Ph.C1442b0;
import Ph.a1;
import Ph.j1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: Sh.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1572j {

    /* renamed from: a, reason: collision with root package name */
    public static final G f10793a = new G("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final G f10794b = new G("REUSABLE_CLAIMED");

    public static final void b(Continuation continuation, Object obj) {
        if (!(continuation instanceof C1571i)) {
            continuation.resumeWith(obj);
            return;
        }
        C1571i c1571i = (C1571i) continuation;
        Object b10 = Ph.E.b(obj);
        if (d(c1571i.f10789d, c1571i.get$context())) {
            c1571i.f10791f = b10;
            c1571i.f9066c = 1;
            c(c1571i.f10789d, c1571i.get$context(), c1571i);
            return;
        }
        AbstractC1464m0 b11 = a1.f9061a.b();
        if (b11.l2()) {
            c1571i.f10791f = b10;
            c1571i.f9066c = 1;
            b11.h2(c1571i);
            return;
        }
        b11.j2(true);
        try {
            C0 c02 = (C0) c1571i.get$context().get(C0.f9001U2);
            if (c02 == null || c02.isActive()) {
                Continuation continuation2 = c1571i.f10790e;
                Object obj2 = c1571i.f10792g;
                CoroutineContext coroutineContext = continuation2.get$context();
                Object i10 = N.i(coroutineContext, obj2);
                j1 m10 = i10 != N.f10769a ? Ph.J.m(continuation2, coroutineContext, i10) : null;
                try {
                    c1571i.f10790e.resumeWith(obj);
                    Unit unit = Unit.INSTANCE;
                } finally {
                    if (m10 == null || m10.P0()) {
                        N.f(coroutineContext, i10);
                    }
                }
            } else {
                CancellationException cancellationException = c02.getCancellationException();
                c1571i.d(b10, cancellationException);
                Result.Companion companion = Result.INSTANCE;
                c1571i.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(cancellationException)));
            }
            while (b11.o2()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void c(Ph.L l10, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            l10.Y1(coroutineContext, runnable);
        } catch (Throwable th2) {
            throw new C1442b0(th2, l10, coroutineContext);
        }
    }

    public static final boolean d(Ph.L l10, CoroutineContext coroutineContext) {
        try {
            return l10.a2(coroutineContext);
        } catch (Throwable th2) {
            throw new C1442b0(th2, l10, coroutineContext);
        }
    }

    public static final boolean e(C1571i c1571i) {
        Unit unit = Unit.INSTANCE;
        AbstractC1464m0 b10 = a1.f9061a.b();
        if (b10.m2()) {
            return false;
        }
        if (b10.l2()) {
            c1571i.f10791f = unit;
            c1571i.f9066c = 1;
            b10.h2(c1571i);
            return true;
        }
        b10.j2(true);
        try {
            c1571i.run();
            do {
            } while (b10.o2());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
