package zendesk.core;

/* loaded from: classes5.dex */
public final class CoreModule_GetApplicationConfigurationFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetApplicationConfigurationFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetApplicationConfigurationFactory create(CoreModule coreModule) {
        return new CoreModule_GetApplicationConfigurationFactory(coreModule);
    }

    public static ApplicationConfiguration getApplicationConfiguration(CoreModule coreModule) {
        return (ApplicationConfiguration) Gg.d.d(coreModule.getApplicationConfiguration());
    }

    @Override // javax.inject.Provider
    public ApplicationConfiguration get() {
        return getApplicationConfiguration(this.module);
    }
}
