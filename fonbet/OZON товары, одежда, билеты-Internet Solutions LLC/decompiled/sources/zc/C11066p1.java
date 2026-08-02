package zc;

import Kc.C3493a;
import nc.InterfaceC8487b;

/* renamed from: zc.p1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11066p1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f108529b;

    /* renamed from: zc.p1$a */
    static final class a<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108530a;

        /* renamed from: b, reason: collision with root package name */
        boolean f108531b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108532c;

        /* renamed from: d, reason: collision with root package name */
        long f108533d;

        a(io.reactivex.w<? super T> wVar, long j11) {
            this.f108530a = wVar;
            this.f108533d = j11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108532c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108532c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            if (this.f108531b) {
                return;
            }
            this.f108531b = true;
            this.f108532c.dispose();
            this.f108530a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            if (this.f108531b) {
                C3493a.f(th2);
                return;
            }
            this.f108531b = true;
            this.f108532c.dispose();
            this.f108530a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108531b) {
                return;
            }
            long j11 = this.f108533d;
            long j12 = j11 - 1;
            this.f108533d = j12;
            if (j11 > 0) {
                boolean z11 = j12 == 0;
                this.f108530a.onNext(t2);
                if (z11) {
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108532c, interfaceC8487b)) {
                this.f108532c = interfaceC8487b;
                long j11 = this.f108533d;
                io.reactivex.w<? super T> wVar = this.f108530a;
                if (j11 != 0) {
                    wVar.onSubscribe(this);
                    return;
                }
                this.f108531b = true;
                interfaceC8487b.dispose();
                rc.e.b(wVar);
            }
        }
    }

    public C11066p1(io.reactivex.u<T> uVar, long j11) {
        super(uVar);
        this.f108529b = j11;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108529b));
    }
}
