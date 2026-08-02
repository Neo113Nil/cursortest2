package com.vk.reefton.literx.observable;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xsna.er70;
import xsna.ign;
import xsna.iq70;
import xsna.jfv0;
import xsna.z1v;

/* compiled from: ObservableTake.kt */
/* loaded from: classes5.dex */
public final class ObservableTake<T> extends iq70<T> {
    public final ObservableCreate b;
    public final long c;

    /* compiled from: ObservableTake.kt */
    public static final class TakeObserver<T> extends AtomicReference<ign> implements er70<T>, ign {
        private boolean done;
        private final er70<T> downstream;
        private AtomicLong remain;

        public TakeObserver(er70<T> er70Var, long j) {
            this.downstream = er70Var;
            this.remain = new AtomicLong(j);
        }

        @Override // xsna.er70
        public final void a(ign ignVar) {
            if (this.remain.get() != 0) {
                getAndSet(ignVar);
                return;
            }
            this.done = true;
            ignVar.dispose();
            this.downstream.onComplete();
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
            if (this.done) {
                return;
            }
            this.done = true;
            ign ignVar = get();
            if (ignVar != null) {
                ignVar.dispose();
            }
            this.downstream.onComplete();
        }

        @Override // xsna.er70
        public final void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                ign ignVar = get();
                if (ignVar != null) {
                    ignVar.dispose();
                }
                this.downstream.onError(th);
                return;
            }
            jfv0.b bVar = z1v.a;
            if (bVar != null) {
                bVar.invoke(th);
                return;
            }
            th.printStackTrace();
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(currentThread, th);
            }
        }

        @Override // xsna.er70
        public final void onNext(T t) {
            if (this.done || this.remain.getAndDecrement() <= 0) {
                return;
            }
            this.downstream.onNext(t);
            if (this.remain.get() == 0) {
                this.done = true;
                ign ignVar = get();
                if (ignVar != null) {
                    ignVar.dispose();
                }
                this.downstream.onComplete();
            }
        }
    }

    public ObservableTake(ObservableCreate observableCreate, long j) {
        this.b = observableCreate;
        this.c = j;
    }

    @Override // xsna.iq70
    public final void d(er70<T> er70Var) {
        TakeObserver takeObserver = new TakeObserver(er70Var, this.c);
        this.b.d(takeObserver);
        er70Var.a(takeObserver);
    }
}
