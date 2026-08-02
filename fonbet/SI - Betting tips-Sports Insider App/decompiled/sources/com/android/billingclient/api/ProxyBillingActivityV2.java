package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.e1;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.p1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends e.j {

    /* renamed from: u, reason: collision with root package name */
    public g.f f3953u;

    /* renamed from: v, reason: collision with root package name */
    public g.f f3954v;

    /* renamed from: w, reason: collision with root package name */
    public ResultReceiver f3955w;

    /* renamed from: x, reason: collision with root package name */
    public ResultReceiver f3956x;

    @Override // e.j, c0.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i5 = 0;
        this.f3953u = (g.f) q(new e1(5), new g.a(this) { // from class: com.android.billingclient.api.v0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProxyBillingActivityV2 f4109b;

            {
                this.f4109b = this;
            }

            @Override // g.a
            public final void a(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i5) {
                    case 0:
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.f4109b;
                        proxyBillingActivityV2.getClass();
                        Intent intent = activityResult.f195b;
                        int i10 = p1.d(intent, "ProxyBillingActivityV2").f4037a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.f3955w;
                        if (resultReceiver != null) {
                            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                        }
                        int i11 = activityResult.f194a;
                        if (i11 != -1 || i10 != 0) {
                            p1.g("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i10);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        ProxyBillingActivityV2 proxyBillingActivityV22 = this.f4109b;
                        proxyBillingActivityV22.getClass();
                        Intent intent2 = activityResult.f195b;
                        int i12 = p1.d(intent2, "ProxyBillingActivityV2").f4037a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV22.f3956x;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i12, intent2 == null ? null : intent2.getExtras());
                        }
                        int i13 = activityResult.f194a;
                        if (i13 != -1 || i12 != 0) {
                            p1.g("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i13 + " and billing's responseCode: " + i12);
                        }
                        proxyBillingActivityV22.finish();
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f3954v = (g.f) q(new e1(5), new g.a(this) { // from class: com.android.billingclient.api.v0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProxyBillingActivityV2 f4109b;

            {
                this.f4109b = this;
            }

            @Override // g.a
            public final void a(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i10) {
                    case 0:
                        ProxyBillingActivityV2 proxyBillingActivityV2 = this.f4109b;
                        proxyBillingActivityV2.getClass();
                        Intent intent = activityResult.f195b;
                        int i102 = p1.d(intent, "ProxyBillingActivityV2").f4037a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.f3955w;
                        if (resultReceiver != null) {
                            resultReceiver.send(i102, intent == null ? null : intent.getExtras());
                        }
                        int i11 = activityResult.f194a;
                        if (i11 != -1 || i102 != 0) {
                            p1.g("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i11 + " and billing's responseCode: " + i102);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        ProxyBillingActivityV2 proxyBillingActivityV22 = this.f4109b;
                        proxyBillingActivityV22.getClass();
                        Intent intent2 = activityResult.f195b;
                        int i12 = p1.d(intent2, "ProxyBillingActivityV2").f4037a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV22.f3956x;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i12, intent2 == null ? null : intent2.getExtras());
                        }
                        int i13 = activityResult.f194a;
                        if (i13 != -1 || i12 != 0) {
                            p1.g("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i13 + " and billing's responseCode: " + i12);
                        }
                        proxyBillingActivityV22.finish();
                        break;
                }
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f3955w = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f3956x = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        p1.f("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f3955w = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            g.f fVar = this.f3953u;
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "getIntentSender(...)");
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            fVar.a(new IntentSenderRequest(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f3956x = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            g.f fVar2 = this.f3954v;
            Intrinsics.checkNotNullParameter(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender2, "getIntentSender(...)");
            Intrinsics.checkNotNullParameter(intentSender2, "intentSender");
            fVar2.a(new IntentSenderRequest(intentSender2, null, 0, 0));
        }
    }

    @Override // e.j, c0.f, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f3955w;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f3956x;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
