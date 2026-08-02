package zendesk.core;

import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class ZendeskStorageModule_ProvideLegacyIdentityStorageFactory implements Gg.b {
    private final Provider<IdentityManager> identityManagerProvider;
    private final Provider<IdentityStorage> identityStorageProvider;
    private final Provider<SharedPreferencesStorage> legacyIdentityBaseStorageProvider;
    private final Provider<SharedPreferencesStorage> legacyPushBaseStorageProvider;
    private final Provider<PushDeviceIdStorage> pushDeviceIdStorageProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(Provider<SharedPreferencesStorage> provider, Provider<SharedPreferencesStorage> provider2, Provider<IdentityStorage> provider3, Provider<IdentityManager> provider4, Provider<PushDeviceIdStorage> provider5) {
        this.legacyIdentityBaseStorageProvider = provider;
        this.legacyPushBaseStorageProvider = provider2;
        this.identityStorageProvider = provider3;
        this.identityManagerProvider = provider4;
        this.pushDeviceIdStorageProvider = provider5;
    }

    public static ZendeskStorageModule_ProvideLegacyIdentityStorageFactory create(Provider<SharedPreferencesStorage> provider, Provider<SharedPreferencesStorage> provider2, Provider<IdentityStorage> provider3, Provider<IdentityManager> provider4, Provider<PushDeviceIdStorage> provider5) {
        return new ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static LegacyIdentityMigrator provideLegacyIdentityStorage(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (LegacyIdentityMigrator) Gg.d.d(ZendeskStorageModule.provideLegacyIdentityStorage((SharedPreferencesStorage) obj, (SharedPreferencesStorage) obj2, (IdentityStorage) obj3, (IdentityManager) obj4, (PushDeviceIdStorage) obj5));
    }

    @Override // javax.inject.Provider
    public LegacyIdentityMigrator get() {
        return provideLegacyIdentityStorage(this.legacyIdentityBaseStorageProvider.get(), this.legacyPushBaseStorageProvider.get(), this.identityStorageProvider.get(), this.identityManagerProvider.get(), this.pushDeviceIdStorageProvider.get());
    }
}
