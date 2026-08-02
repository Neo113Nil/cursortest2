package io.agora.rte.callback;

import io.agora.base.internal.CalledByNative;
import io.agora.rte.Error;

/* loaded from: classes3.dex */
public interface AsyncCallback {
    @CalledByNative
    void onResult(Error error);
}
