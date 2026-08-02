package Xh;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class b {

    public static final class a implements OnCompleteListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1465n f13868a;

        public a(InterfaceC1465n interfaceC1465n) {
            this.f13868a = interfaceC1465n;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Exception exception = task.getException();
            if (exception != null) {
                InterfaceC1465n interfaceC1465n = this.f13868a;
                Result.Companion companion = Result.INSTANCE;
                interfaceC1465n.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(exception)));
            } else {
                if (task.isCanceled()) {
                    InterfaceC1465n.a.a(this.f13868a, null, 1, null);
                    return;
                }
                InterfaceC1465n interfaceC1465n2 = this.f13868a;
                Result.Companion companion2 = Result.INSTANCE;
                interfaceC1465n2.resumeWith(Result.m147constructorimpl(task.getResult()));
            }
        }
    }

    /* renamed from: Xh.b$b, reason: collision with other inner class name */
    public static final class C0286b implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellationTokenSource f13869a;

        public C0286b(CancellationTokenSource cancellationTokenSource) {
            this.f13869a = cancellationTokenSource;
        }

        public final void a(Throwable th2) {
            this.f13869a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    public static final Object a(Task task, Continuation continuation) {
        return b(task, null, continuation);
    }

    public static final Object b(Task task, CancellationTokenSource cancellationTokenSource, Continuation continuation) {
        if (!task.isComplete()) {
            C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
            c1469p.F();
            task.addOnCompleteListener(Xh.a.f13867a, new a(c1469p));
            if (cancellationTokenSource != null) {
                c1469p.c(new C0286b(cancellationTokenSource));
            }
            Object z10 = c1469p.z();
            if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return z10;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
