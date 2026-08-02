package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m7p extends h8p {
    public final Executor c;
    public final /* synthetic */ o7p d;
    public final mgn e;
    public final /* synthetic */ o7p f;

    public m7p(o7p o7pVar, mgn mgnVar, Executor executor) {
        this.f = o7pVar;
        this.d = o7pVar;
        executor.getClass();
        this.c = executor;
        this.e = mgnVar;
    }

    @Override // defpackage.h8p
    public final Object d() {
        return this.e.call();
    }

    @Override // defpackage.h8p
    public final String g() {
        return this.e.toString();
    }

    @Override // defpackage.h8p
    public final boolean h() {
        return this.d.isDone();
    }

    @Override // defpackage.h8p
    public final void i(Object obj) {
        this.d.m = null;
        this.f.d(obj);
    }

    @Override // defpackage.h8p
    public final void j(Throwable th) {
        o7p o7pVar = this.d;
        o7pVar.m = null;
        if (th instanceof ExecutionException) {
            o7pVar.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            o7pVar.cancel(false);
        } else {
            o7pVar.e(th);
        }
    }
}
