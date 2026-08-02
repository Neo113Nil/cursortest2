package com.appboy.cordova;

import android.app.Notification;
import com.braze.IBrazeNotificationFactory;
import com.braze.models.push.BrazeNotificationPayload;

/* loaded from: classes3.dex */
public class NotificationFactory implements IBrazeNotificationFactory {
    @Override // com.braze.IBrazeNotificationFactory
    public Notification createNotification(BrazeNotificationPayload brazeNotificationPayload) {
        return new NotificationHandler().createNotification(brazeNotificationPayload.getConfigurationProvider(), brazeNotificationPayload.getContext(), brazeNotificationPayload.getNotificationExtras(), brazeNotificationPayload.getBrazeExtras());
    }
}
