package com.vk.reefton.literx.observable;

import java.util.concurrent.atomic.AtomicReference;
import xsna.b8h0;
import xsna.er70;
import xsna.ign;
import xsna.iq70;

/* compiled from: ObservableSubscribeOn.kt */
/* loaded from: classes5.dex */
public final class ObservableSubscribeOn<T> extends iq70<T> {
    public final iq70<T> b;
    public final b8h0 c;

    /* compiled from: ObservableSubscribeOn.kt */
    public static final class SubscribeOnObserver<T> extends AtomicReference<ign> implements er70<T>, ign {
        private final er70<T> downstream;

        public SubscribeOnObserver(er70<T> er70Var) {
            this.downstream = er70Var;
        }

        @Override // xsna.er70
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

        @Override // xsna.er70
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // xsna.er70
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // xsna.er70
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }
    }

    /* compiled from: ObservableSubscribeOn.kt */
    public final class a implements Runnable {
        public final SubscribeOnObserver b;

        public a(SubscribeOnObserver subscribeOnObserver) {
            this.b = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ObservableSubscribeOn.this.b.d(this.b);
        }
    }

    public ObservableSubscribeOn(iq70<T> iq70Var, b8h0 b8h0Var) {
        this.b = iq70Var;
        this.c = b8h0Var;
    }

    @Override // xsna.iq70
    public final void d(er70<T> er70Var) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(er70Var);
        er70Var.a(subscribeOnObserver);
        subscribeOnObserver.set(this.c.b(new a(subscribeOnObserver)));
    }
}
