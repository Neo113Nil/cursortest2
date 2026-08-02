package com.ironsource.environment.workerthread;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class WorkerResult<T> {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Canceled<T> extends WorkerResult<T> {
        public Callable<T> callable;

        public Canceled(Callable<T> callable) {
            super(0);
            this.callable = callable;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Completed<T> extends WorkerResult<T> {
        public T data;

        public Completed(T t) {
            super(0);
            this.data = t;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Failed<T> extends WorkerResult<T> {
        public Callable<T> callable;
        public Exception exception;

        public Failed(Callable<T> callable, Exception exc) {
            super(0);
            this.callable = callable;
            this.exception = exc;
        }
    }

    public /* synthetic */ WorkerResult(int i) {
        this();
    }

    private WorkerResult() {
    }
}
