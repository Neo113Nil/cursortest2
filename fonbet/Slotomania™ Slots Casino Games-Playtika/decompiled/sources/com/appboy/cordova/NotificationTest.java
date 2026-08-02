package com.appboy.cordova;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;

/* loaded from: classes6.dex */
class NotificationTest {
    NotificationTest() {
    }

    static void test(Context context, int i, String str, String str2, String str3) {
        NotificationHandler notificationHandler = new NotificationHandler();
        BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
        Bundle bundle = new Bundle();
        bundle.putString(Constants.BRAZE_PUSH_BIG_IMAGE_URL_KEY, str3);
        Bundle bundle2 = new Bundle();
        bundle2.putString(Constants.BRAZE_PUSH_TITLE_KEY, str);
        bundle2.putString(Constants.BRAZE_PUSH_CONTENT_KEY, str2);
        bundle2.putString("sd", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
        bundle2.putBoolean(Constants.BRAZE_PUSH_BRAZE_KEY, true);
        bundle2.putString(Constants.BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY, "slotomania_default_notification_channel");
        bundle2.putBundle("extra", bundle);
        NotificationManagerCompat.from(context).notify(i, notificationHandler.createNotification(brazeConfigurationProvider, context, bundle2, bundle));
    }
}
