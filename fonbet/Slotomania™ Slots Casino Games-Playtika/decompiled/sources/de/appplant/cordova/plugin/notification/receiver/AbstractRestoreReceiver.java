package de.appplant.cordova.plugin.notification.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.UserManager;
import de.appplant.cordova.plugin.notification.Builder;
import de.appplant.cordova.plugin.notification.Manager;
import de.appplant.cordova.plugin.notification.Notification;
import de.appplant.cordova.plugin.notification.Options;
import de.appplant.cordova.plugin.notification.Request;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class AbstractRestoreReceiver extends AbstractNotificationReceiver {
    public abstract Notification buildNotification(Builder builder);

    public abstract void onRestore(Request request, Notification notification);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
        if (userManager == null || !userManager.isUserUnlocked()) {
            return;
        }
        Iterator<JSONObject> it = Manager.getInstance(context).getOptions().iterator();
        while (it.hasNext()) {
            Options options = new Options(context, it.next());
            onRestore(new Request(options), buildNotification(new Builder(options)));
        }
    }
}
