package com.google.common.util.concurrent;

import com.google.common.util.concurrent.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
abstract class c<I, O, F, T> extends f.a<O> implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    m<? extends I> f59197h;

    /* renamed from: i, reason: collision with root package name */
    O7.e f59198i;

    private static final class a<I, O> extends c<I, O, O7.e<? super I, ? extends O>, O> {
    }

    static m x(m mVar, com.google.common.cache.g gVar, Executor executor) {
        a aVar = new a();
        aVar.f59197h = mVar;
        aVar.f59198i = gVar;
        executor.getClass();
        if (executor != d.INSTANCE) {
            executor = new n(executor, aVar);
        }
        ((k) mVar).a(aVar, executor);
        return aVar;
    }

    @Override // com.google.common.util.concurrent.a
    protected final void m() {
        s(this.f59197h);
        this.f59197h = null;
        this.f59198i = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        m<? extends I> mVar = this.f59197h;
        O7.e eVar = this.f59198i;
        if ((isCancelled() | (mVar == null)) || (eVar == 0)) {
            return;
        }
        this.f59197h = null;
        ((k) mVar).getClass();
        try {
            try {
                Object apply = eVar.apply(s.a(mVar));
                this.f59198i = null;
                ((a) this).v(apply);
            } catch (Throwable th2) {
                try {
                    if (th2 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    w(th2);
                } finally {
                    this.f59198i = null;
                }
            }
        } catch (Error e11) {
            w(e11);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e12) {
            w(e12.getCause());
        } catch (Exception e13) {
            w(e13);
        }
    }

    @Override // com.google.common.util.concurrent.a
    protected final String t() {
        String str;
        m<? extends I> mVar = this.f59197h;
        O7.e eVar = this.f59198i;
        String t2 = super.t();
        if (mVar != null) {
            str = "inputFuture=[" + mVar + "], ";
        } else {
            str = "";
        }
        if (eVar == null) {
            if (t2 != null) {
                return U7.d.e(str, t2);
            }
            return null;
        }
        return str + "function=[" + eVar + "]";
    }
}
