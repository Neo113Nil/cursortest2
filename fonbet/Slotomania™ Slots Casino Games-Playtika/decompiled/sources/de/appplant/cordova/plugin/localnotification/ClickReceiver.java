package de.appplant.cordova.plugin.localnotification;

import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.RemoteInput;
import de.appplant.cordova.plugin.notification.Notification;
import de.appplant.cordova.plugin.notification.Options;
import de.appplant.cordova.plugin.notification.Request;
import de.appplant.cordova.plugin.notification.receiver.AbstractClickReceiver;
import de.appplant.cordova.plugin.notification.util.LaunchUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class ClickReceiver extends AbstractClickReceiver {
    @Override // de.appplant.cordova.plugin.notification.receiver.AbstractClickReceiver
    public void onClick(Notification notification, Bundle bundle) {
        String action = getAction();
        JSONObject jSONObject = new JSONObject();
        setTextInput(action, jSONObject);
        launchAppIf();
        LocalNotification.fireEvent(action, notification, jSONObject);
        if (notification.getOptions().isSticky().booleanValue()) {
            return;
        }
        if (isLast()) {
            notification.cancel();
        } else {
            notification.clear();
        }
        if (Build.VERSION.SDK_INT != 28 || RemoteInput.getResultsFromIntent(getIntent()) == null) {
            return;
        }
        NotificationManagerCompat.from(notification.getContext()).notify(notification.getId(), new NotificationCompat.Builder(notification.getContext(), notification.getOptions().getChannel()).setSmallIcon(notification.getOptions().getSmallIcon()).setContentText(jSONObject.optString("text")).setTimeoutAfter(1L).build());
    }

    private void setTextInput(String str, JSONObject jSONObject) {
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(getIntent());
        if (resultsFromIntent == null) {
            return;
        }
        try {
            jSONObject.put("text", resultsFromIntent.getCharSequence(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void launchAppIf() {
        if (getIntent().getBooleanExtra(Options.EXTRA_LAUNCH, true)) {
            LaunchUtils.launchApp(getApplicationContext());
        }
    }

    private boolean isLast() {
        return getIntent().getBooleanExtra(Request.EXTRA_LAST, false);
    }
}
