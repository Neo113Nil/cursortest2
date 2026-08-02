package zendesk.core;

/* loaded from: classes5.dex */
public final class CoreModule_GetRestServiceProviderFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetRestServiceProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetRestServiceProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetRestServiceProviderFactory(coreModule);
    }

    public static RestServiceProvider getRestServiceProvider(CoreModule coreModule) {
        return (RestServiceProvider) Gg.d.d(coreModule.getRestServiceProvider());
    }

    @Override // javax.inject.Provider
    public RestServiceProvider get() {
        return getRestServiceProvider(this.module);
    }
}
