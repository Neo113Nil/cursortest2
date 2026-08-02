package zendesk.core;

import java.util.concurrent.TimeUnit;
import ld.AbstractC5459a;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Response;

/* loaded from: classes5.dex */
class ZendeskSettingsInterceptor implements Interceptor {
    private static final String LOG_TAG = "SettingsInterceptor";
    private final SdkSettingsProviderInternal provider;
    private SettingsStorage settingsStorage;

    public ZendeskSettingsInterceptor(SdkSettingsProviderInternal sdkSettingsProviderInternal, SettingsStorage settingsStorage) {
        this.provider = sdkSettingsProviderInternal;
        this.settingsStorage = settingsStorage;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        if (!this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            AbstractC5459a.b(LOG_TAG, "Requesting SDK settings.", new Object[0]);
            if (this.provider.getCoreSettings() == null) {
                AbstractC5459a.b(LOG_TAG, "Retrieved settings are null. Returning 404.", new Object[0]);
                return new Response.Builder().protocol(Protocol.HTTP_2).request(chain.request()).message(chain.request().method()).code(404).build();
            }
        }
        AbstractC5459a.b(LOG_TAG, "Proceeding with chain.", new Object[0]);
        return chain.proceed(chain.request());
    }
}
