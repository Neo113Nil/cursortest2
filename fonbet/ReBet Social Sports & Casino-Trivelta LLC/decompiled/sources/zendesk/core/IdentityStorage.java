package zendesk.core;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
interface IdentityStorage {
    void clear();

    String getBlipsUuid();

    Identity getIdentity();

    AccessToken getStoredAccessToken();

    Long getUserId();

    @NonNull
    String getUuid();

    void storeAccessToken(AccessToken accessToken);

    void storeIdentity(Identity identity);

    void storeSdkGuid(String str);

    void storeUserId(Long l10);

    String updateBlipsUuid();

    String updateSdkGuid();
}
