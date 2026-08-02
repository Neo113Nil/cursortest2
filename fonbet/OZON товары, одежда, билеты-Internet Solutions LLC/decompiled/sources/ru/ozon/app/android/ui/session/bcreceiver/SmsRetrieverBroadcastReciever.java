package ru.ozon.app.android.ui.session.bcreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ui/session/bcreceiver/SmsRetrieverBroadcastReciever;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Intent;", "", "extractMessage", "(Landroid/content/Intent;)Ljava/lang/String;", "Landroid/content/Context;", "context", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lkotlin/Function1;", "smsConsumer", "Lkotlin/jvm/functions/Function1;", "getSmsConsumer", "()Lkotlin/jvm/functions/Function1;", "setSmsConsumer", "(Lkotlin/jvm/functions/Function1;)V", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmsRetrieverBroadcastReciever extends BroadcastReceiver {
    private Function1<? super String, Unit> smsConsumer;

    private final String extractMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get(SmsRetriever.EXTRA_SMS_MESSAGE) : null;
        String str = obj instanceof String ? (String) obj : null;
        return str == null ? "" : str;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Function1<? super String, Unit> function1;
        if (intent == null || !SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
            return;
        }
        Bundle extras = intent.getExtras();
        Object obj = extras != null ? extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
        Status status = obj instanceof Status ? (Status) obj : null;
        if (status == null || status.getStatusCode() != 0 || (function1 = this.smsConsumer) == null) {
            return;
        }
        function1.invoke(extractMessage(intent));
    }

    public final void setSmsConsumer(Function1<? super String, Unit> function1) {
        this.smsConsumer = function1;
    }
}
