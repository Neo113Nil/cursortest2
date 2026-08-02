package zendesk.core;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideExecutorFactory implements Gg.b {

    public static final class InstanceHolder {
        private static final ZendeskApplicationModule_ProvideExecutorFactory INSTANCE = new ZendeskApplicationModule_ProvideExecutorFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskApplicationModule_ProvideExecutorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ScheduledExecutorService provideExecutor() {
        return (ScheduledExecutorService) Gg.d.d(ZendeskApplicationModule.provideExecutor());
    }

    @Override // javax.inject.Provider
    public ScheduledExecutorService get() {
        return provideExecutor();
    }
}
