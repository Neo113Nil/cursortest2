package zendesk.core;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CoreModule_GetExecutorFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetExecutorFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetExecutorFactory create(CoreModule coreModule) {
        return new CoreModule_GetExecutorFactory(coreModule);
    }

    public static Executor getExecutor(CoreModule coreModule) {
        return (Executor) Gg.d.d(coreModule.getExecutor());
    }

    @Override // javax.inject.Provider
    public Executor get() {
        return getExecutor(this.module);
    }
}
