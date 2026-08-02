package zendesk.core;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.gson.h;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ld.AbstractC5459a;
import md.InterfaceC5581a;
import md.e;
import retrofit2.Response;

/* loaded from: classes5.dex */
class ZendeskSettingsProvider implements SettingsProvider, SdkSettingsProviderInternal {
    private static final String LOG_TAG = "ZendeskSdkSettingsProvi";
    static final int SDK_SETTINGS_MAX_AGE_HOURS = 1;
    private final ActionHandlerRegistry actionHandlerRegistry;
    private final String applicationId;
    private final Context context;
    private final CoreSettingsStorage coreSettingsStorage;
    private final Serializer serializer;
    private final SdkSettingsService settingsService;
    private final SettingsStorage settingsStorage;
    private final ZendeskLocaleConverter zendeskLocaleConverter;

    public ZendeskSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage, CoreSettingsStorage coreSettingsStorage, ActionHandlerRegistry actionHandlerRegistry, Serializer serializer, ZendeskLocaleConverter zendeskLocaleConverter, String str, Context context) {
        this.settingsService = sdkSettingsService;
        this.settingsStorage = settingsStorage;
        this.coreSettingsStorage = coreSettingsStorage;
        this.actionHandlerRegistry = actionHandlerRegistry;
        this.serializer = serializer;
        this.zendeskLocaleConverter = zendeskLocaleConverter;
        this.applicationId = str;
        this.context = context;
    }

    private void getSettingsInternal(Locale locale, e eVar) {
        this.settingsService.getSettings(this.zendeskLocaleConverter.toHelpCenterLocaleString(locale), this.applicationId).enqueue(new md.d(eVar));
    }

    @NonNull
    public CoreSettings extractCoreSettings(Map<String, h> map) {
        CoreSettings coreSettings = (CoreSettings) this.serializer.deserialize(map == null ? null : map.get("core"), CoreSettings.class);
        return coreSettings != null ? coreSettings : ZendeskCoreSettingsStorage.DEFAULT_CORE_SETTINGS;
    }

    @Override // zendesk.core.SdkSettingsProviderInternal
    public BlipsSettings getBlipsSettings() {
        return this.coreSettingsStorage.getBlipsSettings();
    }

    @Override // zendesk.core.SettingsProvider
    public void getCoreSettings(final e eVar) {
        if (!this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new e() { // from class: zendesk.core.ZendeskSettingsProvider.1
                @Override // md.e
                public void onError(InterfaceC5581a interfaceC5581a) {
                    e eVar2 = eVar;
                    if (eVar2 != null) {
                        eVar2.onSuccess(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings());
                    }
                }

                @Override // md.e
                public void onSuccess(Map<String, h> map) {
                    ZendeskSettingsProvider.this.actionHandlerRegistry.updateSettings(map);
                    ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                    if (eVar != null) {
                        eVar.onSuccess(ZendeskSettingsProvider.this.extractCoreSettings(map));
                    }
                }
            });
        } else if (eVar != null) {
            eVar.onSuccess(this.coreSettingsStorage.getCoreSettings());
        }
    }

    @Override // zendesk.core.SettingsProvider
    public <E extends Settings> void getSettingsForSdk(@NonNull final String str, @NonNull final Class<E> cls, final e eVar) {
        if (!this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            getSettingsInternal(DeviceInfo.getCurrentLocale(this.context), new e() { // from class: zendesk.core.ZendeskSettingsProvider.2
                @Override // md.e
                public void onError(InterfaceC5581a interfaceC5581a) {
                    if (eVar == null) {
                        return;
                    }
                    if (!ZendeskSettingsProvider.this.settingsStorage.hasStoredSettings()) {
                        eVar.onError(interfaceC5581a);
                    } else {
                        eVar.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.coreSettingsStorage.getCoreSettings(), (Settings) ZendeskSettingsProvider.this.settingsStorage.getSettings(str, cls)));
                    }
                }

                @Override // md.e
                public void onSuccess(Map<String, h> map) {
                    ZendeskSettingsProvider.this.actionHandlerRegistry.updateSettings(map);
                    ZendeskSettingsProvider.this.settingsStorage.storeRawSettings(map);
                    if (eVar != null) {
                        eVar.onSuccess(new SettingsPack(ZendeskSettingsProvider.this.extractCoreSettings(map), (Settings) ZendeskSettingsProvider.this.serializer.deserialize(map.get(str), cls)));
                    }
                }
            });
        } else if (eVar != null) {
            eVar.onSuccess(new SettingsPack(this.coreSettingsStorage.getCoreSettings(), (Settings) this.settingsStorage.getSettings(str, cls)));
            this.actionHandlerRegistry.updateSettings(this.settingsStorage.getRawSettings());
        }
    }

    @Override // zendesk.core.SdkSettingsProviderInternal
    public CoreSettings getCoreSettings() {
        if (this.settingsStorage.areSettingsUpToDate(1L, TimeUnit.HOURS)) {
            return this.coreSettingsStorage.getCoreSettings();
        }
        Map<String, h> settingsInternal = getSettingsInternal(DeviceInfo.getCurrentLocale(this.context));
        if (settingsInternal.isEmpty()) {
            return new CoreSettings(new Date(0L), null);
        }
        this.actionHandlerRegistry.updateSettings(settingsInternal);
        this.settingsStorage.storeRawSettings(settingsInternal);
        return extractCoreSettings(settingsInternal);
    }

    @NonNull
    private Map<String, h> getSettingsInternal(Locale locale) {
        try {
            Response<Map<String, h>> execute = this.settingsService.getSettings(this.zendeskLocaleConverter.toHelpCenterLocaleString(locale), this.applicationId).execute();
            if (execute.body() != null) {
                return new HashMap(execute.body());
            }
            return new HashMap(0);
        } catch (IOException unused) {
            AbstractC5459a.d(LOG_TAG, "Settings retrieval failed, returning empty map.", new Object[0]);
            return new HashMap(0);
        }
    }
}
