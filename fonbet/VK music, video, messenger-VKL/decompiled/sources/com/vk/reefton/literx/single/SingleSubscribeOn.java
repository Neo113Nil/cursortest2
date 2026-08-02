package com.vk.reefton.literx.single;

import java.util.concurrent.atomic.AtomicReference;
import xsna.b8h0;
import xsna.dtj0;
import xsna.ign;
import xsna.juj0;
import xsna.xuj0;

/* compiled from: SingleSubscribeOn.kt */
/* loaded from: classes5.dex */
public final class SingleSubscribeOn<T> extends dtj0<T> {
    public final juj0 a;
    public final b8h0 b;

    /* compiled from: SingleSubscribeOn.kt */
    public static final class SubscribeOnObserver<T> extends AtomicReference<ign> implements xuj0<T>, ign {
        private final xuj0<T> downstream;

        public SubscribeOnObserver(xuj0<T> xuj0Var) {
            this.downstream = xuj0Var;
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
            this.downstream.onError(th);
        }

        @Override // xsna.xuj0
        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    /* compiled from: SingleSubscribeOn.kt */
    public final class a implements Runnable {
        public final SubscribeOnObserver b;

        public a(SubscribeOnObserver subscribeOnObserver) {
            this.b = subscribeOnObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SingleSubscribeOn.this.a.a(this.b);
        }
    }

    public SingleSubscribeOn(juj0 juj0Var, b8h0 b8h0Var) {
        this.a = juj0Var;
        this.b = b8h0Var;
    }

    @Override // xsna.dtj0
    public final void a(xuj0<T> xuj0Var) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(xuj0Var);
        xuj0Var.a(subscribeOnObserver);
        subscribeOnObserver.set(this.b.b(new a(subscribeOnObserver)));
    }
}
