package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvidePushDeviceIdStorageFactory implements Gg.b {
    private final Provider<BaseStorage> additionalSdkStorageProvider;

    public ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(Provider<BaseStorage> provider) {
        this.additionalSdkStorageProvider = provider;
    }

    public static ZendeskStorageModule_ProvidePushDeviceIdStorageFactory create(Provider<BaseStorage> provider) {
        return new ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(provider);
    }

    public static PushDeviceIdStorage providePushDeviceIdStorage(BaseStorage baseStorage) {
        return (PushDeviceIdStorage) Gg.d.d(ZendeskStorageModule.providePushDeviceIdStorage(baseStorage));
    }

    @Override // javax.inject.Provider
    public PushDeviceIdStorage get() {
        return providePushDeviceIdStorage(this.additionalSdkStorageProvider.get());
    }
}
