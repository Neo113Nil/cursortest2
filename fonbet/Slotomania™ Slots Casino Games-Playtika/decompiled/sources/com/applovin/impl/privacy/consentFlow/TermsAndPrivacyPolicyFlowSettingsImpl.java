package com.applovin.impl.privacy.consentFlow;

import android.net.Uri;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class TermsAndPrivacyPolicyFlowSettingsImpl implements AppLovinTermsAndPrivacyPolicyFlowSettings {
    private boolean a;
    private boolean b;
    private AppLovinSdkConfiguration.ConsentFlowUserGeography c;
    private Uri d;
    private Uri e;

    public TermsAndPrivacyPolicyFlowSettingsImpl(boolean z, boolean z2, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, Uri uri, Uri uri2) {
        this.a = z;
        this.b = z2;
        this.c = consentFlowUserGeography;
        this.d = uri;
        this.e = uri2;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public Uri getPrivacyPolicyUri() {
        return this.d;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public Uri getTermsOfServiceUri() {
        return this.e;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean isEnabled() {
        return this.a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        p.g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.c = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setEnabled(boolean z) {
        p.g("ConsentFlowSettingsImpl", "Setting Terms and Privacy Policy Flow enabled: " + z);
        this.a = z;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        p.g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.d = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setShowTermsAndPrivacyPolicyAlertInGdpr(boolean z) {
        p.g("ConsentFlowSettingsImpl", "Setting show Terms and Privacy Policy alert in GDPR: " + z);
        this.b = z;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        p.g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.e = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean shouldShowTermsAndPrivacyPolicyAlertInGdpr() {
        return this.b;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.a + ", privacyPolicyUri=" + this.d + ", termsOfServiceUri=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }
}
