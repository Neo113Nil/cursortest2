package com.zoho.livechat.android;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.zoho.livechat.android.modules.notifications.sdk.entities.SalesIQNotificationPayload;

/* loaded from: classes4.dex */
public interface NotificationListener {
    @Keep
    void onBadgeChange(int i10);

    @Keep
    default void onClick(Context context, @NonNull SalesIQNotificationPayload salesIQNotificationPayload) {
    }
}
