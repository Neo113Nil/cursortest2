package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.f2;
import com.applovin.impl.m0;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class a {
    private final l a;
    private final p b;
    private ConsentForm c;
    private int d;

    /* renamed from: com.applovin.impl.privacy.cmp.a$a, reason: collision with other inner class name */
    public interface InterfaceC0107a {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public a(l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(l.p());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public void a() {
        if (this.c != null) {
            this.c = null;
        }
        this.d = 0;
    }

    public String b() {
        return null;
    }

    public void c() {
        a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(l.p()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC0107a interfaceC0107a, FormError formError) {
        b("Failed to request consent info with error: " + formError.getMessage());
        interfaceC0107a.onFlowLoadFailed(a(formError, "Consent info update failed"));
    }

    private boolean c(String str) {
        if (!this.a.c(z4.n7).contains(str)) {
            return false;
        }
        Integer num = (Integer) this.a.a(z4.m7);
        return num.intValue() < 0 || this.d < num.intValue();
    }

    public void b(Activity activity, final m0 m0Var, final InterfaceC0107a interfaceC0107a) {
        if (this.c == null) {
            b("Failed to show - not ready yet");
            interfaceC0107a.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            a("Showing consent form...");
            this.c.show(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda4
                @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                public final void onConsentFormDismissed(FormError formError) {
                    a.this.a(m0Var, interfaceC0107a, formError);
                }
            });
        }
    }

    public void a(final Activity activity, m0 m0Var, final InterfaceC0107a interfaceC0107a) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (q7.c(this.a) && m0Var.a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull(this.a.p0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda0
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                a.this.a(activity, interfaceC0107a);
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda1
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(FormError formError) {
                a.this.b(interfaceC0107a, formError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(final FormError formError, final m0 m0Var, final InterfaceC0107a interfaceC0107a) {
        a("Retrying to load and show consent form...");
        this.d++;
        UserMessagingPlatform.loadConsentForm(l.p(), new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda2
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                a.this.a(interfaceC0107a, formError, m0Var, consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda3
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError2) {
                a.this.a(interfaceC0107a, formError, formError2);
            }
        });
    }

    private void b(String str) {
        if (p.a()) {
            this.b.b("GoogleCmpAdapter", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, final InterfaceC0107a interfaceC0107a) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
        boolean isConsentFormAvailable = consentInformation.isConsentFormAvailable();
        int consentStatus = consentInformation.getConsentStatus();
        a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + isConsentFormAvailable);
        if (!isConsentFormAvailable) {
            b("Failed to load form.");
            interfaceC0107a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
        } else if (consentStatus != 2) {
            b("Failed to load with consent status: " + consentStatus);
            interfaceC0107a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_NOT_REQUIRED, "Consent form not required for consent status: " + consentStatus));
        } else {
            a("Successfully requested consent info");
            a("Loading consent form...");
            UserMessagingPlatform.loadConsentForm(activity, new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda5
                @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
                public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                    a.this.a(interfaceC0107a, consentForm);
                }
            }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda6
                @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
                public final void onConsentFormLoadFailure(FormError formError) {
                    a.this.a(interfaceC0107a, formError);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0107a interfaceC0107a, ConsentForm consentForm) {
        a("Successfully loaded consent form");
        this.c = consentForm;
        interfaceC0107a.onFlowLoaded(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0107a interfaceC0107a, FormError formError) {
        b("Failed to load with error: " + formError.getMessage());
        interfaceC0107a.onFlowLoadFailed(a(formError, "Consent form load failed"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final m0 m0Var, final InterfaceC0107a interfaceC0107a, final FormError formError) {
        if (formError != null) {
            String valueOf = String.valueOf(formError.getErrorCode());
            String message = formError.getMessage();
            HashMap hashMap = new HashMap(2);
            hashMap.put("error_code", valueOf);
            hashMap.put("error_message", message);
            this.a.E().a(f2.X0, "googleConsentFormDismissed", hashMap);
            if (c(valueOf)) {
                a("Consent form was dismissed due to error: " + message);
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.a(formError, m0Var, interfaceC0107a);
                    }
                });
                return;
            } else {
                b("Failed to show with error: " + message);
                interfaceC0107a.onFlowShowFailed(a(formError, "Consent form show failed"));
                return;
            }
        }
        a("Consent form finished showing");
        interfaceC0107a.onFlowHidden(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0107a interfaceC0107a, FormError formError, m0 m0Var, ConsentForm consentForm) {
        a("Successfully re-loaded consent form");
        this.c = consentForm;
        Activity w0 = this.a.w0();
        if (w0 == null) {
            interfaceC0107a.onFlowShowFailed(a(formError, "Consent form show failed"));
        } else {
            b(w0, m0Var, interfaceC0107a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0107a interfaceC0107a, FormError formError, FormError formError2) {
        b("Retry to load failed with error: " + formError2.getMessage());
        interfaceC0107a.onFlowShowFailed(a(formError, "Consent form show failed"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r1 != 4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CmpErrorImpl a(FormError formError, String str) {
        AppLovinCmpError.Code code = AppLovinCmpError.Code.UNSPECIFIED;
        int errorCode = formError.getErrorCode();
        if (errorCode != 1 && errorCode != 2) {
            if (errorCode == 3) {
                code = AppLovinCmpError.Code.INTEGRATION_ERROR;
            }
            return new CmpErrorImpl(code, str, formError.getErrorCode(), formError.getMessage());
        }
        code = AppLovinCmpError.Code.FORM_UNAVAILABLE;
        return new CmpErrorImpl(code, str, formError.getErrorCode(), formError.getMessage());
    }

    private void a(String str) {
        if (p.a()) {
            this.b.a("GoogleCmpAdapter", str);
        }
    }
}
