package zendesk.core;

/* loaded from: classes5.dex */
public final class CoreModule_GetBlipsProviderFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetBlipsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetBlipsProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetBlipsProviderFactory(coreModule);
    }

    public static BlipsProvider getBlipsProvider(CoreModule coreModule) {
        return (BlipsProvider) Gg.d.d(coreModule.getBlipsProvider());
    }

    @Override // javax.inject.Provider
    public BlipsProvider get() {
        return getBlipsProvider(this.module);
    }
}
