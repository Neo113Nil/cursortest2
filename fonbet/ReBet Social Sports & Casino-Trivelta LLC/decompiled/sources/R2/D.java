package R2;

import Ph.InterfaceC1465n;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Ta.o f9930a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1465n f9931b;

    public D(Ta.o futureToObserve, InterfaceC1465n continuation) {
        Intrinsics.checkNotNullParameter(futureToObserve, "futureToObserve");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f9930a = futureToObserve;
        this.f9931b = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable f10;
        Object e10;
        if (this.f9930a.isCancelled()) {
            InterfaceC1465n.a.a(this.f9931b, null, 1, null);
            return;
        }
        try {
            InterfaceC1465n interfaceC1465n = this.f9931b;
            Result.Companion companion = Result.INSTANCE;
            e10 = f0.e(this.f9930a);
            interfaceC1465n.resumeWith(Result.m147constructorimpl(e10));
        } catch (ExecutionException e11) {
            InterfaceC1465n interfaceC1465n2 = this.f9931b;
            Result.Companion companion2 = Result.INSTANCE;
            f10 = f0.f(e11);
            interfaceC1465n2.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(f10)));
        }
    }
}
