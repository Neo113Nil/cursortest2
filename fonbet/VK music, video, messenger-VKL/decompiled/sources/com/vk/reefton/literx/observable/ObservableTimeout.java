package com.vk.reefton.literx.observable;

import java.util.concurrent.TimeUnit;
import xsna.b8h0;
import xsna.er70;
import xsna.ign;
import xsna.iq70;

/* compiled from: ObservableTimeout.kt */
/* loaded from: classes5.dex */
public final class ObservableTimeout<T> extends iq70<T> {
    public final ObservableObserveOn b;
    public final long c;
    public final TimeUnit d;
    public final b8h0 e;

    /* compiled from: ObservableTimeout.kt */
    public static final class TimeoutObserver<T> extends BaseObserver<T> implements Runnable {
        private ign scheduledDisposable;
        private final b8h0 scheduler;
        private final TimeUnit timeUnit;
        private final long timeout;

        public TimeoutObserver(er70<T> er70Var, long j, TimeUnit timeUnit, b8h0 b8h0Var) {
            super(er70Var);
            this.timeout = j;
            this.timeUnit = timeUnit;
            this.scheduler = b8h0Var;
        }

        public final void g() {
            ign ignVar = this.scheduledDisposable;
            if (ignVar != null) {
                ignVar.dispose();
            }
            this.scheduledDisposable = this.scheduler.a(this, this.timeout, this.timeUnit);
        }

        @Override // com.vk.reefton.literx.observable.BaseObserver, xsna.er70
        public final void onComplete() {
            ign ignVar = this.scheduledDisposable;
            if (ignVar != null) {
                ignVar.dispose();
            }
            super.onComplete();
        }

        @Override // com.vk.reefton.literx.observable.BaseObserver, xsna.er70
        public final void onError(Throwable th) {
            ign ignVar = this.scheduledDisposable;
            if (ignVar != null) {
                ignVar.dispose();
            }
            super.onError(th);
        }

        @Override // xsna.er70
        public final void onNext(T t) {
            ign ignVar = this.scheduledDisposable;
            if (ignVar != null) {
                ignVar.dispose();
            }
            d().onNext(t);
        }

        @Override // java.lang.Runnable
        public final void run() {
            onError(new Exception("Timeout Exception"));
        }
    }

    public ObservableTimeout(ObservableObserveOn observableObserveOn, long j, b8h0 b8h0Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.b = observableObserveOn;
        this.c = j;
        this.d = timeUnit;
        this.e = b8h0Var;
    }

    @Override // xsna.iq70
    public final void d(er70<T> er70Var) {
        TimeoutObserver timeoutObserver = new TimeoutObserver(er70Var, this.c, this.d, this.e);
        this.b.d(timeoutObserver);
        er70Var.a(timeoutObserver);
        timeoutObserver.g();
    }
}
