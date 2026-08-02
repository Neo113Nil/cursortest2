package com.google.android.gms.internal.play_billing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.i;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzas extends zzav implements zzat {
    public zzas() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzaw.a(parcel);
        zzav.S1(parcel);
        i iVar = (i) this;
        ResultReceiver resultReceiver = iVar.b;
        if (resultReceiver == null) {
            int i2 = zzc.a;
        } else if (bundle == null) {
            resultReceiver.send(0, null);
        } else {
            Activity activity = (Activity) iVar.a.get();
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
            if (activity == null || pendingIntent == null) {
                resultReceiver.send(0, null);
                int i3 = zzc.a;
            } else {
                try {
                    Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    intent.putExtra("in_app_message_result_receiver", resultReceiver);
                    intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                    activity.startActivity(intent);
                } catch (CancellationException unused) {
                    resultReceiver.send(0, null);
                    int i4 = zzc.a;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
