package zendesk.core;

import java.io.File;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvidesDiskLruStorageFactory implements Gg.b {
    private final Provider<File> fileProvider;
    private final Provider<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvidesDiskLruStorageFactory(Provider<File> provider, Provider<Serializer> provider2) {
        this.fileProvider = provider;
        this.serializerProvider = provider2;
    }

    public static ZendeskStorageModule_ProvidesDiskLruStorageFactory create(Provider<File> provider, Provider<Serializer> provider2) {
        return new ZendeskStorageModule_ProvidesDiskLruStorageFactory(provider, provider2);
    }

    public static BaseStorage providesDiskLruStorage(File file, Object obj) {
        return (BaseStorage) Gg.d.d(ZendeskStorageModule.providesDiskLruStorage(file, (Serializer) obj));
    }

    @Override // javax.inject.Provider
    public BaseStorage get() {
        return providesDiskLruStorage(this.fileProvider.get(), this.serializerProvider.get());
    }
}
