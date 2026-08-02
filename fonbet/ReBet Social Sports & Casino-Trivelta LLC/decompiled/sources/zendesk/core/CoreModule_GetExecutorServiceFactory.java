package zendesk.core;

import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class CoreModule_GetExecutorServiceFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetExecutorServiceFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetExecutorServiceFactory create(CoreModule coreModule) {
        return new CoreModule_GetExecutorServiceFactory(coreModule);
    }

    public static ExecutorService getExecutorService(CoreModule coreModule) {
        return (ExecutorService) Gg.d.d(coreModule.getExecutorService());
    }

    @Override // javax.inject.Provider
    public ExecutorService get() {
        return getExecutorService(this.module);
    }
}
