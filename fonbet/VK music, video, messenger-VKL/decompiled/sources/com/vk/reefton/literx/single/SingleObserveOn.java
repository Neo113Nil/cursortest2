package com.vk.reefton.literx.single;

import java.util.concurrent.atomic.AtomicReference;
import xsna.b8h0;
import xsna.dtj0;
import xsna.ign;
import xsna.puj0;
import xsna.xuj0;

/* compiled from: SingleObserveOn.kt */
/* loaded from: classes5.dex */
public final class SingleObserveOn<T> extends dtj0<T> {
    public final puj0 a;
    public final b8h0 b;

    /* compiled from: SingleObserveOn.kt */
    public static final class ObserveOnObserver<T> extends AtomicReference<ign> implements xuj0<T>, ign, Runnable {
        private final xuj0<T> downstream;
        private Throwable error;
        private final b8h0 scheduler;
        private T successValue;

        public ObserveOnObserver(xuj0<T> xuj0Var, b8h0 b8h0Var) {
            this.downstream = xuj0Var;
            this.scheduler = b8h0Var;
        }

        @Override // xsna.xuj0
        public final void a(ign ignVar) {
            set(ignVar);
        }

        @Override // xsna.ign
        public final void dispose() {
            get().dispose();
        }

        @Override // xsna.ign
        public final boolean h() {
            return get().h();
        }

        @Override // xsna.xuj0
        public final void onError(Throwable th) {
            this.error = th;
            this.scheduler.b(this);
        }

        @Override // xsna.xuj0
        public final void onSuccess(T t) {
            this.successValue = t;
            this.scheduler.b(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
                return;
            }
            T t = this.successValue;
            if (t != null) {
                this.downstream.onSuccess(t);
            }
        }
    }

    public SingleObserveOn(puj0 puj0Var, b8h0 b8h0Var) {
        this.a = puj0Var;
        this.b = b8h0Var;
    }

    @Override // xsna.dtj0
    public final void a(xuj0<T> xuj0Var) {
        ObserveOnObserver observeOnObserver = new ObserveOnObserver(xuj0Var, this.b);
        this.a.a(observeOnObserver);
        xuj0Var.a(observeOnObserver);
    }
}
