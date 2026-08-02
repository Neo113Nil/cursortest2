package zendesk.core;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class CoreModule_GetScheduledExecutorServiceFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetScheduledExecutorServiceFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetScheduledExecutorServiceFactory create(CoreModule coreModule) {
        return new CoreModule_GetScheduledExecutorServiceFactory(coreModule);
    }

    public static ScheduledExecutorService getScheduledExecutorService(CoreModule coreModule) {
        return (ScheduledExecutorService) Gg.d.d(coreModule.getScheduledExecutorService());
    }

    @Override // javax.inject.Provider
    public ScheduledExecutorService get() {
        return getScheduledExecutorService(this.module);
    }
}
