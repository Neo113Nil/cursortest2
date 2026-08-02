package com.sleeperbot.modules;

import android.content.Context;
import android.os.Bundle;
import com.braze.push.BrazeFirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import expo.modules.notifications.notifications.RemoteMessageSerializer;
import expo.modules.notifications.service.delegates.FirebaseMessagingDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleeperFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/sleeperbot/modules/SleeperFirebaseMessagingService;", "Lcom/braze/push/BrazeFirebaseMessagingService;", "<init>", "()V", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", AnalyticsConstantsKt.KEY_TOKEN, "", "app_fullRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SleeperFirebaseMessagingService extends BrazeFirebaseMessagingService {
    @Override // com.braze.push.BrazeFirebaseMessagingService, com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        if (BrazeFirebaseMessagingService.INSTANCE.isBrazePushNotification(remoteMessage)) {
            super.onMessageReceived(remoteMessage);
            return;
        }
        FirebaseMessagingDelegate.Companion companion = FirebaseMessagingDelegate.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Bundle bundle = RemoteMessageSerializer.toBundle(remoteMessage);
        Intrinsics.checkNotNullExpressionValue(bundle, "toBundle(...)");
        companion.runTaskManagerTasks(applicationContext, bundle);
    }

    @Override // com.braze.push.BrazeFirebaseMessagingService, com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        new FirebaseMessagingDelegate(this).onNewToken(token);
    }
}
