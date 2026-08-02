package ru.ozon.app.android.cabinet;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"ru/ozon/app/android/cabinet/FlashCallBroadcastReceiver$onReceive$1", "Landroid/telephony/TelephonyCallback;", "Landroid/telephony/TelephonyCallback$CallStateListener;", "onCallStateChanged", "", "state", "", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlashCallBroadcastReceiver$onReceive$1 extends TelephonyCallback implements TelephonyCallback.CallStateListener {
    final /* synthetic */ Intent $intent;
    final /* synthetic */ FlashCallBroadcastReceiver this$0;

    FlashCallBroadcastReceiver$onReceive$1(Intent intent, FlashCallBroadcastReceiver flashCallBroadcastReceiver) {
        this.$intent = intent;
        this.this$0 = flashCallBroadcastReceiver;
    }

    public void onCallStateChanged(int state) {
        if (state != 1) {
            Bundle extras = this.$intent.getExtras();
            if (!Intrinsics.d(extras != null ? extras.getString("state") : null, "RINGING")) {
                return;
            }
        }
        Function1<String, Unit> onReceive = this.this$0.getOnReceive();
        Bundle extras2 = this.$intent.getExtras();
        onReceive.invoke(extras2 != null ? extras2.getString("incoming_number") : null);
    }
}
