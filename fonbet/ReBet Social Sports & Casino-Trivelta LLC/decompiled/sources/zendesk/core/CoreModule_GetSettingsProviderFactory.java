package zendesk.core;

/* loaded from: classes5.dex */
public final class CoreModule_GetSettingsProviderFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetSettingsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetSettingsProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetSettingsProviderFactory(coreModule);
    }

    public static SettingsProvider getSettingsProvider(CoreModule coreModule) {
        return (SettingsProvider) Gg.d.d(coreModule.getSettingsProvider());
    }

    @Override // javax.inject.Provider
    public SettingsProvider get() {
        return getSettingsProvider(this.module);
    }
}
