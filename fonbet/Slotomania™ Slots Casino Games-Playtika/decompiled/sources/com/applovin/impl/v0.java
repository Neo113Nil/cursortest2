package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v0;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class v0 implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {
    private final com.applovin.impl.sdk.l a;
    private final a1 b;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AppLovinSdkConfiguration.ConsentFlowUserGeography.values().length];
            a = iArr;
            try {
                iArr[AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b {
        private boolean a;
        private boolean b;
        private boolean c;
        private AppLovinCmpError d;
        private t0 e;

        public b() {
        }

        public boolean b() {
            return this.a;
        }

        protected void c() {
            this.c = true;
            this.a = true;
        }

        protected void d() {
            this.b = true;
            this.a = true;
        }

        public b(t0 t0Var) {
            this.e = t0Var;
        }

        public boolean a() {
            return this.c;
        }

        protected void a(AppLovinCmpError appLovinCmpError) {
            this.d = appLovinCmpError;
        }

        protected void a(t0 t0Var) {
            this.e = t0Var;
        }
    }

    public interface c {
        void a(b bVar);
    }

    public v0(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        this.b = new a1(lVar);
        if (q7.k(com.applovin.impl.sdk.l.p())) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.l.p()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    public static TermsAndPrivacyPolicyFlowSettingsImpl a(Context context) {
        if (context == null) {
            com.applovin.impl.sdk.p.h("ConsentFlowManager", "Failed to get default Terms and Privacy Policy flow settings.");
            return new TermsAndPrivacyPolicyFlowSettingsImpl(false, false, AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, null, null);
        }
        String a2 = q7.a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (com.applovin.impl.sdk.l) null);
        JSONObject jSONObject = JsonUtils.getJSONObject(StringUtils.isValidString(a2) ? JsonUtils.jsonObjectFromJsonString(a2, new JSONObject()) : new JSONObject(), "consent_flow_settings", new JSONObject());
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", bool);
        Boolean bool3 = JsonUtils.getBoolean(jSONObject, "consent_flow_show_terms_and_privacy_policy_alert_in_gdpr", bool);
        String string = JsonUtils.getString(jSONObject, "consent_flow_debug_user_geography", "");
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri parse = URLUtil.isValidUrl(string2) ? Uri.parse(string2) : null;
        String string3 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        return new TermsAndPrivacyPolicyFlowSettingsImpl(bool2.booleanValue(), bool3.booleanValue(), a(string), URLUtil.isValidUrl(string3) ? Uri.parse(string3) : null, parse);
    }

    private TermsAndPrivacyPolicyFlowSettingsImpl c() {
        return (TermsAndPrivacyPolicyFlowSettingsImpl) this.a.p0().getTermsAndPrivacyPolicyFlowSettings();
    }

    public JSONObject b() {
        TermsAndPrivacyPolicyFlowSettingsImpl c2 = c();
        Uri privacyPolicyUri = c2.getPrivacyPolicyUri();
        Uri termsOfServiceUri = c2.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(j()));
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        JsonUtils.putString(jSONObject, "terms_of_service_url", termsOfServiceUri != null ? termsOfServiceUri.toString() : "");
        return jSONObject;
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography d() {
        return c().getDebugUserGeography();
    }

    public String e() {
        Object f = f();
        Object h = h();
        StringBuilder append = new StringBuilder("\nConsent Flow Enabled - ").append(j()).append("\nTerms of Service - ");
        if (h == null) {
            h = AdError.UNDEFINED_DOMAIN;
        }
        StringBuilder append2 = append.append(h).append("\nPrivacy Policy - ");
        if (f == null) {
            f = AdError.UNDEFINED_DOMAIN;
        }
        return append2.append(f).toString();
    }

    public Uri f() {
        return c().getPrivacyPolicyUri();
    }

    public String g() {
        return "Migrate to the new Terms and Privacy Policy Flow by following these steps:\n\t1. Delete the 'terms_flow_settings' entry from your 'applovin_settings.xml' file.\n\t2. Follow the integration instructions in our documentation: " + a();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    public Uri h() {
        return c().getTermsOfServiceUri();
    }

    public boolean i() {
        return this.b.a();
    }

    public boolean j() {
        Map<String, String> extraParameters = this.a.p0().getExtraParameters();
        return extraParameters.containsKey("consent_flow_enabled") ? Boolean.parseBoolean(extraParameters.get("consent_flow_enabled")) : c().isEnabled();
    }

    public boolean k() {
        if (q7.c(this.a)) {
            int i = a.a[d().ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
        }
        return this.a.w().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
    }

    public boolean l() {
        return this.a.p0().getExtraParameters().containsKey("terms_flow_settings");
    }

    public boolean m() {
        return c().shouldShowTermsAndPrivacyPolicyAlertInGdpr();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.b.a(this.a.w0(), new c() { // from class: com.applovin.impl.v0$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.v0.c
            public final void a(v0.b bVar) {
                v0.this.a(bVar);
            }
        });
    }

    private void b(final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v0$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                v0.this.a(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Uri uri, DialogInterface dialogInterface, int i) {
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    public void a(Activity activity, final c cVar) {
        if (!j()) {
            cVar.a(new b(new t0(t0.c, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
        } else if (c().getPrivacyPolicyUri() == null) {
            b(activity);
        } else {
            this.b.a(activity, new c() { // from class: com.applovin.impl.v0$$ExternalSyntheticLambda3
                @Override // com.applovin.impl.v0.c
                public final void a(v0.b bVar) {
                    v0.this.a(cVar, bVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, b bVar) {
        if (bVar.e == null) {
            this.a.b(b5.t, Boolean.FALSE);
        }
        cVar.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        if (bVar.e == null) {
            this.a.b(b5.t, Boolean.FALSE);
        }
        AppLovinCommunicator.getInstance(com.applovin.impl.sdk.l.p()).getMessagingService().publish(new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", this));
    }

    private static AppLovinSdkConfiguration.ConsentFlowUserGeography a(String str) {
        if ("gdpr".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if ("other".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        final Uri a2 = a();
        new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.v0$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                v0.this.a(a2, dialogInterface, i);
            }
        }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.v0$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                v0.b(a2, dialogInterface, i);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, DialogInterface dialogInterface, int i) {
        n7.a(uri, com.applovin.impl.sdk.l.p(), this.a);
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    private Uri a() {
        return Uri.parse((String) this.a.a(this.a.J0() ? z4.k7 : z4.j7));
    }
}
