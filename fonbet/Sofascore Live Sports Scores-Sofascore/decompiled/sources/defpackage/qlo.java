package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qlo extends x8a {
    public final Executor f;
    public final /* synthetic */ rlo g;
    public final Callable h;
    public final /* synthetic */ rlo i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlo(rlo rloVar, Callable callable, Executor executor) {
        super(1);
        this.i = rloVar;
        this.g = rloVar;
        executor.getClass();
        this.f = executor;
        this.h = callable;
    }

    @Override // defpackage.x8a
    public final Object k() {
        return this.h.call();
    }

    @Override // defpackage.x8a
    public final String m() {
        return this.h.toString();
    }

    @Override // defpackage.x8a
    public final boolean n() {
        return this.g.isDone();
    }

    @Override // defpackage.x8a
    public final void o(Object obj) {
        this.g.p = null;
        this.i.d(obj);
    }

    @Override // defpackage.x8a
    public final void p(Throwable th) {
        rlo rloVar = this.g;
        rloVar.p = null;
        if (th instanceof ExecutionException) {
            rloVar.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            rloVar.cancel(false);
        } else {
            rloVar.e(th);
        }
    }
}
