package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class r0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f30874a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30875b;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f30878e;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue f30877d = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public int f30876c = 0;

    public class a extends AbstractC3035t {

        /* renamed from: com.facebook.imagepipeline.producers.r0$a$a, reason: collision with other inner class name */
        public class RunnableC0483a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Pair f30880a;

            public RunnableC0483a(Pair pair) {
                this.f30880a = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                r0 r0Var = r0.this;
                Pair pair = this.f30880a;
                r0Var.g((InterfaceC3030n) pair.first, (e0) pair.second);
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3035t, com.facebook.imagepipeline.producers.AbstractC3019c
        public void f() {
            o().a();
            p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3035t, com.facebook.imagepipeline.producers.AbstractC3019c
        public void g(Throwable th2) {
            o().onFailure(th2);
            p();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3019c
        public void h(Object obj, int i10) {
            o().b(obj, i10);
            if (AbstractC3019c.d(i10)) {
                p();
            }
        }

        public final void p() {
            Pair pair;
            synchronized (r0.this) {
                try {
                    pair = (Pair) r0.this.f30877d.poll();
                    if (pair == null) {
                        r0 r0Var = r0.this;
                        r0Var.f30876c--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pair != null) {
                r0.this.f30878e.execute(new RunnableC0483a(pair));
            }
        }

        public a(InterfaceC3030n interfaceC3030n) {
            super(interfaceC3030n);
        }
    }

    public r0(int i10, Executor executor, d0 d0Var) {
        this.f30875b = i10;
        this.f30878e = (Executor) D6.k.g(executor);
        this.f30874a = (d0) D6.k.g(d0Var);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        boolean z10;
        e0Var.z0().d(e0Var, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i10 = this.f30876c;
                z10 = true;
                if (i10 >= this.f30875b) {
                    this.f30877d.add(Pair.create(interfaceC3030n, e0Var));
                } else {
                    this.f30876c = i10 + 1;
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return;
        }
        g(interfaceC3030n, e0Var);
    }

    public void g(InterfaceC3030n interfaceC3030n, e0 e0Var) {
        e0Var.z0().j(e0Var, "ThrottlingProducer", null);
        this.f30874a.b(new a(interfaceC3030n), e0Var);
    }
}
