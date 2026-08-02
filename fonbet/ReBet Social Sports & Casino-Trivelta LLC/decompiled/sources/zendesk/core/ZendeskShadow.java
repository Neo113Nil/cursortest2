package zendesk.core;

import ld.AbstractC5459a;

/* loaded from: classes5.dex */
final class ZendeskShadow {
    private static final String LOG_TAG = "ZendeskShadow";
    private final BlipsCoreProvider blipsCoreProvider;
    private final CoreModule coreModule;
    private final IdentityManager identityManager;
    private final LegacyIdentityMigrator legacyIdentityMigrator;
    private final ProviderStore providerStore;
    private final PushRegistrationProvider pushRegistrationProvider;
    private final Storage storage;

    public ZendeskShadow(Storage storage, LegacyIdentityMigrator legacyIdentityMigrator, IdentityManager identityManager, BlipsCoreProvider blipsCoreProvider, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        this.storage = storage;
        this.legacyIdentityMigrator = legacyIdentityMigrator;
        this.identityManager = identityManager;
        this.blipsCoreProvider = blipsCoreProvider;
        this.pushRegistrationProvider = pushRegistrationProvider;
        this.coreModule = coreModule;
        this.providerStore = providerStore;
    }

    private static boolean checkIdentityValid(Identity identity) {
        if (identity == null) {
            AbstractC5459a.i(LOG_TAG, "setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.", new Object[0]);
            return false;
        }
        if (!(identity instanceof AnonymousIdentity) && !(identity instanceof JwtIdentity)) {
            AbstractC5459a.i(LOG_TAG, "setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.", new Object[0]);
            return false;
        }
        if (!(identity instanceof JwtIdentity) || !com.zendesk.util.d.c(((JwtIdentity) identity).getJwtUserIdentifier())) {
            return true;
        }
        AbstractC5459a.i(LOG_TAG, "setIdentity(): The provided Identity object must be an Anonymous Identity or a JwtIdentity with a non-empty JWT identifier. Returning.", new Object[0]);
        return false;
    }

    public void cleanupIfNewConfig(ApplicationConfiguration applicationConfiguration) {
        if (this.storage.hasSdkConfigChanged(applicationConfiguration)) {
            this.pushRegistrationProvider.unregisterDevice(null);
        }
    }

    public CoreModule coreModule() {
        return this.coreModule;
    }

    public Identity getIdentity() {
        return this.identityManager.getIdentity();
    }

    public void init(ApplicationConfiguration applicationConfiguration, boolean z10) {
        if (this.storage.hasSdkConfigChanged(applicationConfiguration)) {
            AbstractC5459a.b(LOG_TAG, "SDK app config details have changed, cleaning up old config storage.", new Object[0]);
            this.storage.clear();
            this.storage.storeSdkHash(applicationConfiguration);
        } else if (z10) {
            AbstractC5459a.e(LOG_TAG, "Zendesk is already initialized with these details, skipping.", new Object[0]);
            return;
        }
        this.blipsCoreProvider.coreInitialized();
    }

    public ProviderStore providers() {
        return this.providerStore;
    }

    public void reset() {
        this.pushRegistrationProvider.unregisterDevice(null);
        this.storage.getSessionStorage().clear();
        this.storage.clear();
    }

    public void setIdentity(Identity identity) {
        if (checkIdentityValid(identity)) {
            this.legacyIdentityMigrator.checkAndMigrateIdentity();
            if (!this.identityManager.identityIsDifferent(identity)) {
                AbstractC5459a.e(LOG_TAG, "Zendesk is already initialized with this identity, skipping.", new Object[0]);
                return;
            }
            this.pushRegistrationProvider.unregisterDevice(null);
            this.storage.getSessionStorage().clear();
            this.identityManager.updateAndPersistIdentity(identity);
        }
    }
}
