package retrofit2.adapter.rxjava2;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.p;
import io.reactivex.w;
import nc.InterfaceC8487b;
import oc.C8691a;
import retrofit2.Response;

/* loaded from: classes6.dex */
final class BodyObservable<T> extends p<T> {
    private final p<Response<T>> upstream;

    private static class BodyObserver<R> implements w<Response<R>> {
        private final w<? super R> observer;
        private boolean terminated;

        BodyObserver(w<? super R> wVar) {
            this.observer = wVar;
        }

        @Override // io.reactivex.w
        public void onComplete() {
            if (this.terminated) {
                return;
            }
            this.observer.onComplete();
        }

        @Override // io.reactivex.w
        public void onError(Throwable th2) {
            if (!this.terminated) {
                this.observer.onError(th2);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th2);
            C3493a.f(assertionError);
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.observer.onSubscribe(interfaceC8487b);
        }

        @Override // io.reactivex.w
        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.observer.onNext(response.body());
                return;
            }
            this.terminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.observer.onError(httpException);
            } catch (Throwable th2) {
                C2645f.c(th2);
                C3493a.f(new C8691a(httpException, th2));
            }
        }
    }

    BodyObservable(p<Response<T>> pVar) {
        this.upstream = pVar;
    }

    @Override // io.reactivex.p
    protected void subscribeActual(w<? super T> wVar) {
        this.upstream.subscribe(new BodyObserver(wVar));
    }
}
