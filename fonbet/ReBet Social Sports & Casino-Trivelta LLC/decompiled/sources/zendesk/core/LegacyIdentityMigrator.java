package zendesk.core;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.q;
import ld.AbstractC5459a;
import zendesk.core.AnonymousIdentity;

/* loaded from: classes5.dex */
class LegacyIdentityMigrator {
    private static final String ANONYMOUS_EMAIL_KEY = "email";
    private static final String ANONYMOUS_NAME_KEY = "name";
    private static final String JWT_TOKEN_KEY = "token";
    private static final String LEGACY_ACCESS_TOKEN_KEY = "access_token";
    private static final String LEGACY_ACCESS_TOKEN_USER_ID_KEY = "user_id";
    private static final String LEGACY_IDENTITY_KEY = "zendesk-identity";
    private static final String LEGACY_IDENTITY_TYPE_KEY = "zendesk-identity-type";
    private static final String LEGACY_PUSH_DEVICE_ID_KEY = "identifier";
    private static final String LEGACY_PUSH_RESPONSE_KEY = "pushRegResponseIdentifier";
    private static final String LEGACY_SDK_GUID_KEY = "uuid";
    private static final String LEGACY_STORED_TOKEN_KEY = "stored_token";
    private static final String LEGACY_USER_ID_KEY = "user_id";
    private static final String LOG_TAG = "LegacyIdentityStorage";
    private IdentityManager identityManager;
    private IdentityStorage identityStorage;
    private SharedPreferencesStorage legacyIdentityStorage;
    private SharedPreferencesStorage legacyPushStorage;
    private PushDeviceIdStorage pushDeviceIdStorage;

    /* renamed from: zendesk.core.LegacyIdentityMigrator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$core$AuthenticationType;

        static {
            int[] iArr = new int[AuthenticationType.values().length];
            $SwitchMap$zendesk$core$AuthenticationType = iArr;
            try {
                iArr[AuthenticationType.ANONYMOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$core$AuthenticationType[AuthenticationType.JWT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LegacyIdentityMigrator(SharedPreferencesStorage sharedPreferencesStorage, SharedPreferencesStorage sharedPreferencesStorage2, IdentityStorage identityStorage, IdentityManager identityManager, PushDeviceIdStorage pushDeviceIdStorage) {
        this.legacyIdentityStorage = sharedPreferencesStorage;
        this.legacyPushStorage = sharedPreferencesStorage2;
        this.identityStorage = identityStorage;
        this.identityManager = identityManager;
        this.pushDeviceIdStorage = pushDeviceIdStorage;
    }

    private void clear() {
        this.legacyIdentityStorage.remove(LEGACY_IDENTITY_TYPE_KEY);
        this.legacyIdentityStorage.remove(LEGACY_IDENTITY_KEY);
        this.legacyIdentityStorage.remove(LEGACY_STORED_TOKEN_KEY);
        this.legacyIdentityStorage.remove(LEGACY_SDK_GUID_KEY);
        this.legacyIdentityStorage.remove("user_id");
        this.legacyPushStorage.remove(LEGACY_PUSH_RESPONSE_KEY);
    }

    private AccessToken getLegacyAccessToken() {
        String str = this.legacyIdentityStorage.get(LEGACY_STORED_TOKEN_KEY);
        if (com.zendesk.util.d.c(str)) {
            return null;
        }
        try {
            h a10 = new m().a(str);
            if (a10 != null && a10.k()) {
                k e10 = a10.e();
                h r10 = e10.r(LEGACY_ACCESS_TOKEN_KEY);
                h r11 = e10.r("user_id");
                if (r10 != null && r11 != null) {
                    return new AccessToken(r10.h(), r11.h());
                }
            }
            return null;
        } catch (q e11) {
            AbstractC5459a.h(LOG_TAG, "Unable to read legacy AccessToken.", e11, new Object[0]);
            return null;
        }
    }

    private Identity getLegacyIdentity() {
        AuthenticationType legacyIdentityType = getLegacyIdentityType();
        if (legacyIdentityType == null) {
            return null;
        }
        int i10 = AnonymousClass1.$SwitchMap$zendesk$core$AuthenticationType[legacyIdentityType.ordinal()];
        if (i10 == 1) {
            return readLegacyAnonymousIdentity();
        }
        if (i10 != 2) {
            return null;
        }
        return readLegacyJwtIdentity();
    }

    private AuthenticationType getLegacyIdentityType() {
        return AuthenticationType.getAuthType(this.legacyIdentityStorage.get(LEGACY_IDENTITY_TYPE_KEY));
    }

    private String getLegacyPushId() {
        h r10;
        String str = this.legacyPushStorage.get(LEGACY_PUSH_RESPONSE_KEY);
        if (com.zendesk.util.d.a(str)) {
            try {
                h a10 = new m().a(str);
                if (a10 != null && a10.k() && (r10 = a10.e().r(LEGACY_PUSH_DEVICE_ID_KEY)) != null) {
                    return r10.h();
                }
            } catch (q e10) {
                AbstractC5459a.h(LOG_TAG, "Unable to read legacy push device ID.", e10, new Object[0]);
            }
        }
        return null;
    }

    private String getLegacySdkGuid() {
        return this.legacyIdentityStorage.get(LEGACY_SDK_GUID_KEY);
    }

    private long getLegacyUserId() {
        return this.legacyIdentityStorage.getLong("user_id");
    }

    private AnonymousIdentity readLegacyAnonymousIdentity() {
        String str = this.legacyIdentityStorage.get(LEGACY_IDENTITY_KEY);
        if (com.zendesk.util.d.c(str)) {
            return null;
        }
        try {
            h a10 = new m().a(str);
            if (a10 != null && a10.k()) {
                k e10 = a10.e();
                AnonymousIdentity.Builder builder = new AnonymousIdentity.Builder();
                h r10 = e10.r(ANONYMOUS_EMAIL_KEY);
                if (r10 != null) {
                    builder.withEmailIdentifier(r10.h());
                }
                h r11 = e10.r("name");
                if (r11 != null) {
                    builder.withNameIdentifier(r11.h());
                }
                return (AnonymousIdentity) builder.build();
            }
            return null;
        } catch (q e11) {
            AbstractC5459a.h(LOG_TAG, "Unable to read legacy AnonymousIdentity.", e11, new Object[0]);
            return null;
        }
    }

    private JwtIdentity readLegacyJwtIdentity() {
        k e10;
        h r10;
        String str = this.legacyIdentityStorage.get(LEGACY_IDENTITY_KEY);
        if (com.zendesk.util.d.c(str)) {
            return null;
        }
        try {
            h a10 = new m().a(str);
            if (a10 == null || (e10 = a10.e()) == null || (r10 = e10.r(JWT_TOKEN_KEY)) == null) {
                return null;
            }
            return new JwtIdentity(r10.h());
        } catch (q e11) {
            AbstractC5459a.h(LOG_TAG, "Unable to read legacy JwtIdentity.", e11, new Object[0]);
            return null;
        }
    }

    public void checkAndMigrateIdentity() {
        Identity legacyIdentity = getLegacyIdentity();
        if (legacyIdentity == null) {
            return;
        }
        this.identityStorage.storeIdentity(legacyIdentity);
        long legacyUserId = getLegacyUserId();
        if (legacyUserId != 0) {
            this.identityStorage.storeUserId(Long.valueOf(legacyUserId));
        }
        AccessToken legacyAccessToken = getLegacyAccessToken();
        if (legacyAccessToken != null) {
            this.identityManager.storeAccessToken(legacyAccessToken);
        }
        if (getLegacyIdentityType() == AuthenticationType.ANONYMOUS) {
            String legacySdkGuid = getLegacySdkGuid();
            if (com.zendesk.util.d.a(legacySdkGuid)) {
                this.identityStorage.storeSdkGuid(legacySdkGuid);
            }
        }
        String legacyPushId = getLegacyPushId();
        if (com.zendesk.util.d.a(legacyPushId)) {
            this.pushDeviceIdStorage.storeRegisteredDeviceId(legacyPushId);
        }
        clear();
    }
}
