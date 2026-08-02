package Ph;

import Sh.C1571i;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ph.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1446d0 extends Uh.h {

    /* renamed from: c, reason: collision with root package name */
    public int f9066c;

    public AbstractC1446d0(int i10) {
        this.f9066c = i10;
    }

    public abstract Continuation g();

    public Throwable h(Object obj) {
        C c10 = obj instanceof C ? (C) obj : null;
        if (c10 != null) {
            return c10.f9000a;
        }
        return null;
    }

    public final void j(Throwable th2) {
        N.a(g().get$context(), new T("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Continuation g10 = g();
            Intrinsics.checkNotNull(g10, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C1571i c1571i = (C1571i) g10;
            Continuation continuation = c1571i.f10790e;
            Object obj = c1571i.f10792g;
            CoroutineContext coroutineContext = continuation.get$context();
            Object i10 = Sh.N.i(coroutineContext, obj);
            C0 c02 = null;
            j1 m10 = i10 != Sh.N.f10769a ? J.m(continuation, coroutineContext, i10) : null;
            try {
                CoroutineContext coroutineContext2 = continuation.get$context();
                Object k10 = k();
                Throwable h10 = h(k10);
                if (h10 == null && AbstractC1448e0.b(this.f9066c)) {
                    c02 = (C0) coroutineContext2.get(C0.f9001U2);
                }
                if (c02 != null && !c02.isActive()) {
                    CancellationException cancellationException = c02.getCancellationException();
                    d(k10, cancellationException);
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(cancellationException)));
                } else if (h10 != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    continuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(h10)));
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    continuation.resumeWith(Result.m147constructorimpl(i(k10)));
                }
                Unit unit = Unit.INSTANCE;
                if (m10 == null || m10.P0()) {
                    Sh.N.f(coroutineContext, i10);
                }
            } catch (Throwable th2) {
                if (m10 == null || m10.P0()) {
                    Sh.N.f(coroutineContext, i10);
                }
                throw th2;
            }
        } catch (C1442b0 e10) {
            N.a(g().get$context(), e10.getCause());
        } catch (Throwable th3) {
            j(th3);
        }
    }

    public Object i(Object obj) {
        return obj;
    }

    public void d(Object obj, Throwable th2) {
    }
}
