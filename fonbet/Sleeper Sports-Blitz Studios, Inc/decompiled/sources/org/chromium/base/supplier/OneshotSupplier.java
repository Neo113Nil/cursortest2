package org.chromium.base.supplier;

import java.util.function.Supplier;
import org.chromium.base.Callback;

/* loaded from: classes10.dex */
public interface OneshotSupplier<T> extends Supplier<T> {
    T onAvailable(Callback<T> callback);

    default void runSyncOrOnAvailable(Callback<T> callback) {
        T t = get();
        if (t != null) {
            callback.lambda$bind$0(t);
        } else {
            onAvailable(callback);
        }
    }
}
