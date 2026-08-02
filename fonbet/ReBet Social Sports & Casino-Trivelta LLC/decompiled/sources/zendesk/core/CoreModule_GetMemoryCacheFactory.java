package zendesk.core;

/* loaded from: classes5.dex */
public final class CoreModule_GetMemoryCacheFactory implements Gg.b {
    private final CoreModule module;

    public CoreModule_GetMemoryCacheFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetMemoryCacheFactory create(CoreModule coreModule) {
        return new CoreModule_GetMemoryCacheFactory(coreModule);
    }

    public static MemoryCache getMemoryCache(CoreModule coreModule) {
        return (MemoryCache) Gg.d.d(coreModule.getMemoryCache());
    }

    @Override // javax.inject.Provider
    public MemoryCache get() {
        return getMemoryCache(this.module);
    }
}
