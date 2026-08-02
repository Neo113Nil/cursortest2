package wc;

import B90.C2601c;
import Bl0.C2645f;
import Kc.C3493a;
import hg.InterfaceC6950c;
import nc.InterfaceC8487b;
import sc.C9656b;

/* renamed from: wc.F, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10477F<T, R> extends io.reactivex.y<R> {

    /* renamed from: a, reason: collision with root package name */
    final Ac.b f103777a;

    /* renamed from: b, reason: collision with root package name */
    final Integer f103778b = 0;

    /* renamed from: c, reason: collision with root package name */
    final C2601c f103779c;

    /* renamed from: wc.F$a */
    static final class a<T, R> implements io.reactivex.j<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super R> f103780a;

        /* renamed from: b, reason: collision with root package name */
        final C2601c f103781b;

        /* renamed from: c, reason: collision with root package name */
        R f103782c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC6950c f103783d;

        /* JADX WARN: Multi-variable type inference failed */
        a(io.reactivex.A a11, C2601c c2601c, Integer num) {
            this.f103780a = a11;
            this.f103782c = num;
            this.f103781b = c2601c;
        }

        @Override // hg.InterfaceC6949b
        public final void d(InterfaceC6950c interfaceC6950c) {
            if (Fc.g.g(this.f103783d, interfaceC6950c)) {
                this.f103783d = interfaceC6950c;
                this.f103780a.onSubscribe(this);
                interfaceC6950c.n(Long.MAX_VALUE);
            }
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f103783d.cancel();
            this.f103783d = Fc.g.CANCELLED;
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f103783d == Fc.g.CANCELLED;
        }

        @Override // hg.InterfaceC6949b
        public final void onComplete() {
            R r11 = this.f103782c;
            if (r11 != null) {
                this.f103782c = null;
                this.f103783d = Fc.g.CANCELLED;
                this.f103780a.onSuccess(r11);
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onError(Throwable th2) {
            if (this.f103782c == null) {
                C3493a.f(th2);
                return;
            }
            this.f103782c = null;
            this.f103783d = Fc.g.CANCELLED;
            this.f103780a.onError(th2);
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            R r11 = this.f103782c;
            if (r11 != null) {
                try {
                    R r12 = (R) this.f103781b.apply(r11, t2);
                    C9656b.c(r12, "The reducer returned a null value");
                    this.f103782c = r12;
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    this.f103783d.cancel();
                    onError(th2);
                }
            }
        }
    }

    public C10477F(Ac.b bVar, C2601c c2601c) {
        this.f103777a = bVar;
        this.f103779c = c2601c;
    }

    @Override // io.reactivex.y
    protected final void i(io.reactivex.A<? super R> a11) {
        this.f103777a.a(new a(a11, this.f103779c, this.f103778b));
    }
}
