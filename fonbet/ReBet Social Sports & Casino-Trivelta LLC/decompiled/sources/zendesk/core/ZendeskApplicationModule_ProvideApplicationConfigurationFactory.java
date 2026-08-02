package zendesk.core;

/* loaded from: classes5.dex */
public final class ZendeskApplicationModule_ProvideApplicationConfigurationFactory implements Gg.b {
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideApplicationConfigurationFactory(ZendeskApplicationModule zendeskApplicationModule) {
        this.module = zendeskApplicationModule;
    }

    public static ZendeskApplicationModule_ProvideApplicationConfigurationFactory create(ZendeskApplicationModule zendeskApplicationModule) {
        return new ZendeskApplicationModule_ProvideApplicationConfigurationFactory(zendeskApplicationModule);
    }

    public static ApplicationConfiguration provideApplicationConfiguration(ZendeskApplicationModule zendeskApplicationModule) {
        return (ApplicationConfiguration) Gg.d.d(zendeskApplicationModule.provideApplicationConfiguration());
    }

    @Override // javax.inject.Provider
    public ApplicationConfiguration get() {
        return provideApplicationConfiguration(this.module);
    }
}
