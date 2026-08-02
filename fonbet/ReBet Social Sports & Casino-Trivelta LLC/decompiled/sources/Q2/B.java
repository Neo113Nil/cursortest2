package Q2;

import Q2.x;
import f0.AbstractC4222c;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class B {
    public static final x c(final H tracer, final String label, final Executor executor, final Function0 block) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(block, "block");
        final androidx.lifecycle.B b10 = new androidx.lifecycle.B(x.f9318b);
        Ta.o a10 = AbstractC4222c.a(new AbstractC4222c.InterfaceC0669c() { // from class: Q2.z
            @Override // f0.AbstractC4222c.InterfaceC0669c
            public final Object a(AbstractC4222c.a aVar) {
                Unit d10;
                d10 = B.d(executor, tracer, label, block, b10, aVar);
                return d10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a10, "getFuture { completer ->…}\n            }\n        }");
        return new y(b10, a10);
    }

    public static final Unit d(Executor executor, final H h10, final String str, final Function0 function0, final androidx.lifecycle.B b10, final AbstractC4222c.a completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        executor.execute(new Runnable() { // from class: Q2.A
            @Override // java.lang.Runnable
            public final void run() {
                B.e(H.this, str, function0, b10, completer);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void e(H h10, String str, Function0 function0, androidx.lifecycle.B b10, AbstractC4222c.a aVar) {
        boolean isEnabled = h10.isEnabled();
        if (isEnabled) {
            try {
                h10.a(str);
            } finally {
                if (isEnabled) {
                    h10.b();
                }
            }
        }
        try {
            function0.invoke();
            x.b.c cVar = x.f9317a;
            b10.postValue(cVar);
            aVar.c(cVar);
        } catch (Throwable th2) {
            b10.postValue(new x.b.a(th2));
            aVar.f(th2);
        }
        Unit unit = Unit.INSTANCE;
    }
}
