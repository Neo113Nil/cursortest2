package zendesk.core;

/* loaded from: classes5.dex */
public final class CoreModule_GetNetworkInfoProviderFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetNetworkInfoProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetNetworkInfoProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetNetworkInfoProviderFactory(coreModule);
    }

    public static NetworkInfoProvider getNetworkInfoProvider(CoreModule coreModule) {
        return (NetworkInfoProvider) Gg.d.d(coreModule.getNetworkInfoProvider());
    }

    @Override // javax.inject.Provider
    public NetworkInfoProvider get() {
        return getNetworkInfoProvider(this.module);
    }
}
