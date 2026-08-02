package org.chromium.base.supplier;

import java.util.function.Supplier;
import org.chromium.base.Callback;

/* loaded from: classes10.dex */
public interface ObservableSupplier<E> extends Supplier<E> {

    public @interface NotifyBehavior {
        public static final int NONE = 0;
        public static final int NOTIFY_ON_ADD = 1;
        public static final int POST_ON_ADD = 2;
    }

    E addObserver(Callback<E> obs, int behavior);

    @Override // java.util.function.Supplier
    E get();

    void removeObserver(Callback<E> obs);

    default E addSyncObserver(Callback<E> obs) {
        return addObserver(obs, 0);
    }

    default E addSyncObserverAndCallIfNonNull(Callback<E> obs) {
        return addObserver(obs, 1);
    }

    default E addSyncObserverAndPostIfNonNull(Callback<E> obs) {
        return addObserver(obs, 3);
    }

    default E addObserver(Callback<E> obs) {
        return addSyncObserverAndPostIfNonNull(obs);
    }
}
