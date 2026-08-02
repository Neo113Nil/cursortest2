package zendesk.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideExecutorServiceFactory implements Gg.b {
    private final Provider<ScheduledExecutorService> scheduledExecutorServiceProvider;

    public ZendeskApplicationModule_ProvideExecutorServiceFactory(Provider<ScheduledExecutorService> provider) {
        this.scheduledExecutorServiceProvider = provider;
    }

    public static ZendeskApplicationModule_ProvideExecutorServiceFactory create(Provider<ScheduledExecutorService> provider) {
        return new ZendeskApplicationModule_ProvideExecutorServiceFactory(provider);
    }

    public static ExecutorService provideExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return (ExecutorService) Gg.d.d(ZendeskApplicationModule.provideExecutorService(scheduledExecutorService));
    }

    @Override // javax.inject.Provider
    public ExecutorService get() {
        return provideExecutorService(this.scheduledExecutorServiceProvider.get());
    }
}
