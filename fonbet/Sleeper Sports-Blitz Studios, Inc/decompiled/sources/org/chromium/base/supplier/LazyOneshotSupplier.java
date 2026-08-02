package org.chromium.base.supplier;

import java.util.function.Supplier;
import org.chromium.base.Callback;

/* loaded from: classes10.dex */
public interface LazyOneshotSupplier<T> {
    T get();

    boolean hasValue();

    void onAvailable(Callback<T> callback);

    static <T> LazyOneshotSupplier<T> fromValue(final T value) {
        return new LazyOneshotSupplierImpl<T>() { // from class: org.chromium.base.supplier.LazyOneshotSupplier.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.chromium.base.supplier.LazyOneshotSupplierImpl
            public void doSet() {
                set(value);
            }
        };
    }

    static <T> LazyOneshotSupplier<T> fromSupplier(final Supplier<T> supplier) {
        return new LazyOneshotSupplierImpl<T>() { // from class: org.chromium.base.supplier.LazyOneshotSupplier.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.chromium.base.supplier.LazyOneshotSupplierImpl
            public void doSet() {
                set(supplier.get());
            }
        };
    }
}
