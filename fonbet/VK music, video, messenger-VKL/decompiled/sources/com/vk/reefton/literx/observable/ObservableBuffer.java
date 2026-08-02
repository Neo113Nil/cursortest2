package com.vk.reefton.literx.observable;

import com.vk.reefton.literx.DisposableContainer;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.b8h0;
import xsna.b8h0.a;
import xsna.er70;
import xsna.ign;
import xsna.iq70;
import xsna.jfv0;
import xsna.s3q0;
import xsna.z1v;

/* compiled from: ObservableBuffer.kt */
/* loaded from: classes5.dex */
public final class ObservableBuffer<T, U extends List<? extends T>> extends iq70<U> {
    public final ObservableObserveOn b;
    public final long c;
    public final TimeUnit d;
    public final b8h0 e;
    public final int f;

    /* compiled from: ObservableBuffer.kt */
    public static final class BufferObserver<T, U extends List<? extends T>> extends AtomicBoolean implements er70<T>, ign, Runnable {
        private ArrayList<T> buffer = new ArrayList<>();
        private boolean done;
        private final er70<U> downstream;
        private final int maxSize;
        private final b8h0 scheduler;
        private ign schedulerDisposable;
        private final TimeUnit timeUnit;
        private final long timespan;
        private ign upstream;

        public BufferObserver(er70<U> er70Var, long j, TimeUnit timeUnit, b8h0 b8h0Var, int i) {
            this.downstream = er70Var;
            this.timespan = j;
            this.timeUnit = timeUnit;
            this.scheduler = b8h0Var;
            this.maxSize = i;
        }

        @Override // xsna.er70
        public final void a(ign ignVar) {
            this.upstream = ignVar;
            b8h0 b8h0Var = this.scheduler;
            long j = this.timespan;
            TimeUnit timeUnit = this.timeUnit;
            b8h0Var.getClass();
            DisposableContainer disposableContainer = new DisposableContainer();
            disposableContainer.set(b8h0Var.a(b8h0Var.new a(this, disposableContainer, j, timeUnit), j, timeUnit));
            this.schedulerDisposable = disposableContainer;
        }

        public final void d() {
            synchronized (this.buffer) {
                if (this.buffer.isEmpty()) {
                    return;
                }
                ArrayList<T> arrayList = this.buffer;
                this.buffer = new ArrayList<>();
                s3q0 s3q0Var = s3q0.a;
                this.downstream.onNext(arrayList);
            }
        }

        @Override // xsna.ign
        public final void dispose() {
            if (get()) {
                return;
            }
            ign ignVar = this.schedulerDisposable;
            if (ignVar != null) {
                ignVar.dispose();
            }
            this.buffer = new ArrayList<>();
            set(true);
        }

        @Override // xsna.ign
        public final boolean h() {
            return get();
        }

        @Override // xsna.er70
        public final void onComplete() {
            if (this.done || get()) {
                return;
            }
            ign ignVar = this.schedulerDisposable;
            if (ignVar != null) {
                ignVar.dispose();
            }
            d();
            this.downstream.onComplete();
            this.buffer = new ArrayList<>();
            this.done = true;
        }

        @Override // xsna.er70
        public final void onError(Throwable th) {
            if (!this.done && !get()) {
                ign ignVar = this.schedulerDisposable;
                if (ignVar != null) {
                    ignVar.dispose();
                }
                this.downstream.onError(th);
                this.buffer = new ArrayList<>();
                this.done = true;
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
            if (get() || this.done) {
                return;
            }
            synchronized (this.buffer) {
                this.buffer.add(t);
            }
            if (this.buffer.size() >= this.maxSize) {
                d();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            d();
        }
    }

    public ObservableBuffer(ObservableObserveOn observableObserveOn, long j, b8h0 b8h0Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.b = observableObserveOn;
        this.c = j;
        this.d = timeUnit;
        this.e = b8h0Var;
        this.f = i;
    }

    @Override // xsna.iq70
    public final void d(er70<U> er70Var) {
        BufferObserver bufferObserver = new BufferObserver(er70Var, this.c, this.d, this.e, this.f);
        this.b.d(bufferObserver);
        er70Var.a(bufferObserver);
    }
}
