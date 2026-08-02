package io.sentry.util.runtime;

/* loaded from: classes9.dex */
public interface IRuntimeManager {

    public interface IRuntimeManagerCallback<T> {
        T run();
    }

    <T> T runWithRelaxedPolicy(IRuntimeManagerCallback<T> iRuntimeManagerCallback);

    void runWithRelaxedPolicy(Runnable runnable);
}
