package wc;

import hg.InterfaceC6950c;
import io.reactivex.x;
import java.util.concurrent.TimeUnit;

/* renamed from: wc.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10491l<T> extends AbstractC10480a<T, T> {

    /* renamed from: d, reason: collision with root package name */
    final long f103970d;

    /* renamed from: e, reason: collision with root package name */
    final TimeUnit f103971e;

    /* renamed from: f, reason: collision with root package name */
    final io.reactivex.x f103972f;

    /* renamed from: wc.l$a */
    static final class a<T> implements io.reactivex.j<T>, InterfaceC6950c {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.j f103973a;

        /* renamed from: b, reason: collision with root package name */
        final long f103974b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f103975c;

        /* renamed from: d, reason: collision with root package name */
        final x.c f103976d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC6950c f103977e;

        /* renamed from: wc.l$a$a, reason: collision with other inner class name */
        final class RunnableC2251a implements Runnable {
            RunnableC2251a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                x.c cVar = aVar.f103976d;
                try {
                    aVar.f103973a.onComplete();
                } finally {
                    cVar.dispose();
                }
            }
        }

        /* renamed from: wc.l$a$b */
        final class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f103979a;

            b(Throwable th2) {
                this.f103979a = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                x.c cVar = aVar.f103976d;
                try {
                    aVar.f103973a.onError(this.f103979a);
                } finally {
                    cVar.dispose();
                }
            }
        }

        /* renamed from: wc.l$a$c */
        final class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final T f103981a;

            c(T t2) {
                this.f103981a = t2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.f103973a.onNext(this.f103981a);
            }
        }

        a(io.reactivex.j jVar, long j11, TimeUnit timeUnit, x.c cVar) {
            this.f103973a = jVar;
            this.f103974b = j11;
            this.f103975c = timeUnit;
            this.f103976d = cVar;
        }

        @Override // hg.InterfaceC6950c
        public final void cancel() {
            this.f103977e.cancel();
            this.f103976d.dispose();
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103977e, interfaceC6950c)) {
                this.f103977e = interfaceC6950c;
                this.f103973a.d(this);
            }
        }

        @Override // hg.InterfaceC6950c
        public final void n(long j11) {
            this.f103977e.n(j11);
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            this.f103976d.b(new RunnableC2251a(), this.f103974b, this.f103975c);
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            this.f103976d.b(new b(th2), 0L, this.f103975c);
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            this.f103976d.b(new c(t2), this.f103974b, this.f103975c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10491l(w wVar, long j11, io.reactivex.x xVar) {
        super(wVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f103970d = j11;
        this.f103971e = timeUnit;
        this.f103972f = xVar;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        Oc.a aVar = new Oc.a(jVar);
        x.c b11 = this.f103972f.b();
        this.f103914c.i(new a(aVar, this.f103970d, this.f103971e, b11));
    }
}
