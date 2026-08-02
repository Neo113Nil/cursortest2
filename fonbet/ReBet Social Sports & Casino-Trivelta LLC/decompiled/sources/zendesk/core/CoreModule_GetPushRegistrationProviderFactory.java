package zendesk.core;

/* loaded from: classes5.dex */
public final class CoreModule_GetPushRegistrationProviderFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetPushRegistrationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetPushRegistrationProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetPushRegistrationProviderFactory(coreModule);
    }

    public static PushRegistrationProvider getPushRegistrationProvider(CoreModule coreModule) {
        return (PushRegistrationProvider) Gg.d.d(coreModule.getPushRegistrationProvider());
    }

    @Override // javax.inject.Provider
    public PushRegistrationProvider get() {
        return getPushRegistrationProvider(this.module);
    }
}
