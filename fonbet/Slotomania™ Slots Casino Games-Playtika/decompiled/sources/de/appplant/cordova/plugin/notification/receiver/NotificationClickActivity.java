package de.appplant.cordova.plugin.notification.receiver;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.RemoteInput;
import com.safedk.android.utils.Logger;
import de.appplant.cordova.plugin.localnotification.LocalNotification;
import de.appplant.cordova.plugin.notification.Manager;
import de.appplant.cordova.plugin.notification.Notification;
import de.appplant.cordova.plugin.notification.Options;
import de.appplant.cordova.plugin.notification.Request;
import de.appplant.cordova.plugin.notification.action.Action;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class NotificationClickActivity extends Activity {
    private Intent intent;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.intent = intent;
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras();
        Context applicationContext = getApplicationContext();
        if (extras == null) {
            return;
        }
        Notification notification = Manager.getInstance(applicationContext).get(extras.getInt(Notification.EXTRA_ID));
        if (notification == null) {
            return;
        }
        onClick(notification, extras);
        this.intent = null;
    }

    public void onClick(Notification notification, Bundle bundle) {
        String string = getIntent().getExtras().getString(Action.EXTRA_ID, "click");
        JSONObject jSONObject = new JSONObject();
        setTextInput(string, jSONObject);
        launchAppIf();
        LocalNotification.fireEvent(string, notification, jSONObject);
        if (notification.getOptions().isSticky().booleanValue()) {
            return;
        }
        if (isLast()) {
            notification.cancel();
        } else {
            notification.clear();
        }
    }

    private boolean isLast() {
        return getIntent().getBooleanExtra(Request.EXTRA_LAST, false);
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
            launchApp();
        }
    }

    protected void launchApp() {
        Context applicationContext = getApplicationContext();
        Intent launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
        if (launchIntentForPackage == null) {
            return;
        }
        launchIntentForPackage.addFlags(537001984);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(applicationContext, launchIntentForPackage);
    }
}
