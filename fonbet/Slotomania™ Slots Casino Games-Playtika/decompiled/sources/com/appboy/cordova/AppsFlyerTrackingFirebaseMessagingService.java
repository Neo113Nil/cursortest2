package com.appboy.cordova;

import com.appsflyer.AppsFlyerLib;
import com.braze.push.BrazeFirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/* loaded from: classes5.dex */
public class AppsFlyerTrackingFirebaseMessagingService extends BrazeFirebaseMessagingService {
    @Override // com.braze.push.BrazeFirebaseMessagingService, com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), str);
    }

    @Override // com.braze.push.BrazeFirebaseMessagingService, com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getData().containsKey("af-uinstall-tracking")) {
            return;
        }
        super.onMessageReceived(remoteMessage);
    }
}
