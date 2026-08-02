package com.plaid.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

/* renamed from: com.plaid.internal.p7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3720p7<R> {

    /* renamed from: a, reason: collision with root package name */
    public final C3703o<R> f40969a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f40970b = Executors.newCachedThreadPool();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f40971c = true;

    /* renamed from: d, reason: collision with root package name */
    public final E0 f40972d;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.plaid.internal.p7$a */
    public class a<T> implements Callable<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f40973a;

        public a(c cVar) {
            this.f40973a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final T call() {
            return (T) this.f40973a.call();
        }
    }

    /* renamed from: com.plaid.internal.p7$b */
    public class b implements c<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3712p f40974a;

        public b(C3712p c3712p) {
            this.f40974a = c3712p;
        }

        @Override // com.plaid.internal.C3720p7.c
        public final R call() {
            C3703o<R> c3703o = C3720p7.this.f40969a;
            c3703o.f40879f.a((InterfaceC3731r1) C3703o.a(EnumC3684l7.PRE_CHECK, c3703o.f40874a, new C3649i(), this.f40974a));
            return null;
        }
    }

    /* renamed from: com.plaid.internal.p7$c */
    public interface c<T> {
        T call();
    }

    public C3720p7(C3703o c3703o, E0 e02) {
        this.f40969a = c3703o;
        this.f40972d = e02;
    }

    public final <T> T a(c<T> cVar, C3712p c3712p) {
        try {
            return this.f40970b.submit(new a(cVar)).get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw new r(c3712p.f40925b, e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof r) {
                throw ((r) cause);
            }
            throw new r(c3712p.f40925b, cause);
        } catch (TimeoutException unused) {
            c3712p.f40924a = true;
            throw new r(c3712p.f40925b, new C3721q(T0.GENERIC_TIMEOUT));
        }
    }

    public final void b() {
        C3712p c3712p = new C3712p();
        a(new b(c3712p), c3712p);
    }

    public final R a() {
        String a10;
        C3712p c3712p = new C3712p();
        try {
            a10 = (String) a(new C3729q7(this, c3712p), c3712p);
        } catch (r e10) {
            if (this.f40971c && e10.f41008a == EnumC3684l7.AUTHENTICATION) {
                a10 = H.a(e10, c3712p);
            } else {
                throw e10;
            }
        }
        C3703o<R> c3703o = this.f40969a;
        c3703o.getClass();
        try {
            R r10 = (R) C3703o.a(EnumC3684l7.FINISH, c3703o.f40878e, new C3694n(a10), c3712p);
            C3703o.f40873g.a(W3.INFO, "authentication completed", new Object[0]);
            A7 a72 = c3703o.f40879f;
            synchronized (a72) {
                a72.b();
            }
            return r10;
        } catch (r e11) {
            c3703o.f40879f.a();
            throw e11;
        }
    }
}
