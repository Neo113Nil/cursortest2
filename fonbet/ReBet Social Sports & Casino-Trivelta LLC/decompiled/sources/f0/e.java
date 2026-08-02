package f0;

import Ph.C1469p;
import Ta.o;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public abstract class e {

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f46165d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar) {
            super(1);
            this.f46165d = oVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            this.f46165d.cancel(false);
        }
    }

    public static final Object a(o oVar, Continuation continuation) {
        try {
            if (oVar.isDone()) {
                return AbstractC4220a.i(oVar);
            }
            C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
            c1469p.F();
            oVar.l(new g(oVar, c1469p), d.INSTANCE);
            c1469p.c(new a(oVar));
            Object z10 = c1469p.z();
            if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return z10;
        } catch (ExecutionException e10) {
            throw b(e10);
        }
    }

    public static final Throwable b(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }
}
