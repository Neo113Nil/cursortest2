package zc;

import Kc.C3493a;
import nc.InterfaceC8487b;
import tc.InterfaceC9802d;

/* loaded from: classes9.dex */
public final class Q<T> extends io.reactivex.k<T> implements InterfaceC9802d<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.p f107939a;

    /* renamed from: b, reason: collision with root package name */
    final long f107940b;

    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.m<? super T> f107941a;

        /* renamed from: b, reason: collision with root package name */
        final long f107942b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f107943c;

        /* renamed from: d, reason: collision with root package name */
        long f107944d;

        /* renamed from: e, reason: collision with root package name */
        boolean f107945e;

        a(io.reactivex.m<? super T> mVar, long j11) {
            this.f107941a = mVar;
            this.f107942b = j11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107943c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107943c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107945e) {
                return;
            }
            this.f107945e = true;
            this.f107941a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107945e) {
                C3493a.f(th2);
            } else {
                this.f107945e = true;
                this.f107941a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107945e) {
                return;
            }
            long j11 = this.f107944d;
            if (j11 != this.f107942b) {
                this.f107944d = j11 + 1;
                return;
            }
            this.f107945e = true;
            this.f107943c.dispose();
            this.f107941a.onSuccess(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107943c, interfaceC8487b)) {
                this.f107943c = interfaceC8487b;
                this.f107941a.onSubscribe(this);
            }
        }
    }

    public Q(io.reactivex.p pVar, long j11) {
        this.f107939a = pVar;
        this.f107940b = j11;
    }

    @Override // tc.InterfaceC9802d
    public final io.reactivex.p<T> b() {
        return new P(this.f107939a, this.f107940b, null, false);
    }

    @Override // io.reactivex.k
    public final void d(io.reactivex.m<? super T> mVar) {
        this.f107939a.subscribe(new a(mVar, this.f107940b));
    }
}
