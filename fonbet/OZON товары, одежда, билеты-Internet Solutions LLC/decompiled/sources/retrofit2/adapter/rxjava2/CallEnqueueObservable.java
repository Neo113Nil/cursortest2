package retrofit2.adapter.rxjava2;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.p;
import io.reactivex.w;
import nc.InterfaceC8487b;
import oc.C8691a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes10.dex */
final class CallEnqueueObservable<T> extends p<Response<T>> {
    private final Call<T> originalCall;

    private static final class CallCallback<T> implements InterfaceC8487b, Callback<T> {
        private final Call<?> call;
        private volatile boolean disposed;
        private final w<? super Response<T>> observer;
        boolean terminated = false;

        CallCallback(Call<?> call, w<? super Response<T>> wVar) {
            this.call = call;
            this.observer = wVar;
        }

        @Override // nc.InterfaceC8487b
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // nc.InterfaceC8487b
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<T> call, Throwable th2) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.observer.onError(th2);
            } catch (Throwable th3) {
                C2645f.c(th3);
                C3493a.f(new C8691a(th2, th3));
            }
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<T> call, Response<T> response) {
            if (this.disposed) {
                return;
            }
            try {
                this.observer.onNext(response);
                if (this.disposed) {
                    return;
                }
                this.terminated = true;
                this.observer.onComplete();
            } catch (Throwable th2) {
                C2645f.c(th2);
                if (this.terminated) {
                    C3493a.f(th2);
                    return;
                }
                if (this.disposed) {
                    return;
                }
                try {
                    this.observer.onError(th2);
                } catch (Throwable th3) {
                    C2645f.c(th3);
                    C3493a.f(new C8691a(th2, th3));
                }
            }
        }
    }

    CallEnqueueObservable(Call<T> call) {
        this.originalCall = call;
    }

    @Override // io.reactivex.p
    protected void subscribeActual(w<? super Response<T>> wVar) {
        Call<T> clone = this.originalCall.clone();
        CallCallback callCallback = new CallCallback(clone, wVar);
        wVar.onSubscribe(callCallback);
        if (callCallback.isDisposed()) {
            return;
        }
        clone.enqueue(callCallback);
    }
}
