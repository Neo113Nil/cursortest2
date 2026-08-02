package org.chromium.base;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class CallbackController {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ArrayList<WeakReference<Cancelable>> mCancelables = new ArrayList<>();

    private interface Cancelable {
        void cancel();
    }

    private void checkNotCanceled() {
    }

    private class CancelableCallback<T> implements Cancelable, Callback<T> {
        private Callback<T> mCallback;

        private CancelableCallback(Callback<T> callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.base.CallbackController.Cancelable
        public void cancel() {
            this.mCallback = null;
        }

        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public void lambda$bind$0(T result) {
            synchronized (CallbackController.this) {
                Callback<T> callback = this.mCallback;
                if (callback != null) {
                    callback.lambda$bind$0(result);
                }
            }
        }
    }

    private class CancelableRunnable implements Cancelable, Runnable {
        private Runnable mRunnable;

        private CancelableRunnable(Runnable runnable) {
            this.mRunnable = runnable;
        }

        @Override // org.chromium.base.CallbackController.Cancelable
        public void cancel() {
            this.mRunnable = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (CallbackController.this) {
                Runnable runnable = this.mRunnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public synchronized <T> Callback<T> makeCancelable(Callback<T> callback) {
        CancelableCallback cancelableCallback;
        checkNotCanceled();
        cancelableCallback = new CancelableCallback(callback);
        addInternal(cancelableCallback);
        return cancelableCallback;
    }

    public synchronized Runnable makeCancelable(Runnable runnable) {
        CancelableRunnable cancelableRunnable;
        checkNotCanceled();
        cancelableRunnable = new CancelableRunnable(runnable);
        addInternal(cancelableRunnable);
        return cancelableRunnable;
    }

    private void addInternal(Cancelable cancelable) {
        ArrayList<WeakReference<Cancelable>> arrayList = this.mCancelables;
        arrayList.add(new WeakReference<>(cancelable));
        if (arrayList.size() % 1024 == 0) {
            CollectionUtil.strengthen(arrayList);
        }
    }

    public synchronized void destroy() {
        checkNotCanceled();
        Iterator it = CollectionUtil.strengthen(this.mCancelables).iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        this.mCancelables = null;
    }
}
