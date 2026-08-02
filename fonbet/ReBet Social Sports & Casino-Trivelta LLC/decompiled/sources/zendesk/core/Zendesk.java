package zendesk.core;

import android.content.Context;
import androidx.annotation.NonNull;
import ld.AbstractC5459a;

/* loaded from: classes5.dex */
public enum Zendesk {
    INSTANCE;

    private static final String LOG_TAG = "Zendesk";
    private ActionHandlerRegistry actionHandlerRegistry = new ZendeskActionHandlerRegistry();
    private ZendeskShadow zendeskShadow;

    Zendesk() {
    }

    public static boolean checkConfig(Context context, String str, String str2, String str3) {
        if (context != null && com.zendesk.util.d.b(str, str2, str3)) {
            return true;
        }
        AbstractC5459a.d(LOG_TAG, String.format("Invalid zendesk configuration provided | Context: %b | Url: %b | Application Id: %b | OauthClientId: %b", context, Boolean.valueOf(com.zendesk.util.d.a(str)), Boolean.valueOf(com.zendesk.util.d.a(str2)), Boolean.valueOf(com.zendesk.util.d.a(str3))), new Object[0]);
        return false;
    }

    public ActionHandlerRegistry actionHandlerRegistry() {
        return this.actionHandlerRegistry;
    }

    public CoreModule coreModule() {
        if (isInitialized()) {
            return this.zendeskShadow.coreModule();
        }
        AbstractC5459a.d(LOG_TAG, "Cannot get CoreModule before SDK has been initialized. init() must be called before coreModule().", new Object[0]);
        return null;
    }

    public Identity getIdentity() {
        if (isInitialized()) {
            return this.zendeskShadow.getIdentity();
        }
        return null;
    }

    public void init(@NonNull Context context, @NonNull String str, @NonNull String str2, String str3) {
        checkConfig(context, str, str2, str3);
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration(str2, str, str3);
        init(DaggerZendeskApplicationComponent.builder().zendeskApplicationModule(new ZendeskApplicationModule(context, applicationConfiguration)).build(), applicationConfiguration);
    }

    public boolean isInitialized() {
        return this.zendeskShadow != null;
    }

    public ProviderStore provider() {
        if (!isInitialized()) {
            AbstractC5459a.d(LOG_TAG, "Cannot get ProviderStore before SDK has been initialized. init() must be called before provider().", new Object[0]);
            return null;
        }
        if (getIdentity() != null) {
            return this.zendeskShadow.providers();
        }
        AbstractC5459a.d(LOG_TAG, "Cannot get ProviderStore before an identity has been set. Zendesk.INSTANCE.setIdentity() must be called before provider().", new Object[0]);
        return null;
    }

    public void reset() {
        if (!isInitialized()) {
            AbstractC5459a.e(LOG_TAG, "Cant reset, Zendesk is uninitialized", new Object[0]);
            return;
        }
        this.zendeskShadow.reset();
        this.zendeskShadow = null;
        AbstractC5459a.e(LOG_TAG, "Tearing down Zendesk", new Object[0]);
    }

    public void setIdentity(@NonNull Identity identity) {
        if (isInitialized()) {
            this.zendeskShadow.setIdentity(identity);
        } else {
            AbstractC5459a.d(LOG_TAG, "Cannot get set identity before SDK has been initialized. init() must be called before setIdentity(...).", new Object[0]);
        }
    }

    public void init(ZendeskApplicationComponent zendeskApplicationComponent, ApplicationConfiguration applicationConfiguration) {
        ZendeskShadow zendeskShadow = this.zendeskShadow;
        boolean z10 = zendeskShadow != null;
        if (z10) {
            zendeskShadow.cleanupIfNewConfig(applicationConfiguration);
        }
        ZendeskShadow zendeskShadow2 = zendeskApplicationComponent.zendeskShadow();
        zendeskShadow2.init(applicationConfiguration, z10);
        this.zendeskShadow = zendeskShadow2;
    }
}
