package R2;

import Ph.C1469p;
import Q2.AbstractC1508t;
import Q2.EnumC1496g;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10032a;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f10033d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ta.o f10034e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.work.c cVar, Ta.o oVar) {
            super(1);
            this.f10033d = cVar;
            this.f10034e = oVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th2) {
            if (th2 instanceof a0) {
                this.f10033d.stop(((a0) th2).a());
            }
            this.f10034e.cancel(false);
        }
    }

    static {
        String i10 = AbstractC1508t.i("WorkerWrapper");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"WorkerWrapper\")");
        f10032a = i10;
    }

    public static final Object d(Ta.o oVar, androidx.work.c cVar, Continuation continuation) {
        try {
            if (oVar.isDone()) {
                return e(oVar);
            }
            C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
            c1469p.F();
            oVar.l(new D(oVar, c1469p), EnumC1496g.INSTANCE);
            c1469p.c(new a(cVar, oVar));
            Object z10 = c1469p.z();
            if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return z10;
        } catch (ExecutionException e10) {
            throw f(e10);
        }
    }

    public static final Object e(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Throwable f(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }
}
