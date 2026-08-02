package io.sentry.util.runtime;

import io.sentry.util.runtime.IRuntimeManager;

/* loaded from: classes9.dex */
public final class NeutralRuntimeManager implements IRuntimeManager {
    @Override // io.sentry.util.runtime.IRuntimeManager
    public <T> T runWithRelaxedPolicy(IRuntimeManager.IRuntimeManagerCallback<T> iRuntimeManagerCallback) {
        return iRuntimeManagerCallback.run();
    }

    @Override // io.sentry.util.runtime.IRuntimeManager
    public void runWithRelaxedPolicy(Runnable runnable) {
        runnable.run();
    }
}
