package io.sentry;

/* loaded from: classes9.dex */
public interface IScopesStorage {
    void close();

    IScopes get();

    void init();

    ISentryLifecycleToken set(IScopes iScopes);
}
