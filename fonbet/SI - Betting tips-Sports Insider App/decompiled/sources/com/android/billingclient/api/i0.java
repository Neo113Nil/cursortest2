package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.p1;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 extends com.google.android.gms.internal.play_billing.e {

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f4031f;

    /* renamed from: g, reason: collision with root package name */
    public final ResultReceiver f4032g;

    public i0(WeakReference weakReference, ResultReceiver resultReceiver) {
        super("com.android.vending.billing.IInAppBillingServiceCallback", 0);
        this.f4031f = weakReference;
        this.f4032g = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean U(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) com.google.android.gms.internal.play_billing.f.a(parcel);
        com.google.android.gms.internal.play_billing.f.b(parcel);
        ResultReceiver resultReceiver = this.f4032g;
        if (resultReceiver == null) {
            p1.g("BillingClient", "Unable to send result for in-app messaging");
        } else if (bundle == null) {
            resultReceiver.send(0, null);
        } else {
            Activity activity = (Activity) this.f4031f.get();
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
            if (activity == null || pendingIntent == null) {
                resultReceiver.send(0, null);
                p1.g("BillingClient", "Unable to launch intent for in-app messaging");
            } else {
                try {
                    Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    intent.putExtra("in_app_message_result_receiver", resultReceiver);
                    intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                    activity.startActivity(intent);
                } catch (CancellationException e7) {
                    resultReceiver.send(0, null);
                    p1.h("BillingClient", "Exception caught while launching intent for in-app messaging.", e7);
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
