package spay.sdk.utils.receiver;

import Ve.Fj;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.recyclerview.widget.m;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lspay/sdk/utils/receiver/OtpReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "npi/spay/kf", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OtpReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Fj f98857a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Status status;
        Object parcelable;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent.getAction() == SmsRetriever.SMS_RETRIEVED_ACTION) {
            Bundle extras = intent.getExtras();
            if (Build.VERSION.SDK_INT >= 33) {
                if (extras != null) {
                    parcelable = extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS", Status.class);
                    status = (Status) parcelable;
                }
                status = null;
            } else {
                if (extras != null) {
                    status = (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                }
                status = null;
            }
            Integer valueOf = status != null ? Integer.valueOf(status.getStatusCode()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                Intent intent2 = extras != null ? (Intent) extras.getParcelable(SmsRetriever.EXTRA_CONSENT_INTENT) : null;
                Fj fj2 = this.f98857a;
                if (fj2 == null || intent2 == null) {
                    return;
                }
                fj2.f29010a.startActivityForResult(intent2, m.e.DEFAULT_DRAG_ANIMATION_DURATION);
            }
        }
    }
}
