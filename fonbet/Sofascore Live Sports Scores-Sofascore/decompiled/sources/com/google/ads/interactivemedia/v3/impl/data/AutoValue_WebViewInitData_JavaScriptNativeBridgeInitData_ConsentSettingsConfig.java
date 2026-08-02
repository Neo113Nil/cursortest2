package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.WebViewInitData;
import defpackage.wt3;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData_ConsentSettingsConfig extends WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig {
    private final Map<String, String> consentKeyTypes;

    public AutoValue_WebViewInitData_JavaScriptNativeBridgeInitData_ConsentSettingsConfig(Map<String, String> map) {
        this.consentKeyTypes = map;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig
    public Map<String, String> consentKeyTypes() {
        return this.consentKeyTypes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig)) {
            return false;
        }
        WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig consentSettingsConfig = (WebViewInitData.JavaScriptNativeBridgeInitData.ConsentSettingsConfig) obj;
        Map<String, String> map = this.consentKeyTypes;
        return map == null ? consentSettingsConfig.consentKeyTypes() == null : map.equals(consentSettingsConfig.consentKeyTypes());
    }

    public int hashCode() {
        Map<String, String> map = this.consentKeyTypes;
        return (map == null ? 0 : map.hashCode()) ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.consentKeyTypes);
        return wt3.m("ConsentSettingsConfig{consentKeyTypes=", valueOf, new StringBuilder(valueOf.length() + 39), "}");
    }
}
