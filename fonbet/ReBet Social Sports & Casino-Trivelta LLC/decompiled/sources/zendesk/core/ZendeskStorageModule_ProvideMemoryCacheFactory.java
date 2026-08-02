package zendesk.core;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideMemoryCacheFactory implements Gg.b {

    public static final class InstanceHolder {
        private static final ZendeskStorageModule_ProvideMemoryCacheFactory INSTANCE = new ZendeskStorageModule_ProvideMemoryCacheFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskStorageModule_ProvideMemoryCacheFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MemoryCache provideMemoryCache() {
        return (MemoryCache) Gg.d.d(ZendeskStorageModule.provideMemoryCache());
    }

    @Override // javax.inject.Provider
    public MemoryCache get() {
        return provideMemoryCache();
    }
}
