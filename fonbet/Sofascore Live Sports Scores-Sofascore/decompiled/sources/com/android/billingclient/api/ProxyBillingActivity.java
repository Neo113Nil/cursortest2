package com.android.billingclient.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzla;
import com.google.android.gms.internal.play_billing.zzld;
import defpackage.c0l;
import defpackage.eq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@zzw
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver a;
    public boolean b;
    public boolean c;
    public int d;
    public long e;
    public boolean f;
    public o g;
    public c0l h;

    public static zzjs a(Intent intent, int i) {
        return intent == null ? i != -1 ? i != 0 ? i != 3 ? i != 4 ? zzjs.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzjs.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE : zzjs.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE : zzjs.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzjs.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : intent.getExtras() == null ? zzjs.NULL_BUNDLE_IN_ACTIVITY_RESULT : i == 5 ? zzjs.PLAY_STORE_ON_CREATE_RUNTIME_EXCEPTION : zzjs.REASON_UNSPECIFIED;
    }

    public final Intent b(zzjs zzjsVar, long j, boolean z) {
        BillingResult billingResult;
        Intent c = c();
        zzjz zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
        if (z) {
            o oVar = this.g;
            if (oVar != null && (billingResult = oVar.a) != null) {
                c.putExtra("RESPONSE_CODE", billingResult.getResponseCode());
                c.putExtra("DEBUG_MESSAGE", billingResult.getDebugMessage());
            } else if (oVar != null && !oVar.b) {
                c.putExtra("RESPONSE_CODE", 3);
                c.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
                BillingResult.Builder newBuilder = BillingResult.newBuilder();
                newBuilder.setResponseCode(3);
                newBuilder.setDebugMessage("Play Store is blocked.");
                c.putExtra("FAILURE_LOGGING_PAYLOAD", zzdc.zzb(zzjs.PLAY_STORE_APP_BLOCKED, 2, newBuilder.build(), null, zzjzVar).b());
            }
            c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            c.putExtra("billingClientTransactionId", j);
            c.putExtra("wasServiceAutoReconnected", this.f);
            return c;
        }
        c.putExtra("RESPONSE_CODE", 6);
        c.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(6);
        newBuilder2.setDebugMessage("An internal error occurred.");
        c.putExtra("FAILURE_LOGGING_PAYLOAD", zzdc.zzb(zzjsVar, 2, newBuilder2.build(), null, zzjzVar).b());
        c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        c.putExtra("billingClientTransactionId", j);
        c.putExtra("wasServiceAutoReconnected", this.f);
        return c;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0012, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r11 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0041, code lost:
    
        if (r11 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0030  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        o oVar;
        Intent c;
        int i3;
        ResultReceiver resultReceiver;
        super.onActivityResult(i, i2, intent);
        if (i != 100) {
            if (i != 110) {
                if (i == 101) {
                    int i4 = com.google.android.gms.internal.play_billing.zzc.a;
                    if (intent == null) {
                        intent = null;
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            i3 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                            resultReceiver = this.a;
                            if (resultReceiver != null) {
                                resultReceiver.send(i3, intent == null ? null : intent.getExtras());
                            }
                        }
                    }
                    i3 = 0;
                    resultReceiver = this.a;
                    if (resultReceiver != null) {
                    }
                } else {
                    int i5 = com.google.android.gms.internal.play_billing.zzc.a;
                }
                this.b = false;
                oVar = this.g;
                if (oVar != null) {
                    oVar.a = null;
                }
                finish();
            }
        }
        int responseCode = com.google.android.gms.internal.play_billing.zzc.f("ProxyBillingActivity", intent).getResponseCode();
        int i6 = -1;
        if (i2 == -1) {
            if (responseCode != 0) {
                i2 = -1;
            }
            if (true == z) {
                intent.getExtras();
            }
            if (a(intent, i6).equals(zzjs.REASON_UNSPECIFIED)) {
                c = b(a(intent, i6), this.e, intent == null);
            } else {
                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    c = intent2;
                } else {
                    c = c();
                    c.putExtras(intent.getExtras());
                    c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                c.putExtra("billingClientTransactionId", this.e);
                c.putExtra("wasServiceAutoReconnected", this.f);
            }
            if (i == 110) {
                c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(c);
            this.b = false;
            oVar = this.g;
            if (oVar != null) {
            }
            finish();
        }
        i6 = i2;
        if (true == z) {
        }
        if (a(intent, i6).equals(zzjs.REASON_UNSPECIFIED)) {
        }
        if (i == 110) {
        }
        sendBroadcast(c);
        this.b = false;
        oVar = this.g;
        if (oVar != null) {
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        PendingIntent pendingIntent;
        ProxyBillingActivity proxyBillingActivity;
        Bundle bundle2;
        Bundle bundle3;
        super.onCreate(bundle);
        if (!(bundle == null ? getIntent() == null ? false : getIntent().hasExtra("IN_APP_MESSAGE_INTENT") : bundle.containsKey("in_app_message_result_receiver"))) {
            try {
                i = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                int i2 = com.google.android.gms.internal.play_billing.zzc.a;
                i = -1;
            }
            if (this.h == null) {
                Context applicationContext = getApplicationContext();
                zzke z = zzkg.z();
                z.k(getPackageName());
                z.l();
                z.h(i);
                z.g(Build.VERSION.SDK_INT);
                z.j();
                this.h = new c0l(applicationContext, (zzkg) z.c());
            }
            synchronized (this) {
                try {
                    this.g = new o(this.h);
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
                    intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
                    eq3.K(this, this.g, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", 2);
                } catch (NoSuchMethodError | RuntimeException e) {
                    this.g = null;
                    boolean z2 = e instanceof NoSuchMethodError;
                    c0l c0lVar = this.h;
                    if (z2) {
                        zzla p = zzld.p();
                        p.e();
                        zzld.q((zzld) p.b, 2);
                        c0lVar.A((zzld) p.c());
                    } else {
                        zzla p2 = zzld.p();
                        p2.e();
                        zzld.q((zzld) p2.b, 1);
                        c0lVar.A((zzld) p2.c());
                    }
                    int i3 = com.google.android.gms.internal.play_billing.zzc.a;
                }
            }
        }
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.zzc.h("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.zzc.h("ProxyBillingActivity", "Launching Play Store billing flow");
        this.d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.c = true;
                this.d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.b = true;
            int i4 = Build.VERSION.SDK_INT;
            try {
                if (i4 >= 36) {
                    bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
                } else {
                    if (i4 < 34) {
                        bundle2 = null;
                        proxyBillingActivity = this;
                        proxyBillingActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.d, new Intent(), 0, 0, 0, bundle2);
                        return;
                    }
                    bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                }
                proxyBillingActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), this.d, new Intent(), 0, 0, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException unused2) {
                int i5 = com.google.android.gms.internal.play_billing.zzc.a;
                ResultReceiver resultReceiver = proxyBillingActivity.a;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                } else {
                    Intent b = proxyBillingActivity.b(zzjs.INTENT_SENDER_EXCEPTION, proxyBillingActivity.e, false);
                    if (proxyBillingActivity.c) {
                        b.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    proxyBillingActivity.sendBroadcast(b);
                }
                proxyBillingActivity.b = false;
                proxyBillingActivity.finish();
                return;
            }
            bundle2 = bundle3;
            proxyBillingActivity = this;
        } catch (IntentSender.SendIntentException unused3) {
            proxyBillingActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        BillingResult billingResult;
        super.onDestroy();
        o oVar = this.g;
        if (oVar != null) {
            billingResult = oVar.a;
            try {
                unregisterReceiver(oVar);
            } catch (RuntimeException unused) {
                int i = com.google.android.gms.internal.play_billing.zzc.a;
            }
        } else {
            billingResult = null;
        }
        if (isFinishing() && this.b) {
            Intent c = c();
            if (billingResult != null) {
                c.putExtra("RESPONSE_CODE", billingResult.getResponseCode());
                c.putExtra("DEBUG_MESSAGE", billingResult.getDebugMessage());
            } else {
                c.putExtra("RESPONSE_CODE", 1);
                c.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.c) {
                c.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i2 = this.d;
            if (i2 == 110 || i2 == 100) {
                c.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                c.putExtra("billingClientTransactionId", this.e);
            }
            sendBroadcast(c);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.c);
        bundle.putInt("activity_code", this.d);
        bundle.putLong("billingClientTransactionId", this.e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f);
    }
}
