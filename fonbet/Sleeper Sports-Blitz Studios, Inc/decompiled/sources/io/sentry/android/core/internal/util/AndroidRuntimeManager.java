package io.sentry.android.core.internal.util;

import android.os.StrictMode;
import io.sentry.util.runtime.IRuntimeManager;

/* loaded from: classes9.dex */
public final class AndroidRuntimeManager implements IRuntimeManager {
    @Override // io.sentry.util.runtime.IRuntimeManager
    public <T> T runWithRelaxedPolicy(IRuntimeManager.IRuntimeManagerCallback<T> iRuntimeManagerCallback) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            return iRuntimeManagerCallback.run();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // io.sentry.util.runtime.IRuntimeManager
    public void runWithRelaxedPolicy(final Runnable runnable) {
        runWithRelaxedPolicy(new IRuntimeManager.IRuntimeManagerCallback() { // from class: io.sentry.android.core.internal.util.AndroidRuntimeManager$$ExternalSyntheticLambda0
            @Override // io.sentry.util.runtime.IRuntimeManager.IRuntimeManagerCallback
            public final Object run() {
                return AndroidRuntimeManager.lambda$runWithRelaxedPolicy$0(runnable);
            }
        });
    }

    static /* synthetic */ Object lambda$runWithRelaxedPolicy$0(Runnable runnable) {
        runnable.run();
        return null;
    }
}
