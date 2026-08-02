package org.chromium.base.supplier;

import java.util.function.Function;
import org.chromium.base.Callback;

/* loaded from: classes10.dex */
public class UnwrapObservableSupplier<P, T> implements ObservableSupplier<T> {
    private final ObservableSupplierImpl<T> mDelegateSupplier = new ObservableSupplierImpl<>();
    private final Callback<P> mOnParentSupplierChangeCallback = new Callback() { // from class: org.chromium.base.supplier.UnwrapObservableSupplier$$ExternalSyntheticLambda0
        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public final void lambda$bind$0(Object obj) {
            UnwrapObservableSupplier.this.onParentSupplierChange(obj);
        }
    };
    private final ObservableSupplier<P> mParentSupplier;
    private final Function<P, T> mUnwrapFunction;

    public UnwrapObservableSupplier(ObservableSupplier<P> parentSupplier, Function<P, T> unwrapFunction) {
        this.mParentSupplier = parentSupplier;
        this.mUnwrapFunction = unwrapFunction;
    }

    @Override // org.chromium.base.supplier.ObservableSupplier, java.util.function.Supplier
    public T get() {
        return (T) this.mUnwrapFunction.apply(this.mParentSupplier.get());
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public T addObserver(Callback<T> obs, int behavior) {
        if (!this.mDelegateSupplier.hasObservers()) {
            this.mParentSupplier.addSyncObserverAndCallIfNonNull(this.mOnParentSupplierChangeCallback);
        }
        return this.mDelegateSupplier.addObserver(obs, behavior);
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public void removeObserver(Callback<T> obs) {
        this.mDelegateSupplier.removeObserver(obs);
        if (this.mDelegateSupplier.hasObservers()) {
            return;
        }
        this.mParentSupplier.removeObserver(this.mOnParentSupplierChangeCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onParentSupplierChange(P p) {
        this.mDelegateSupplier.set(this.mUnwrapFunction.apply(p));
    }
}
