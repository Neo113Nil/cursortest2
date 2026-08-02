package org.chromium.base.supplier;

import java.util.function.Supplier;
import org.chromium.base.Callback;

/* loaded from: classes10.dex */
public interface SyncOneshotSupplier<T> extends Supplier<T> {
    T onAvailable(Callback<T> callback);
}
