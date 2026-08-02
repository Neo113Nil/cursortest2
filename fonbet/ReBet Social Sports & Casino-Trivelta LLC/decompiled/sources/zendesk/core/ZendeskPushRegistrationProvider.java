package zendesk.core;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Locale;
import ld.AbstractC5459a;
import md.d;
import md.e;
import retrofit2.Response;

/* loaded from: classes5.dex */
class ZendeskPushRegistrationProvider implements PushRegistrationProvider, PushRegistrationProviderInternal {
    private static final String LOG_TAG = "PushRegistrationProvider";
    private static final d.b PUSH_RESPONSE_EXTRACTOR = new d.b() { // from class: zendesk.core.ZendeskPushRegistrationProvider.4
        @Override // md.d.b
        public String extract(PushRegistrationResponseWrapper pushRegistrationResponseWrapper) {
            return (pushRegistrationResponseWrapper == null || pushRegistrationResponseWrapper.getRegistrationResponse() == null || !com.zendesk.util.d.a(pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier())) ? "" : pushRegistrationResponseWrapper.getRegistrationResponse().getIdentifier();
        }
    };
    private final BlipsCoreProvider blipsProvider;
    private final IdentityManager identityManager;
    private final Locale locale;
    private final PushDeviceIdStorage pushIdStorage;
    private final PushRegistrationService pushService;
    private final SettingsProvider settingsProvider;

    public enum TokenType {
        Identifier(null),
        UrbanAirshipChannelId("urban_airship_channel_id");

        final String name;

        TokenType(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public ZendeskPushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager, SettingsProvider settingsProvider, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, Locale locale) {
        this.pushService = pushRegistrationService;
        this.identityManager = identityManager;
        this.settingsProvider = settingsProvider;
        this.blipsProvider = blipsCoreProvider;
        this.pushIdStorage = pushDeviceIdStorage;
        this.locale = locale;
    }

    private boolean checkForStoredPushRegistration(@NonNull String str, e eVar) {
        if (!com.zendesk.util.d.a(str)) {
            if (eVar != null) {
                eVar.onError(new md.b("Invalid identifier provided."));
            }
            AbstractC5459a.i(LOG_TAG, "Invalid identifier provided.", new Object[0]);
            return true;
        }
        if (this.pushIdStorage.hasRegisteredDeviceId() && str.equals(this.pushIdStorage.getRegisteredDeviceId())) {
            if (eVar != null) {
                eVar.onSuccess(str);
            }
            AbstractC5459a.b(LOG_TAG, "Skipping registration because device is already registered with this ID.", new Object[0]);
            return true;
        }
        if (this.pushIdStorage.hasRegisteredDeviceId()) {
            this.pushIdStorage.removeRegisteredDeviceId();
            AbstractC5459a.b(LOG_TAG, "Removing stored push registration response because a new one has been provided.", new Object[0]);
        }
        return false;
    }

    private void getAuthTypeAndRequest(@NonNull final String str, final TokenType tokenType, final e eVar) {
        if (checkForStoredPushRegistration(str, eVar)) {
            return;
        }
        this.settingsProvider.getCoreSettings(new PassThroughErrorZendeskCallback<CoreSettings>(eVar) { // from class: zendesk.core.ZendeskPushRegistrationProvider.1
            @Override // zendesk.core.PassThroughErrorZendeskCallback, md.e
            public void onSuccess(CoreSettings coreSettings) {
                AuthenticationType authentication = coreSettings.getAuthentication();
                if (authentication == null) {
                    e eVar2 = eVar;
                    if (eVar2 != null) {
                        eVar2.onError(new md.b("Authentication type is null."));
                        return;
                    }
                    return;
                }
                ZendeskPushRegistrationProvider zendeskPushRegistrationProvider = ZendeskPushRegistrationProvider.this;
                PushRegistrationRequest pushRegistrationRequest = zendeskPushRegistrationProvider.getPushRegistrationRequest(str, zendeskPushRegistrationProvider.locale, authentication, tokenType);
                if (ZendeskPushRegistrationProvider.this.hasNoStoredAccessToken()) {
                    ZendeskPushRegistrationProvider.this.storePendingPushRegistrationRequest(pushRegistrationRequest, eVar);
                } else {
                    ZendeskPushRegistrationProvider.this.sendPushRegistrationRequest(pushRegistrationRequest, eVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public PushRegistrationRequest getPushRegistrationRequest(@NonNull String str, @NonNull Locale locale, @NonNull AuthenticationType authenticationType, @NonNull TokenType tokenType) {
        PushRegistrationRequest pushRegistrationRequest = new PushRegistrationRequest();
        pushRegistrationRequest.setIdentifier(str);
        pushRegistrationRequest.setLocale(com.zendesk.util.c.a(locale));
        if (tokenType == TokenType.UrbanAirshipChannelId) {
            pushRegistrationRequest.setTokenType(tokenType.name);
        }
        if (AuthenticationType.ANONYMOUS == authenticationType) {
            pushRegistrationRequest.setSdkGuid(this.identityManager.getSdkGuid());
        }
        return pushRegistrationRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasNoStoredAccessToken() {
        return this.identityManager.getStoredAccessTokenAsBearerToken() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSuccessfulRegistration(String str) {
        this.pushIdStorage.storeRegisteredDeviceId(str);
        this.pushIdStorage.removePushRegistrationRequest();
        this.blipsProvider.corePushEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPushRegistrationRequest(@NonNull PushRegistrationRequest pushRegistrationRequest, final e eVar) {
        this.pushService.registerDevice(new PushRegistrationRequestWrapper(pushRegistrationRequest)).enqueue(new md.d(new PassThroughErrorZendeskCallback<String>(eVar) { // from class: zendesk.core.ZendeskPushRegistrationProvider.3
            @Override // zendesk.core.PassThroughErrorZendeskCallback, md.e
            public void onSuccess(String str) {
                ZendeskPushRegistrationProvider.this.onSuccessfulRegistration(str);
                e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.onSuccess(str);
                }
            }
        }, PUSH_RESPONSE_EXTRACTOR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void storePendingPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest, e eVar) {
        this.pushIdStorage.storePushRegistrationRequest(pushRegistrationRequest);
        if (eVar != null) {
            eVar.onSuccess(pushRegistrationRequest.getIdentifier());
        }
    }

    @Override // zendesk.core.PushRegistrationProvider
    public boolean isRegisteredForPush() {
        return this.pushIdStorage.hasRegisteredDeviceId();
    }

    @Override // zendesk.core.PushRegistrationProvider
    public void registerWithDeviceIdentifier(@NonNull String str, e eVar) {
        getAuthTypeAndRequest(str, TokenType.Identifier, eVar);
    }

    @Override // zendesk.core.PushRegistrationProvider
    public void registerWithUAChannelId(@NonNull String str, e eVar) {
        getAuthTypeAndRequest(str, TokenType.UrbanAirshipChannelId, eVar);
    }

    @Override // zendesk.core.PushRegistrationProvider
    public void unregisterDevice(final e eVar) {
        String registeredDeviceId = this.pushIdStorage.getRegisteredDeviceId();
        final Long userId = this.identityManager.getUserId();
        if (registeredDeviceId != null) {
            this.pushService.unregisterDevice(registeredDeviceId).enqueue(new md.d(new PassThroughErrorZendeskCallback<Void>(eVar) { // from class: zendesk.core.ZendeskPushRegistrationProvider.2
                @Override // zendesk.core.PassThroughErrorZendeskCallback, md.e
                public void onSuccess(Void r32) {
                    ZendeskPushRegistrationProvider.this.pushIdStorage.removeRegisteredDeviceId();
                    ZendeskPushRegistrationProvider.this.blipsProvider.corePushDisabled(userId);
                    e eVar2 = eVar;
                    if (eVar2 != null) {
                        eVar2.onSuccess(r32);
                    }
                }
            }));
        }
    }

    @Override // zendesk.core.PushRegistrationProviderInternal
    public String sendPushRegistrationRequest(PushRegistrationRequest pushRegistrationRequest) {
        try {
            Response<PushRegistrationResponseWrapper> execute = this.pushService.registerDevice(new PushRegistrationRequestWrapper(pushRegistrationRequest)).execute();
            if (execute.body() == null || execute.body().getRegistrationResponse() == null) {
                return "";
            }
            String identifier = execute.body().getRegistrationResponse().getIdentifier();
            onSuccessfulRegistration(identifier);
            return identifier;
        } catch (IOException e10) {
            AbstractC5459a.c(LOG_TAG, "Push registration request failed.", e10, new Object[0]);
            return "";
        }
    }
}
