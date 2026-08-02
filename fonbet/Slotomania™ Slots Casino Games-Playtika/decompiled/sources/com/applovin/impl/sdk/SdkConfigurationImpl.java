package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public class SdkConfigurationImpl implements AppLovinSdkConfiguration {
    private final l a;
    private List b;

    public SdkConfigurationImpl(l lVar) {
        this.a = lVar;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentDialogState getConsentDialogState() {
        String str = this.a.p0().getExtraParameters().get("consent_dialog_state");
        if (!StringUtils.isValidString(str)) {
            str = (String) this.a.a(z4.g7);
        }
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.APPLIES : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY : AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getConsentFlowUserGeography() {
        String str = (String) this.a.a(z4.g7);
        return "applies".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR : "does_not_apply".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER : AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public String getCountryCode() {
        return (String) this.a.a(z4.h7);
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public List<String> getEnabledAmazonAdUnitIds() {
        return this.b;
    }

    @Override // com.applovin.sdk.AppLovinSdkConfiguration
    public boolean isTestModeEnabled() {
        return this.a.u0().c();
    }

    public void setEnabledAmazonAdUnitIds(List<String> list) {
        this.b = list;
    }

    public String toString() {
        return "AppLovinSdkConfiguration{, countryCode=" + getCountryCode() + ", enabledAmazonAdUnitIds=" + getEnabledAmazonAdUnitIds() + ", testModeEnabled=" + isTestModeEnabled() + AbstractJsonLexerKt.END_OBJ;
    }
}
