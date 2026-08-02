package com.appboy.cordova;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.braze.Braze;
import org.apache.cordova.ConfigXmlParser;

/* loaded from: classes7.dex */
public class NotificationStyleInitializer extends BroadcastReceiver {
    private static final String TAG = String.format("Appboy.%s", NotificationStyleInitializer.class.getName());
    private boolean mInitialized = false;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str = TAG;
        Log.i(str, "onReceive:" + intent);
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        if (Braze.getCustomBrazeNotificationFactory() == null) {
            Log.i(str, "initiazlize custom appboy notification factory");
            ConfigXmlParser configXmlParser = new ConfigXmlParser();
            configXmlParser.parse(context);
            BrazePlugin.initializeNotificationStyleAndChannel(context.getApplicationContext(), configXmlParser.getPreferences());
        }
    }
}
