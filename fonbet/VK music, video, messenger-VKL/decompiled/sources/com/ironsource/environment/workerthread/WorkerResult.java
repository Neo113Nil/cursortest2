package com.ironsource.environment.workerthread;

import java.util.concurrent.Callable;

/* loaded from: classes13.dex */
public abstract class WorkerResult<T> {

    public static final class Canceled<T> extends WorkerResult<T> {
        public Callable<T> callable;

        public Canceled(Callable<T> callable) {
            super(0);
            this.callable = callable;
        }
    }

    public static final class Completed<T> extends WorkerResult<T> {
        public T data;

        public Completed(T t) {
            super(0);
            this.data = t;
        }
    }

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
