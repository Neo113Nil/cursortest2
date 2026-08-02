package com.zoho.livechat.android.modules.notifications.ui.activities;

import Yf.c;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.NotificationListener;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.modules.notifications.sdk.entities.SalesIQNotificationPayload;
import com.zoho.livechat.android.utils.LiveChatUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/zoho/livechat/android/modules/notifications/ui/activities/NotificationReceiverActivity;", "LYf/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "F", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationReceiverActivity extends c {
    public final void F(Intent intent) {
        NotificationListener b10;
        Object parcelableExtra;
        SalesIQNotificationPayload salesIQNotificationPayload = null;
        if (Build.VERSION.SDK_INT < 33) {
            SalesIQNotificationPayload salesIQNotificationPayload2 = intent != null ? (SalesIQNotificationPayload) intent.getParcelableExtra(EventKeys.PAYLOAD) : null;
            if (salesIQNotificationPayload2 != null) {
                salesIQNotificationPayload = salesIQNotificationPayload2;
            }
        } else if (intent != null) {
            parcelableExtra = intent.getParcelableExtra(EventKeys.PAYLOAD, SalesIQNotificationPayload.class);
            salesIQNotificationPayload = (SalesIQNotificationPayload) parcelableExtra;
        }
        LiveChatUtil.log("NotificationReceiver Listener: " + ZohoLiveChat.c.b() + ", sendNotificationPayload: " + salesIQNotificationPayload);
        if (salesIQNotificationPayload == null || (b10 = ZohoLiveChat.c.b()) == null) {
            return;
        }
        b10.onClick(this, salesIQNotificationPayload);
    }

    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        F(getIntent());
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        F(intent);
        finish();
    }
}
