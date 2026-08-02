package zendesk.core;

import java.io.File;
import javax.inject.Provider;
import okhttp3.Cache;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideCacheFactory implements Gg.b {
    private final Provider<File> fileProvider;

    public ZendeskStorageModule_ProvideCacheFactory(Provider<File> provider) {
        this.fileProvider = provider;
    }

    public static ZendeskStorageModule_ProvideCacheFactory create(Provider<File> provider) {
        return new ZendeskStorageModule_ProvideCacheFactory(provider);
    }

    public static Cache provideCache(File file) {
        return (Cache) Gg.d.d(ZendeskStorageModule.provideCache(file));
    }

    @Override // javax.inject.Provider
    public Cache get() {
        return provideCache(this.fileProvider.get());
    }
}
