package Ph;

import Ph.C0;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class G0 {

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public a(Object obj) {
            super(1, obj, H0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable th2) {
            ((H0) this.receiver).v(th2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    public static final A a(C0 c02) {
        return new E0(c02);
    }

    public static /* synthetic */ A b(C0 c02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c02 = null;
        }
        return F0.a(c02);
    }

    public static final void c(C0 c02, String str, Throwable th2) {
        c02.cancel(AbstractC1473r0.a(str, th2));
    }

    public static final void d(CoroutineContext coroutineContext, CancellationException cancellationException) {
        C0 c02 = (C0) coroutineContext.get(C0.f9001U2);
        if (c02 != null) {
            c02.cancel(cancellationException);
        }
    }

    public static /* synthetic */ void e(CoroutineContext coroutineContext, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        F0.d(coroutineContext, cancellationException);
    }

    public static final Object f(C0 c02, Continuation continuation) {
        C0.a.b(c02, null, 1, null);
        Object join = c02.join(continuation);
        return join == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? join : Unit.INSTANCE;
    }

    public static final void g(C0 c02, CancellationException cancellationException) {
        Iterator it = c02.getChildren().iterator();
        while (it.hasNext()) {
            ((C0) it.next()).cancel(cancellationException);
        }
    }

    public static final void h(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Sequence children;
        C0 c02 = (C0) coroutineContext.get(C0.f9001U2);
        if (c02 == null || (children = c02.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((C0) it.next()).cancel(cancellationException);
        }
    }

    public static /* synthetic */ void i(C0 c02, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        F0.g(c02, cancellationException);
    }

    public static /* synthetic */ void j(CoroutineContext coroutineContext, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        F0.h(coroutineContext, cancellationException);
    }

    public static final InterfaceC1456i0 k(C0 c02, InterfaceC1456i0 interfaceC1456i0) {
        return p(c02, false, new C1460k0(interfaceC1456i0), 1, null);
    }

    public static final void l(C0 c02) {
        if (!c02.isActive()) {
            throw c02.getCancellationException();
        }
    }

    public static final void m(CoroutineContext coroutineContext) {
        C0 c02 = (C0) coroutineContext.get(C0.f9001U2);
        if (c02 != null) {
            F0.l(c02);
        }
    }

    public static final C0 n(CoroutineContext coroutineContext) {
        C0 c02 = (C0) coroutineContext.get(C0.f9001U2);
        if (c02 != null) {
            return c02;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final InterfaceC1456i0 o(C0 c02, boolean z10, H0 h02) {
        return c02 instanceof I0 ? ((I0) c02).b0(z10, h02) : c02.invokeOnCompletion(h02.u(), z10, new a(h02));
    }

    public static /* synthetic */ InterfaceC1456i0 p(C0 c02, boolean z10, H0 h02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return F0.o(c02, z10, h02);
    }

    public static final boolean q(CoroutineContext coroutineContext) {
        C0 c02 = (C0) coroutineContext.get(C0.f9001U2);
        if (c02 != null) {
            return c02.isActive();
        }
        return true;
    }
}
