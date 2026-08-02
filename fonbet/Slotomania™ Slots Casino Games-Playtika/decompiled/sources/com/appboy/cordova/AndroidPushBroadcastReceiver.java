package com.appboy.cordova;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.braze.Constants;
import com.braze.push.BrazeNotificationUtils;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class AndroidPushBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "com.appboy.cordova.AndroidPushBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String str = TAG;
        Log.d(str, "Received intent with action " + action);
        if (Constants.BRAZE_PUSH_INTENT_NOTIFICATION_RECEIVED.equals(action)) {
            Log.d(str, "Received push notification.");
            try {
                sendReceivedRemoteNotificationEvent(context, intent);
                return;
            } catch (Exception e) {
                Log.e(TAG, "Failed to send event", e);
                return;
            }
        }
        if (Constants.BRAZE_PUSH_INTENT_NOTIFICATION_OPENED.equals(action)) {
            BrazeNotificationUtils.routeUserWithNotificationOpenedIntent(context, intent);
        } else {
            Log.d(str, "Ignoring intent with unsupported action " + action);
        }
    }

    private void sendReceivedRemoteNotificationEvent(Context context, Intent intent) {
        HashMap hashMap = new HashMap();
        if (intent.getExtras() != null && !intent.getExtras().isEmpty()) {
            for (String str : intent.getExtras().keySet()) {
                Object obj = intent.getExtras().get(str);
                if (obj != null && !hashMap.containsKey(str)) {
                    hashMap.put(str, obj.toString());
                }
            }
        }
        BrazePlugin.sendBroadcastMessage(hashMap);
    }
}
