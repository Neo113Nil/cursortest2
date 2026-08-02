package zc;

import Kc.C3493a;
import java.util.NoSuchElementException;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class P<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f107916b;

    /* renamed from: c, reason: collision with root package name */
    final T f107917c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f107918d;

    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107919a;

        /* renamed from: b, reason: collision with root package name */
        final long f107920b;

        /* renamed from: c, reason: collision with root package name */
        final T f107921c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f107922d;

        /* renamed from: e, reason: collision with root package name */
        InterfaceC8487b f107923e;

        /* renamed from: f, reason: collision with root package name */
        long f107924f;

        /* renamed from: g, reason: collision with root package name */
        boolean f107925g;

        a(io.reactivex.w<? super T> wVar, long j11, T t2, boolean z11) {
            this.f107919a = wVar;
            this.f107920b = j11;
            this.f107921c = t2;
            this.f107922d = z11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107923e.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107923e.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f107925g) {
                return;
            }
            this.f107925g = true;
            io.reactivex.w<? super T> wVar = this.f107919a;
            T t2 = this.f107921c;
            if (t2 == null && this.f107922d) {
                wVar.onError(new NoSuchElementException());
                return;
            }
            if (t2 != null) {
                wVar.onNext(t2);
            }
            wVar.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f107925g) {
                C3493a.f(th2);
            } else {
                this.f107925g = true;
                this.f107919a.onError(th2);
            }
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f107925g) {
                return;
            }
            long j11 = this.f107924f;
            if (j11 != this.f107920b) {
                this.f107924f = j11 + 1;
                return;
            }
            this.f107925g = true;
            this.f107923e.dispose();
            io.reactivex.w<? super T> wVar = this.f107919a;
            wVar.onNext(t2);
            wVar.onComplete();
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107923e, interfaceC8487b)) {
                this.f107923e = interfaceC8487b;
                this.f107919a.onSubscribe(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public P(io.reactivex.p pVar, long j11, Object obj, boolean z11) {
        super(pVar);
        this.f107916b = j11;
        this.f107917c = obj;
        this.f107918d = z11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f107916b, this.f107917c, this.f107918d));
    }
}
