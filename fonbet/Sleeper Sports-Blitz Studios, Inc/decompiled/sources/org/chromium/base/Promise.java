package org.chromium.base;

import android.os.Handler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import org.chromium.base.Promise;

/* loaded from: classes10.dex */
public class Promise<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Exception mRejectReason;
    private T mResult;
    private boolean mThrowingRejectionHandler;
    private int mState = 0;
    private final List<Callback<T>> mFulfillCallbacks = new ArrayList();
    private final List<Callback<Exception>> mRejectCallbacks = new ArrayList();
    private final Thread mThread = Thread.currentThread();
    private final Handler mHandler = new Handler();

    public interface AsyncFunction<A, RT> extends Function<A, Promise<RT>> {
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface PromiseState {
        public static final int FULFILLED = 1;
        public static final int REJECTED = 2;
        public static final int UNFULFILLED = 0;
    }

    private void checkThread() {
    }

    public static class UnhandledRejectionException extends RuntimeException {
        public UnhandledRejectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public void then(Callback<T> onFulfill) {
        checkThread();
        if (this.mThrowingRejectionHandler) {
            thenInner(onFulfill);
        } else {
            then(onFulfill, new Callback() { // from class: org.chromium.base.Promise$$ExternalSyntheticLambda4
                @Override // org.chromium.base.Callback
                /* renamed from: onResult */
                public final void lambda$bind$0(Object obj) {
                    Promise.lambda$then$0((Exception) obj);
                }
            });
            this.mThrowingRejectionHandler = true;
        }
    }

    static /* synthetic */ void lambda$then$0(Exception exc) {
        throw new UnhandledRejectionException("Promise was rejected without a rejection handler.", exc);
    }

    public void then(Callback<T> onFulfill, Callback<Exception> onReject) {
        checkThread();
        thenInner(onFulfill);
        exceptInner(onReject);
    }

    public void except(Callback<Exception> onReject) {
        checkThread();
        exceptInner(onReject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void thenInner(Callback<T> onFulfill) {
        int i = this.mState;
        if (i == 1) {
            postCallbackToLooper(onFulfill, this.mResult);
        } else if (i == 0) {
            this.mFulfillCallbacks.add(onFulfill);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void exceptInner(Callback<Exception> onReject) {
        int i = this.mState;
        if (i == 2) {
            postCallbackToLooper(onReject, this.mRejectReason);
        } else if (i == 0) {
            this.mRejectCallbacks.add(onReject);
        }
    }

    public <RT> Promise<RT> then(final Function<T, RT> function) {
        checkThread();
        final Promise<RT> promise = new Promise<>();
        thenInner(new Callback() { // from class: org.chromium.base.Promise$$ExternalSyntheticLambda2
            @Override // org.chromium.base.Callback
            /* renamed from: onResult */
            public final void lambda$bind$0(Object obj) {
                Promise.lambda$then$1(Promise.this, function, obj);
            }
        });
        exceptInner(new Promise$$ExternalSyntheticLambda1(promise));
        return promise;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void lambda$then$1(Promise promise, Function function, Object obj) {
        try {
            promise.fulfill(function.apply(obj));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    public <RT> Promise<RT> then(final AsyncFunction<T, RT> function) {
        checkThread();
        final Promise<RT> promise = new Promise<>();
        thenInner(new Callback() { // from class: org.chromium.base.Promise$$ExternalSyntheticLambda3
            @Override // org.chromium.base.Callback
            /* renamed from: onResult */
            public final void lambda$bind$0(Object obj) {
                Promise.lambda$then$2(Promise.AsyncFunction.this, promise, obj);
            }
        });
        exceptInner(new Promise$$ExternalSyntheticLambda1(promise));
        return promise;
    }

    static /* synthetic */ void lambda$then$2(AsyncFunction asyncFunction, final Promise promise, Object obj) {
        try {
            Promise apply = asyncFunction.apply(obj);
            Objects.requireNonNull(promise);
            Callback<T> callback = new Callback() { // from class: org.chromium.base.Promise$$ExternalSyntheticLambda0
                @Override // org.chromium.base.Callback
                /* renamed from: onResult */
                public final void lambda$bind$0(Object obj2) {
                    Promise.this.fulfill(obj2);
                }
            };
            Objects.requireNonNull(promise);
            apply.then(callback, new Promise$$ExternalSyntheticLambda1(promise));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    public Promise<T> andFinally(final Runnable runnable) {
        Callback<T> callback = new Callback() { // from class: org.chromium.base.Promise$$ExternalSyntheticLambda5
            @Override // org.chromium.base.Callback
            /* renamed from: onResult */
            public final void lambda$bind$0(Object obj) {
                runnable.run();
            }
        };
        thenInner(callback);
        exceptInner(callback);
        return this;
    }

    public void fulfill(T t) {
        checkThread();
        this.mState = 1;
        this.mResult = t;
        Iterator<Callback<T>> it = this.mFulfillCallbacks.iterator();
        while (it.hasNext()) {
            postCallbackToLooper(it.next(), t);
        }
        this.mFulfillCallbacks.clear();
    }

    public void reject(final Exception reason) {
        checkThread();
        this.mState = 2;
        this.mRejectReason = reason;
        Iterator<Callback<Exception>> it = this.mRejectCallbacks.iterator();
        while (it.hasNext()) {
            postCallbackToLooper((Callback) it.next(), reason);
        }
        this.mRejectCallbacks.clear();
    }

    public void reject() {
        reject(null);
    }

    public boolean isFulfilled() {
        checkThread();
        return this.mState == 1;
    }

    public boolean isRejected() {
        checkThread();
        return this.mState == 2;
    }

    public boolean isPending() {
        checkThread();
        return this.mState == 0;
    }

    public T getResult() {
        return this.mResult;
    }

    public static <T> Promise<T> fulfilled(T result) {
        Promise<T> promise = new Promise<>();
        promise.fulfill(result);
        return promise;
    }

    public static <T> Promise<T> rejected() {
        Promise<T> promise = new Promise<>();
        promise.reject();
        return promise;
    }

    private <S> void postCallbackToLooper(final Callback<S> callback, S result) {
        this.mHandler.post(callback.bind(result));
    }
}
