package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.apps.common.proguard.UsedByReflection;
import xsna.db0;
import xsna.hb0;
import xsna.ua0;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes12.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {
    private hb0 zza;
    private hb0 zzb;

    @Nullable
    private ResultReceiver zzc;

    @Nullable
    private ResultReceiver zzd;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.zza = registerForActivityResult(new db0(), new ua0() { // from class: com.android.billingclient.api.zzct
            @Override // xsna.ua0
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2.this.zza((ActivityResult) obj);
            }
        });
        this.zzb = registerForActivityResult(new db0(), new ua0() { // from class: com.android.billingclient.api.zzcu
            @Override // xsna.ua0
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2.this.zzb((ActivityResult) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.zzc = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.zzd = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.play_billing.zze.zzk("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.zzc = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.zza.a(new IntentSenderRequest(pendingIntent.getIntentSender(), null, 0, 0));
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.zzd = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.zzb.a(new IntentSenderRequest(pendingIntent2.getIntentSender(), null, 0, 0));
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.zzd;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }

    public final void zza(ActivityResult activityResult) {
        Intent intent = activityResult.c;
        int responseCode = com.google.android.gms.internal.play_billing.zze.zzf(intent, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzc;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
        }
        int i = activityResult.b;
        if (i != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i + " and billing's responseCode: " + responseCode);
        }
        finish();
    }

    public final void zzb(ActivityResult activityResult) {
        Intent intent = activityResult.c;
        int responseCode = com.google.android.gms.internal.play_billing.zze.zzf(intent, "ProxyBillingActivityV2").getResponseCode();
        ResultReceiver resultReceiver = this.zzd;
        if (resultReceiver != null) {
            resultReceiver.send(responseCode, intent == null ? null : intent.getExtras());
        }
        int i = activityResult.b;
        if (i != -1 || responseCode != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i + " and billing's responseCode: " + responseCode);
        }
        finish();
    }
}
