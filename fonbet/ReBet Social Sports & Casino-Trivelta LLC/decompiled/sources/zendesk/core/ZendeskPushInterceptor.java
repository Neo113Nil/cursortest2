package zendesk.core;

import androidx.annotation.NonNull;
import ld.AbstractC5459a;
import okhttp3.Interceptor;
import okhttp3.Response;

/* loaded from: classes5.dex */
class ZendeskPushInterceptor implements Interceptor {
    private static final String LOG_TAG = "ZendeskPushInterceptor";
    private final IdentityStorage identityStorage;
    private final PushDeviceIdStorage pushDeviceIdStorage;
    private final PushRegistrationProviderInternal pushProvider;

    public ZendeskPushInterceptor(PushRegistrationProviderInternal pushRegistrationProviderInternal, PushDeviceIdStorage pushDeviceIdStorage, IdentityStorage identityStorage) {
        this.pushProvider = pushRegistrationProviderInternal;
        this.pushDeviceIdStorage = pushDeviceIdStorage;
        this.identityStorage = identityStorage;
    }

    @Override // okhttp3.Interceptor
    @NonNull
    public Response intercept(@NonNull Interceptor.Chain chain) {
        PushRegistrationRequest pushRegistrationRequest = this.pushDeviceIdStorage.getPushRegistrationRequest();
        if (pushRegistrationRequest != null && this.identityStorage.getStoredAccessToken() != null) {
            AbstractC5459a.b(LOG_TAG, "Sending stored push registration request", new Object[0]);
            this.pushProvider.sendPushRegistrationRequest(pushRegistrationRequest);
        }
        return chain.proceed(chain.request());
    }
}
