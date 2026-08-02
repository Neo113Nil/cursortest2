package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.p1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f3948a;

    /* renamed from: b, reason: collision with root package name */
    public ResultReceiver f3949b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3950c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3951d;

    /* renamed from: e, reason: collision with root package name */
    public int f3952e;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i5, int i10, Intent intent) {
        ResultReceiver resultReceiver;
        Intent a7;
        int i11;
        ResultReceiver resultReceiver2;
        super.onActivityResult(i5, i10, intent);
        if (i5 == 100 || i5 == 110) {
            int i12 = p1.d(intent, "ProxyBillingActivity").f4037a;
            if (i10 == -1) {
                if (i12 != 0) {
                    i10 = -1;
                } else {
                    i12 = 0;
                    resultReceiver = this.f3948a;
                    if (resultReceiver == null) {
                        resultReceiver.send(i12, intent != null ? intent.getExtras() : null);
                    } else {
                        if (intent == null) {
                            a7 = a();
                        } else if (intent.getExtras() != null) {
                            String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                            if (string != null) {
                                a7 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                                a7.setPackage(getApplicationContext().getPackageName());
                                a7.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                                a7.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            } else {
                                Intent a10 = a();
                                a10.putExtras(intent.getExtras());
                                a10.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                a7 = a10;
                            }
                        } else {
                            a7 = a();
                            p1.g("ProxyBillingActivity", "Got null bundle!");
                            a7.putExtra("RESPONSE_CODE", 6);
                            a7.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                            j a11 = k.a();
                            a11.f4033a = 6;
                            a11.f4034b = "An internal error occurred.";
                            a7.putExtra("FAILURE_LOGGING_PAYLOAD", r0.b(22, 2, a11.a()).b());
                            a7.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                        }
                        if (i5 == 110) {
                            a7.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        sendBroadcast(a7);
                    }
                }
            }
            p1.g("ProxyBillingActivity", "Activity finished with resultCode " + i10 + " and billing's responseCode: " + i12);
            resultReceiver = this.f3948a;
            if (resultReceiver == null) {
            }
        } else if (i5 == 101) {
            if (intent == null) {
                p1.g("ProxyBillingActivity", "Got null intent!");
            } else {
                int i13 = p1.f5547a;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    p1.g("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i11 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    resultReceiver2 = this.f3949b;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(i11, intent != null ? intent.getExtras() : null);
                    }
                }
            }
            i11 = 0;
            resultReceiver2 = this.f3949b;
            if (resultReceiver2 != null) {
            }
        } else {
            p1.g("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i5 + "; skipping...");
        }
        this.f3950c = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            p1.f("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f3950c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f3948a = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f3949b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f3951d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f3952e = bundle.getInt("activity_code", 100);
            return;
        }
        p1.f("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f3952e = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f3951d = true;
                this.f3952e = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f3948a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f3949b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f3952e = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f3950c = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f3952e, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e7) {
            p1.h("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e7);
            ResultReceiver resultReceiver = this.f3948a;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f3949b;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent a7 = a();
                    if (this.f3951d) {
                        a7.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    a7.putExtra("RESPONSE_CODE", 6);
                    a7.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(a7);
                }
            }
            this.f3950c = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f3950c) {
            Intent a7 = a();
            a7.putExtra("RESPONSE_CODE", 1);
            a7.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i5 = this.f3952e;
            if (i5 == 110 || i5 == 100) {
                a7.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(a7);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f3948a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f3949b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f3950c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f3951d);
        bundle.putInt("activity_code", this.f3952e);
    }
}
