package Q2;

import f0.AbstractC4222c;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class U {
    public static final Ta.o e(final Executor executor, final Function0 function0) {
        Ta.o a10 = AbstractC4222c.a(new AbstractC4222c.InterfaceC0669c() { // from class: Q2.Q
            @Override // f0.AbstractC4222c.InterfaceC0669c
            public final Object a(AbstractC4222c.a aVar) {
                Unit f10;
                f10 = U.f(executor, function0, aVar);
                return f10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a10, "getFuture {\n        val …        }\n        }\n    }");
        return a10;
    }

    public static final Unit f(Executor executor, final Function0 function0, final AbstractC4222c.a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        it.a(new Runnable() { // from class: Q2.S
            @Override // java.lang.Runnable
            public final void run() {
                U.g(atomicBoolean);
            }
        }, EnumC1496g.INSTANCE);
        executor.execute(new Runnable() { // from class: Q2.T
            @Override // java.lang.Runnable
            public final void run() {
                U.h(atomicBoolean, it, function0);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void g(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    public static final void h(AtomicBoolean atomicBoolean, AbstractC4222c.a aVar, Function0 function0) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            aVar.c(function0.invoke());
        } catch (Throwable th2) {
            aVar.f(th2);
        }
    }
}
