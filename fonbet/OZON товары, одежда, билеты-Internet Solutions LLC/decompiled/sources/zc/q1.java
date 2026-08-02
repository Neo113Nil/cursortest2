package zc;

import java.util.ArrayDeque;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class q1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final int f108562b;

    static final class a<T> extends ArrayDeque<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108563a;

        /* renamed from: b, reason: collision with root package name */
        final int f108564b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108565c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f108566d;

        a(io.reactivex.w<? super T> wVar, int i11) {
            this.f108563a = wVar;
            this.f108564b = i11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            if (this.f108566d) {
                return;
            }
            this.f108566d = true;
            this.f108565c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108566d;
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            io.reactivex.w<? super T> wVar = this.f108563a;
            while (!this.f108566d) {
                T poll = poll();
                if (poll == null) {
                    if (this.f108566d) {
                        return;
                    }
                    wVar.onComplete();
                    return;
                }
                wVar.onNext(poll);
            }
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108563a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108564b == size()) {
                poll();
            }
            offer(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108565c, interfaceC8487b)) {
                this.f108565c = interfaceC8487b;
                this.f108563a.onSubscribe(this);
            }
        }
    }

    public q1(io.reactivex.p pVar, int i11) {
        super(pVar);
        this.f108562b = i11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108562b));
    }
}
