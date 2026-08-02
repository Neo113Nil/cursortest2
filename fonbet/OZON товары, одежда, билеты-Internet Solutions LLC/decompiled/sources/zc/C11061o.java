package zc;

import Bl0.C2645f;
import Cc.C2738a;
import java.util.Collection;
import java.util.concurrent.Callable;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: zc.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11061o<T, U extends Collection<? super T>, B> extends AbstractC11019a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.u<B> f108434b;

    /* renamed from: c, reason: collision with root package name */
    final Callable<U> f108435c;

    /* renamed from: zc.o$a */
    static final class a<T, U extends Collection<? super T>, B> extends Ic.c<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, U, B> f108436b;

        a(b<T, U, B> bVar) {
            this.f108436b = bVar;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108436b.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108436b.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(B b11) {
            this.f108436b.j();
        }
    }

    /* renamed from: zc.o$b */
    static final class b<T, U extends Collection<? super T>, B> extends uc.s<T, U, U> implements InterfaceC8487b {

        /* renamed from: g, reason: collision with root package name */
        final Callable<U> f108437g;

        /* renamed from: h, reason: collision with root package name */
        final io.reactivex.u<B> f108438h;

        /* renamed from: i, reason: collision with root package name */
        InterfaceC8487b f108439i;

        /* renamed from: j, reason: collision with root package name */
        InterfaceC8487b f108440j;

        /* renamed from: k, reason: collision with root package name */
        U f108441k;

        b(Ic.e eVar, Callable callable, io.reactivex.u uVar) {
            super(eVar, new C2738a());
            this.f108437g = callable;
            this.f108438h = uVar;
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
            ((Ic.c) this.f108440j).dispose();
            this.f108439i.dispose();
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
                U call = this.f108437g.call();
                C9656b.c(call, "The buffer supplied is null");
                U u11 = call;
                synchronized (this) {
                    try {
                        U u12 = this.f108441k;
                        if (u12 == null) {
                            return;
                        }
                        this.f108441k = u11;
                        g(u12, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                C2645f.c(th3);
                dispose();
                this.f100596b.onError(th3);
            }
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            synchronized (this) {
                try {
                    U u11 = this.f108441k;
                    if (u11 == null) {
                        return;
                    }
                    this.f108441k = null;
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
                    U u11 = this.f108441k;
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
            if (rc.d.g(this.f108439i, interfaceC8487b)) {
                this.f108439i = interfaceC8487b;
                try {
                    U call = this.f108437g.call();
                    C9656b.c(call, "The buffer supplied is null");
                    this.f108441k = call;
                    a aVar = new a(this);
                    this.f108440j = aVar;
                    this.f100596b.onSubscribe(this);
                    if (this.f100598d) {
                        return;
                    }
                    this.f108438h.subscribe(aVar);
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    this.f100598d = true;
                    interfaceC8487b.dispose();
                    rc.e.d(th2, this.f100596b);
                }
            }
        }
    }

    public C11061o(io.reactivex.p pVar, io.reactivex.u uVar, Callable callable) {
        super(pVar);
        this.f108434b = uVar;
        this.f108435c = callable;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super U> wVar) {
        this.f108122a.subscribe(new b(new Ic.e(wVar), this.f108435c, this.f108434b));
    }
}
