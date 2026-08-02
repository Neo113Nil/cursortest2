package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFa1vSDK implements AppsFlyerProperties {

    @NotNull
    private final AFc1pSDK AFLogger;

    @NotNull
    private final Map<String, Object> registerClient;
    private boolean unregisterClient;

    public AFa1vSDK(@NotNull AFc1pSDK aFc1pSDK) {
        aFc1pSDK.getClass();
        this.AFLogger = aFc1pSDK;
        this.registerClient = new LinkedHashMap();
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void clear() {
        this.registerClient.clear();
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final boolean getBoolean(@Nullable String str, boolean z) {
        String string = getString(str);
        return string != null ? Boolean.parseBoolean(string) : z;
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final int getInt(@Nullable String str, int i) {
        String string = getString(str);
        return string != null ? Integer.parseInt(string) : i;
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final long getLong(@Nullable String str, long j) {
        String string = getString(str);
        return string != null ? Long.parseLong(string) : j;
    }

    @Override // com.appsflyer.AppsFlyerProperties
    @Nullable
    public final synchronized String getString(@Nullable String str) {
        Object obj = this.registerClient.get(str);
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void loadProperties() {
        try {
            if (this.unregisterClient) {
                return;
            }
            String d = this.AFLogger.d("savedProperties");
            if (d == null) {
                return;
            }
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.PREFERENCES, "Loading properties..", false, 4, null);
            try {
                JSONObject jSONObject = new JSONObject(d);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.registerClient.get(next) == null) {
                        this.registerClient.put(next, jSONObject.getString(next));
                    }
                }
                String[] strArr = {"AppsFlyerKey", "custom_host", "custom_host_prefix", "advertiserIdEnabled", "advertiserId"};
                for (int i = 0; i < 5; i++) {
                    this.registerClient.remove(strArr[i]);
                }
                saveProperties();
                this.unregisterClient = true;
            } catch (JSONException e) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PREFERENCES, "Failed loading properties", e, false, false, false, false, 120, null);
            }
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.PREFERENCES, "Done loading properties: " + this.unregisterClient, false, 4, null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void remove(@Nullable String str) {
        this.registerClient.remove(str);
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void saveProperties() {
        this.registerClient.remove("AppsFlyerKey");
        this.AFLogger.d("savedProperties", new JSONObject(this.registerClient).toString());
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void set(@Nullable String str, int i) {
        this.registerClient.put(str, String.valueOf(i));
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void set(@Nullable String str, @Nullable String[] strArr) {
        this.registerClient.put(str, strArr);
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void set(@Nullable String str, @Nullable String str2) {
        this.registerClient.put(str, str2);
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void set(@Nullable String str, long j) {
        this.registerClient.put(str, String.valueOf(j));
    }

    @Override // com.appsflyer.AppsFlyerProperties
    public final synchronized void set(@Nullable String str, boolean z) {
        this.registerClient.put(str, String.valueOf(z));
    }
}
