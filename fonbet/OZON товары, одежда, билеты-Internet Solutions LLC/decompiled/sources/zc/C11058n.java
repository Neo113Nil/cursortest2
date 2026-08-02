package zc;

import Bl0.C2645f;
import Cc.C2738a;
import Kc.C3493a;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: zc.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11058n<T, U extends Collection<? super T>, B> extends AbstractC11019a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends io.reactivex.u<B>> f108417b;

    /* renamed from: c, reason: collision with root package name */
    final Callable<U> f108418c;

    /* renamed from: zc.n$a */
    static final class a<T, U extends Collection<? super T>, B> extends Ic.c<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, U, B> f108419b;

        /* renamed from: c, reason: collision with root package name */
        boolean f108420c;

        a(b<T, U, B> bVar) {
            this.f108419b = bVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108420c) {
                return;
            }
            this.f108420c = true;
            this.f108419b.j();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108420c) {
                C3493a.f(th2);
            } else {
                this.f108420c = true;
                this.f108419b.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(B b11) {
            if (this.f108420c) {
                return;
            }
            this.f108420c = true;
            dispose();
            this.f108419b.j();
        }
    }

    /* renamed from: zc.n$b */
    static final class b<T, U extends Collection<? super T>, B> extends uc.s<T, U, U> implements InterfaceC8487b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f108421g;

        /* renamed from: h, reason: collision with root package name */
        final Callable<? extends io.reactivex.u<B>> f108422h;

        /* renamed from: i, reason: collision with root package name */
        InterfaceC8487b f108423i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicReference<InterfaceC8487b> f108424j;

        /* renamed from: k, reason: collision with root package name */
        U f108425k;

        b(Ic.e eVar, Callable callable, Callable callable2) {
            super(eVar, new C2738a());
            this.f108424j = new AtomicReference<>();
            this.f108421g = callable;
            this.f108422h = callable2;
        }

        @Override // uc.s
        public final void a(Ic.e eVar, Object obj) {
            this.f100596b.onNext((Collection) obj);
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f100598d) {
                return;
            }
            this.f100598d = true;
            this.f108423i.dispose();
            rc.d.a(this.f108424j);
            if (d()) {
                this.f100597c.clear();
            }
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f100598d;
        }

        final void j() {
            try {
                U call = this.f108421g.call();
                C9656b.c(call, "The buffer supplied is null");
                U u11 = call;
                try {
                    io.reactivex.u<B> call2 = this.f108422h.call();
                    C9656b.c(call2, "The boundary ObservableSource supplied is null");
                    io.reactivex.u<B> uVar = call2;
                    a aVar = new a(this);
                    if (rc.d.d(this.f108424j, aVar)) {
                        synchronized (this) {
                            try {
                                U u12 = this.f108425k;
                                if (u12 == null) {
                                    return;
                                }
                                this.f108425k = u11;
                                uVar.subscribe(aVar);
                                g(u12, this);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    C2645f.c(th3);
                    this.f100598d = true;
                    this.f108423i.dispose();
                    this.f100596b.onError(th3);
                }
            } catch (Throwable th4) {
                C2645f.c(th4);
                dispose();
                this.f100596b.onError(th4);
            }
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            synchronized (this) {
                try {
                    U u11 = this.f108425k;
                    if (u11 == null) {
                        return;
                    }
                    this.f108425k = null;
                    this.f100597c.offer(u11);
                    this.f100599e = true;
                    if (d()) {
                        Bl0.D.b(this.f100597c, this.f100596b, this, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            dispose();
            this.f100596b.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            synchronized (this) {
                try {
                    U u11 = this.f108425k;
                    if (u11 == null) {
                        return;
                    }
                    u11.add(t2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108423i, interfaceC8487b)) {
                this.f108423i = interfaceC8487b;
                Ic.e eVar = this.f100596b;
                try {
                    U call = this.f108421g.call();
                    C9656b.c(call, "The buffer supplied is null");
                    this.f108425k = call;
                    try {
                        io.reactivex.u<B> call2 = this.f108422h.call();
                        C9656b.c(call2, "The boundary ObservableSource supplied is null");
                        io.reactivex.u<B> uVar = call2;
                        a aVar = new a(this);
                        this.f108424j.set(aVar);
                        eVar.onSubscribe(this);
                        if (this.f100598d) {
                            return;
                        }
                        uVar.subscribe(aVar);
                    } catch (Throwable th2) {
                        C2645f.c(th2);
                        this.f100598d = true;
                        interfaceC8487b.dispose();
                        rc.e.d(th2, eVar);
                    }
                } catch (Throwable th3) {
                    C2645f.c(th3);
                    this.f100598d = true;
                    interfaceC8487b.dispose();
                    rc.e.d(th3, eVar);
                }
            }
        }
    }

    public C11058n(io.reactivex.p pVar, Callable callable, Callable callable2) {
        super(pVar);
        this.f108417b = callable;
        this.f108418c = callable2;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super U> wVar) {
        this.f108122a.subscribe(new b(new Ic.e(wVar), this.f108418c, this.f108417b));
    }
}
