package zc;

import Bl0.C2645f;
import Kc.C3493a;
import nc.InterfaceC8487b;
import qc.InterfaceC9019a;
import tc.InterfaceC9803e;
import uc.AbstractC10018b;

/* loaded from: classes9.dex */
public final class M<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC9019a f107842b;

    static final class a<T> extends AbstractC10018b<T> implements io.reactivex.w<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f107843a;

        /* renamed from: b, reason: collision with root package name */
        final InterfaceC9019a f107844b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f107845c;

        /* renamed from: d, reason: collision with root package name */
        InterfaceC9803e<T> f107846d;

        /* renamed from: e, reason: collision with root package name */
        boolean f107847e;

        a(io.reactivex.w<? super T> wVar, InterfaceC9019a interfaceC9019a) {
            this.f107843a = wVar;
            this.f107844b = interfaceC9019a;
        }

        @Override // tc.InterfaceC9804f
        public final int a(int i11) {
            InterfaceC9803e<T> interfaceC9803e = this.f107846d;
            if (interfaceC9803e == null || (i11 & 4) != 0) {
                return 0;
            }
            int a11 = interfaceC9803e.a(i11);
            if (a11 != 0) {
                this.f107847e = a11 == 1;
            }
            return a11;
        }

        final void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f107844b.run();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    C3493a.f(th2);
                }
            }
        }

        @Override // tc.InterfaceC9808j
        public final void clear() {
            this.f107846d.clear();
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f107845c.dispose();
            b();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f107845c.isDisposed();
        }

        @Override // tc.InterfaceC9808j
        public final boolean isEmpty() {
            return this.f107846d.isEmpty();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f107843a.onComplete();
            b();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f107843a.onError(th2);
            b();
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            this.f107843a.onNext(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f107845c, interfaceC8487b)) {
                this.f107845c = interfaceC8487b;
                if (interfaceC8487b instanceof InterfaceC9803e) {
                    this.f107846d = (InterfaceC9803e) interfaceC8487b;
                }
                this.f107843a.onSubscribe(this);
            }
        }

        @Override // tc.InterfaceC9808j
        public final T poll() throws Exception {
            T poll = this.f107846d.poll();
            if (poll == null && this.f107847e) {
                b();
            }
            return poll;
        }
    }

    public M(io.reactivex.p pVar, InterfaceC9019a interfaceC9019a) {
        super(pVar);
        this.f107842b = interfaceC9019a;
    }

    @Override // io.reactivex.p
    protected final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f107842b));
    }
}
