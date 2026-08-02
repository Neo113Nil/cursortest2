package retrofit2.adapter.rxjava2;

import Bl0.C2645f;
import Kc.C3493a;
import io.reactivex.p;
import io.reactivex.w;
import nc.InterfaceC8487b;
import oc.C8691a;
import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes6.dex */
final class CallExecuteObservable<T> extends p<Response<T>> {
    private final Call<T> originalCall;

    private static final class CallDisposable implements InterfaceC8487b {
        private final Call<?> call;
        private volatile boolean disposed;

        CallDisposable(Call<?> call) {
            this.call = call;
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
    }

    CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }

    @Override // io.reactivex.p
    protected void subscribeActual(w<? super Response<T>> wVar) {
        Call<T> clone = this.originalCall.clone();
        CallDisposable callDisposable = new CallDisposable(clone);
        wVar.onSubscribe(callDisposable);
        if (callDisposable.isDisposed()) {
            return;
        }
        boolean z11 = false;
        try {
            Response<T> execute = clone.execute();
            if (!callDisposable.isDisposed()) {
                wVar.onNext(execute);
            }
            if (callDisposable.isDisposed()) {
                return;
            }
            try {
                wVar.onComplete();
            } catch (Throwable th2) {
                th = th2;
                z11 = true;
                C2645f.c(th);
                if (z11) {
                    C3493a.f(th);
                    return;
                }
                if (callDisposable.isDisposed()) {
                    return;
                }
                try {
                    wVar.onError(th);
                } catch (Throwable th3) {
                    C2645f.c(th3);
                    C3493a.f(new C8691a(th, th3));
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
