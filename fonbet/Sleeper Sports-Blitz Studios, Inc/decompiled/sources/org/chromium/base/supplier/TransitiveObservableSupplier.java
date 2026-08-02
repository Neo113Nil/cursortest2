package org.chromium.base.supplier;

import java.util.function.Function;
import org.chromium.base.Callback;

/* loaded from: classes10.dex */
public class TransitiveObservableSupplier<P, T> implements ObservableSupplier<T> {
    private ObservableSupplier<T> mCurrentTargetSupplier;
    private final ObservableSupplierImpl<T> mDelegateSupplier = new ObservableSupplierImpl<>();
    private final Callback<P> mOnParentSupplierChangeCallback = new Callback() { // from class: org.chromium.base.supplier.TransitiveObservableSupplier$$ExternalSyntheticLambda0
        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public final void lambda$bind$0(Object obj) {
            TransitiveObservableSupplier.this.onParentSupplierChange(obj);
        }
    };
    private final Callback<T> mOnTargetSupplierChangeCallback = new Callback() { // from class: org.chromium.base.supplier.TransitiveObservableSupplier$$ExternalSyntheticLambda1
        @Override // org.chromium.base.Callback
        /* renamed from: onResult */
        public final void lambda$bind$0(Object obj) {
            TransitiveObservableSupplier.this.onTargetSupplierChange(obj);
        }
    };
    private final ObservableSupplier<P> mParentSupplier;
    private final Function<P, ObservableSupplier<T>> mUnwrapFunction;

    public TransitiveObservableSupplier(ObservableSupplier<P> parentSupplier, Function<P, ObservableSupplier<T>> unwrapFunction) {
        this.mParentSupplier = parentSupplier;
        this.mUnwrapFunction = unwrapFunction;
    }

    @Override // org.chromium.base.supplier.ObservableSupplier
    public T addObserver(Callback<T> obs, int behavior) {
        if (!this.mDelegateSupplier.hasObservers()) {
            onParentSupplierChange(this.mParentSupplier.addSyncObserver(this.mOnParentSupplierChangeCallback));
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
        ObservableSupplier<T> observableSupplier = this.mCurrentTargetSupplier;
        if (observableSupplier != null) {
            observableSupplier.removeObserver(this.mOnTargetSupplierChangeCallback);
            this.mCurrentTargetSupplier = null;
        }
    }

    @Override // org.chromium.base.supplier.ObservableSupplier, java.util.function.Supplier
    public T get() {
        ObservableSupplier<T> apply;
        if (this.mDelegateSupplier.hasObservers()) {
            return this.mDelegateSupplier.get();
        }
        P p = this.mParentSupplier.get();
        if (p == null || (apply = this.mUnwrapFunction.apply(p)) == null) {
            return null;
        }
        return apply.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onParentSupplierChange(P parentValue) {
        ObservableSupplier<T> observableSupplier = this.mCurrentTargetSupplier;
        if (observableSupplier != null) {
            observableSupplier.removeObserver(this.mOnTargetSupplierChangeCallback);
        }
        ObservableSupplier<T> apply = parentValue == null ? null : this.mUnwrapFunction.apply(parentValue);
        this.mCurrentTargetSupplier = apply;
        onTargetSupplierChange(apply != null ? apply.addSyncObserver(this.mOnTargetSupplierChangeCallback) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onTargetSupplierChange(T targetValue) {
        this.mDelegateSupplier.set(targetValue);
    }
}
