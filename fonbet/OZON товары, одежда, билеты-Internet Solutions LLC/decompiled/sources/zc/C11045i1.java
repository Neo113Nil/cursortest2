package zc;

import java.util.ArrayDeque;
import nc.InterfaceC8487b;

/* renamed from: zc.i1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C11045i1<T> extends AbstractC11019a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final int f108285b;

    /* renamed from: zc.i1$a */
    static final class a<T> extends ArrayDeque<T> implements io.reactivex.w<T>, InterfaceC8487b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f108286a;

        /* renamed from: b, reason: collision with root package name */
        final int f108287b;

        /* renamed from: c, reason: collision with root package name */
        InterfaceC8487b f108288c;

        a(io.reactivex.w<? super T> wVar, int i11) {
            super(i11);
            this.f108286a = wVar;
            this.f108287b = i11;
        }

        @Override // nc.InterfaceC8487b
        public final void dispose() {
            this.f108288c.dispose();
        }

        @Override // nc.InterfaceC8487b
        public final boolean isDisposed() {
            return this.f108288c.isDisposed();
        }

        @Override // io.reactivex.w
        public final void onComplete() {
            this.f108286a.onComplete();
        }

        @Override // io.reactivex.w
        public final void onError(Throwable th2) {
            this.f108286a.onError(th2);
        }

        @Override // io.reactivex.w
        public final void onNext(T t2) {
            if (this.f108287b == size()) {
                this.f108286a.onNext(poll());
            }
            offer(t2);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            if (rc.d.g(this.f108288c, interfaceC8487b)) {
                this.f108288c = interfaceC8487b;
                this.f108286a.onSubscribe(this);
            }
        }
    }

    public C11045i1(io.reactivex.p pVar, int i11) {
        super(pVar);
        this.f108285b = i11;
    }

    @Override // io.reactivex.p
    public final void subscribeActual(io.reactivex.w<? super T> wVar) {
        this.f108122a.subscribe(new a(wVar, this.f108285b));
    }
}
