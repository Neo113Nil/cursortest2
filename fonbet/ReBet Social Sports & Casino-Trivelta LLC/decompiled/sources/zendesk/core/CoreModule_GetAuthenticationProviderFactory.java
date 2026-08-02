package zendesk.core;

/* loaded from: classes5.dex */
public final class CoreModule_GetAuthenticationProviderFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetAuthenticationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetAuthenticationProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetAuthenticationProviderFactory(coreModule);
    }

    public static AuthenticationProvider getAuthenticationProvider(CoreModule coreModule) {
        return (AuthenticationProvider) Gg.d.d(coreModule.getAuthenticationProvider());
    }

    @Override // javax.inject.Provider
    public AuthenticationProvider get() {
        return getAuthenticationProvider(this.module);
    }
}
