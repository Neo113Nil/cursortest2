package vc;

import Bl0.C2645f;
import io.reactivex.A;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.concurrent.Callable;
import nc.InterfaceC8487b;

/* loaded from: classes9.dex */
public final class s<T> extends y<T> {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7094b f102817a;

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends T> f102818b;

    final class a implements io.reactivex.d {

        /* renamed from: a, reason: collision with root package name */
        private final A<? super T> f102819a;

        a(A<? super T> a11) {
            this.f102819a = a11;
        }

        @Override // io.reactivex.d
        public final void onComplete() {
            T call;
            Callable<? extends T> callable = s.this.f102818b;
            A<? super T> a11 = this.f102819a;
            if (callable != null) {
                try {
                    call = callable.call();
                } catch (Throwable th2) {
                    C2645f.c(th2);
                    a11.onError(th2);
                    return;
                }
            } else {
                call = null;
            }
            if (call == null) {
                a11.onError(new NullPointerException("The value supplied is null"));
            } else {
                a11.onSuccess(call);
            }
        }

        @Override // io.reactivex.d
        public final void onError(Throwable th2) {
            this.f102819a.onError(th2);
        }

        @Override // io.reactivex.d
        public final void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.f102819a.onSubscribe(interfaceC8487b);
        }
    }

    public s(AbstractC7094b abstractC7094b, Callable callable) {
        this.f102817a = abstractC7094b;
        this.f102818b = callable;
    }

    @Override // io.reactivex.y
    protected final void i(A<? super T> a11) {
        this.f102817a.a(new a(a11));
    }
}
