package com.android.billingclient.api;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.apps.common.proguard.UsedByReflection;
import defpackage.ce;
import defpackage.de;
import defpackage.sd;
import defpackage.xd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {
    public de b;
    public de c;
    public de d;
    public de e;
    public de f;
    public de g;
    public ResultReceiver h;
    public ResultReceiver i;
    public ResultReceiver j;
    public ResultReceiver k;
    public ResultReceiver l;
    public ResultReceiver m;

    public static final sd k() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            sd sdVar = new sd(ActivityOptions.makeBasic());
            sdVar.M(3);
            return sdVar;
        }
        if (i < 34) {
            return null;
        }
        sd sdVar2 = new sd(ActivityOptions.makeBasic());
        sdVar2.M(1);
        return sdVar2;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 4;
        this.b = registerForActivityResult(new ce(i), new xd() { // from class: com.android.billingclient.api.zzed
            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = ProxyBillingActivityV2.this;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = activityResult.b;
                int responseCode = com.google.android.gms.internal.play_billing.zzc.f("ProxyBillingActivityV2", intent).getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.h;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
                }
                int i2 = activityResult.a;
                proxyBillingActivityV2.finish();
            }
        });
        this.c = registerForActivityResult(new ce(i), new xd() { // from class: com.android.billingclient.api.zzee
            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = ProxyBillingActivityV2.this;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = activityResult.b;
                int responseCode = com.google.android.gms.internal.play_billing.zzc.f("ProxyBillingActivityV2", intent).getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.i;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
                }
                int i2 = activityResult.a;
                proxyBillingActivityV2.finish();
            }
        });
        this.d = registerForActivityResult(new ce(i), new xd() { // from class: com.android.billingclient.api.zzef
            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = ProxyBillingActivityV2.this;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = activityResult.b;
                int i2 = activityResult.a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i2 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    int i3 = com.google.android.gms.internal.play_billing.zzc.a;
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i2);
                }
                int responseCode = com.google.android.gms.internal.play_billing.zzc.f("ProxyBillingActivityV2", intent).getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.j;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, extras);
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.e = registerForActivityResult(new ce(i), new xd() { // from class: com.android.billingclient.api.zzeg
            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = ProxyBillingActivityV2.this;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = activityResult.b;
                int i2 = activityResult.a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i2 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    int i3 = com.google.android.gms.internal.play_billing.zzc.a;
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i2);
                }
                int responseCode = com.google.android.gms.internal.play_billing.zzc.f("ProxyBillingActivityV2", intent).getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.k;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, extras);
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.f = registerForActivityResult(new ce(i), new xd() { // from class: com.android.billingclient.api.zzeh
            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = ProxyBillingActivityV2.this;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = activityResult.b;
                int responseCode = com.google.android.gms.internal.play_billing.zzc.f("ProxyBillingActivityV2", intent).getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.l;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
                }
                int i2 = activityResult.a;
                proxyBillingActivityV2.finish();
            }
        });
        this.g = registerForActivityResult(new ce(i), new xd() { // from class: com.android.billingclient.api.zzei
            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = ProxyBillingActivityV2.this;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = activityResult.b;
                int responseCode = com.google.android.gms.internal.play_billing.zzc.f("ProxyBillingActivityV2", intent).getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.m;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
                }
                int i2 = activityResult.a;
                proxyBillingActivityV2.finish();
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.h = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.i = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.j = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.k = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.l = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.m = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzc.h("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.h = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            de deVar = this.b;
            pendingIntent.getClass();
            IntentSender intentSender = pendingIntent.getIntentSender();
            intentSender.getClass();
            deVar.a(new IntentSenderRequest(intentSender, null, 0, 0), k());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.i = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            de deVar2 = this.c;
            pendingIntent2.getClass();
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            intentSender2.getClass();
            deVar2.a(new IntentSenderRequest(intentSender2, null, 0, 0), k());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.j = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            de deVar3 = this.d;
            pendingIntent3.getClass();
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            intentSender3.getClass();
            deVar3.a(new IntentSenderRequest(intentSender3, null, 0, 0), k());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.k = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            de deVar4 = this.e;
            pendingIntent4.getClass();
            IntentSender intentSender4 = pendingIntent4.getIntentSender();
            intentSender4.getClass();
            deVar4.a(new IntentSenderRequest(intentSender4, null, 0, 0), k());
            return;
        }
        if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.l = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            de deVar5 = this.f;
            pendingIntent5.getClass();
            IntentSender intentSender5 = pendingIntent5.getIntentSender();
            intentSender5.getClass();
            deVar5.a(new IntentSenderRequest(intentSender5, null, 0, 0), k());
            return;
        }
        if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.m = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            de deVar6 = this.g;
            pendingIntent6.getClass();
            IntentSender intentSender6 = pendingIntent6.getIntentSender();
            intentSender6.getClass();
            deVar6.a(new IntentSenderRequest(intentSender6, null, 0, 0), k());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.h;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.i;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.j;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.k;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.l;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.m;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
