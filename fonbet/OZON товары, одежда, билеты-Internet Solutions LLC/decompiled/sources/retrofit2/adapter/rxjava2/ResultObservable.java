package retrofit2.adapter.rxjava2;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.p;
import io.reactivex.w;
import nc.InterfaceC8487b;
import oc.C8691a;
import retrofit2.Response;

/* loaded from: classes10.dex */
final class ResultObservable<T> extends p<Result<T>> {
    private final p<Response<T>> upstream;

    private static class ResultObserver<R> implements w<Response<R>> {
        private final w<? super Result<R>> observer;

        ResultObserver(w<? super Result<R>> wVar) {
            this.observer = wVar;
        }

        @Override // io.reactivex.w
        public void onComplete() {
            this.observer.onComplete();
        }

        @Override // io.reactivex.w
        public void onError(Throwable th2) {
            try {
                this.observer.onNext(Result.error(th2));
                this.observer.onComplete();
            } catch (Throwable th3) {
                try {
                    this.observer.onError(th3);
                } catch (Throwable th4) {
                    C2645f.c(th4);
                    C3493a.f(new C8691a(th3, th4));
                }
            }
        }

        @Override // io.reactivex.w, io.reactivex.m, io.reactivex.A
        public void onSubscribe(InterfaceC8487b interfaceC8487b) {
            this.observer.onSubscribe(interfaceC8487b);
        }

        @Override // io.reactivex.w
        public void onNext(Response<R> response) {
            this.observer.onNext(Result.response(response));
        }
    }

    ResultObservable(p<Response<T>> pVar) {
        this.upstream = pVar;
    }

    @Override // io.reactivex.p
    protected void subscribeActual(w<? super Result<T>> wVar) {
        this.upstream.subscribe(new ResultObserver(wVar));
    }
}
