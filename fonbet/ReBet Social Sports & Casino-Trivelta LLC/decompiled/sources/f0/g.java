package f0;

import Ph.InterfaceC1465n;
import Ta.o;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final o f46166a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1465n f46167b;

    public g(o oVar, InterfaceC1465n interfaceC1465n) {
        this.f46166a = oVar;
        this.f46167b = interfaceC1465n;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f46166a.isCancelled()) {
            InterfaceC1465n.a.a(this.f46167b, null, 1, null);
            return;
        }
        try {
            InterfaceC1465n interfaceC1465n = this.f46167b;
            Result.Companion companion = Result.INSTANCE;
            interfaceC1465n.resumeWith(Result.m147constructorimpl(AbstractC4220a.i(this.f46166a)));
        } catch (ExecutionException e10) {
            InterfaceC1465n interfaceC1465n2 = this.f46167b;
            Result.Companion companion2 = Result.INSTANCE;
            interfaceC1465n2.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(e.b(e10))));
        }
    }
}
