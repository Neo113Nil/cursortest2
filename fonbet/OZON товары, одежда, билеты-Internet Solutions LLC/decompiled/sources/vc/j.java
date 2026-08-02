package vc;

import io.reactivex.A;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class j<T> extends AbstractC7094b {

    /* renamed from: a, reason: collision with root package name */
    final y f102780a;

    static final class a<T> implements A<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.d f102781a;

        a(io.reactivex.d dVar) {
            this.f102781a = dVar;
        }

        @Override // io.reactivex.A
        public final void onError(Throwable th2) {
            this.f102781a.onError(th2);
        }

        @Override // io.reactivex.A
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f102781a.onSubscribe(interfaceC8487b);
        }

        @Override // io.reactivex.A
        public final void onSuccess(T t2) {
            this.f102781a.onComplete();
        }
    }

    public j(y yVar) {
        this.f102780a = yVar;
    }

    @Override // io.reactivex.AbstractC7094b
    protected final void j(io.reactivex.d dVar) {
        this.f102780a.c(new a(dVar));
    }
}
