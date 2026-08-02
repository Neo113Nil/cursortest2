package org.chromium.base.supplier;

import java.lang.ref.WeakReference;
import org.chromium.base.Callback;

/* loaded from: classes10.dex */
public class OneShotCallback<E> {
    private final Callback<E> mCallback;
    private final Callback<E> mCallbackWrapper;
    private final WeakReference<ObservableSupplier<E>> mWeakSupplier;

    public OneShotCallback(ObservableSupplier<E> supplier, Callback<E> callback) {
        CallbackWrapper callbackWrapper = new CallbackWrapper();
        this.mCallbackWrapper = callbackWrapper;
        this.mWeakSupplier = new WeakReference<>(supplier);
        this.mCallback = callback;
        supplier.addObserver(callbackWrapper);
    }

    private class CallbackWrapper implements Callback<E> {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        private CallbackWrapper() {
        }

        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public void lambda$bind$0(E result) {
            OneShotCallback.this.mCallback.lambda$bind$0(result);
            ((ObservableSupplier) OneShotCallback.this.mWeakSupplier.get()).removeObserver(OneShotCallback.this.mCallbackWrapper);
        }
    }
}
