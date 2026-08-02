package zendesk.core;

import java.io.File;
import javax.inject.Provider;
import okhttp3.Cache;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideSessionStorageFactory implements Gg.b {
    private final Provider<BaseStorage> additionalSdkStorageProvider;
    private final Provider<File> belvedereDirProvider;
    private final Provider<File> cacheDirProvider;
    private final Provider<Cache> cacheProvider;
    private final Provider<File> dataDirProvider;
    private final Provider<IdentityStorage> identityStorageProvider;
    private final Provider<BaseStorage> mediaCacheProvider;

    public ZendeskStorageModule_ProvideSessionStorageFactory(Provider<IdentityStorage> provider, Provider<BaseStorage> provider2, Provider<BaseStorage> provider3, Provider<Cache> provider4, Provider<File> provider5, Provider<File> provider6, Provider<File> provider7) {
        this.identityStorageProvider = provider;
        this.additionalSdkStorageProvider = provider2;
        this.mediaCacheProvider = provider3;
        this.cacheProvider = provider4;
        this.cacheDirProvider = provider5;
        this.dataDirProvider = provider6;
        this.belvedereDirProvider = provider7;
    }

    public static ZendeskStorageModule_ProvideSessionStorageFactory create(Provider<IdentityStorage> provider, Provider<BaseStorage> provider2, Provider<BaseStorage> provider3, Provider<Cache> provider4, Provider<File> provider5, Provider<File> provider6, Provider<File> provider7) {
        return new ZendeskStorageModule_ProvideSessionStorageFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static SessionStorage provideSessionStorage(Object obj, BaseStorage baseStorage, BaseStorage baseStorage2, Cache cache, File file, File file2, File file3) {
        return (SessionStorage) Gg.d.d(ZendeskStorageModule.provideSessionStorage((IdentityStorage) obj, baseStorage, baseStorage2, cache, file, file2, file3));
    }

    @Override // javax.inject.Provider
    public SessionStorage get() {
        return provideSessionStorage(this.identityStorageProvider.get(), this.additionalSdkStorageProvider.get(), this.mediaCacheProvider.get(), this.cacheProvider.get(), this.cacheDirProvider.get(), this.dataDirProvider.get(), this.belvedereDirProvider.get());
    }
}
