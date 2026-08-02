package zc;

import Kc.C3493a;
import java.util.NoSuchElementException;
import nc.InterfaceC8487b;
import tc.InterfaceC9802d;

/* loaded from: classes.dex */
public final class S<T> extends io.reactivex.y<T> implements InterfaceC9802d<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f107956a;

    /* renamed from: b, reason: collision with root package name */
    final long f107957b;

    /* renamed from: c, reason: collision with root package name */
    final T f107958c;

    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.A<? super T> f107959a;

        /* renamed from: b, reason: collision with root package name */
        final long f107960b;

        /* renamed from: c, reason: collision with root package name */
        final T f107961c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC8487b f107962d;

        /* renamed from: e, reason: collision with root package name */
        long f107963e;

        /* renamed from: f, reason: collision with root package name */
        boolean f107964f;

        a(io.reactivex.A<? super T> a11, long j11, T t2) {
            this.f107959a = a11;
            this.f107960b = j11;
            this.f107961c = t2;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107962d.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107962d.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107964f) {
                return;
            }
            this.f107964f = true;
            io.reactivex.A<? super T> a11 = this.f107959a;
            T t2 = this.f107961c;
            if (t2 != null) {
                a11.onSuccess(t2);
            } else {
                a11.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107964f) {
                C3493a.f(th2);
            } else {
                this.f107964f = true;
                this.f107959a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107964f) {
                return;
            }
            long j11 = this.f107963e;
            if (j11 != this.f107960b) {
                this.f107963e = j11 + 1;
                return;
            }
            this.f107964f = true;
            this.f107962d.dispose();
            this.f107959a.onSuccess(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107962d, interfaceC8487b)) {
                this.f107962d = interfaceC8487b;
                this.f107959a.onSubscribe(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public S(io.reactivex.p pVar, long j11, Object obj) {
        this.f107956a = pVar;
        this.f107957b = j11;
        this.f107958c = obj;
    }

    @Override // tc.InterfaceC9802d
    public final io.reactivex.p<T> b() {
        return new P(this.f107956a, this.f107957b, this.f107958c, true);
    }

    @Override // io.reactivex.y
    public final void i(io.reactivex.A<? super T> a11) {
        this.f107956a.subscribe(new a(a11, this.f107957b, this.f107958c));
    }
}
