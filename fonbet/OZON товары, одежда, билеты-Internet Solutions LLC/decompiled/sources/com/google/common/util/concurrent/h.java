package com.google.common.util.concurrent;

import Bl0.k0;
import O7.g;
import com.google.common.util.concurrent.k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h extends j {

    /* loaded from: classes9.dex */
    private static final class a<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final m f59199a;

        /* renamed from: b, reason: collision with root package name */
        final g<? super V> f59200b;

        a(m mVar, g gVar) {
            this.f59199a = mVar;
            this.f59200b = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Throwable a11;
            m mVar = this.f59199a;
            boolean z11 = mVar instanceof R7.a;
            g<? super V> gVar = this.f59200b;
            if (z11 && (a11 = R7.b.a((R7.a) mVar)) != null) {
                gVar.onFailure(a11);
                return;
            }
            try {
                k0.k(mVar, "Future was expected to be done: %s", mVar.isDone());
                gVar.onSuccess((Object) s.a(mVar));
            } catch (ExecutionException e11) {
                gVar.onFailure(e11.getCause());
            } catch (Throwable th2) {
                gVar.onFailure(th2);
            }
        }

        public final String toString() {
            g.a b11 = O7.g.b(this);
            b11.d(this.f59200b);
            return b11.toString();
        }
    }

    public static <V> void a(m<V> mVar, g<? super V> gVar, Executor executor) {
        gVar.getClass();
        mVar.a(new a(mVar, gVar), executor);
    }

    public static <V> m<V> b(Throwable th2) {
        return new k.a(th2);
    }

    public static <V> m<V> c(V v11) {
        return v11 == null ? (m<V>) k.f59201b : new k(v11);
    }

    public static m d(m mVar, com.google.common.cache.g gVar, Executor executor) {
        return c.x(mVar, gVar, executor);
    }
}
