package zendesk.core;

import java.util.Locale;
import ld.AbstractC5459a;

/* loaded from: classes5.dex */
class ZendeskIdentityManager implements IdentityManager {
    private static final String LOG_TAG = "ZendeskIdentityManager";
    private final IdentityStorage identityStorage;

    public ZendeskIdentityManager(IdentityStorage identityStorage) {
        this.identityStorage = identityStorage;
    }

    @Override // zendesk.core.IdentityManager
    public String getBlipsUuid() {
        String blipsUuid = this.identityStorage.getBlipsUuid();
        return com.zendesk.util.d.c(blipsUuid) ? this.identityStorage.updateBlipsUuid() : blipsUuid;
    }

    @Override // zendesk.core.IdentityManager
    public Identity getIdentity() {
        Identity identity = this.identityStorage.getIdentity();
        if (!(identity instanceof AnonymousIdentity)) {
            return identity;
        }
        AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
        anonymousIdentity.setSdkGuid(getSdkGuid());
        return anonymousIdentity;
    }

    @Override // zendesk.core.IdentityManager
    public String getSdkGuid() {
        String uuid = this.identityStorage.getUuid();
        return com.zendesk.util.d.c(uuid) ? this.identityStorage.updateSdkGuid() : uuid;
    }

    @Override // zendesk.core.IdentityManager
    public String getStoredAccessTokenAsBearerToken() {
        AccessToken storedAccessToken = this.identityStorage.getStoredAccessToken();
        if (storedAccessToken != null) {
            return String.format(Locale.US, Constants.AUTHORIZATION_BEARER_FORMAT, storedAccessToken.getAccessToken());
        }
        AbstractC5459a.i(LOG_TAG, "There is no stored access token, have you initialised an identity and requested an access token?", new Object[0]);
        return null;
    }

    @Override // zendesk.core.IdentityManager
    public Long getUserId() {
        return this.identityStorage.getUserId();
    }

    @Override // zendesk.core.IdentityManager
    public boolean identityIsDifferent(Identity identity) {
        Identity identity2 = this.identityStorage.getIdentity();
        return identity2 == null || identity == null || !identity2.equals(identity);
    }

    @Override // zendesk.core.IdentityManager
    public void storeAccessToken(AccessToken accessToken) {
        if (accessToken == null) {
            AbstractC5459a.i(LOG_TAG, "Access Token object was null, cannot store.", new Object[0]);
            return;
        }
        if (com.zendesk.util.d.c(accessToken.getAccessToken())) {
            AbstractC5459a.i(LOG_TAG, "Access token String was null or empty, cannot store.", new Object[0]);
        } else {
            this.identityStorage.storeAccessToken(accessToken);
        }
        String userId = accessToken.getUserId();
        if (com.zendesk.util.d.d(userId)) {
            this.identityStorage.storeUserId(Long.valueOf(userId));
        } else {
            AbstractC5459a.i(LOG_TAG, "User ID String was null or empty, cannot store.", new Object[0]);
        }
    }

    @Override // zendesk.core.IdentityManager
    public Identity updateAndPersistIdentity(Identity identity) {
        Identity identity2 = this.identityStorage.getIdentity();
        if (identity2 == null) {
            AbstractC5459a.b(LOG_TAG, "No previous identity set, storing identity", new Object[0]);
            this.identityStorage.storeIdentity(identity);
            return identity;
        }
        if (identity == null || !identityIsDifferent(identity)) {
            return identity2;
        }
        AbstractC5459a.b(LOG_TAG, "Identity has changed, storing new identity", new Object[0]);
        this.identityStorage.storeIdentity(identity);
        return identity;
    }
}
